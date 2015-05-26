
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingGuideRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingGuideRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="UserInformation" type="{http://www.bring.no/logistics/shippingguide/1.0}UserInformationType"/>
 *         &lt;element name="RequestProperties" type="{http://www.bring.no/logistics/shippingguide/1.0}RequestPropertiesType"/>
 *         &lt;element name="ProductIds" type="{http://www.bring.no/logistics/shippingguide/1.0}ProductIdsType"/>
 *         &lt;element name="Consignment" type="{http://www.bring.no/logistics/shippingguide/1.0}ConsignmentInputType"/>
 *         &lt;element name="Packages" type="{http://www.bring.no/logistics/shippingguide/1.0}PackagesInputType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingGuideRequestType", propOrder = {

})
public class ShippingGuideRequestType {

    @XmlElement(name = "UserInformation", required = true)
    protected UserInformationType userInformation;
    @XmlElement(name = "RequestProperties", required = true)
    protected RequestPropertiesType requestProperties;
    @XmlElement(name = "ProductIds", required = true)
    protected ProductIdsType productIds;
    @XmlElement(name = "Consignment", required = true)
    protected ConsignmentInputType consignment;
    @XmlElement(name = "Packages", required = true)
    protected PackagesInputType packages;

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
     * Gets the value of the requestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPropertiesType }
     *     
     */
    public RequestPropertiesType getRequestProperties() {
        return requestProperties;
    }

    /**
     * Sets the value of the requestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPropertiesType }
     *     
     */
    public void setRequestProperties(RequestPropertiesType value) {
        this.requestProperties = value;
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
     * Gets the value of the consignment property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentInputType }
     *     
     */
    public ConsignmentInputType getConsignment() {
        return consignment;
    }

    /**
     * Sets the value of the consignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentInputType }
     *     
     */
    public void setConsignment(ConsignmentInputType value) {
        this.consignment = value;
    }

    /**
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link PackagesInputType }
     *     
     */
    public PackagesInputType getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagesInputType }
     *     
     */
    public void setPackages(PackagesInputType value) {
        this.packages = value;
    }

}
