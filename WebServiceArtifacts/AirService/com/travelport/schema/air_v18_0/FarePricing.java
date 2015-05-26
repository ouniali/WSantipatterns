
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="PassengerType" type="{http://www.travelport.com/schema/common_v15_0}typePTC" />
 *       &lt;attribute name="TotalFareAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="PrivateFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TotalNetFareAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="BaseFare" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FarePricing")
public class FarePricing {

    @XmlAttribute(name = "PassengerType")
    protected String passengerType;
    @XmlAttribute(name = "TotalFareAmount")
    protected String totalFareAmount;
    @XmlAttribute(name = "PrivateFare")
    protected Boolean privateFare;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "TotalNetFareAmount")
    protected String totalNetFareAmount;
    @XmlAttribute(name = "BaseFare")
    protected String baseFare;
    @XmlAttribute(name = "Taxes")
    protected String taxes;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the totalFareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareAmount() {
        return totalFareAmount;
    }

    /**
     * Sets the value of the totalFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareAmount(String value) {
        this.totalFareAmount = value;
    }

    /**
     * Gets the value of the privateFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateFare() {
        return privateFare;
    }

    /**
     * Sets the value of the privateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateFare(Boolean value) {
        this.privateFare = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFare() {
        return negotiatedFare;
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the totalNetFareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNetFareAmount() {
        return totalNetFareAmount;
    }

    /**
     * Sets the value of the totalNetFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNetFareAmount(String value) {
        this.totalNetFareAmount = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value) {
        this.baseFare = value;
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
