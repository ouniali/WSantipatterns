
package linjegodswebservices;

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
 *         &lt;element name="PriceAndTimeTableResult" type="{LinjegodsWebServices}PriceAndTimeTableResult" minOccurs="0"/>
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
    "priceAndTimeTableResult"
})
@XmlRootElement(name = "PriceAndTimeTableResponse")
public class PriceAndTimeTableResponse {

    @XmlElement(name = "PriceAndTimeTableResult")
    protected PriceAndTimeTableResult priceAndTimeTableResult;

    /**
     * Gets the value of the priceAndTimeTableResult property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndTimeTableResult }
     *     
     */
    public PriceAndTimeTableResult getPriceAndTimeTableResult() {
        return priceAndTimeTableResult;
    }

    /**
     * Sets the value of the priceAndTimeTableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndTimeTableResult }
     *     
     */
    public void setPriceAndTimeTableResult(PriceAndTimeTableResult value) {
        this.priceAndTimeTableResult = value;
    }

}
