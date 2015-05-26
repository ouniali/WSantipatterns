
package otswebws.websvcs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WSException", targetNamespace = "http://exception.sharedws")
public class WSException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private sharedws.exception.WSException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WSException(String message, sharedws.exception.WSException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public WSException(String message, sharedws.exception.WSException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: sharedws.exception.WSException
     */
    public sharedws.exception.WSException getFaultInfo() {
        return faultInfo;
    }

}