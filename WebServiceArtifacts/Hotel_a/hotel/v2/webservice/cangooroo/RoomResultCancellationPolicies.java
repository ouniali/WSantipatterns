
package hotel.v2.webservice.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import amendablepolicy.ws_2013.AmendablePolicy;
import hotel.ws_2013.RoomResultBase;
import ws_2013.PriceValue;


/**
 * <p>Java class for RoomResultCancellationPolicies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomResultCancellationPolicies">
 *   &lt;complexContent>
 *     &lt;extension base="{WS_2013.Hotel}RoomResultBase">
 *       &lt;sequence>
 *         &lt;element name="AmendablePolicy" type="{WS_2013.AmendablePolicy}AmendablePolicy" minOccurs="0"/>
 *         &lt;element name="OldSellPriceTotal" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="NewPriceIsGreaterThanOldPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Bookable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomResultCancellationPolicies", propOrder = {
    "amendablePolicy",
    "oldSellPriceTotal",
    "newPriceIsGreaterThanOldPrice",
    "bookable"
})
public class RoomResultCancellationPolicies
    extends RoomResultBase
{

    @XmlElement(name = "AmendablePolicy")
    protected AmendablePolicy amendablePolicy;
    @XmlElement(name = "OldSellPriceTotal")
    protected PriceValue oldSellPriceTotal;
    @XmlElement(name = "NewPriceIsGreaterThanOldPrice")
    protected boolean newPriceIsGreaterThanOldPrice;
    @XmlElement(name = "Bookable")
    protected boolean bookable;

    /**
     * Gets the value of the amendablePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link AmendablePolicy }
     *     
     */
    public AmendablePolicy getAmendablePolicy() {
        return amendablePolicy;
    }

    /**
     * Sets the value of the amendablePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendablePolicy }
     *     
     */
    public void setAmendablePolicy(AmendablePolicy value) {
        this.amendablePolicy = value;
    }

    /**
     * Gets the value of the oldSellPriceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getOldSellPriceTotal() {
        return oldSellPriceTotal;
    }

    /**
     * Sets the value of the oldSellPriceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setOldSellPriceTotal(PriceValue value) {
        this.oldSellPriceTotal = value;
    }

    /**
     * Gets the value of the newPriceIsGreaterThanOldPrice property.
     * 
     */
    public boolean isNewPriceIsGreaterThanOldPrice() {
        return newPriceIsGreaterThanOldPrice;
    }

    /**
     * Sets the value of the newPriceIsGreaterThanOldPrice property.
     * 
     */
    public void setNewPriceIsGreaterThanOldPrice(boolean value) {
        this.newPriceIsGreaterThanOldPrice = value;
    }

    /**
     * Gets the value of the bookable property.
     * 
     */
    public boolean isBookable() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     */
    public void setBookable(boolean value) {
        this.bookable = value;
    }

}
