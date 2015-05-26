
package hotel.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import hotel.v2.webservice.cangooroo.SubGroup;


/**
 * <p>Java class for ArrayOfSubGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubGroup" type="{Cangooroo.Webservice.V2.Hotel}SubGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubGroup", propOrder = {
    "subGroup"
})
public class ArrayOfSubGroup {

    @XmlElement(name = "SubGroup", nillable = true)
    protected List<SubGroup> subGroup;

    /**
     * Gets the value of the subGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubGroup }
     * 
     * 
     */
    public List<SubGroup> getSubGroup() {
        if (subGroup == null) {
            subGroup = new ArrayList<SubGroup>();
        }
        return this.subGroup;
    }

}
