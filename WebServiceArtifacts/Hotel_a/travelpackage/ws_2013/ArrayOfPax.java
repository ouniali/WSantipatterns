
package travelpackage.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import common.ws_2013.Pax;


/**
 * <p>Java class for ArrayOfPax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pax" type="{WS_2013.Common}Pax" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPax", propOrder = {
    "pax"
})
public class ArrayOfPax {

    @XmlElement(name = "Pax", nillable = true)
    protected List<Pax> pax;

    /**
     * Gets the value of the pax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pax }
     * 
     * 
     */
    public List<Pax> getPax() {
        if (pax == null) {
            pax = new ArrayList<Pax>();
        }
        return this.pax;
    }

}
