
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingMultiParcelWithReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingMultiParcelWithReservationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cxf.shipping.soap.chronopost.fr/}resultReservationMultiParcelExpeditionValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingMultiParcelWithReservationResponse", propOrder = {
    "_return"
})
public class ShippingMultiParcelWithReservationResponse {

    @XmlElement(name = "return")
    protected ResultReservationMultiParcelExpeditionValue _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResultReservationMultiParcelExpeditionValue }
     *     
     */
    public ResultReservationMultiParcelExpeditionValue getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultReservationMultiParcelExpeditionValue }
     *     
     */
    public void setReturn(ResultReservationMultiParcelExpeditionValue value) {
        this._return = value;
    }

}
