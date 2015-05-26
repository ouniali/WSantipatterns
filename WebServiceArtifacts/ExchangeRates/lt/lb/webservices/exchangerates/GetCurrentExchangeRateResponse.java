
package lt.lb.webservices.exchangerates;

import java.math.BigDecimal;
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
 *         &lt;element name="getCurrentExchangeRateResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "getCurrentExchangeRateResult"
})
@XmlRootElement(name = "getCurrentExchangeRateResponse")
public class GetCurrentExchangeRateResponse {

    @XmlElement(required = true)
    protected BigDecimal getCurrentExchangeRateResult;

    /**
     * Gets the value of the getCurrentExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetCurrentExchangeRateResult() {
        return getCurrentExchangeRateResult;
    }

    /**
     * Sets the value of the getCurrentExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetCurrentExchangeRateResult(BigDecimal value) {
        this.getCurrentExchangeRateResult = value;
    }

}
