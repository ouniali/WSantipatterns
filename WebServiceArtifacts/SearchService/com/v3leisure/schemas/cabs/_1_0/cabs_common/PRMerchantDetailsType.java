
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PR_MerchantDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_MerchantDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_AddressDetailsType" minOccurs="0"/>
 *         &lt;element name="MainPhone" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_PhoneDetailsType" minOccurs="0"/>
 *         &lt;element name="Facsimile" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_PhoneDetailsType" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_PhoneDetailsType" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_PhoneDetailsType" minOccurs="0"/>
 *         &lt;element name="WebSite" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_UrlType" minOccurs="0"/>
 *         &lt;element name="PublicEmail" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_EmailType" minOccurs="0"/>
 *         &lt;element name="BusinessDetail" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_MerchantBusinessDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_MerchantDetailsType", propOrder = {
    "addressDetails",
    "mainPhone",
    "facsimile",
    "workPhone",
    "mobilePhone",
    "webSite",
    "publicEmail",
    "businessDetail"
})
public class PRMerchantDetailsType {

    @XmlElement(name = "AddressDetails")
    protected COAddressDetailsType addressDetails;
    @XmlElement(name = "MainPhone")
    protected COPhoneDetailsType mainPhone;
    @XmlElement(name = "Facsimile")
    protected COPhoneDetailsType facsimile;
    @XmlElement(name = "WorkPhone")
    protected COPhoneDetailsType workPhone;
    @XmlElement(name = "MobilePhone")
    protected COPhoneDetailsType mobilePhone;
    @XmlElement(name = "WebSite")
    protected COUrlType webSite;
    @XmlElement(name = "PublicEmail")
    protected COEmailType publicEmail;
    @XmlElement(name = "BusinessDetail")
    protected COMerchantBusinessDetailType businessDetail;

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link COAddressDetailsType }
     *     
     */
    public COAddressDetailsType getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link COAddressDetailsType }
     *     
     */
    public void setAddressDetails(COAddressDetailsType value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the mainPhone property.
     * 
     * @return
     *     possible object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public COPhoneDetailsType getMainPhone() {
        return mainPhone;
    }

    /**
     * Sets the value of the mainPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public void setMainPhone(COPhoneDetailsType value) {
        this.mainPhone = value;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * @return
     *     possible object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public COPhoneDetailsType getFacsimile() {
        return facsimile;
    }

    /**
     * Sets the value of the facsimile property.
     * 
     * @param value
     *     allowed object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public void setFacsimile(COPhoneDetailsType value) {
        this.facsimile = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public COPhoneDetailsType getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public void setWorkPhone(COPhoneDetailsType value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public COPhoneDetailsType getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link COPhoneDetailsType }
     *     
     */
    public void setMobilePhone(COPhoneDetailsType value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link COUrlType }
     *     
     */
    public COUrlType getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUrlType }
     *     
     */
    public void setWebSite(COUrlType value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the publicEmail property.
     * 
     * @return
     *     possible object is
     *     {@link COEmailType }
     *     
     */
    public COEmailType getPublicEmail() {
        return publicEmail;
    }

    /**
     * Sets the value of the publicEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link COEmailType }
     *     
     */
    public void setPublicEmail(COEmailType value) {
        this.publicEmail = value;
    }

    /**
     * Gets the value of the businessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link COMerchantBusinessDetailType }
     *     
     */
    public COMerchantBusinessDetailType getBusinessDetail() {
        return businessDetail;
    }

    /**
     * Sets the value of the businessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMerchantBusinessDetailType }
     *     
     */
    public void setBusinessDetail(COMerchantBusinessDetailType value) {
        this.businessDetail = value;
    }

}
