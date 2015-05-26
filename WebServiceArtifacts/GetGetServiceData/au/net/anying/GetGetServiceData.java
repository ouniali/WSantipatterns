
package au.net.anying;

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
@WebServiceClient(name = "GetGetServiceData", targetNamespace = "http://www.anying.net.au", wsdlLocation = "META-INF/wsdl/16021_United_States_getrates.wsdl")
public class GetGetServiceData
    extends Service
{

    private final static URL GETGETSERVICEDATA_WSDL_LOCATION;
    private final static WebServiceException GETGETSERVICEDATA_EXCEPTION;
    private final static QName GETGETSERVICEDATA_QNAME = new QName("http://www.anying.net.au", "GetGetServiceData");

    static {
        GETGETSERVICEDATA_WSDL_LOCATION = au.net.anying.GetGetServiceData.class.getClassLoader().getResource("META-INF/wsdl/16021_United_States_getrates.wsdl");
        WebServiceException e = null;
        if (GETGETSERVICEDATA_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/16021_United_States_getrates.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETGETSERVICEDATA_EXCEPTION = e;
    }

    public GetGetServiceData() {
        super(__getWsdlLocation(), GETGETSERVICEDATA_QNAME);
    }

    public GetGetServiceData(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETGETSERVICEDATA_QNAME, features);
    }

    public GetGetServiceData(URL wsdlLocation) {
        super(wsdlLocation, GETGETSERVICEDATA_QNAME);
    }

    public GetGetServiceData(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETGETSERVICEDATA_QNAME, features);
    }

    public GetGetServiceData(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetGetServiceData(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetGetServiceDataSoap
     */
    @WebEndpoint(name = "GetGetServiceDataSoap")
    public GetGetServiceDataSoap getGetGetServiceDataSoap() {
        return super.getPort(new QName("http://www.anying.net.au", "GetGetServiceDataSoap"), GetGetServiceDataSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetGetServiceDataSoap
     */
    @WebEndpoint(name = "GetGetServiceDataSoap")
    public GetGetServiceDataSoap getGetGetServiceDataSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.anying.net.au", "GetGetServiceDataSoap"), GetGetServiceDataSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETGETSERVICEDATA_EXCEPTION!= null) {
            throw GETGETSERVICEDATA_EXCEPTION;
        }
        return GETGETSERVICEDATA_WSDL_LOCATION;
    }

}
