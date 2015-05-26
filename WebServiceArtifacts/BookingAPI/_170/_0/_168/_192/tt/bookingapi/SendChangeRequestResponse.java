
package _170._0._168._192.tt.bookingapi;

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
 *         &lt;element name="SendChangeRequestResult" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSendChangeRequestResponse" minOccurs="0"/>
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
    "sendChangeRequestResult"
})
@XmlRootElement(name = "SendChangeRequestResponse")
public class SendChangeRequestResponse {

    @XmlElement(name = "SendChangeRequestResult")
    protected ArrayOfWSSendChangeRequestResponse sendChangeRequestResult;

    /**
     * Gets the value of the sendChangeRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSendChangeRequestResponse }
     *     
     */
    public ArrayOfWSSendChangeRequestResponse getSendChangeRequestResult() {
        return sendChangeRequestResult;
    }

    /**
     * Sets the value of the sendChangeRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSendChangeRequestResponse }
     *     
     */
    public void setSendChangeRequestResult(ArrayOfWSSendChangeRequestResponse value) {
        this.sendChangeRequestResult = value;
    }

}
