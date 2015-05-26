
package jp.co.est.btonic.zipcode;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchEngineSoap", targetNamespace = "http://btonic.est.co.jp/zipcode/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchEngineSoap {


    /**
     * \u4f4f\u6240\u3092\u90e8\u5206\u4e00\u81f4\u3067\u691c\u7d22\u3057\u8a73\u7d30\u3092\u8fd4\u3057\u307e\u3059\u3002(1\u6587\u5b57\u4ee5\u4e0a\u3092\u6307\u5b9a\u3057\u3066\u304f\u3060\u3055\u3044)
     * 
     * @param searchResult
     * @param address
     * @param fromAddressResult
     */
    @WebMethod(operationName = "FromAddress", action = "http://btonic.est.co.jp/zipcode/FromAddress")
    @RequestWrapper(localName = "FromAddress", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromAddress")
    @ResponseWrapper(localName = "FromAddressResponse", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromAddressResponse")
    public void fromAddress(
        @WebParam(name = "Address", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String address,
        @WebParam(name = "FromAddressResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<Boolean> fromAddressResult,
        @WebParam(name = "SearchResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<FindList> searchResult);

    /**
     * \u4f4f\u6240\u3092\u90e8\u5206\u4e00\u81f4\u3067\u691c\u7d22\u3057\u8a73\u7d30\u3092\u8fd4\u3057\u307e\u3059\u3002(1\u6587\u5b57\u4ee5\u4e0a\u3092\u6307\u5b9a\u3057\u3066\u304f\u3060\u3055\u3044)
     * 
     * @param address
     * @return
     *     returns jp.co.est.btonic.zipcode.FindList
     */
    @WebMethod(operationName = "FromAddress2", action = "http://btonic.est.co.jp/zipcode/FromAddress2")
    @WebResult(name = "FromAddress2Result", targetNamespace = "http://btonic.est.co.jp/zipcode/")
    @RequestWrapper(localName = "FromAddress2", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromAddress2")
    @ResponseWrapper(localName = "FromAddress2Response", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromAddress2Response")
    public FindList fromAddress2(
        @WebParam(name = "Address", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String address);

    /**
     * \u4f4f\u6240\u3092\u90e8\u5206\u4e00\u81f4\u3067\u691c\u7d22\u3057\u8a73\u7d30\u3092\u8fd4\u3057\u307e\u3059\u3002(\u62e1\u5f35\u7248)
     * 
     * @param searchResult
     * @param matchAddressWord
     * @param address
     * @param fromAddressDecrementalResult
     */
    @WebMethod(operationName = "FromAddressDecremental", action = "http://btonic.est.co.jp/zipcode/FromAddressDecremental")
    @RequestWrapper(localName = "FromAddressDecremental", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromAddressDecremental")
    @ResponseWrapper(localName = "FromAddressDecrementalResponse", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromAddressDecrementalResponse")
    public void fromAddressDecremental(
        @WebParam(name = "Address", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String address,
        @WebParam(name = "FromAddressDecrementalResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<Boolean> fromAddressDecrementalResult,
        @WebParam(name = "SearchResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<FindList> searchResult,
        @WebParam(name = "MatchAddressWord", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<String> matchAddressWord);

    /**
     * \u90f5\u4fbf\u756a\u53f7\u3067\u4f4f\u6240\u3092\u691c\u7d22\u3057\u307e\u3059\u3002(7\u6841\u306e\u30cf\u30a4\u30d5\u30f3\u7121\u3057)
     * 
     * @param zipCode
     * @param searchResult
     * @param fromZipCodeResult
     */
    @WebMethod(operationName = "FromZipCode", action = "http://btonic.est.co.jp/zipcode/FromZipCode")
    @RequestWrapper(localName = "FromZipCode", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromZipCode")
    @ResponseWrapper(localName = "FromZipCodeResponse", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromZipCodeResponse")
    public void fromZipCode(
        @WebParam(name = "ZipCode", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String zipCode,
        @WebParam(name = "FromZipCodeResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<Boolean> fromZipCodeResult,
        @WebParam(name = "SearchResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<FindList> searchResult);

    /**
     * \u90f5\u4fbf\u756a\u53f7\u3067\u4f4f\u6240\u3092\u691c\u7d22\u3057\u307e\u3059\u3002(7\u6841\u306e\u30cf\u30a4\u30d5\u30f3\u7121\u3057)
     * 
     * @param zipCode
     * @return
     *     returns jp.co.est.btonic.zipcode.FindList
     */
    @WebMethod(operationName = "FromZipCode2", action = "http://btonic.est.co.jp/zipcode/FromZipCode2")
    @WebResult(name = "FromZipCode2Result", targetNamespace = "http://btonic.est.co.jp/zipcode/")
    @RequestWrapper(localName = "FromZipCode2", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromZipCode2")
    @ResponseWrapper(localName = "FromZipCode2Response", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromZipCode2Response")
    public FindList fromZipCode2(
        @WebParam(name = "ZipCode", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String zipCode);

    /**
     * \u65e7\u90f5\u4fbf\u756a\u53f7\u3067\u4f4f\u6240\u3092\u691c\u7d22\u3057\u307e\u3059\u3002(3 or 5\u6841\u306e\u30cf\u30a4\u30d5\u30f3\u7121\u3057)
     * 
     * @param searchResult
     * @param oldZipCode
     * @param fromOldZipCodeResult
     */
    @WebMethod(operationName = "FromOldZipCode", action = "http://btonic.est.co.jp/zipcode/FromOldZipCode")
    @RequestWrapper(localName = "FromOldZipCode", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromOldZipCode")
    @ResponseWrapper(localName = "FromOldZipCodeResponse", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromOldZipCodeResponse")
    public void fromOldZipCode(
        @WebParam(name = "OldZipCode", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String oldZipCode,
        @WebParam(name = "FromOldZipCodeResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<Boolean> fromOldZipCodeResult,
        @WebParam(name = "SearchResult", targetNamespace = "http://btonic.est.co.jp/zipcode/", mode = WebParam.Mode.OUT)
        Holder<FindList> searchResult);

    /**
     * \u65e7\u90f5\u4fbf\u756a\u53f7\u3067\u4f4f\u6240\u3092\u691c\u7d22\u3057\u307e\u3059\u3002(3 or 5\u6841\u306e\u30cf\u30a4\u30d5\u30f3\u7121\u3057)
     * 
     * @param oldZipCode
     * @return
     *     returns jp.co.est.btonic.zipcode.FindList
     */
    @WebMethod(operationName = "FromOldZipCode2", action = "http://btonic.est.co.jp/zipcode/FromOldZipCode2")
    @WebResult(name = "FromOldZipCode2Result", targetNamespace = "http://btonic.est.co.jp/zipcode/")
    @RequestWrapper(localName = "FromOldZipCode2", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromOldZipCode2")
    @ResponseWrapper(localName = "FromOldZipCode2Response", targetNamespace = "http://btonic.est.co.jp/zipcode/", className = "jp.co.est.btonic.zipcode.FromOldZipCode2Response")
    public FindList fromOldZipCode2(
        @WebParam(name = "OldZipCode", targetNamespace = "http://btonic.est.co.jp/zipcode/")
        String oldZipCode);

}