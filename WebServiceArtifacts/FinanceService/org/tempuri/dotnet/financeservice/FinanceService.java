
package org.tempuri.dotnet.financeservice;

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
@WebServiceClient(name = "FinanceService", targetNamespace = "http://tempuri.org/dotnet/FinanceService", wsdlLocation = "META-INF/wsdl/1354_Canada_FinanceService.wsdl")
public class FinanceService
    extends Service
{

    private final static URL FINANCESERVICE_WSDL_LOCATION;
    private final static WebServiceException FINANCESERVICE_EXCEPTION;
    private final static QName FINANCESERVICE_QNAME = new QName("http://tempuri.org/dotnet/FinanceService", "FinanceService");

    static {
        FINANCESERVICE_WSDL_LOCATION = org.tempuri.dotnet.financeservice.FinanceService.class.getClassLoader().getResource("META-INF/wsdl/1354_Canada_FinanceService.wsdl");
        WebServiceException e = null;
        if (FINANCESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/1354_Canada_FinanceService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        FINANCESERVICE_EXCEPTION = e;
    }

    public FinanceService() {
        super(__getWsdlLocation(), FINANCESERVICE_QNAME);
    }

    public FinanceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FINANCESERVICE_QNAME, features);
    }

    public FinanceService(URL wsdlLocation) {
        super(wsdlLocation, FINANCESERVICE_QNAME);
    }

    public FinanceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FINANCESERVICE_QNAME, features);
    }

    public FinanceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FinanceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FinanceServiceSoap
     */
    @WebEndpoint(name = "FinanceServiceSoap")
    public FinanceServiceSoap getFinanceServiceSoap() {
        return super.getPort(new QName("http://tempuri.org/dotnet/FinanceService", "FinanceServiceSoap"), FinanceServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FinanceServiceSoap
     */
    @WebEndpoint(name = "FinanceServiceSoap")
    public FinanceServiceSoap getFinanceServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/dotnet/FinanceService", "FinanceServiceSoap"), FinanceServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FINANCESERVICE_EXCEPTION!= null) {
            throw FINANCESERVICE_EXCEPTION;
        }
        return FINANCESERVICE_WSDL_LOCATION;
    }

}