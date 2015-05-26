
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DLNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuthenticationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocalStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StatusReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Geocode1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Geocode2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Geocode3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StreetPredirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StreetType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StreetPostDirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StreetFreeForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddrLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddrCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddrState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddrZip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MailLine1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MailLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MailCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MailState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MailZip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MailCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsUpdateRequest")
@XmlSeeAlso({
    WsUpdateRequest2 .class
})
public class WsUpdateRequest {

    @XmlAttribute(name = "DLNum")
    protected String dlNum;
    @XmlAttribute(name = "AuthenticationCode")
    protected String authenticationCode;
    @XmlAttribute(name = "UserInfo")
    protected String userInfo;
    @XmlAttribute(name = "ActionCode")
    protected String actionCode;
    @XmlAttribute(name = "LocalID")
    protected String localID;
    @XmlAttribute(name = "StateID")
    protected String stateID;
    @XmlAttribute(name = "LocalStatus")
    protected String localStatus;
    @XmlAttribute(name = "StatusReason")
    protected String statusReason;
    @XmlAttribute(name = "StateStatus")
    protected String stateStatus;
    @XmlAttribute(name = "Geocode1")
    protected String geocode1;
    @XmlAttribute(name = "Geocode2")
    protected String geocode2;
    @XmlAttribute(name = "Geocode3")
    protected String geocode3;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "MiddleName")
    protected String middleName;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "NameSuffix")
    protected String nameSuffix;
    @XmlAttribute(name = "BirthDate")
    protected String birthDate;
    @XmlAttribute(name = "RegistrationDate")
    protected String registrationDate;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "SSN")
    protected String ssn;
    @XmlAttribute(name = "Phone")
    protected String phone;
    @XmlAttribute(name = "StreetNumber")
    protected String streetNumber;
    @XmlAttribute(name = "StreetPredirection")
    protected String streetPredirection;
    @XmlAttribute(name = "StreetName")
    protected String streetName;
    @XmlAttribute(name = "StreetType")
    protected String streetType;
    @XmlAttribute(name = "StreetPostDirection")
    protected String streetPostDirection;
    @XmlAttribute(name = "StreetFreeForm")
    protected String streetFreeForm;
    @XmlAttribute(name = "AddrLine2")
    protected String addrLine2;
    @XmlAttribute(name = "AddrCity")
    protected String addrCity;
    @XmlAttribute(name = "AddrState")
    protected String addrState;
    @XmlAttribute(name = "AddrZip")
    protected String addrZip;
    @XmlAttribute(name = "MailLine1")
    protected String mailLine1;
    @XmlAttribute(name = "MailLine2")
    protected String mailLine2;
    @XmlAttribute(name = "MailCity")
    protected String mailCity;
    @XmlAttribute(name = "MailState")
    protected String mailState;
    @XmlAttribute(name = "MailZip")
    protected String mailZip;
    @XmlAttribute(name = "MailCountry")
    protected String mailCountry;
    @XmlAttribute(name = "RegSource")
    protected String regSource;

    /**
     * Gets the value of the dlNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLNum() {
        return dlNum;
    }

    /**
     * Sets the value of the dlNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLNum(String value) {
        this.dlNum = value;
    }

    /**
     * Gets the value of the authenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Sets the value of the authenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationCode(String value) {
        this.authenticationCode = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInfo(String value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the localID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalID(String value) {
        this.localID = value;
    }

    /**
     * Gets the value of the stateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateID(String value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the localStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalStatus() {
        return localStatus;
    }

    /**
     * Sets the value of the localStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalStatus(String value) {
        this.localStatus = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the stateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateStatus() {
        return stateStatus;
    }

    /**
     * Sets the value of the stateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateStatus(String value) {
        this.stateStatus = value;
    }

    /**
     * Gets the value of the geocode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocode1() {
        return geocode1;
    }

    /**
     * Sets the value of the geocode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocode1(String value) {
        this.geocode1 = value;
    }

    /**
     * Gets the value of the geocode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocode2() {
        return geocode2;
    }

    /**
     * Sets the value of the geocode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocode2(String value) {
        this.geocode2 = value;
    }

    /**
     * Gets the value of the geocode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocode3() {
        return geocode3;
    }

    /**
     * Sets the value of the geocode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocode3(String value) {
        this.geocode3 = value;
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
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
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
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
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
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
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
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the streetPredirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPredirection() {
        return streetPredirection;
    }

    /**
     * Sets the value of the streetPredirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPredirection(String value) {
        this.streetPredirection = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetPostDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPostDirection() {
        return streetPostDirection;
    }

    /**
     * Sets the value of the streetPostDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPostDirection(String value) {
        this.streetPostDirection = value;
    }

    /**
     * Gets the value of the streetFreeForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetFreeForm() {
        return streetFreeForm;
    }

    /**
     * Sets the value of the streetFreeForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetFreeForm(String value) {
        this.streetFreeForm = value;
    }

    /**
     * Gets the value of the addrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Sets the value of the addrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine2(String value) {
        this.addrLine2 = value;
    }

    /**
     * Gets the value of the addrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * Sets the value of the addrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrCity(String value) {
        this.addrCity = value;
    }

    /**
     * Gets the value of the addrState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrState() {
        return addrState;
    }

    /**
     * Sets the value of the addrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrState(String value) {
        this.addrState = value;
    }

    /**
     * Gets the value of the addrZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrZip() {
        return addrZip;
    }

    /**
     * Sets the value of the addrZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrZip(String value) {
        this.addrZip = value;
    }

    /**
     * Gets the value of the mailLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailLine1() {
        return mailLine1;
    }

    /**
     * Sets the value of the mailLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailLine1(String value) {
        this.mailLine1 = value;
    }

    /**
     * Gets the value of the mailLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailLine2() {
        return mailLine2;
    }

    /**
     * Sets the value of the mailLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailLine2(String value) {
        this.mailLine2 = value;
    }

    /**
     * Gets the value of the mailCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCity() {
        return mailCity;
    }

    /**
     * Sets the value of the mailCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCity(String value) {
        this.mailCity = value;
    }

    /**
     * Gets the value of the mailState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailState() {
        return mailState;
    }

    /**
     * Sets the value of the mailState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailState(String value) {
        this.mailState = value;
    }

    /**
     * Gets the value of the mailZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailZip() {
        return mailZip;
    }

    /**
     * Sets the value of the mailZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailZip(String value) {
        this.mailZip = value;
    }

    /**
     * Gets the value of the mailCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCountry() {
        return mailCountry;
    }

    /**
     * Sets the value of the mailCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCountry(String value) {
        this.mailCountry = value;
    }

    /**
     * Gets the value of the regSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegSource() {
        return regSource;
    }

    /**
     * Sets the value of the regSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegSource(String value) {
        this.regSource = value;
    }

}
