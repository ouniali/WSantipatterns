
package no.bring.logistics.shippingguide._1;

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
@WebServiceClient(name = "FraktguideService", targetNamespace = "http://www.bring.no/logistics/shippingguide/1.0", wsdlLocation = "META-INF/wsdl/fraktguide-v8.wsdl")
public class FraktguideService
    extends Service
{

    private final static URL FRAKTGUIDESERVICE_WSDL_LOCATION;
    private final static WebServiceException FRAKTGUIDESERVICE_EXCEPTION;
    private final static QName FRAKTGUIDESERVICE_QNAME = new QName("http://www.bring.no/logistics/shippingguide/1.0", "FraktguideService");

    static {
        FRAKTGUIDESERVICE_WSDL_LOCATION = no.bring.logistics.shippingguide._1.FraktguideService.class.getClassLoader().getResource("META-INF/wsdl/fraktguide-v8.wsdl");
        WebServiceException e = null;
        if (FRAKTGUIDESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/fraktguide-v8.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        FRAKTGUIDESERVICE_EXCEPTION = e;
    }

    public FraktguideService() {
        super(__getWsdlLocation(), FRAKTGUIDESERVICE_QNAME);
    }

    public FraktguideService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FRAKTGUIDESERVICE_QNAME, features);
    }

    public FraktguideService(URL wsdlLocation) {
        super(wsdlLocation, FRAKTGUIDESERVICE_QNAME);
    }

    public FraktguideService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FRAKTGUIDESERVICE_QNAME, features);
    }

    public FraktguideService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FraktguideService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Fraktguide
     */
    @WebEndpoint(name = "FraktguideSoap11")
    public Fraktguide getFraktguideSoap11() {
        return super.getPort(new QName("http://www.bring.no/logistics/shippingguide/1.0", "FraktguideSoap11"), Fraktguide.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Fraktguide
     */
    @WebEndpoint(name = "FraktguideSoap11")
    public Fraktguide getFraktguideSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.bring.no/logistics/shippingguide/1.0", "FraktguideSoap11"), Fraktguide.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FRAKTGUIDESERVICE_EXCEPTION!= null) {
            throw FRAKTGUIDESERVICE_EXCEPTION;
        }
        return FRAKTGUIDESERVICE_WSDL_LOCATION;
    }

}
