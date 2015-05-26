
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneDeviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneDeviceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BasePhoneRequest">
 *       &lt;sequence>
 *         &lt;element name="DeviceIDs" type="{https://NewHotel/Web/Services/}ArrayOfPhoneDeviceCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneDeviceRequest", propOrder = {
    "deviceIDs"
})
public class PhoneDeviceRequest
    extends BasePhoneRequest
{

    @XmlElement(name = "DeviceIDs")
    protected ArrayOfPhoneDeviceCollection deviceIDs;

    /**
     * Gets the value of the deviceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneDeviceCollection }
     *     
     */
    public ArrayOfPhoneDeviceCollection getDeviceIDs() {
        return deviceIDs;
    }

    /**
     * Sets the value of the deviceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneDeviceCollection }
     *     
     */
    public void setDeviceIDs(ArrayOfPhoneDeviceCollection value) {
        this.deviceIDs = value;
    }

}
