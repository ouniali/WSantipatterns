
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recipientValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recipientValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipientAdress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAdress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPreAlert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recipientZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipientValue", propOrder = {
    "recipientAdress1",
    "recipientAdress2",
    "recipientCity",
    "recipientContactName",
    "recipientCountry",
    "recipientCountryName",
    "recipientEmail",
    "recipientMobilePhone",
    "recipientName",
    "recipientName2",
    "recipientPhone",
    "recipientPreAlert",
    "recipientZipCode"
})
public class RecipientValue {

    protected String recipientAdress1;
    protected String recipientAdress2;
    protected String recipientCity;
    protected String recipientContactName;
    protected String recipientCountry;
    protected String recipientCountryName;
    protected String recipientEmail;
    protected String recipientMobilePhone;
    protected String recipientName;
    protected String recipientName2;
    protected String recipientPhone;
    protected int recipientPreAlert;
    protected String recipientZipCode;

    /**
     * Gets the value of the recipientAdress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAdress1() {
        return recipientAdress1;
    }

    /**
     * Sets the value of the recipientAdress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAdress1(String value) {
        this.recipientAdress1 = value;
    }

    /**
     * Gets the value of the recipientAdress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAdress2() {
        return recipientAdress2;
    }

    /**
     * Sets the value of the recipientAdress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAdress2(String value) {
        this.recipientAdress2 = value;
    }

    /**
     * Gets the value of the recipientCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCity() {
        return recipientCity;
    }

    /**
     * Sets the value of the recipientCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCity(String value) {
        this.recipientCity = value;
    }

    /**
     * Gets the value of the recipientContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientContactName() {
        return recipientContactName;
    }

    /**
     * Sets the value of the recipientContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientContactName(String value) {
        this.recipientContactName = value;
    }

    /**
     * Gets the value of the recipientCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCountry() {
        return recipientCountry;
    }

    /**
     * Sets the value of the recipientCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCountry(String value) {
        this.recipientCountry = value;
    }

    /**
     * Gets the value of the recipientCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCountryName() {
        return recipientCountryName;
    }

    /**
     * Sets the value of the recipientCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCountryName(String value) {
        this.recipientCountryName = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

    /**
     * Gets the value of the recipientMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientMobilePhone() {
        return recipientMobilePhone;
    }

    /**
     * Sets the value of the recipientMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientMobilePhone(String value) {
        this.recipientMobilePhone = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName2() {
        return recipientName2;
    }

    /**
     * Sets the value of the recipientName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName2(String value) {
        this.recipientName2 = value;
    }

    /**
     * Gets the value of the recipientPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * Sets the value of the recipientPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPhone(String value) {
        this.recipientPhone = value;
    }

    /**
     * Gets the value of the recipientPreAlert property.
     * 
     */
    public int getRecipientPreAlert() {
        return recipientPreAlert;
    }

    /**
     * Sets the value of the recipientPreAlert property.
     * 
     */
    public void setRecipientPreAlert(int value) {
        this.recipientPreAlert = value;
    }

    /**
     * Gets the value of the recipientZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientZipCode() {
        return recipientZipCode;
    }

    /**
     * Sets the value of the recipientZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientZipCode(String value) {
        this.recipientZipCode = value;
    }

}
