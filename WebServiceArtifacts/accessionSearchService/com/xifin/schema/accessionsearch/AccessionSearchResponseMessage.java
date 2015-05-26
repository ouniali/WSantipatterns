
package com.xifin.schema.accessionsearch;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PatientName" type="{http://www.xifin.com/schema/types}NameType" minOccurs="0"/>
 *         &lt;element name="PatientId" type="{http://www.xifin.com/schema/types}NameIdType" minOccurs="0"/>
 *         &lt;element name="AccessionId" type="{http://www.xifin.com/schema/types}AccessionIdType" minOccurs="0"/>
 *         &lt;element name="ClientId" type="{http://www.xifin.com/schema/types}IdType" minOccurs="0"/>
 *         &lt;element name="RequisitionId" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="Dos" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BalanceDueAmount" type="{http://www.xifin.com/schema/types}AmountType" minOccurs="0"/>
 *         &lt;element name="PatientDueAmount" type="{http://www.xifin.com/schema/types}AmountType" minOccurs="0"/>
 *         &lt;element name="PatientSSN" type="{http://www.xifin.com/schema/types}SSNType" minOccurs="0"/>
 *         &lt;element name="PatientDOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PatientAddress" type="{http://www.xifin.com/schema/types}AddressType" minOccurs="0"/>
 *         &lt;element name="AccessionStatus" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="AccessionStatementStatus" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xifin.com/schema/accessionSearch}InsuranceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClientSpecificPatientInfo" type="{http://www.xifin.com/schema/accessionSearch}SpecificPatientInfo" minOccurs="0"/>
 *         &lt;element name="FacilitySpecificPatientInfo" type="{http://www.xifin.com/schema/accessionSearch}SpecificPatientInfo" minOccurs="0"/>
 *         &lt;element name="MspForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "rowId",
    "patientName",
    "patientId",
    "accessionId",
    "clientId",
    "requisitionId",
    "dos",
    "balanceDueAmount",
    "patientDueAmount",
    "patientSSN",
    "patientDOB",
    "patientAddress",
    "accessionStatus",
    "accessionStatementStatus",
    "insuranceInfo",
    "clientSpecificPatientInfo",
    "facilitySpecificPatientInfo",
    "mspForm"
})
@XmlRootElement(name = "AccessionSearchResponseMessage")
public class AccessionSearchResponseMessage {

    @XmlElement(name = "RowId")
    protected int rowId;
    @XmlElement(name = "PatientName")
    protected NameType patientName;
    @XmlElement(name = "PatientId")
    protected String patientId;
    @XmlElement(name = "AccessionId")
    protected String accessionId;
    @XmlElement(name = "ClientId")
    protected String clientId;
    @XmlElement(name = "RequisitionId")
    protected String requisitionId;
    @XmlElement(name = "Dos")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dos;
    @XmlElement(name = "BalanceDueAmount")
    protected BigDecimal balanceDueAmount;
    @XmlElement(name = "PatientDueAmount")
    protected BigDecimal patientDueAmount;
    @XmlElement(name = "PatientSSN")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger patientSSN;
    @XmlElement(name = "PatientDOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar patientDOB;
    @XmlElement(name = "PatientAddress")
    protected AddressType patientAddress;
    @XmlElement(name = "AccessionStatus")
    protected String accessionStatus;
    @XmlElement(name = "AccessionStatementStatus")
    protected String accessionStatementStatus;
    @XmlElement(name = "InsuranceInfo")
    protected List<InsuranceInfo> insuranceInfo;
    @XmlElement(name = "ClientSpecificPatientInfo")
    protected SpecificPatientInfo clientSpecificPatientInfo;
    @XmlElement(name = "FacilitySpecificPatientInfo")
    protected SpecificPatientInfo facilitySpecificPatientInfo;
    @XmlElement(name = "MspForm")
    protected Boolean mspForm;

    /**
     * Gets the value of the rowId property.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
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
     * Gets the value of the dos property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDos() {
        return dos;
    }

    /**
     * Sets the value of the dos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDos(XMLGregorianCalendar value) {
        this.dos = value;
    }

    /**
     * Gets the value of the balanceDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceDueAmount() {
        return balanceDueAmount;
    }

    /**
     * Sets the value of the balanceDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceDueAmount(BigDecimal value) {
        this.balanceDueAmount = value;
    }

    /**
     * Gets the value of the patientDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPatientDueAmount() {
        return patientDueAmount;
    }

    /**
     * Sets the value of the patientDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPatientDueAmount(BigDecimal value) {
        this.patientDueAmount = value;
    }

    /**
     * Gets the value of the patientSSN property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientSSN() {
        return patientSSN;
    }

    /**
     * Sets the value of the patientSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientSSN(BigInteger value) {
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
     * Gets the value of the accessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionStatus() {
        return accessionStatus;
    }

    /**
     * Sets the value of the accessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionStatus(String value) {
        this.accessionStatus = value;
    }

    /**
     * Gets the value of the accessionStatementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionStatementStatus() {
        return accessionStatementStatus;
    }

    /**
     * Sets the value of the accessionStatementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionStatementStatus(String value) {
        this.accessionStatementStatus = value;
    }

    /**
     * Gets the value of the insuranceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceInfo }
     * 
     * 
     */
    public List<InsuranceInfo> getInsuranceInfo() {
        if (insuranceInfo == null) {
            insuranceInfo = new ArrayList<InsuranceInfo>();
        }
        return this.insuranceInfo;
    }

    /**
     * Gets the value of the clientSpecificPatientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificPatientInfo }
     *     
     */
    public SpecificPatientInfo getClientSpecificPatientInfo() {
        return clientSpecificPatientInfo;
    }

    /**
     * Sets the value of the clientSpecificPatientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificPatientInfo }
     *     
     */
    public void setClientSpecificPatientInfo(SpecificPatientInfo value) {
        this.clientSpecificPatientInfo = value;
    }

    /**
     * Gets the value of the facilitySpecificPatientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificPatientInfo }
     *     
     */
    public SpecificPatientInfo getFacilitySpecificPatientInfo() {
        return facilitySpecificPatientInfo;
    }

    /**
     * Sets the value of the facilitySpecificPatientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificPatientInfo }
     *     
     */
    public void setFacilitySpecificPatientInfo(SpecificPatientInfo value) {
        this.facilitySpecificPatientInfo = value;
    }

    /**
     * Gets the value of the mspForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMspForm() {
        return mspForm;
    }

    /**
     * Sets the value of the mspForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMspForm(Boolean value) {
        this.mspForm = value;
    }

}
