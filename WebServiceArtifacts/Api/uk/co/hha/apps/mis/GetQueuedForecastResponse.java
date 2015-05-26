
package uk.co.hha.apps.mis;

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
 *         &lt;element name="GetQueuedForecastResult" type="{http://apps.hha.co.uk/mis}Forecast" minOccurs="0"/>
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
    "getQueuedForecastResult"
})
@XmlRootElement(name = "GetQueuedForecastResponse")
public class GetQueuedForecastResponse {

    @XmlElement(name = "GetQueuedForecastResult")
    protected Forecast getQueuedForecastResult;

    /**
     * Gets the value of the getQueuedForecastResult property.
     * 
     * @return
     *     possible object is
     *     {@link Forecast }
     *     
     */
    public Forecast getGetQueuedForecastResult() {
        return getQueuedForecastResult;
    }

    /**
     * Sets the value of the getQueuedForecastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forecast }
     *     
     */
    public void setGetQueuedForecastResult(Forecast value) {
        this.getQueuedForecastResult = value;
    }

}
