
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionSynchronizeResult" type="{https://NewHotel/Web/Services/}ExtensionSyncResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionSynchronizeResult"
})
@XmlRootElement(name = "ExtensionSynchronizeResponse")
public class ExtensionSynchronizeResponse {

    @XmlElement(name = "ExtensionSynchronizeResult")
    protected ExtensionSyncResponse extensionSynchronizeResult;

    /**
     * Gets the value of the extensionSynchronizeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionSyncResponse }
     *     
     */
    public ExtensionSyncResponse getExtensionSynchronizeResult() {
        return extensionSynchronizeResult;
    }

    /**
     * Sets the value of the extensionSynchronizeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionSyncResponse }
     *     
     */
    public void setExtensionSynchronizeResult(ExtensionSyncResponse value) {
        this.extensionSynchronizeResult = value;
    }

}
