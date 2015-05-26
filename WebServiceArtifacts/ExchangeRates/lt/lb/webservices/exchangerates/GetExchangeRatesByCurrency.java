
package lt.lb.webservices.exchangerates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currency",
    "dateLow",
    "dateHigh"
})
@XmlRootElement(name = "getExchangeRatesByCurrency")
public class GetExchangeRatesByCurrency {

    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "DateLow")
    protected String dateLow;
    @XmlElement(name = "DateHigh")
    protected String dateHigh;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dateLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLow() {
        return dateLow;
    }

    /**
     * Sets the value of the dateLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLow(String value) {
        this.dateLow = value;
    }

    /**
     * Gets the value of the dateHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateHigh() {
        return dateHigh;
    }

    /**
     * Sets the value of the dateHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateHigh(String value) {
        this.dateHigh = value;
    }

}
