
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
 *         &lt;element name="GetLiveSensorsResult" type="{http://apps.hha.co.uk/mis}Sensors" minOccurs="0"/>
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
    "getLiveSensorsResult"
})
@XmlRootElement(name = "GetLiveSensorsResponse")
public class GetLiveSensorsResponse {

    @XmlElement(name = "GetLiveSensorsResult")
    protected Sensors getLiveSensorsResult;

    /**
     * Gets the value of the getLiveSensorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Sensors }
     *     
     */
    public Sensors getGetLiveSensorsResult() {
        return getLiveSensorsResult;
    }

    /**
     * Sets the value of the getLiveSensorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sensors }
     *     
     */
    public void setGetLiveSensorsResult(Sensors value) {
        this.getLiveSensorsResult = value;
    }

}
