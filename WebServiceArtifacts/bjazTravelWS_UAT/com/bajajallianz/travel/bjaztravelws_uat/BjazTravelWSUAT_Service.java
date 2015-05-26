
package com.bajajallianz.travel.bjaztravelws_uat;

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
@WebServiceClient(name = "bjazTravelWS_UAT", targetNamespace = "http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl", wsdlLocation = "META-INF/wsdl/bjazTravelWS_UAT.wsdl")
public class BjazTravelWSUAT_Service
    extends Service
{

    private final static URL BJAZTRAVELWSUAT_WSDL_LOCATION;
    private final static WebServiceException BJAZTRAVELWSUAT_EXCEPTION;
    private final static QName BJAZTRAVELWSUAT_QNAME = new QName("http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl", "bjazTravelWS_UAT");

    static {
        BJAZTRAVELWSUAT_WSDL_LOCATION = com.bajajallianz.travel.bjaztravelws_uat.BjazTravelWSUAT_Service.class.getClassLoader().getResource("META-INF/wsdl/bjazTravelWS_UAT.wsdl");
        WebServiceException e = null;
        if (BJAZTRAVELWSUAT_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/bjazTravelWS_UAT.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        BJAZTRAVELWSUAT_EXCEPTION = e;
    }

    public BjazTravelWSUAT_Service() {
        super(__getWsdlLocation(), BJAZTRAVELWSUAT_QNAME);
    }

    public BjazTravelWSUAT_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BJAZTRAVELWSUAT_QNAME, features);
    }

    public BjazTravelWSUAT_Service(URL wsdlLocation) {
        super(wsdlLocation, BJAZTRAVELWSUAT_QNAME);
    }

    public BjazTravelWSUAT_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BJAZTRAVELWSUAT_QNAME, features);
    }

    public BjazTravelWSUAT_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BjazTravelWSUAT_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BjazTravelWSUAT
     */
    @WebEndpoint(name = "bjazTravelWS_UATPort")
    public BjazTravelWSUAT getBjazTravelWSUATPort() {
        return super.getPort(new QName("http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl", "bjazTravelWS_UATPort"), BjazTravelWSUAT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BjazTravelWSUAT
     */
    @WebEndpoint(name = "bjazTravelWS_UATPort")
    public BjazTravelWSUAT getBjazTravelWSUATPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl", "bjazTravelWS_UATPort"), BjazTravelWSUAT.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BJAZTRAVELWSUAT_EXCEPTION!= null) {
            throw BJAZTRAVELWSUAT_EXCEPTION;
        }
        return BJAZTRAVELWSUAT_WSDL_LOCATION;
    }

}