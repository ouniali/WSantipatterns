
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingWithReservationAndESDWithRefClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingWithReservationAndESDWithRefClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cxf.shipping.soap.chronopost.fr/}resultReservationExpeditionValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingWithReservationAndESDWithRefClientResponse", propOrder = {
    "_return"
})
public class ShippingWithReservationAndESDWithRefClientResponse {

    @XmlElement(name = "return")
    protected ResultReservationExpeditionValue _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResultReservationExpeditionValue }
     *     
     */
    public ResultReservationExpeditionValue getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultReservationExpeditionValue }
     *     
     */
    public void setReturn(ResultReservationExpeditionValue value) {
        this._return = value;
    }

}
