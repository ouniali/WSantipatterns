
package hotel.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBreakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Breakdown" type="{WS_2013.Hotel}Breakdown" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBreakdown", propOrder = {
    "breakdown"
})
public class ArrayOfBreakdown {

    @XmlElement(name = "Breakdown", nillable = true)
    protected List<Breakdown> breakdown;

    /**
     * Gets the value of the breakdown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakdown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakdown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Breakdown }
     * 
     * 
     */
    public List<Breakdown> getBreakdown() {
        if (breakdown == null) {
            breakdown = new ArrayList<Breakdown>();
        }
        return this.breakdown;
    }

}
