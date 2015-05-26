
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
 *         &lt;element name="GetCompanyBalanceResult" type="{http://www.bvb.ro}CompanyBalance" minOccurs="0"/>
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
    "getCompanyBalanceResult"
})
@XmlRootElement(name = "GetCompanyBalanceResponse")
public class GetCompanyBalanceResponse {

    @XmlElement(name = "GetCompanyBalanceResult")
    protected CompanyBalance getCompanyBalanceResult;

    /**
     * Gets the value of the getCompanyBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyBalance }
     *     
     */
    public CompanyBalance getGetCompanyBalanceResult() {
        return getCompanyBalanceResult;
    }

    /**
     * Sets the value of the getCompanyBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyBalance }
     *     
     */
    public void setGetCompanyBalanceResult(CompanyBalance value) {
        this.getCompanyBalanceResult = value;
    }

}
