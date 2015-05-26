
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
 *         &lt;element name="GetInvestmentFundsBalanceResult" type="{http://www.bvb.ro}InvestmentFundBalance" minOccurs="0"/>
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
    "getInvestmentFundsBalanceResult"
})
@XmlRootElement(name = "GetInvestmentFundsBalanceResponse")
public class GetInvestmentFundsBalanceResponse {

    @XmlElement(name = "GetInvestmentFundsBalanceResult")
    protected InvestmentFundBalance getInvestmentFundsBalanceResult;

    /**
     * Gets the value of the getInvestmentFundsBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundBalance }
     *     
     */
    public InvestmentFundBalance getGetInvestmentFundsBalanceResult() {
        return getInvestmentFundsBalanceResult;
    }

    /**
     * Sets the value of the getInvestmentFundsBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundBalance }
     *     
     */
    public void setGetInvestmentFundsBalanceResult(InvestmentFundBalance value) {
        this.getInvestmentFundsBalanceResult = value;
    }

}
