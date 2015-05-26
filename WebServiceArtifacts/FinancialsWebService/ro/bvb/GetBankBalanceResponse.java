
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
 *         &lt;element name="GetBankBalanceResult" type="{http://www.bvb.ro}BankBalance" minOccurs="0"/>
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
    "getBankBalanceResult"
})
@XmlRootElement(name = "GetBankBalanceResponse")
public class GetBankBalanceResponse {

    @XmlElement(name = "GetBankBalanceResult")
    protected BankBalance getBankBalanceResult;

    /**
     * Gets the value of the getBankBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BankBalance }
     *     
     */
    public BankBalance getGetBankBalanceResult() {
        return getBankBalanceResult;
    }

    /**
     * Sets the value of the getBankBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankBalance }
     *     
     */
    public void setGetBankBalanceResult(BankBalance value) {
        this.getBankBalanceResult = value;
    }

}
