
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
 *         &lt;element name="sSortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sSortcode",
    "sUserName",
    "sguid",
    "sipAddress"
})
@XmlRootElement(name = "BranchDetails")
public class BranchDetails {

    protected String sSortcode;
    protected String sUserName;
    @XmlElement(name = "sGUID")
    protected String sguid;
    @XmlElement(name = "sIPAddress")
    protected String sipAddress;

    /**
     * Gets the value of the sSortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSortcode() {
        return sSortcode;
    }

    /**
     * Sets the value of the sSortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSortcode(String value) {
        this.sSortcode = value;
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
