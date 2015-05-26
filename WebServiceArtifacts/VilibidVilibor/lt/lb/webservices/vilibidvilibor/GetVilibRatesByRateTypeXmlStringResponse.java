
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
 *         &lt;element name="getVilibRatesByRateType_XmlStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getVilibRatesByRateTypeXmlStringResult"
})
@XmlRootElement(name = "getVilibRatesByRateType_XmlStringResponse")
public class GetVilibRatesByRateTypeXmlStringResponse {

    @XmlElement(name = "getVilibRatesByRateType_XmlStringResult")
    protected String getVilibRatesByRateTypeXmlStringResult;

    /**
     * Gets the value of the getVilibRatesByRateTypeXmlStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetVilibRatesByRateTypeXmlStringResult() {
        return getVilibRatesByRateTypeXmlStringResult;
    }

    /**
     * Sets the value of the getVilibRatesByRateTypeXmlStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetVilibRatesByRateTypeXmlStringResult(String value) {
        this.getVilibRatesByRateTypeXmlStringResult = value;
    }

}
