
package com.brinkster.www26.vbornhak.rechner.eurorechner;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CurrencyConvertSoap", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyConvertSoap {


    /**
     * Diese Methode rechnet die W�hrung in Euro um.<br>Es werden zwei Parameter erwartet.<br>1.  Der Wert (z.B. 1000)<BR>2.  Die W�hrungsart ("ITL" f�r italienische Lire).<br>Ist der R�ckgabewert -1, haben Sie einen falschen Typ W�hrungstyp angegeben, bei -2 haben Sie haben Sie einen faschen Zahlenwert angegeben.
     * 
     * @param wert
     * @param currency
     * @return
     *     returns double
     */
    @WebMethod(operationName = "CurrencyinEuro", action = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner/CurrencyinEuro")
    @WebResult(name = "CurrencyinEuroResult", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
    @RequestWrapper(localName = "CurrencyinEuro", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", className = "com.brinkster.www26.vbornhak.rechner.eurorechner.CurrencyinEuro")
    @ResponseWrapper(localName = "CurrencyinEuroResponse", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", className = "com.brinkster.www26.vbornhak.rechner.eurorechner.CurrencyinEuroResponse")
    public double currencyinEuro(
        @WebParam(name = "wert", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
        double wert,
        @WebParam(name = "currency", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
        String currency);

    /**
     * Diese Methode rechnet Euro in die angegebene W�hrung um.<br>Es werden zwei Parameter erwartet.<br>1.  Der Wert (z.B. 1000)<BR>2.  Die W�hrungsart ("ITL" f�r italienische Lire).<br>Ist der R�ckgabewert -1, haben Sie einen falschen Typ W�hrungstyp angegeben, bei -2 haben Sie haben Sie einen faschen Zahlenwert angegeben.
     * 
     * @param wert
     * @param currency
     * @return
     *     returns double
     */
    @WebMethod(operationName = "EuroinCurrency", action = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner/EuroinCurrency")
    @WebResult(name = "EuroinCurrencyResult", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
    @RequestWrapper(localName = "EuroinCurrency", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", className = "com.brinkster.www26.vbornhak.rechner.eurorechner.EuroinCurrency")
    @ResponseWrapper(localName = "EuroinCurrencyResponse", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner", className = "com.brinkster.www26.vbornhak.rechner.eurorechner.EuroinCurrencyResponse")
    public double euroinCurrency(
        @WebParam(name = "wert", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
        double wert,
        @WebParam(name = "currency", targetNamespace = "http://www26.brinkster.com/vbornhak/Rechner/Eurorechner")
        String currency);

}
