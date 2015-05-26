
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSSSRBaggage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSSSRBaggage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSSSRBaggage" type="{http://192.168.0.170/TT/BookingAPI}WSSSRBaggage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSSSRBaggage", propOrder = {
    "wsssrBaggage"
})
public class ArrayOfWSSSRBaggage {

    @XmlElement(name = "WSSSRBaggage", nillable = true)
    protected List<WSSSRBaggage> wsssrBaggage;

    /**
     * Gets the value of the wsssrBaggage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsssrBaggage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSSSRBaggage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSSSRBaggage }
     * 
     * 
     */
    public List<WSSSRBaggage> getWSSSRBaggage() {
        if (wsssrBaggage == null) {
            wsssrBaggage = new ArrayList<WSSSRBaggage>();
        }
        return this.wsssrBaggage;
    }

}
