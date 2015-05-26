
package com.vodafone.gdsp.ws;

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
@WebService(name = "SetCustomerServiceProfileDetailsv5", targetNamespace = "http://ws.gdsp.vodafone.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SetCustomerServiceProfileDetailsv5 {


    /**
     * 
     * @param gdspHeader
     * @param parameters
     * @return
     *     returns com.vodafone.gdsp.ws.SetCustomerServiceProfileDetailsv5Response
     */
    @WebMethod
    @WebResult(name = "setCustomerServiceProfileDetailsv5Response", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "result")
    public SetCustomerServiceProfileDetailsv5Response setCustomerServiceProfileDetailsv5(
        @WebParam(name = "setCustomerServiceProfileDetailsv5", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "parameters")
        SetCustomerServiceProfileDetailsv5_Type parameters,
        @WebParam(name = "gdspHeader", targetNamespace = "http://ws.gdsp.vodafone.com/", header = true, partName = "gdspHeader")
        GdspHeader gdspHeader);

}