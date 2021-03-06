
package com.oracle.xmlns.enterprise.hcm.services.ci_ci_personal_data;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CI for PERSONAL_DATA
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CI_CI_PERSONAL_DATA", targetNamespace = "http://xmlns.oracle.com/Enterprise/HCM/services/CI_CI_PERSONAL_DATA.1", wsdlLocation = "META-INF/wsdl/CI_CI_PERSONAL_DATA.1.wsdl")
public class CICIPERSONALDATA
    extends Service
{

    private final static URL CICIPERSONALDATA_WSDL_LOCATION;
    private final static WebServiceException CICIPERSONALDATA_EXCEPTION;
    private final static QName CICIPERSONALDATA_QNAME = new QName("http://xmlns.oracle.com/Enterprise/HCM/services/CI_CI_PERSONAL_DATA.1", "CI_CI_PERSONAL_DATA");

    static {
        CICIPERSONALDATA_WSDL_LOCATION = com.oracle.xmlns.enterprise.hcm.services.ci_ci_personal_data.CICIPERSONALDATA.class.getClassLoader().getResource("META-INF/wsdl/CI_CI_PERSONAL_DATA.1.wsdl");
        WebServiceException e = null;
        if (CICIPERSONALDATA_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/CI_CI_PERSONAL_DATA.1.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CICIPERSONALDATA_EXCEPTION = e;
    }

    public CICIPERSONALDATA() {
        super(__getWsdlLocation(), CICIPERSONALDATA_QNAME);
    }

    public CICIPERSONALDATA(WebServiceFeature... features) {
        super(__getWsdlLocation(), CICIPERSONALDATA_QNAME, features);
    }

    public CICIPERSONALDATA(URL wsdlLocation) {
        super(wsdlLocation, CICIPERSONALDATA_QNAME);
    }

    public CICIPERSONALDATA(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CICIPERSONALDATA_QNAME, features);
    }

    public CICIPERSONALDATA(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CICIPERSONALDATA(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CICIPERSONALDATAPortType
     */
    @WebEndpoint(name = "CI_CI_PERSONAL_DATA_Port")
    public CICIPERSONALDATAPortType getCICIPERSONALDATAPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/Enterprise/HCM/services/CI_CI_PERSONAL_DATA.1", "CI_CI_PERSONAL_DATA_Port"), CICIPERSONALDATAPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CICIPERSONALDATAPortType
     */
    @WebEndpoint(name = "CI_CI_PERSONAL_DATA_Port")
    public CICIPERSONALDATAPortType getCICIPERSONALDATAPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/Enterprise/HCM/services/CI_CI_PERSONAL_DATA.1", "CI_CI_PERSONAL_DATA_Port"), CICIPERSONALDATAPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CICIPERSONALDATA_EXCEPTION!= null) {
            throw CICIPERSONALDATA_EXCEPTION;
        }
        return CICIPERSONALDATA_WSDL_LOCATION;
    }

}
