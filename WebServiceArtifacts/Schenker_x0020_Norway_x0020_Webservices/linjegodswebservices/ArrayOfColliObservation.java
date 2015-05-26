
package linjegodswebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfColliObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfColliObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColliObservation" type="{LinjegodsWebServices}ColliObservation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfColliObservation", propOrder = {
    "colliObservation"
})
public class ArrayOfColliObservation {

    @XmlElement(name = "ColliObservation", nillable = true)
    protected List<ColliObservation> colliObservation;

    /**
     * Gets the value of the colliObservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colliObservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColliObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColliObservation }
     * 
     * 
     */
    public List<ColliObservation> getColliObservation() {
        if (colliObservation == null) {
            colliObservation = new ArrayList<ColliObservation>();
        }
        return this.colliObservation;
    }

}
