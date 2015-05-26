
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}TaxesPaid"/>
 *         &lt;element name="BalTaxPayable" minOccurs="0">
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
    "taxesPaid",
    "balTaxPayable"
})
@XmlRootElement(name = "TaxPaid")
public class TaxPaid {

    @XmlElement(name = "TaxesPaid", required = true)
    protected TaxesPaid taxesPaid;
    @XmlElement(name = "BalTaxPayable", defaultValue = "0")
    protected BigInteger balTaxPayable;

    /**
     * Gets the value of the taxesPaid property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesPaid }
     *     
     */
    public TaxesPaid getTaxesPaid() {
        return taxesPaid;
    }

    /**
     * Sets the value of the taxesPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesPaid }
     *     
     */
    public void setTaxesPaid(TaxesPaid value) {
        this.taxesPaid = value;
    }

    /**
     * Gets the value of the balTaxPayable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBalTaxPayable() {
        return balTaxPayable;
    }

    /**
     * Sets the value of the balTaxPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBalTaxPayable(BigInteger value) {
        this.balTaxPayable = value;
    }

}
