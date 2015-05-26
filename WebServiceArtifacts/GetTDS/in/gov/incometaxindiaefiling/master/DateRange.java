
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
 *         &lt;element name="Upto15Of9">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Up16Of9To15Of12">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Up16Of12To15Of3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Up16Of3To31Of3">
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
    "upto15Of9",
    "up16Of9To15Of12",
    "up16Of12To15Of3",
    "up16Of3To31Of3"
})
@XmlRootElement(name = "DateRange")
public class DateRange {

    @XmlElement(name = "Upto15Of9", required = true, defaultValue = "0")
    protected BigInteger upto15Of9;
    @XmlElement(name = "Up16Of9To15Of12", required = true, defaultValue = "0")
    protected BigInteger up16Of9To15Of12;
    @XmlElement(name = "Up16Of12To15Of3", required = true, defaultValue = "0")
    protected BigInteger up16Of12To15Of3;
    @XmlElement(name = "Up16Of3To31Of3", required = true, defaultValue = "0")
    protected BigInteger up16Of3To31Of3;

    /**
     * Gets the value of the upto15Of9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpto15Of9() {
        return upto15Of9;
    }

    /**
     * Sets the value of the upto15Of9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpto15Of9(BigInteger value) {
        this.upto15Of9 = value;
    }

    /**
     * Gets the value of the up16Of9To15Of12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUp16Of9To15Of12() {
        return up16Of9To15Of12;
    }

    /**
     * Sets the value of the up16Of9To15Of12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUp16Of9To15Of12(BigInteger value) {
        this.up16Of9To15Of12 = value;
    }

    /**
     * Gets the value of the up16Of12To15Of3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUp16Of12To15Of3() {
        return up16Of12To15Of3;
    }

    /**
     * Sets the value of the up16Of12To15Of3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUp16Of12To15Of3(BigInteger value) {
        this.up16Of12To15Of3 = value;
    }

    /**
     * Gets the value of the up16Of3To31Of3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUp16Of3To31Of3() {
        return up16Of3To31Of3;
    }

    /**
     * Sets the value of the up16Of3To31Of3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUp16Of3To31Of3(BigInteger value) {
        this.up16Of3To31Of3 = value;
    }

}
