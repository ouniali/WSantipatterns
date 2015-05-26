
package net.niekutis.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getCurrenciesResult" type="{http://currency.niekutis.net/}ArrayOfCurrencyInfo" minOccurs="0"/>
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
    "getCurrenciesResult"
})
@XmlRootElement(name = "getCurrenciesResponse")
public class GetCurrenciesResponse {

    protected ArrayOfCurrencyInfo getCurrenciesResult;

    /**
     * Gets the value of the getCurrenciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyInfo }
     *     
     */
    public ArrayOfCurrencyInfo getGetCurrenciesResult() {
        return getCurrenciesResult;
    }

    /**
     * Sets the value of the getCurrenciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyInfo }
     *     
     */
    public void setGetCurrenciesResult(ArrayOfCurrencyInfo value) {
        this.getCurrenciesResult = value;
    }

}
