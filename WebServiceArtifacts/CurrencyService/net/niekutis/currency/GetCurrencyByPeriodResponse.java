
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
 *         &lt;element name="getCurrencyByPeriodResult" type="{http://currency.niekutis.net/}ArrayOfCurrencyInfo" minOccurs="0"/>
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
    "getCurrencyByPeriodResult"
})
@XmlRootElement(name = "getCurrencyByPeriodResponse")
public class GetCurrencyByPeriodResponse {

    protected ArrayOfCurrencyInfo getCurrencyByPeriodResult;

    /**
     * Gets the value of the getCurrencyByPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyInfo }
     *     
     */
    public ArrayOfCurrencyInfo getGetCurrencyByPeriodResult() {
        return getCurrencyByPeriodResult;
    }

    /**
     * Sets the value of the getCurrencyByPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyInfo }
     *     
     */
    public void setGetCurrencyByPeriodResult(ArrayOfCurrencyInfo value) {
        this.getCurrencyByPeriodResult = value;
    }

}
