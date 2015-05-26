
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Value" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeCharacteristic" />
 *       &lt;attribute name="Position" type="{http://www.travelport.com/schema/air_v18_0}typePosition" />
 *       &lt;attribute name="RowLocation" type="{http://www.travelport.com/schema/air_v18_0}typeRowLocation" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Characteristic")
public class Characteristic {

    @XmlAttribute(name = "Value", required = true)
    protected TypeCharacteristic value;
    @XmlAttribute(name = "Position")
    protected TypePosition position;
    @XmlAttribute(name = "RowLocation")
    protected TypeRowLocation rowLocation;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCharacteristic }
     *     
     */
    public TypeCharacteristic getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCharacteristic }
     *     
     */
    public void setValue(TypeCharacteristic value) {
        this.value = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link TypePosition }
     *     
     */
    public TypePosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePosition }
     *     
     */
    public void setPosition(TypePosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the rowLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRowLocation }
     *     
     */
    public TypeRowLocation getRowLocation() {
        return rowLocation;
    }

    /**
     * Sets the value of the rowLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRowLocation }
     *     
     */
    public void setRowLocation(TypeRowLocation value) {
        this.rowLocation = value;
    }

}
