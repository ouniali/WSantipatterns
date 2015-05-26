
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
 *         &lt;element name="NameOfInstitution">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressOfInstitution">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameMentionedInAccnt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PeakBalanceOrInvestment">
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
    "nameOfInstitution",
    "addressOfInstitution",
    "nameMentionedInAccnt",
    "peakBalanceOrInvestment"
})
@XmlRootElement(name = "DetailsOfAccntsHvngSigningAuth")
public class DetailsOfAccntsHvngSigningAuth {

    @XmlElement(name = "NameOfInstitution", required = true)
    protected String nameOfInstitution;
    @XmlElement(name = "AddressOfInstitution", required = true)
    protected String addressOfInstitution;
    @XmlElement(name = "NameMentionedInAccnt", required = true)
    protected String nameMentionedInAccnt;
    @XmlElement(name = "PeakBalanceOrInvestment", required = true, defaultValue = "0")
    protected BigInteger peakBalanceOrInvestment;

    /**
     * Gets the value of the nameOfInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfInstitution() {
        return nameOfInstitution;
    }

    /**
     * Sets the value of the nameOfInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfInstitution(String value) {
        this.nameOfInstitution = value;
    }

    /**
     * Gets the value of the addressOfInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOfInstitution() {
        return addressOfInstitution;
    }

    /**
     * Sets the value of the addressOfInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOfInstitution(String value) {
        this.addressOfInstitution = value;
    }

    /**
     * Gets the value of the nameMentionedInAccnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMentionedInAccnt() {
        return nameMentionedInAccnt;
    }

    /**
     * Sets the value of the nameMentionedInAccnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMentionedInAccnt(String value) {
        this.nameMentionedInAccnt = value;
    }

    /**
     * Gets the value of the peakBalanceOrInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeakBalanceOrInvestment() {
        return peakBalanceOrInvestment;
    }

    /**
     * Sets the value of the peakBalanceOrInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeakBalanceOrInvestment(BigInteger value) {
        this.peakBalanceOrInvestment = value;
    }

}
