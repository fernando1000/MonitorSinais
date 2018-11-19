package br.com.x10d.monitorsinais.controller;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.x10d.monitorsinais.model.GrupoQtd;
import br.com.x10d.monitorsinais.model.HistoryEntryCustom;
import br.com.x10d.monitorsinais.model.MacroNomeLista;
import br.com.x10d.monitorsinais.model.Mnemonico;
import br.com.x10d.monitorsinais.model.MnemonicoLista;
import br.com.x10d.monitorsinais.model.StatusComandoLista;
import br.com.x10d.monitorsinais.model.VehicleCustom;
import br.com.x10d.monitorsinais.omni.Api;
import br.com.x10d.monitorsinais.omni.ApiStub;
import br.com.x10d.monitorsinais.omni.CommandStatusEntry;
import br.com.x10d.monitorsinais.omni.CustomMacroDTO;
import br.com.x10d.monitorsinais.omni.SentCommand;
import br.com.x10d.monitorsinais.service.CustomMacroDTOService;
import br.com.x10d.monitorsinais.service.HistoryEntryService;
import br.com.x10d.monitorsinais.service.SentComandService;
import br.com.x10d.monitorsinais.service.VehicleService;
import br.com.x10d.monitorsinais.teste.ApiUtil;

@Controller
public class MainController {
	
	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private HistoryEntryService historyEntryService;

	@Autowired
	private SentComandService sentComandService;
	
	@Autowired
	private CustomMacroDTOService customMacroDTOService;


	private StatusComandoLista statusComandoLista = new StatusComandoLista();
	private MnemonicoLista mnemonicoLista = new MnemonicoLista();
	private List<HistoryEntryCustom> listaCritico;
	private List<HistoryEntryCustom> listaAlerta;
	private List<HistoryEntryCustom> listaNormal;
	private List<HistoryEntryCustom> listaComTodosHistoricos;
	private ArrayList<Compatilhamento> compartilhamentos = new ArrayList<Compatilhamento>();
					
	@RequestMapping("/")
	public String index(Model model){
		
		listaComTodosHistoricos = montaHistoricoQueSeraMostradoNoIndex();
		compartilhamentos = geraCompartilhamento(listaComTodosHistoricos);
		
		model.addAttribute("listaComCompartilhamento", compartilhamentos);
		model.addAttribute("listaComHistoricos", listaComTodosHistoricos);
				
		return "index";
	}
	
	@RequestMapping(value = "/carregaListaDeMacros", method = RequestMethod.GET)
	public String carregaListaDeMacros(Model model) {
		
		String nomeAtual = "";
		List<String> listaComAtividades = new ArrayList<String>();
		List<MacroNomeLista> lista = new ArrayList<MacroNomeLista>();
		
		for(CustomMacroDTO customMacroDTO : customMacroDTOService.devolveTodos()) {
			if(!nomeAtual.equals(customMacroDTO.getType())) {
				
				MacroNomeLista macroNomeLista = new MacroNomeLista();
				listaComAtividades = new ArrayList<String>();
				macroNomeLista.setNomeMacro(nomeAtual);
				macroNomeLista.setAtividades(listaComAtividades);
				nomeAtual = customMacroDTO.getType();
				lista.add(macroNomeLista);
			}else {
				
				listaComAtividades.add(customMacroDTO.getName());
				nomeAtual = customMacroDTO.getType();
			}
		}
		
		lista.get(0).setNomeMacro("Macro FPS");
		
		model.addAttribute("listaComMacros", lista);
		
	    return "fragListaMacros :: fragConteudoListaMacros";
	}
	
	@RequestMapping(value = "/carregaMenuLateral", method = RequestMethod.GET)
	public String carregaMenuLateral(Model model) {
		
		model.addAttribute("listaComGrupoQTD", devolveListaComGrupoQTD());
		
	    return "fragMenuLateral :: fragConteudoMenuLateral";
	}
	
