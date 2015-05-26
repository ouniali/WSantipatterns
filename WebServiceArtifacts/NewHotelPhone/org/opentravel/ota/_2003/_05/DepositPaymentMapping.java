
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositPaymentMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositPaymentMapping">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GeneralMapping">
 *       &lt;sequence>
 *         &lt;element name="ProfileInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentIntegrationType" type="{http://www.opentravel.org/OTA/2003/05}EPaymentsIntegrationType" />
 *       &lt;attribute name="PaymentOperationType" type="{http://www.opentravel.org/OTA/2003/05}EPaymentOperationType" />
 *       &lt;attribute name="PaymentSectionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaymentIdentifier" use="required" type="{http://microsoft.com/wsdl/types/}guid" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositPaymentMapping", propOrder = {
    "profileInfo"
})
public class DepositPaymentMapping
    extends GeneralMapping
{

    @XmlElement(name = "ProfileInfo")
    protected DepositPaymentMapping.ProfileInfo profileInfo;
    @XmlAttribute(name = "PaymentIntegrationType")
    protected EPaymentsIntegrationType paymentIntegrationType;
    @XmlAttribute(name = "PaymentOperationType")
    protected EPaymentOperationType paymentOperationType;
    @XmlAttribute(name = "PaymentSectionCode")
    protected String paymentSectionCode;
    @XmlAttribute(name = "PaymentTypeCode")
    protected String paymentTypeCode;
    @XmlAttribute(name = "PaymentIdentifier", required = true)
    protected String paymentIdentifier;

    /**
     * Gets the value of the profileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepositPaymentMapping.ProfileInfo }
     *     
     */
    public DepositPaymentMapping.ProfileInfo getProfileInfo() {
        return profileInfo;
    }

    /**
     * Sets the value of the profileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositPaymentMapping.ProfileInfo }
     *     
     */
    public void setProfileInfo(DepositPaymentMapping.ProfileInfo value) {
        this.profileInfo = value;
    }

    /**
     * Gets the value of the paymentIntegrationType property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentsIntegrationType }
     *     
     */
    public EPaymentsIntegrationType getPaymentIntegrationType() {
        return paymentIntegrationType;
    }

    /**
     * Sets the value of the paymentIntegrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentsIntegrationType }
     *     
     */
    public void setPaymentIntegrationType(EPaymentsIntegrationType value) {
        this.paymentIntegrationType = value;
    }

    /**
     * Gets the value of the paymentOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentOperationType }
     *     
     */
    public EPaymentOperationType getPaymentOperationType() {
        return paymentOperationType;
    }

    /**
     * Sets the value of the paymentOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentOperationType }
     *     
     */
    public void setPaymentOperationType(EPaymentOperationType value) {
        this.paymentOperationType = value;
    }

    /**
     * Gets the value of the paymentSectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSectionCode() {
        return paymentSectionCode;
    }

    /**
     * Sets the value of the paymentSectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSectionCode(String value) {
        this.paymentSectionCode = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the paymentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentIdentifier() {
        return paymentIdentifier;
    }

    /**
     * Sets the value of the paymentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentIdentifier(String value) {
        this.paymentIdentifier = value;
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
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/>
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
        "uniqueID",
        "profile"
    })
    public static class ProfileInfo {

        @XmlElement(name = "UniqueID")
        protected List<UniqueIDType> uniqueID;
        @XmlElement(name = "Profile")
        protected ProfileType profile;

        /**
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<UniqueIDType>();
            }
            return this.uniqueID;
        }

        /**
         * Gets the value of the profile property.
         * 
         * @return
         *     possible object is
         *     {@link ProfileType }
         *     
         */
        public ProfileType getProfile() {
            return profile;
        }

        /**
         * Sets the value of the profile property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileType }
         *     
         */
        public void setProfile(ProfileType value) {
            this.profile = value;
        }

    }

}
