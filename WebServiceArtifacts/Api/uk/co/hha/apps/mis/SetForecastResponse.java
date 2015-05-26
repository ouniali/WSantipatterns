
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
 *         &lt;element name="SetForecastResult" type="{http://apps.hha.co.uk/mis}ApiResult" minOccurs="0"/>
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
    "setForecastResult"
})
@XmlRootElement(name = "SetForecastResponse")
public class SetForecastResponse {

    @XmlElement(name = "SetForecastResult")
    protected ApiResult setForecastResult;

    /**
     * Gets the value of the setForecastResult property.
     * 
     * @return
     *     possible object is
     *     {@link ApiResult }
     *     
     */
    public ApiResult getSetForecastResult() {
        return setForecastResult;
    }

    /**
     * Sets the value of the setForecastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiResult }
     *     
     */
    public void setSetForecastResult(ApiResult value) {
        this.setForecastResult = value;
    }

}
