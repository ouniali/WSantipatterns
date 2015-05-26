
package com.vodafone.gdsp.ws;

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
@WebServiceClient(name = "GetTransactionListService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class GetTransactionListService
    extends Service
{

    private final static URL GETTRANSACTIONLISTSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETTRANSACTIONLISTSERVICE_EXCEPTION;
    private final static QName GETTRANSACTIONLISTSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "GetTransactionListService");

    static {
        GETTRANSACTIONLISTSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.GetTransactionListService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (GETTRANSACTIONLISTSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETTRANSACTIONLISTSERVICE_EXCEPTION = e;
    }

    public GetTransactionListService() {
        super(__getWsdlLocation(), GETTRANSACTIONLISTSERVICE_QNAME);
    }

    public GetTransactionListService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETTRANSACTIONLISTSERVICE_QNAME, features);
    }

    public GetTransactionListService(URL wsdlLocation) {
        super(wsdlLocation, GETTRANSACTIONLISTSERVICE_QNAME);
    }

    public GetTransactionListService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETTRANSACTIONLISTSERVICE_QNAME, features);
    }

    public GetTransactionListService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetTransactionListService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetTransactionList
     */
    @WebEndpoint(name = "GetTransactionListPort")
    public GetTransactionList getGetTransactionListPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetTransactionListPort"), GetTransactionList.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetTransactionList
     */
    @WebEndpoint(name = "GetTransactionListPort")
    public GetTransactionList getGetTransactionListPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "GetTransactionListPort"), GetTransactionList.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETTRANSACTIONLISTSERVICE_EXCEPTION!= null) {
            throw GETTRANSACTIONLISTSERVICE_EXCEPTION;
        }
        return GETTRANSACTIONLISTSERVICE_WSDL_LOCATION;
    }

}
