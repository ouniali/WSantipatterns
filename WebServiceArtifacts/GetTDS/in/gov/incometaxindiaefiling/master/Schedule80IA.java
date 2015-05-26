
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
 *         &lt;element name="DeductProfUs80_IA_4_i">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductProfUs80_IA_4_ii">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductProfUs80_IA_4_iii">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductProfUs80_IA_4_iv">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductProfUs80_IA_4_v">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotSchedule80_IA">
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
    "deductProfUs80IA4I",
    "deductProfUs80IA4Ii",
    "deductProfUs80IA4Iii",
    "deductProfUs80IA4Iv",
    "deductProfUs80IA4V",
    "totSchedule80IA"
})
@XmlRootElement(name = "Schedule80_IA")
public class Schedule80IA {

    @XmlElement(name = "DeductProfUs80_IA_4_i", required = true, defaultValue = "0")
    protected BigInteger deductProfUs80IA4I;
    @XmlElement(name = "DeductProfUs80_IA_4_ii", required = true, defaultValue = "0")
    protected BigInteger deductProfUs80IA4Ii;
    @XmlElement(name = "DeductProfUs80_IA_4_iii", required = true, defaultValue = "0")
    protected BigInteger deductProfUs80IA4Iii;
    @XmlElement(name = "DeductProfUs80_IA_4_iv", required = true, defaultValue = "0")
    protected BigInteger deductProfUs80IA4Iv;
    @XmlElement(name = "DeductProfUs80_IA_4_v", required = true, defaultValue = "0")
    protected BigInteger deductProfUs80IA4V;
    @XmlElement(name = "TotSchedule80_IA", required = true, defaultValue = "0")
    protected BigInteger totSchedule80IA;

    /**
     * Gets the value of the deductProfUs80IA4I property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductProfUs80IA4I() {
        return deductProfUs80IA4I;
    }

    /**
     * Sets the value of the deductProfUs80IA4I property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductProfUs80IA4I(BigInteger value) {
        this.deductProfUs80IA4I = value;
    }

    /**
     * Gets the value of the deductProfUs80IA4Ii property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductProfUs80IA4Ii() {
        return deductProfUs80IA4Ii;
    }

    /**
     * Sets the value of the deductProfUs80IA4Ii property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductProfUs80IA4Ii(BigInteger value) {
        this.deductProfUs80IA4Ii = value;
    }

    /**
     * Gets the value of the deductProfUs80IA4Iii property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductProfUs80IA4Iii() {
        return deductProfUs80IA4Iii;
    }

    /**
     * Sets the value of the deductProfUs80IA4Iii property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductProfUs80IA4Iii(BigInteger value) {
        this.deductProfUs80IA4Iii = value;
    }

    /**
     * Gets the value of the deductProfUs80IA4Iv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductProfUs80IA4Iv() {
        return deductProfUs80IA4Iv;
    }

    /**
     * Sets the value of the deductProfUs80IA4Iv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductProfUs80IA4Iv(BigInteger value) {
        this.deductProfUs80IA4Iv = value;
    }

    /**
     * Gets the value of the deductProfUs80IA4V property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductProfUs80IA4V() {
        return deductProfUs80IA4V;
    }

    /**
     * Sets the value of the deductProfUs80IA4V property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductProfUs80IA4V(BigInteger value) {
        this.deductProfUs80IA4V = value;
    }

    /**
     * Gets the value of the totSchedule80IA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotSchedule80IA() {
        return totSchedule80IA;
    }

    /**
     * Sets the value of the totSchedule80IA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotSchedule80IA(BigInteger value) {
        this.totSchedule80IA = value;
    }

}
