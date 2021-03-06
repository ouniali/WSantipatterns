
package com.xifin.schema.accessionsearch;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "accessionSearch", targetNamespace = "http://www.xifin.com/schema/accessionSearch")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.xifin.schema.accessionsearch.ObjectFactory.class,
    com.xifin.schema.msgheader.ObjectFactory.class,
    com.xifin.schema.types.ObjectFactory.class
})
public interface AccessionSearch {


    /**
     * 
     * @param accessionSearchRequest
     * @return
     *     returns com.xifin.schema.accessionsearch.AccessionSearchResponse
     */
    @WebMethod(operationName = "AccessionSearch")
    @WebResult(name = "AccessionSearchResponse", targetNamespace = "http://www.xifin.com/schema/accessionSearch", partName = "AccessionSearchResponse")
    public AccessionSearchResponse accessionSearch(
        @WebParam(name = "AccessionSearchRequest", targetNamespace = "http://www.xifin.com/schema/accessionSearch", partName = "AccessionSearchRequest")
        AccessionSearchRequest accessionSearchRequest);

}
