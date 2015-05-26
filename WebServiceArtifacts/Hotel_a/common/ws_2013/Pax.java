
package common.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AddressComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DDI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DDD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnumTitle" type="{WS_2013.Common}ePaxTitle"/>
 *         &lt;element name="EnumPaxType" type="{WS_2013.Common}ePaxType"/>
 *         &lt;element name="PassengerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pax", propOrder = {
    "documentId",
    "passPort",
    "addressNumber",
    "addressComplement",
    "addressCity",
    "addressState",
    "cepAddress",
    "ddi",
    "ddd",
    "phoneNumber",
    "birthday",
    "name",
    "lastName",
    "age",
    "cpf",
    "enumTitle",
    "enumPaxType",
    "passengerEmail"
})
public class Pax {

    @XmlElement(name = "DocumentId")
    protected String documentId;
    @XmlElement(name = "PassPort")
    protected String passPort;
    @XmlElement(name = "AddressNumber")
    protected int addressNumber;
    @XmlElement(name = "AddressComplement")
    protected String addressComplement;
    @XmlElement(name = "AddressCity")
    protected String addressCity;
    @XmlElement(name = "AddressState")
    protected String addressState;
    @XmlElement(name = "CEPAddress")
    protected String cepAddress;
    @XmlElement(name = "DDI")
    protected int ddi;
    @XmlElement(name = "DDD")
    protected int ddd;
    @XmlElement(name = "PhoneNumber")
    protected int phoneNumber;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Age")
    protected int age;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "EnumTitle", required = true)
    @XmlSchemaType(name = "string")
    protected EPaxTitle enumTitle;
    @XmlElement(name = "EnumPaxType", required = true)
    @XmlSchemaType(name = "string")
    protected EPaxType enumPaxType;
    @XmlElement(name = "PassengerEmail")
    protected String passengerEmail;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the passPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPort() {
        return passPort;
    }

    /**
     * Sets the value of the passPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPort(String value) {
        this.passPort = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     */
    public int getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     */
    public void setAddressNumber(int value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the addressComplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressComplement() {
        return addressComplement;
    }

    /**
     * Sets the value of the addressComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressComplement(String value) {
        this.addressComplement = value;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCity(String value) {
        this.addressCity = value;
    }

    /**
     * Gets the value of the addressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Sets the value of the addressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressState(String value) {
        this.addressState = value;
    }

    /**
     * Gets the value of the cepAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPAddress() {
        return cepAddress;
    }

    /**
     * Sets the value of the cepAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPAddress(String value) {
        this.cepAddress = value;
    }

    /**
     * Gets the value of the ddi property.
     * 
     */
    public int getDDI() {
        return ddi;
    }

    /**
     * Sets the value of the ddi property.
     * 
     */
    public void setDDI(int value) {
        this.ddi = value;
    }

    /**
     * Gets the value of the ddd property.
     * 
     */
    public int getDDD() {
        return ddd;
    }

    /**
     * Sets the value of the ddd property.
     * 
     */
    public void setDDD(int value) {
        this.ddd = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     */
    public void setPhoneNumber(int value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the enumTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EPaxTitle }
     *     
     */
    public EPaxTitle getEnumTitle() {
        return enumTitle;
    }

    /**
     * Sets the value of the enumTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaxTitle }
     *     
     */
    public void setEnumTitle(EPaxTitle value) {
        this.enumTitle = value;
    }

    /**
     * Gets the value of the enumPaxType property.
     * 
     * @return
     *     possible object is
     *     {@link EPaxType }
     *     
     */
    public EPaxType getEnumPaxType() {
        return enumPaxType;
    }

    /**
     * Sets the value of the enumPaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaxType }
     *     
     */
    public void setEnumPaxType(EPaxType value) {
        this.enumPaxType = value;
    }

    /**
     * Gets the value of the passengerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerEmail() {
        return passengerEmail;
    }

    /**
     * Sets the value of the passengerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerEmail(String value) {
        this.passengerEmail = value;
    }

}
