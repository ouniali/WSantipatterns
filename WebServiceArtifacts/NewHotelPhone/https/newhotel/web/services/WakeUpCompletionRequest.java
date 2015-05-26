
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpCompletionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WakeUpCompletionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ExtensionId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Status" type="{https://NewHotel/Web/Services/}WakeUpCallState"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WakeUpCompletionRequest", propOrder = {
    "extensionId",
    "status"
})
public class WakeUpCompletionRequest
    extends BaseRequest
{

    @XmlElement(name = "ExtensionId", required = true)
    protected String extensionId;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected WakeUpCallState status;

    /**
     * Gets the value of the extensionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionId() {
        return extensionId;
    }

    /**
     * Sets the value of the extensionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionId(String value) {
        this.extensionId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WakeUpCallState }
     *     
     */
    public WakeUpCallState getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WakeUpCallState }
     *     
     */
    public void setStatus(WakeUpCallState value) {
        this.status = value;
    }

}
