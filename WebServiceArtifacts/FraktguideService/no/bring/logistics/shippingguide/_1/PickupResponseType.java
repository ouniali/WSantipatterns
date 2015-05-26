
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PickupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.bring.no/logistics/shippingguide/1.0}DetailedPriceType" minOccurs="0"/>
 *         &lt;element name="ProductCodeInProductionSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarliestPickup" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LatestPickup" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TraceMessages" type="{http://www.bring.no/logistics/shippingguide/1.0}TraceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupResponseType", propOrder = {
    "price",
    "productCodeInProductionSystem",
    "earliestPickup",
    "latestPickup",
    "traceMessages"
})
public class PickupResponseType {

    @XmlElement(name = "Price")
    protected DetailedPriceType price;
    @XmlElement(name = "ProductCodeInProductionSystem")
    protected String productCodeInProductionSystem;
    @XmlElement(name = "EarliestPickup", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestPickup;
    @XmlElement(name = "LatestPickup", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestPickup;
    @XmlElement(name = "TraceMessages")
    protected TraceType traceMessages;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPriceType }
     *     
     */
    public DetailedPriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPriceType }
     *     
     */
    public void setPrice(DetailedPriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the productCodeInProductionSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCodeInProductionSystem() {
        return productCodeInProductionSystem;
    }

    /**
     * Sets the value of the productCodeInProductionSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCodeInProductionSystem(String value) {
        this.productCodeInProductionSystem = value;
    }

    /**
     * Gets the value of the earliestPickup property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestPickup() {
        return earliestPickup;
    }

    /**
     * Sets the value of the earliestPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestPickup(XMLGregorianCalendar value) {
        this.earliestPickup = value;
    }

    /**
     * Gets the value of the latestPickup property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestPickup() {
        return latestPickup;
    }

    /**
     * Sets the value of the latestPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestPickup(XMLGregorianCalendar value) {
        this.latestPickup = value;
    }

    /**
     * Gets the value of the traceMessages property.
     * 
     * @return
     *     possible object is
     *     {@link TraceType }
     *     
     */
    public TraceType getTraceMessages() {
        return traceMessages;
    }

    /**
     * Sets the value of the traceMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceType }
     *     
     */
    public void setTraceMessages(TraceType value) {
        this.traceMessages = value;
    }

}
