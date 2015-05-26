
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInfoListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInfoListResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductInfoList" type="{http://services.digikey.com/SearchWS}ArrayOfProductInfoEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfoListResult", propOrder = {
    "partNumber",
    "recordCount",
    "productInfoList"
})
public class ProductInfoListResult {

    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "RecordCount")
    protected int recordCount;
    @XmlElement(name = "ProductInfoList")
    protected ArrayOfProductInfoEx productInfoList;

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the productInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductInfoEx }
     *     
     */
    public ArrayOfProductInfoEx getProductInfoList() {
        return productInfoList;
    }

    /**
     * Sets the value of the productInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductInfoEx }
     *     
     */
    public void setProductInfoList(ArrayOfProductInfoEx value) {
        this.productInfoList = value;
    }

}
