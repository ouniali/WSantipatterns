
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInfoOfEDAPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInfoOfEDAPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseProductInfo" type="{http://services.digikey.com/SearchWS}BaseProductInfo" minOccurs="0"/>
 *         &lt;element name="DataSheetList" type="{http://services.digikey.com/SearchWS}ArrayOfDataSheet" minOccurs="0"/>
 *         &lt;element name="PhotoList" type="{http://services.digikey.com/SearchWS}ArrayOfPhoto" minOccurs="0"/>
 *         &lt;element name="AttributeList" type="{http://services.digikey.com/SearchWS}ArrayOfAttribute" minOccurs="0"/>
 *         &lt;element name="DrawingList" type="{http://services.digikey.com/SearchWS}ArrayOfDrawing" minOccurs="0"/>
 *         &lt;element name="Pricing" type="{http://services.digikey.com/SearchWS}EDAPricing" minOccurs="0"/>
 *         &lt;element name="RohsInfo" type="{http://services.digikey.com/SearchWS}RohsInfo" minOccurs="0"/>
 *         &lt;element name="SalesInfo" type="{http://services.digikey.com/SearchWS}SalesInfo" minOccurs="0"/>
 *         &lt;element name="LeadContent" type="{http://services.digikey.com/SearchWS}LeadContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfoOfEDAPricing", propOrder = {
    "baseProductInfo",
    "dataSheetList",
    "photoList",
    "attributeList",
    "drawingList",
    "pricing",
    "rohsInfo",
    "salesInfo",
    "leadContent"
})
@XmlSeeAlso({
    EDAProductInfo.class
})
public class ProductInfoOfEDAPricing {

    @XmlElement(name = "BaseProductInfo")
    protected BaseProductInfo baseProductInfo;
    @XmlElement(name = "DataSheetList")
    protected ArrayOfDataSheet dataSheetList;
    @XmlElement(name = "PhotoList")
    protected ArrayOfPhoto photoList;
    @XmlElement(name = "AttributeList")
    protected ArrayOfAttribute attributeList;
    @XmlElement(name = "DrawingList")
    protected ArrayOfDrawing drawingList;
    @XmlElement(name = "Pricing")
    protected EDAPricing pricing;
    @XmlElement(name = "RohsInfo")
    protected RohsInfo rohsInfo;
    @XmlElement(name = "SalesInfo")
    protected SalesInfo salesInfo;
    @XmlElement(name = "LeadContent")
    protected LeadContent leadContent;

    /**
     * Gets the value of the baseProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfo }
     *     
     */
    public BaseProductInfo getBaseProductInfo() {
        return baseProductInfo;
    }

    /**
     * Sets the value of the baseProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfo }
     *     
     */
    public void setBaseProductInfo(BaseProductInfo value) {
        this.baseProductInfo = value;
    }

    /**
     * Gets the value of the dataSheetList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataSheet }
     *     
     */
    public ArrayOfDataSheet getDataSheetList() {
        return dataSheetList;
    }

    /**
     * Sets the value of the dataSheetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataSheet }
     *     
     */
    public void setDataSheetList(ArrayOfDataSheet value) {
        this.dataSheetList = value;
    }

    /**
     * Gets the value of the photoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoto }
     *     
     */
    public ArrayOfPhoto getPhotoList() {
        return photoList;
    }

    /**
     * Sets the value of the photoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoto }
     *     
     */
    public void setPhotoList(ArrayOfPhoto value) {
        this.photoList = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setAttributeList(ArrayOfAttribute value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the drawingList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrawing }
     *     
     */
    public ArrayOfDrawing getDrawingList() {
        return drawingList;
    }

    /**
     * Sets the value of the drawingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrawing }
     *     
     */
    public void setDrawingList(ArrayOfDrawing value) {
        this.drawingList = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link EDAPricing }
     *     
     */
    public EDAPricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDAPricing }
     *     
     */
    public void setPricing(EDAPricing value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the rohsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RohsInfo }
     *     
     */
    public RohsInfo getRohsInfo() {
        return rohsInfo;
    }

    /**
     * Sets the value of the rohsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RohsInfo }
     *     
     */
    public void setRohsInfo(RohsInfo value) {
        this.rohsInfo = value;
    }

    /**
     * Gets the value of the salesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInfo }
     *     
     */
    public SalesInfo getSalesInfo() {
        return salesInfo;
    }

    /**
     * Sets the value of the salesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInfo }
     *     
     */
    public void setSalesInfo(SalesInfo value) {
        this.salesInfo = value;
    }

    /**
     * Gets the value of the leadContent property.
     * 
     * @return
     *     possible object is
     *     {@link LeadContent }
     *     
     */
    public LeadContent getLeadContent() {
        return leadContent;
    }

    /**
     * Sets the value of the leadContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadContent }
     *     
     */
    public void setLeadContent(LeadContent value) {
        this.leadContent = value;
    }

}
