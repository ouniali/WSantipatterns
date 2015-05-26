
package fr.chronopost.soap.shipping.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingMultiParcelWithReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingMultiParcelWithReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esdValue" type="{http://cxf.shipping.soap.chronopost.fr/}esdWithRefClientValue" minOccurs="0"/>
 *         &lt;element name="headerValue" type="{http://cxf.shipping.soap.chronopost.fr/}headerValue" minOccurs="0"/>
 *         &lt;element name="shipperValue" type="{http://cxf.shipping.soap.chronopost.fr/}shipperValue" minOccurs="0"/>
 *         &lt;element name="customerValue" type="{http://cxf.shipping.soap.chronopost.fr/}customerValue" minOccurs="0"/>
 *         &lt;element name="recipientValue" type="{http://cxf.shipping.soap.chronopost.fr/}recipientValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refValue" type="{http://cxf.shipping.soap.chronopost.fr/}refValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="skybillValue" type="{http://cxf.shipping.soap.chronopost.fr/}skybillWithDimensionsValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="skybillParamsValue" type="{http://cxf.shipping.soap.chronopost.fr/}skybillParamsValue" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modeRetour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfParcel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiParcel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduledValue" type="{http://cxf.shipping.soap.chronopost.fr/}scheduledValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingMultiParcelWithReservation", propOrder = {
    "esdValue",
    "headerValue",
    "shipperValue",
    "customerValue",
    "recipientValue",
    "refValue",
    "skybillValue",
    "skybillParamsValue",
    "password",
    "modeRetour",
    "numberOfParcel",
    "version",
    "multiParcel",
    "scheduledValue"
})
public class ShippingMultiParcelWithReservation {

    protected EsdWithRefClientValue esdValue;
    protected HeaderValue headerValue;
    protected ShipperValue shipperValue;
    protected CustomerValue customerValue;
    protected List<RecipientValue> recipientValue;
    protected List<RefValue> refValue;
    protected List<SkybillWithDimensionsValue> skybillValue;
    protected SkybillParamsValue skybillParamsValue;
    protected String password;
    protected String modeRetour;
    protected int numberOfParcel;
    protected String version;
    protected String multiParcel;
    protected ScheduledValue scheduledValue;

    /**
     * Gets the value of the esdValue property.
     * 
     * @return
     *     possible object is
     *     {@link EsdWithRefClientValue }
     *     
     */
    public EsdWithRefClientValue getEsdValue() {
        return esdValue;
    }

    /**
     * Sets the value of the esdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsdWithRefClientValue }
     *     
     */
    public void setEsdValue(EsdWithRefClientValue value) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipientValue }
     * 
     * 
     */
    public List<RecipientValue> getRecipientValue() {
        if (recipientValue == null) {
            recipientValue = new ArrayList<RecipientValue>();
        }
        return this.recipientValue;
    }

    /**
     * Gets the value of the refValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefValue }
     * 
     * 
     */
    public List<RefValue> getRefValue() {
        if (refValue == null) {
            refValue = new ArrayList<RefValue>();
        }
        return this.refValue;
    }

    /**
     * Gets the value of the skybillValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skybillValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkybillValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkybillWithDimensionsValue }
     * 
     * 
     */
    public List<SkybillWithDimensionsValue> getSkybillValue() {
        if (skybillValue == null) {
            skybillValue = new ArrayList<SkybillWithDimensionsValue>();
        }
        return this.skybillValue;
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

    /**
     * Gets the value of the numberOfParcel property.
     * 
     */
    public int getNumberOfParcel() {
        return numberOfParcel;
    }

    /**
     * Sets the value of the numberOfParcel property.
     * 
     */
    public void setNumberOfParcel(int value) {
        this.numberOfParcel = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the multiParcel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiParcel() {
        return multiParcel;
    }

    /**
     * Sets the value of the multiParcel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiParcel(String value) {
        this.multiParcel = value;
    }

    /**
     * Gets the value of the scheduledValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledValue }
     *     
     */
    public ScheduledValue getScheduledValue() {
        return scheduledValue;
    }

    /**
     * Sets the value of the scheduledValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledValue }
     *     
     */
    public void setScheduledValue(ScheduledValue value) {
        this.scheduledValue = value;
    }

}
