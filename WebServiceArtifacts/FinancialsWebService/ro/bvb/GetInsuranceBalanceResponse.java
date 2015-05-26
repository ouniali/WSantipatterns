
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
 *         &lt;element name="GetInsuranceBalanceResult" type="{http://www.bvb.ro}InsuranceBalance" minOccurs="0"/>
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
    "getInsuranceBalanceResult"
})
@XmlRootElement(name = "GetInsuranceBalanceResponse")
public class GetInsuranceBalanceResponse {

    @XmlElement(name = "GetInsuranceBalanceResult")
    protected InsuranceBalance getInsuranceBalanceResult;

    /**
     * Gets the value of the getInsuranceBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBalance }
     *     
     */
    public InsuranceBalance getGetInsuranceBalanceResult() {
        return getInsuranceBalanceResult;
    }

    /**
     * Sets the value of the getInsuranceBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBalance }
     *     
     */
    public void setGetInsuranceBalanceResult(InsuranceBalance value) {
        this.getInsuranceBalanceResult = value;
    }

}
