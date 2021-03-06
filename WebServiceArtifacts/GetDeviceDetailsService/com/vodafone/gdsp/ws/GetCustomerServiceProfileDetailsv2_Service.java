
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
@WebServiceClient(name = "GetCustomerServiceProfileDetailsv2", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetCustomerServiceProfileDetailsv2_Service
    extends Service
{

    private final static URL GETCUSTOMERSERVICEPROFILEDETAILSV2_WSDL_LOCATION;
    private final static WebServiceException GETCUSTOMERSERVICEPROFILEDETAILSV2_EXCEPTION;
    private final static QName GETCUSTOMERSERVICEPROFILEDETAILSV2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetCustomerServiceProfileDetailsv2");

    static {
        GETCUSTOMERSERVICEPROFILEDETAILSV2_WSDL_LOCATION = com.vodafone.gdsp.ws.GetCustomerServiceProfileDetailsv2_Service.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETCUSTOMERSERVICEPROFILEDETAILSV2_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETCUSTOMERSERVICEPROFILEDETAILSV2_EXCEPTION = e;
    }

    public GetCustomerServiceProfileDetailsv2_Service() {
        super(__getWsdlLocation(), GETCUSTOMERSERVICEPROFILEDETAILSV2_QNAME);
    }

    public GetCustomerServiceProfileDetailsv2_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETCUSTOMERSERVICEPROFILEDETAILSV2_QNAME, features);
    }

    public GetCustomerServiceProfileDetailsv2_Service(URL wsdlLocation) {
        super(wsdlLocation, GETCUSTOMERSERVICEPROFILEDETAILSV2_QNAME);
    }

    public GetCustomerServiceProfileDetailsv2_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETCUSTOMERSERVICEPROFILEDETAILSV2_QNAME, features);
    }

    public GetCustomerServiceProfileDetailsv2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetCustomerServiceProfileDetailsv2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetCustomerServiceProfileDetailsv2
     */
    @WebEndpoint(name = "GetCustomerServiceProfileDetailsv2Port")
    public GetCustomerServiceProfileDetailsv2 getGetCustomerServiceProfileDetailsv2Port() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetCustomerServiceProfileDetailsv2Port"), GetCustomerServiceProfileDetailsv2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetCustomerServiceProfileDetailsv2
     */
    @WebEndpoint(name = "GetCustomerServiceProfileDetailsv2Port")
    public GetCustomerServiceProfileDetailsv2 getGetCustomerServiceProfileDetailsv2Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetCustomerServiceProfileDetailsv2Port"), GetCustomerServiceProfileDetailsv2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETCUSTOMERSERVICEPROFILEDETAILSV2_EXCEPTION!= null) {
            throw GETCUSTOMERSERVICEPROFILEDETAILSV2_EXCEPTION;
        }
        return GETCUSTOMERSERVICEPROFILEDETAILSV2_WSDL_LOCATION;
    }

}
