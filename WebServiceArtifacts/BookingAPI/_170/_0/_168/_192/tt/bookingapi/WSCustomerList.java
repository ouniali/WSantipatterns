
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSCustomerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCustomerList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PassportNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaasportExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyer" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFrequentFlyer" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCustomerList", propOrder = {
    "agencyID",
    "customerID",
    "title",
    "gender",
    "firstName",
    "lastName",
    "phoneNo",
    "emailId",
    "dob",
    "passportNO",
    "paasportExpDate",
    "address1",
    "address2",
    "mealPreferences",
    "seatPreferences",
    "frequentFlyer",
    "city",
    "countryCode"
})
public class WSCustomerList {

    @XmlElement(name = "AgencyID")
    protected int agencyID;
    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "PhoneNo")
    protected String phoneNo;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "DOB", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "PassportNO")
    protected String passportNO;
    @XmlElement(name = "PaasportExpDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paasportExpDate;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "MealPreferences")
    protected String mealPreferences;
    @XmlElement(name = "SeatPreferences")
    protected String seatPreferences;
    @XmlElement(name = "FrequentFlyer")
    protected ArrayOfWSFrequentFlyer frequentFlyer;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "CountryCode")
    protected String countryCode;

    /**
     * Gets the value of the agencyID property.
     * 
     */
    public int getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     */
    public void setAgencyID(int value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

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
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the passportNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNO() {
        return passportNO;
    }

    /**
     * Sets the value of the passportNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNO(String value) {
        this.passportNO = value;
    }

    /**
     * Gets the value of the paasportExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaasportExpDate() {
        return paasportExpDate;
    }

    /**
     * Sets the value of the paasportExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaasportExpDate(XMLGregorianCalendar value) {
        this.paasportExpDate = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the mealPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealPreferences() {
        return mealPreferences;
    }

    /**
     * Sets the value of the mealPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealPreferences(String value) {
        this.mealPreferences = value;
    }

    /**
     * Gets the value of the seatPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreferences() {
        return seatPreferences;
    }

    /**
     * Sets the value of the seatPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreferences(String value) {
        this.seatPreferences = value;
    }

    /**
     * Gets the value of the frequentFlyer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSFrequentFlyer }
     *     
     */
    public ArrayOfWSFrequentFlyer getFrequentFlyer() {
        return frequentFlyer;
    }

    /**
     * Sets the value of the frequentFlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSFrequentFlyer }
     *     
     */
    public void setFrequentFlyer(ArrayOfWSFrequentFlyer value) {
        this.frequentFlyer = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
