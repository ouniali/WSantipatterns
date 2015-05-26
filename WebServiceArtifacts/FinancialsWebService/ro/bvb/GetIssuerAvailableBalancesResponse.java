
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
 *         &lt;element name="GetIssuerAvailableBalancesResult" type="{http://www.bvb.ro}ArrayOfSymbolBalanceTypeIdentification" minOccurs="0"/>
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
    "getIssuerAvailableBalancesResult"
})
@XmlRootElement(name = "GetIssuerAvailableBalancesResponse")
public class GetIssuerAvailableBalancesResponse {

    @XmlElement(name = "GetIssuerAvailableBalancesResult")
    protected ArrayOfSymbolBalanceTypeIdentification getIssuerAvailableBalancesResult;

    /**
     * Gets the value of the getIssuerAvailableBalancesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSymbolBalanceTypeIdentification }
     *     
     */
    public ArrayOfSymbolBalanceTypeIdentification getGetIssuerAvailableBalancesResult() {
        return getIssuerAvailableBalancesResult;
    }

    /**
     * Sets the value of the getIssuerAvailableBalancesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSymbolBalanceTypeIdentification }
     *     
     */
    public void setGetIssuerAvailableBalancesResult(ArrayOfSymbolBalanceTypeIdentification value) {
        this.getIssuerAvailableBalancesResult = value;
    }

}
