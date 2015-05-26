
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
 *         &lt;element name="AddrDetail">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
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
    "addrDetail",
    "cityOrTownOrDistrict",
    "stateCode",
    "pinCode"
})
@XmlRootElement(name = "AddressDetail")
public class AddressDetail {

    @XmlElement(name = "AddrDetail", required = true)
    protected String addrDetail;
    @XmlElement(name = "CityOrTownOrDistrict", required = true)
    protected String cityOrTownOrDistrict;
    @XmlElement(name = "StateCode", required = true)
    protected String stateCode;
    @XmlElement(name = "PinCode", required = true)
    protected BigInteger pinCode;

    /**
     * Gets the value of the addrDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrDetail() {
        return addrDetail;
    }

    /**
     * Sets the value of the addrDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrDetail(String value) {
        this.addrDetail = value;
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

}
