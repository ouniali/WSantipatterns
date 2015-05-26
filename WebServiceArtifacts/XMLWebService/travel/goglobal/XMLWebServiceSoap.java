
package travel.goglobal;

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
@WebService(name = "XMLWebServiceSoap", targetNamespace = "http://www.goglobal.travel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface XMLWebServiceSoap {


    /**
     * 
     * @param requestType
     * @param xmlRequest
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "MakeRequestCompressed", action = "http://www.goglobal.travel/MakeRequestCompressed")
    @WebResult(name = "MakeRequestCompressedResult", targetNamespace = "http://www.goglobal.travel/")
    @RequestWrapper(localName = "MakeRequestCompressed", targetNamespace = "http://www.goglobal.travel/", className = "travel.goglobal.MakeRequestCompressed")
    @ResponseWrapper(localName = "MakeRequestCompressedResponse", targetNamespace = "http://www.goglobal.travel/", className = "travel.goglobal.MakeRequestCompressedResponse")
    public byte[] makeRequestCompressed(
        @WebParam(name = "requestType", targetNamespace = "http://www.goglobal.travel/")
        String requestType,
        @WebParam(name = "xmlRequest", targetNamespace = "http://www.goglobal.travel/")
        String xmlRequest);

    /**
     * 
     * @param requestType
     * @param xmlRequest
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MakeRequest", action = "http://www.goglobal.travel/MakeRequest")
    @WebResult(name = "MakeRequestResult", targetNamespace = "http://www.goglobal.travel/")
    @RequestWrapper(localName = "MakeRequest", targetNamespace = "http://www.goglobal.travel/", className = "travel.goglobal.MakeRequest")
    @ResponseWrapper(localName = "MakeRequestResponse", targetNamespace = "http://www.goglobal.travel/", className = "travel.goglobal.MakeRequestResponse")
    public String makeRequest(
        @WebParam(name = "requestType", targetNamespace = "http://www.goglobal.travel/")
        String requestType,
        @WebParam(name = "xmlRequest", targetNamespace = "http://www.goglobal.travel/")
        String xmlRequest);

}
