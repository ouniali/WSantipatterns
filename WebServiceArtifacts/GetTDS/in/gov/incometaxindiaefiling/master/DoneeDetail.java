
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
 *         &lt;element name="DoneeName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AddressDetail"/>
 *         &lt;element name="DonationAmt">
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
    "doneeName",
    "addressDetail",
    "donationAmt"
})
@XmlRootElement(name = "DoneeDetail")
public class DoneeDetail {

    @XmlElement(name = "DoneeName", required = true)
    protected String doneeName;
    @XmlElement(name = "AddressDetail", required = true)
    protected AddressDetail addressDetail;
    @XmlElement(name = "DonationAmt", required = true, defaultValue = "0")
    protected BigInteger donationAmt;

    /**
     * Gets the value of the doneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoneeName() {
        return doneeName;
    }

    /**
     * Sets the value of the doneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoneeName(String value) {
        this.doneeName = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetail }
     *     
     */
    public AddressDetail getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetail }
     *     
     */
    public void setAddressDetail(AddressDetail value) {
        this.addressDetail = value;
    }

    /**
     * Gets the value of the donationAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDonationAmt() {
        return donationAmt;
    }

    /**
     * Sets the value of the donationAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDonationAmt(BigInteger value) {
        this.donationAmt = value;
    }

}
