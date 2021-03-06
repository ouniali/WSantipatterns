
package com.conducivetech.cache.ratings.service.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "APIException", targetNamespace = "http://v1.service.ratings.cache.conducivetech.com/")
public class APIException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private APIException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public APIException_Exception(String message, APIException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public APIException_Exception(String message, APIException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.conducivetech.cache.ratings.service.v1.APIException
     */
    public APIException getFaultInfo() {
        return faultInfo;
    }

}
