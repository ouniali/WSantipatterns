
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CheckAuthorization" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="CreditCardAuthorization" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="CreditCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"/>
 *                     &lt;element name="ID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="5" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                   &lt;attribute name="SourceType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="NormalTransaction"/>
 *                         &lt;enumeration value="MailOrPhoneOrder"/>
 *                         &lt;enumeration value="UnattendedTerminal"/>
 *                         &lt;enumeration value="MerchantIsSuspicious"/>
 *                         &lt;enumeration value="eCommerceSecuredTransaction"/>
 *                         &lt;enumeration value="eCommerceUnsecuredTransaction"/>
 *                         &lt;enumeration value="InFlightAirPhone"/>
 *                         &lt;enumeration value="CID_NotLegible"/>
 *                         &lt;enumeration value="CID_NotOnCard"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ExtendedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="ExtendedPaymentQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *                   &lt;attribute name="ExtendedPaymentFrequency" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                   &lt;attribute name="AuthorizationCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[A-Za-z0-9]{1,12}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ReversalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="CardPresentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="E_CommerceCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                   &lt;attribute name="AuthTransactionID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                   &lt;attribute name="AuthVerificationValue" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="AccountAuthorization" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="AccountInfo" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="AccountName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                             &lt;attribute name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                             &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                             &lt;attribute name="Password" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                             &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                   &lt;attribute name="NonISO_CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="DriversLicenseAuthorization" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="IgnoreReservationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PrincipalCompanyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationType", propOrder = {
    "checkAuthorization",
    "creditCardAuthorization",
    "accountAuthorization",
    "driversLicenseAuthorization",
    "bookingReferenceID"
})
public class AuthorizationType {

    @XmlElement(name = "CheckAuthorization")
    protected AuthorizationType.CheckAuthorization checkAuthorization;
    @XmlElement(name = "CreditCardAuthorization")
    protected AuthorizationType.CreditCardAuthorization creditCardAuthorization;
    @XmlElement(name = "AccountAuthorization")
    protected AuthorizationType.AccountAuthorization accountAuthorization;
    @XmlElement(name = "DriversLicenseAuthorization")
    protected DocumentType driversLicenseAuthorization;
    @XmlElement(name = "BookingReferenceID")
    protected AuthorizationType.BookingReferenceID bookingReferenceID;
    @XmlAttribute(name = "PrincipalCompanyCode")
    protected String principalCompanyCode;
    @XmlAttribute(name = "RefNumber")
    protected String refNumber;

    /**
     * Gets the value of the checkAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType.CheckAuthorization }
     *     
     */
    public AuthorizationType.CheckAuthorization getCheckAuthorization() {
        return checkAuthorization;
    }

    /**
     * Sets the value of the checkAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType.CheckAuthorization }
     *     
     */
    public void setCheckAuthorization(AuthorizationType.CheckAuthorization value) {
        this.checkAuthorization = value;
    }

    /**
     * Gets the value of the creditCardAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType.CreditCardAuthorization }
     *     
     */
    public AuthorizationType.CreditCardAuthorization getCreditCardAuthorization() {
        return creditCardAuthorization;
    }

    /**
     * Sets the value of the creditCardAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType.CreditCardAuthorization }
     *     
     */
    public void setCreditCardAuthorization(AuthorizationType.CreditCardAuthorization value) {
        this.creditCardAuthorization = value;
    }

    /**
     * Gets the value of the accountAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType.AccountAuthorization }
     *     
     */
    public AuthorizationType.AccountAuthorization getAccountAuthorization() {
        return accountAuthorization;
    }

    /**
     * Sets the value of the accountAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType.AccountAuthorization }
     *     
     */
    public void setAccountAuthorization(AuthorizationType.AccountAuthorization value) {
        this.accountAuthorization = value;
    }

