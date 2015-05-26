
package ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import tour.ws_2013.TourBookingResult;


/**
 * <p>Java class for ArrayOfTourBookingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTourBookingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TourBookingResult" type="{WS_2013.Tour}TourBookingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTourBookingResult", propOrder = {
    "tourBookingResult"
})
public class ArrayOfTourBookingResult {

    @XmlElement(name = "TourBookingResult", nillable = true)
    protected List<TourBookingResult> tourBookingResult;

    /**
     * Gets the value of the tourBookingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourBookingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourBookingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourBookingResult }
     * 
     * 
     */
    public List<TourBookingResult> getTourBookingResult() {
        if (tourBookingResult == null) {
            tourBookingResult = new ArrayList<TourBookingResult>();
        }
        return this.tourBookingResult;
    }

}
