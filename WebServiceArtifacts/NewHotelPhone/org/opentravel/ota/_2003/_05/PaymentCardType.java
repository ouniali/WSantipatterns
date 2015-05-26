
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.opentravel.org/OTA/2003/05}List_PaymentCardIssuer" minOccurs="0"/>
 *         &lt;element name="Issuer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_PaymentCardIssuer">
 *                 &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressType" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ShareSynchInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ShareMarketInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PhoneLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneTechType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneUseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeriesCode" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ShareSynchInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ShareMarketInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorCode">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LoyalLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LoyalLevelCode" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="SingleVendorInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SingleVndr"/>
 *                       &lt;enumeration value="Alliance"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SignupDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MagneticStripe" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThreeDomainSecurity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Gateway" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AuthenticationVerificationValue" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *                                         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TransactionPassword" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *                                         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ECI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Results" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PAResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SignatureVerfication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="XID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SignatureOnFile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SignatureOnFileInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDateExclusiveInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExtendedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SecureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SignatureOnFileInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CardHolderRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CompanyCardReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardNumber",
    "cardType",
    "issuer",
    "cardHolderName",
    "address",
    "telephone",
    "email",
    "seriesCode",
    "custLoyalty",
    "magneticStripe",
    "threeDomainSecurity",
    "signatureOnFile",
    "tpaExtensions"
})
public class PaymentCardType {

    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardType")
    protected ListPaymentCardIssuer cardType;
    @XmlElement(name = "Issuer")
    protected PaymentCardType.Issuer issuer;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Telephone")
    protected List<PaymentCardType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "SeriesCode")
    protected EncryptionTokenType seriesCode;
    @XmlElement(name = "CustLoyalty")
    protected List<PaymentCardType.CustLoyalty> custLoyalty;
    @XmlElement(name = "MagneticStripe")
    protected List<EncryptionTokenType> magneticStripe;
    @XmlElement(name = "ThreeDomainSecurity")
    protected PaymentCardType.ThreeDomainSecurity threeDomainSecurity;
    @XmlElement(name = "SignatureOnFile")
    protected PaymentCardType.SignatureOnFile signatureOnFile;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ExtendedPaymentInd")
    protected Boolean extendedPaymentInd;
    @XmlAttribute(name = "SecureInd")
    protected Boolean secureInd;
    @XmlAttribute(name = "SignatureOnFileInd")
    protected Boolean signatureOnFileInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CardCode")
    protected String cardCode;
    @XmlAttribute(name = "CardHolderRPH")
    protected String cardHolderRPH;
    @XmlAttribute(name = "CompanyCardReference")
    protected String companyCardReference;
    @XmlAttribute(name = "CountryOfIssue")
    protected String countryOfIssue;
    @XmlAttribute(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    protected String expireDate;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link ListPaymentCardIssuer }
     *     
     */
    public ListPaymentCardIssuer getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPaymentCardIssuer }
     *     
     */
    public void setCardType(ListPaymentCardIssuer value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.Issuer }
     *     
     */
    public PaymentCardType.Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.Issuer }
     *     
     */
    public void setIssuer(PaymentCardType.Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType.Telephone }
     * 
     * 
     */
    public List<PaymentCardType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<PaymentCardType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the seriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionTokenType }
     *     
     */
    public EncryptionTokenType getSeriesCode() {
        return seriesCode;
    }

    /**
     * Sets the value of the seriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionTokenType }
     *     
     */
    public void setSeriesCode(EncryptionTokenType value) {
        this.seriesCode = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType.CustLoyalty }
     * 
     * 
     */
    public List<PaymentCardType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<PaymentCardType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the magneticStripe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magneticStripe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagneticStripe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionTokenType }
     * 
     * 
     */
    public List<EncryptionTokenType> getMagneticStripe() {
        if (magneticStripe == null) {
            magneticStripe = new ArrayList<EncryptionTokenType>();
        }
        return this.magneticStripe;
    }

    /**
     * Gets the value of the threeDomainSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.ThreeDomainSecurity }
     *     
     */
    public PaymentCardType.ThreeDomainSecurity getThreeDomainSecurity() {
        return threeDomainSecurity;
    }

    /**
     * Sets the value of the threeDomainSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.ThreeDomainSecurity }
     *     
     */
    public void setThreeDomainSecurity(PaymentCardType.ThreeDomainSecurity value) {
        this.threeDomainSecurity = value;
    }

    /**
     * Gets the value of the signatureOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.SignatureOnFile }
     *     
     */
    public PaymentCardType.SignatureOnFile getSignatureOnFile() {
        return signatureOnFile;
    }

    /**
     * Sets the value of the signatureOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.SignatureOnFile }
     *     
     */
    public void setSignatureOnFile(PaymentCardType.SignatureOnFile value) {
        this.signatureOnFile = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     * Gets the value of the secureInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecureInd() {
        return secureInd;
    }

    /**
     * Sets the value of the secureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecureInd(Boolean value) {
        this.secureInd = value;
    }

    /**
     * Gets the value of the signatureOnFileInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureOnFileInd() {
        return signatureOnFileInd;
    }

    /**
     * Sets the value of the signatureOnFileInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureOnFileInd(Boolean value) {
        this.signatureOnFileInd = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardHolderRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderRPH() {
        return cardHolderRPH;
    }

    /**
     * Sets the value of the cardHolderRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderRPH(String value) {
        this.cardHolderRPH = value;
    }

    /**
     * Gets the value of the companyCardReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCardReference() {
        return companyCardReference;
    }

    /**
     * Sets the value of the companyCardReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCardReference(String value) {
        this.companyCardReference = value;
    }

    /**
     * Gets the value of the countryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Sets the value of the countryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfIssue(String value) {
        this.countryOfIssue = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
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
     *       &lt;attribute name="ShareSynchInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ShareMarketInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VendorCode">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LoyalLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LoyalLevelCode" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="SingleVendorInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SingleVndr"/>
     *             &lt;enumeration value="Alliance"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SignupDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

        @XmlAttribute(name = "ShareSynchInd")
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        protected String shareMarketInd;
        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected BigInteger loyalLevelCode;
        @XmlAttribute(name = "SingleVendorInd")
        protected String singleVendorInd;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the programID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Sets the value of the programID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Gets the value of the membershipID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Sets the value of the membershipID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Gets the value of the primaryLoyaltyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * Sets the value of the primaryLoyaltyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * Gets the value of the allianceLoyaltyLevelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * Sets the value of the allianceLoyaltyLevelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * Gets the value of the customerValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * Sets the value of the customerValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
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
         * Gets the value of the loyalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * Sets the value of the loyalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * Gets the value of the loyalLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * Sets the value of the loyalLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLoyalLevelCode(BigInteger value) {
            this.loyalLevelCode = value;
        }

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

        /**
         * Gets the value of the signupDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * Sets the value of the signupDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_PaymentCardIssuer">
     *       &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Issuer
        extends ListPaymentCardIssuer
    {

        @XmlAttribute(name = "BankID")
        protected String bankID;

        /**
         * Gets the value of the bankID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * Sets the value of the bankID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankID(String value) {
            this.bankID = value;
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
     *       &lt;attribute name="SignatureOnFileInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDateExclusiveInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SignatureOnFile {

        @XmlAttribute(name = "SignatureOnFileInd")
        protected Boolean signatureOnFileInd;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveInd")
        protected Boolean expireDateExclusiveInd;

        /**
         * Gets the value of the signatureOnFileInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignatureOnFileInd() {
            return signatureOnFileInd;
        }

        /**
         * Sets the value of the signatureOnFileInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignatureOnFileInd(Boolean value) {
            this.signatureOnFileInd = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveInd() {
            return expireDateExclusiveInd;
        }

        /**
         * Sets the value of the expireDateExclusiveInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveInd(Boolean value) {
            this.expireDateExclusiveInd = value;
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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ShareSynchInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ShareMarketInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PhoneLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneTechType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneUseType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "ShareSynchInd")
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        protected String shareMarketInd;
        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;
        @XmlAttribute(name = "CountryAccessCode")
        protected String countryAccessCode;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "Extension")
        protected String extension;
        @XmlAttribute(name = "PIN")
        protected String pin;
        @XmlAttribute(name = "Remark")
        protected String remark;
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the phoneLocationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * Sets the value of the phoneLocationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * Gets the value of the phoneTechType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * Sets the value of the phoneTechType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * Gets the value of the phoneUseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * Sets the value of the phoneUseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

        /**
         * Gets the value of the countryAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryAccessCode() {
            return countryAccessCode;
        }

        /**
         * Sets the value of the countryAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryAccessCode(String value) {
            this.countryAccessCode = value;
        }

        /**
         * Gets the value of the areaCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * Sets the value of the areaCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * Gets the value of the formattedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedInd() {
            return formattedInd;
        }

        /**
         * Sets the value of the formattedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedInd(Boolean value) {
            this.formattedInd = value;
        }

        /**
         * Gets the value of the defaultInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultInd() {
            return defaultInd;
        }

        /**
         * Sets the value of the defaultInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
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
     *         &lt;element name="Gateway" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AuthenticationVerificationValue" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
     *                               &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TransactionPassword" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
     *                               &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ECI" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Results" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PAResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SignatureVerfication" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="XID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "gateway",
        "results"
    })
    public static class ThreeDomainSecurity {

        @XmlElement(name = "Gateway")
        protected PaymentCardType.ThreeDomainSecurity.Gateway gateway;
        @XmlElement(name = "Results")
        protected PaymentCardType.ThreeDomainSecurity.Results results;

        /**
         * Gets the value of the gateway property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Gateway }
         *     
         */
        public PaymentCardType.ThreeDomainSecurity.Gateway getGateway() {
            return gateway;
        }

        /**
         * Sets the value of the gateway property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Gateway }
         *     
         */
        public void setGateway(PaymentCardType.ThreeDomainSecurity.Gateway value) {
            this.gateway = value;
        }

        /**
         * Gets the value of the results property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Results }
         *     
         */
        public PaymentCardType.ThreeDomainSecurity.Results getResults() {
            return results;
        }

        /**
         * Sets the value of the results property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Results }
         *     
         */
        public void setResults(PaymentCardType.ThreeDomainSecurity.Results value) {
            this.results = value;
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
         *         &lt;element name="AuthenticationVerificationValue" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
         *                     &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TransactionPassword" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
         *                     &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ECI" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "authenticationVerificationValue",
            "transactionPassword",
            "tpaExtensions"
        })
        public static class Gateway {

            @XmlElement(name = "AuthenticationVerificationValue")
            protected PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue authenticationVerificationValue;
            @XmlElement(name = "TransactionPassword")
            protected PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword transactionPassword;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "ECI")
            protected String eci;
            @XmlAttribute(name = "MerchantID")
            protected String merchantID;
            @XmlAttribute(name = "ProcessorID")
            protected String processorID;
            @XmlAttribute(name = "URL")
            @XmlSchemaType(name = "anyURI")
            protected String url;

            /**
             * Gets the value of the authenticationVerificationValue property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue }
             *     
             */
            public PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue getAuthenticationVerificationValue() {
                return authenticationVerificationValue;
            }

            /**
             * Sets the value of the authenticationVerificationValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue }
             *     
             */
            public void setAuthenticationVerificationValue(PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue value) {
                this.authenticationVerificationValue = value;
            }

            /**
             * Gets the value of the transactionPassword property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword }
             *     
             */
            public PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword getTransactionPassword() {
                return transactionPassword;
            }

            /**
             * Sets the value of the transactionPassword property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword }
             *     
             */
            public void setTransactionPassword(PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword value) {
                this.transactionPassword = value;
            }

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensionsType }
             *     
             */
            public TPAExtensionsType getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensionsType }
             *     
             */
            public void setTPAExtensions(TPAExtensionsType value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the eci property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getECI() {
                return eci;
            }

            /**
             * Sets the value of the eci property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setECI(String value) {
                this.eci = value;
            }

            /**
             * Gets the value of the merchantID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMerchantID() {
                return merchantID;
            }

            /**
             * Sets the value of the merchantID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMerchantID(String value) {
                this.merchantID = value;
            }

            /**
             * Gets the value of the processorID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessorID() {
                return processorID;
            }

            /**
             * Sets the value of the processorID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessorID(String value) {
                this.processorID = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURL() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURL(String value) {
                this.url = value;
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
             *         &lt;choice>
             *           &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
             *           &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;/choice>
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
                "secure",
                "plainText"
            })
            public static class AuthenticationVerificationValue {

                @XmlElement(name = "Secure")
                protected EncryptionTokenType secure;
                @XmlElement(name = "PlainText")
                protected String plainText;

                /**
                 * Gets the value of the secure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public EncryptionTokenType getSecure() {
                    return secure;
                }

                /**
                 * Sets the value of the secure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public void setSecure(EncryptionTokenType value) {
                    this.secure = value;
                }

                /**
                 * Gets the value of the plainText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlainText() {
                    return plainText;
                }

                /**
                 * Sets the value of the plainText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlainText(String value) {
                    this.plainText = value;
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
             *         &lt;choice>
             *           &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
             *           &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;/choice>
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
                "secure",
                "plainText"
            })
            public static class TransactionPassword {

                @XmlElement(name = "Secure")
                protected EncryptionTokenType secure;
                @XmlElement(name = "PlainText")
                protected String plainText;

                /**
                 * Gets the value of the secure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public EncryptionTokenType getSecure() {
                    return secure;
                }

                /**
                 * Sets the value of the secure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public void setSecure(EncryptionTokenType value) {
                    this.secure = value;
                }

                /**
                 * Gets the value of the plainText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlainText() {
                    return plainText;
                }

                /**
                 * Sets the value of the plainText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlainText(String value) {
                    this.plainText = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PAResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SignatureVerfication" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="XID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions"
        })
        public static class Results {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "CAVV")
            protected String cavv;
            @XmlAttribute(name = "PAResStatus")
            protected String paResStatus;
            @XmlAttribute(name = "SignatureVerfication")
            protected String signatureVerfication;
            @XmlAttribute(name = "TransactionID")
            protected String transactionID;
            @XmlAttribute(name = "XID")
            protected String xid;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensionsType }
             *     
             */
            public TPAExtensionsType getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensionsType }
             *     
             */
            public void setTPAExtensions(TPAExtensionsType value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the cavv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAVV() {
                return cavv;
            }

            /**
             * Sets the value of the cavv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAVV(String value) {
                this.cavv = value;
            }

            /**
             * Gets the value of the paResStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAResStatus() {
                return paResStatus;
            }

            /**
             * Sets the value of the paResStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAResStatus(String value) {
                this.paResStatus = value;
            }

            /**
             * Gets the value of the signatureVerfication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignatureVerfication() {
                return signatureVerfication;
            }

            /**
             * Sets the value of the signatureVerfication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignatureVerfication(String value) {
                this.signatureVerfication = value;
            }

            /**
             * Gets the value of the transactionID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransactionID() {
                return transactionID;
            }

            /**
             * Sets the value of the transactionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransactionID(String value) {
                this.transactionID = value;
            }

            /**
             * Gets the value of the xid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXID() {
                return xid;
            }

            /**
             * Sets the value of the xid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXID(String value) {
                this.xid = value;
            }

        }

    }

}
