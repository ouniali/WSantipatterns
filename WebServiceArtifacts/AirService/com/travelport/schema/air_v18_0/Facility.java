
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.Remark;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Remark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PassengerSeatPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeFacility" />
 *       &lt;attribute name="SeatCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Availability" type="{http://www.travelport.com/schema/air_v18_0}typeSeatAvailability" />
 *       &lt;attribute name="SeatPrice" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceSubCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SSRCode" type="{http://www.travelport.com/schema/common_v15_0}typeSSRCode" />
 *       &lt;attribute name="IssuanceReason">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BaseSeatPrice" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "characteristic",
    "remark",
    "passengerSeatPrice"
})
@XmlRootElement(name = "Facility")
public class Facility {

    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Remark> remark;
    @XmlElement(name = "PassengerSeatPrice")
    protected List<PassengerSeatPrice> passengerSeatPrice;
    @XmlAttribute(name = "Type", required = true)
    protected TypeFacility type;
    @XmlAttribute(name = "SeatCode")
    protected String seatCode;
    @XmlAttribute(name = "Availability")
    protected TypeSeatAvailability availability;
    @XmlAttribute(name = "SeatPrice")
    protected String seatPrice;
    @XmlAttribute(name = "Paid")
    protected Boolean paid;
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "IssuanceReason")
    protected String issuanceReason;
    @XmlAttribute(name = "BaseSeatPrice")
    protected String baseSeatPrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * 
     * 
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<Remark>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the passengerSeatPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerSeatPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerSeatPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerSeatPrice }
     * 
     * 
     */
    public List<PassengerSeatPrice> getPassengerSeatPrice() {
        if (passengerSeatPrice == null) {
            passengerSeatPrice = new ArrayList<PassengerSeatPrice>();
        }
        return this.passengerSeatPrice;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFacility }
     *     
     */
    public TypeFacility getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFacility }
     *     
     */
    public void setType(TypeFacility value) {
        this.type = value;
    }

    /**
     * Gets the value of the seatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatCode() {
        return seatCode;
    }

    /**
     * Sets the value of the seatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatCode(String value) {
        this.seatCode = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSeatAvailability }
     *     
     */
    public TypeSeatAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSeatAvailability }
     *     
     */
    public void setAvailability(TypeSeatAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the seatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPrice() {
        return seatPrice;
    }

    /**
     * Sets the value of the seatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPrice(String value) {
        this.seatPrice = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaid(Boolean value) {
        this.paid = value;
    }

    /**
     * Gets the value of the serviceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the issuanceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceReason() {
        return issuanceReason;
    }

    /**
     * Sets the value of the issuanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceReason(String value) {
        this.issuanceReason = value;
    }

    /**
     * Gets the value of the baseSeatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSeatPrice() {
        return baseSeatPrice;
    }

    /**
     * Sets the value of the baseSeatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSeatPrice(String value) {
        this.baseSeatPrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

}
