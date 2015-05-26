
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
 *         &lt;element name="ProviderReservationSpecificInfo" type="{http://www.travelport.com/schema/common_v15_0}typeProviderReservationSpecificInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeCarrier" />
 *       &lt;attribute name="CardNumber" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeCardNumber" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierType" type="{http://www.travelport.com/schema/common_v15_0}typeProduct" />
 *       &lt;attribute name="Level">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[a-zA-Z0-9]{1,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MembershipProgram" type="{http://www.travelport.com/schema/common_v15_0}StringLength1to32" />
 *       &lt;attribute name="PriorityCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[a-zA-Z0-9]{1,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationSpecificInfo"
})
@XmlRootElement(name = "LoyaltyCard")
public class LoyaltyCard {

    @XmlElement(name = "ProviderReservationSpecificInfo")
    protected List<TypeProviderReservationSpecificInfo> providerReservationSpecificInfo;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    @XmlAttribute(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "MembershipStatus")
    protected String membershipStatus;
    @XmlAttribute(name = "FreeText")
    protected String freeText;
    @XmlAttribute(name = "SupplierType")
    protected TypeProduct supplierType;
    @XmlAttribute(name = "Level")
    protected String level;
    @XmlAttribute(name = "MembershipProgram")
    protected String membershipProgram;
    @XmlAttribute(name = "PriorityCode")
    protected String priorityCode;

    /**
     * Gets the value of the providerReservationSpecificInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationSpecificInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationSpecificInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProviderReservationSpecificInfo }
     * 
     * 
     */
    public List<TypeProviderReservationSpecificInfo> getProviderReservationSpecificInfo() {
        if (providerReservationSpecificInfo == null) {
            providerReservationSpecificInfo = new ArrayList<TypeProviderReservationSpecificInfo>();
        }
        return this.providerReservationSpecificInfo;
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
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the membershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * Sets the value of the membershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipStatus(String value) {
        this.membershipStatus = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the supplierType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProduct }
     *     
     */
    public TypeProduct getSupplierType() {
        return supplierType;
    }

    /**
     * Sets the value of the supplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProduct }
     *     
     */
    public void setSupplierType(TypeProduct value) {
        this.supplierType = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the membershipProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipProgram() {
        return membershipProgram;
    }

    /**
     * Sets the value of the membershipProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipProgram(String value) {
        this.membershipProgram = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

}
