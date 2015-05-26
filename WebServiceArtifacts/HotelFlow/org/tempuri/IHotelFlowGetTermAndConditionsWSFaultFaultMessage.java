
package org.tempuri;

import javax.xml.ws.WebFault;
import com.tourico.schemas.webservices.faults.WSFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WSFault", targetNamespace = "http://schemas.tourico.com/webservices/faults")
public class IHotelFlowGetTermAndConditionsWSFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WSFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IHotelFlowGetTermAndConditionsWSFaultFaultMessage(String message, WSFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IHotelFlowGetTermAndConditionsWSFaultFaultMessage(String message, WSFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.tourico.schemas.webservices.faults.WSFault
     */
    public WSFault getFaultInfo() {
        return faultInfo;
    }

}
