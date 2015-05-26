
package com.serviceobjects;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * For more information on our web services, visit us at <a href='http://www.serviceobjects.com/products/default.asp' target='new'>our website</a><br/><br/><a href='http://www.serviceobjects.com' target='new'><img src='http://www.serviceobjects.com/images/so_logo_2_inside.gif' border='0'/></a>
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DOTSFastTax", targetNamespace = "http://www.serviceobjects.com/", wsdlLocation = "META-INF/wsdl/service76.wsdl")
public class DOTSFastTax
    extends Service
{

    private final static URL DOTSFASTTAX_WSDL_LOCATION;
    private final static WebServiceException DOTSFASTTAX_EXCEPTION;
    private final static QName DOTSFASTTAX_QNAME = new QName("http://www.serviceobjects.com/", "DOTSFastTax");

    static {
        DOTSFASTTAX_WSDL_LOCATION = com.serviceobjects.DOTSFastTax.class.getClassLoader().getResource("META-INF/wsdl/service76.wsdl");
        WebServiceException e = null;
        if (DOTSFASTTAX_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/service76.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        DOTSFASTTAX_EXCEPTION = e;
    }

    public DOTSFastTax() {
        super(__getWsdlLocation(), DOTSFASTTAX_QNAME);
    }

    public DOTSFastTax(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOTSFASTTAX_QNAME, features);
    }

    public DOTSFastTax(URL wsdlLocation) {
        super(wsdlLocation, DOTSFASTTAX_QNAME);
    }

    public DOTSFastTax(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOTSFASTTAX_QNAME, features);
    }

    public DOTSFastTax(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DOTSFastTax(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DOTSFastTaxSoap
     */
    @WebEndpoint(name = "DOTSFastTaxSoap")
    public DOTSFastTaxSoap getDOTSFastTaxSoap() {
        return super.getPort(new QName("http://www.serviceobjects.com/", "DOTSFastTaxSoap"), DOTSFastTaxSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DOTSFastTaxSoap
     */
    @WebEndpoint(name = "DOTSFastTaxSoap")
    public DOTSFastTaxSoap getDOTSFastTaxSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.serviceobjects.com/", "DOTSFastTaxSoap"), DOTSFastTaxSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOTSFASTTAX_EXCEPTION!= null) {
            throw DOTSFASTTAX_EXCEPTION;
        }
        return DOTSFASTTAX_WSDL_LOCATION;
    }

}
