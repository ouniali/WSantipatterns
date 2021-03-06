
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
 *         &lt;element name="PhoneCallChargeResult" type="{https://NewHotel/Web/Services/}BaseResponse" minOccurs="0"/>
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
    "phoneCallChargeResult"
})
@XmlRootElement(name = "PhoneCallChargeResponse")
public class PhoneCallChargeResponse {

    @XmlElement(name = "PhoneCallChargeResult")
    protected BaseResponse phoneCallChargeResult;

    /**
     * Gets the value of the phoneCallChargeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResponse }
     *     
     */
    public BaseResponse getPhoneCallChargeResult() {
        return phoneCallChargeResult;
    }

    /**
     * Sets the value of the phoneCallChargeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResponse }
     *     
     */
    public void setPhoneCallChargeResult(BaseResponse value) {
        this.phoneCallChargeResult = value;
    }

}
