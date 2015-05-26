
package kr.co.rts;

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
 *         &lt;element name="GetHotelPriceCheckResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getHotelPriceCheckResult"
})
@XmlRootElement(name = "GetHotelPriceCheckResponse")
public class GetHotelPriceCheckResponse {

    @XmlElement(name = "GetHotelPriceCheckResult")
    protected String getHotelPriceCheckResult;

    /**
     * Gets the value of the getHotelPriceCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetHotelPriceCheckResult() {
        return getHotelPriceCheckResult;
    }

    /**
     * Sets the value of the getHotelPriceCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetHotelPriceCheckResult(String value) {
        this.getHotelPriceCheckResult = value;
    }

}
