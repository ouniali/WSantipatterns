
package org.tempuri;

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
@WebServiceClient(name = "ServiceMainSearch", targetNamespace = "http://tempuri.org/", wsdlLocation = "META-INF/wsdl/ServiceMainSearch.wsdl")
public class ServiceMainSearch
    extends Service
{

    private final static URL SERVICEMAINSEARCH_WSDL_LOCATION;
    private final static WebServiceException SERVICEMAINSEARCH_EXCEPTION;
    private final static QName SERVICEMAINSEARCH_QNAME = new QName("http://tempuri.org/", "ServiceMainSearch");

    static {
        SERVICEMAINSEARCH_WSDL_LOCATION = org.tempuri.ServiceMainSearch.class.getClassLoader().getResource("META-INF/wsdl/ServiceMainSearch.wsdl");
        WebServiceException e = null;
        if (SERVICEMAINSEARCH_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/ServiceMainSearch.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SERVICEMAINSEARCH_EXCEPTION = e;
    }

    public ServiceMainSearch() {
        super(__getWsdlLocation(), SERVICEMAINSEARCH_QNAME);
    }

    public ServiceMainSearch(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEMAINSEARCH_QNAME, features);
    }

    public ServiceMainSearch(URL wsdlLocation) {
        super(wsdlLocation, SERVICEMAINSEARCH_QNAME);
    }

    public ServiceMainSearch(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEMAINSEARCH_QNAME, features);
    }

    public ServiceMainSearch(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceMainSearch(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IServiceMainSearch
     */
    @WebEndpoint(name = "BasicHttpBinding_IServiceMainSearch")
    public IServiceMainSearch getBasicHttpBindingIServiceMainSearch() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IServiceMainSearch"), IServiceMainSearch.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceMainSearch
     */
    @WebEndpoint(name = "BasicHttpBinding_IServiceMainSearch")
    public IServiceMainSearch getBasicHttpBindingIServiceMainSearch(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IServiceMainSearch"), IServiceMainSearch.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEMAINSEARCH_EXCEPTION!= null) {
            throw SERVICEMAINSEARCH_EXCEPTION;
        }
        return SERVICEMAINSEARCH_WSDL_LOCATION;
    }

}
