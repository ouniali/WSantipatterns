
package com.digikey.services.searchws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaseProductInfoPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseProductInfoPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseProductInfoPricing" type="{http://services.digikey.com/SearchWS}BaseProductInfoPricing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseProductInfoPricing", propOrder = {
    "baseProductInfoPricing"
})
public class ArrayOfBaseProductInfoPricing {

    @XmlElement(name = "BaseProductInfoPricing", nillable = true)
    protected List<BaseProductInfoPricing> baseProductInfoPricing;

    /**
     * Gets the value of the baseProductInfoPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseProductInfoPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseProductInfoPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseProductInfoPricing }
     * 
     * 
     */
    public List<BaseProductInfoPricing> getBaseProductInfoPricing() {
        if (baseProductInfoPricing == null) {
            baseProductInfoPricing = new ArrayList<BaseProductInfoPricing>();
        }
        return this.baseProductInfoPricing;
    }

}
