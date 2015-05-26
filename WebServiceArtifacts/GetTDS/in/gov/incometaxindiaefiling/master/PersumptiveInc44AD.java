
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
 *         &lt;element name="GrsTrnOverOrReceipt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotPersumptiveInc44AD">
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
    "grsTrnOverOrReceipt",
    "totPersumptiveInc44AD"
})
@XmlRootElement(name = "PersumptiveInc44AD")
public class PersumptiveInc44AD {

    @XmlElement(name = "GrsTrnOverOrReceipt", required = true, defaultValue = "0")
    protected BigInteger grsTrnOverOrReceipt;
    @XmlElement(name = "TotPersumptiveInc44AD", required = true, defaultValue = "0")
    protected BigInteger totPersumptiveInc44AD;

    /**
     * Gets the value of the grsTrnOverOrReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrsTrnOverOrReceipt() {
        return grsTrnOverOrReceipt;
    }

    /**
     * Sets the value of the grsTrnOverOrReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrsTrnOverOrReceipt(BigInteger value) {
        this.grsTrnOverOrReceipt = value;
    }

    /**
     * Gets the value of the totPersumptiveInc44AD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotPersumptiveInc44AD() {
        return totPersumptiveInc44AD;
    }

    /**
     * Sets the value of the totPersumptiveInc44AD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotPersumptiveInc44AD(BigInteger value) {
        this.totPersumptiveInc44AD = value;
    }

}
