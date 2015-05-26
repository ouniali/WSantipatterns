
package in.gov.incometaxindiaefiling.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AssesseeName"/>
 *         &lt;element name="PAN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Address"/>
 *         &lt;element name="DOB">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;maxInclusive value="2012-03-31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmployerCategory">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="2"/>
 *               &lt;enumeration value="GOV"/>
 *               &lt;enumeration value="PSU"/>
 *               &lt;enumeration value="OTH"/>
 *               &lt;enumeration value="NA"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Gender">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="X"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="H"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assesseeName",
    "pan",
    "address",
    "dob",
    "employerCategory",
    "gender",
    "status"
})
@XmlRootElement(name = "PersonalInfo")
public class PersonalInfo {

    @XmlElement(name = "AssesseeName", required = true)
    protected AssesseeName assesseeName;
    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "DOB", required = true)
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "EmployerCategory", required = true, defaultValue = "OTH")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String employerCategory;
    @XmlElement(name = "Gender", required = true, defaultValue = "M")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gender;
    @XmlElement(name = "Status", required = true, defaultValue = "I")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Assessee name with Sur Name or Org Name mandatory.
     * 
     * @return
     *     possible object is
     *     {@link AssesseeName }
     *     
     */
    public AssesseeName getAssesseeName() {
        return assesseeName;
    }

    /**
     * Sets the value of the assesseeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssesseeName }
     *     
     */
    public void setAssesseeName(AssesseeName value) {
        this.assesseeName = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     *  Address of assessee
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
     * Gets the value of the employerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCategory() {
        return employerCategory;
    }

    /**
     * Sets the value of the employerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCategory(String value) {
        this.employerCategory = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
