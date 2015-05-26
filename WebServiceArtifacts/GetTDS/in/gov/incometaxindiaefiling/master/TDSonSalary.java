
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}EmployerOrDeductorOrCollectDetl"/>
 *         &lt;element name="IncChrgSal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalTDSSal">
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
    "employerOrDeductorOrCollectDetl",
    "incChrgSal",
    "totalTDSSal"
})
@XmlRootElement(name = "TDSonSalary")
public class TDSonSalary {

    @XmlElement(name = "EmployerOrDeductorOrCollectDetl", required = true)
    protected EmployerOrDeductorOrCollectDetl employerOrDeductorOrCollectDetl;
    @XmlElement(name = "IncChrgSal", required = true, defaultValue = "0")
    protected BigInteger incChrgSal;
    @XmlElement(name = "TotalTDSSal", required = true, defaultValue = "0")
    protected BigInteger totalTDSSal;

    /**
     * Gets the value of the employerOrDeductorOrCollectDetl property.
     * 
     * @return
     *     possible object is
     *     {@link EmployerOrDeductorOrCollectDetl }
     *     
     */
    public EmployerOrDeductorOrCollectDetl getEmployerOrDeductorOrCollectDetl() {
        return employerOrDeductorOrCollectDetl;
    }

    /**
     * Sets the value of the employerOrDeductorOrCollectDetl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerOrDeductorOrCollectDetl }
     *     
     */
    public void setEmployerOrDeductorOrCollectDetl(EmployerOrDeductorOrCollectDetl value) {
        this.employerOrDeductorOrCollectDetl = value;
    }

    /**
     * Gets the value of the incChrgSal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncChrgSal() {
        return incChrgSal;
    }

    /**
     * Sets the value of the incChrgSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncChrgSal(BigInteger value) {
        this.incChrgSal = value;
    }

    /**
     * Gets the value of the totalTDSSal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTDSSal() {
        return totalTDSSal;
    }

    /**
     * Sets the value of the totalTDSSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTDSSal(BigInteger value) {
        this.totalTDSSal = value;
    }

}
