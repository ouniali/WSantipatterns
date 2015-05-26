
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for Breakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Breakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="DateBreakdown" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Breakdown", propOrder = {
    "price",
    "dateBreakdown"
})
public class Breakdown {

    @XmlElement(name = "Price")
    protected PriceValue price;
    @XmlElement(name = "DateBreakdown", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBreakdown;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPrice(PriceValue value) {
        this.price = value;
    }

    /**
     * Gets the value of the dateBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBreakdown() {
        return dateBreakdown;
    }

    /**
     * Sets the value of the dateBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBreakdown(XMLGregorianCalendar value) {
        this.dateBreakdown = value;
    }

}
