
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWakeUpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWakeUpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WakeUpResponse" type="{https://NewHotel/Web/Services/}WakeUpResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWakeUpResponse", propOrder = {
    "wakeUpResponse"
})
public class ArrayOfWakeUpResponse {

    @XmlElement(name = "WakeUpResponse", nillable = true)
    protected List<WakeUpResponse> wakeUpResponse;

    /**
     * Gets the value of the wakeUpResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wakeUpResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWakeUpResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WakeUpResponse }
     * 
     * 
     */
    public List<WakeUpResponse> getWakeUpResponse() {
        if (wakeUpResponse == null) {
            wakeUpResponse = new ArrayList<WakeUpResponse>();
        }
        return this.wakeUpResponse;
    }

}
