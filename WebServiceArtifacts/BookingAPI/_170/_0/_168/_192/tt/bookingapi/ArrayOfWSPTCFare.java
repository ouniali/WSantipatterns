
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSPTCFare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSPTCFare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSPTCFare" type="{http://192.168.0.170/TT/BookingAPI}WSPTCFare" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSPTCFare", propOrder = {
    "wsptcFare"
})
public class ArrayOfWSPTCFare {

    @XmlElement(name = "WSPTCFare")
    protected List<WSPTCFare> wsptcFare;

    /**
     * Gets the value of the wsptcFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsptcFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSPTCFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPTCFare }
     * 
     * 
     */
    public List<WSPTCFare> getWSPTCFare() {
        if (wsptcFare == null) {
            wsptcFare = new ArrayList<WSPTCFare>();
        }
        return this.wsptcFare;
    }

}
