
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
 *         &lt;element name="getLBInterestRateResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "getLBInterestRateResult"
})
@XmlRootElement(name = "getLBInterestRateResponse")
public class GetLBInterestRateResponse {

    @XmlElement(required = true)
    protected BigDecimal getLBInterestRateResult;

    /**
     * Gets the value of the getLBInterestRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetLBInterestRateResult() {
        return getLBInterestRateResult;
    }

    /**
     * Sets the value of the getLBInterestRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetLBInterestRateResult(BigDecimal value) {
        this.getLBInterestRateResult = value;
    }

}
