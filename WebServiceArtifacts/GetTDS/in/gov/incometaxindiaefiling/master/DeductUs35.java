
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
 *         &lt;element name="AmtDebPL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmtUs35Allowable">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExcessAmtOverDebPL">
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
    "amtDebPL",
    "amtUs35Allowable",
    "excessAmtOverDebPL"
})
@XmlRootElement(name = "DeductUs35")
public class DeductUs35 {

    @XmlElement(name = "AmtDebPL", required = true, defaultValue = "0")
    protected BigInteger amtDebPL;
    @XmlElement(name = "AmtUs35Allowable", required = true, defaultValue = "0")
    protected BigInteger amtUs35Allowable;
    @XmlElement(name = "ExcessAmtOverDebPL", required = true, defaultValue = "0")
    protected BigInteger excessAmtOverDebPL;

    /**
     * Gets the value of the amtDebPL property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtDebPL() {
        return amtDebPL;
    }

    /**
     * Sets the value of the amtDebPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtDebPL(BigInteger value) {
        this.amtDebPL = value;
    }

    /**
     * Gets the value of the amtUs35Allowable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtUs35Allowable() {
        return amtUs35Allowable;
    }

    /**
     * Sets the value of the amtUs35Allowable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtUs35Allowable(BigInteger value) {
        this.amtUs35Allowable = value;
    }

    /**
     * Gets the value of the excessAmtOverDebPL property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExcessAmtOverDebPL() {
        return excessAmtOverDebPL;
    }

    /**
     * Sets the value of the excessAmtOverDebPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExcessAmtOverDebPL(BigInteger value) {
        this.excessAmtOverDebPL = value;
    }

}