	@RequestMapping(value = "/carregaContadoresAlertas", method = RequestMethod.GET)
	public String carregaContadoresAlertas(Model model) {
		
		listaCritico = new ArrayList<HistoryEntryCustom>();
		listaAlerta = new ArrayList<HistoryEntryCustom>();
		listaNormal = new ArrayList<HistoryEntryCustom>();
		
		for(HistoryEntryCustom historico : listaComTodosHistoricos) {
			
			if(historico.getEType().equals("C") || 
					historico.getEType().equals("R") || 
						historico.getEType().equals("M") ||
							historico.getEType().equals("E")) {
			
				historico.setMcName("trNormal trItens");
				historico.setRef("trNormal esconde");
				
				if(!historico.getRCode().equals("Posição Automática") ) {					
					listaNormal.add(historico);					
				}
			}	
			if(historico.getEType().equals("W")) {
				historico.setMcName("trAlert trItens");
				historico.setRef("trAlert esconde");
				listaAlerta.add(historico);
			}
			if(historico.getEType().equals("A")) {
				historico.setMcName("trCritical trItens");
				historico.setRef("trCritical esconde");
				listaCritico.add(historico);
			}
			
		}

		model.addAttribute("critico", listaCritico.size());
		model.addAttribute("alerta", listaAlerta.size());
		model.addAttribute("normal", listaNormal.size());
		
	    return "fragContadoresAlertas :: fragConteudoContadoresAlertas";
	}
	
