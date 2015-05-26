
package com.xignite.services;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Private service for General Electric.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "XigniteGE", targetNamespace = "http://www.xignite.com/services/", wsdlLocation = "META-INF/wsdl/XigniteGE.wsdl")
public class XigniteGE
    extends Service
{

    private final static URL XIGNITEGE_WSDL_LOCATION;
    private final static WebServiceException XIGNITEGE_EXCEPTION;
    private final static QName XIGNITEGE_QNAME = new QName("http://www.xignite.com/services/", "XigniteGE");

    static {
        XIGNITEGE_WSDL_LOCATION = com.xignite.services.XigniteGE.class.getClassLoader().getResource("META-INF/wsdl/XigniteGE.wsdl");
        WebServiceException e = null;
        if (XIGNITEGE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/XigniteGE.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        XIGNITEGE_EXCEPTION = e;
    }

    public XigniteGE() {
        super(__getWsdlLocation(), XIGNITEGE_QNAME);
    }

    public XigniteGE(WebServiceFeature... features) {
        super(__getWsdlLocation(), XIGNITEGE_QNAME, features);
    }

    public XigniteGE(URL wsdlLocation) {
        super(wsdlLocation, XIGNITEGE_QNAME);
    }

    public XigniteGE(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, XIGNITEGE_QNAME, features);
    }

    public XigniteGE(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public XigniteGE(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns XigniteGESoap
     */
    @WebEndpoint(name = "XigniteGESoap")
    public XigniteGESoap getXigniteGESoap() {
        return super.getPort(new QName("http://www.xignite.com/services/", "XigniteGESoap"), XigniteGESoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns XigniteGESoap
     */
    @WebEndpoint(name = "XigniteGESoap")
    public XigniteGESoap getXigniteGESoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.xignite.com/services/", "XigniteGESoap"), XigniteGESoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (XIGNITEGE_EXCEPTION!= null) {
            throw XIGNITEGE_EXCEPTION;
        }
        return XIGNITEGE_WSDL_LOCATION;
    }

}