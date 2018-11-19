/**
 * SystemExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package br.com.x10d.monitorsinais.omni;

public class SystemExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1534699355766L;
    private br.com.x10d.monitorsinais.omni.SystemExceptionE faultMessage;

    public SystemExceptionException() {
        super("SystemExceptionException");
    }

    public SystemExceptionException(java.lang.String s) {
        super(s);
    }

    public SystemExceptionException(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public SystemExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        br.com.x10d.monitorsinais.omni.SystemExceptionE msg) {
        faultMessage = msg;
    }

    public br.com.x10d.monitorsinais.omni.SystemExceptionE getFaultMessage() {
        return faultMessage;
    }
}
