
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MissingElementException", targetNamespace = "http://postini.com/PSTN/SOAPAPI/v2/automatedbatch")
public class MissingElementException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MissingElementException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MissingElementException_Exception(String message, MissingElementException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MissingElementException_Exception(String message, MissingElementException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.postini.pstn.soapapi.v2.automatedbatch.MissingElementException
     */
    public MissingElementException getFaultInfo() {
        return faultInfo;
    }

}