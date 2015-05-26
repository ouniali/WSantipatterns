
package com.ukmail.services.contracts.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDomesticConsignmentWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDomesticConsignmentWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}AddConsignmentWebRequest">
 *       &lt;sequence>
 *         &lt;element name="BookIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmationTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtendedCover" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LongLength" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PreDeliveryNotification" type="{http://www.UKMail.com/Services/Contracts/DataContracts}PreDeliveryNotificationType" minOccurs="0"/>
 *         &lt;element name="SecureLocation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecureLocation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureOptional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDomesticConsignmentWebRequest", propOrder = {
    "bookIn",
    "codAmount",
    "confirmationEmail",
    "confirmationTelephone",
    "exchangeOnDelivery",
    "extendedCover",
    "longLength",
    "preDeliveryNotification",
    "secureLocation1",
    "secureLocation2",
    "signatureOptional"
})
public class AddDomesticConsignmentWebRequest
    extends AddConsignmentWebRequest
{

    @XmlElement(name = "BookIn")
    protected boolean bookIn;
    @XmlElement(name = "CODAmount", required = true)
    protected BigDecimal codAmount;
    @XmlElementRef(name = "ConfirmationEmail", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confirmationEmail;
    @XmlElementRef(name = "ConfirmationTelephone", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confirmationTelephone;
    @XmlElement(name = "ExchangeOnDelivery")
    protected boolean exchangeOnDelivery;
    @XmlElement(name = "ExtendedCover")
    protected int extendedCover;
    @XmlElement(name = "LongLength")
    protected boolean longLength;
    @XmlElement(name = "PreDeliveryNotification")
    @XmlSchemaType(name = "string")
    protected PreDeliveryNotificationType preDeliveryNotification;
    @XmlElementRef(name = "SecureLocation1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secureLocation1;
    @XmlElementRef(name = "SecureLocation2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secureLocation2;
    @XmlElement(name = "SignatureOptional")
    protected boolean signatureOptional;

    /**
     * Gets the value of the bookIn property.
     * 
     */
    public boolean isBookIn() {
        return bookIn;
    }

    /**
     * Sets the value of the bookIn property.
     * 
     */
    public void setBookIn(boolean value) {
        this.bookIn = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCODAmount(BigDecimal value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the confirmationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfirmationEmail() {
        return confirmationEmail;
    }

    /**
     * Sets the value of the confirmationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfirmationEmail(JAXBElement<String> value) {
        this.confirmationEmail = value;
    }

    /**
     * Gets the value of the confirmationTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfirmationTelephone() {
        return confirmationTelephone;
    }

    /**
     * Sets the value of the confirmationTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfirmationTelephone(JAXBElement<String> value) {
        this.confirmationTelephone = value;
    }

    /**
     * Gets the value of the exchangeOnDelivery property.
     * 
     */
    public boolean isExchangeOnDelivery() {
        return exchangeOnDelivery;
    }

    /**
     * Sets the value of the exchangeOnDelivery property.
     * 
     */
    public void setExchangeOnDelivery(boolean value) {
        this.exchangeOnDelivery = value;
    }

    /**
     * Gets the value of the extendedCover property.
     * 
     */
    public int getExtendedCover() {
        return extendedCover;
    }

    /**
     * Sets the value of the extendedCover property.
     * 
     */
    public void setExtendedCover(int value) {
        this.extendedCover = value;
    }

    /**
     * Gets the value of the longLength property.
     * 
     */
    public boolean isLongLength() {
        return longLength;
    }

    /**
     * Sets the value of the longLength property.
     * 
     */
    public void setLongLength(boolean value) {
        this.longLength = value;
    }

    /**
     * Gets the value of the preDeliveryNotification property.
     * 
     * @return
     *     possible object is
     *     {@link PreDeliveryNotificationType }
     *     
     */
    public PreDeliveryNotificationType getPreDeliveryNotification() {
        return preDeliveryNotification;
    }

    /**
     * Sets the value of the preDeliveryNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreDeliveryNotificationType }
     *     
     */
    public void setPreDeliveryNotification(PreDeliveryNotificationType value) {
        this.preDeliveryNotification = value;
    }

    /**
     * Gets the value of the secureLocation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecureLocation1() {
        return secureLocation1;
    }

    /**
     * Sets the value of the secureLocation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecureLocation1(JAXBElement<String> value) {
        this.secureLocation1 = value;
    }

    /**
     * Gets the value of the secureLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecureLocation2() {
        return secureLocation2;
    }

    /**
     * Sets the value of the secureLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecureLocation2(JAXBElement<String> value) {
        this.secureLocation2 = value;
    }

    /**
     * Gets the value of the signatureOptional property.
     * 
     */
    public boolean isSignatureOptional() {
        return signatureOptional;
    }

    /**
     * Sets the value of the signatureOptional property.
     * 
     */
    public void setSignatureOptional(boolean value) {
        this.signatureOptional = value;
    }

}
