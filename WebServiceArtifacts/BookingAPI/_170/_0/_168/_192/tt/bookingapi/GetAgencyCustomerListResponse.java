
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
 *         &lt;element name="GetAgencyCustomerListResult" type="{http://192.168.0.170/TT/BookingAPI}WSAgencyCustomerListResponse" minOccurs="0"/>
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
    "getAgencyCustomerListResult"
})
@XmlRootElement(name = "GetAgencyCustomerListResponse")
public class GetAgencyCustomerListResponse {

    @XmlElement(name = "GetAgencyCustomerListResult")
    protected WSAgencyCustomerListResponse getAgencyCustomerListResult;

    /**
     * Gets the value of the getAgencyCustomerListResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSAgencyCustomerListResponse }
     *     
     */
    public WSAgencyCustomerListResponse getGetAgencyCustomerListResult() {
        return getAgencyCustomerListResult;
    }

    /**
     * Sets the value of the getAgencyCustomerListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAgencyCustomerListResponse }
     *     
     */
    public void setGetAgencyCustomerListResult(WSAgencyCustomerListResponse value) {
        this.getAgencyCustomerListResult = value;
    }

}
