
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A container for EMD elements related to an
 * 					OptionalService
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FulfillmentType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AssociatedItem">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Flight"/>
 *             &lt;enumeration value="Ticket"/>
 *             &lt;enumeration value="Merchandising"/>
 *             &lt;enumeration value="RuleBuster"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AvailabilityChargeIndicator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="X"/>
 *             &lt;enumeration value="E"/>
 *             &lt;enumeration value="F"/>
 *             &lt;enumeration value="G"/>
 *             &lt;enumeration value="H"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RefundReissueIndicator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Refundable"/>
 *             &lt;enumeration value="NonRefundable"/>
 *             &lt;enumeration value="Reuse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Commissionable">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MileageIndicator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Location">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.travelport.com/schema/common_v15_0}typeIATACode">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Date">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
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
@XmlType(name = "")
@XmlRootElement(name = "EMD")
public class EMD {

    @XmlAttribute(name = "FulfillmentType")
    protected Integer fulfillmentType;
    @XmlAttribute(name = "AssociatedItem")
    protected String associatedItem;
    @XmlAttribute(name = "AvailabilityChargeIndicator")
    protected String availabilityChargeIndicator;
    @XmlAttribute(name = "RefundReissueIndicator")
    protected String refundReissueIndicator;
    @XmlAttribute(name = "Commissionable")
    protected Boolean commissionable;
    @XmlAttribute(name = "MileageIndicator")
    protected Boolean mileageIndicator;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "Date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the fulfillmentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFulfillmentType(Integer value) {
        this.fulfillmentType = value;
    }

    /**
     * Gets the value of the associatedItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedItem() {
        return associatedItem;
    }

    /**
     * Sets the value of the associatedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedItem(String value) {
        this.associatedItem = value;
    }

    /**
     * Gets the value of the availabilityChargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityChargeIndicator() {
        return availabilityChargeIndicator;
    }

    /**
     * Sets the value of the availabilityChargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityChargeIndicator(String value) {
        this.availabilityChargeIndicator = value;
    }

    /**
     * Gets the value of the refundReissueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReissueIndicator() {
        return refundReissueIndicator;
    }

    /**
     * Sets the value of the refundReissueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReissueIndicator(String value) {
        this.refundReissueIndicator = value;
    }

    /**
     * Gets the value of the commissionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommissionable() {
        return commissionable;
    }

    /**
     * Sets the value of the commissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommissionable(Boolean value) {
        this.commissionable = value;
    }

    /**
     * Gets the value of the mileageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMileageIndicator() {
        return mileageIndicator;
    }

    /**
     * Sets the value of the mileageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMileageIndicator(Boolean value) {
        this.mileageIndicator = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
