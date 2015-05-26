
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
 *         &lt;element name="PriceAndTimeTableV2Result" type="{LinjegodsWebServices}PriceAndTimeTableResult" minOccurs="0"/>
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
    "priceAndTimeTableV2Result"
})
@XmlRootElement(name = "PriceAndTimeTableV2Response")
public class PriceAndTimeTableV2Response {

    @XmlElement(name = "PriceAndTimeTableV2Result")
    protected PriceAndTimeTableResult priceAndTimeTableV2Result;

    /**
     * Gets the value of the priceAndTimeTableV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndTimeTableResult }
     *     
     */
    public PriceAndTimeTableResult getPriceAndTimeTableV2Result() {
        return priceAndTimeTableV2Result;
    }

    /**
     * Sets the value of the priceAndTimeTableV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndTimeTableResult }
     *     
     */
    public void setPriceAndTimeTableV2Result(PriceAndTimeTableResult value) {
        this.priceAndTimeTableV2Result = value;
    }

}
