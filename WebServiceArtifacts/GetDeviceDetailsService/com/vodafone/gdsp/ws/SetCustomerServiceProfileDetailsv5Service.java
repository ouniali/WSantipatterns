
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
@WebServiceClient(name = "SetCustomerServiceProfileDetailsv5Service", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class SetCustomerServiceProfileDetailsv5Service
    extends Service
{

    private final static URL SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_WSDL_LOCATION;
    private final static WebServiceException SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_EXCEPTION;
    private final static QName SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "SetCustomerServiceProfileDetailsv5Service");

    static {
        SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.SetCustomerServiceProfileDetailsv5Service.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_EXCEPTION = e;
    }

    public SetCustomerServiceProfileDetailsv5Service() {
        super(__getWsdlLocation(), SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_QNAME);
    }

    public SetCustomerServiceProfileDetailsv5Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_QNAME, features);
    }

    public SetCustomerServiceProfileDetailsv5Service(URL wsdlLocation) {
        super(wsdlLocation, SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_QNAME);
    }

    public SetCustomerServiceProfileDetailsv5Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_QNAME, features);
    }

    public SetCustomerServiceProfileDetailsv5Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SetCustomerServiceProfileDetailsv5Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SetCustomerServiceProfileDetailsv5
     */
    @WebEndpoint(name = "SetCustomerServiceProfileDetailsv5Port")
    public SetCustomerServiceProfileDetailsv5 getSetCustomerServiceProfileDetailsv5Port() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "SetCustomerServiceProfileDetailsv5Port"), SetCustomerServiceProfileDetailsv5.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SetCustomerServiceProfileDetailsv5
     */
    @WebEndpoint(name = "SetCustomerServiceProfileDetailsv5Port")
    public SetCustomerServiceProfileDetailsv5 getSetCustomerServiceProfileDetailsv5Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "SetCustomerServiceProfileDetailsv5Port"), SetCustomerServiceProfileDetailsv5.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_EXCEPTION!= null) {
            throw SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_EXCEPTION;
        }
        return SETCUSTOMERSERVICEPROFILEDETAILSV5SERVICE_WSDL_LOCATION;
    }

}
