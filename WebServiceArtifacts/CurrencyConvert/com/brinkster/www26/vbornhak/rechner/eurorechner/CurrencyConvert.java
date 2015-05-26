
package com.brinkster.www26.vbornhak.rechner.eurorechner;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Dieser Webservice rechnet W�hrungen in Euro und zur�ck um!<br>folgende Umrechnungen sind m�glich:<br>ATS, Austria<br>BEF, Belgium<br>LUF, Luxemburg<br>FIM, Finland<br>FRF, France<br>DEM, Germany<br>IEP, Ireland<br>ITL, Italy<br>NLG, Netherlands<br>PTE, Portugal<br>ESP, Spain<br>GRD, Greece
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyConvert", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", wsdlLocation = "META-INF/wsdl/service7.ValueManipulation.wsdl")
public class CurrencyConvert
    extends Service
{

    private final static URL CURRENCYCONVERT_WSDL_LOCATION;
    private final static WebServiceException CURRENCYCONVERT_EXCEPTION;
    private final static QName CURRENCYCONVERT_QNAME = new QName("http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", "CurrencyConvert");

    static {
        CURRENCYCONVERT_WSDL_LOCATION = com.brinkster.www26.vbornhak.rechner.eurorechner.CurrencyConvert.class.getClassLoader().getResource("META-INF/wsdl/service7.ValueManipulation.wsdl");
        WebServiceException e = null;
        if (CURRENCYCONVERT_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/service7.ValueManipulation.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CURRENCYCONVERT_EXCEPTION = e;
    }

    public CurrencyConvert() {
        super(__getWsdlLocation(), CURRENCYCONVERT_QNAME);
    }

    public CurrencyConvert(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYCONVERT_QNAME, features);
    }

    public CurrencyConvert(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYCONVERT_QNAME);
    }

    public CurrencyConvert(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYCONVERT_QNAME, features);
    }

    public CurrencyConvert(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConvert(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyConvertSoap
     */
    @WebEndpoint(name = "CurrencyConvertSoap")
    public CurrencyConvertSoap getCurrencyConvertSoap() {
        return super.getPort(new QName("http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", "CurrencyConvertSoap"), CurrencyConvertSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConvertSoap
     */
    @WebEndpoint(name = "CurrencyConvertSoap")
    public CurrencyConvertSoap getCurrencyConvertSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", "CurrencyConvertSoap"), CurrencyConvertSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYCONVERT_EXCEPTION!= null) {
            throw CURRENCYCONVERT_EXCEPTION;
        }
        return CURRENCYCONVERT_WSDL_LOCATION;
    }

}