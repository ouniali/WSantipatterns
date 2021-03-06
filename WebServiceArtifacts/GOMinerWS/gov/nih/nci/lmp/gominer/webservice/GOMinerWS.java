
package gov.nih.nci.lmp.gominer.webservice;

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
@WebServiceClient(name = "GOMinerWS", targetNamespace = "http://webservice.gominer.lmp.nci.nih.gov", wsdlLocation = "META-INF/wsdl/GOMinerWS.wsdl")
public class GOMinerWS
    extends Service
{

    private final static URL GOMINERWS_WSDL_LOCATION;
    private final static WebServiceException GOMINERWS_EXCEPTION;
    private final static QName GOMINERWS_QNAME = new QName("http://webservice.gominer.lmp.nci.nih.gov", "GOMinerWS");

    static {
        GOMINERWS_WSDL_LOCATION = gov.nih.nci.lmp.gominer.webservice.GOMinerWS.class.getClassLoader().getResource("META-INF/wsdl/GOMinerWS.wsdl");
        WebServiceException e = null;
        if (GOMINERWS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/GOMinerWS.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GOMINERWS_EXCEPTION = e;
    }

    public GOMinerWS() {
        super(__getWsdlLocation(), GOMINERWS_QNAME);
    }

    public GOMinerWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), GOMINERWS_QNAME, features);
    }

    public GOMinerWS(URL wsdlLocation) {
        super(wsdlLocation, GOMINERWS_QNAME);
    }

    public GOMinerWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GOMINERWS_QNAME, features);
    }

    public GOMinerWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GOMinerWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GOMinerWSPortType
     */
    @WebEndpoint(name = "GOMinerWSHttpPort")
    public GOMinerWSPortType getGOMinerWSHttpPort() {
        return super.getPort(new QName("http://webservice.gominer.lmp.nci.nih.gov", "GOMinerWSHttpPort"), GOMinerWSPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GOMinerWSPortType
     */
    @WebEndpoint(name = "GOMinerWSHttpPort")
    public GOMinerWSPortType getGOMinerWSHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.gominer.lmp.nci.nih.gov", "GOMinerWSHttpPort"), GOMinerWSPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GOMINERWS_EXCEPTION!= null) {
            throw GOMINERWS_EXCEPTION;
        }
        return GOMINERWS_WSDL_LOCATION;
    }

}
