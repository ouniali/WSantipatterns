
package com.xignite.services;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Provide real-time currency foreign exchange information and calculations.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "XigniteCurrencies", targetNamespace = "http://www.xignite.com/services/", wsdlLocation = "META-INF/wsdl/XigniteCurrencies.wsdl")
public class XigniteCurrencies
    extends Service
{

    private final static URL XIGNITECURRENCIES_WSDL_LOCATION;
    private final static WebServiceException XIGNITECURRENCIES_EXCEPTION;
    private final static QName XIGNITECURRENCIES_QNAME = new QName("http://www.xignite.com/services/", "XigniteCurrencies");

    static {
        XIGNITECURRENCIES_WSDL_LOCATION = com.xignite.services.XigniteCurrencies.class.getClassLoader().getResource("META-INF/wsdl/XigniteCurrencies.wsdl");
        WebServiceException e = null;
        if (XIGNITECURRENCIES_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/XigniteCurrencies.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        XIGNITECURRENCIES_EXCEPTION = e;
    }

    public XigniteCurrencies() {
        super(__getWsdlLocation(), XIGNITECURRENCIES_QNAME);
    }

    public XigniteCurrencies(WebServiceFeature... features) {
        super(__getWsdlLocation(), XIGNITECURRENCIES_QNAME, features);
    }

    public XigniteCurrencies(URL wsdlLocation) {
        super(wsdlLocation, XIGNITECURRENCIES_QNAME);
    }

    public XigniteCurrencies(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, XIGNITECURRENCIES_QNAME, features);
    }

    public XigniteCurrencies(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public XigniteCurrencies(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns XigniteCurrenciesSoap
     */
    @WebEndpoint(name = "XigniteCurrenciesSoap")
    public XigniteCurrenciesSoap getXigniteCurrenciesSoap() {
        return super.getPort(new QName("http://www.xignite.com/services/", "XigniteCurrenciesSoap"), XigniteCurrenciesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns XigniteCurrenciesSoap
     */
    @WebEndpoint(name = "XigniteCurrenciesSoap")
    public XigniteCurrenciesSoap getXigniteCurrenciesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.xignite.com/services/", "XigniteCurrenciesSoap"), XigniteCurrenciesSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (XIGNITECURRENCIES_EXCEPTION!= null) {
            throw XIGNITECURRENCIES_EXCEPTION;
        }
        return XIGNITECURRENCIES_WSDL_LOCATION;
    }

}