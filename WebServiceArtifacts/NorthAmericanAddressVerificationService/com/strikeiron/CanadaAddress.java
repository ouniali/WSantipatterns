
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanadaAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanadaAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.strikeiron.com}Address">
 *       &lt;sequence>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CivicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CivicSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryModeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryModeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryInstallationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryInstallationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryInstallationQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoCode" type="{http://www.strikeiron.com}Geocode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanadaAddress", propOrder = {
    "postalCode",
    "province",
    "civicNumber",
    "civicSuffix",
    "deliveryModeType",
    "deliveryModeNumber",
    "deliveryInstallationArea",
    "deliveryInstallationType",
    "deliveryInstallationQualifier",
    "geoCode"
})
public class CanadaAddress
    extends Address
{

    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "CivicNumber")
    protected String civicNumber;
    @XmlElement(name = "CivicSuffix")
    protected String civicSuffix;
    @XmlElement(name = "DeliveryModeType")
    protected String deliveryModeType;
    @XmlElement(name = "DeliveryModeNumber")
    protected String deliveryModeNumber;
    @XmlElement(name = "DeliveryInstallationArea")
    protected String deliveryInstallationArea;
    @XmlElement(name = "DeliveryInstallationType")
    protected String deliveryInstallationType;
    @XmlElement(name = "DeliveryInstallationQualifier")
    protected String deliveryInstallationQualifier;
    @XmlElement(name = "GeoCode")
    protected Geocode geoCode;

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the civicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicNumber() {
        return civicNumber;
    }

    /**
     * Sets the value of the civicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicNumber(String value) {
        this.civicNumber = value;
    }

    /**
     * Gets the value of the civicSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicSuffix() {
        return civicSuffix;
    }

    /**
     * Sets the value of the civicSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicSuffix(String value) {
        this.civicSuffix = value;
    }

    /**
     * Gets the value of the deliveryModeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryModeType() {
        return deliveryModeType;
    }

    /**
     * Sets the value of the deliveryModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryModeType(String value) {
        this.deliveryModeType = value;
    }

    /**
     * Gets the value of the deliveryModeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryModeNumber() {
        return deliveryModeNumber;
    }

    /**
     * Sets the value of the deliveryModeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryModeNumber(String value) {
        this.deliveryModeNumber = value;
    }

    /**
     * Gets the value of the deliveryInstallationArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstallationArea() {
        return deliveryInstallationArea;
    }

    /**
     * Sets the value of the deliveryInstallationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstallationArea(String value) {
        this.deliveryInstallationArea = value;
    }

    /**
     * Gets the value of the deliveryInstallationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstallationType() {
        return deliveryInstallationType;
    }

    /**
     * Sets the value of the deliveryInstallationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstallationType(String value) {
        this.deliveryInstallationType = value;
    }

    /**
     * Gets the value of the deliveryInstallationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstallationQualifier() {
        return deliveryInstallationQualifier;
    }

    /**
     * Sets the value of the deliveryInstallationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstallationQualifier(String value) {
        this.deliveryInstallationQualifier = value;
    }

    /**
     * Gets the value of the geoCode property.
     * 
     * @return
     *     possible object is
     *     {@link Geocode }
     *     
     */
    public Geocode getGeoCode() {
        return geoCode;
    }

    /**
     * Sets the value of the geoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geocode }
     *     
     */
    public void setGeoCode(Geocode value) {
        this.geoCode = value;
    }

}
