
package net.niekutis.currency;

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
 *         &lt;element name="getCurrencyResult" type="{http://currency.niekutis.net/}CurrencyInfo"/>
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
    "getCurrencyResult"
})
@XmlRootElement(name = "getCurrencyResponse")
public class GetCurrencyResponse {

    @XmlElement(required = true)
    protected CurrencyInfo getCurrencyResult;

    /**
     * Gets the value of the getCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInfo }
     *     
     */
    public CurrencyInfo getGetCurrencyResult() {
        return getCurrencyResult;
    }

    /**
     * Sets the value of the getCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInfo }
     *     
     */
    public void setGetCurrencyResult(CurrencyInfo value) {
        this.getCurrencyResult = value;
    }

}
