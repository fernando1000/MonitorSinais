package br.com.x10d.monitorsinais.teste;

import java.lang.reflect.Field;
import java.rmi.RemoteException;

import br.com.x10d.monitorsinais.omni.Api;
import br.com.x10d.monitorsinais.omni.ApiResponse;
import br.com.x10d.monitorsinais.omni.ApplicationExceptionException;
import br.com.x10d.monitorsinais.omni.CommandStatusEntry;
import br.com.x10d.monitorsinais.omni.CustomFenceDTO;
import br.com.x10d.monitorsinais.omni.Driver;
import br.com.x10d.monitorsinais.omni.Fence;
import br.com.x10d.monitorsinais.omni.FenceParam;
import br.com.x10d.monitorsinais.omni.GetFenceResponse;
import br.com.x10d.monitorsinais.omni.GetTopDrivingHistoryResponse;
import br.com.x10d.monitorsinais.omni.Get_command_status;
import br.com.x10d.monitorsinais.omni.Get_command_statusE;
import br.com.x10d.monitorsinais.omni.Get_command_statusResponse;
import br.com.x10d.monitorsinais.omni.Get_command_statusResponseE;
import br.com.x10d.monitorsinais.omni.Get_driver_list;
import br.com.x10d.monitorsinais.omni.Get_driver_listE;
import br.com.x10d.monitorsinais.omni.Get_driver_listResponse;
import br.com.x10d.monitorsinais.omni.Get_driver_listResponseE;
import br.com.x10d.monitorsinais.omni.Get_fence_route_list;
import br.com.x10d.monitorsinais.omni.Get_fence_route_listE;
import br.com.x10d.monitorsinais.omni.Get_fence_route_listResponse;
import br.com.x10d.monitorsinais.omni.Get_fence_route_listResponseE;
import br.com.x10d.monitorsinais.omni.Get_macro_groups_list;
import br.com.x10d.monitorsinais.omni.Get_macro_groups_listE;
import br.com.x10d.monitorsinais.omni.Get_macro_groups_listResponse;
import br.com.x10d.monitorsinais.omni.Get_macro_groups_listResponseE;
import br.com.x10d.monitorsinais.omni.Get_top_driving_current_state;
import br.com.x10d.monitorsinais.omni.Get_top_driving_current_stateE;
import br.com.x10d.monitorsinais.omni.Get_top_driving_current_stateResponse;
import br.com.x10d.monitorsinais.omni.Get_top_driving_current_stateResponseE;
import br.com.x10d.monitorsinais.omni.Get_top_driving_history;
import br.com.x10d.monitorsinais.omni.Get_top_driving_historyResponse;
import br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_list;
import br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_listE;
import br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_listResponse;
import br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_listResponseE;
import br.com.x10d.monitorsinais.omni.Get_vehicle_history;
import br.com.x10d.monitorsinais.omni.Get_vehicle_historyE;
import br.com.x10d.monitorsinais.omni.Get_vehicle_historyResponse;
import br.com.x10d.monitorsinais.omni.Get_vehicle_historyResponseE;
import br.com.x10d.monitorsinais.omni.Get_vehicle_list;
import br.com.x10d.monitorsinais.omni.Get_vehicle_listE;
import br.com.x10d.monitorsinais.omni.Get_vehicle_listResponse;
import br.com.x10d.monitorsinais.omni.Get_vehicle_listResponseE;
import br.com.x10d.monitorsinais.omni.HistoryEntry;
import br.com.x10d.monitorsinais.omni.Import_landmarks;
import br.com.x10d.monitorsinais.omni.Import_landmarksResponse;
import br.com.x10d.monitorsinais.omni.JourneyHistory;
import br.com.x10d.monitorsinais.omni.LandmarkImportError;
import br.com.x10d.monitorsinais.omni.LandmarkImportResponse;
import br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicle;
import br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicleE;
import br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicleResponse;
import br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicleResponseE;
import br.com.x10d.monitorsinais.omni.MacroGroupDTO;
import br.com.x10d.monitorsinais.omni.SendCommandParam;
import br.com.x10d.monitorsinais.omni.SendCommandParameters;
import br.com.x10d.monitorsinais.omni.Send_command;
import br.com.x10d.monitorsinais.omni.Send_commandE;
import br.com.x10d.monitorsinais.omni.Send_commandResponse;
import br.com.x10d.monitorsinais.omni.Send_commandResponseE;
import br.com.x10d.monitorsinais.omni.SentCommand;
import br.com.x10d.monitorsinais.omni.Set_Saver_sharing;
import br.com.x10d.monitorsinais.omni.Set_Saver_sharingE;
import br.com.x10d.monitorsinais.omni.Set_Saver_sharingResponse;
import br.com.x10d.monitorsinais.omni.Set_Saver_sharingResponseE;
import br.com.x10d.monitorsinais.omni.Set_cargo_id;
import br.com.x10d.monitorsinais.omni.Set_cargo_idE;
import br.com.x10d.monitorsinais.omni.Set_cargo_idResponse;
import br.com.x10d.monitorsinais.omni.Set_cargo_idResponseE;
import br.com.x10d.monitorsinais.omni.Set_fence_route;
import br.com.x10d.monitorsinais.omni.Set_fence_routeE;
import br.com.x10d.monitorsinais.omni.Set_fence_routeResponse;
import br.com.x10d.monitorsinais.omni.Set_fence_routeResponseE;
import br.com.x10d.monitorsinais.omni.SystemExceptionException;
import br.com.x10d.monitorsinais.omni.Tokens;
import br.com.x10d.monitorsinais.omni.TopDrivingCurrentState;
import br.com.x10d.monitorsinais.omni.Vehicle;

