
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
@WebServiceClient(name = "GetCustomerServiceProfileDetailsv4", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetCustomerServiceProfileDetailsv4_Service
    extends Service
{

    private final static URL GETCUSTOMERSERVICEPROFILEDETAILSV4_WSDL_LOCATION;
    private final static WebServiceException GETCUSTOMERSERVICEPROFILEDETAILSV4_EXCEPTION;
    private final static QName GETCUSTOMERSERVICEPROFILEDETAILSV4_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetCustomerServiceProfileDetailsv4");

    static {
        GETCUSTOMERSERVICEPROFILEDETAILSV4_WSDL_LOCATION = com.vodafone.gdsp.ws.GetCustomerServiceProfileDetailsv4_Service.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETCUSTOMERSERVICEPROFILEDETAILSV4_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETCUSTOMERSERVICEPROFILEDETAILSV4_EXCEPTION = e;
    }

    public GetCustomerServiceProfileDetailsv4_Service() {
        super(__getWsdlLocation(), GETCUSTOMERSERVICEPROFILEDETAILSV4_QNAME);
    }

    public GetCustomerServiceProfileDetailsv4_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETCUSTOMERSERVICEPROFILEDETAILSV4_QNAME, features);
    }

    public GetCustomerServiceProfileDetailsv4_Service(URL wsdlLocation) {
        super(wsdlLocation, GETCUSTOMERSERVICEPROFILEDETAILSV4_QNAME);
    }

    public GetCustomerServiceProfileDetailsv4_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETCUSTOMERSERVICEPROFILEDETAILSV4_QNAME, features);
    }

    public GetCustomerServiceProfileDetailsv4_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetCustomerServiceProfileDetailsv4_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetCustomerServiceProfileDetailsv4
     */
    @WebEndpoint(name = "GetCustomerServiceProfileDetailsv4Port")
    public GetCustomerServiceProfileDetailsv4 getGetCustomerServiceProfileDetailsv4Port() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetCustomerServiceProfileDetailsv4Port"), GetCustomerServiceProfileDetailsv4.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetCustomerServiceProfileDetailsv4
     */
    @WebEndpoint(name = "GetCustomerServiceProfileDetailsv4Port")
    public GetCustomerServiceProfileDetailsv4 getGetCustomerServiceProfileDetailsv4Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetCustomerServiceProfileDetailsv4Port"), GetCustomerServiceProfileDetailsv4.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETCUSTOMERSERVICEPROFILEDETAILSV4_EXCEPTION!= null) {
            throw GETCUSTOMERSERVICEPROFILEDETAILSV4_EXCEPTION;
        }
        return GETCUSTOMERSERVICEPROFILEDETAILSV4_WSDL_LOCATION;
    }

}
