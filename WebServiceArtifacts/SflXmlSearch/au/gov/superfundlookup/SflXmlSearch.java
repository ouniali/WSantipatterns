
package au.gov.superfundlookup;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Super Fund Lookup search service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SflXmlSearch", targetNamespace = "http://superfundlookup.gov.au", wsdlLocation = "META-INF/wsdl/SflXmlSearch.wsdl")
public class SflXmlSearch
    extends Service
{

    private final static URL SFLXMLSEARCH_WSDL_LOCATION;
    private final static WebServiceException SFLXMLSEARCH_EXCEPTION;
    private final static QName SFLXMLSEARCH_QNAME = new QName("http://superfundlookup.gov.au", "SflXmlSearch");

    static {
        SFLXMLSEARCH_WSDL_LOCATION = au.gov.superfundlookup.SflXmlSearch.class.getClassLoader().getResource("META-INF/wsdl/SflXmlSearch.wsdl");
        WebServiceException e = null;
        if (SFLXMLSEARCH_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/SflXmlSearch.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SFLXMLSEARCH_EXCEPTION = e;
    }

    public SflXmlSearch() {
        super(__getWsdlLocation(), SFLXMLSEARCH_QNAME);
    }

    public SflXmlSearch(WebServiceFeature... features) {
        super(__getWsdlLocation(), SFLXMLSEARCH_QNAME, features);
    }

    public SflXmlSearch(URL wsdlLocation) {
        super(wsdlLocation, SFLXMLSEARCH_QNAME);
    }

    public SflXmlSearch(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SFLXMLSEARCH_QNAME, features);
    }

    public SflXmlSearch(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SflXmlSearch(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SflXmlSearchSoap
     */
    @WebEndpoint(name = "SflXmlSearchSoap")
    public SflXmlSearchSoap getSflXmlSearchSoap() {
        return super.getPort(new QName("http://superfundlookup.gov.au", "SflXmlSearchSoap"), SflXmlSearchSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SflXmlSearchSoap
     */
    @WebEndpoint(name = "SflXmlSearchSoap")
    public SflXmlSearchSoap getSflXmlSearchSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://superfundlookup.gov.au", "SflXmlSearchSoap"), SflXmlSearchSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SFLXMLSEARCH_EXCEPTION!= null) {
            throw SFLXMLSEARCH_EXCEPTION;
        }
        return SFLXMLSEARCH_WSDL_LOCATION;
    }

}
