
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildAges" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfChildAge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomInfo", propOrder = {
    "adultNum",
    "childNum",
    "childAges"
})
@XmlSeeAlso({
    Room.class
})
public class RoomInfo {

    @XmlElement(name = "AdultNum")
    protected int adultNum;
    @XmlElement(name = "ChildNum")
    protected int childNum;
    @XmlElement(name = "ChildAges")
    protected ArrayOfChildAge childAges;

    /**
     * Gets the value of the adultNum property.
     * 
     */
    public int getAdultNum() {
        return adultNum;
    }

    /**
     * Sets the value of the adultNum property.
     * 
     */
    public void setAdultNum(int value) {
        this.adultNum = value;
    }

    /**
     * Gets the value of the childNum property.
     * 
     */
    public int getChildNum() {
        return childNum;
    }

    /**
     * Sets the value of the childNum property.
     * 
     */
    public void setChildNum(int value) {
        this.childNum = value;
    }

    /**
     * Gets the value of the childAges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChildAge }
     *     
     */
    public ArrayOfChildAge getChildAges() {
        return childAges;
    }

    /**
     * Sets the value of the childAges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChildAge }
     *     
     */
    public void setChildAges(ArrayOfChildAge value) {
        this.childAges = value;
    }

}
