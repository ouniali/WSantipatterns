
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *               Element indicating that all packages in the package list (PackagesInputType) are part of a single consignment.
 *               If present, produces a ConsignmentOutputType in the response to get consignment (total) price.
 * 
 *               This element is required when certain products are requested (consignment oriented products).
 *               See the fraktguide documentation for which products that require this element.
 *               The field values set on this element does not have to be repeated on each package element,
 *               though if set on a package and it has a different value than the value set on the consignment, an error is returned.
 *           
 * 
 * <p>Java class for ConsignmentInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FromCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDate" type="{http://www.bring.no/logistics/shippingguide/1.0}DateAndTimeType" minOccurs="0"/>
 *         &lt;element name="EarlyCollectionAtTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalServices" type="{http://www.bring.no/logistics/shippingguide/1.0}AdditionalServicesInputType" minOccurs="0"/>
 *         &lt;element name="DangerousGoods" type="{http://www.bring.no/logistics/shippingguide/1.0}DangerousGoodsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentInputType", propOrder = {

})
public class ConsignmentInputType {

    @XmlElement(name = "FromCountryCode", required = true)
    protected String fromCountryCode;
    @XmlElement(name = "FromPostalCode", required = true)
    protected String fromPostalCode;
    @XmlElement(name = "ToCountryCode", required = true)
    protected String toCountryCode;
    @XmlElement(name = "ToPostalCode", required = true)
    protected String toPostalCode;
    @XmlElement(name = "ToCity")
    protected String toCity;
    @XmlElement(name = "ShippingDate")
    protected DateAndTimeType shippingDate;
    @XmlElement(name = "EarlyCollectionAtTerminal")
    protected String earlyCollectionAtTerminal;
    @XmlElement(name = "AdditionalServices")
    protected AdditionalServicesInputType additionalServices;
    @XmlElement(name = "DangerousGoods")
    protected DangerousGoodsType dangerousGoods;

    /**
     * Gets the value of the fromCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryCode() {
        return fromCountryCode;
    }

    /**
     * Sets the value of the fromCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryCode(String value) {
        this.fromCountryCode = value;
    }

    /**
     * Gets the value of the fromPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalCode() {
        return fromPostalCode;
    }

    /**
     * Sets the value of the fromPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalCode(String value) {
        this.fromPostalCode = value;
    }

    /**
     * Gets the value of the toCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryCode() {
        return toCountryCode;
    }

    /**
     * Sets the value of the toCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryCode(String value) {
        this.toCountryCode = value;
    }

    /**
     * Gets the value of the toPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalCode() {
        return toPostalCode;
    }

    /**
     * Sets the value of the toPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalCode(String value) {
        this.toPostalCode = value;
    }

    /**
     * Gets the value of the toCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Sets the value of the toCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

    /**
     * Gets the value of the shippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getShippingDate() {
        return shippingDate;
    }

    /**
     * Sets the value of the shippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setShippingDate(DateAndTimeType value) {
        this.shippingDate = value;
    }

    /**
     * Gets the value of the earlyCollectionAtTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyCollectionAtTerminal() {
        return earlyCollectionAtTerminal;
    }

    /**
     * Sets the value of the earlyCollectionAtTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyCollectionAtTerminal(String value) {
        this.earlyCollectionAtTerminal = value;
    }

    /**
     * Gets the value of the additionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServicesInputType }
     *     
     */
    public AdditionalServicesInputType getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Sets the value of the additionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServicesInputType }
     *     
     */
    public void setAdditionalServices(AdditionalServicesInputType value) {
        this.additionalServices = value;
    }

    /**
     * Gets the value of the dangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsType }
     *     
     */
    public DangerousGoodsType getDangerousGoods() {
        return dangerousGoods;
    }

    /**
     * Sets the value of the dangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsType }
     *     
     */
    public void setDangerousGoods(DangerousGoodsType value) {
        this.dangerousGoods = value;
    }

}
