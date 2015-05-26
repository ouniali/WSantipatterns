
package net.taxcloud;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * TaxCloud Web Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TaxCloud", targetNamespace = "http://taxcloud.net", wsdlLocation = "META-INF/wsdl/TaxCloud.wsdl")
public class TaxCloud
    extends Service
{

    private final static URL TAXCLOUD_WSDL_LOCATION;
    private final static WebServiceException TAXCLOUD_EXCEPTION;
    private final static QName TAXCLOUD_QNAME = new QName("http://taxcloud.net", "TaxCloud");

    static {
        TAXCLOUD_WSDL_LOCATION = net.taxcloud.TaxCloud.class.getClassLoader().getResource("META-INF/wsdl/TaxCloud.wsdl");
        WebServiceException e = null;
        if (TAXCLOUD_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/TaxCloud.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        TAXCLOUD_EXCEPTION = e;
    }

    public TaxCloud() {
        super(__getWsdlLocation(), TAXCLOUD_QNAME);
    }

    public TaxCloud(WebServiceFeature... features) {
        super(__getWsdlLocation(), TAXCLOUD_QNAME, features);
    }

    public TaxCloud(URL wsdlLocation) {
        super(wsdlLocation, TAXCLOUD_QNAME);
    }

    public TaxCloud(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TAXCLOUD_QNAME, features);
    }

    public TaxCloud(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaxCloud(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TaxCloudSoap
     */
    @WebEndpoint(name = "TaxCloudSoap")
    public TaxCloudSoap getTaxCloudSoap() {
        return super.getPort(new QName("http://taxcloud.net", "TaxCloudSoap"), TaxCloudSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaxCloudSoap
     */
    @WebEndpoint(name = "TaxCloudSoap")
    public TaxCloudSoap getTaxCloudSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://taxcloud.net", "TaxCloudSoap"), TaxCloudSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TAXCLOUD_EXCEPTION!= null) {
            throw TAXCLOUD_EXCEPTION;
        }
        return TAXCLOUD_WSDL_LOCATION;
    }

}