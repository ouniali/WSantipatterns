
package in.gov.incometaxindiaefiling.ditws.addclientdetails.v_1_0;

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
@WebServiceClient(name = "addClientDetails", targetNamespace = "http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0", wsdlLocation = "META-INF/wsdl/addClientDetails.wsdl")
public class AddClientDetails_Service
    extends Service
{

    private final static URL ADDCLIENTDETAILS_WSDL_LOCATION;
    private final static WebServiceException ADDCLIENTDETAILS_EXCEPTION;
    private final static QName ADDCLIENTDETAILS_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0", "addClientDetails");

    static {
        ADDCLIENTDETAILS_WSDL_LOCATION = in.gov.incometaxindiaefiling.ditws.addclientdetails.v_1_0.AddClientDetails_Service.class.getClassLoader().getResource("META-INF/wsdl/addClientDetails.wsdl");
        WebServiceException e = null;
        if (ADDCLIENTDETAILS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/addClientDetails.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        ADDCLIENTDETAILS_EXCEPTION = e;
    }

    public AddClientDetails_Service() {
        super(__getWsdlLocation(), ADDCLIENTDETAILS_QNAME);
    }

    public AddClientDetails_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDCLIENTDETAILS_QNAME, features);
    }

    public AddClientDetails_Service(URL wsdlLocation) {
        super(wsdlLocation, ADDCLIENTDETAILS_QNAME);
    }

    public AddClientDetails_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDCLIENTDETAILS_QNAME, features);
    }

    public AddClientDetails_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddClientDetails_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddClientPort
     */
    @WebEndpoint(name = "addClientPortSoap11")
    public AddClientPort getAddClientPortSoap11() {
        return super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0", "addClientPortSoap11"), AddClientPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddClientPort
     */
    @WebEndpoint(name = "addClientPortSoap11")
    public AddClientPort getAddClientPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0", "addClientPortSoap11"), AddClientPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDCLIENTDETAILS_EXCEPTION!= null) {
            throw ADDCLIENTDETAILS_EXCEPTION;
        }
        return ADDCLIENTDETAILS_WSDL_LOCATION;
    }

}
