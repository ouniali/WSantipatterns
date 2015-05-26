
package fr.chronopost.soap.shipping.cxf;

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
@WebServiceClient(name = "ShippingServiceWSService", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", wsdlLocation = "META-INF/wsdl/ShippingServiceWSService.wsdl")
public class ShippingServiceWSService
    extends Service
{

    private final static URL SHIPPINGSERVICEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHIPPINGSERVICEWSSERVICE_EXCEPTION;
    private final static QName SHIPPINGSERVICEWSSERVICE_QNAME = new QName("http://cxf.shipping.soap.chronopost.fr/", "ShippingServiceWSService");

    static {
        SHIPPINGSERVICEWSSERVICE_WSDL_LOCATION = fr.chronopost.soap.shipping.cxf.ShippingServiceWSService.class.getClassLoader().getResource("META-INF/wsdl/ShippingServiceWSService.wsdl");
        WebServiceException e = null;
        if (SHIPPINGSERVICEWSSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/ShippingServiceWSService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SHIPPINGSERVICEWSSERVICE_EXCEPTION = e;
    }

    public ShippingServiceWSService() {
        super(__getWsdlLocation(), SHIPPINGSERVICEWSSERVICE_QNAME);
    }

    public ShippingServiceWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHIPPINGSERVICEWSSERVICE_QNAME, features);
    }

    public ShippingServiceWSService(URL wsdlLocation) {
        super(wsdlLocation, SHIPPINGSERVICEWSSERVICE_QNAME);
    }

    public ShippingServiceWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHIPPINGSERVICEWSSERVICE_QNAME, features);
    }

    public ShippingServiceWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShippingServiceWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShippingServiceWS
     */
    @WebEndpoint(name = "ShippingServiceWSPort")
    public ShippingServiceWS getShippingServiceWSPort() {
        return super.getPort(new QName("http://cxf.shipping.soap.chronopost.fr/", "ShippingServiceWSPort"), ShippingServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShippingServiceWS
     */
    @WebEndpoint(name = "ShippingServiceWSPort")
    public ShippingServiceWS getShippingServiceWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cxf.shipping.soap.chronopost.fr/", "ShippingServiceWSPort"), ShippingServiceWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHIPPINGSERVICEWSSERVICE_EXCEPTION!= null) {
            throw SHIPPINGSERVICEWSSERVICE_EXCEPTION;
        }
        return SHIPPINGSERVICEWSSERVICE_WSDL_LOCATION;
    }

}