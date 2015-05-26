
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
 *         &lt;element name="DeprBlockTot5Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot10Percent">
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
 *         &lt;element name="TotBuildng">
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
    "deprBlockTot5Percent",
    "deprBlockTot10Percent",
    "deprBlockTot100Percent",
    "totBuildng"
})
@XmlRootElement(name = "BuildingSummary")
public class BuildingSummary {

    @XmlElement(name = "DeprBlockTot5Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot5Percent;
    @XmlElement(name = "DeprBlockTot10Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot10Percent;
    @XmlElement(name = "DeprBlockTot100Percent", required = true, defaultValue = "0")
    protected BigInteger deprBlockTot100Percent;
    @XmlElement(name = "TotBuildng", required = true, defaultValue = "0")
    protected BigInteger totBuildng;

    /**
     * Gets the value of the deprBlockTot5Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot5Percent() {
        return deprBlockTot5Percent;
    }

    /**
     * Sets the value of the deprBlockTot5Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot5Percent(BigInteger value) {
        this.deprBlockTot5Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot10Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprBlockTot10Percent() {
        return deprBlockTot10Percent;
    }

    /**
     * Sets the value of the deprBlockTot10Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprBlockTot10Percent(BigInteger value) {
        this.deprBlockTot10Percent = value;
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
     * Gets the value of the totBuildng property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotBuildng() {
        return totBuildng;
    }

    /**
     * Sets the value of the totBuildng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotBuildng(BigInteger value) {
        this.totBuildng = value;
    }

}
