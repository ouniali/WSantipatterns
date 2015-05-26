
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPenaltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPenaltyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Deadline" type="{http://schemas.tourico.com/webservices/hotelv3}DeadlineType" minOccurs="0"/>
 *         &lt;element name="AmountPercent" type="{http://schemas.tourico.com/webservices/hotelv3}AmountPercentType" minOccurs="0"/>
 *         &lt;element name="PenaltyDescription" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="confirmClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenaltyType", propOrder = {
    "deadline",
    "amountPercent",
    "penaltyDescription"
})
public class CancelPenaltyType {

    @XmlElement(name = "Deadline")
    protected DeadlineType deadline;
    @XmlElement(name = "AmountPercent")
    protected AmountPercentType amountPercent;
    @XmlElement(name = "PenaltyDescription")
    protected ArrayOfParagraphType penaltyDescription;
    @XmlAttribute(name = "confirmClassCode")
    protected String confirmClassCode;
    @XmlAttribute(name = "policyCode")
    protected String policyCode;
    @XmlAttribute(name = "nonRefundable")
    protected Boolean nonRefundable;

    /**
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlineType }
     *     
     */
    public DeadlineType getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineType }
     *     
     */
    public void setDeadline(DeadlineType value) {
        this.deadline = value;
    }

    /**
     * Gets the value of the amountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentType }
     *     
     */
    public AmountPercentType getAmountPercent() {
        return amountPercent;
    }

    /**
     * Sets the value of the amountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentType }
     *     
     */
    public void setAmountPercent(AmountPercentType value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the penaltyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public ArrayOfParagraphType getPenaltyDescription() {
        return penaltyDescription;
    }

    /**
     * Sets the value of the penaltyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public void setPenaltyDescription(ArrayOfParagraphType value) {
        this.penaltyDescription = value;
    }

    /**
     * Gets the value of the confirmClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmClassCode() {
        return confirmClassCode;
    }

    /**
     * Sets the value of the confirmClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmClassCode(String value) {
        this.confirmClassCode = value;
    }

    /**
     * Gets the value of the policyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * Sets the value of the policyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCode(String value) {
        this.policyCode = value;
    }

    /**
     * Gets the value of the nonRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * Sets the value of the nonRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

}
