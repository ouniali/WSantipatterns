
package travelpackage.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ws_2013.PriceValue;


/**
 * <p>Java class for TaxAge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinAge" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PriceSale" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PriceSupplier" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="Comission" type="{WS_2013}PriceValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAge", propOrder = {
    "minAge",
    "maxAge",
    "priceSale",
    "priceSupplier",
    "comission"
})
public class TaxAge {

    @XmlElement(name = "MinAge")
    protected byte minAge;
    @XmlElement(name = "MaxAge")
    protected byte maxAge;
    @XmlElement(name = "PriceSale")
    protected PriceValue priceSale;
    @XmlElement(name = "PriceSupplier")
    protected PriceValue priceSupplier;
    @XmlElement(name = "Comission")
    protected PriceValue comission;

    /**
     * Gets the value of the minAge property.
     * 
     */
    public byte getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     */
    public void setMinAge(byte value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     */
    public byte getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     */
    public void setMaxAge(byte value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the priceSale property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSale() {
        return priceSale;
    }

    /**
     * Sets the value of the priceSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSale(PriceValue value) {
        this.priceSale = value;
    }

    /**
     * Gets the value of the priceSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSupplier() {
        return priceSupplier;
    }

    /**
     * Sets the value of the priceSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSupplier(PriceValue value) {
        this.priceSupplier = value;
    }

    /**
     * Gets the value of the comission property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComission() {
        return comission;
    }

    /**
     * Sets the value of the comission property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComission(PriceValue value) {
        this.comission = value;
    }

}
