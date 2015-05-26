
package trainpass.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPassengerTypeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPassengerTypeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeDetail" type="{WS_2013.TrainPass}PassengerTypeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPassengerTypeDetail", propOrder = {
    "passengerTypeDetail"
})
public class ArrayOfPassengerTypeDetail {

    @XmlElement(name = "PassengerTypeDetail", nillable = true)
    protected List<PassengerTypeDetail> passengerTypeDetail;

    /**
     * Gets the value of the passengerTypeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTypeDetail }
     * 
     * 
     */
    public List<PassengerTypeDetail> getPassengerTypeDetail() {
        if (passengerTypeDetail == null) {
            passengerTypeDetail = new ArrayList<PassengerTypeDetail>();
        }
        return this.passengerTypeDetail;
    }

}
