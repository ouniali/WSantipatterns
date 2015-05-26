
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineShippingGuideRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineShippingGuideRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="UserInformation" type="{http://www.bring.no/logistics/shippingguide/1.0}UserInformationType"/>
 *         &lt;element name="OfflineRequestProperties" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineRequestPropertiesType"/>
 *         &lt;element name="ProductIds" type="{http://www.bring.no/logistics/shippingguide/1.0}ProductIdsType"/>
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidFromDate" type="{http://www.bring.no/logistics/shippingguide/1.0}DateAndTimeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineShippingGuideRequestType", propOrder = {

})
public class OfflineShippingGuideRequestType {

    @XmlElement(name = "UserInformation", required = true)
    protected UserInformationType userInformation;
    @XmlElement(name = "OfflineRequestProperties", required = true)
    protected OfflineRequestPropertiesType offlineRequestProperties;
    @XmlElement(name = "ProductIds", required = true)
    protected ProductIdsType productIds;
    @XmlElement(name = "FromPostalCode", required = true)
    protected String fromPostalCode;
    @XmlElement(name = "ValidFromDate")
    protected DateAndTimeType validFromDate;

    /**
     * Gets the value of the userInformation property.
     * 
     * @return
     *     possible object is
     *     {@link UserInformationType }
     *     
     */
    public UserInformationType getUserInformation() {
        return userInformation;
    }

    /**
     * Sets the value of the userInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInformationType }
     *     
     */
    public void setUserInformation(UserInformationType value) {
        this.userInformation = value;
    }

    /**
     * Gets the value of the offlineRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineRequestPropertiesType }
     *     
     */
    public OfflineRequestPropertiesType getOfflineRequestProperties() {
        return offlineRequestProperties;
    }

    /**
     * Sets the value of the offlineRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineRequestPropertiesType }
     *     
     */
    public void setOfflineRequestProperties(OfflineRequestPropertiesType value) {
        this.offlineRequestProperties = value;
    }

    /**
     * Gets the value of the productIds property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdsType }
     *     
     */
    public ProductIdsType getProductIds() {
        return productIds;
    }

    /**
     * Sets the value of the productIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdsType }
     *     
     */
    public void setProductIds(ProductIdsType value) {
        this.productIds = value;
    }

    /**
     * Gets the value of the fromPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalCode() {
        return fromPostalCode;
    }

    /**
     * Sets the value of the fromPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalCode(String value) {
        this.fromPostalCode = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setValidFromDate(DateAndTimeType value) {
        this.validFromDate = value;
    }

}
