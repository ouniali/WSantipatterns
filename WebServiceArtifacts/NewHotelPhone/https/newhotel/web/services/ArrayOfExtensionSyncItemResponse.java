
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtensionSyncItemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtensionSyncItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionSyncItemResponse" type="{https://NewHotel/Web/Services/}ExtensionSyncItemResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionSyncItemResponse", propOrder = {
    "extensionSyncItemResponse"
})
public class ArrayOfExtensionSyncItemResponse {

    @XmlElement(name = "ExtensionSyncItemResponse", nillable = true)
    protected List<ExtensionSyncItemResponse> extensionSyncItemResponse;

    /**
     * Gets the value of the extensionSyncItemResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionSyncItemResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionSyncItemResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionSyncItemResponse }
     * 
     * 
     */
    public List<ExtensionSyncItemResponse> getExtensionSyncItemResponse() {
        if (extensionSyncItemResponse == null) {
            extensionSyncItemResponse = new ArrayList<ExtensionSyncItemResponse>();
        }
        return this.extensionSyncItemResponse;
    }

}
