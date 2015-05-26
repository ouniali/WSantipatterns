
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
@WebServiceClient(name = "SetDeviceDetailsService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class SetDeviceDetailsService
    extends Service
{

    private final static URL SETDEVICEDETAILSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SETDEVICEDETAILSSERVICE_EXCEPTION;
    private final static QName SETDEVICEDETAILSSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "SetDeviceDetailsService");

    static {
        SETDEVICEDETAILSSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.SetDeviceDetailsService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (SETDEVICEDETAILSSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SETDEVICEDETAILSSERVICE_EXCEPTION = e;
    }

    public SetDeviceDetailsService() {
        super(__getWsdlLocation(), SETDEVICEDETAILSSERVICE_QNAME);
    }

    public SetDeviceDetailsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SETDEVICEDETAILSSERVICE_QNAME, features);
    }

    public SetDeviceDetailsService(URL wsdlLocation) {
        super(wsdlLocation, SETDEVICEDETAILSSERVICE_QNAME);
    }

    public SetDeviceDetailsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SETDEVICEDETAILSSERVICE_QNAME, features);
    }

    public SetDeviceDetailsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SetDeviceDetailsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SetDeviceDetails
     */
    @WebEndpoint(name = "SetDeviceDetailsPort")
    public SetDeviceDetails getSetDeviceDetailsPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "SetDeviceDetailsPort"), SetDeviceDetails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SetDeviceDetails
     */
    @WebEndpoint(name = "SetDeviceDetailsPort")
    public SetDeviceDetails getSetDeviceDetailsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "SetDeviceDetailsPort"), SetDeviceDetails.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SETDEVICEDETAILSSERVICE_EXCEPTION!= null) {
            throw SETDEVICEDETAILSSERVICE_EXCEPTION;
        }
        return SETDEVICEDETAILSSERVICE_WSDL_LOCATION;
    }

}
