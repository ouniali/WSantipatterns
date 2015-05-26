
package common.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCard" type="{WS_2013.Common}CreditCard" minOccurs="0"/>
 *         &lt;element name="ContractingParty" type="{WS_2013.Common}ContractingParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRequest", propOrder = {
    "creditCard",
    "contractingParty"
})
public class PaymentRequest {

    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "ContractingParty")
    protected ContractingParty contractingParty;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the contractingParty property.
     * 
     * @return
     *     possible object is
     *     {@link ContractingParty }
     *     
     */
    public ContractingParty getContractingParty() {
        return contractingParty;
    }

    /**
     * Sets the value of the contractingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractingParty }
     *     
     */
    public void setContractingParty(ContractingParty value) {
        this.contractingParty = value;
    }

}