public class ApiUtil {
	
	public Api api;
	
	public ApiUtil(Api api) {
		this.api = api;
	}

	public CommandStatusEntry[] getCommandStatus(long token, String serial) throws RemoteException{
		
		Get_command_statusE get_command_statusE = new Get_command_statusE();
		Get_command_status get_command_status = new Get_command_status();
		  
		get_command_status.setSerial(serial);
		
		Tokens tokens = new Tokens();
		
		long[] listaComTokens = new long[1];
			   listaComTokens[0] = token;
			   
		tokens.setToken(listaComTokens);
		get_command_status.setTokens(tokens);
		
		get_command_statusE.setGet_command_status(get_command_status);

		Get_command_statusResponseE get_command_statusResponseE = api.get_command_status(get_command_statusE);
		Get_command_statusResponse get_command_statusResponse = get_command_statusResponseE.getGet_command_statusResponse();
		
		return get_command_statusResponse.get_return().getCommandStatus().getCommandStatusEntry();
	}

	public Driver[] getListaDeMotoristas() throws RemoteException {
		
		Get_driver_listE get_driver_listE = new Get_driver_listE();
	    Get_driver_list get_driver_list = new Get_driver_list();
		
	    get_driver_listE.setGet_driver_list(get_driver_list);
		
	    Get_driver_listResponseE get_driver_listResponseE = api.get_driver_list(get_driver_listE);
	    Get_driver_listResponse get_driver_listResponse = get_driver_listResponseE.getGet_driver_listResponse();

		return get_driver_listResponse.get_return().getDrivers().getDriver();
	}
	
	public CustomFenceDTO[] getListaDeRotaDeCerca() throws RemoteException{
		
		Get_fence_route_listE get_fence_route_listE = new Get_fence_route_listE();
		Get_fence_route_list get_fence_route_list = new Get_fence_route_list();
		  
		//get_command_status.setSequences(param);
		//get_command_status.setTokens(param);
		
		get_fence_route_listE.setGet_fence_route_list(get_fence_route_list);

		Get_fence_route_listResponseE get_fence_route_listResponseE = api.get_fence_route_list(get_fence_route_listE);
		Get_fence_route_listResponse get_fence_route_listResponse = get_fence_route_listResponseE.getGet_fence_route_listResponse();
		
		return get_fence_route_listResponse.get_return().getFences().getFence();
	}
	
	public MacroGroupDTO[] getListaDeGrupoDeMacros() throws RemoteException, ApplicationExceptionException{
		
		Get_macro_groups_listE get_macro_groups_listE = new Get_macro_groups_listE();
		Get_macro_groups_list get_macro_groups_list = new Get_macro_groups_list();
		 
		get_macro_groups_listE.setGet_macro_groups_list(get_macro_groups_list);

		Get_macro_groups_listResponseE get_macro_groups_listResponseE = api.get_macro_groups_list(get_macro_groups_listE);
		Get_macro_groups_listResponse get_macro_groups_listResponse = get_macro_groups_listResponseE.getGet_macro_groups_listResponse();
		
		return get_macro_groups_listResponse.get_return().getMacroGroups().getMacroGroup();
	}
	
