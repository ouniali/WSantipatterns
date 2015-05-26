
package lt.lb.webservices.lbinterestrates;

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
 *         &lt;element name="getLatestLBInterestRateResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "getLatestLBInterestRateResult"
})
@XmlRootElement(name = "getLatestLBInterestRateResponse")
public class GetLatestLBInterestRateResponse {

    @XmlElement(required = true)
    protected BigDecimal getLatestLBInterestRateResult;

    /**
     * Gets the value of the getLatestLBInterestRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetLatestLBInterestRateResult() {
        return getLatestLBInterestRateResult;
    }

    /**
     * Sets the value of the getLatestLBInterestRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetLatestLBInterestRateResult(BigDecimal value) {
        this.getLatestLBInterestRateResult = value;
    }

}
