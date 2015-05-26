
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
 *         &lt;element name="LongTermIndexation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LongTermWOIndexation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLongTerm">
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
    "longTermIndexation",
    "longTermWOIndexation",
    "totalLongTerm"
})
@XmlRootElement(name = "LongTerm")
public class LongTerm {

    @XmlElement(name = "LongTermIndexation", required = true, defaultValue = "0")
    protected BigInteger longTermIndexation;
    @XmlElement(name = "LongTermWOIndexation", required = true, defaultValue = "0")
    protected BigInteger longTermWOIndexation;
    @XmlElement(name = "TotalLongTerm", required = true, defaultValue = "0")
    protected BigInteger totalLongTerm;

    /**
     * Gets the value of the longTermIndexation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLongTermIndexation() {
        return longTermIndexation;
    }

    /**
     * Sets the value of the longTermIndexation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLongTermIndexation(BigInteger value) {
        this.longTermIndexation = value;
    }

    /**
     * Gets the value of the longTermWOIndexation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLongTermWOIndexation() {
        return longTermWOIndexation;
    }

    /**
     * Sets the value of the longTermWOIndexation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLongTermWOIndexation(BigInteger value) {
        this.longTermWOIndexation = value;
    }

    /**
     * Gets the value of the totalLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalLongTerm() {
        return totalLongTerm;
    }

    /**
     * Sets the value of the totalLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalLongTerm(BigInteger value) {
        this.totalLongTerm = value;
    }

}
