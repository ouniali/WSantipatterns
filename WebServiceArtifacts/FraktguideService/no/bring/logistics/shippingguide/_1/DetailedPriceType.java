
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountWithoutVAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AmountWithVAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedPriceType", propOrder = {
    "amountWithoutVAT",
    "vat",
    "amountWithVAT"
})
public class DetailedPriceType {

    @XmlElement(name = "AmountWithoutVAT", required = true)
    protected String amountWithoutVAT;
    @XmlElement(name = "VAT", required = true)
    protected String vat;
    @XmlElement(name = "AmountWithVAT", required = true)
    protected String amountWithVAT;

    /**
     * Gets the value of the amountWithoutVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountWithoutVAT() {
        return amountWithoutVAT;
    }

    /**
     * Sets the value of the amountWithoutVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountWithoutVAT(String value) {
        this.amountWithoutVAT = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAT(String value) {
        this.vat = value;
    }

    /**
     * Gets the value of the amountWithVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountWithVAT() {
        return amountWithVAT;
    }

    /**
     * Sets the value of the amountWithVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountWithVAT(String value) {
        this.amountWithVAT = value;
    }

}
