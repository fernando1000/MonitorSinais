package br.com.x10d.monitorsinais.teste;

import org.apache.axis2.AxisFault;

import br.com.x10d.monitorsinais.omni.Api;
import br.com.x10d.monitorsinais.omni.ApiStub;
import br.com.x10d.monitorsinais.omni.CustomMacroDTO;
import br.com.x10d.monitorsinais.omni.MacroGroupDTO;
import br.com.x10d.monitorsinais.omni.Macros_type0;

public class TesteMain {
	public static void main(String[] args) {
		
		
		
	}

	private void buscaMacrosDaOminilink() {
		try {
			Api apiStub = new ApiStub();
			ApiUtil apiUtil = new ApiUtil(apiStub);
				MacroGroupDTO[] lista = apiUtil.getListaDeGrupoDeMacros();
				for(MacroGroupDTO grupoDaMacro : lista) {
					System.out.println("NomeDoGrupo: "+grupoDaMacro.getName() );
					Macros_type0 listaComMacros = grupoDaMacro.getMacros();
					for(CustomMacroDTO customMacroDTO : listaComMacros.getMacro()){
						customMacroDTO.setType(grupoDaMacro.getName());
						System.out.println("NomeDaMacro: "+customMacroDTO.getName() );
						//customMacroDTOService.salvar(customMacroDTO);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
}
