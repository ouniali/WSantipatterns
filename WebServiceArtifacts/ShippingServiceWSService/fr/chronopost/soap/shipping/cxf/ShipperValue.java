
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shipperValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shipperValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipperAdress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperAdress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCivility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperPreAlert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipperZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipperValue", propOrder = {
    "shipperAdress1",
    "shipperAdress2",
    "shipperCity",
    "shipperCivility",
    "shipperContactName",
    "shipperCountry",
    "shipperCountryName",
    "shipperEmail",
    "shipperMobilePhone",
    "shipperName",
    "shipperName2",
    "shipperPhone",
    "shipperPreAlert",
    "shipperZipCode"
})
public class ShipperValue {

    protected String shipperAdress1;
    protected String shipperAdress2;
    protected String shipperCity;
    protected String shipperCivility;
    protected String shipperContactName;
    protected String shipperCountry;
    protected String shipperCountryName;
    protected String shipperEmail;
    protected String shipperMobilePhone;
    protected String shipperName;
    protected String shipperName2;
    protected String shipperPhone;
    protected int shipperPreAlert;
    protected String shipperZipCode;

    /**
     * Gets the value of the shipperAdress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperAdress1() {
        return shipperAdress1;
    }

    /**
     * Sets the value of the shipperAdress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperAdress1(String value) {
        this.shipperAdress1 = value;
    }

    /**
     * Gets the value of the shipperAdress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperAdress2() {
        return shipperAdress2;
    }

    /**
     * Sets the value of the shipperAdress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperAdress2(String value) {
        this.shipperAdress2 = value;
    }

    /**
     * Gets the value of the shipperCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCity() {
        return shipperCity;
    }

    /**
     * Sets the value of the shipperCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCity(String value) {
        this.shipperCity = value;
    }

    /**
     * Gets the value of the shipperCivility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCivility() {
        return shipperCivility;
    }

    /**
     * Sets the value of the shipperCivility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCivility(String value) {
        this.shipperCivility = value;
    }

    /**
     * Gets the value of the shipperContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperContactName() {
        return shipperContactName;
    }

    /**
     * Sets the value of the shipperContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperContactName(String value) {
        this.shipperContactName = value;
    }

    /**
     * Gets the value of the shipperCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCountry() {
        return shipperCountry;
    }

    /**
     * Sets the value of the shipperCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCountry(String value) {
        this.shipperCountry = value;
    }

    /**
     * Gets the value of the shipperCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCountryName() {
        return shipperCountryName;
    }

    /**
     * Sets the value of the shipperCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCountryName(String value) {
        this.shipperCountryName = value;
    }

    /**
     * Gets the value of the shipperEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperEmail() {
        return shipperEmail;
    }

    /**
     * Sets the value of the shipperEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperEmail(String value) {
        this.shipperEmail = value;
    }

    /**
     * Gets the value of the shipperMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperMobilePhone() {
        return shipperMobilePhone;
    }

    /**
     * Sets the value of the shipperMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperMobilePhone(String value) {
        this.shipperMobilePhone = value;
    }

    /**
     * Gets the value of the shipperName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * Sets the value of the shipperName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName(String value) {
        this.shipperName = value;
    }

    /**
     * Gets the value of the shipperName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName2() {
        return shipperName2;
    }

    /**
     * Sets the value of the shipperName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName2(String value) {
        this.shipperName2 = value;
    }

    /**
     * Gets the value of the shipperPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperPhone() {
        return shipperPhone;
    }

    /**
     * Sets the value of the shipperPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperPhone(String value) {
        this.shipperPhone = value;
    }

    /**
     * Gets the value of the shipperPreAlert property.
     * 
     */
    public int getShipperPreAlert() {
        return shipperPreAlert;
    }

    /**
     * Sets the value of the shipperPreAlert property.
     * 
     */
    public void setShipperPreAlert(int value) {
        this.shipperPreAlert = value;
    }

    /**
     * Gets the value of the shipperZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperZipCode() {
        return shipperZipCode;
    }

    /**
     * Sets the value of the shipperZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperZipCode(String value) {
        this.shipperZipCode = value;
    }

}
