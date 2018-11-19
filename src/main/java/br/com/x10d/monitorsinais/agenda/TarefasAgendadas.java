package br.com.x10d.monitorsinais.agenda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.x10d.monitorsinais.model.HistoryEntryCustom;
import br.com.x10d.monitorsinais.model.VehicleCustom;
import br.com.x10d.monitorsinais.omni.Api;
import br.com.x10d.monitorsinais.omni.ApiStub;
import br.com.x10d.monitorsinais.omni.HistoryEntry;
import br.com.x10d.monitorsinais.omni.Vehicle;
import br.com.x10d.monitorsinais.service.HistoryEntryService;
import br.com.x10d.monitorsinais.service.VehicleService;
import br.com.x10d.monitorsinais.teste.ApiUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class TarefasAgendadas {
	
    private static final Logger logger = LoggerFactory.getLogger(TarefasAgendadas.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private HistoryEntryService historyEntryService;
	
	 
    @Scheduled(fixedDelay = 65000)
    public void scheduleTaskWithFixedDelay() {
    	
    	
        try {
			Api apiStub = new ApiStub();
			ApiUtil apiUtil = new ApiUtil(apiStub);
		
			logger.info("iniciado tarefa: Buscar Veiculos", dateTimeFormatter.format(LocalDateTime.now()));
			Vehicle[] listaVehicleXML = apiUtil.getListaDeVeiculos();
			logger.info("finalizado tarefa: Buscar Veiculos", dateTimeFormatter.format(LocalDateTime.now()));
			for(Vehicle vehicleXML : listaVehicleXML) {
				apiUtil.trataExcecao(vehicleXML);
				List<VehicleCustom> listaComApenas1VeiculoMySql = vehicleService.devolveVeiculoPorPlaca(vehicleXML.getPlate());
				if(!listaComApenas1VeiculoMySql.isEmpty()) {
					VehicleCustom vehicleMySql  = listaComApenas1VeiculoMySql.get(0);
					if(vehicleMySql != null) {
						//aqui vai atualizar
						vehicleService.salvar(vehicleMySql);										
					}
				}else {
					
					VehicleCustom vehicleMySqlXML = new VehicleCustom();
					vehicleMySqlXML.setSerial(vehicleXML.getSerial());
					vehicleMySqlXML.setDriver(vehicleXML.getDriver());
					vehicleMySqlXML.setPlate(vehicleXML.getPlate());
					vehicleMySqlXML.setTTime(vehicleXML.getTTime());
					vehicleMySqlXML.setSpeed(vehicleXML.getSpeed());
					vehicleMySqlXML.setTStatusDesc(vehicleXML.getTStatusDesc());
					vehicleMySqlXML.setAddr(vehicleXML.getAddr());
					vehicleMySqlXML.setFleet(vehicleXML.getFleet());
					vehicleMySqlXML.setOwner(vehicleXML.getOwner());
					vehicleMySqlXML.setRef(vehicleXML.getRef());
					
					//aqui vai inserir
					vehicleService.salvar(vehicleMySqlXML);										
				}
				
				logger.info("Inicio: Buscando historico do veiculo: "+vehicleXML.getPlate(), dateTimeFormatter.format(LocalDateTime.now()));
				HistoryEntry[] listaHistoricosXML = apiUtil.getHistoricoDeVeiculos1maisRecente(vehicleXML.getPlate());	
				logger.info("Fim: Buscando historico do veiculo: "+vehicleXML.getPlate(), dateTimeFormatter.format(LocalDateTime.now()));
				
				HistoryEntry historicoMaisRecenteXML = listaHistoricosXML[0];
				if(historicoMaisRecenteXML != null) {
					apiUtil.trataExcecao(historicoMaisRecenteXML);
					
					List<HistoryEntryCustom> listaHistoricoMaisRecenteBanco = historyEntryService.devolveMaisRecenteHistorico(historicoMaisRecenteXML.getPlate());
					if(!listaHistoricoMaisRecenteBanco.isEmpty()) {
						HistoryEntryCustom historicoMaisRecenteBanco = listaHistoricoMaisRecenteBanco.get(0);					
						if(historicoMaisRecenteBanco != null) {
							if(historicoMaisRecenteXML.getSeqId() > historicoMaisRecenteBanco.getSeqId()) {
								
								HistoryEntryCustom historicoCustomMySqlXML = new HistoryEntryCustom();
								historicoCustomMySqlXML.setTType(historicoMaisRecenteXML.getTType());
								historicoCustomMySqlXML.setSeqId(historicoMaisRecenteXML.getSeqId());
								historicoCustomMySqlXML.setSerial(historicoMaisRecenteXML.getSerial());
								historicoCustomMySqlXML.setPlate(historicoMaisRecenteXML.getPlate());
								historicoCustomMySqlXML.setEType(historicoMaisRecenteXML.getEType());
								historicoCustomMySqlXML.setRCode(historicoMaisRecenteXML.getRCode());
								historicoCustomMySqlXML.setPTime(historicoMaisRecenteXML.getPTime());
								historicoCustomMySqlXML.setTTime(historicoMaisRecenteXML.getTTime());
								historicoCustomMySqlXML.setAddr(historicoMaisRecenteXML.getAddr());
								historicoCustomMySqlXML.setCity(historicoMaisRecenteXML.getCity());
								historicoCustomMySqlXML.setSt(historicoMaisRecenteXML.getSt());
								historicoCustomMySqlXML.setTStatus(historicoMaisRecenteXML.getTStatus());
								historicoCustomMySqlXML.setTStatusDesc(historicoMaisRecenteXML.getTStatusDesc());
								historicoCustomMySqlXML.setSpeed(historicoMaisRecenteXML.getSpeed());
								historicoCustomMySqlXML.setDriver(historicoMaisRecenteXML.getDriver());
								historicoCustomMySqlXML.setEType(historicoMaisRecenteXML.getEType());
								historicoCustomMySqlXML.setMcName(historicoMaisRecenteXML.getMcName());
								
								historyEntryService.salvar(historicoCustomMySqlXML);
							}
						}
					}else {
						
						HistoryEntryCustom historicoCustomMySqlXML = new HistoryEntryCustom();
						historicoCustomMySqlXML.setTType(historicoMaisRecenteXML.getTType());
						historicoCustomMySqlXML.setSeqId(historicoMaisRecenteXML.getSeqId());
						historicoCustomMySqlXML.setSerial(historicoMaisRecenteXML.getSerial());
						historicoCustomMySqlXML.setPlate(historicoMaisRecenteXML.getPlate());
						historicoCustomMySqlXML.setEType(historicoMaisRecenteXML.getEType());
						historicoCustomMySqlXML.setRCode(historicoMaisRecenteXML.getRCode());
						historicoCustomMySqlXML.setPTime(historicoMaisRecenteXML.getPTime());
						historicoCustomMySqlXML.setTTime(historicoMaisRecenteXML.getTTime());
						historicoCustomMySqlXML.setAddr(historicoMaisRecenteXML.getAddr());
						historicoCustomMySqlXML.setCity(historicoMaisRecenteXML.getCity());
						historicoCustomMySqlXML.setSt(historicoMaisRecenteXML.getSt());
						historicoCustomMySqlXML.setTStatus(historicoMaisRecenteXML.getTStatus());
						historicoCustomMySqlXML.setTStatusDesc(historicoMaisRecenteXML.getTStatusDesc());
						historicoCustomMySqlXML.setSpeed(historicoMaisRecenteXML.getSpeed());
						historicoCustomMySqlXML.setDriver(historicoMaisRecenteXML.getDriver());
						historicoCustomMySqlXML.setEType(historicoMaisRecenteXML.getEType());
						historicoCustomMySqlXML.setMcName(historicoMaisRecenteXML.getMcName());
	
						historyEntryService.salvar(historicoCustomMySqlXML);
					}
				}
				logger.info("esperando 65 segundos...", dateTimeFormatter.format(LocalDateTime.now()));
				TimeUnit.SECONDS.sleep(65);
			}
			logger.info("finalizado tarefa: Buscar Historico de Veiculos", dateTimeFormatter.format(LocalDateTime.now()));
        } 
        catch (Exception ex) {
            logger.error("Erro no agendador", ex);
            throw new IllegalStateException(ex);
        }
        logger.info("fim", dateTimeFormatter.format(LocalDateTime.now()));
        
        
    }
    
}
