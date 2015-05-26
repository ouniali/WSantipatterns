
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WakeUpRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceType" type="{https://NewHotel/Web/Services/}WakeUpCallTypeCall"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WakeUpRequest", propOrder = {
    "batchSize",
    "deviceType"
})
public class WakeUpRequest
    extends BaseRequest
{

    @XmlElement(name = "BatchSize")
    protected int batchSize;
    @XmlElement(name = "DeviceType", required = true)
    @XmlSchemaType(name = "string")
    protected WakeUpCallTypeCall deviceType;

    /**
     * Gets the value of the batchSize property.
     * 
     */
    public int getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     */
    public void setBatchSize(int value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link WakeUpCallTypeCall }
     *     
     */
    public WakeUpCallTypeCall getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WakeUpCallTypeCall }
     *     
     */
    public void setDeviceType(WakeUpCallTypeCall value) {
        this.deviceType = value;
    }

}
