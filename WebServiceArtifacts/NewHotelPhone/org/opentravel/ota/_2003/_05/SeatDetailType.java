
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SeatDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>SeatAccommodationType">
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
 *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailType", propOrder = {
    "value"
})
public class SeatDetailType {

    @XmlValue
    protected SeatAccommodationType value;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Position")
    protected SeatPositionType position;
    @XmlAttribute(name = "Direction")
    protected SeatDirectionType direction;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAccommodationType }
     *     
     */
    public SeatAccommodationType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAccommodationType }
     *     
     */
    public void setValue(SeatAccommodationType value) {
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
     *     {@link SeatPositionType }
     *     
     */
    public SeatPositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatPositionType }
     *     
     */
    public void setPosition(SeatPositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDirectionType }
     *     
     */
    public SeatDirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDirectionType }
     *     
     */
    public void setDirection(SeatDirectionType value) {
        this.direction = value;
    }

}
