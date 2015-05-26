
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
 *         &lt;element name="IncOfCurYrUndHeadFromCYLA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BFlossPrevYrUndSameHeadSetoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BFUnabsorbedDeprSetoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BFAllUs35Cl4Setoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncOfCurYrAfterSetOffBFLosses">
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
    "incOfCurYrUndHeadFromCYLA",
    "bFlossPrevYrUndSameHeadSetoff",
    "bfUnabsorbedDeprSetoff",
    "bfAllUs35Cl4Setoff",
    "incOfCurYrAfterSetOffBFLosses"
})
@XmlRootElement(name = "IncBFLA")
public class IncBFLA {

    @XmlElement(name = "IncOfCurYrUndHeadFromCYLA", required = true, defaultValue = "0")
    protected BigInteger incOfCurYrUndHeadFromCYLA;
    @XmlElement(name = "BFlossPrevYrUndSameHeadSetoff", defaultValue = "0")
    protected BigInteger bFlossPrevYrUndSameHeadSetoff;
    @XmlElement(name = "BFUnabsorbedDeprSetoff", defaultValue = "0")
    protected BigInteger bfUnabsorbedDeprSetoff;
    @XmlElement(name = "BFAllUs35Cl4Setoff", defaultValue = "0")
    protected BigInteger bfAllUs35Cl4Setoff;
    @XmlElement(name = "IncOfCurYrAfterSetOffBFLosses", required = true, defaultValue = "0")
    protected BigInteger incOfCurYrAfterSetOffBFLosses;

    /**
     * Gets the value of the incOfCurYrUndHeadFromCYLA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncOfCurYrUndHeadFromCYLA() {
        return incOfCurYrUndHeadFromCYLA;
    }

    /**
     * Sets the value of the incOfCurYrUndHeadFromCYLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncOfCurYrUndHeadFromCYLA(BigInteger value) {
        this.incOfCurYrUndHeadFromCYLA = value;
    }

    /**
     * Gets the value of the bFlossPrevYrUndSameHeadSetoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBFlossPrevYrUndSameHeadSetoff() {
        return bFlossPrevYrUndSameHeadSetoff;
    }

    /**
     * Sets the value of the bFlossPrevYrUndSameHeadSetoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBFlossPrevYrUndSameHeadSetoff(BigInteger value) {
        this.bFlossPrevYrUndSameHeadSetoff = value;
    }

    /**
     * Gets the value of the bfUnabsorbedDeprSetoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBFUnabsorbedDeprSetoff() {
        return bfUnabsorbedDeprSetoff;
    }

    /**
     * Sets the value of the bfUnabsorbedDeprSetoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBFUnabsorbedDeprSetoff(BigInteger value) {
        this.bfUnabsorbedDeprSetoff = value;
    }

    /**
     * Gets the value of the bfAllUs35Cl4Setoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBFAllUs35Cl4Setoff() {
        return bfAllUs35Cl4Setoff;
    }

    /**
     * Sets the value of the bfAllUs35Cl4Setoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBFAllUs35Cl4Setoff(BigInteger value) {
        this.bfAllUs35Cl4Setoff = value;
    }

    /**
     * Gets the value of the incOfCurYrAfterSetOffBFLosses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncOfCurYrAfterSetOffBFLosses() {
        return incOfCurYrAfterSetOffBFLosses;
    }

    /**
     * Sets the value of the incOfCurYrAfterSetOffBFLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncOfCurYrAfterSetOffBFLosses(BigInteger value) {
        this.incOfCurYrAfterSetOffBFLosses = value;
    }

}
