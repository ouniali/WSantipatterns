
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
@WebServiceClient(name = "GetDeviceLocationDetailsService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetDeviceLocationDetailsService
    extends Service
{

    private final static URL GETDEVICELOCATIONDETAILSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETDEVICELOCATIONDETAILSSERVICE_EXCEPTION;
    private final static QName GETDEVICELOCATIONDETAILSSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetDeviceLocationDetailsService");

    static {
        GETDEVICELOCATIONDETAILSSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.GetDeviceLocationDetailsService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETDEVICELOCATIONDETAILSSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETDEVICELOCATIONDETAILSSERVICE_EXCEPTION = e;
    }

    public GetDeviceLocationDetailsService() {
        super(__getWsdlLocation(), GETDEVICELOCATIONDETAILSSERVICE_QNAME);
    }

    public GetDeviceLocationDetailsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETDEVICELOCATIONDETAILSSERVICE_QNAME, features);
    }

    public GetDeviceLocationDetailsService(URL wsdlLocation) {
        super(wsdlLocation, GETDEVICELOCATIONDETAILSSERVICE_QNAME);
    }

    public GetDeviceLocationDetailsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETDEVICELOCATIONDETAILSSERVICE_QNAME, features);
    }

    public GetDeviceLocationDetailsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetDeviceLocationDetailsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetDeviceLocationDetails
     */
    @WebEndpoint(name = "GetDeviceLocationDetailsPort")
    public GetDeviceLocationDetails getGetDeviceLocationDetailsPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetDeviceLocationDetailsPort"), GetDeviceLocationDetails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetDeviceLocationDetails
     */
    @WebEndpoint(name = "GetDeviceLocationDetailsPort")
    public GetDeviceLocationDetails getGetDeviceLocationDetailsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetDeviceLocationDetailsPort"), GetDeviceLocationDetails.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETDEVICELOCATIONDETAILSSERVICE_EXCEPTION!= null) {
            throw GETDEVICELOCATIONDETAILSSERVICE_EXCEPTION;
        }
        return GETDEVICELOCATIONDETAILSSERVICE_WSDL_LOCATION;
    }

}
