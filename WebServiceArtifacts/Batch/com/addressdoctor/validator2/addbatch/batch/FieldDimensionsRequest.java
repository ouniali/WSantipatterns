
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDimensionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDimensionsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="POBox" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionSingleLineType" minOccurs="0"/>
 *         &lt;element name="Locality" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionSingleLineType" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionSingleLineType" minOccurs="0"/>
 *         &lt;element name="CountrySpecificLocalityLine" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionSingleLineType" minOccurs="0"/>
 *         &lt;element name="DeliveryAddressLines" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionMultiLineType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDimensionsRequest", propOrder = {
    "organization",
    "contact",
    "building",
    "street",
    "poBox",
    "locality",
    "postalCode",
    "province",
    "country",
    "countrySpecificLocalityLine",
    "deliveryAddressLines",
    "formattedAddress"
})
public class FieldDimensionsRequest {

    @XmlElement(name = "Organization")
    protected FieldDimensionMultiLineType organization;
    @XmlElement(name = "Contact")
    protected FieldDimensionMultiLineType contact;
    @XmlElement(name = "Building")
    protected FieldDimensionMultiLineType building;
    @XmlElement(name = "Street")
    protected FieldDimensionMultiLineType street;
    @XmlElement(name = "POBox")
    protected FieldDimensionSingleLineType poBox;
    @XmlElement(name = "Locality")
    protected FieldDimensionMultiLineType locality;
    @XmlElement(name = "PostalCode")
    protected FieldDimensionSingleLineType postalCode;
    @XmlElement(name = "Province")
    protected FieldDimensionMultiLineType province;
    @XmlElement(name = "Country")
    protected FieldDimensionSingleLineType country;
    @XmlElement(name = "CountrySpecificLocalityLine")
    protected FieldDimensionSingleLineType countrySpecificLocalityLine;
    @XmlElement(name = "DeliveryAddressLines")
    protected FieldDimensionMultiLineType deliveryAddressLines;
    @XmlElement(name = "FormattedAddress")
    protected FieldDimensionMultiLineType formattedAddress;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setOrganization(FieldDimensionMultiLineType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setContact(FieldDimensionMultiLineType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setBuilding(FieldDimensionMultiLineType value) {
        this.building = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setStreet(FieldDimensionMultiLineType value) {
        this.street = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public FieldDimensionSingleLineType getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public void setPOBox(FieldDimensionSingleLineType value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setLocality(FieldDimensionMultiLineType value) {
        this.locality = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public FieldDimensionSingleLineType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public void setPostalCode(FieldDimensionSingleLineType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setProvince(FieldDimensionMultiLineType value) {
        this.province = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public FieldDimensionSingleLineType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public void setCountry(FieldDimensionSingleLineType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySpecificLocalityLine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public FieldDimensionSingleLineType getCountrySpecificLocalityLine() {
        return countrySpecificLocalityLine;
    }

    /**
     * Sets the value of the countrySpecificLocalityLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionSingleLineType }
     *     
     */
    public void setCountrySpecificLocalityLine(FieldDimensionSingleLineType value) {
        this.countrySpecificLocalityLine = value;
    }

    /**
     * Gets the value of the deliveryAddressLines property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getDeliveryAddressLines() {
        return deliveryAddressLines;
    }

    /**
     * Sets the value of the deliveryAddressLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setDeliveryAddressLines(FieldDimensionMultiLineType value) {
        this.deliveryAddressLines = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public FieldDimensionMultiLineType getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionMultiLineType }
     *     
     */
    public void setFormattedAddress(FieldDimensionMultiLineType value) {
        this.formattedAddress = value;
    }

}
