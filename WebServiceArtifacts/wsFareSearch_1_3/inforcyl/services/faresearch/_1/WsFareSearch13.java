
package inforcyl.services.faresearch._1;

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
@WebServiceClient(name = "wsFareSearch_1_3", targetNamespace = "http://inforcyl/services/FareSearch/1.3", wsdlLocation = "META-INF/wsdl/wsFareSearch_1_3.wsdl")
public class WsFareSearch13
    extends Service
{

    private final static URL WSFARESEARCH13_WSDL_LOCATION;
    private final static WebServiceException WSFARESEARCH13_EXCEPTION;
    private final static QName WSFARESEARCH13_QNAME = new QName("http://inforcyl/services/FareSearch/1.3", "wsFareSearch_1_3");

    static {
        WSFARESEARCH13_WSDL_LOCATION = inforcyl.services.faresearch._1.WsFareSearch13 .class.getClassLoader().getResource("META-INF/wsdl/wsFareSearch_1_3.wsdl");
        WebServiceException e = null;
        if (WSFARESEARCH13_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/wsFareSearch_1_3.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        WSFARESEARCH13_EXCEPTION = e;
    }

    public WsFareSearch13() {
        super(__getWsdlLocation(), WSFARESEARCH13_QNAME);
    }

    public WsFareSearch13(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSFARESEARCH13_QNAME, features);
    }

    public WsFareSearch13(URL wsdlLocation) {
        super(wsdlLocation, WSFARESEARCH13_QNAME);
    }

    public WsFareSearch13(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSFARESEARCH13_QNAME, features);
    }

    public WsFareSearch13(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsFareSearch13(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsFareSearch13PortType
     */
    @WebEndpoint(name = "wsFareSearch_1_3HttpSoap11Endpoint")
    public WsFareSearch13PortType getWsFareSearch13HttpSoap11Endpoint() {
        return super.getPort(new QName("http://inforcyl/services/FareSearch/1.3", "wsFareSearch_1_3HttpSoap11Endpoint"), WsFareSearch13PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsFareSearch13PortType
     */
    @WebEndpoint(name = "wsFareSearch_1_3HttpSoap11Endpoint")
    public WsFareSearch13PortType getWsFareSearch13HttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://inforcyl/services/FareSearch/1.3", "wsFareSearch_1_3HttpSoap11Endpoint"), WsFareSearch13PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSFARESEARCH13_EXCEPTION!= null) {
            throw WSFARESEARCH13_EXCEPTION;
        }
        return WSFARESEARCH13_WSDL_LOCATION;
    }

}
