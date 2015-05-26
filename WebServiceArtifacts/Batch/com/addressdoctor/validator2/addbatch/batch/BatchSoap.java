
package com.addressdoctor.validator2.addbatch.batch;

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
@WebService(name = "BatchSoap", targetNamespace = "http://validator2.AddressDoctor.com/addBatch/Batch")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BatchSoap {


    /**
     * 
     * @param addBatchRequest
     * @return
     *     returns com.addressdoctor.validator2.addbatch.batch.AddBatchResponse
     */
    @WebMethod(operationName = "Validate", action = "http://validator2.AddressDoctor.com/addBatch/Batch/Validate")
    @WebResult(name = "ValidateResult", targetNamespace = "http://validator2.AddressDoctor.com/addBatch/Batch")
    @RequestWrapper(localName = "Validate", targetNamespace = "http://validator2.AddressDoctor.com/addBatch/Batch", className = "com.addressdoctor.validator2.addbatch.batch.Validate")
    @ResponseWrapper(localName = "ValidateResponse", targetNamespace = "http://validator2.AddressDoctor.com/addBatch/Batch", className = "com.addressdoctor.validator2.addbatch.batch.ValidateResponse")
    public AddBatchResponse validate(
        @WebParam(name = "addBatchRequest", targetNamespace = "http://validator2.AddressDoctor.com/addBatch/Batch")
        AddBatchRequest addBatchRequest);

}