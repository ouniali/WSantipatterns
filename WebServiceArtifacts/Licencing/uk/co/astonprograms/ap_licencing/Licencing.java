
package uk.co.astonprograms.ap_licencing;

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
@WebServiceClient(name = "Licencing", targetNamespace = "http://www.astonprograms.co.uk/AP_Licencing", wsdlLocation = "META-INF/wsdl/10088_United_Kingdom_Licencing.wsdl")
public class Licencing
    extends Service
{

    private final static URL LICENCING_WSDL_LOCATION;
    private final static WebServiceException LICENCING_EXCEPTION;
    private final static QName LICENCING_QNAME = new QName("http://www.astonprograms.co.uk/AP_Licencing", "Licencing");

    static {
        LICENCING_WSDL_LOCATION = uk.co.astonprograms.ap_licencing.Licencing.class.getClassLoader().getResource("META-INF/wsdl/10088_United_Kingdom_Licencing.wsdl");
        WebServiceException e = null;
        if (LICENCING_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/10088_United_Kingdom_Licencing.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        LICENCING_EXCEPTION = e;
    }

    public Licencing() {
        super(__getWsdlLocation(), LICENCING_QNAME);
    }

    public Licencing(WebServiceFeature... features) {
        super(__getWsdlLocation(), LICENCING_QNAME, features);
    }

    public Licencing(URL wsdlLocation) {
        super(wsdlLocation, LICENCING_QNAME);
    }

    public Licencing(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LICENCING_QNAME, features);
    }

    public Licencing(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Licencing(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LicencingSoap
     */
    @WebEndpoint(name = "LicencingSoap")
    public LicencingSoap getLicencingSoap() {
        return super.getPort(new QName("http://www.astonprograms.co.uk/AP_Licencing", "LicencingSoap"), LicencingSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LicencingSoap
     */
    @WebEndpoint(name = "LicencingSoap")
    public LicencingSoap getLicencingSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.astonprograms.co.uk/AP_Licencing", "LicencingSoap"), LicencingSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LICENCING_EXCEPTION!= null) {
            throw LICENCING_EXCEPTION;
        }
        return LICENCING_WSDL_LOCATION;
    }

}