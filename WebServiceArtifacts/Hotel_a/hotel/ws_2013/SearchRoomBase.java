
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRoomBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRoomBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtyAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgeOfTheChildrens" type="{WS_2013.Hotel}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRoomBase", propOrder = {
    "quantity",
    "qtyAdults",
    "ageOfTheChildrens"
})
@XmlSeeAlso({
    SearchRoom.class
})
public abstract class SearchRoomBase {

    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "QtyAdults")
    protected int qtyAdults;
    @XmlElement(name = "AgeOfTheChildrens")
    protected ArrayOfInt ageOfTheChildrens;

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the qtyAdults property.
     * 
     */
    public int getQtyAdults() {
        return qtyAdults;
    }

    /**
     * Sets the value of the qtyAdults property.
     * 
     */
    public void setQtyAdults(int value) {
        this.qtyAdults = value;
    }

    /**
     * Gets the value of the ageOfTheChildrens property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAgeOfTheChildrens() {
        return ageOfTheChildrens;
    }

    /**
     * Sets the value of the ageOfTheChildrens property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAgeOfTheChildrens(ArrayOfInt value) {
        this.ageOfTheChildrens = value;
    }

}
