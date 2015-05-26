
package no.bring.logistics.shippingguide._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineProductAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineProductAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductAttribute" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineProductAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineProductAttributesType", propOrder = {
    "productAttribute"
})
public class OfflineProductAttributesType {

    @XmlElement(name = "ProductAttribute")
    protected List<OfflineProductAttributeType> productAttribute;

    /**
     * Gets the value of the productAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineProductAttributeType }
     * 
     * 
     */
    public List<OfflineProductAttributeType> getProductAttribute() {
        if (productAttribute == null) {
            productAttribute = new ArrayList<OfflineProductAttributeType>();
        }
        return this.productAttribute;
    }

}
