
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSPassenger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPassenger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://192.168.0.170/TT/BookingAPI}PassengerType"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Fare" type="{http://192.168.0.170/TT/BookingAPI}WSFare" minOccurs="0"/>
 *         &lt;element name="Ssr" type="{http://192.168.0.170/TT/BookingAPI}WSSSR" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://192.168.0.170/TT/BookingAPI}Gender"/>
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meal" type="{http://192.168.0.170/TT/BookingAPI}Meal"/>
 *         &lt;element name="Seat" type="{http://192.168.0.170/TT/BookingAPI}Seat"/>
 *         &lt;element name="FFAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPassenger", propOrder = {
    "title",
    "firstName",
    "lastName",
    "type",
    "dateOfBirth",
    "fare",
    "ssr",
    "gender",
    "passportNumber",
    "passportExpiry",
    "pinCode",
    "country",
    "phone",
    "addressLine1",
    "addressLine2",
    "email",
    "meal",
    "seat",
    "ffAirline",
    "ffNumber"
})
public class WSPassenger {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected PassengerType type;
    @XmlElement(name = "DateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Fare")
    protected WSFare fare;
    @XmlElement(name = "Ssr")
    protected WSSSR ssr;
    @XmlElement(name = "Gender", required = true)
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "PassportExpiry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportExpiry;
    @XmlElement(name = "PinCode")
    protected String pinCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Meal", required = true)
    protected Meal meal;
    @XmlElement(name = "Seat", required = true)
    protected Seat seat;
    @XmlElement(name = "FFAirline")
    protected String ffAirline;
    @XmlElement(name = "FFNumber")
    protected String ffNumber;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setType(PassengerType value) {
        this.type = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link WSFare }
     *     
     */
    public WSFare getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSFare }
     *     
     */
    public void setFare(WSFare value) {
        this.fare = value;
    }

    /**
     * Gets the value of the ssr property.
     * 
     * @return
     *     possible object is
     *     {@link WSSSR }
     *     
     */
    public WSSSR getSsr() {
        return ssr;
    }

    /**
     * Sets the value of the ssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSSSR }
     *     
     */
    public void setSsr(WSSSR value) {
        this.ssr = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpiry() {
        return passportExpiry;
    }

    /**
     * Sets the value of the passportExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpiry(XMLGregorianCalendar value) {
        this.passportExpiry = value;
    }

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link Meal }
     *     
     */
    public Meal getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meal }
     *     
     */
    public void setMeal(Meal value) {
        this.meal = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link Seat }
     *     
     */
    public Seat getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seat }
     *     
     */
    public void setSeat(Seat value) {
        this.seat = value;
    }

    /**
     * Gets the value of the ffAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFAirline() {
        return ffAirline;
    }

    /**
     * Sets the value of the ffAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFAirline(String value) {
        this.ffAirline = value;
    }

    /**
     * Gets the value of the ffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFNumber() {
        return ffNumber;
    }

    /**
     * Sets the value of the ffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFNumber(String value) {
        this.ffNumber = value;
    }

}
