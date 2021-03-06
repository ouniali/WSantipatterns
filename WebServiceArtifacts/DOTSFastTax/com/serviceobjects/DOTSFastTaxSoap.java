
package com.serviceobjects;

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
@WebService(name = "DOTSFastTaxSoap", targetNamespace = "http://www.serviceobjects.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DOTSFastTaxSoap {


    /**
     * Returns tax information for a given tax type and 5-digit zip code. Possible tax types are 'Sales' and 'Use'.
     * 
     * @param licenseKey
     * @param postalCode
     * @param taxType
     * @return
     *     returns com.serviceobjects.TaxInfo
     */
    @WebMethod(operationName = "GetTaxInfo", action = "http://www.serviceobjects.com/GetTaxInfo")
    @WebResult(name = "GetTaxInfoResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetTaxInfo", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetTaxInfo")
    @ResponseWrapper(localName = "GetTaxInfoResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetTaxInfoResponse")
    public TaxInfo getTaxInfo(
        @WebParam(name = "PostalCode", targetNamespace = "http://www.serviceobjects.com/")
        String postalCode,
        @WebParam(name = "TaxType", targetNamespace = "http://www.serviceobjects.com/")
        String taxType,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

}
