/**
 * Api.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package br.com.x10d.monitorsinais.omni;


/*
 *  Api java interface
 */
public interface Api {
    /**
     * Auto generated method signature
     *
     * @param import_landmarks
     */
    public br.com.x10d.monitorsinais.omni.Import_landmarksResponse import_landmarks(
        br.com.x10d.monitorsinais.omni.Import_landmarks import_landmarks)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param get_top_driving_current_state
     */
    public br.com.x10d.monitorsinais.omni.Get_top_driving_current_stateResponseE get_top_driving_current_state(
        br.com.x10d.monitorsinais.omni.Get_top_driving_current_stateE get_top_driving_current_state)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param get_top_driving_history
     */
    public br.com.x10d.monitorsinais.omni.Get_top_driving_historyResponse get_top_driving_history(
        br.com.x10d.monitorsinais.omni.Get_top_driving_history get_top_driving_history)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param set_fence_route
     */
    public br.com.x10d.monitorsinais.omni.Set_fence_routeResponseE set_fence_route(
        br.com.x10d.monitorsinais.omni.Set_fence_routeE set_fence_route)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param get_macro_groups_list
     * @throws br.com.x10d.monitorsinais.omni.ApplicationExceptionException :
     */
    public br.com.x10d.monitorsinais.omni.Get_macro_groups_listResponseE get_macro_groups_list(
        br.com.x10d.monitorsinais.omni.Get_macro_groups_listE get_macro_groups_list)
        throws java.rmi.RemoteException,
            br.com.x10d.monitorsinais.omni.ApplicationExceptionException;

    /**
     * Auto generated method signature
     *
     * @param get_command_status
     */
    public br.com.x10d.monitorsinais.omni.Get_command_statusResponseE get_command_status(
        br.com.x10d.monitorsinais.omni.Get_command_statusE get_command_status)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param set_Saver_sharing
     */
    public br.com.x10d.monitorsinais.omni.Set_Saver_sharingResponseE set_Saver_sharing(
        br.com.x10d.monitorsinais.omni.Set_Saver_sharingE set_Saver_sharing)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param link_fence_route_to_vehicle
     * @throws br.com.x10d.monitorsinais.omni.ApplicationExceptionException :
     * @throws br.com.x10d.monitorsinais.omni.SystemExceptionException :
     */
    public br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicleResponseE link_fence_route_to_vehicle(
        br.com.x10d.monitorsinais.omni.Link_fence_route_to_vehicleE link_fence_route_to_vehicle)
        throws java.rmi.RemoteException,
            br.com.x10d.monitorsinais.omni.ApplicationExceptionException,
            br.com.x10d.monitorsinais.omni.SystemExceptionException;

    /**
     * Auto generated method signature
     *
     * @param get_driver_list
     */
    public br.com.x10d.monitorsinais.omni.Get_driver_listResponseE get_driver_list(
        br.com.x10d.monitorsinais.omni.Get_driver_listE get_driver_list)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param set_cargo_id
     */
    public br.com.x10d.monitorsinais.omni.Set_cargo_idResponseE set_cargo_id(
        br.com.x10d.monitorsinais.omni.Set_cargo_idE set_cargo_id)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param get_vehicle_history
     */
    public br.com.x10d.monitorsinais.omni.Get_vehicle_historyResponseE get_vehicle_history(
        br.com.x10d.monitorsinais.omni.Get_vehicle_historyE get_vehicle_history)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param send_command
     * @throws br.com.x10d.monitorsinais.omni.ApplicationExceptionException :
     */
    public br.com.x10d.monitorsinais.omni.Send_commandResponseE send_command(
        br.com.x10d.monitorsinais.omni.Send_commandE send_command)
        throws java.rmi.RemoteException,
            br.com.x10d.monitorsinais.omni.ApplicationExceptionException;

    /**
     * Auto generated method signature
     *
     * @param get_fence_route_list
     */
    public br.com.x10d.monitorsinais.omni.Get_fence_route_listResponseE get_fence_route_list(
        br.com.x10d.monitorsinais.omni.Get_fence_route_listE get_fence_route_list)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param get_vehicle_list
     */
    public br.com.x10d.monitorsinais.omni.Get_vehicle_listResponseE get_vehicle_list(
        br.com.x10d.monitorsinais.omni.Get_vehicle_listE get_vehicle_list)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param get_vehicle_fence_route_list
     * @throws br.com.x10d.monitorsinais.omni.ApplicationExceptionException :
     */
    public br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_listResponseE get_vehicle_fence_route_list(
        br.com.x10d.monitorsinais.omni.Get_vehicle_fence_route_listE get_vehicle_fence_route_list)
        throws java.rmi.RemoteException,
            br.com.x10d.monitorsinais.omni.ApplicationExceptionException;

    //
}
