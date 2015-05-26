
package com.travelport.service.air_v18_0;

import javax.xml.ws.WebFault;
import com.travelport.schema.air_v18_0.AvailabilityErrorInfo;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AvailabilityErrorInfo", targetNamespace = "http://www.travelport.com/schema/air_v18_0")
public class AvailabilityFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AvailabilityErrorInfo faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AvailabilityFaultMessage(String message, AvailabilityErrorInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AvailabilityFaultMessage(String message, AvailabilityErrorInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.travelport.schema.air_v18_0.AvailabilityErrorInfo
     */
    public AvailabilityErrorInfo getFaultInfo() {
        return faultInfo;
    }

}