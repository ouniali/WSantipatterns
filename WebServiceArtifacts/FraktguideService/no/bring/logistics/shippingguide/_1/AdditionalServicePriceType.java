
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServicePriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServicePriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalServicePrice" type="{http://www.bring.no/logistics/shippingguide/1.0}DetailedPriceType"/>
 *         &lt;element name="AdditionalServiceCodeFromProductionSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServicePriceType", propOrder = {
    "additionalServiceId",
    "additionalServiceDescription",
    "additionalServicePrice",
    "additionalServiceCodeFromProductionSystem"
})
public class AdditionalServicePriceType {

    @XmlElement(name = "AdditionalServiceId", required = true)
    protected String additionalServiceId;
    @XmlElement(name = "AdditionalServiceDescription", required = true)
    protected String additionalServiceDescription;
    @XmlElement(name = "AdditionalServicePrice", required = true)
    protected DetailedPriceType additionalServicePrice;
    @XmlElement(name = "AdditionalServiceCodeFromProductionSystem", required = true)
    protected String additionalServiceCodeFromProductionSystem;

    /**
     * Gets the value of the additionalServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceId() {
        return additionalServiceId;
    }

    /**
     * Sets the value of the additionalServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceId(String value) {
        this.additionalServiceId = value;
    }

    /**
     * Gets the value of the additionalServiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceDescription() {
        return additionalServiceDescription;
    }

    /**
     * Sets the value of the additionalServiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceDescription(String value) {
        this.additionalServiceDescription = value;
    }

    /**
     * Gets the value of the additionalServicePrice property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPriceType }
     *     
     */
    public DetailedPriceType getAdditionalServicePrice() {
        return additionalServicePrice;
    }

    /**
     * Sets the value of the additionalServicePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPriceType }
     *     
     */
    public void setAdditionalServicePrice(DetailedPriceType value) {
        this.additionalServicePrice = value;
    }

    /**
     * Gets the value of the additionalServiceCodeFromProductionSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceCodeFromProductionSystem() {
        return additionalServiceCodeFromProductionSystem;
    }

    /**
     * Sets the value of the additionalServiceCodeFromProductionSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceCodeFromProductionSystem(String value) {
        this.additionalServiceCodeFromProductionSystem = value;
    }

}
