
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
@WebService(name = "GetCustomerDetails", targetNamespace = "http://ws.gdsp.vodafone.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetCustomerDetails {


    /**
     * 
     * @param gdspHeader
     * @param parameters
     * @return
     *     returns com.vodafone.gdsp.ws.GetCustomerDetailsResponse
     */
    @WebMethod
    @WebResult(name = "getCustomerDetailsResponse", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "result")
    public GetCustomerDetailsResponse getCustomerDetails(
        @WebParam(name = "getCustomerDetails", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "parameters")
        GetCustomerDetails_Type parameters,
        @WebParam(name = "gdspHeader", targetNamespace = "http://ws.gdsp.vodafone.com/", header = true, partName = "gdspHeader")
        GdspHeader gdspHeader);

}