	public TopDrivingCurrentState[] getTopDrivingCurrentState() throws RemoteException, ApplicationExceptionException{
		
		Get_top_driving_current_stateE get_top_driving_current_stateE = new Get_top_driving_current_stateE();
		Get_top_driving_current_state get_top_driving_current_state = new Get_top_driving_current_state();
		  		
		get_top_driving_current_stateE.setGet_top_driving_current_state(get_top_driving_current_state);

		Get_top_driving_current_stateResponseE get_top_driving_current_stateResponseE = api.get_top_driving_current_state(get_top_driving_current_stateE);
		Get_top_driving_current_stateResponse get_top_driving_current_stateResponse = get_top_driving_current_stateResponseE.getGet_top_driving_current_stateResponse();
		
		return get_top_driving_current_stateResponse.get_return().getJourneys().getJourney();
	}
	
	public JourneyHistory[] getListaDeHistoricoDeJornada() throws RemoteException, ApplicationExceptionException{
		
		Get_top_driving_history get_top_driving_history = new Get_top_driving_history();

		Get_top_driving_historyResponse get_top_driving_historyResponse = api.get_top_driving_history(get_top_driving_history);
		GetTopDrivingHistoryResponse getTopDrivingHistoryResponse = get_top_driving_historyResponse.getGet_top_driving_historyResponse();
		
		return getTopDrivingHistoryResponse.getEntries().getEntry();
	}
	
	public FenceParam[] getListaDeParametrosDeCerca() throws RemoteException, ApplicationExceptionException{
		
		Get_vehicle_fence_route_listE get_vehicle_fence_route_listE = new Get_vehicle_fence_route_listE();
		Get_vehicle_fence_route_list get_vehicle_fence_route_list = new Get_vehicle_fence_route_list();
		  		
		get_vehicle_fence_route_listE.setGet_vehicle_fence_route_list(get_vehicle_fence_route_list);

		Get_vehicle_fence_route_listResponseE get_vehicle_fence_route_listResponseE = api.get_vehicle_fence_route_list(get_vehicle_fence_route_listE);
		Get_vehicle_fence_route_listResponse get_vehicle_fence_route_listResponse = get_vehicle_fence_route_listResponseE.getGet_vehicle_fence_route_listResponse();
		
		return get_vehicle_fence_route_listResponse.get_return().getFenceList().getFences().getFence();
	}

	public HistoryEntry[] getHistoricoDeVeiculos1maisRecente(String placa) throws RemoteException{
		
		Get_vehicle_historyE get_vehicle_historyE = new Get_vehicle_historyE();
		Get_vehicle_history get_vehicle_history = new Get_vehicle_history();
		  
		//get_vehicle_history.setSerial(param);		
		get_vehicle_history.setPlate(placa);
		get_vehicle_history.setNumberOfRecords(1);
		get_vehicle_history.setShowOrder("BELOW");			

		//if(seqId != 0) {
			//get_vehicle_history.setSeqId(seqId);
		//}
		
		get_vehicle_historyE.setGet_vehicle_history(get_vehicle_history);

		Get_vehicle_historyResponseE get_vehicle_historyResponseE = api.get_vehicle_history(get_vehicle_historyE);
		Get_vehicle_historyResponse getGet_vehicle_historyResponse = get_vehicle_historyResponseE.getGet_vehicle_historyResponse();
		
		return getGet_vehicle_historyResponse.get_return().getHistoryEntries().getHistoryEntry();
	}

	public Vehicle[] getListaDeVeiculos() throws RemoteException {
		
		Get_vehicle_listE get_vehicle_listE = new Get_vehicle_listE();
		Get_vehicle_list get_vehicle_list = new Get_vehicle_list();
		  
		//Plates plates = new Plates();
		  	   //plates.addPlate("HOH6581");
		//get_vehicle_list.setPlates(plates);

		get_vehicle_listE.setGet_vehicle_list(get_vehicle_list);
		
		Get_vehicle_listResponseE get_vehicle_listResponseE = api.get_vehicle_list(get_vehicle_listE);
		Get_vehicle_listResponse get_vehicle_listResponse = get_vehicle_listResponseE.getGet_vehicle_listResponse();
		
		return get_vehicle_listResponse.get_return().getVehicles().getVehicle();
	}
	
