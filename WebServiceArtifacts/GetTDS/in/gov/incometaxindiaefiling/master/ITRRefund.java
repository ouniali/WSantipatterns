
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
 *         &lt;element name="RefundDue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankAccountNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EcsRequired">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="Y"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepositToBankAccount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MICRCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d\d\d\d\d\d\d\d\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BankAccountType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="3"/>
 *                         &lt;enumeration value="SAV"/>
 *                         &lt;enumeration value="CUR"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssetOutIndiaFlag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="YES"/>
 *               &lt;enumeration value="NO"/>
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
    "refundDue",
    "bankAccountNumber",
    "ecsRequired",
    "depositToBankAccount",
    "assetOutIndiaFlag"
})
@XmlRootElement(name = "ITR_Refund")
public class ITRRefund {

    @XmlElement(name = "RefundDue", required = true, defaultValue = "0")
    protected BigInteger refundDue;
    @XmlElement(name = "BankAccountNumber", required = true)
    protected String bankAccountNumber;
    @XmlElement(name = "EcsRequired", required = true, defaultValue = "N")
    protected String ecsRequired;
    @XmlElement(name = "DepositToBankAccount", required = true)
    protected ITRRefund.DepositToBankAccount depositToBankAccount;
    @XmlElement(name = "AssetOutIndiaFlag", required = true)
    protected String assetOutIndiaFlag;

    /**
     * Gets the value of the refundDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefundDue() {
        return refundDue;
    }

    /**
     * Sets the value of the refundDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefundDue(BigInteger value) {
        this.refundDue = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the ecsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcsRequired() {
        return ecsRequired;
    }

    /**
     * Sets the value of the ecsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcsRequired(String value) {
        this.ecsRequired = value;
    }

    /**
     * Gets the value of the depositToBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ITRRefund.DepositToBankAccount }
     *     
     */
    public ITRRefund.DepositToBankAccount getDepositToBankAccount() {
        return depositToBankAccount;
    }

    /**
     * Sets the value of the depositToBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITRRefund.DepositToBankAccount }
     *     
     */
    public void setDepositToBankAccount(ITRRefund.DepositToBankAccount value) {
        this.depositToBankAccount = value;
    }

    /**
     * Gets the value of the assetOutIndiaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetOutIndiaFlag() {
        return assetOutIndiaFlag;
    }

    /**
     * Sets the value of the assetOutIndiaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetOutIndiaFlag(String value) {
        this.assetOutIndiaFlag = value;
    }


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
     *         &lt;element name="MICRCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d\d\d\d\d\d\d\d\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BankAccountType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="3"/>
     *               &lt;enumeration value="SAV"/>
     *               &lt;enumeration value="CUR"/>
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
        "micrCode",
        "bankAccountType"
    })
    public static class DepositToBankAccount {

        @XmlElement(name = "MICRCode", required = true)
        protected String micrCode;
        @XmlElement(name = "BankAccountType", required = true)
        protected String bankAccountType;

        /**
         * Gets the value of the micrCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMICRCode() {
            return micrCode;
        }

        /**
         * Sets the value of the micrCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMICRCode(String value) {
            this.micrCode = value;
        }

        /**
         * Gets the value of the bankAccountType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankAccountType() {
            return bankAccountType;
        }

        /**
         * Sets the value of the bankAccountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankAccountType(String value) {
            this.bankAccountType = value;
        }

    }

}
