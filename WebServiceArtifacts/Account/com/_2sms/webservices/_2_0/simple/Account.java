
package com._2sms.webservices._2_0.simple;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This web service provides methods that allow you to open, manage and report upon accounts and their sub-accounts
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Account", targetNamespace = "http://www.2sms.com/WebServices/2.0/Simple/", wsdlLocation = "META-INF/wsdl/14118_United_States_Account.wsdl")
public class Account
    extends Service
{

    private final static URL ACCOUNT_WSDL_LOCATION;
    private final static WebServiceException ACCOUNT_EXCEPTION;
    private final static QName ACCOUNT_QNAME = new QName("http://www.2sms.com/WebServices/2.0/Simple/", "Account");

    static {
        ACCOUNT_WSDL_LOCATION = com._2sms.webservices._2_0.simple.Account.class.getClassLoader().getResource("META-INF/wsdl/14118_United_States_Account.wsdl");
        WebServiceException e = null;
        if (ACCOUNT_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/14118_United_States_Account.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        ACCOUNT_EXCEPTION = e;
    }

    public Account() {
        super(__getWsdlLocation(), ACCOUNT_QNAME);
    }

    public Account(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNT_QNAME, features);
    }

    public Account(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNT_QNAME);
    }

    public Account(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNT_QNAME, features);
    }

    public Account(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Account(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccountSoap
     */
    @WebEndpoint(name = "AccountSoap")
    public AccountSoap getAccountSoap() {
        return super.getPort(new QName("http://www.2sms.com/WebServices/2.0/Simple/", "AccountSoap"), AccountSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountSoap
     */
    @WebEndpoint(name = "AccountSoap")
    public AccountSoap getAccountSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.2sms.com/WebServices/2.0/Simple/", "AccountSoap"), AccountSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNT_EXCEPTION!= null) {
            throw ACCOUNT_EXCEPTION;
        }
        return ACCOUNT_WSDL_LOCATION;
    }

}
