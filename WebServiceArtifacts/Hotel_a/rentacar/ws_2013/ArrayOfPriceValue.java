
package rentacar.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ws_2013.PriceValue;


/**
 * <p>Java class for ArrayOfPriceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriceValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceValue" type="{WS_2013}PriceValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriceValue", propOrder = {
    "priceValue"
})
public class ArrayOfPriceValue {

    @XmlElement(name = "PriceValue", nillable = true)
    protected List<PriceValue> priceValue;

    /**
     * Gets the value of the priceValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceValue }
     * 
     * 
     */
    public List<PriceValue> getPriceValue() {
        if (priceValue == null) {
            priceValue = new ArrayList<PriceValue>();
        }
        return this.priceValue;
    }

}
