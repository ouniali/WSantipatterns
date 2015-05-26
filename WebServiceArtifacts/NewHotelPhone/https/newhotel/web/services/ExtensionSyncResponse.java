
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionSyncResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionSyncResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ExtensionItems" type="{https://NewHotel/Web/Services/}ArrayOfExtensionSyncItemResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionSyncResponse", propOrder = {
    "extensionItems"
})
public class ExtensionSyncResponse
    extends BaseResponse
{

    @XmlElement(name = "ExtensionItems")
    protected ArrayOfExtensionSyncItemResponse extensionItems;

    /**
     * Gets the value of the extensionItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensionSyncItemResponse }
     *     
     */
    public ArrayOfExtensionSyncItemResponse getExtensionItems() {
        return extensionItems;
    }

    /**
     * Sets the value of the extensionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionSyncItemResponse }
     *     
     */
    public void setExtensionItems(ArrayOfExtensionSyncItemResponse value) {
        this.extensionItems = value;
    }

}
