
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductAttributes" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineProductAttributesType"/>
 *         &lt;element name="AdditionalPrices" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineAdditionalPricesType"/>
 *         &lt;element name="ExpectedDeliveryTimes" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineExpectedDeliveryTimesType" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryTimesPerDay" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineExpectedDeliveryTimesPerDayType" minOccurs="0"/>
 *         &lt;element name="PriceZoneForPostalCode" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflinePriceZoneForPostalCodeType" minOccurs="0"/>
 *         &lt;element name="Prices" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflinePricesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineProductType", propOrder = {
    "productAttributes",
    "additionalPrices",
    "expectedDeliveryTimes",
    "expectedDeliveryTimesPerDay",
    "priceZoneForPostalCode",
    "prices"
})
public class OfflineProductType {

    @XmlElement(name = "ProductAttributes", required = true)
    protected OfflineProductAttributesType productAttributes;
    @XmlElement(name = "AdditionalPrices", required = true)
    protected OfflineAdditionalPricesType additionalPrices;
    @XmlElement(name = "ExpectedDeliveryTimes")
    protected OfflineExpectedDeliveryTimesType expectedDeliveryTimes;
    @XmlElement(name = "ExpectedDeliveryTimesPerDay")
    protected OfflineExpectedDeliveryTimesPerDayType expectedDeliveryTimesPerDay;
    @XmlElement(name = "PriceZoneForPostalCode")
    protected OfflinePriceZoneForPostalCodeType priceZoneForPostalCode;
    @XmlElement(name = "Prices")
    protected OfflinePricesType prices;
    @XmlAttribute(name = "productId")
    protected String productId;

    /**
     * Gets the value of the productAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineProductAttributesType }
     *     
     */
    public OfflineProductAttributesType getProductAttributes() {
        return productAttributes;
    }

    /**
     * Sets the value of the productAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineProductAttributesType }
     *     
     */
    public void setProductAttributes(OfflineProductAttributesType value) {
        this.productAttributes = value;
    }

    /**
     * Gets the value of the additionalPrices property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineAdditionalPricesType }
     *     
     */
    public OfflineAdditionalPricesType getAdditionalPrices() {
        return additionalPrices;
    }

    /**
     * Sets the value of the additionalPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineAdditionalPricesType }
     *     
     */
    public void setAdditionalPrices(OfflineAdditionalPricesType value) {
        this.additionalPrices = value;
    }

    /**
     * Gets the value of the expectedDeliveryTimes property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineExpectedDeliveryTimesType }
     *     
     */
    public OfflineExpectedDeliveryTimesType getExpectedDeliveryTimes() {
        return expectedDeliveryTimes;
    }

    /**
     * Sets the value of the expectedDeliveryTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineExpectedDeliveryTimesType }
     *     
     */
    public void setExpectedDeliveryTimes(OfflineExpectedDeliveryTimesType value) {
        this.expectedDeliveryTimes = value;
    }

    /**
     * Gets the value of the expectedDeliveryTimesPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineExpectedDeliveryTimesPerDayType }
     *     
     */
    public OfflineExpectedDeliveryTimesPerDayType getExpectedDeliveryTimesPerDay() {
        return expectedDeliveryTimesPerDay;
    }

    /**
     * Sets the value of the expectedDeliveryTimesPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineExpectedDeliveryTimesPerDayType }
     *     
     */
    public void setExpectedDeliveryTimesPerDay(OfflineExpectedDeliveryTimesPerDayType value) {
        this.expectedDeliveryTimesPerDay = value;
    }

    /**
     * Gets the value of the priceZoneForPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link OfflinePriceZoneForPostalCodeType }
     *     
     */
    public OfflinePriceZoneForPostalCodeType getPriceZoneForPostalCode() {
        return priceZoneForPostalCode;
    }

    /**
     * Sets the value of the priceZoneForPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflinePriceZoneForPostalCodeType }
     *     
     */
    public void setPriceZoneForPostalCode(OfflinePriceZoneForPostalCodeType value) {
        this.priceZoneForPostalCode = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link OfflinePricesType }
     *     
     */
    public OfflinePricesType getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflinePricesType }
     *     
     */
    public void setPrices(OfflinePricesType value) {
        this.prices = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

}
