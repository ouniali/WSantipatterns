
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
 *         &lt;element name="GetBalanceTypeResult" type="{http://www.bvb.ro}CompanyBalanceTypeIdentification" minOccurs="0"/>
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
    "getBalanceTypeResult"
})
@XmlRootElement(name = "GetBalanceTypeResponse")
public class GetBalanceTypeResponse {

    @XmlElement(name = "GetBalanceTypeResult")
    protected CompanyBalanceTypeIdentification getBalanceTypeResult;

    /**
     * Gets the value of the getBalanceTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyBalanceTypeIdentification }
     *     
     */
    public CompanyBalanceTypeIdentification getGetBalanceTypeResult() {
        return getBalanceTypeResult;
    }

    /**
     * Sets the value of the getBalanceTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyBalanceTypeIdentification }
     *     
     */
    public void setGetBalanceTypeResult(CompanyBalanceTypeIdentification value) {
        this.getBalanceTypeResult = value;
    }

}
