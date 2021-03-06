
package com.vodafone.gdsp.ws;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetFilteredDeviceListService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetFilteredDeviceListService
    extends Service
{

    private final static URL GETFILTEREDDEVICELISTSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETFILTEREDDEVICELISTSERVICE_EXCEPTION;
    private final static QName GETFILTEREDDEVICELISTSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetFilteredDeviceListService");

    static {
        GETFILTEREDDEVICELISTSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.GetFilteredDeviceListService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETFILTEREDDEVICELISTSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETFILTEREDDEVICELISTSERVICE_EXCEPTION = e;
    }

    public GetFilteredDeviceListService() {
        super(__getWsdlLocation(), GETFILTEREDDEVICELISTSERVICE_QNAME);
    }

    public GetFilteredDeviceListService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETFILTEREDDEVICELISTSERVICE_QNAME, features);
    }

    public GetFilteredDeviceListService(URL wsdlLocation) {
        super(wsdlLocation, GETFILTEREDDEVICELISTSERVICE_QNAME);
    }

    public GetFilteredDeviceListService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETFILTEREDDEVICELISTSERVICE_QNAME, features);
    }

    public GetFilteredDeviceListService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetFilteredDeviceListService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetFilteredDeviceList
     */
    @WebEndpoint(name = "GetFilteredDeviceListPort")
    public GetFilteredDeviceList getGetFilteredDeviceListPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetFilteredDeviceListPort"), GetFilteredDeviceList.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetFilteredDeviceList
     */
    @WebEndpoint(name = "GetFilteredDeviceListPort")
    public GetFilteredDeviceList getGetFilteredDeviceListPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetFilteredDeviceListPort"), GetFilteredDeviceList.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETFILTEREDDEVICELISTSERVICE_EXCEPTION!= null) {
            throw GETFILTEREDDEVICELISTSERVICE_EXCEPTION;
        }
        return GETFILTEREDDEVICELISTSERVICE_WSDL_LOCATION;
    }

}