	public LandmarkImportError[] getImportarMarcos() throws RemoteException {
		
		Import_landmarks import_landmarks = new Import_landmarks();
	
		Import_landmarksResponse import_landmarksResponse = api.import_landmarks(import_landmarks);
		LandmarkImportResponse landmarkImportResponse = import_landmarksResponse.getImport_landmarksResponse();
		
		return landmarkImportResponse.getErrors().getError();
	}

	public ApiResponse getRotaDeCercaDeLigacaoAoVeiculo() throws RemoteException, ApplicationExceptionException, SystemExceptionException {
		
		Link_fence_route_to_vehicleE link_fence_route_to_vehicleE = new Link_fence_route_to_vehicleE();
		Link_fence_route_to_vehicle link_fence_route_to_vehicle = new Link_fence_route_to_vehicle();

		link_fence_route_to_vehicleE.setLink_fence_route_to_vehicle(link_fence_route_to_vehicle);
		
		Link_fence_route_to_vehicleResponseE link_fence_route_to_vehicleResponseE = api.link_fence_route_to_vehicle(link_fence_route_to_vehicleE);
		Link_fence_route_to_vehicleResponse link_fence_route_to_vehicleResponse = link_fence_route_to_vehicleResponseE.getLink_fence_route_to_vehicleResponse();
		
		return link_fence_route_to_vehicleResponse.get_return();
	}

	public SentCommand getEnviarComando(String mnemonic, String serial) throws RemoteException, ApplicationExceptionException {
		
		Send_commandE send_commandE = new Send_commandE();
		Send_command send_command = new Send_command();
					 send_command.setMnemonic(mnemonic);
					 send_command.setSerial(serial);
					
		send_commandE.setSend_command(send_command);
		
		Send_commandResponseE send_commandResponseE = api.send_command(send_commandE);
		Send_commandResponse send_commandResponse = send_commandResponseE.getSend_commandResponse();
		
		return send_commandResponse.get_return();
	}

	public ApiResponse getAplicaCargoId() throws RemoteException{
		
		Set_cargo_idE set_cargo_idE = new Set_cargo_idE();
		Set_cargo_id set_cargo_id = new Set_cargo_id();

		set_cargo_idE.setSet_cargo_id(set_cargo_id);

		Set_cargo_idResponseE set_cargo_idResponseE = api.set_cargo_id(set_cargo_idE);
		Set_cargo_idResponse set_cargo_idResponse = set_cargo_idResponseE.getSet_cargo_idResponse();
		
		return set_cargo_idResponse.get_return();
	}

	public GetFenceResponse getAplicaRotaDeCerca() throws RemoteException{
		
		Set_fence_routeE set_fence_routeE = new Set_fence_routeE();
		Set_fence_route set_fence_route = new Set_fence_route();

		set_fence_routeE.setSet_fence_route(set_fence_route);

		Set_fence_routeResponseE set_fence_routeResponseE = api.set_fence_route(set_fence_routeE);
		Set_fence_routeResponse set_fence_routeResponse = set_fence_routeResponseE.getSet_fence_routeResponse();
		
		return set_fence_routeResponse.get_return();
	}

	public ApiResponse getSalvarCompartilhamento() throws RemoteException{
		
		Set_Saver_sharingE set_Saver_sharingE = new Set_Saver_sharingE();
		Set_Saver_sharing set_Saver_sharing = new Set_Saver_sharing();

		set_Saver_sharingE.setSet_Saver_sharing(set_Saver_sharing);

		Set_Saver_sharingResponseE set_Saver_sharingResponseE = api.set_Saver_sharing(set_Saver_sharingE);
		Set_Saver_sharingResponse set_Saver_sharingResponse = set_Saver_sharingResponseE.getSet_Saver_sharingResponse();
		
		return set_Saver_sharingResponse.get_return();
	}
	
	public void trataExcecao(Object objeto) throws IllegalArgumentException, IllegalAccessException {

		Class<?> classe = objeto.getClass();

		for (Field field : classe.getDeclaredFields()) {

			field.setAccessible(true);
		
				if (field.getType() == double.class) {
					
					String conteudo = field.get(objeto).toString();
					
					if(conteudo.contains("NaN")) {
						
						field.set(objeto, 0);
					}
				}
		}
	}


}
