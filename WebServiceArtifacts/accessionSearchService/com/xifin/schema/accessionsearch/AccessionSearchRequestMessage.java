
package com.xifin.schema.accessionsearch;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.xifin.schema.types.AddressType;
import com.xifin.schema.types.NameType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessionWithAtleastOnePayor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RequisitionId" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="PatientId" type="{http://www.xifin.com/schema/types}NameIdType" minOccurs="0"/>
 *         &lt;element name="ClientId" type="{http://www.xifin.com/schema/types}IdType" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientName" type="{http://www.xifin.com/schema/types}NameType" minOccurs="0"/>
 *         &lt;element name="PatientSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PayorId" type="{http://www.xifin.com/schema/types}PayorIdType" minOccurs="0"/>
 *         &lt;element name="PayorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberId" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="PatientAddress" type="{http://www.xifin.com/schema/types}AddressType" minOccurs="0"/>
 *         &lt;element name="InsuredName" type="{http://www.xifin.com/schema/types}NameType" minOccurs="0"/>
 *         &lt;element name="QuestionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuestionResponse" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="DosFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DosTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DisplayPrimaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SortByPatientLastName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartRowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EndRowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SubmissionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientPrimaryFacilityId" type="{http://www.xifin.com/schema/types}IdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accessionId",
    "accessionWithAtleastOnePayor",
    "requisitionId",
    "patientId",
    "clientId",
    "clientName",
    "patientName",
    "patientSSN",
    "patientDOB",
    "payorId",
    "payorName",
    "subscriberId",
    "patientAddress",
    "insuredName",
    "questionId",
    "questionResponse",
    "dosFrom",
    "dosTo",
    "displayPrimaryOnly",
    "sortByPatientLastName",
    "startRowNumber",
    "endRowNumber",
    "submissionId",
    "clientPrimaryFacilityId"
})
@XmlRootElement(name = "AccessionSearchRequestMessage")
public class AccessionSearchRequestMessage {

