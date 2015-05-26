
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingJobsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingJobsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "PendingJobsRequest", propOrder = {
    "batchSize",
    "deviceType"
})
public class PendingJobsRequest
    extends BaseRequest
{

    @XmlElement(name = "BatchSize")
    protected int batchSize;
    @XmlElement(name = "DeviceType")
    protected int deviceType;

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
