
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpCompletionCollectionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WakeUpCompletionCollectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Requests" type="{https://NewHotel/Web/Services/}ArrayOfWakeUpCompletionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WakeUpCompletionCollectionRequest", propOrder = {
    "requests"
})
public class WakeUpCompletionCollectionRequest
    extends BaseRequest
{

    @XmlElement(name = "Requests")
    protected ArrayOfWakeUpCompletionRequest requests;

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWakeUpCompletionRequest }
     *     
     */
    public ArrayOfWakeUpCompletionRequest getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWakeUpCompletionRequest }
     *     
     */
    public void setRequests(ArrayOfWakeUpCompletionRequest value) {
        this.requests = value;
    }

}
