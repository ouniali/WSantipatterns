
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ResidenceNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResidenceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RoadOrStreet" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocalityOrArea">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CityOrTownOrDistrict">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;minLength value="1"/>
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *               &lt;enumeration value="07"/>
 *               &lt;enumeration value="08"/>
 *               &lt;enumeration value="09"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="19"/>
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="23"/>
 *               &lt;enumeration value="24"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value="26"/>
 *               &lt;enumeration value="27"/>
 *               &lt;enumeration value="28"/>
 *               &lt;enumeration value="29"/>
 *               &lt;enumeration value="30"/>
 *               &lt;enumeration value="31"/>
 *               &lt;enumeration value="32"/>
 *               &lt;enumeration value="33"/>
 *               &lt;enumeration value="34"/>
 *               &lt;enumeration value="35"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PinCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="6"/>
 *               &lt;pattern value="\d\d\d\d\d\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Phone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STDcode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PhoneNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MobileNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="10"/>
 *               &lt;pattern value="[1-9]{1}[0-9]{9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmailAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *               &lt;pattern value="([\.a-zA-Z0-9_\-])+@([a-zA-Z0-9_\-])+(([a-zA-Z0-9_\-])*\.([a-zA-Z0-9_\-])+)+"/>
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
    "residenceNo",
    "residenceName",
    "roadOrStreet",
    "localityOrArea",
    "cityOrTownOrDistrict",
    "stateCode",
    "pinCode",
    "phone",
    "mobileNo",
    "emailAddress"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "ResidenceNo", required = true)
    protected String residenceNo;
    @XmlElement(name = "ResidenceName")
    protected String residenceName;
    @XmlElement(name = "RoadOrStreet")
    protected String roadOrStreet;
    @XmlElement(name = "LocalityOrArea", required = true)
    protected String localityOrArea;
    @XmlElement(name = "CityOrTownOrDistrict", required = true)
    protected String cityOrTownOrDistrict;
    @XmlElement(name = "StateCode", required = true)
    protected String stateCode;
    @XmlElement(name = "PinCode", required = true)
    protected BigInteger pinCode;
    @XmlElement(name = "Phone")
    protected Address.Phone phone;
    @XmlElement(name = "MobileNo")
    protected BigInteger mobileNo;
    @XmlElement(name = "EmailAddress", required = true)
    protected String emailAddress;

    /**
     * Gets the value of the residenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceNo() {
        return residenceNo;
    }

    /**
     * Sets the value of the residenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceNo(String value) {
        this.residenceNo = value;
    }

    /**
     * Gets the value of the residenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceName() {
        return residenceName;
    }

    /**
     * Sets the value of the residenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceName(String value) {
        this.residenceName = value;
    }

    /**
     * Gets the value of the roadOrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadOrStreet() {
        return roadOrStreet;
    }

    /**
     * Sets the value of the roadOrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadOrStreet(String value) {
        this.roadOrStreet = value;
    }

    /**
     * Gets the value of the localityOrArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalityOrArea() {
        return localityOrArea;
    }

    /**
     * Sets the value of the localityOrArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalityOrArea(String value) {
        this.localityOrArea = value;
    }

    /**
     * Gets the value of the cityOrTownOrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrTownOrDistrict() {
        return cityOrTownOrDistrict;
    }

    /**
     * Sets the value of the cityOrTownOrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOrTownOrDistrict(String value) {
        this.cityOrTownOrDistrict = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPinCode(BigInteger value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Address.Phone }
     *     
     */
    public Address.Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address.Phone }
     *     
     */
    public void setPhone(Address.Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMobileNo(BigInteger value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }


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
     *         &lt;element name="STDcode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PhoneNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="10"/>
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
        "stDcode",
        "phoneNo"
    })
    public static class Phone {

        @XmlElement(name = "STDcode", required = true)
        protected BigInteger stDcode;
        @XmlElement(name = "PhoneNo", required = true)
        protected BigInteger phoneNo;

        /**
         * Gets the value of the stDcode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTDcode() {
            return stDcode;
        }

        /**
         * Sets the value of the stDcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTDcode(BigInteger value) {
            this.stDcode = value;
        }

        /**
         * Gets the value of the phoneNo property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPhoneNo() {
            return phoneNo;
        }

        /**
         * Sets the value of the phoneNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPhoneNo(BigInteger value) {
            this.phoneNo = value;
        }

    }

}
