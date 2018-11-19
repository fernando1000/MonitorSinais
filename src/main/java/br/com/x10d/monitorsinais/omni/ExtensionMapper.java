/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package br.com.x10d.monitorsinais.omni;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_macro_groups_listResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_macro_groups_listResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_command_statusResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_command_statusResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "set_Saver_sharingResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Set_Saver_sharingResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_vehicle_listResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_vehicle_listResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "serials".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Serials.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "points_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Points_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "vehicle".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Vehicle.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "point".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Point.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_fence_route_listResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_fence_route_listResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "landmarkImportData".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.LandmarkImportData.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "macroList".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.MacroList.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "sequences".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Sequences.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "set_Saver_sharing".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Set_Saver_sharing.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "set_cargo_id".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Set_cargo_id.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getDriverListResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetDriverListResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "SystemException".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.SystemException.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getFenceListResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetFenceListResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "commandStatus_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.CommandStatus_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "errors_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Errors_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "tokens".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Tokens.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "topDrivingCurrentState".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.TopDrivingCurrentState.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "journeys_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Journeys_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "set_fence_routeResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Set_fence_routeResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "historyEntries_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.HistoryEntries_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_vehicle_fence_route_listResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_listResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_macro_groups_list".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_macro_groups_list.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "macros_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Macros_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "customMacroDTO".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.CustomMacroDTO.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "set_cargo_idResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Set_cargo_idResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "ApplicationException".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.ApplicationException.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "dNames_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.DNames_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "macrosDenied_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.MacrosDenied_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "vehicleList".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.VehicleList.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "send_commandResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Send_commandResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "commandStatusEntry".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.CommandStatusEntry.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "landmarkAddress".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.LandmarkAddress.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_vehicle_fence_route_list".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_list.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_vehicle_list".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_vehicle_list.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getTopDrivingHistoryResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetTopDrivingHistoryResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "set_fence_route".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Set_fence_route.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_driver_listResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_driver_listResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "landmarkCoordinates".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.LandmarkCoordinates.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "apiResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.ApiResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "sentCommand".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.SentCommand.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "journeyStatus".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.JourneyStatus.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "journeyHistory".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.JourneyHistory.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "send_command".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Send_command.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_fence_route_list".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_fence_route_list.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "plates_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Plates_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "landmarkImportResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.LandmarkImportResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "macroGroups_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.MacroGroups_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "link_fence_route_to_vehicleResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicleResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "vehicles_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Vehicles_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "fences_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Fences_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "drivers_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Drivers_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "fences_type1".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Fences_type1.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "fenceParam".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.FenceParam.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "sendCommandParameters".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.SendCommandParameters.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_top_driving_current_state".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_top_driving_current_state.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "historyEntry".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.HistoryEntry.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "plates".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Plates.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getTopDrivingCurrentStateResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetTopDrivingCurrentStateResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getTopDrivingHistoryRequest".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetTopDrivingHistoryRequest.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "landmarkImportRequest".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.LandmarkImportRequest.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "entries_type0".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Entries_type0.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "fenceListParam".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.FenceListParam.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_command_status".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_command_status.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "link_fence_route_to_vehicle".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicle.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_driver_list".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_driver_list.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "sendCommandParam".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.SendCommandParam.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "commandStatus".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.CommandStatus.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "driver".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Driver.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_vehicle_history".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_vehicle_history.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "landmarkImportError".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.LandmarkImportError.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "vehicleHistory".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.VehicleHistory.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "customFenceDTO".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.CustomFenceDTO.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_top_driving_current_stateResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_top_driving_current_stateResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "get_vehicle_historyResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.Get_vehicle_historyResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "macroGroupDTO".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.MacroGroupDTO.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getVehicleFenceListResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetVehicleFenceListResponse.Factory.parse(reader);
        }

        if ("http://linkerapi.portalorion.zatix.com.br/".equals(namespaceURI) &&
                "getFenceResponse".equals(typeName)) {
            return br.com.x10d.monitorsinais.omni.GetFenceResponse.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
