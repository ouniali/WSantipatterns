
package lt.lb.webservices.vilibidvilibor;

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
 *         &lt;element name="getLatestVilibRateResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "getLatestVilibRateResult"
})
@XmlRootElement(name = "getLatestVilibRateResponse")
public class GetLatestVilibRateResponse {

    @XmlElement(required = true)
    protected BigDecimal getLatestVilibRateResult;

    /**
     * Gets the value of the getLatestVilibRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetLatestVilibRateResult() {
        return getLatestVilibRateResult;
    }

    /**
     * Sets the value of the getLatestVilibRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetLatestVilibRateResult(BigDecimal value) {
        this.getLatestVilibRateResult = value;
    }

}
