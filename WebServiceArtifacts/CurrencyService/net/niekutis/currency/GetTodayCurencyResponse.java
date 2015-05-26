
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
 *         &lt;element name="getTodayCurencyResult" type="{http://currency.niekutis.net/}CurrencyInfo"/>
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
    "getTodayCurencyResult"
})
@XmlRootElement(name = "getTodayCurencyResponse")
public class GetTodayCurencyResponse {

    @XmlElement(required = true)
    protected CurrencyInfo getTodayCurencyResult;

    /**
     * Gets the value of the getTodayCurencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInfo }
     *     
     */
    public CurrencyInfo getGetTodayCurencyResult() {
        return getTodayCurencyResult;
    }

    /**
     * Sets the value of the getTodayCurencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInfo }
     *     
     */
    public void setGetTodayCurencyResult(CurrencyInfo value) {
        this.getTodayCurencyResult = value;
    }

}
