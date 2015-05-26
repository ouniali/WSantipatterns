
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
 *         &lt;element name="CountryName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}CountryCode"/>
 *         &lt;element name="Bankname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressOfBank">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameAsInAccount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PeakBalanceDuringYear">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
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
    "countryName",
    "countryCode",
    "bankname",
    "addressOfBank",
    "nameAsInAccount",
    "peakBalanceDuringYear"
})
@XmlRootElement(name = "DetailsForiegnBank")
public class DetailsForiegnBank {

    @XmlElement(name = "CountryName", required = true)
    protected String countryName;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "Bankname", required = true)
    protected String bankname;
    @XmlElement(name = "AddressOfBank", required = true)
    protected String addressOfBank;
    @XmlElement(name = "NameAsInAccount", required = true)
    protected String nameAsInAccount;
    @XmlElement(name = "PeakBalanceDuringYear", required = true, defaultValue = "0")
    protected BigInteger peakBalanceDuringYear;

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
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

    /**
     * Gets the value of the bankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankname(String value) {
        this.bankname = value;
    }

    /**
     * Gets the value of the addressOfBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOfBank() {
        return addressOfBank;
    }

    /**
     * Sets the value of the addressOfBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOfBank(String value) {
        this.addressOfBank = value;
    }

    /**
     * Gets the value of the nameAsInAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAsInAccount() {
        return nameAsInAccount;
    }

    /**
     * Sets the value of the nameAsInAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAsInAccount(String value) {
        this.nameAsInAccount = value;
    }

    /**
     * Gets the value of the peakBalanceDuringYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeakBalanceDuringYear() {
        return peakBalanceDuringYear;
    }

    /**
     * Sets the value of the peakBalanceDuringYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeakBalanceDuringYear(BigInteger value) {
        this.peakBalanceDuringYear = value;
    }

}
