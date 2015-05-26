
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInfoEx">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.digikey.com/SearchWS}BaseProductInfo">
 *       &lt;sequence>
 *         &lt;element name="Family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MediaFiles" type="{http://services.digikey.com/SearchWS}ArrayOfMediaFile" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://services.digikey.com/SearchWS}ArrayOfAttribute" minOccurs="0"/>
 *         &lt;element name="Pricing" type="{http://services.digikey.com/SearchWS}ArrayOfCatalogPriceBreak" minOccurs="0"/>
 *         &lt;element name="RohsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfoEx", propOrder = {
    "family",
    "minimumOrderQuantity",
    "mediaFiles",
    "attributes",
    "pricing",
    "rohsInfo",
    "salesInfo",
    "leadContent"
})
public class ProductInfoEx
    extends BaseProductInfo
{

    @XmlElement(name = "Family")
    protected String family;
    @XmlElement(name = "MinimumOrderQuantity")
    protected int minimumOrderQuantity;
    @XmlElement(name = "MediaFiles")
    protected ArrayOfMediaFile mediaFiles;
    @XmlElement(name = "Attributes")
    protected ArrayOfAttribute attributes;
    @XmlElement(name = "Pricing")
    protected ArrayOfCatalogPriceBreak pricing;
    @XmlElement(name = "RohsInfo")
    protected String rohsInfo;
    @XmlElement(name = "SalesInfo")
    protected String salesInfo;
    @XmlElement(name = "LeadContent")
    protected String leadContent;

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     */
    public int getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     */
    public void setMinimumOrderQuantity(int value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the mediaFiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaFile }
     *     
     */
    public ArrayOfMediaFile getMediaFiles() {
        return mediaFiles;
    }

    /**
     * Sets the value of the mediaFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaFile }
     *     
     */
    public void setMediaFiles(ArrayOfMediaFile value) {
        this.mediaFiles = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setAttributes(ArrayOfAttribute value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCatalogPriceBreak }
     *     
     */
    public ArrayOfCatalogPriceBreak getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCatalogPriceBreak }
     *     
     */
    public void setPricing(ArrayOfCatalogPriceBreak value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the rohsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRohsInfo() {
        return rohsInfo;
    }

    /**
     * Sets the value of the rohsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRohsInfo(String value) {
        this.rohsInfo = value;
    }

    /**
     * Gets the value of the salesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesInfo() {
        return salesInfo;
    }

    /**
     * Sets the value of the salesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesInfo(String value) {
        this.salesInfo = value;
    }

    /**
     * Gets the value of the leadContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadContent() {
        return leadContent;
    }

    /**
     * Sets the value of the leadContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadContent(String value) {
        this.leadContent = value;
    }

}