    /**
     * Gets the value of the driversLicenseAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDriversLicenseAuthorization() {
        return driversLicenseAuthorization;
    }

    /**
     * Sets the value of the driversLicenseAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDriversLicenseAuthorization(DocumentType value) {
        this.driversLicenseAuthorization = value;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType.BookingReferenceID }
     *     
     */
    public AuthorizationType.BookingReferenceID getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * Sets the value of the bookingReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType.BookingReferenceID }
     *     
     */
    public void setBookingReferenceID(AuthorizationType.BookingReferenceID value) {
        this.bookingReferenceID = value;
    }

    /**
     * Gets the value of the principalCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalCompanyCode() {
        return principalCompanyCode;
    }

    /**
     * Sets the value of the principalCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalCompanyCode(String value) {
        this.principalCompanyCode = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
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
     *         &lt;element name="AccountInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AccountName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="Password" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="NonISO_CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountInfo"
    })
    public static class AccountAuthorization {

        @XmlElement(name = "AccountInfo")
        protected AuthorizationType.AccountAuthorization.AccountInfo accountInfo;
        @XmlAttribute(name = "NonISO_CurrencyCode")
        protected String nonISOCurrencyCode;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the accountInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AuthorizationType.AccountAuthorization.AccountInfo }
         *     
         */
        public AuthorizationType.AccountAuthorization.AccountInfo getAccountInfo() {
            return accountInfo;
        }

        /**
         * Sets the value of the accountInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthorizationType.AccountAuthorization.AccountInfo }
         *     
         */
        public void setAccountInfo(AuthorizationType.AccountAuthorization.AccountInfo value) {
            this.accountInfo = value;
        }

        /**
         * Gets the value of the nonISOCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonISOCurrencyCode() {
            return nonISOCurrencyCode;
        }

        /**
         * Sets the value of the nonISOCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonISOCurrencyCode(String value) {
            this.nonISOCurrencyCode = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
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
         *       &lt;attribute name="AccountName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="Password" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AccountInfo {

            @XmlAttribute(name = "AccountName")
            protected String accountName;
            @XmlAttribute(name = "CompanyName")
            protected String companyName;
            @XmlAttribute(name = "AccountID")
            protected String accountID;
            @XmlAttribute(name = "Password")
            protected String password;
            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Gets the value of the accountName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountName() {
                return accountName;
            }

            /**
             * Sets the value of the accountName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountName(String value) {
                this.accountName = value;
            }

            /**
             * Gets the value of the companyName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyName() {
                return companyName;
            }

            /**
             * Sets the value of the companyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyName(String value) {
                this.companyName = value;
            }

            /**
             * Gets the value of the accountID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountID() {
                return accountID;
            }

            /**
             * Sets the value of the accountID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountID(String value) {
                this.accountID = value;
            }

            /**
             * Gets the value of the password property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="IgnoreReservationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingReferenceID
        extends UniqueIDType
    {

        @XmlAttribute(name = "IgnoreReservationInd")
        protected Boolean ignoreReservationInd;

        /**
         * Gets the value of the ignoreReservationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIgnoreReservationInd() {
            return ignoreReservationInd;
        }

        /**
         * Sets the value of the ignoreReservationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIgnoreReservationInd(Boolean value) {
            this.ignoreReservationInd = value;
        }

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
     *         &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bankAcct"
    })
    public static class CheckAuthorization {

        @XmlElement(name = "BankAcct", required = true)
        protected BankAcctType bankAcct;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the bankAcct property.
         * 
         * @return
         *     possible object is
         *     {@link BankAcctType }
         *     
         */
        public BankAcctType getBankAcct() {
            return bankAcct;
        }

        /**
         * Sets the value of the bankAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAcctType }
         *     
         */
        public void setBankAcct(BankAcctType value) {
            this.bankAcct = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

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
     *         &lt;element name="CreditCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"/>
     *         &lt;element name="ID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="5" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="SourceType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="NormalTransaction"/>
     *             &lt;enumeration value="MailOrPhoneOrder"/>
     *             &lt;enumeration value="UnattendedTerminal"/>
     *             &lt;enumeration value="MerchantIsSuspicious"/>
     *             &lt;enumeration value="eCommerceSecuredTransaction"/>
     *             &lt;enumeration value="eCommerceUnsecuredTransaction"/>
     *             &lt;enumeration value="InFlightAirPhone"/>
     *             &lt;enumeration value="CID_NotLegible"/>
     *             &lt;enumeration value="CID_NotOnCard"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ExtendedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ExtendedPaymentQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *       &lt;attribute name="ExtendedPaymentFrequency" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="AuthorizationCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[A-Za-z0-9]{1,12}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReversalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CardPresentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="E_CommerceCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="AuthTransactionID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="AuthVerificationValue" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creditCard",
        "id"
    })
    public static class CreditCardAuthorization {

        @XmlElement(name = "CreditCard", required = true)
        protected PaymentCardType creditCard;
        @XmlElement(name = "ID")
        protected List<UniqueIDType> id;
        @XmlAttribute(name = "SourceType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sourceType;
        @XmlAttribute(name = "ExtendedPaymentInd")
        protected Boolean extendedPaymentInd;
        @XmlAttribute(name = "ExtendedPaymentQuantity")
        protected Integer extendedPaymentQuantity;
        @XmlAttribute(name = "ExtendedPaymentFrequency")
        protected TimeUnitType extendedPaymentFrequency;
        @XmlAttribute(name = "AuthorizationCode")
        protected String authorizationCode;
        @XmlAttribute(name = "ReversalIndicator")
        protected Boolean reversalIndicator;
        @XmlAttribute(name = "CardPresentInd")
        protected Boolean cardPresentInd;
        @XmlAttribute(name = "E_CommerceCode")
        protected String eCommerceCode;
        @XmlAttribute(name = "AuthTransactionID")
        protected String authTransactionID;
        @XmlAttribute(name = "AuthVerificationValue")
        protected String authVerificationValue;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the creditCard property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType }
         *     
         */
        public PaymentCardType getCreditCard() {
            return creditCard;
        }

        /**
         * Sets the value of the creditCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType }
         *     
         */
        public void setCreditCard(PaymentCardType value) {
            this.creditCard = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getID() {
            if (id == null) {
                id = new ArrayList<UniqueIDType>();
            }
            return this.id;
        }

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
        }

        /**
         * Gets the value of the extendedPaymentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExtendedPaymentInd() {
            return extendedPaymentInd;
        }

        /**
         * Sets the value of the extendedPaymentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExtendedPaymentInd(Boolean value) {
            this.extendedPaymentInd = value;
        }

        /**
         * Gets the value of the extendedPaymentQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getExtendedPaymentQuantity() {
            return extendedPaymentQuantity;
        }

        /**
         * Sets the value of the extendedPaymentQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setExtendedPaymentQuantity(Integer value) {
            this.extendedPaymentQuantity = value;
        }

        /**
         * Gets the value of the extendedPaymentFrequency property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getExtendedPaymentFrequency() {
            return extendedPaymentFrequency;
        }

        /**
         * Sets the value of the extendedPaymentFrequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setExtendedPaymentFrequency(TimeUnitType value) {
            this.extendedPaymentFrequency = value;
        }

        /**
         * Gets the value of the authorizationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorizationCode() {
            return authorizationCode;
        }

        /**
         * Sets the value of the authorizationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorizationCode(String value) {
            this.authorizationCode = value;
        }

        /**
         * Gets the value of the reversalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReversalIndicator() {
            return reversalIndicator;
        }

        /**
         * Sets the value of the reversalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReversalIndicator(Boolean value) {
            this.reversalIndicator = value;
        }

        /**
         * Gets the value of the cardPresentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCardPresentInd() {
            return cardPresentInd;
        }

        /**
         * Sets the value of the cardPresentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCardPresentInd(Boolean value) {
            this.cardPresentInd = value;
        }

        /**
         * Gets the value of the eCommerceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getECommerceCode() {
            return eCommerceCode;
        }

        /**
         * Sets the value of the eCommerceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setECommerceCode(String value) {
            this.eCommerceCode = value;
        }

        /**
         * Gets the value of the authTransactionID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthTransactionID() {
            return authTransactionID;
        }

        /**
         * Sets the value of the authTransactionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthTransactionID(String value) {
            this.authTransactionID = value;
        }

        /**
         * Gets the value of the authVerificationValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthVerificationValue() {
            return authVerificationValue;
        }

        /**
         * Sets the value of the authVerificationValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthVerificationValue(String value) {
            this.authVerificationValue = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }

}
