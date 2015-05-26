
package com.ukmail.services.contracts.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddConsignmentWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddConsignmentWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}WebRequest">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.UKMail.com/Services/Contracts/DataContracts}AddressWebModel"/>
 *         &lt;element name="AlternativeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionJobNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfirmationOfDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomersRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecialInstructions1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialInstructions2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddConsignmentWebRequest", propOrder = {
    "accountNumber",
    "address",
    "alternativeRef",
    "businessName",
    "collectionJobNumber",
    "confirmationOfDelivery",
    "contactName",
    "customersRef",
    "email",
    "items",
    "serviceKey",
    "specialInstructions1",
    "specialInstructions2",
    "telephone",
    "weight"
})
@XmlSeeAlso({
    AddInternationalConsignmentWebRequest.class,
    AddDomesticConsignmentWebRequest.class
})
public class AddConsignmentWebRequest
    extends WebRequest
{

    @XmlElement(name = "AccountNumber", required = true, nillable = true)
    protected String accountNumber;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected AddressWebModel address;
    @XmlElementRef(name = "AlternativeRef", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternativeRef;
    @XmlElementRef(name = "BusinessName", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessName;
    @XmlElement(name = "CollectionJobNumber", required = true, nillable = true)
    protected String collectionJobNumber;
    @XmlElement(name = "ConfirmationOfDelivery")
    protected boolean confirmationOfDelivery;
    @XmlElementRef(name = "ContactName", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactName;
    @XmlElementRef(name = "CustomersRef", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customersRef;
    @XmlElementRef(name = "Email", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "Items")
    protected int items;
    @XmlElement(name = "ServiceKey")
    protected int serviceKey;
    @XmlElementRef(name = "SpecialInstructions1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions1;
    @XmlElementRef(name = "SpecialInstructions2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions2;
    @XmlElementRef(name = "Telephone", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telephone;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressWebModel }
     *     
     */
    public AddressWebModel getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressWebModel }
     *     
     */
    public void setAddress(AddressWebModel value) {
        this.address = value;
    }

    /**
     * Gets the value of the alternativeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternativeRef() {
        return alternativeRef;
    }

    /**
     * Sets the value of the alternativeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternativeRef(JAXBElement<String> value) {
        this.alternativeRef = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessName(JAXBElement<String> value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the collectionJobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionJobNumber() {
        return collectionJobNumber;
    }

    /**
     * Sets the value of the collectionJobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionJobNumber(String value) {
        this.collectionJobNumber = value;
    }

    /**
     * Gets the value of the confirmationOfDelivery property.
     * 
     */
    public boolean isConfirmationOfDelivery() {
        return confirmationOfDelivery;
    }

    /**
     * Sets the value of the confirmationOfDelivery property.
     * 
     */
    public void setConfirmationOfDelivery(boolean value) {
        this.confirmationOfDelivery = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactName(JAXBElement<String> value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the customersRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomersRef() {
        return customersRef;
    }

    /**
     * Sets the value of the customersRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomersRef(JAXBElement<String> value) {
        this.customersRef = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the items property.
     * 
     */
    public int getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     */
    public void setItems(int value) {
        this.items = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     */
    public int getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     */
    public void setServiceKey(int value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the specialInstructions1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialInstructions1() {
        return specialInstructions1;
    }

    /**
     * Sets the value of the specialInstructions1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialInstructions1(JAXBElement<String> value) {
        this.specialInstructions1 = value;
    }

    /**
     * Gets the value of the specialInstructions2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialInstructions2() {
        return specialInstructions2;
    }

    /**
     * Sets the value of the specialInstructions2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialInstructions2(JAXBElement<String> value) {
        this.specialInstructions2 = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelephone(JAXBElement<String> value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

}
