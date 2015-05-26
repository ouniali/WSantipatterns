
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
 *         &lt;element name="ExtensionSynchronizeTesterResult" type="{https://NewHotel/Web/Services/}ExtensionSyncResponse" minOccurs="0"/>
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
    "extensionSynchronizeTesterResult"
})
@XmlRootElement(name = "ExtensionSynchronizeTesterResponse")
public class ExtensionSynchronizeTesterResponse {

    @XmlElement(name = "ExtensionSynchronizeTesterResult")
    protected ExtensionSyncResponse extensionSynchronizeTesterResult;

    /**
     * Gets the value of the extensionSynchronizeTesterResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionSyncResponse }
     *     
     */
    public ExtensionSyncResponse getExtensionSynchronizeTesterResult() {
        return extensionSynchronizeTesterResult;
    }

    /**
     * Sets the value of the extensionSynchronizeTesterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionSyncResponse }
     *     
     */
    public void setExtensionSynchronizeTesterResult(ExtensionSyncResponse value) {
        this.extensionSynchronizeTesterResult = value;
    }

}
