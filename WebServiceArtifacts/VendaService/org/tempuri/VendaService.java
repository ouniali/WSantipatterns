
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
@WebServiceClient(name = "VendaService", targetNamespace = "http://tempuri.org/", wsdlLocation = "META-INF/wsdl/VendaService.wsdl")
public class VendaService
    extends Service
{

    private final static URL VENDASERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDASERVICE_EXCEPTION;
    private final static QName VENDASERVICE_QNAME = new QName("http://tempuri.org/", "VendaService");

    static {
        VENDASERVICE_WSDL_LOCATION = org.tempuri.VendaService.class.getClassLoader().getResource("META-INF/wsdl/VendaService.wsdl");
        WebServiceException e = null;
        if (VENDASERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/VendaService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        VENDASERVICE_EXCEPTION = e;
    }

    public VendaService() {
        super(__getWsdlLocation(), VENDASERVICE_QNAME);
    }

    public VendaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDASERVICE_QNAME, features);
    }

    public VendaService(URL wsdlLocation) {
        super(wsdlLocation, VENDASERVICE_QNAME);
    }

    public VendaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDASERVICE_QNAME, features);
    }

    public VendaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IVenda
     */
    @WebEndpoint(name = "BasicHttpBinding_IVenda")
    public IVenda getBasicHttpBindingIVenda() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IVenda"), IVenda.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IVenda
     */
    @WebEndpoint(name = "BasicHttpBinding_IVenda")
    public IVenda getBasicHttpBindingIVenda(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IVenda"), IVenda.class, features);
    }

    /**
     * 
     * @return
     *     returns IVenda
     */
    @WebEndpoint(name = "BasicHttpsBinding_IVenda")
    public IVenda getBasicHttpsBindingIVenda() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_IVenda"), IVenda.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IVenda
     */
    @WebEndpoint(name = "BasicHttpsBinding_IVenda")
    public IVenda getBasicHttpsBindingIVenda(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_IVenda"), IVenda.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDASERVICE_EXCEPTION!= null) {
            throw VENDASERVICE_EXCEPTION;
        }
        return VENDASERVICE_WSDL_LOCATION;
    }

}
