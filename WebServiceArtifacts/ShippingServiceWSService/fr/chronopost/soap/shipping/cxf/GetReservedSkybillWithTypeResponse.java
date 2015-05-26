
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReservedSkybillWithTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReservedSkybillWithTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cxf.shipping.soap.chronopost.fr/}resultGetReservedSkybillWithTypeValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReservedSkybillWithTypeResponse", propOrder = {
    "_return"
})
public class GetReservedSkybillWithTypeResponse {

    @XmlElement(name = "return")
    protected ResultGetReservedSkybillWithTypeValue _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResultGetReservedSkybillWithTypeValue }
     *     
     */
    public ResultGetReservedSkybillWithTypeValue getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultGetReservedSkybillWithTypeValue }
     *     
     */
    public void setReturn(ResultGetReservedSkybillWithTypeValue value) {
        this._return = value;
    }

}
