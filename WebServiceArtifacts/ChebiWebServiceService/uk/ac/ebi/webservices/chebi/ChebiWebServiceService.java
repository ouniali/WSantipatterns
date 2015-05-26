
package uk.ac.ebi.webservices.chebi;

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
@WebServiceClient(name = "ChebiWebServiceService", targetNamespace = "http://www.ebi.ac.uk/webservices/chebi", wsdlLocation = "META-INF/wsdl/ChebiWebServiceService.wsdl")
public class ChebiWebServiceService
    extends Service
{

    private final static URL CHEBIWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CHEBIWEBSERVICESERVICE_EXCEPTION;
    private final static QName CHEBIWEBSERVICESERVICE_QNAME = new QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceService");

    static {
        CHEBIWEBSERVICESERVICE_WSDL_LOCATION = uk.ac.ebi.webservices.chebi.ChebiWebServiceService.class.getClassLoader().getResource("META-INF/wsdl/ChebiWebServiceService.wsdl");
        WebServiceException e = null;
        if (CHEBIWEBSERVICESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/ChebiWebServiceService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CHEBIWEBSERVICESERVICE_EXCEPTION = e;
    }

    public ChebiWebServiceService() {
        super(__getWsdlLocation(), CHEBIWEBSERVICESERVICE_QNAME);
    }

    public ChebiWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHEBIWEBSERVICESERVICE_QNAME, features);
    }

    public ChebiWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, CHEBIWEBSERVICESERVICE_QNAME);
    }

    public ChebiWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHEBIWEBSERVICESERVICE_QNAME, features);
    }

    public ChebiWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChebiWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChebiWebServicePortType
     */
    @WebEndpoint(name = "ChebiWebServicePort")
    public ChebiWebServicePortType getChebiWebServicePort() {
        return super.getPort(new QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServicePort"), ChebiWebServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChebiWebServicePortType
     */
    @WebEndpoint(name = "ChebiWebServicePort")
    public ChebiWebServicePortType getChebiWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServicePort"), ChebiWebServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHEBIWEBSERVICESERVICE_EXCEPTION!= null) {
            throw CHEBIWEBSERVICESERVICE_EXCEPTION;
        }
        return CHEBIWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
