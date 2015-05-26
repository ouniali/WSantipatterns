
package com.digikey.services.searchws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductInfoListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductInfoListResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductInfoListResult" type="{http://services.digikey.com/SearchWS}ProductInfoListResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductInfoListResult", propOrder = {
    "productInfoListResult"
})
public class ArrayOfProductInfoListResult {

    @XmlElement(name = "ProductInfoListResult", nillable = true)
    protected List<ProductInfoListResult> productInfoListResult;

    /**
     * Gets the value of the productInfoListResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInfoListResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInfoListResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInfoListResult }
     * 
     * 
     */
    public List<ProductInfoListResult> getProductInfoListResult() {
        if (productInfoListResult == null) {
            productInfoListResult = new ArrayList<ProductInfoListResult>();
        }
        return this.productInfoListResult;
    }

}
