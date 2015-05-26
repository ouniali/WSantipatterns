
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
 *         &lt;element name="Names" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactsTypeName" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAddressesTypeAddress" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPhonesTypePhone" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfEmailsTypeEmail" minOccurs="0"/>
 *         &lt;element name="URLs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfURLsTypeURL" minOccurs="0"/>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    org.opentravel.ota._2003._05.ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo.class,
    org.opentravel.ota._2003._05.AreaInfoType.Attractions.Attraction.Contact.class,
    ContactInfoRootType.class
})
public class ContactInfoType {

    @XmlElement(name = "Names")
    protected ArrayOfContactsTypeName names;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddressesTypeAddress addresses;
    @XmlElement(name = "Phones")
    protected ArrayOfPhonesTypePhone phones;
    @XmlElement(name = "Emails")
    protected ArrayOfEmailsTypeEmail emails;
    @XmlElement(name = "URLs")
    protected ArrayOfURLsTypeURL urLs;
    @XmlElement(name = "CompanyName")
    protected ContactInfoType.CompanyName companyName;
    @XmlAttribute(name = "Location")
    protected String location;

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactsTypeName }
     *     
     */
    public ArrayOfContactsTypeName getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactsTypeName }
     *     
     */
    public void setNames(ArrayOfContactsTypeName value) {
        this.names = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressesTypeAddress }
     *     
     */
    public ArrayOfAddressesTypeAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressesTypeAddress }
     *     
     */
    public void setAddresses(ArrayOfAddressesTypeAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhonesTypePhone }
     *     
     */
    public ArrayOfPhonesTypePhone getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhonesTypePhone }
     *     
     */
    public void setPhones(ArrayOfPhonesTypePhone value) {
        this.phones = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailsTypeEmail }
     *     
     */
    public ArrayOfEmailsTypeEmail getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailsTypeEmail }
     *     
     */
    public void setEmails(ArrayOfEmailsTypeEmail value) {
        this.emails = value;
    }

    /**
     * Gets the value of the urLs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfURLsTypeURL }
     *     
     */
    public ArrayOfURLsTypeURL getURLs() {
        return urLs;
    }

    /**
     * Sets the value of the urLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfURLsTypeURL }
     *     
     */
    public void setURLs(ArrayOfURLsTypeURL value) {
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
