
package travel.caval._20091127.hotelbooking;

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
@WebServiceClient(name = "HotelBookingService", targetNamespace = "http://caval.travel/20091127/hotelBooking", wsdlLocation = "META-INF/wsdl/HotelBookingService.wsdl")
public class HotelBookingService_Service
    extends Service
{

    private final static URL HOTELBOOKINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELBOOKINGSERVICE_EXCEPTION;
    private final static QName HOTELBOOKINGSERVICE_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "HotelBookingService");

    static {
        HOTELBOOKINGSERVICE_WSDL_LOCATION = travel.caval._20091127.hotelbooking.HotelBookingService_Service.class.getClassLoader().getResource("META-INF/wsdl/HotelBookingService.wsdl");
        WebServiceException e = null;
        if (HOTELBOOKINGSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/HotelBookingService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        HOTELBOOKINGSERVICE_EXCEPTION = e;
    }

    public HotelBookingService_Service() {
        super(__getWsdlLocation(), HOTELBOOKINGSERVICE_QNAME);
    }

    public HotelBookingService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELBOOKINGSERVICE_QNAME, features);
    }

    public HotelBookingService_Service(URL wsdlLocation) {
        super(wsdlLocation, HOTELBOOKINGSERVICE_QNAME);
    }

    public HotelBookingService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELBOOKINGSERVICE_QNAME, features);
    }

    public HotelBookingService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelBookingService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HotelBookingService
     */
    @WebEndpoint(name = "HotelBookingServicePort")
    public HotelBookingService getHotelBookingServicePort() {
        return super.getPort(new QName("http://caval.travel/20091127/hotelBooking", "HotelBookingServicePort"), HotelBookingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelBookingService
     */
    @WebEndpoint(name = "HotelBookingServicePort")
    public HotelBookingService getHotelBookingServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://caval.travel/20091127/hotelBooking", "HotelBookingServicePort"), HotelBookingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELBOOKINGSERVICE_EXCEPTION!= null) {
            throw HOTELBOOKINGSERVICE_EXCEPTION;
        }
        return HOTELBOOKINGSERVICE_WSDL_LOCATION;
    }

}
