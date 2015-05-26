
package ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import trainticket.ws_2013.TrainBookingResult;


/**
 * <p>Java class for ArrayOfTrainBookingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTrainBookingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrainBookingResult" type="{WS_2013.TrainTicket}TrainBookingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTrainBookingResult", propOrder = {
    "trainBookingResult"
})
public class ArrayOfTrainBookingResult {

    @XmlElement(name = "TrainBookingResult", nillable = true)
    protected List<TrainBookingResult> trainBookingResult;

    /**
     * Gets the value of the trainBookingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainBookingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainBookingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainBookingResult }
     * 
     * 
     */
    public List<TrainBookingResult> getTrainBookingResult() {
        if (trainBookingResult == null) {
            trainBookingResult = new ArrayList<TrainBookingResult>();
        }
        return this.trainBookingResult;
    }

}
