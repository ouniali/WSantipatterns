
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
 *         &lt;element name="TaxDutyCesAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContToEmpPFSFGF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmpBonusComm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntPayaleToFI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntPayaleToFISchBank">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LeaveEncashPayable">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotAmtUs43b">
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
    "taxDutyCesAmt",
    "contToEmpPFSFGF",
    "empBonusComm",
    "intPayaleToFI",
    "intPayaleToFISchBank",
    "leaveEncashPayable",
    "totAmtUs43B"
})
@XmlRootElement(name = "AmtUs43B")
public class AmtUs43B {

    @XmlElement(name = "TaxDutyCesAmt", required = true, defaultValue = "0")
    protected BigInteger taxDutyCesAmt;
    @XmlElement(name = "ContToEmpPFSFGF", required = true, defaultValue = "0")
    protected BigInteger contToEmpPFSFGF;
    @XmlElement(name = "EmpBonusComm", required = true, defaultValue = "0")
    protected BigInteger empBonusComm;
    @XmlElement(name = "IntPayaleToFI", required = true, defaultValue = "0")
    protected BigInteger intPayaleToFI;
    @XmlElement(name = "IntPayaleToFISchBank", required = true, defaultValue = "0")
    protected BigInteger intPayaleToFISchBank;
    @XmlElement(name = "LeaveEncashPayable", required = true, defaultValue = "0")
    protected BigInteger leaveEncashPayable;
    @XmlElement(name = "TotAmtUs43b", required = true, defaultValue = "0")
    protected BigInteger totAmtUs43B;

    /**
     * Gets the value of the taxDutyCesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxDutyCesAmt() {
        return taxDutyCesAmt;
    }

    /**
     * Sets the value of the taxDutyCesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxDutyCesAmt(BigInteger value) {
        this.taxDutyCesAmt = value;
    }

    /**
     * Gets the value of the contToEmpPFSFGF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContToEmpPFSFGF() {
        return contToEmpPFSFGF;
    }

    /**
     * Sets the value of the contToEmpPFSFGF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContToEmpPFSFGF(BigInteger value) {
        this.contToEmpPFSFGF = value;
    }

    /**
     * Gets the value of the empBonusComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmpBonusComm() {
        return empBonusComm;
    }

    /**
     * Sets the value of the empBonusComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmpBonusComm(BigInteger value) {
        this.empBonusComm = value;
    }

    /**
     * Gets the value of the intPayaleToFI property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntPayaleToFI() {
        return intPayaleToFI;
    }

    /**
     * Sets the value of the intPayaleToFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntPayaleToFI(BigInteger value) {
        this.intPayaleToFI = value;
    }

    /**
     * Gets the value of the intPayaleToFISchBank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntPayaleToFISchBank() {
        return intPayaleToFISchBank;
    }

    /**
     * Sets the value of the intPayaleToFISchBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntPayaleToFISchBank(BigInteger value) {
        this.intPayaleToFISchBank = value;
    }

    /**
     * Gets the value of the leaveEncashPayable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeaveEncashPayable() {
        return leaveEncashPayable;
    }

    /**
     * Sets the value of the leaveEncashPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeaveEncashPayable(BigInteger value) {
        this.leaveEncashPayable = value;
    }

    /**
     * Gets the value of the totAmtUs43B property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotAmtUs43B() {
        return totAmtUs43B;
    }

    /**
     * Sets the value of the totAmtUs43B property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotAmtUs43B(BigInteger value) {
        this.totAmtUs43B = value;
    }

}
