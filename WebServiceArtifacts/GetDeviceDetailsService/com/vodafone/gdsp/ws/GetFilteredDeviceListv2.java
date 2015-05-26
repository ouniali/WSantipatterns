
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
@WebService(name = "GetFilteredDeviceListv2", targetNamespace = "http://ws.gdsp.vodafone.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetFilteredDeviceListv2 {


    /**
     * 
     * @param gdspHeader
     * @param parameters
     * @return
     *     returns com.vodafone.gdsp.ws.GetFilteredDeviceListResponse
     */
    @WebMethod
    @WebResult(name = "getFilteredDeviceListv2Response", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "result")
    public GetFilteredDeviceListResponse getFilteredDeviceListv2(
        @WebParam(name = "getFilteredDeviceListv2", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "parameters")
        GetFilteredDeviceListv2_Type parameters,
        @WebParam(name = "gdspHeader", targetNamespace = "http://ws.gdsp.vodafone.com/", header = true, partName = "gdspHeader")
        GdspHeader gdspHeader);

}
