
package com.travelport.schema.vehicle_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.LoyaltyCard;


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
 *         &lt;element name="PermittedVendors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vendor" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedVendors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vendor" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleModifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}RateModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v17_0}typeRateHostIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}LoyaltyCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ReferencePoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedVendors",
    "prohibitedVendors",
    "vehicleModifier",
    "vehicleType",
    "rateModifiers",
    "rateHostIndicator",
    "loyaltyCard",
    "referencePoint"
})
@XmlRootElement(name = "VehicleSearchModifiers")
public class VehicleSearchModifiers {

    @XmlElement(name = "PermittedVendors")
    protected VehicleSearchModifiers.PermittedVendors permittedVendors;
    @XmlElement(name = "ProhibitedVendors")
    protected VehicleSearchModifiers.ProhibitedVendors prohibitedVendors;
    @XmlElement(name = "VehicleModifier")
    protected List<VehicleModifier> vehicleModifier;
    @XmlElement(name = "VehicleType")
    protected List<VehicleType> vehicleType;
    @XmlElement(name = "RateModifiers")
    protected List<RateModifiers> rateModifiers;
    @XmlElement(name = "RateHostIndicator")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "ReferencePoint", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected String referencePoint;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the permittedVendors property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers.PermittedVendors }
     *     
     */
    public VehicleSearchModifiers.PermittedVendors getPermittedVendors() {
        return permittedVendors;
    }

    /**
     * Sets the value of the permittedVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers.PermittedVendors }
     *     
     */
    public void setPermittedVendors(VehicleSearchModifiers.PermittedVendors value) {
        this.permittedVendors = value;
    }

    /**
     * Gets the value of the prohibitedVendors property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers.ProhibitedVendors }
     *     
     */
    public VehicleSearchModifiers.ProhibitedVendors getProhibitedVendors() {
        return prohibitedVendors;
    }

    /**
     * Sets the value of the prohibitedVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers.ProhibitedVendors }
     *     
     */
    public void setProhibitedVendors(VehicleSearchModifiers.ProhibitedVendors value) {
        this.prohibitedVendors = value;
    }

    /**
     * Gets the value of the vehicleModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModifier }
     * 
     * 
     */
    public List<VehicleModifier> getVehicleModifier() {
        if (vehicleModifier == null) {
            vehicleModifier = new ArrayList<VehicleModifier>();
        }
        return this.vehicleModifier;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleType }
     * 
     * 
     */
    public List<VehicleType> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleType>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the rateModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateModifiers }
     * 
     * 
     */
    public List<RateModifiers> getRateModifiers() {
        if (rateModifiers == null) {
            rateModifiers = new ArrayList<RateModifiers>();
        }
        return this.rateModifiers;
    }

    /**
     * Gets the value of the rateHostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    public TypeRateHostIndicator getRateHostIndicator() {
        return rateHostIndicator;
    }

    /**
     * Sets the value of the rateHostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    public void setRateHostIndicator(TypeRateHostIndicator value) {
        this.rateHostIndicator = value;
    }

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Search Car by reference point
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePoint(String value) {
        this.referencePoint = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vendor" maxOccurs="unbounded"/>
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
        "vendor"
    })
    public static class PermittedVendors {

        @XmlElement(name = "Vendor", required = true)
        protected List<Vendor> vendor;

        /**
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vendor }
         * 
         * 
         */
        public List<Vendor> getVendor() {
            if (vendor == null) {
                vendor = new ArrayList<Vendor>();
            }
            return this.vendor;
        }

    }


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
     *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vendor" maxOccurs="unbounded"/>
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
        "vendor"
    })
    public static class ProhibitedVendors {

        @XmlElement(name = "Vendor", required = true)
        protected List<Vendor> vendor;

        /**
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vendor }
         * 
         * 
         */
        public List<Vendor> getVendor() {
            if (vendor == null) {
                vendor = new ArrayList<Vendor>();
            }
            return this.vendor;
        }

    }

}
