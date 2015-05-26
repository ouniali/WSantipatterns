
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for BerthDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerthDetailType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>BerthAccommodationType">
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}BerthPositionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerthDetailType", propOrder = {
    "value"
})
public class BerthDetailType {

    @XmlValue
    protected BerthAccommodationType value;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Position")
    protected BerthPositionType position;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BerthAccommodationType }
     *     
     */
    public BerthAccommodationType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerthAccommodationType }
     *     
     */
    public void setValue(BerthAccommodationType value) {
        this.value = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BerthPositionType }
     *     
     */
    public BerthPositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerthPositionType }
     *     
     */
    public void setPosition(BerthPositionType value) {
        this.position = value;
    }

}
