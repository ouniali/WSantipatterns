
package lt.lb.webservices.lbinterestrates;

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
 *         &lt;element name="getLBInterestRatesByRateType_XmlStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getLBInterestRatesByRateTypeXmlStringResult"
})
@XmlRootElement(name = "getLBInterestRatesByRateType_XmlStringResponse")
public class GetLBInterestRatesByRateTypeXmlStringResponse {

    @XmlElement(name = "getLBInterestRatesByRateType_XmlStringResult")
    protected String getLBInterestRatesByRateTypeXmlStringResult;

    /**
     * Gets the value of the getLBInterestRatesByRateTypeXmlStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetLBInterestRatesByRateTypeXmlStringResult() {
        return getLBInterestRatesByRateTypeXmlStringResult;
    }

    /**
     * Sets the value of the getLBInterestRatesByRateTypeXmlStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetLBInterestRatesByRateTypeXmlStringResult(String value) {
        this.getLBInterestRatesByRateTypeXmlStringResult = value;
    }

}
