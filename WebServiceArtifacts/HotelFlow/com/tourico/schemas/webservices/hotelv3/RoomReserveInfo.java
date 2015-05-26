
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomReserveInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomReserveInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContactPassenger" type="{http://schemas.tourico.com/webservices/hotelv3}ContactPassenger" minOccurs="0"/>
 *         &lt;element name="SelectedBoardBase" type="{http://schemas.tourico.com/webservices/hotelv3}SelectedBoardBase" minOccurs="0"/>
 *         &lt;element name="SelectedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplementInfo" minOccurs="0"/>
 *         &lt;element name="Bedding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RoomReserveInfo", propOrder = {
    "roomId",
    "contactPassenger",
    "selectedBoardBase",
    "selectedSupplements",
    "bedding",
    "note",
    "adultNum",
    "childNum",
    "childAges"
})
public class RoomReserveInfo {

    @XmlElement(name = "RoomId")
    protected int roomId;
    @XmlElement(name = "ContactPassenger")
    protected ContactPassenger contactPassenger;
    @XmlElement(name = "SelectedBoardBase")
    protected SelectedBoardBase selectedBoardBase;
    @XmlElement(name = "SelectedSupplements")
    protected ArrayOfSupplementInfo selectedSupplements;
    @XmlElement(name = "Bedding")
    protected String bedding;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "AdultNum")
    protected int adultNum;
    @XmlElement(name = "ChildNum")
    protected int childNum;
    @XmlElement(name = "ChildAges")
    protected ArrayOfChildAge childAges;

    /**
     * Gets the value of the roomId property.
     * 
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     */
    public void setRoomId(int value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the contactPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPassenger }
     *     
     */
    public ContactPassenger getContactPassenger() {
        return contactPassenger;
    }

    /**
     * Sets the value of the contactPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPassenger }
     *     
     */
    public void setContactPassenger(ContactPassenger value) {
        this.contactPassenger = value;
    }

    /**
     * Gets the value of the selectedBoardBase property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedBoardBase }
     *     
     */
    public SelectedBoardBase getSelectedBoardBase() {
        return selectedBoardBase;
    }

    /**
     * Sets the value of the selectedBoardBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedBoardBase }
     *     
     */
    public void setSelectedBoardBase(SelectedBoardBase value) {
        this.selectedBoardBase = value;
    }

    /**
     * Gets the value of the selectedSupplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplementInfo }
     *     
     */
    public ArrayOfSupplementInfo getSelectedSupplements() {
        return selectedSupplements;
    }

    /**
     * Sets the value of the selectedSupplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplementInfo }
     *     
     */
    public void setSelectedSupplements(ArrayOfSupplementInfo value) {
        this.selectedSupplements = value;
    }

    /**
     * Gets the value of the bedding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedding() {
        return bedding;
    }

    /**
     * Sets the value of the bedding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedding(String value) {
        this.bedding = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

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
