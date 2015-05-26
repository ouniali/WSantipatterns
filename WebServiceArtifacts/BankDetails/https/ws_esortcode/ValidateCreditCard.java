
package https.ws_esortcode;

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
 *         &lt;element name="sCreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCreditCardNumber",
    "sUserName",
    "sguid",
    "sipAddress"
})
@XmlRootElement(name = "ValidateCreditCard")
public class ValidateCreditCard {

    protected String sCreditCardNumber;
    protected String sUserName;
    @XmlElement(name = "sGUID")
    protected String sguid;
    @XmlElement(name = "sIPAddress")
    protected String sipAddress;

    /**
     * Gets the value of the sCreditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCreditCardNumber() {
        return sCreditCardNumber;
    }

    /**
     * Sets the value of the sCreditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCreditCardNumber(String value) {
        this.sCreditCardNumber = value;
    }

    /**
     * Gets the value of the sUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUserName() {
        return sUserName;
    }

    /**
     * Sets the value of the sUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUserName(String value) {
        this.sUserName = value;
    }

    /**
     * Gets the value of the sguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGUID() {
        return sguid;
    }

    /**
     * Sets the value of the sguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGUID(String value) {
        this.sguid = value;
    }

    /**
     * Gets the value of the sipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPAddress() {
        return sipAddress;
    }

    /**
     * Sets the value of the sipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPAddress(String value) {
        this.sipAddress = value;
    }

}
