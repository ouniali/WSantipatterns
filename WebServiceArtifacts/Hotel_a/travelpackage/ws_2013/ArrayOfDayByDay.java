
package travelpackage.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDayByDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDayByDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayByDay" type="{WS_2013.TravelPackage}DayByDay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDayByDay", propOrder = {
    "dayByDay"
})
public class ArrayOfDayByDay {

    @XmlElement(name = "DayByDay", nillable = true)
    protected List<DayByDay> dayByDay;

    /**
     * Gets the value of the dayByDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayByDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayByDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayByDay }
     * 
     * 
     */
    public List<DayByDay> getDayByDay() {
        if (dayByDay == null) {
            dayByDay = new ArrayList<DayByDay>();
        }
        return this.dayByDay;
    }

}
