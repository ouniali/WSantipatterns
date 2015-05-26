
package lt.lb.webservices.vilibidvilibor;

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
 *         &lt;element name="RateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "rateType",
    "dateLow",
    "dateHigh"
})
@XmlRootElement(name = "getVilibRatesByRateType_XmlString")
public class GetVilibRatesByRateTypeXmlString {

    @XmlElement(name = "RateType")
    protected String rateType;
    @XmlElement(name = "DateLow")
    protected String dateLow;
    @XmlElement(name = "DateHigh")
    protected String dateHigh;

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
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
