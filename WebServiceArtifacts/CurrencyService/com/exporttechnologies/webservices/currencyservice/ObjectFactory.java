
package com.exporttechnologies.webservices.currencyservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exporttechnologies.webservices.currencyservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exporttechnologies.webservices.currencyservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateExchangeRateResponse }
     * 
     */
    public UpdateExchangeRateResponse createUpdateExchangeRateResponse() {
        return new UpdateExchangeRateResponse();
    }

    /**
     * Create an instance of {@link GetExchangeRate }
     * 
     */
    public GetExchangeRate createGetExchangeRate() {
        return new GetExchangeRate();
    }

    /**
     * Create an instance of {@link GetExchangeRateResponse }
     * 
     */
    public GetExchangeRateResponse createGetExchangeRateResponse() {
        return new GetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link UpdateExchangeRate }
     * 
     */
    public UpdateExchangeRate createUpdateExchangeRate() {
        return new UpdateExchangeRate();
    }

}
