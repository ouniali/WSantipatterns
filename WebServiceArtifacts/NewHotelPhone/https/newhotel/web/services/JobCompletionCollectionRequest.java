
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobCompletionCollectionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobCompletionCollectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Completions" type="{https://NewHotel/Web/Services/}ArrayOfJobCompletionRequest" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobCompletionCollectionRequest", propOrder = {
    "completions",
    "deviceType"
})
public class JobCompletionCollectionRequest
    extends BaseRequest
{

    @XmlElement(name = "Completions")
    protected ArrayOfJobCompletionRequest completions;
    @XmlElement(name = "DeviceType")
    protected int deviceType;

    /**
     * Gets the value of the completions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobCompletionRequest }
     *     
     */
    public ArrayOfJobCompletionRequest getCompletions() {
        return completions;
    }

    /**
     * Sets the value of the completions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobCompletionRequest }
     *     
     */
    public void setCompletions(ArrayOfJobCompletionRequest value) {
        this.completions = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     */
    public int getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     */
    public void setDeviceType(int value) {
        this.deviceType = value;
    }

}
