
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for faisabiliteESD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faisabiliteESD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipperValue" type="{http://cxf.shipping.soap.chronopost.fr/}shipperValue" minOccurs="0"/>
 *         &lt;element name="retrievalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="closingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faisabiliteESD", propOrder = {
    "shipperValue",
    "retrievalDateTime",
    "closingDateTime"
})
public class FaisabiliteESD {

    protected ShipperValue shipperValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrievalDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closingDateTime;

    /**
     * Gets the value of the shipperValue property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperValue }
     *     
     */
    public ShipperValue getShipperValue() {
        return shipperValue;
    }

    /**
     * Sets the value of the shipperValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperValue }
     *     
     */
    public void setShipperValue(ShipperValue value) {
        this.shipperValue = value;
    }

    /**
     * Gets the value of the retrievalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrievalDateTime() {
        return retrievalDateTime;
    }

    /**
     * Sets the value of the retrievalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrievalDateTime(XMLGregorianCalendar value) {
        this.retrievalDateTime = value;
    }

    /**
     * Gets the value of the closingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingDateTime() {
        return closingDateTime;
    }

    /**
     * Sets the value of the closingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingDateTime(XMLGregorianCalendar value) {
        this.closingDateTime = value;
    }

}
