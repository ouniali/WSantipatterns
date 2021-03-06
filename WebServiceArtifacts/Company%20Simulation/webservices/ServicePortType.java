
package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicePortType", targetNamespace = "http://webservices")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicePortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns webservices.OutputType
     */
    @WebMethod(operationName = "Company%20Simulation")
    @WebResult(name = "OutputType", targetNamespace = "http://webservices", partName = "parameters")
    public OutputType company_002520Simulation(
        @WebParam(name = "InputType", targetNamespace = "http://webservices", partName = "parameters")
        InputType parameters);

}
