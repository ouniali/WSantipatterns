
package com.digikey.services.searchws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaseProductInfoAllPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseProductInfoAllPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseProductInfoAllPricing" type="{http://services.digikey.com/SearchWS}BaseProductInfoAllPricing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseProductInfoAllPricing", propOrder = {
    "baseProductInfoAllPricing"
})
public class ArrayOfBaseProductInfoAllPricing {

    @XmlElement(name = "BaseProductInfoAllPricing", nillable = true)
    protected List<BaseProductInfoAllPricing> baseProductInfoAllPricing;

    /**
     * Gets the value of the baseProductInfoAllPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseProductInfoAllPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseProductInfoAllPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseProductInfoAllPricing }
     * 
     * 
     */
    public List<BaseProductInfoAllPricing> getBaseProductInfoAllPricing() {
        if (baseProductInfoAllPricing == null) {
            baseProductInfoAllPricing = new ArrayList<BaseProductInfoAllPricing>();
        }
        return this.baseProductInfoAllPricing;
    }

}
