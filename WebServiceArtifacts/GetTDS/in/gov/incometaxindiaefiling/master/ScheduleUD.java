
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
 *         &lt;element name="AssYr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *               &lt;pattern value="[0-9][0-9][0-9][0-9]-[0-9][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmtBFUD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmtDeprSOCY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BalCFNY">
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
    "assYr",
    "amtBFUD",
    "amtDeprSOCY",
    "balCFNY"
})
@XmlRootElement(name = "ScheduleUD")
public class ScheduleUD {

    @XmlElement(name = "AssYr", required = true)
    protected String assYr;
    @XmlElement(name = "AmtBFUD", required = true, defaultValue = "0")
    protected BigInteger amtBFUD;
    @XmlElement(name = "AmtDeprSOCY", required = true, defaultValue = "0")
    protected BigInteger amtDeprSOCY;
    @XmlElement(name = "BalCFNY", required = true, defaultValue = "0")
    protected BigInteger balCFNY;

    /**
     * Gets the value of the assYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssYr() {
        return assYr;
    }

    /**
     * Sets the value of the assYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssYr(String value) {
        this.assYr = value;
    }

    /**
     * Gets the value of the amtBFUD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtBFUD() {
        return amtBFUD;
    }

    /**
     * Sets the value of the amtBFUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtBFUD(BigInteger value) {
        this.amtBFUD = value;
    }

    /**
     * Gets the value of the amtDeprSOCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtDeprSOCY() {
        return amtDeprSOCY;
    }

    /**
     * Sets the value of the amtDeprSOCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtDeprSOCY(BigInteger value) {
        this.amtDeprSOCY = value;
    }

    /**
     * Gets the value of the balCFNY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBalCFNY() {
        return balCFNY;
    }

    /**
     * Sets the value of the balCFNY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBalCFNY(BigInteger value) {
        this.balCFNY = value;
    }

}
