
package ro.bvb;

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
 *         &lt;element name="GetLastBalancesResult" type="{http://www.bvb.ro}ArrayOfBalanceIdentification" minOccurs="0"/>
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
    "getLastBalancesResult"
})
@XmlRootElement(name = "GetLastBalancesResponse")
public class GetLastBalancesResponse {

    @XmlElement(name = "GetLastBalancesResult")
    protected ArrayOfBalanceIdentification getLastBalancesResult;

    /**
     * Gets the value of the getLastBalancesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBalanceIdentification }
     *     
     */
    public ArrayOfBalanceIdentification getGetLastBalancesResult() {
        return getLastBalancesResult;
    }

    /**
     * Sets the value of the getLastBalancesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBalanceIdentification }
     *     
     */
    public void setGetLastBalancesResult(ArrayOfBalanceIdentification value) {
        this.getLastBalancesResult = value;
    }

}
