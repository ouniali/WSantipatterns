
package com.travelport.schema.common_v15_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CreditCard" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Certificate" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}TicketNumber" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Check" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DebitCard" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Requisition" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}MiscFormOfPayment" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyPayment" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}UnitedNations" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DirectPayment" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgentVoucher" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeGeneralReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeGeneralReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="25"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FulfillmentType" type="{http://www.travelport.com/schema/common_v15_0}typeFulfillmentType" />
 *       &lt;attribute name="FulfillmentLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FulfillmentIDType" type="{http://www.travelport.com/schema/common_v15_0}typeFulfillmentIDType" />
 *       &lt;attribute name="FulfillmentIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsAgentType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AgentText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReuseFOP" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ExternalReference" type="{http://www.travelport.com/schema/common_v15_0}typeExternalReference" />
 *       &lt;attribute name="Reusable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "certificate",
    "ticketNumber",
    "check",
    "debitCard",
    "requisition",
    "miscFormOfPayment",
    "agencyPayment",
    "unitedNations",
    "directPayment",
    "agentVoucher",
    "providerReservationInfoRef",
    "segmentRef"
})
@XmlRootElement(name = "FormOfPayment")
public class FormOfPayment {

    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "Certificate")
    protected Certificate certificate;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "Check")
    protected Check check;
    @XmlElement(name = "DebitCard")
    protected DebitCard debitCard;
    @XmlElement(name = "Requisition")
    protected Requisition requisition;
    @XmlElement(name = "MiscFormOfPayment")
    protected MiscFormOfPayment miscFormOfPayment;
    @XmlElement(name = "AgencyPayment")
    protected TypeAgencyPayment agencyPayment;
    @XmlElement(name = "UnitedNations")
    protected UnitedNations unitedNations;
    @XmlElement(name = "DirectPayment")
    protected DirectPayment directPayment;
    @XmlElement(name = "AgentVoucher")
    protected AgentVoucher agentVoucher;
    @XmlElement(name = "ProviderReservationInfoRef")
    protected List<TypeGeneralReference> providerReservationInfoRef;
    @XmlElement(name = "SegmentRef")
    protected List<TypeGeneralReference> segmentRef;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "FulfillmentType")
    protected TypeFulfillmentType fulfillmentType;
    @XmlAttribute(name = "FulfillmentLocation")
    protected String fulfillmentLocation;
    @XmlAttribute(name = "FulfillmentIDType")
    protected TypeFulfillmentIDType fulfillmentIDType;
    @XmlAttribute(name = "FulfillmentIDNumber")
    protected String fulfillmentIDNumber;
    @XmlAttribute(name = "IsAgentType")
    protected Boolean isAgentType;
    @XmlAttribute(name = "AgentText")
    protected String agentText;
    @XmlAttribute(name = "ReuseFOP")
    protected String reuseFOP;
    @XmlAttribute(name = "ExternalReference")
    protected String externalReference;
    @XmlAttribute(name = "Reusable")
    protected Boolean reusable;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Gets the value of the debitCard property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCard }
     *     
     */
    public DebitCard getDebitCard() {
        return debitCard;
    }

    /**
     * Sets the value of the debitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCard }
     *     
     */
    public void setDebitCard(DebitCard value) {
        this.debitCard = value;
    }

    /**
     * Gets the value of the requisition property.
     * 
     * @return
     *     possible object is
     *     {@link Requisition }
     *     
     */
    public Requisition getRequisition() {
        return requisition;
    }

    /**
     * Sets the value of the requisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requisition }
     *     
     */
    public void setRequisition(Requisition value) {
        this.requisition = value;
    }

    /**
     * Gets the value of the miscFormOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link MiscFormOfPayment }
     *     
     */
    public MiscFormOfPayment getMiscFormOfPayment() {
        return miscFormOfPayment;
    }

    /**
     * Sets the value of the miscFormOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscFormOfPayment }
     *     
     */
    public void setMiscFormOfPayment(MiscFormOfPayment value) {
        this.miscFormOfPayment = value;
    }

    /**
     * Gets the value of the agencyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAgencyPayment }
     *     
     */
    public TypeAgencyPayment getAgencyPayment() {
        return agencyPayment;
    }

    /**
     * Sets the value of the agencyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAgencyPayment }
     *     
     */
    public void setAgencyPayment(TypeAgencyPayment value) {
        this.agencyPayment = value;
    }

    /**
     * Gets the value of the unitedNations property.
     * 
     * @return
     *     possible object is
     *     {@link UnitedNations }
     *     
     */
    public UnitedNations getUnitedNations() {
        return unitedNations;
    }

    /**
     * Sets the value of the unitedNations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitedNations }
     *     
     */
    public void setUnitedNations(UnitedNations value) {
        this.unitedNations = value;
    }

    /**
     * Gets the value of the directPayment property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPayment }
     *     
     */
    public DirectPayment getDirectPayment() {
        return directPayment;
    }

    /**
     * Sets the value of the directPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPayment }
     *     
     */
    public void setDirectPayment(DirectPayment value) {
        this.directPayment = value;
    }

    /**
     * Gets the value of the agentVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link AgentVoucher }
     *     
     */
    public AgentVoucher getAgentVoucher() {
        return agentVoucher;
    }

    /**
     * Sets the value of the agentVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentVoucher }
     *     
     */
    public void setAgentVoucher(AgentVoucher value) {
        this.agentVoucher = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * 
     * 
     */
    public List<TypeGeneralReference> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<TypeGeneralReference>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * 
     * 
     */
    public List<TypeGeneralReference> getSegmentRef() {
        if (segmentRef == null) {
            segmentRef = new ArrayList<TypeGeneralReference>();
        }
        return this.segmentRef;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fulfillmentType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFulfillmentType }
     *     
     */
    public TypeFulfillmentType getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFulfillmentType }
     *     
     */
    public void setFulfillmentType(TypeFulfillmentType value) {
        this.fulfillmentType = value;
    }

    /**
     * Gets the value of the fulfillmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentLocation() {
        return fulfillmentLocation;
    }

    /**
     * Sets the value of the fulfillmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentLocation(String value) {
        this.fulfillmentLocation = value;
    }

    /**
     * Gets the value of the fulfillmentIDType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFulfillmentIDType }
     *     
     */
    public TypeFulfillmentIDType getFulfillmentIDType() {
        return fulfillmentIDType;
    }

    /**
     * Sets the value of the fulfillmentIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFulfillmentIDType }
     *     
     */
    public void setFulfillmentIDType(TypeFulfillmentIDType value) {
        this.fulfillmentIDType = value;
    }

    /**
     * Gets the value of the fulfillmentIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentIDNumber() {
        return fulfillmentIDNumber;
    }

    /**
     * Sets the value of the fulfillmentIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentIDNumber(String value) {
        this.fulfillmentIDNumber = value;
    }

    /**
     * Gets the value of the isAgentType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAgentType() {
        if (isAgentType == null) {
            return false;
        } else {
            return isAgentType;
        }
    }

    /**
     * Sets the value of the isAgentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgentType(Boolean value) {
        this.isAgentType = value;
    }

    /**
     * Gets the value of the agentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentText() {
        return agentText;
    }

    /**
     * Sets the value of the agentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentText(String value) {
        this.agentText = value;
    }

    /**
     * Gets the value of the reuseFOP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseFOP() {
        return reuseFOP;
    }

    /**
     * Sets the value of the reuseFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuseFOP(String value) {
        this.reuseFOP = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the reusable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReusable() {
        if (reusable == null) {
            return false;
        } else {
            return reusable;
        }
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusable(Boolean value) {
        this.reusable = value;
    }

}
