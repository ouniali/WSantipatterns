
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WakeUpCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="WakeUps" type="{https://NewHotel/Web/Services/}ArrayOfWakeUpResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WakeUpCollectionResponse", propOrder = {
    "wakeUps"
})
public class WakeUpCollectionResponse
    extends BaseResponse
{

    @XmlElement(name = "WakeUps")
    protected ArrayOfWakeUpResponse wakeUps;

    /**
     * Gets the value of the wakeUps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWakeUpResponse }
     *     
     */
    public ArrayOfWakeUpResponse getWakeUps() {
        return wakeUps;
    }

    /**
     * Sets the value of the wakeUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWakeUpResponse }
     *     
     */
    public void setWakeUps(ArrayOfWakeUpResponse value) {
        this.wakeUps = value;
    }

}
