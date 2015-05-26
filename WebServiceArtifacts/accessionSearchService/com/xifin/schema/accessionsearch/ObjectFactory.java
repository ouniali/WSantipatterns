
package com.xifin.schema.accessionsearch;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xifin.schema.accessionsearch package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xifin.schema.accessionsearch
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccessionSearchResponse }
     * 
     */
    public AccessionSearchResponse createAccessionSearchResponse() {
        return new AccessionSearchResponse();
    }

    /**
     * Create an instance of {@link AccessionSearchRequest }
     * 
     */
    public AccessionSearchRequest createAccessionSearchRequest() {
        return new AccessionSearchRequest();
    }

    /**
     * Create an instance of {@link InsuranceInfo }
     * 
     */
    public InsuranceInfo createInsuranceInfo() {
        return new InsuranceInfo();
    }

    /**
     * Create an instance of {@link AccessionSearchRequestMessage }
     * 
     */
    public AccessionSearchRequestMessage createAccessionSearchRequestMessage() {
        return new AccessionSearchRequestMessage();
    }

    /**
     * Create an instance of {@link AccessionSearchResponse.Payload }
     * 
     */
    public AccessionSearchResponse.Payload createAccessionSearchResponsePayload() {
        return new AccessionSearchResponse.Payload();
    }

    /**
     * Create an instance of {@link AccessionSearchRequest.Payload }
     * 
     */
    public AccessionSearchRequest.Payload createAccessionSearchRequestPayload() {
        return new AccessionSearchRequest.Payload();
    }

    /**
     * Create an instance of {@link AccessionSearchResponseMessage }
     * 
     */
    public AccessionSearchResponseMessage createAccessionSearchResponseMessage() {
        return new AccessionSearchResponseMessage();
    }

    /**
     * Create an instance of {@link SpecificPatientInfo }
     * 
     */
    public SpecificPatientInfo createSpecificPatientInfo() {
        return new SpecificPatientInfo();
    }

}
