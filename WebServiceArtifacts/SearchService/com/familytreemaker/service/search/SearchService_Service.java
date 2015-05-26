
package com.familytreemaker.service.search;

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
@WebServiceClient(name = "SearchService", targetNamespace = "urn:service.familytreemaker.com/Search", wsdlLocation = "META-INF/wsdl/SearchService.wsdl")
public class SearchService_Service
    extends Service
{

    private final static URL SEARCHSERVICE_WSDL_LOCATION;
    private final static WebServiceException SEARCHSERVICE_EXCEPTION;
    private final static QName SEARCHSERVICE_QNAME = new QName("urn:service.familytreemaker.com/Search", "SearchService");

    static {
        SEARCHSERVICE_WSDL_LOCATION = com.familytreemaker.service.search.SearchService_Service.class.getClassLoader().getResource("META-INF/wsdl/SearchService.wsdl");
        WebServiceException e = null;
        if (SEARCHSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/SearchService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SEARCHSERVICE_EXCEPTION = e;
    }

    public SearchService_Service() {
        super(__getWsdlLocation(), SEARCHSERVICE_QNAME);
    }

    public SearchService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEARCHSERVICE_QNAME, features);
    }

    public SearchService_Service(URL wsdlLocation) {
        super(wsdlLocation, SEARCHSERVICE_QNAME);
    }

    public SearchService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEARCHSERVICE_QNAME, features);
    }

    public SearchService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SearchService
     */
    @WebEndpoint(name = "SearchService")
    public SearchService getSearchService() {
        return super.getPort(new QName("urn:service.familytreemaker.com/Search", "SearchService"), SearchService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchService
     */
    @WebEndpoint(name = "SearchService")
    public SearchService getSearchService(WebServiceFeature... features) {
        return super.getPort(new QName("urn:service.familytreemaker.com/Search", "SearchService"), SearchService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEARCHSERVICE_EXCEPTION!= null) {
            throw SEARCHSERVICE_EXCEPTION;
        }
        return SEARCHSERVICE_WSDL_LOCATION;
    }

}