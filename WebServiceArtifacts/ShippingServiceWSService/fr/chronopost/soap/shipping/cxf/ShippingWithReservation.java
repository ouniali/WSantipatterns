
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingWithReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingWithReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esdValue" type="{http://cxf.shipping.soap.chronopost.fr/}esdValue" minOccurs="0"/>
 *         &lt;element name="headerValue" type="{http://cxf.shipping.soap.chronopost.fr/}headerValue" minOccurs="0"/>
 *         &lt;element name="shipperValue" type="{http://cxf.shipping.soap.chronopost.fr/}shipperValue" minOccurs="0"/>
 *         &lt;element name="customerValue" type="{http://cxf.shipping.soap.chronopost.fr/}customerValue" minOccurs="0"/>
 *         &lt;element name="recipientValue" type="{http://cxf.shipping.soap.chronopost.fr/}recipientValue" minOccurs="0"/>
 *         &lt;element name="refValue" type="{http://cxf.shipping.soap.chronopost.fr/}refValue" minOccurs="0"/>
 *         &lt;element name="skybillValue" type="{http://cxf.shipping.soap.chronopost.fr/}skybillValue" minOccurs="0"/>
 *         &lt;element name="skybillParamsValue" type="{http://cxf.shipping.soap.chronopost.fr/}skybillParamsValue" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modeRetour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingWithReservation", propOrder = {
    "esdValue",
    "headerValue",
    "shipperValue",
    "customerValue",
    "recipientValue",
    "refValue",
    "skybillValue",
    "skybillParamsValue",
    "password",
    "modeRetour"
})
public class ShippingWithReservation {

    protected EsdValue esdValue;
    protected HeaderValue headerValue;
    protected ShipperValue shipperValue;
    protected CustomerValue customerValue;
    protected RecipientValue recipientValue;
    protected RefValue refValue;
    protected SkybillValue skybillValue;
    protected SkybillParamsValue skybillParamsValue;
    protected String password;
    protected String modeRetour;

    /**
     * Gets the value of the esdValue property.
     * 
     * @return
     *     possible object is
     *     {@link EsdValue }
     *     
     */
    public EsdValue getEsdValue() {
        return esdValue;
    }

    /**
     * Sets the value of the esdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsdValue }
     *     
     */
    public void setEsdValue(EsdValue value) {
        this.esdValue = value;
    }

    /**
     * Gets the value of the headerValue property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderValue }
     *     
     */
    public HeaderValue getHeaderValue() {
        return headerValue;
    }

    /**
     * Sets the value of the headerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderValue }
     *     
     */
    public void setHeaderValue(HeaderValue value) {
        this.headerValue = value;
    }

    /**
     * Gets the value of the shipperValue property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperValue }
     *     
     */
    public ShipperValue getShipperValue() {
        return shipperValue;
    }

    /**
     * Sets the value of the shipperValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperValue }
     *     
     */
    public void setShipperValue(ShipperValue value) {
        this.shipperValue = value;
    }

    /**
     * Gets the value of the customerValue property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerValue }
     *     
     */
    public CustomerValue getCustomerValue() {
        return customerValue;
    }

    /**
     * Sets the value of the customerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerValue }
     *     
     */
    public void setCustomerValue(CustomerValue value) {
        this.customerValue = value;
    }

    /**
     * Gets the value of the recipientValue property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientValue }
     *     
     */
    public RecipientValue getRecipientValue() {
        return recipientValue;
    }

    /**
     * Sets the value of the recipientValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientValue }
     *     
     */
    public void setRecipientValue(RecipientValue value) {
        this.recipientValue = value;
    }

    /**
     * Gets the value of the refValue property.
     * 
     * @return
     *     possible object is
     *     {@link RefValue }
     *     
     */
    public RefValue getRefValue() {
        return refValue;
    }

    /**
     * Sets the value of the refValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefValue }
     *     
     */
    public void setRefValue(RefValue value) {
        this.refValue = value;
    }

    /**
     * Gets the value of the skybillValue property.
     * 
     * @return
     *     possible object is
     *     {@link SkybillValue }
     *     
     */
    public SkybillValue getSkybillValue() {
        return skybillValue;
    }

    /**
     * Sets the value of the skybillValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkybillValue }
     *     
     */
    public void setSkybillValue(SkybillValue value) {
        this.skybillValue = value;
    }

    /**
     * Gets the value of the skybillParamsValue property.
     * 
     * @return
     *     possible object is
     *     {@link SkybillParamsValue }
     *     
     */
    public SkybillParamsValue getSkybillParamsValue() {
        return skybillParamsValue;
    }

    /**
     * Sets the value of the skybillParamsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkybillParamsValue }
     *     
     */
    public void setSkybillParamsValue(SkybillParamsValue value) {
        this.skybillParamsValue = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the modeRetour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeRetour() {
        return modeRetour;
    }

    /**
     * Sets the value of the modeRetour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeRetour(String value) {
        this.modeRetour = value;
    }

}
