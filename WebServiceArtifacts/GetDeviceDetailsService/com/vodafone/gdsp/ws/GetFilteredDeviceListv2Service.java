
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
@WebServiceClient(name = "GetFilteredDeviceListv2Service", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetFilteredDeviceListv2Service
    extends Service
{

    private final static URL GETFILTEREDDEVICELISTV2SERVICE_WSDL_LOCATION;
    private final static WebServiceException GETFILTEREDDEVICELISTV2SERVICE_EXCEPTION;
    private final static QName GETFILTEREDDEVICELISTV2SERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetFilteredDeviceListv2Service");

    static {
        GETFILTEREDDEVICELISTV2SERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.GetFilteredDeviceListv2Service.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETFILTEREDDEVICELISTV2SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETFILTEREDDEVICELISTV2SERVICE_EXCEPTION = e;
    }

    public GetFilteredDeviceListv2Service() {
        super(__getWsdlLocation(), GETFILTEREDDEVICELISTV2SERVICE_QNAME);
    }

    public GetFilteredDeviceListv2Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETFILTEREDDEVICELISTV2SERVICE_QNAME, features);
    }

    public GetFilteredDeviceListv2Service(URL wsdlLocation) {
        super(wsdlLocation, GETFILTEREDDEVICELISTV2SERVICE_QNAME);
    }

    public GetFilteredDeviceListv2Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETFILTEREDDEVICELISTV2SERVICE_QNAME, features);
    }

    public GetFilteredDeviceListv2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetFilteredDeviceListv2Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetFilteredDeviceListv2
     */
    @WebEndpoint(name = "GetFilteredDeviceListv2Port")
    public GetFilteredDeviceListv2 getGetFilteredDeviceListv2Port() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetFilteredDeviceListv2Port"), GetFilteredDeviceListv2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetFilteredDeviceListv2
     */
    @WebEndpoint(name = "GetFilteredDeviceListv2Port")
    public GetFilteredDeviceListv2 getGetFilteredDeviceListv2Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetFilteredDeviceListv2Port"), GetFilteredDeviceListv2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETFILTEREDDEVICELISTV2SERVICE_EXCEPTION!= null) {
            throw GETFILTEREDDEVICELISTV2SERVICE_EXCEPTION;
        }
        return GETFILTEREDDEVICELISTV2SERVICE_WSDL_LOCATION;
    }

}
