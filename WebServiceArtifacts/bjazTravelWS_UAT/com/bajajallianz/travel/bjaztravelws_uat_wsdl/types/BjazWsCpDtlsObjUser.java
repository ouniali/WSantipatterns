
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazWsCpDtlsObjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazWsCpDtlsObjUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}BjazWsCpDtlsObjBase">
 *       &lt;sequence>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerid" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maritalstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="institutionname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passportno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assigneeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestid" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazWsCpDtlsObjUser", propOrder = {
    "sex",
    "userid",
    "state",
    "lastname",
    "partnerType",
    "city",
    "empstatus",
    "partnerid",
    "title",
    "maritalstatus",
    "extCol9",
    "extCol8",
    "extCol7",
    "extCol6",
    "extCol5",
    "institutionname",
    "extCol4",
    "extCol3",
    "extCol2",
    "extCol1",
    "streetname",
    "occupation",
    "building",
    "middlename",
    "fax",
    "locationcode",
    "regno",
    "passportno",
    "assigneeName",
    "firstname",
    "companyname",
    "extCol10",
    "country",
    "pincode",
    "nationality",
    "email",
    "dob",
    "requestid",
    "telephone",
    "mobileNo"
})
public class BjazWsCpDtlsObjUser
    extends BjazWsCpDtlsObjBase
{

    @XmlElement(required = true, nillable = true)
    protected String sex;
    @XmlElement(required = true, nillable = true)
    protected String userid;
    @XmlElement(required = true, nillable = true)
    protected String state;
    @XmlElement(required = true, nillable = true)
    protected String lastname;
    @XmlElement(required = true, nillable = true)
    protected String partnerType;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String empstatus;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal partnerid;
    @XmlElement(required = true, nillable = true)
    protected String title;
    @XmlElement(required = true, nillable = true)
    protected String maritalstatus;
    @XmlElement(required = true, nillable = true)
    protected String extCol9;
    @XmlElement(required = true, nillable = true)
    protected String extCol8;
    @XmlElement(required = true, nillable = true)
    protected String extCol7;
    @XmlElement(required = true, nillable = true)
    protected String extCol6;
    @XmlElement(required = true, nillable = true)
    protected String extCol5;
    @XmlElement(required = true, nillable = true)
    protected String institutionname;
    @XmlElement(required = true, nillable = true)
    protected String extCol4;
    @XmlElement(required = true, nillable = true)
    protected String extCol3;
    @XmlElement(required = true, nillable = true)
    protected String extCol2;
    @XmlElement(required = true, nillable = true)
    protected String extCol1;
    @XmlElement(required = true, nillable = true)
    protected String streetname;
    @XmlElement(required = true, nillable = true)
    protected String occupation;
    @XmlElement(required = true, nillable = true)
    protected String building;
    @XmlElement(required = true, nillable = true)
    protected String middlename;
    @XmlElement(required = true, nillable = true)
    protected String fax;
    @XmlElement(required = true, nillable = true)
    protected String locationcode;
    @XmlElement(required = true, nillable = true)
    protected String regno;
    @XmlElement(required = true, nillable = true)
    protected String passportno;
    @XmlElement(required = true, nillable = true)
    protected String assigneeName;
    @XmlElement(required = true, nillable = true)
    protected String firstname;
    @XmlElement(required = true, nillable = true)
    protected String companyname;
    @XmlElement(required = true, nillable = true)
    protected String extCol10;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pincode;
    @XmlElement(required = true, nillable = true)
    protected String nationality;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String dob;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal requestid;
    @XmlElement(required = true, nillable = true)
    protected String telephone;
    @XmlElement(required = true, nillable = true)
    protected String mobileNo;

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the partnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * Sets the value of the partnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerType(String value) {
        this.partnerType = value;
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
     * Gets the value of the empstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpstatus() {
        return empstatus;
    }

    /**
     * Sets the value of the empstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpstatus(String value) {
        this.empstatus = value;
    }

    /**
     * Gets the value of the partnerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartnerid() {
        return partnerid;
    }

    /**
     * Sets the value of the partnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartnerid(BigDecimal value) {
        this.partnerid = value;
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
     * Gets the value of the maritalstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * Sets the value of the maritalstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalstatus(String value) {
        this.maritalstatus = value;
    }

    /**
     * Gets the value of the extCol9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol9() {
        return extCol9;
    }

    /**
     * Sets the value of the extCol9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol9(String value) {
        this.extCol9 = value;
    }

    /**
     * Gets the value of the extCol8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol8() {
        return extCol8;
    }

    /**
     * Sets the value of the extCol8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol8(String value) {
        this.extCol8 = value;
    }

    /**
     * Gets the value of the extCol7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol7() {
        return extCol7;
    }

    /**
     * Sets the value of the extCol7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol7(String value) {
        this.extCol7 = value;
    }

    /**
     * Gets the value of the extCol6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol6() {
        return extCol6;
    }

    /**
     * Sets the value of the extCol6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol6(String value) {
        this.extCol6 = value;
    }

    /**
     * Gets the value of the extCol5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol5() {
        return extCol5;
    }

    /**
     * Sets the value of the extCol5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol5(String value) {
        this.extCol5 = value;
    }

    /**
     * Gets the value of the institutionname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionname() {
        return institutionname;
    }

    /**
     * Sets the value of the institutionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionname(String value) {
        this.institutionname = value;
    }

    /**
     * Gets the value of the extCol4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol4() {
        return extCol4;
    }

    /**
     * Sets the value of the extCol4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol4(String value) {
        this.extCol4 = value;
    }

    /**
     * Gets the value of the extCol3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol3() {
        return extCol3;
    }

    /**
     * Sets the value of the extCol3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol3(String value) {
        this.extCol3 = value;
    }

    /**
     * Gets the value of the extCol2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol2() {
        return extCol2;
    }

    /**
     * Sets the value of the extCol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol2(String value) {
        this.extCol2 = value;
    }

    /**
     * Gets the value of the extCol1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol1() {
        return extCol1;
    }

    /**
     * Sets the value of the extCol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol1(String value) {
        this.extCol1 = value;
    }

    /**
     * Gets the value of the streetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetname() {
        return streetname;
    }

    /**
     * Sets the value of the streetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetname(String value) {
        this.streetname = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationcode() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationcode(String value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the regno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegno() {
        return regno;
    }

    /**
     * Sets the value of the regno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegno(String value) {
        this.regno = value;
    }

    /**
     * Gets the value of the passportno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportno() {
        return passportno;
    }

    /**
     * Sets the value of the passportno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportno(String value) {
        this.passportno = value;
    }

    /**
     * Gets the value of the assigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigneeName() {
        return assigneeName;
    }

    /**
     * Sets the value of the assigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigneeName(String value) {
        this.assigneeName = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyname(String value) {
        this.companyname = value;
    }

    /**
     * Gets the value of the extCol10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol10() {
        return extCol10;
    }

    /**
     * Sets the value of the extCol10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol10(String value) {
        this.extCol10 = value;
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
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPincode() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPincode(BigDecimal value) {
        this.pincode = value;
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
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the requestid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestid() {
        return requestid;
    }

    /**
     * Sets the value of the requestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestid(BigDecimal value) {
        this.requestid = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

}
