
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
 *         &lt;element name="SaveUpateDeatilsOfCustomerResult" type="{http://192.168.0.170/TT/BookingAPI}WSSaveUpdateCustomerResponse" minOccurs="0"/>
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
    "saveUpateDeatilsOfCustomerResult"
})
@XmlRootElement(name = "SaveUpateDeatilsOfCustomerResponse")
public class SaveUpateDeatilsOfCustomerResponse {

    @XmlElement(name = "SaveUpateDeatilsOfCustomerResult")
    protected WSSaveUpdateCustomerResponse saveUpateDeatilsOfCustomerResult;

    /**
     * Gets the value of the saveUpateDeatilsOfCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSSaveUpdateCustomerResponse }
     *     
     */
    public WSSaveUpdateCustomerResponse getSaveUpateDeatilsOfCustomerResult() {
        return saveUpateDeatilsOfCustomerResult;
    }

    /**
     * Sets the value of the saveUpateDeatilsOfCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSSaveUpdateCustomerResponse }
     *     
     */
    public void setSaveUpateDeatilsOfCustomerResult(WSSaveUpdateCustomerResponse value) {
        this.saveUpateDeatilsOfCustomerResult = value;
    }

}
