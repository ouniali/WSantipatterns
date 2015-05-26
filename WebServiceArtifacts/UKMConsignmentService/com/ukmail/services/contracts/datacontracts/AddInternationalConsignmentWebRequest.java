
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
 * <p>Java class for AddInternationalConsignmentWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddInternationalConsignmentWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}AddConsignmentWebRequest">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtendedCoverRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GoodsDescription1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodsDescription2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodsDescription3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFreeCirculationEU" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InvoiceType" type="{http://www.UKMail.com/Services/Contracts/DataContracts}InvoiceTypeList"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NoDangerousGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddInternationalConsignmentWebRequest", propOrder = {
    "currencyCode",
    "documentsOnly",
    "extendedCoverRequired",
    "goodsDescription1",
    "goodsDescription2",
    "goodsDescription3",
    "height",
    "inFreeCirculationEU",
    "invoiceType",
    "length",
    "noDangerousGoods",
    "value",
    "width"
})
public class AddInternationalConsignmentWebRequest
    extends AddConsignmentWebRequest
{

    @XmlElementRef(name = "CurrencyCode", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "DocumentsOnly")
    protected boolean documentsOnly;
    @XmlElement(name = "ExtendedCoverRequired")
    protected boolean extendedCoverRequired;
    @XmlElementRef(name = "GoodsDescription1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsDescription1;
    @XmlElementRef(name = "GoodsDescription2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsDescription2;
    @XmlElementRef(name = "GoodsDescription3", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsDescription3;
    @XmlElement(name = "Height")
    protected int height;
    @XmlElement(name = "InFreeCirculationEU")
    protected boolean inFreeCirculationEU;
    @XmlElement(name = "InvoiceType", required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceTypeList invoiceType;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "NoDangerousGoods")
    protected boolean noDangerousGoods;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;
    @XmlElement(name = "Width")
    protected int width;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the documentsOnly property.
     * 
     */
    public boolean isDocumentsOnly() {
        return documentsOnly;
    }

    /**
     * Sets the value of the documentsOnly property.
     * 
     */
    public void setDocumentsOnly(boolean value) {
        this.documentsOnly = value;
    }

    /**
     * Gets the value of the extendedCoverRequired property.
     * 
     */
    public boolean isExtendedCoverRequired() {
        return extendedCoverRequired;
    }

    /**
     * Sets the value of the extendedCoverRequired property.
     * 
     */
    public void setExtendedCoverRequired(boolean value) {
        this.extendedCoverRequired = value;
    }

    /**
     * Gets the value of the goodsDescription1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsDescription1() {
        return goodsDescription1;
    }

    /**
     * Sets the value of the goodsDescription1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsDescription1(JAXBElement<String> value) {
        this.goodsDescription1 = value;
    }

    /**
     * Gets the value of the goodsDescription2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsDescription2() {
        return goodsDescription2;
    }

    /**
     * Sets the value of the goodsDescription2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsDescription2(JAXBElement<String> value) {
        this.goodsDescription2 = value;
    }

    /**
     * Gets the value of the goodsDescription3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsDescription3() {
        return goodsDescription3;
    }

    /**
     * Sets the value of the goodsDescription3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsDescription3(JAXBElement<String> value) {
        this.goodsDescription3 = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the inFreeCirculationEU property.
     * 
     */
    public boolean isInFreeCirculationEU() {
        return inFreeCirculationEU;
    }

    /**
     * Sets the value of the inFreeCirculationEU property.
     * 
     */
    public void setInFreeCirculationEU(boolean value) {
        this.inFreeCirculationEU = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTypeList }
     *     
     */
    public InvoiceTypeList getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTypeList }
     *     
     */
    public void setInvoiceType(InvoiceTypeList value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the noDangerousGoods property.
     * 
     */
    public boolean isNoDangerousGoods() {
        return noDangerousGoods;
    }

    /**
     * Sets the value of the noDangerousGoods property.
     * 
     */
    public void setNoDangerousGoods(boolean value) {
        this.noDangerousGoods = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

}
