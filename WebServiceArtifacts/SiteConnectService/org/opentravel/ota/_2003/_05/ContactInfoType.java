
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Names" type="{http://www.opentravel.org/OTA/2003/05}ContactsType" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.opentravel.org/OTA/2003/05}AddressesType" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}PhonesType" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://www.opentravel.org/OTA/2003/05}EmailsType" minOccurs="0"/>
 *         &lt;element name="URLs" type="{http://www.opentravel.org/OTA/2003/05}URLsType" minOccurs="0"/>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "names",
    "addresses",
    "phones",
    "emails",
    "urLs",
    "companyName"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo.class,
    ContactInfoRootType.class,
    org.opentravel.ota._2003._05.AreaInfoType.Attractions.Attraction.Contact.class
})
public class ContactInfoType {

    @XmlElement(name = "Names")
    protected ContactsType names;
    @XmlElement(name = "Addresses")
    protected AddressesType addresses;
    @XmlElement(name = "Phones")
    protected PhonesType phones;
    @XmlElement(name = "Emails")
    protected EmailsType emails;
    @XmlElement(name = "URLs")
    protected URLsType urLs;
    @XmlElement(name = "CompanyName")
    protected ContactInfoType.CompanyName companyName;
    @XmlAttribute(name = "Location")
    protected String location;

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link ContactsType }
     *     
     */
    public ContactsType getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsType }
     *     
     */
    public void setNames(ContactsType value) {
        this.names = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddresses(AddressesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link PhonesType }
     *     
     */
    public PhonesType getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhonesType }
     *     
     */
    public void setPhones(PhonesType value) {
        this.phones = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link EmailsType }
     *     
     */
    public EmailsType getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailsType }
     *     
     */
    public void setEmails(EmailsType value) {
        this.emails = value;
    }

    /**
     * Gets the value of the urLs property.
     * 
     * @return
     *     possible object is
     *     {@link URLsType }
     *     
     */
    public URLsType getURLs() {
        return urLs;
    }

    /**
     * Sets the value of the urLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLsType }
     *     
     */
    public void setURLs(URLsType value) {
        this.urLs = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType.CompanyName }
     *     
     */
    public ContactInfoType.CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType.CompanyName }
     *     
     */
    public void setCompanyName(ContactInfoType.CompanyName value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompanyName
        extends CompanyNameType
    {

        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
