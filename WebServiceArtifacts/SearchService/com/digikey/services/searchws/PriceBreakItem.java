
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceBreakItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceBreakItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.digikey.com/SearchWS}EDAPricing">
 *       &lt;sequence>
 *         &lt;element name="DigiKeyPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagingType" type="{http://services.digikey.com/SearchWS}PackagingTypeItem" minOccurs="0"/>
 *         &lt;element name="QuantityOnHand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SalesInfo" type="{http://services.digikey.com/SearchWS}SalesInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceBreakItem", propOrder = {
    "digiKeyPartNumber",
    "packagingType",
    "quantityOnHand",
    "salesInfo"
})
public class PriceBreakItem
    extends EDAPricing
{

    @XmlElement(name = "DigiKeyPartNumber")
    protected String digiKeyPartNumber;
    @XmlElement(name = "PackagingType")
    protected PackagingTypeItem packagingType;
    @XmlElement(name = "QuantityOnHand")
    protected int quantityOnHand;
    @XmlElement(name = "SalesInfo")
    protected SalesInfo salesInfo;

    /**
     * Gets the value of the digiKeyPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigiKeyPartNumber() {
        return digiKeyPartNumber;
    }

    /**
     * Sets the value of the digiKeyPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigiKeyPartNumber(String value) {
        this.digiKeyPartNumber = value;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingTypeItem }
     *     
     */
    public PackagingTypeItem getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingTypeItem }
     *     
     */
    public void setPackagingType(PackagingTypeItem value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     */
    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     */
    public void setQuantityOnHand(int value) {
        this.quantityOnHand = value;
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

}
