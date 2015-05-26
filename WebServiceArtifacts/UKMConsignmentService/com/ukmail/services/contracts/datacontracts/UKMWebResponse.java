
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ukmwebapicommon.UKMResultState;


/**
 * <p>Java class for UKMWebResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UKMWebResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://www.UKMail.com/Services/Contracts/DataContracts}ArrayOfUKMWebError" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://schemas.datacontract.org/2004/07/UKMWebAPICommon.WebResponses}UKMResultState"/>
 *         &lt;element name="Warnings" type="{http://www.UKMail.com/Services/Contracts/DataContracts}ArrayOfUKMWebWarning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UKMWebResponse", propOrder = {
    "errors",
    "result",
    "warnings"
})
@XmlSeeAlso({
    UKMCancelConsignmentWebResponse.class,
    UKMAddDomesticConsignmentWebResponse.class,
    UKMAddPacketConsignmentWebResponse.class,
    UKMAddInternationalConsignmentWebResponse.class,
    UKMAddSendToThirdPartyWebResponse.class,
    UKMAddReturnToSenderWebResponse.class,
    UKMCancelReturnWebResponse.class
})
public class UKMWebResponse {

    @XmlElementRef(name = "Errors", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUKMWebError> errors;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected UKMResultState result;
    @XmlElementRef(name = "Warnings", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUKMWebWarning> warnings;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUKMWebError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUKMWebError> getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUKMWebError }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfUKMWebError> value) {
        this.errors = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link UKMResultState }
     *     
     */
    public UKMResultState getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKMResultState }
     *     
     */
    public void setResult(UKMResultState value) {
        this.result = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUKMWebWarning }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUKMWebWarning> getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUKMWebWarning }{@code >}
     *     
     */
    public void setWarnings(JAXBElement<ArrayOfUKMWebWarning> value) {
        this.warnings = value;
    }

}
