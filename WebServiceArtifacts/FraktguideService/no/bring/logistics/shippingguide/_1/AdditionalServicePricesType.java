
package no.bring.logistics.shippingguide._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServicePricesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServicePricesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalService" type="{http://www.bring.no/logistics/shippingguide/1.0}AdditionalServicePriceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServicePricesType", propOrder = {
    "additionalService"
})
public class AdditionalServicePricesType {

    @XmlElement(name = "AdditionalService")
    protected List<AdditionalServicePriceType> additionalService;

    /**
     * Gets the value of the additionalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServicePriceType }
     * 
     * 
     */
    public List<AdditionalServicePriceType> getAdditionalService() {
        if (additionalService == null) {
            additionalService = new ArrayList<AdditionalServicePriceType>();
        }
        return this.additionalService;
    }

}
