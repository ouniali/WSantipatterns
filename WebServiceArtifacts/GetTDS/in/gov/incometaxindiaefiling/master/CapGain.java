
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ShortTerm"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}LongTerm"/>
 *         &lt;element name="TotalCapGains">
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
    "shortTerm",
    "longTerm",
    "totalCapGains"
})
@XmlRootElement(name = "CapGain")
public class CapGain {

    @XmlElement(name = "ShortTerm", required = true)
    protected ShortTerm shortTerm;
    @XmlElement(name = "LongTerm", required = true)
    protected LongTerm longTerm;
    @XmlElement(name = "TotalCapGains", required = true, defaultValue = "0")
    protected BigInteger totalCapGains;

    /**
     * Gets the value of the shortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link ShortTerm }
     *     
     */
    public ShortTerm getShortTerm() {
        return shortTerm;
    }

    /**
     * Sets the value of the shortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTerm }
     *     
     */
    public void setShortTerm(ShortTerm value) {
        this.shortTerm = value;
    }

    /**
     * Gets the value of the longTerm property.
     * 
     * @return
     *     possible object is
     *     {@link LongTerm }
     *     
     */
    public LongTerm getLongTerm() {
        return longTerm;
    }

    /**
     * Sets the value of the longTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTerm }
     *     
     */
    public void setLongTerm(LongTerm value) {
        this.longTerm = value;
    }

    /**
     * Gets the value of the totalCapGains property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapGains() {
        return totalCapGains;
    }

    /**
     * Sets the value of the totalCapGains property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapGains(BigInteger value) {
        this.totalCapGains = value;
    }

}
