
package org.opentravel.ota._2003._05;

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
@WebServiceClient(name = "OTA_HotelRes", targetNamespace = "http://www.opentravel.org/OTA/2003/05", wsdlLocation = "META-INF/wsdl/OTA_HotelRes.wsdl")
public class OTAHotelRes
    extends Service
{

    private final static URL OTAHOTELRES_WSDL_LOCATION;
    private final static WebServiceException OTAHOTELRES_EXCEPTION;
    private final static QName OTAHOTELRES_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelRes");

    static {
        OTAHOTELRES_WSDL_LOCATION = org.opentravel.ota._2003._05.OTAHotelRes.class.getClassLoader().getResource("META-INF/wsdl/OTA_HotelRes.wsdl");
        WebServiceException e = null;
        if (OTAHOTELRES_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/OTA_HotelRes.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        OTAHOTELRES_EXCEPTION = e;
    }

    public OTAHotelRes() {
        super(__getWsdlLocation(), OTAHOTELRES_QNAME);
    }

    public OTAHotelRes(WebServiceFeature... features) {
        super(__getWsdlLocation(), OTAHOTELRES_QNAME, features);
    }

    public OTAHotelRes(URL wsdlLocation) {
        super(wsdlLocation, OTAHOTELRES_QNAME);
    }

    public OTAHotelRes(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OTAHOTELRES_QNAME, features);
    }

    public OTAHotelRes(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OTAHotelRes(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OTAHotelResSoap
     */
    @WebEndpoint(name = "OTA_HotelResSoap")
    public OTAHotelResSoap getOTAHotelResSoap() {
        return super.getPort(new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResSoap"), OTAHotelResSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OTAHotelResSoap
     */
    @WebEndpoint(name = "OTA_HotelResSoap")
    public OTAHotelResSoap getOTAHotelResSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResSoap"), OTAHotelResSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OTAHOTELRES_EXCEPTION!= null) {
            throw OTAHOTELRES_EXCEPTION;
        }
        return OTAHOTELRES_WSDL_LOCATION;
    }

}
