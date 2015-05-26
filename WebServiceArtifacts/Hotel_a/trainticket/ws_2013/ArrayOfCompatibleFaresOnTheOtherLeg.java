
package trainticket.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompatibleFaresOnTheOtherLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompatibleFaresOnTheOtherLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompatibleFaresOnTheOtherLeg" type="{WS_2013.TrainTicket}CompatibleFaresOnTheOtherLeg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompatibleFaresOnTheOtherLeg", propOrder = {
    "compatibleFaresOnTheOtherLeg"
})
public class ArrayOfCompatibleFaresOnTheOtherLeg {

    @XmlElement(name = "CompatibleFaresOnTheOtherLeg", nillable = true)
    protected List<CompatibleFaresOnTheOtherLeg> compatibleFaresOnTheOtherLeg;

    /**
     * Gets the value of the compatibleFaresOnTheOtherLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleFaresOnTheOtherLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleFaresOnTheOtherLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompatibleFaresOnTheOtherLeg }
     * 
     * 
     */
    public List<CompatibleFaresOnTheOtherLeg> getCompatibleFaresOnTheOtherLeg() {
        if (compatibleFaresOnTheOtherLeg == null) {
            compatibleFaresOnTheOtherLeg = new ArrayList<CompatibleFaresOnTheOtherLeg>();
        }
        return this.compatibleFaresOnTheOtherLeg;
    }

}
