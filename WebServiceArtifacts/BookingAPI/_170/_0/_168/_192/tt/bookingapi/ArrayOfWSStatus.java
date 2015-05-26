
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSStatus" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSStatus", propOrder = {
    "wsStatus"
})
public class ArrayOfWSStatus {

    @XmlElement(name = "WSStatus", nillable = true)
    protected List<WSStatus> wsStatus;

    /**
     * Gets the value of the wsStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSStatus }
     * 
     * 
     */
    public List<WSStatus> getWSStatus() {
        if (wsStatus == null) {
            wsStatus = new ArrayList<WSStatus>();
        }
        return this.wsStatus;
    }

}
