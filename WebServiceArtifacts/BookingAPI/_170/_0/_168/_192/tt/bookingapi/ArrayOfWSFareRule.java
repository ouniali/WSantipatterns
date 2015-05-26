
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSFareRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSFareRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSFareRule" type="{http://192.168.0.170/TT/BookingAPI}WSFareRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSFareRule", propOrder = {
    "wsFareRule"
})
public class ArrayOfWSFareRule {

    @XmlElement(name = "WSFareRule", nillable = true)
    protected List<WSFareRule> wsFareRule;

    /**
     * Gets the value of the wsFareRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsFareRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSFareRule }
     * 
     * 
     */
    public List<WSFareRule> getWSFareRule() {
        if (wsFareRule == null) {
            wsFareRule = new ArrayList<WSFareRule>();
        }
        return this.wsFareRule;
    }

}
