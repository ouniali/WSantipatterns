
package com.unisys.webservices;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This Web Service gets the weather forecast.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherServices", targetNamespace = "http://www.unisys.com/WebServices/", wsdlLocation = "META-INF/wsdl/service47.Utility.wsdl")
public class WeatherServices
    extends Service
{

    private final static URL WEATHERSERVICES_WSDL_LOCATION;
    private final static WebServiceException WEATHERSERVICES_EXCEPTION;
    private final static QName WEATHERSERVICES_QNAME = new QName("http://www.unisys.com/WebServices/", "WeatherServices");

    static {
        WEATHERSERVICES_WSDL_LOCATION = com.unisys.webservices.WeatherServices.class.getClassLoader().getResource("META-INF/wsdl/service47.Utility.wsdl");
        WebServiceException e = null;
        if (WEATHERSERVICES_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/service47.Utility.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        WEATHERSERVICES_EXCEPTION = e;
    }

    public WeatherServices() {
        super(__getWsdlLocation(), WEATHERSERVICES_QNAME);
    }

    public WeatherServices(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERSERVICES_QNAME, features);
    }

    public WeatherServices(URL wsdlLocation) {
        super(wsdlLocation, WEATHERSERVICES_QNAME);
    }

    public WeatherServices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERSERVICES_QNAME, features);
    }

    public WeatherServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherServices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherServicesSoap
     */
    @WebEndpoint(name = "WeatherServicesSoap")
    public WeatherServicesSoap getWeatherServicesSoap() {
        return super.getPort(new QName("http://www.unisys.com/WebServices/", "WeatherServicesSoap"), WeatherServicesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherServicesSoap
     */
    @WebEndpoint(name = "WeatherServicesSoap")
    public WeatherServicesSoap getWeatherServicesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.unisys.com/WebServices/", "WeatherServicesSoap"), WeatherServicesSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERSERVICES_EXCEPTION!= null) {
            throw WEATHERSERVICES_EXCEPTION;
        }
        return WEATHERSERVICES_WSDL_LOCATION;
    }

}
