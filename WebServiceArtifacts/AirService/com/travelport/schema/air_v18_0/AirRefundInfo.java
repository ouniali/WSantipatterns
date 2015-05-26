
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.RefundRemark;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}RefundRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefundAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="RetainAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="RefundFee" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Retain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Refund" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refundRemark"
})
@XmlRootElement(name = "AirRefundInfo")
public class AirRefundInfo {

    @XmlElement(name = "RefundRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<RefundRemark> refundRemark;
    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    @XmlAttribute(name = "RetainAmount")
    protected String retainAmount;
    @XmlAttribute(name = "RefundFee")
    protected String refundFee;
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    @XmlAttribute(name = "Retain")
    protected Boolean retain;
    @XmlAttribute(name = "Refund")
    protected Boolean refund;

    /**
     * Gets the value of the refundRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundRemark }
     * 
     * 
     */
    public List<RefundRemark> getRefundRemark() {
        if (refundRemark == null) {
            refundRemark = new ArrayList<RefundRemark>();
        }
        return this.refundRemark;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundAmount(String value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the retainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainAmount() {
        return retainAmount;
    }

    /**
     * Sets the value of the retainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainAmount(String value) {
        this.retainAmount = value;
    }

    /**
     * Gets the value of the refundFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFee() {
        return refundFee;
    }

    /**
     * Sets the value of the refundFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundFee(String value) {
        this.refundFee = value;
    }

    /**
     * Gets the value of the forfeitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfeitAmount() {
        return forfeitAmount;
    }

    /**
     * Sets the value of the forfeitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
    }

    /**
     * Gets the value of the retain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetain() {
        if (retain == null) {
            return false;
        } else {
            return retain;
        }
    }

    /**
     * Sets the value of the retain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetain(Boolean value) {
        this.retain = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRefund() {
        if (refund == null) {
            return false;
        } else {
            return refund;
        }
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefund(Boolean value) {
        this.refund = value;
    }

}
