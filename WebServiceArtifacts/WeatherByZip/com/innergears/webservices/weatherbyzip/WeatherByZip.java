
package com.innergears.webservices.weatherbyzip;

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
@WebServiceClient(name = "WeatherByZip", targetNamespace = "http://innergears.com/WebServices/WeatherByZip", wsdlLocation = "META-INF/wsdl/service50.Utility.wsdl")
public class WeatherByZip
    extends Service
{

    private final static URL WEATHERBYZIP_WSDL_LOCATION;
    private final static WebServiceException WEATHERBYZIP_EXCEPTION;
    private final static QName WEATHERBYZIP_QNAME = new QName("http://innergears.com/WebServices/WeatherByZip", "WeatherByZip");

    static {
        WEATHERBYZIP_WSDL_LOCATION = com.innergears.webservices.weatherbyzip.WeatherByZip.class.getClassLoader().getResource("META-INF/wsdl/service50.Utility.wsdl");
        WebServiceException e = null;
        if (WEATHERBYZIP_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/service50.Utility.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        WEATHERBYZIP_EXCEPTION = e;
    }

    public WeatherByZip() {
        super(__getWsdlLocation(), WEATHERBYZIP_QNAME);
    }

    public WeatherByZip(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERBYZIP_QNAME, features);
    }

    public WeatherByZip(URL wsdlLocation) {
        super(wsdlLocation, WEATHERBYZIP_QNAME);
    }

    public WeatherByZip(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERBYZIP_QNAME, features);
    }

    public WeatherByZip(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherByZip(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherByZipSoap
     */
    @WebEndpoint(name = "WeatherByZipSoap")
    public WeatherByZipSoap getWeatherByZipSoap() {
        return super.getPort(new QName("http://innergears.com/WebServices/WeatherByZip", "WeatherByZipSoap"), WeatherByZipSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherByZipSoap
     */
    @WebEndpoint(name = "WeatherByZipSoap")
    public WeatherByZipSoap getWeatherByZipSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://innergears.com/WebServices/WeatherByZip", "WeatherByZipSoap"), WeatherByZipSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERBYZIP_EXCEPTION!= null) {
            throw WEATHERBYZIP_EXCEPTION;
        }
        return WEATHERBYZIP_WSDL_LOCATION;
    }

}