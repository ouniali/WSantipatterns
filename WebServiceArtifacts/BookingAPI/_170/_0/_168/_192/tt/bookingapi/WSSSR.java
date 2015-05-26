
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSSR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSSR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Baggage" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSSRBaggage" minOccurs="0"/>
 *         &lt;element name="Meal" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSSRMeal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSSR", propOrder = {
    "baggage",
    "meal"
})
public class WSSSR {

    @XmlElement(name = "Baggage")
    protected ArrayOfWSSSRBaggage baggage;
    @XmlElement(name = "Meal")
    protected ArrayOfWSSSRMeal meal;

    /**
     * Gets the value of the baggage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSSRBaggage }
     *     
     */
    public ArrayOfWSSSRBaggage getBaggage() {
        return baggage;
    }

    /**
     * Sets the value of the baggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSSRBaggage }
     *     
     */
    public void setBaggage(ArrayOfWSSSRBaggage value) {
        this.baggage = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSSRMeal }
     *     
     */
    public ArrayOfWSSSRMeal getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSSRMeal }
     *     
     */
    public void setMeal(ArrayOfWSSSRMeal value) {
        this.meal = value;
    }

}
