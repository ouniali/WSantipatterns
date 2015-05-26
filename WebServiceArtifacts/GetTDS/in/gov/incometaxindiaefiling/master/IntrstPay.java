
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
 *         &lt;element name="IntrstPayUs234A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntrstPayUs234B">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntrstPayUs234C">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalIntrstPay">
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
    "intrstPayUs234A",
    "intrstPayUs234B",
    "intrstPayUs234C",
    "totalIntrstPay"
})
@XmlRootElement(name = "IntrstPay")
public class IntrstPay {

    @XmlElement(name = "IntrstPayUs234A", required = true, defaultValue = "0")
    protected BigInteger intrstPayUs234A;
    @XmlElement(name = "IntrstPayUs234B", required = true, defaultValue = "0")
    protected BigInteger intrstPayUs234B;
    @XmlElement(name = "IntrstPayUs234C", required = true, defaultValue = "0")
    protected BigInteger intrstPayUs234C;
    @XmlElement(name = "TotalIntrstPay", required = true, defaultValue = "0")
    protected BigInteger totalIntrstPay;

    /**
     * Gets the value of the intrstPayUs234A property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntrstPayUs234A() {
        return intrstPayUs234A;
    }

    /**
     * Sets the value of the intrstPayUs234A property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntrstPayUs234A(BigInteger value) {
        this.intrstPayUs234A = value;
    }

    /**
     * Gets the value of the intrstPayUs234B property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntrstPayUs234B() {
        return intrstPayUs234B;
    }

    /**
     * Sets the value of the intrstPayUs234B property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntrstPayUs234B(BigInteger value) {
        this.intrstPayUs234B = value;
    }

    /**
     * Gets the value of the intrstPayUs234C property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntrstPayUs234C() {
        return intrstPayUs234C;
    }

    /**
     * Sets the value of the intrstPayUs234C property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntrstPayUs234C(BigInteger value) {
        this.intrstPayUs234C = value;
    }

    /**
     * Gets the value of the totalIntrstPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalIntrstPay() {
        return totalIntrstPay;
    }

    /**
     * Sets the value of the totalIntrstPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalIntrstPay(BigInteger value) {
        this.totalIntrstPay = value;
    }

}
