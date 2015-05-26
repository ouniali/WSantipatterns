
package trainpass.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Duration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Duration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelPeriodISO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidityPeriodISO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelPeriod" type="{WS_2013.TrainPass}TimeSpan"/>
 *         &lt;element name="ValidityPeriod" type="{WS_2013.TrainPass}TimeSpan"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duration", propOrder = {
    "travelPeriodISO",
    "validityPeriodISO",
    "travelPeriod",
    "validityPeriod"
})
public class Duration {

    @XmlElement(name = "TravelPeriodISO")
    protected String travelPeriodISO;
    @XmlElement(name = "ValidityPeriodISO")
    protected String validityPeriodISO;
    @XmlElement(name = "TravelPeriod", required = true)
    protected TimeSpan travelPeriod;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected TimeSpan validityPeriod;

    /**
     * Gets the value of the travelPeriodISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPeriodISO() {
        return travelPeriodISO;
    }

    /**
     * Sets the value of the travelPeriodISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPeriodISO(String value) {
        this.travelPeriodISO = value;
    }

    /**
     * Gets the value of the validityPeriodISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityPeriodISO() {
        return validityPeriodISO;
    }

    /**
     * Sets the value of the validityPeriodISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityPeriodISO(String value) {
        this.validityPeriodISO = value;
    }

    /**
     * Gets the value of the travelPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTravelPeriod() {
        return travelPeriod;
    }

    /**
     * Sets the value of the travelPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTravelPeriod(TimeSpan value) {
        this.travelPeriod = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setValidityPeriod(TimeSpan value) {
        this.validityPeriod = value;
    }

}
