
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPayTVCallRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPayTVCallRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BasePhoneRequest">
 *       &lt;sequence>
 *         &lt;element name="IsMaster" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Invoiced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPayTVCallRequest", propOrder = {
    "isMaster",
    "invoiced",
    "deviceType",
    "payment"
})
public class BillPayTVCallRequest
    extends BasePhoneRequest
{

    @XmlElement(name = "IsMaster")
    protected boolean isMaster;
    @XmlElement(name = "Invoiced", required = true, type = Boolean.class, nillable = true)
    protected Boolean invoiced;
    @XmlElement(name = "DeviceType")
    protected int deviceType;
    @XmlElement(name = "Payment")
    protected boolean payment;

    /**
     * Gets the value of the isMaster property.
     * 
     */
    public boolean isIsMaster() {
        return isMaster;
    }

    /**
     * Sets the value of the isMaster property.
     * 
     */
    public void setIsMaster(boolean value) {
        this.isMaster = value;
    }

    /**
     * Gets the value of the invoiced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiced() {
        return invoiced;
    }

    /**
     * Sets the value of the invoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiced(Boolean value) {
        this.invoiced = value;
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

    /**
     * Gets the value of the payment property.
     * 
     */
    public boolean isPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     */
    public void setPayment(boolean value) {
        this.payment = value;
    }

}
