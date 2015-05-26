
package trainpass.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerTypeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerTypeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{WS_2013.TrainPass}ePassengerType"/>
 *         &lt;element name="AgeRange" type="{WS_2013.TrainPass}Range" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTypeDetail", propOrder = {
    "type",
    "ageRange"
})
public class PassengerTypeDetail {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected EPassengerType type;
    @XmlElement(name = "AgeRange")
    protected Range ageRange;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EPassengerType }
     *     
     */
    public EPassengerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPassengerType }
     *     
     */
    public void setType(EPassengerType value) {
        this.type = value;
    }

    /**
     * Gets the value of the ageRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getAgeRange() {
        return ageRange;
    }

    /**
     * Sets the value of the ageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setAgeRange(Range value) {
        this.ageRange = value;
    }

}
