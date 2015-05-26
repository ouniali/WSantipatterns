
package internal.accountapiv2;

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
@WebService(name = "ServiceSoap", targetNamespace = "http://accountapiv2.internal/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * 
     * @param password
     * @param data
     * @param messageID
     * @param apiSigniture
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Process", action = "http://accountapiv2.internal/Process")
    @WebResult(name = "ProcessResult", targetNamespace = "http://accountapiv2.internal/")
    @RequestWrapper(localName = "Process", targetNamespace = "http://accountapiv2.internal/", className = "internal.accountapiv2.Process")
    @ResponseWrapper(localName = "ProcessResponse", targetNamespace = "http://accountapiv2.internal/", className = "internal.accountapiv2.ProcessResponse")
    public String process(
        @WebParam(name = "Username", targetNamespace = "http://accountapiv2.internal/")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://accountapiv2.internal/")
        String password,
        @WebParam(name = "APISigniture", targetNamespace = "http://accountapiv2.internal/")
        String apiSigniture,
        @WebParam(name = "MessageID", targetNamespace = "http://accountapiv2.internal/")
        String messageID,
        @WebParam(name = "Data", targetNamespace = "http://accountapiv2.internal/")
        String data);

}
