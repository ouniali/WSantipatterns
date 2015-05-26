
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentTransformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTransformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransformationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargesIncurred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmissionPeriodFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmissionPeriodUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeadlineExtendedUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithdrawableUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithdrawableDeadlineExtendedUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewIssuer" type="{http://www.xignite.com/services/}Issuer" minOccurs="0"/>
 *         &lt;element name="Inputs" type="{http://www.xignite.com/services/}ArrayOfInstrumentTransformationInputOutput" minOccurs="0"/>
 *         &lt;element name="OutputChoices" type="{http://www.xignite.com/services/}ArrayOfInstrumentOutputChoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTransformation", propOrder = {
    "eventType",
    "mandatory",
    "transformationType",
    "settlementType",
    "chargesIncurred",
    "validationType",
    "submissionPeriodFrom",
    "submissionPeriodUntil",
    "deadlineExtendedUntil",
    "withdrawableUntil",
    "withdrawableDeadlineExtendedUntil",
    "recordDate",
    "description",
    "exDate",
    "newIssuer",
    "inputs",
    "outputChoices"
})
public class InstrumentTransformation
    extends AbstractPublicWebServiceEvent
{

    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "Mandatory")
    protected String mandatory;
    @XmlElement(name = "TransformationType")
    protected String transformationType;
    @XmlElement(name = "SettlementType")
    protected String settlementType;
    @XmlElement(name = "ChargesIncurred")
    protected String chargesIncurred;
    @XmlElement(name = "ValidationType")
    protected String validationType;
    @XmlElement(name = "SubmissionPeriodFrom")
    protected String submissionPeriodFrom;
    @XmlElement(name = "SubmissionPeriodUntil")
    protected String submissionPeriodUntil;
    @XmlElement(name = "DeadlineExtendedUntil")
    protected String deadlineExtendedUntil;
    @XmlElement(name = "WithdrawableUntil")
    protected String withdrawableUntil;
    @XmlElement(name = "WithdrawableDeadlineExtendedUntil")
    protected String withdrawableDeadlineExtendedUntil;
    @XmlElement(name = "RecordDate")
    protected String recordDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExDate")
    protected String exDate;
    @XmlElement(name = "NewIssuer")
    protected Issuer newIssuer;
    @XmlElement(name = "Inputs")
    protected ArrayOfInstrumentTransformationInputOutput inputs;
    @XmlElement(name = "OutputChoices")
    protected ArrayOfInstrumentOutputChoice outputChoices;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatory(String value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the transformationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformationType() {
        return transformationType;
    }

    /**
     * Sets the value of the transformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformationType(String value) {
        this.transformationType = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the chargesIncurred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargesIncurred() {
        return chargesIncurred;
    }

    /**
     * Sets the value of the chargesIncurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargesIncurred(String value) {
        this.chargesIncurred = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the submissionPeriodFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionPeriodFrom() {
        return submissionPeriodFrom;
    }

    /**
     * Sets the value of the submissionPeriodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionPeriodFrom(String value) {
        this.submissionPeriodFrom = value;
    }

    /**
     * Gets the value of the submissionPeriodUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionPeriodUntil() {
        return submissionPeriodUntil;
    }

    /**
     * Sets the value of the submissionPeriodUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionPeriodUntil(String value) {
        this.submissionPeriodUntil = value;
    }

    /**
     * Gets the value of the deadlineExtendedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadlineExtendedUntil() {
        return deadlineExtendedUntil;
    }

    /**
     * Sets the value of the deadlineExtendedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadlineExtendedUntil(String value) {
        this.deadlineExtendedUntil = value;
    }

    /**
     * Gets the value of the withdrawableUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawableUntil() {
        return withdrawableUntil;
    }

    /**
     * Sets the value of the withdrawableUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawableUntil(String value) {
        this.withdrawableUntil = value;
    }

    /**
     * Gets the value of the withdrawableDeadlineExtendedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawableDeadlineExtendedUntil() {
        return withdrawableDeadlineExtendedUntil;
    }

    /**
     * Sets the value of the withdrawableDeadlineExtendedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawableDeadlineExtendedUntil(String value) {
        this.withdrawableDeadlineExtendedUntil = value;
    }

    /**
     * Gets the value of the recordDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the value of the recordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordDate(String value) {
        this.recordDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the exDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExDate() {
        return exDate;
    }

    /**
     * Sets the value of the exDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExDate(String value) {
        this.exDate = value;
    }

    /**
     * Gets the value of the newIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getNewIssuer() {
        return newIssuer;
    }

    /**
     * Sets the value of the newIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setNewIssuer(Issuer value) {
        this.newIssuer = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentTransformationInputOutput }
     *     
     */
    public ArrayOfInstrumentTransformationInputOutput getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentTransformationInputOutput }
     *     
     */
    public void setInputs(ArrayOfInstrumentTransformationInputOutput value) {
        this.inputs = value;
    }

    /**
     * Gets the value of the outputChoices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentOutputChoice }
     *     
     */
    public ArrayOfInstrumentOutputChoice getOutputChoices() {
        return outputChoices;
    }

    /**
     * Sets the value of the outputChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentOutputChoice }
     *     
     */
    public void setOutputChoices(ArrayOfInstrumentOutputChoice value) {
        this.outputChoices = value;
    }

}
