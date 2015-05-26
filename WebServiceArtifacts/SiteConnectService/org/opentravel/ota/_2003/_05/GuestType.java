
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GuestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="GuestTransportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GuestInfoGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestType", propOrder = {
    "guestName",
    "guestTransportation"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.CruiseBookingInfoType.GuestPrices.GuestPrice.class
})
public class GuestType {

    @XmlElement(name = "GuestName")
    protected PersonNameType guestName;
    @XmlElement(name = "GuestTransportation")
    protected List<GuestTransportationType> guestTransportation;
    @XmlAttribute(name = "GuestRefNumber")
    protected String guestRefNumber;
    @XmlAttribute(name = "Age")
    protected Integer age;
    @XmlAttribute(name = "Nationality")
    protected String nationality;
    @XmlAttribute(name = "GuestOccupation")
    protected String guestOccupation;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "Gender")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gender;
    @XmlAttribute(name = "LoyaltyMembershipID")
    protected String loyaltyMembershipID;
    @XmlAttribute(name = "LoyalLevel")
    protected String loyalLevel;
    @XmlAttribute(name = "LoyalLevelCode")
    protected Integer loyalLevelCode;

    /**
     * Gets the value of the guestName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getGuestName() {
        return guestName;
    }

    /**
     * Sets the value of the guestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setGuestName(PersonNameType value) {
        this.guestName = value;
    }

    /**
     * Gets the value of the guestTransportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestTransportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     * 
     * 
     */
    public List<GuestTransportationType> getGuestTransportation() {
        if (guestTransportation == null) {
            guestTransportation = new ArrayList<GuestTransportationType>();
        }
        return this.guestTransportation;
    }

    /**
     * Gets the value of the guestRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestRefNumber() {
        return guestRefNumber;
    }

    /**
     * Sets the value of the guestRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestRefNumber(String value) {
        this.guestRefNumber = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the guestOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestOccupation() {
        return guestOccupation;
    }

    /**
     * Sets the value of the guestOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestOccupation(String value) {
        this.guestOccupation = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the loyaltyMembershipID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyMembershipID() {
        return loyaltyMembershipID;
    }

    /**
     * Sets the value of the loyaltyMembershipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyMembershipID(String value) {
        this.loyaltyMembershipID = value;
    }

    /**
     * Gets the value of the loyalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyalLevel() {
        return loyalLevel;
    }

    /**
     * Sets the value of the loyalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyalLevel(String value) {
        this.loyalLevel = value;
    }

    /**
     * Gets the value of the loyalLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoyalLevelCode() {
        return loyalLevelCode;
    }

    /**
     * Sets the value of the loyalLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoyalLevelCode(Integer value) {
        this.loyalLevelCode = value;
    }

}
