
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageNewGesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageNewGesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageNewGesResponse" type="{https://NewHotel/Web/Services/}MessageNewGesResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageNewGesResponse", propOrder = {
    "messageNewGesResponse"
})
public class ArrayOfMessageNewGesResponse {

    @XmlElement(name = "MessageNewGesResponse", nillable = true)
    protected List<MessageNewGesResponse> messageNewGesResponse;

    /**
     * Gets the value of the messageNewGesResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageNewGesResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageNewGesResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageNewGesResponse }
     * 
     * 
     */
    public List<MessageNewGesResponse> getMessageNewGesResponse() {
        if (messageNewGesResponse == null) {
            messageNewGesResponse = new ArrayList<MessageNewGesResponse>();
        }
        return this.messageNewGesResponse;
    }

}
