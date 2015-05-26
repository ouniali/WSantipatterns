
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendRoomReserveInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendRoomReserveInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPassenger" type="{http://schemas.tourico.com/webservices/hotelv3}ContactPassenger" minOccurs="0"/>
 *         &lt;element name="SelectedBoardBase" type="{http://schemas.tourico.com/webservices/hotelv3}SelectedBoardBase" minOccurs="0"/>
 *         &lt;element name="SelectedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplementInfo" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRoomReserveInfo", propOrder = {
    "contactPassenger",
    "selectedBoardBase",
    "selectedSupplements",
    "note"
})
public class AmendRoomReserveInfo {

    @XmlElement(name = "ContactPassenger")
    protected ContactPassenger contactPassenger;
    @XmlElement(name = "SelectedBoardBase")
    protected SelectedBoardBase selectedBoardBase;
    @XmlElement(name = "SelectedSupplements")
    protected ArrayOfSupplementInfo selectedSupplements;
    @XmlElement(name = "Note")
    protected String note;

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

}
