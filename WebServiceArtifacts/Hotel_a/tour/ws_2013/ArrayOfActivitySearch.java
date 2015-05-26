
package tour.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActivitySearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActivitySearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivitySearch" type="{WS_2013.Tour}ActivitySearch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActivitySearch", propOrder = {
    "activitySearch"
})
public class ArrayOfActivitySearch {

    @XmlElement(name = "ActivitySearch", nillable = true)
    protected List<ActivitySearch> activitySearch;

    /**
     * Gets the value of the activitySearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activitySearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivitySearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivitySearch }
     * 
     * 
     */
    public List<ActivitySearch> getActivitySearch() {
        if (activitySearch == null) {
            activitySearch = new ArrayList<ActivitySearch>();
        }
        return this.activitySearch;
    }

}
