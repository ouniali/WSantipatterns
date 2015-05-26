
package no.bring.logistics.shippingguide._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineAdditionalPricesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineAdditionalPricesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalPrice" type="{http://www.bring.no/logistics/shippingguide/1.0}AdditionalPriceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineAdditionalPricesType", propOrder = {
    "additionalPrice"
})
public class OfflineAdditionalPricesType {

    @XmlElement(name = "AdditionalPrice")
    protected List<AdditionalPriceType> additionalPrice;

    /**
     * Gets the value of the additionalPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalPriceType }
     * 
     * 
     */
    public List<AdditionalPriceType> getAdditionalPrice() {
        if (additionalPrice == null) {
            additionalPrice = new ArrayList<AdditionalPriceType>();
        }
        return this.additionalPrice;
    }

}
