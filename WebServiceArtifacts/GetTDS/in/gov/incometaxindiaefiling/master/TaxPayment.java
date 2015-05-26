
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="BSRCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
 *               &lt;pattern value="\d\d\d\d\d\d\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateDep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="2011-04-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SrlNoOfChaln">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Amt">
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
    "bsrCode",
    "dateDep",
    "srlNoOfChaln",
    "amt"
})
@XmlRootElement(name = "TaxPayment")
public class TaxPayment {

    @XmlElement(name = "BSRCode", required = true)
    protected String bsrCode;
    @XmlElement(name = "DateDep", required = true)
    protected XMLGregorianCalendar dateDep;
    @XmlElement(name = "SrlNoOfChaln", required = true)
    protected BigInteger srlNoOfChaln;
    @XmlElement(name = "Amt", required = true, defaultValue = "0")
    protected BigInteger amt;

    /**
     * Gets the value of the bsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRCode() {
        return bsrCode;
    }

    /**
     * Sets the value of the bsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRCode(String value) {
        this.bsrCode = value;
    }

    /**
     * Gets the value of the dateDep property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDep() {
        return dateDep;
    }

    /**
     * Sets the value of the dateDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDep(XMLGregorianCalendar value) {
        this.dateDep = value;
    }

    /**
     * Gets the value of the srlNoOfChaln property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrlNoOfChaln() {
        return srlNoOfChaln;
    }

    /**
     * Sets the value of the srlNoOfChaln property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrlNoOfChaln(BigInteger value) {
        this.srlNoOfChaln = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmt(BigInteger value) {
        this.amt = value;
    }

}