	@RequestMapping(value = "/procuraPlaca/{nomeDaPlaca}", method = RequestMethod.GET)
	public String procuraPorPlaca(Model model, @PathVariable("nomeDaPlaca") String nomeDaPlaca) {
		
		model.addAttribute("listaComHistoricos", devolveListaReferenteAPlacaClicada(nomeDaPlaca));
		
	    return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
	@RequestMapping(value = "/procuraPorPlacaParaMacro/{nomeDaPlaca}", method = RequestMethod.GET)
	public String procuraPorPlacaParaMacro(Model model, @PathVariable("nomeDaPlaca") String nomeDaPlaca) {
		
		model.addAttribute("listaComHistoricos", devolveListaReferenteAPlacaClicada(nomeDaPlaca));
		
	    return "fragVeiculosMacros :: fragConteudoVeiculosMacros";
	}

	private List<HistoryEntryCustom> devolveListaReferenteAPlacaClicada(String nomeDaPlaca) {
		
		List<HistoryEntryCustom> listaReferenteAPlacaClicada = new ArrayList<HistoryEntryCustom>();
	    
		for(HistoryEntryCustom historyEntryCustom : listaComTodosHistoricos) {
					
			if(nomeDaPlaca.equals(historyEntryCustom.getPlate())) {
					
				listaReferenteAPlacaClicada.add(historyEntryCustom);
				break;
			}
		}
		
		return listaReferenteAPlacaClicada;
	}

	@RequestMapping(value = "/procuraFrota/{nomeDaFrota}", method = RequestMethod.GET)
	public String procuraPorFrota(Model model, @PathVariable("nomeDaFrota") String nomeDaFrota) {
		
		model.addAttribute("listaComHistoricos", devolveVeiculosRelacionadosAFrota(nomeDaFrota));
		
	    return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
	@RequestMapping(value = "/adicionaVeiculosNaTelaDeMacro/{nomeDaFrota}", method = RequestMethod.GET)
	public String adicionaVeiculosNaTelaDeMacro(Model model, @PathVariable("nomeDaFrota") String nomeDaFrota) {
		
		model.addAttribute("listaComHistoricos", devolveVeiculosRelacionadosAFrota(nomeDaFrota));
		
	    return "fragVeiculosMacros :: fragConteudoVeiculosMacros";
	}
	
	private List<HistoryEntryCustom> devolveVeiculosRelacionadosAFrota(String nomeDaFrota) {
		
		List<HistoryEntryCustom> listaReferenteAFrotaClicada = new ArrayList<HistoryEntryCustom>();
	    
		if(nomeDaFrota.equals("TodosVeiculos")) {
			listaReferenteAFrotaClicada = listaComTodosHistoricos;		
		}else {
			for(HistoryEntryCustom historyEntryCustom : listaComTodosHistoricos) {
				
				String nomeSemEspaco = historyEntryCustom.getTBatCg().replace(" ","");
				
				if(nomeDaFrota.equals(nomeSemEspaco)) {
					
					listaReferenteAFrotaClicada.add(historyEntryCustom);
				}
			}
		}
		
		return listaReferenteAFrotaClicada;
	}
	
	@RequestMapping(value = "/procuraAlerta/{tipoDeAlerta}", method = RequestMethod.GET)
	public String procuraPorAlerta(Model model, @PathVariable("tipoDeAlerta") String tipoDeAlerta) {
		
		List<HistoryEntryCustom> listaAlarme = null;
        
	        model.addAttribute("classActiveSettingsAlerta","");
	        model.addAttribute("classActiveSettingsCritico","");
	        model.addAttribute("classActiveSettingsNormal","");
	        
	        if(tipoDeAlerta.contains("Critico")) {
	            listaAlarme = listaCritico;
	            model.addAttribute("classActiveSettingsCritico","active");
	        }
	        if(tipoDeAlerta.contains("Alerta")) {
	            
	            listaAlarme = listaAlerta;
	            model.addAttribute("classActiveSettingsAlerta","active");
	        }
	        if(tipoDeAlerta.contains("Normal")) {
	            listaAlarme = listaNormal;
	            model.addAttribute("classActiveSettingsNormal","active");
	        }
	        if(tipoDeAlerta.contains("Todos")) {
	            listaAlarme = listaComTodosHistoricos;
	        }
		
		model.addAttribute("listaComHistoricos", listaAlarme);

	    return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
	
	@RequestMapping(value = "/removeItemClicado/{placa}", method = RequestMethod.GET)
	public String removeItemClicado(Model model, @PathVariable("placa") String placa) {
		
		List<HistoryEntryCustom> listaComUmHistoryEntry = historyEntryService.devolveMaisRecenteHistoricoAtivo(placa);
		HistoryEntryCustom historyEntry = listaComUmHistoryEntry.get(0);
					 	   historyEntry.setTType(666);
		
		//vai atualizar para deletado
		historyEntryService.salvar(historyEntry);
		
		listaComTodosHistoricos.clear();
		
		listaComTodosHistoricos = montaHistoricoQueSeraMostradoNoIndex();
		
		model.addAttribute("listaComHistoricos", listaComTodosHistoricos);
		
	    return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
		
	@RequestMapping(value="/removeItemClicadoLote/{placas}", method=RequestMethod.GET)
	public String removerItemClicadoLote(Model model,@PathVariable("placas") List<String> placas) {
	    
	    for(String placa : placas){
	        
	        	placa = placa.replace("{", "");
	        	placa = placa.replace("}", "");
	            List<HistoryEntryCustom> listaComUmHistoryEntry = historyEntryService.devolveMaisRecenteHistoricoAtivo(placa);
	            HistoryEntryCustom historyEntry = listaComUmHistoryEntry.get(0);
	            				   historyEntry.setTType(666);
	            historyEntryService.salvar(historyEntry);    
	    }
	        
        listaComTodosHistoricos.clear();
	        
        listaComTodosHistoricos = montaHistoricoQueSeraMostradoNoIndex();
	        
		model.addAttribute("listaComHistoricos", listaComTodosHistoricos);
		
	    return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
	
	@RequestMapping(value="/ativarSirene/{placa}", method=RequestMethod.GET)
	public String ativarSirene(Model model, @PathVariable("placa") String placa) {
	
		enviaComandoESetaNoVeiculoMAN1234ARespostaObtida("BIP");
		
		model.addAttribute("listaComHistoricos", listaComTodosHistoricos);
    	
	    return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
	
	@RequestMapping(value="/bloquearVeiculo/{placa}", method=RequestMethod.GET)
	public String bloquearVeiculo(Model model, @PathVariable("placa") String placa) {
	
		enviaComandoESetaNoVeiculoMAN1234ARespostaObtida("LOCK");

		model.addAttribute("listaComHistoricos", listaComTodosHistoricos);

		return "fragTabelaAlertas :: fragConteudoTabelaAlertas";
	}
	
	private void enviaComandoESetaNoVeiculoMAN1234ARespostaObtida(String nomeDoComando) {
	String resposta = enviaComando(nomeDoComando);
		
		for(HistoryEntryCustom historyEntryCustom : listaComTodosHistoricos) {
			if(historyEntryCustom.getPlate().equals("MAN1234")) {
				historyEntryCustom.setVType(resposta);
				break;
			}
		}
	}
	
	private List<HistoryEntryCustom> montaHistoricoQueSeraMostradoNoIndex() {
		
		List<HistoryEntryCustom> listaComHistoricos = new ArrayList<HistoryEntryCustom>();
		
		Iterable<VehicleCustom> listaVeiculos = vehicleService.devolveTodos();
		for(VehicleCustom vehicle : listaVeiculos) {
			
			
			List<HistoryEntryCustom> lista1historicoAtivo = new ArrayList<HistoryEntryCustom>();

			List<HistoryEntryCustom> lista1historicoDeletado = historyEntryService.devolveMaisRecenteHistoricoDeletado(vehicle.getPlate());
			
			lista1historicoAtivo = historyEntryService.devolveMaisRecenteHistoricoAtivo(vehicle.getPlate());

			if(lista1historicoDeletado.isEmpty()) {
					
					adicionaNaTabelaSeNaoEstiverVazio(lista1historicoAtivo, listaComHistoricos);
				}
				else {
					HistoryEntryCustom historicoDeletado = lista1historicoDeletado.get(0);
					
					if(!lista1historicoAtivo.isEmpty()) {
						
						HistoryEntryCustom historicoAtivo = lista1historicoAtivo.get(0);
					
						if(historicoAtivo.getSeqId() > historicoDeletado.getSeqId()) {
							
							adicionaNaTabelaSeNaoEstiverVazio(lista1historicoAtivo, listaComHistoricos);
						}
					}
				}
		}
		return listaComHistoricos;
	}
	
	private void adicionaNaTabelaSeNaoEstiverVazio(List<HistoryEntryCustom> apenas1historico, List<HistoryEntryCustom> listaComHistoricos) {
		if(!apenas1historico.isEmpty()) {
			//Mnemonico
			HistoryEntryCustom historyEntry = apenas1historico.get(0);
			String codigoMnemonico = historyEntry.getRCode();
			Mnemonico mnemonico = mnemonicoLista.devolveDescricao(codigoMnemonico);
			if(mnemonico != null) {
				historyEntry.setRCode(mnemonico.getDescricao());					
			}else {					
				historyEntry.setRCode("Não encontrou mnemonico ["+codigoMnemonico+"]");					
			}
			
			//dataFormatada
			Locale locale = new Locale("pt","BR");
			Calendar calendar = historyEntry.getPTime();
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss", locale);
			String dataFormatada = formatador.format(calendar.getTime());
			historyEntry.setInfo(dataFormatada);
			
			listaComHistoricos.add(historyEntry);
		}
	
	}
	
	public String enviaComando(String mnemonico) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Comando enviado: "+mnemonico).append(" | ");
		
		try {
			Api apiStub = new ApiStub();
			
			ApiUtil apiUtil = new ApiUtil(apiStub);

			//soh posso usar esta serial!
			String serial = "7036345";//MAN1234
			
			if(serial.equals("7036345")) {
			
				SentCommand sentCommand = apiUtil.getEnviarComando(mnemonico, serial);
				
				if(sentCommand.getStatusMessage().equals("Success")) {
					sentComandService.salvar(sentCommand);
				}
			
				stringBuilder.append("Resposta 1:").append(" | ");
				stringBuilder.append(sentCommand.getStatusMessage()).append(" | ");
				
				//SentCommand sentCommand = dao.devolveSentComandOndeSerial(serial);
				Iterable<SentCommand> listaSentCommands = sentComandService.devolveTodos();
				long token = 0;
				for(SentCommand sc : listaSentCommands) {
					
					token = sc.getToken();
				}
			
				if(token > 0) {
					String statusAtual = perguntaQualStatusDoComando(apiUtil, token, serial);
					
					stringBuilder.append("Resposta 2:").append(" | ");
					stringBuilder.append(statusAtual);
					
				}
	
			}else {
				System.out.println("veiculo nao pode enviar comandos");
			}
			
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}

	private String perguntaQualStatusDoComando(ApiUtil apiUtil, long token, String serial) {
		String statusAtual = "Não encontrou";
		try {
		CommandStatusEntry[] listaCom1CommandStatus = apiUtil.getCommandStatus(token, serial);
			if(listaCom1CommandStatus.length > 0 ) {
				statusAtual = statusComandoLista.devolveDescricao(listaCom1CommandStatus[0].getStatus());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return statusAtual;
	}

	private List<GrupoQtd> devolveListaComGrupoQTD(){
		
		Set<String> listaComGruposUnicos = new HashSet<String>();
		List<String> listaComGruposGeral = new ArrayList<String>();
		
		Iterable<VehicleCustom> listaVeiculos = vehicleService.devolveTodos();
		for(VehicleCustom vehicle : listaVeiculos) {
			for(HistoryEntryCustom historyEntry : listaComTodosHistoricos) {
				if(vehicle.getPlate().equals(historyEntry.getPlate())) {
					
					//estou usando o campo [TBatCg] como grupo
					historyEntry.setTBatCg(vehicle.getFleet());
					
					listaComGruposGeral.add(historyEntry.getTBatCg());
					listaComGruposUnicos.add(vehicle.getFleet());
					break;
				}
			}
		}
		
		List<GrupoQtd> listaComGrupoQTD = new ArrayList<GrupoQtd>();
		
		//Inicio: vou adicionar um item manualmente porque se refere a lista com todos os veiculos
		GrupoQtd grupoQtdAllVehicles = new GrupoQtd();
		grupoQtdAllVehicles.setNome("TodosVeiculos");
		grupoQtdAllVehicles.setQtd(listaComTodosHistoricos.size());
		grupoQtdAllVehicles.setListaComHistoricos(listaComTodosHistoricos);
		listaComGrupoQTD.add(grupoQtdAllVehicles);
		//Fim
			
		
		for(String grupo : listaComGruposUnicos) {
			
			int qtd = Collections.frequency(listaComGruposGeral, grupo);
			
			GrupoQtd grupoQtd = new GrupoQtd();
							 grupo = grupo.replace(" ","");
			grupoQtd.setNome(grupo);
			grupoQtd.setQtd(qtd);
			
			List<HistoryEntryCustom> listaHistoricosPorGrupo = new ArrayList<HistoryEntryCustom>();
			for(HistoryEntryCustom historyEntry : listaComTodosHistoricos) {
				String nomeSemEspaco = historyEntry.getTBatCg().replace(" ","");
				
				if(grupo.equals(nomeSemEspaco)) {
					
					listaHistoricosPorGrupo.add(historyEntry);
					grupoQtd.setListaComHistoricos(listaHistoricosPorGrupo);
				}
			}
			
			listaComGrupoQTD.add(grupoQtd);
		}

		return listaComGrupoQTD;
	}
	 @RequestMapping(value="/addCompartilhamento/{placa}/{parceiro}", method=RequestMethod.GET)
	    public String addCompartilhamento(Model model,@PathVariable("placa") String placa,@PathVariable("parceiro") String parceiro) {
	        // compartilhamentos = geraCompartilhamento(listaComTodosHistoricos);
	        ArrayList<Compatilhamento> listaCcompartilhamento =  new ArrayList<Compatilhamento>();
	        listaCcompartilhamento = geraCompartilhamento(listaComTodosHistoricos);
	        placa = placa.replace("{", "");
	        placa = placa.replace("}", "");
	        parceiro = parceiro.replace("{", "");
	        parceiro = parceiro.replace("}", "");    
	        
	        String[] placas = placa.split(",");
	        for(int p=0 ; p < placas.length; p++ ) {
	            
	            for(Compatilhamento comp :listaCcompartilhamento){
	                if(comp.placa.equals(placas[p])) {
	                    int tam = comp.getParceiros().size();
	                 comp.getParceiros().add(new Parceiro(parceiro,"Pendente","1"," trItens expanded","0"));
	                  break;
	                }
	            
	            }
	        }
	        
	        model.addAttribute("listaComCompartilhamento", listaCcompartilhamento);
	        
	        listaComTodosHistoricos.clear();
	        listaComTodosHistoricos = montaHistoricoQueSeraMostradoNoIndex();
	        
	        model.addAttribute("listaComHistoricos", listaComTodosHistoricos);
	        model.addAttribute("critico", listaCritico.size());
	        model.addAttribute("alerta", listaAlerta.size());
	        model.addAttribute("normal", listaNormal.size());
	        return "index";
	        
	    }
	    
	    
	    @RequestMapping(value="/removeCompartilhamento/{placarr}/{parceiro}", method=RequestMethod.GET)
	    public String removeCompartilhamento(Model model,@PathVariable("placarr") String placa,@PathVariable("parceiro") String parceiro) {
	        compartilhamentos = geraCompartilhamento(listaComTodosHistoricos);
	        placa = placa.replace("{", "");
	        placa = placa.replace("}", "");
	        parceiro = parceiro.replace("{", "");
	        parceiro = parceiro.replace("}", "");    
	        
	        for(Compatilhamento comp :compartilhamentos){
	            if(comp.placa.equals(placa)) {
	                int tam = comp.getParceiros().size();
	                  for(int t = 0 ;  t< comp.getParceiros().size(); t++) {
	                      if(comp.getParceiros().get(t).getNome().equals(parceiro.toString())) {
	                          comp.getParceiros().remove(comp.getParceiros().get(t));
	                          break;
	                      }
	                  }
	            
	              break;
	            }
	        
	        }
	        
	        model.addAttribute("listaComCompartilhamento", compartilhamentos);
	        
	        listaComTodosHistoricos.clear();
	        listaComTodosHistoricos = montaHistoricoQueSeraMostradoNoIndex();
	        
	        model.addAttribute("listaComHistoricos", listaComTodosHistoricos);
	        model.addAttribute("critico", listaCritico.size());
	        model.addAttribute("alerta", listaAlerta.size());
	        model.addAttribute("normal", listaNormal.size());
	        return "index";        
	    }

	 

	    
	    private ArrayList<Compatilhamento> geraCompartilhamento(List<HistoryEntryCustom> listaComHistoricos){
	        
	        //ArrayList<Parceiro[]>  mapaNomes = new ArrayList<Parceiro[]>();
	        ArrayList<Compatilhamento> listaCcompartilhamento =  new ArrayList<Compatilhamento>();
	        Compatilhamento compartilhamentoQserahAdicionado = null;
	        //Compatilhamento share2 = null;
	        //Parceiro a = new Parceiro("81875973000176 – HBSIS SOLUCOES","Compartilhado","1"," trItens","1");
	        //Parceiro b = new Parceiro("07325543000128 – KRONA TECH Gerenciamento de Riscos","Compartilhado","1"," trItens expanded","0");
	        //Parceiro c = new Parceiro("04755777000389 – SKYMARK GER. DE RISCO","Pendente","0"," trItens expanded","0");
	        
	        //Parceiro d = new Parceiro("04368185000142 – OPENTECH SIST DE GER. De RISCO","Compartilhado","1"," trItens expanded","0");
	        //Parceiro e = new Parceiro("08252455000106 – UPPER MONITORAMENTO","Pendente","0"," trItens","1");
	        //Parceiro f = new Parceiro("03585974000172 – ZATIX TECNOLOGIA SA","Pendente","0"," trItens expanded","0");
	        List<Parceiro> parceiros1 = new ArrayList<Parceiro>();
	        Parceiro parceiroA = new Parceiro("81875973000176 – HBSIS SOLUCOES","Compartilhado","1"," trItens","1");
	        Parceiro parceiroB = new Parceiro("07325543000128 – KRONA TECH Gerenciamento de Riscos","Compartilhado","1"," trItens expanded","0");
	        Parceiro parceiroC = new Parceiro("04755777000389 – SKYMARK GER DE RISCO","Pendente","0"," trItens expanded","0");
	        parceiros1.add(parceiroA);
	        parceiros1.add(parceiroB);
	        parceiros1.add(parceiroC);
	        
	        List<Parceiro> parceiros2 = new ArrayList<Parceiro>();
	        Parceiro parceiroD = new Parceiro("04368185000142 – OPENTECH SIST DE GER De RISCO","Compartilhado","1"," trItens expanded","0");
	        Parceiro parceiroE= new Parceiro("08252455000106 – UPPER MONITORAMENTO","Pendente","0"," trItens","1");
	        parceiros2.add(parceiroE);
	        parceiros2.add(parceiroD);
	        
	        int i = 0, ordenar = 0;
	        
	         for(HistoryEntryCustom historico : listaComTodosHistoricos) {
	            
	            if(i == 0) {
	                if(historico.getPlate().toString().equals("PYT3710")) {
	                    compartilhamentoQserahAdicionado = new Compatilhamento(historico.getPlate().toString(),ordenar, parceiros2);
	                }else {
	                    compartilhamentoQserahAdicionado = new Compatilhamento(historico.getPlate().toString(),ordenar, parceiros1);
	                }
	                 i = 1;
	            } else {
	                i = 0;
	                
	                compartilhamentoQserahAdicionado = new Compatilhamento(historico.getPlate().toString(),ordenar, parceiros2);
	            }
	            ordenar++;
	             listaCcompartilhamento.add(compartilhamentoQserahAdicionado);
	        }
	        
	        return listaCcompartilhamento;
	}


	    class Compatilhamento{
	        public int tam =  10;
	        public String placa;
	        public int ordem;
	        public List<Parceiro> parceiros;
	        
	        public Compatilhamento(String string,int ordem, List<Parceiro> parceiros) {
	            // TODO Auto-generated method stub
	            this.placa = string;
	            this.ordem = ordem;
	            this.parceiros = parceiros;
	        
	        }
	        
	          @Override
	          public String toString() {
	            return placa + "| ";
	          }

	        public int getTam() {
	            
	            return parceiros.size();
	        }

	        public void setTam(int tam) {
	            this.tam = tam;
	        }

	        public String getPlaca() {
	            return placa;
	        }

	        public void setPlaca(String placa) {
	            this.placa = placa;
	        }

	        public int getOrdem() {
	            return ordem;
	        }

	        public void setOrdem(int ordem) {
	            this.ordem = ordem;
	        }

	        public List<Parceiro> getParceiros() {
	            return parceiros;
	        }

	        public void setParceiros(List<Parceiro> parceiros) {
	            this.parceiros = parceiros;
	        }
	          
	          
	          
	    }

	    class Parceiro {
	        public String nome;
	        public String status;
	        public String acoes;
	        public String classe;
	        public String first;
	        
	          public Parceiro(String nome, String status,String acoes,String classe,String first) {
	                this.nome = nome;
	                this.status = status; 
	                this.acoes = acoes;
	                this.classe = classe;
	                this.first = first;
	          }
	               
	          @Override
	          public String toString() {
	            return nome + " | " + status + " | " + acoes;
	          }
	          
	          public String getNome() {
	              return nome;
	          }
	          
	          public String getStatus() {
	              return status;
	          }
	          
	          public String getAcoes() {
	              return acoes;
	          }
	          
	          public String getClasse() {
	              return classe;
	          }
	          
	          public String getFirst() {
	              return first;
	          }          
	    }
			
}
