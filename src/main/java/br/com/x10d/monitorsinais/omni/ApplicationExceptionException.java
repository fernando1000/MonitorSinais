/**
 * ApplicationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package br.com.x10d.monitorsinais.omni;

public class ApplicationExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1534699355754L;
    private br.com.x10d.monitorsinais.omni.ApplicationExceptionE faultMessage;

    public ApplicationExceptionException() {
        super("ApplicationExceptionException");
    }

    public ApplicationExceptionException(java.lang.String s) {
        super(s);
    }

    public ApplicationExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public ApplicationExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        br.com.x10d.monitorsinais.omni.ApplicationExceptionE msg) {
        faultMessage = msg;
    }

    public br.com.x10d.monitorsinais.omni.ApplicationExceptionE getFaultMessage() {
        return faultMessage;
    }
}
