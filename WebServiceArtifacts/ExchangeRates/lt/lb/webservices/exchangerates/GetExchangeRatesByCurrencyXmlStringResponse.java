
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
 *         &lt;element name="getExchangeRatesByCurrency_XmlStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getExchangeRatesByCurrencyXmlStringResult"
})
@XmlRootElement(name = "getExchangeRatesByCurrency_XmlStringResponse")
public class GetExchangeRatesByCurrencyXmlStringResponse {

    @XmlElement(name = "getExchangeRatesByCurrency_XmlStringResult")
    protected String getExchangeRatesByCurrencyXmlStringResult;

    /**
     * Gets the value of the getExchangeRatesByCurrencyXmlStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExchangeRatesByCurrencyXmlStringResult() {
        return getExchangeRatesByCurrencyXmlStringResult;
    }

    /**
     * Sets the value of the getExchangeRatesByCurrencyXmlStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExchangeRatesByCurrencyXmlStringResult(String value) {
        this.getExchangeRatesByCurrencyXmlStringResult = value;
    }

}
