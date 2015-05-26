
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
@WebService(name = "DeviceCredentialsv2", targetNamespace = "http://ws.gdsp.vodafone.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DeviceCredentialsv2 {


    /**
     * 
     * @param gdspHeader
     * @param parameters
     * @return
     *     returns com.vodafone.gdsp.ws.SetDeviceCredentialsv2Response
     */
    @WebMethod
    @WebResult(name = "setDeviceCredentialsv2Response", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "result")
    public SetDeviceCredentialsv2Response setDeviceCredentialsv2(
        @WebParam(name = "setDeviceCredentialsv2", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "parameters")
        SetDeviceCredentialsv2 parameters,
        @WebParam(name = "gdspHeader", targetNamespace = "http://ws.gdsp.vodafone.com/", header = true, partName = "gdspHeader")
        GdspHeader gdspHeader);

    /**
     * 
     * @param gdspHeader
     * @param parameters
     * @return
     *     returns com.vodafone.gdsp.ws.UpdateDeviceCredentialsv2Response
     */
    @WebMethod
    @WebResult(name = "updateDeviceCredentialsv2Response", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "result")
    public UpdateDeviceCredentialsv2Response updateDeviceCredentialsv2(
        @WebParam(name = "updateDeviceCredentialsv2", targetNamespace = "http://ws.gdsp.vodafone.com/", partName = "parameters")
        UpdateDeviceCredentialsv2 parameters,
        @WebParam(name = "gdspHeader", targetNamespace = "http://ws.gdsp.vodafone.com/", header = true, partName = "gdspHeader")
        GdspHeader gdspHeader);

}