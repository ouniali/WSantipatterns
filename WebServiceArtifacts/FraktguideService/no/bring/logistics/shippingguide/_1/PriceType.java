
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackagePriceWithoutAdditionalServices" type="{http://www.bring.no/logistics/shippingguide/1.0}DetailedPriceType"/>
 *         &lt;element name="AdditionalServicePrices" type="{http://www.bring.no/logistics/shippingguide/1.0}AdditionalServicePricesType" minOccurs="0"/>
 *         &lt;element name="PackagePriceWithAdditionalServices" type="{http://www.bring.no/logistics/shippingguide/1.0}DetailedPriceType"/>
 *         &lt;element name="CargoPriceAttributes" type="{http://www.bring.no/logistics/shippingguide/1.0}CargoPriceAttributesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="currencyIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="netPriceFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "packagePriceWithoutAdditionalServices",
    "additionalServicePrices",
    "packagePriceWithAdditionalServices",
    "cargoPriceAttributes"
})
public class PriceType {

    @XmlElement(name = "PackagePriceWithoutAdditionalServices", required = true)
    protected DetailedPriceType packagePriceWithoutAdditionalServices;
    @XmlElement(name = "AdditionalServicePrices")
    protected AdditionalServicePricesType additionalServicePrices;
    @XmlElement(name = "PackagePriceWithAdditionalServices", required = true)
    protected DetailedPriceType packagePriceWithAdditionalServices;
    @XmlElement(name = "CargoPriceAttributes")
    protected CargoPriceAttributesType cargoPriceAttributes;
    @XmlAttribute(name = "currencyIdentificationCode")
    protected String currencyIdentificationCode;
    @XmlAttribute(name = "netPriceFailed")
    protected Boolean netPriceFailed;

    /**
     * Gets the value of the packagePriceWithoutAdditionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPriceType }
     *     
     */
    public DetailedPriceType getPackagePriceWithoutAdditionalServices() {
        return packagePriceWithoutAdditionalServices;
    }

    /**
     * Sets the value of the packagePriceWithoutAdditionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPriceType }
     *     
     */
    public void setPackagePriceWithoutAdditionalServices(DetailedPriceType value) {
        this.packagePriceWithoutAdditionalServices = value;
    }

    /**
     * Gets the value of the additionalServicePrices property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServicePricesType }
     *     
     */
    public AdditionalServicePricesType getAdditionalServicePrices() {
        return additionalServicePrices;
    }

    /**
     * Sets the value of the additionalServicePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServicePricesType }
     *     
     */
    public void setAdditionalServicePrices(AdditionalServicePricesType value) {
        this.additionalServicePrices = value;
    }

    /**
     * Gets the value of the packagePriceWithAdditionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPriceType }
     *     
     */
    public DetailedPriceType getPackagePriceWithAdditionalServices() {
        return packagePriceWithAdditionalServices;
    }

    /**
     * Sets the value of the packagePriceWithAdditionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPriceType }
     *     
     */
    public void setPackagePriceWithAdditionalServices(DetailedPriceType value) {
        this.packagePriceWithAdditionalServices = value;
    }

    /**
     * Gets the value of the cargoPriceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CargoPriceAttributesType }
     *     
     */
    public CargoPriceAttributesType getCargoPriceAttributes() {
        return cargoPriceAttributes;
    }

    /**
     * Sets the value of the cargoPriceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoPriceAttributesType }
     *     
     */
    public void setCargoPriceAttributes(CargoPriceAttributesType value) {
        this.cargoPriceAttributes = value;
    }

    /**
     * Gets the value of the currencyIdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIdentificationCode() {
        return currencyIdentificationCode;
    }

    /**
     * Sets the value of the currencyIdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIdentificationCode(String value) {
        this.currencyIdentificationCode = value;
    }

    /**
     * Gets the value of the netPriceFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetPriceFailed() {
        return netPriceFailed;
    }

    /**
     * Sets the value of the netPriceFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetPriceFailed(Boolean value) {
        this.netPriceFailed = value;
    }

}
