
package org.diacomp.webservices;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A Web Service that exposes methods of the Publication Manager class of the DiaComp Object Model
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PublicationWebService", targetNamespace = "http://www.diacomp.org/webservices/", wsdlLocation = "META-INF/wsdl/PublicationWebService.wsdl")
public class PublicationWebService
    extends Service
{

    private final static URL PUBLICATIONWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException PUBLICATIONWEBSERVICE_EXCEPTION;
    private final static QName PUBLICATIONWEBSERVICE_QNAME = new QName("http://www.diacomp.org/webservices/", "PublicationWebService");

    static {
        PUBLICATIONWEBSERVICE_WSDL_LOCATION = org.diacomp.webservices.PublicationWebService.class.getClassLoader().getResource("META-INF/wsdl/PublicationWebService.wsdl");
        WebServiceException e = null;
        if (PUBLICATIONWEBSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/PublicationWebService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PUBLICATIONWEBSERVICE_EXCEPTION = e;
    }

    public PublicationWebService() {
        super(__getWsdlLocation(), PUBLICATIONWEBSERVICE_QNAME);
    }

    public PublicationWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PUBLICATIONWEBSERVICE_QNAME, features);
    }

    public PublicationWebService(URL wsdlLocation) {
        super(wsdlLocation, PUBLICATIONWEBSERVICE_QNAME);
    }

    public PublicationWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PUBLICATIONWEBSERVICE_QNAME, features);
    }

    public PublicationWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublicationWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PublicationWebServiceSoap
     */
    @WebEndpoint(name = "PublicationWebServiceSoap")
    public PublicationWebServiceSoap getPublicationWebServiceSoap() {
        return super.getPort(new QName("http://www.diacomp.org/webservices/", "PublicationWebServiceSoap"), PublicationWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublicationWebServiceSoap
     */
    @WebEndpoint(name = "PublicationWebServiceSoap")
    public PublicationWebServiceSoap getPublicationWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.diacomp.org/webservices/", "PublicationWebServiceSoap"), PublicationWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUBLICATIONWEBSERVICE_EXCEPTION!= null) {
            throw PUBLICATIONWEBSERVICE_EXCEPTION;
        }
        return PUBLICATIONWEBSERVICE_WSDL_LOCATION;
    }

}
