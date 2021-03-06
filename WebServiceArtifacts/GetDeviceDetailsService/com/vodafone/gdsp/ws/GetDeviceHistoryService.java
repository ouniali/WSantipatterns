
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
@WebServiceClient(name = "GetDeviceHistoryService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetDeviceHistoryService
    extends Service
{

    private final static URL GETDEVICEHISTORYSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETDEVICEHISTORYSERVICE_EXCEPTION;
    private final static QName GETDEVICEHISTORYSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetDeviceHistoryService");

    static {
        GETDEVICEHISTORYSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.GetDeviceHistoryService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETDEVICEHISTORYSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETDEVICEHISTORYSERVICE_EXCEPTION = e;
    }

    public GetDeviceHistoryService() {
        super(__getWsdlLocation(), GETDEVICEHISTORYSERVICE_QNAME);
    }

    public GetDeviceHistoryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETDEVICEHISTORYSERVICE_QNAME, features);
    }

    public GetDeviceHistoryService(URL wsdlLocation) {
        super(wsdlLocation, GETDEVICEHISTORYSERVICE_QNAME);
    }

    public GetDeviceHistoryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETDEVICEHISTORYSERVICE_QNAME, features);
    }

    public GetDeviceHistoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetDeviceHistoryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetDeviceHistory
     */
    @WebEndpoint(name = "GetDeviceHistoryPort")
    public GetDeviceHistory getGetDeviceHistoryPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetDeviceHistoryPort"), GetDeviceHistory.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetDeviceHistory
     */
    @WebEndpoint(name = "GetDeviceHistoryPort")
    public GetDeviceHistory getGetDeviceHistoryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetDeviceHistoryPort"), GetDeviceHistory.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETDEVICEHISTORYSERVICE_EXCEPTION!= null) {
            throw GETDEVICEHISTORYSERVICE_EXCEPTION;
        }
        return GETDEVICEHISTORYSERVICE_WSDL_LOCATION;
    }

}
