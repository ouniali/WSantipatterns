
package kr.co.rts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildAge1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildAge2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestsInfo", propOrder = {
    "adultCount",
    "childCount",
    "roomCount",
    "childAge1",
    "childAge2"
})
public class GuestsInfo {

    @XmlElement(name = "AdultCount")
    protected int adultCount;
    @XmlElement(name = "ChildCount")
    protected int childCount;
    @XmlElement(name = "RoomCount")
    protected int roomCount;
    @XmlElement(name = "ChildAge1")
    protected int childAge1;
    @XmlElement(name = "ChildAge2")
    protected int childAge2;

    /**
     * Gets the value of the adultCount property.
     * 
     */
    public int getAdultCount() {
        return adultCount;
    }

    /**
     * Sets the value of the adultCount property.
     * 
     */
    public void setAdultCount(int value) {
        this.adultCount = value;
    }

    /**
     * Gets the value of the childCount property.
     * 
     */
    public int getChildCount() {
        return childCount;
    }

    /**
     * Sets the value of the childCount property.
     * 
     */
    public void setChildCount(int value) {
        this.childCount = value;
    }

    /**
     * Gets the value of the roomCount property.
     * 
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * Sets the value of the roomCount property.
     * 
     */
    public void setRoomCount(int value) {
        this.roomCount = value;
    }

    /**
     * Gets the value of the childAge1 property.
     * 
     */
    public int getChildAge1() {
        return childAge1;
    }

    /**
     * Sets the value of the childAge1 property.
     * 
     */
    public void setChildAge1(int value) {
        this.childAge1 = value;
    }

    /**
     * Gets the value of the childAge2 property.
     * 
     */
    public int getChildAge2() {
        return childAge2;
    }

    /**
     * Sets the value of the childAge2 property.
     * 
     */
    public void setChildAge2(int value) {
        this.childAge2 = value;
    }

}
