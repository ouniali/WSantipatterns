
package defaultnamespace;

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
@WebServiceClient(name = "latex", targetNamespace = "http://DefaultNamespace", wsdlLocation = "META-INF/wsdl/latex.wsdl")
public class Latex_Service
    extends Service
{

    private final static URL LATEX_WSDL_LOCATION;
    private final static WebServiceException LATEX_EXCEPTION;
    private final static QName LATEX_QNAME = new QName("http://DefaultNamespace", "latex");

    static {
        LATEX_WSDL_LOCATION = defaultnamespace.Latex_Service.class.getClassLoader().getResource("META-INF/wsdl/latex.wsdl");
        WebServiceException e = null;
        if (LATEX_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/latex.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        LATEX_EXCEPTION = e;
    }

    public Latex_Service() {
        super(__getWsdlLocation(), LATEX_QNAME);
    }

    public Latex_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LATEX_QNAME, features);
    }

    public Latex_Service(URL wsdlLocation) {
        super(wsdlLocation, LATEX_QNAME);
    }

    public Latex_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LATEX_QNAME, features);
    }

    public Latex_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Latex_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Latex
     */
    @WebEndpoint(name = "latexHttpPort")
    public Latex getLatexHttpPort() {
        return super.getPort(new QName("http://DefaultNamespace", "latexHttpPort"), Latex.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Latex
     */
    @WebEndpoint(name = "latexHttpPort")
    public Latex getLatexHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://DefaultNamespace", "latexHttpPort"), Latex.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LATEX_EXCEPTION!= null) {
            throw LATEX_EXCEPTION;
        }
        return LATEX_WSDL_LOCATION;
    }

}