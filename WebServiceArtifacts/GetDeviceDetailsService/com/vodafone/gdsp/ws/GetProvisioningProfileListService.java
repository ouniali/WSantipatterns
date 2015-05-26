
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
@WebServiceClient(name = "GetProvisioningProfileListService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetProvisioningProfileListService
    extends Service
{

    private final static URL GETPROVISIONINGPROFILELISTSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETPROVISIONINGPROFILELISTSERVICE_EXCEPTION;
    private final static QName GETPROVISIONINGPROFILELISTSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetProvisioningProfileListService");

    static {
        GETPROVISIONINGPROFILELISTSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.GetProvisioningProfileListService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETPROVISIONINGPROFILELISTSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETPROVISIONINGPROFILELISTSERVICE_EXCEPTION = e;
    }

    public GetProvisioningProfileListService() {
        super(__getWsdlLocation(), GETPROVISIONINGPROFILELISTSERVICE_QNAME);
    }

    public GetProvisioningProfileListService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETPROVISIONINGPROFILELISTSERVICE_QNAME, features);
    }

    public GetProvisioningProfileListService(URL wsdlLocation) {
        super(wsdlLocation, GETPROVISIONINGPROFILELISTSERVICE_QNAME);
    }

    public GetProvisioningProfileListService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETPROVISIONINGPROFILELISTSERVICE_QNAME, features);
    }

    public GetProvisioningProfileListService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetProvisioningProfileListService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetProvisioningProfileList
     */
    @WebEndpoint(name = "GetProvisioningProfileListPort")
    public GetProvisioningProfileList getGetProvisioningProfileListPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetProvisioningProfileListPort"), GetProvisioningProfileList.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetProvisioningProfileList
     */
    @WebEndpoint(name = "GetProvisioningProfileListPort")
    public GetProvisioningProfileList getGetProvisioningProfileListPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetProvisioningProfileListPort"), GetProvisioningProfileList.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETPROVISIONINGPROFILELISTSERVICE_EXCEPTION!= null) {
            throw GETPROVISIONINGPROFILELISTSERVICE_EXCEPTION;
        }
        return GETPROVISIONINGPROFILELISTSERVICE_WSDL_LOCATION;
    }

}