    @XmlElement(name = "AccessionId")
    protected String accessionId;
    @XmlElement(name = "AccessionWithAtleastOnePayor", defaultValue = "true")
    protected Boolean accessionWithAtleastOnePayor;
    @XmlElement(name = "RequisitionId")
    protected String requisitionId;
    @XmlElement(name = "PatientId")
    protected String patientId;
    @XmlElement(name = "ClientId")
    protected String clientId;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "PatientName")
    protected NameType patientName;
    @XmlElement(name = "PatientSSN")
    protected String patientSSN;
    @XmlElement(name = "PatientDOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar patientDOB;
    @XmlElement(name = "PayorId")
    protected String payorId;
    @XmlElement(name = "PayorName")
    protected String payorName;
    @XmlElement(name = "SubscriberId")
    protected String subscriberId;
    @XmlElement(name = "PatientAddress")
    protected AddressType patientAddress;
    @XmlElement(name = "InsuredName")
    protected NameType insuredName;
    @XmlElement(name = "QuestionId")
    protected Integer questionId;
    @XmlElement(name = "QuestionResponse")
    protected String questionResponse;
    @XmlElement(name = "DosFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dosFrom;
    @XmlElement(name = "DosTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dosTo;
    @XmlElement(name = "DisplayPrimaryOnly", defaultValue = "true")
    protected Boolean displayPrimaryOnly;
    @XmlElement(name = "SortByPatientLastName")
    protected Boolean sortByPatientLastName;
    @XmlElement(name = "StartRowNumber", defaultValue = "1")
    protected BigInteger startRowNumber;
    @XmlElement(name = "EndRowNumber", defaultValue = "100")
    protected BigInteger endRowNumber;
    @XmlElement(name = "SubmissionId")
    protected String submissionId;
    @XmlElement(name = "ClientPrimaryFacilityId")
    protected String clientPrimaryFacilityId;

    /**
     * Gets the value of the accessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionId() {
        return accessionId;
    }

    /**
     * Sets the value of the accessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionId(String value) {
        this.accessionId = value;
    }

    /**
     * Gets the value of the accessionWithAtleastOnePayor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessionWithAtleastOnePayor() {
        return accessionWithAtleastOnePayor;
    }

    /**
     * Sets the value of the accessionWithAtleastOnePayor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessionWithAtleastOnePayor(Boolean value) {
        this.accessionWithAtleastOnePayor = value;
    }

    /**
     * Gets the value of the requisitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionId() {
        return requisitionId;
    }

    /**
     * Sets the value of the requisitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionId(String value) {
        this.requisitionId = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the patientName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getPatientName() {
        return patientName;
    }

    /**
     * Sets the value of the patientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setPatientName(NameType value) {
        this.patientName = value;
    }

    /**
     * Gets the value of the patientSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSSN() {
        return patientSSN;
    }

    /**
     * Sets the value of the patientSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSSN(String value) {
        this.patientSSN = value;
    }

    /**
     * Gets the value of the patientDOB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPatientDOB() {
        return patientDOB;
    }

    /**
     * Sets the value of the patientDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPatientDOB(XMLGregorianCalendar value) {
        this.patientDOB = value;
    }

    /**
     * Gets the value of the payorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorId() {
        return payorId;
    }

    /**
     * Sets the value of the payorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorId(String value) {
        this.payorId = value;
    }

    /**
     * Gets the value of the payorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorName() {
        return payorName;
    }

    /**
     * Sets the value of the payorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorName(String value) {
        this.payorName = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the patientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPatientAddress() {
        return patientAddress;
    }

    /**
     * Sets the value of the patientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPatientAddress(AddressType value) {
        this.patientAddress = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setInsuredName(NameType value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the questionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of the questionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuestionId(Integer value) {
        this.questionId = value;
    }

    /**
     * Gets the value of the questionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionResponse() {
        return questionResponse;
    }

    /**
     * Sets the value of the questionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionResponse(String value) {
        this.questionResponse = value;
    }

    /**
     * Gets the value of the dosFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDosFrom() {
        return dosFrom;
    }

    /**
     * Sets the value of the dosFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDosFrom(XMLGregorianCalendar value) {
        this.dosFrom = value;
    }

    /**
     * Gets the value of the dosTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDosTo() {
        return dosTo;
    }

    /**
     * Sets the value of the dosTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDosTo(XMLGregorianCalendar value) {
        this.dosTo = value;
    }

    /**
     * Gets the value of the displayPrimaryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayPrimaryOnly() {
        return displayPrimaryOnly;
    }

    /**
     * Sets the value of the displayPrimaryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayPrimaryOnly(Boolean value) {
        this.displayPrimaryOnly = value;
    }

    /**
     * Gets the value of the sortByPatientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortByPatientLastName() {
        return sortByPatientLastName;
    }

    /**
     * Sets the value of the sortByPatientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortByPatientLastName(Boolean value) {
        this.sortByPatientLastName = value;
    }

    /**
     * Gets the value of the startRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRowNumber() {
        return startRowNumber;
    }

    /**
     * Sets the value of the startRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRowNumber(BigInteger value) {
        this.startRowNumber = value;
    }

    /**
     * Gets the value of the endRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRowNumber() {
        return endRowNumber;
    }

    /**
     * Sets the value of the endRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRowNumber(BigInteger value) {
        this.endRowNumber = value;
    }

    /**
     * Gets the value of the submissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the value of the submissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionId(String value) {
        this.submissionId = value;
    }

    /**
     * Gets the value of the clientPrimaryFacilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPrimaryFacilityId() {
        return clientPrimaryFacilityId;
    }

    /**
     * Sets the value of the clientPrimaryFacilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPrimaryFacilityId(String value) {
        this.clientPrimaryFacilityId = value;
    }

}
