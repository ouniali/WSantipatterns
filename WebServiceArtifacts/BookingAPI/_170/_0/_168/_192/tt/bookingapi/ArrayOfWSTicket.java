
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSTicket" type="{http://192.168.0.170/TT/BookingAPI}WSTicket" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSTicket", propOrder = {
    "wsTicket"
})
public class ArrayOfWSTicket {

    @XmlElement(name = "WSTicket", nillable = true)
    protected List<WSTicket> wsTicket;

    /**
     * Gets the value of the wsTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTicket }
     * 
     * 
     */
    public List<WSTicket> getWSTicket() {
        if (wsTicket == null) {
            wsTicket = new ArrayList<WSTicket>();
        }
        return this.wsTicket;
    }

}
