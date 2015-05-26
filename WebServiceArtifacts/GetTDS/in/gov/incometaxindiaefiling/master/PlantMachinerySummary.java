
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
 *         &lt;element name="DeprBlockTot15Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot30Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot40Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot50Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot60Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot80Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot100Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotPlntMach">
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
    "deprBlockTot15Percent",
    "deprBlockTot30Percent",
    "deprBlockTot40Percent",
    "deprBlockTot50Percent",
    "deprBlockTot60Percent",
    "deprBlockTot80Percent",
    "deprBlockTot100Percent",
    "totPlntMach"
})
@XmlRootElement(name = "PlantMachinerySummary")
public class PlantMachinerySummary {

    @XmlElement(name = "DeprBlockTot15Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot15Percent;
    @XmlElement(name = "DeprBlockTot30Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot30Percent;
    @XmlElement(name = "DeprBlockTot40Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot40Percent;
    @XmlElement(name = "DeprBlockTot50Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot50Percent;
    @XmlElement(name = "DeprBlockTot60Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot60Percent;
    @XmlElement(name = "DeprBlockTot80Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot80Percent;
    @XmlElement(name = "DeprBlockTot100Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot100Percent;
    @XmlElement(name = "TotPlntMach", required = true, defaultValue = "0")
    protected BigInteger totPlntMach;

    /**
     * Gets the value of the deprBlockTot15Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot15Percent() {
        return deprBlockTot15Percent;
    }

    /**
     * Sets the value of the deprBlockTot15Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot15Percent(BigInteger value) {
        this.deprBlockTot15Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot30Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot30Percent() {
        return deprBlockTot30Percent;
    }

    /**
     * Sets the value of the deprBlockTot30Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot30Percent(BigInteger value) {
        this.deprBlockTot30Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot40Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot40Percent() {
        return deprBlockTot40Percent;
    }

    /**
     * Sets the value of the deprBlockTot40Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot40Percent(BigInteger value) {
        this.deprBlockTot40Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot50Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot50Percent() {
        return deprBlockTot50Percent;
    }

    /**
     * Sets the value of the deprBlockTot50Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot50Percent(BigInteger value) {
        this.deprBlockTot50Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot60Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot60Percent() {
        return deprBlockTot60Percent;
    }

    /**
     * Sets the value of the deprBlockTot60Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot60Percent(BigInteger value) {
        this.deprBlockTot60Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot80Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot80Percent() {
        return deprBlockTot80Percent;
    }

    /**
     * Sets the value of the deprBlockTot80Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot80Percent(BigInteger value) {
        this.deprBlockTot80Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot100Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot100Percent() {
        return deprBlockTot100Percent;
    }

    /**
     * Sets the value of the deprBlockTot100Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot100Percent(BigInteger value) {
        this.deprBlockTot100Percent = value;
    }

    /**
     * Gets the value of the totPlntMach property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotPlntMach() {
        return totPlntMach;
    }

    /**
     * Sets the value of the totPlntMach property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotPlntMach(BigInteger value) {
        this.totPlntMach = value;
    }

}
