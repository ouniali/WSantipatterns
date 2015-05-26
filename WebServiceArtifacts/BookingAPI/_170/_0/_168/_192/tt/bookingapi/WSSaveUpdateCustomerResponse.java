
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSaveUpdateCustomerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSaveUpdateCustomerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSStatus" minOccurs="0"/>
 *         &lt;element name="CustomerList" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSCustomerList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSaveUpdateCustomerResponse", propOrder = {
    "status",
    "customerList"
})
public class WSSaveUpdateCustomerResponse {

    @XmlElement(name = "Status")
    protected ArrayOfWSStatus status;
    @XmlElement(name = "CustomerList")
    protected ArrayOfWSCustomerList customerList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSStatus }
     *     
     */
    public ArrayOfWSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSStatus }
     *     
     */
    public void setStatus(ArrayOfWSStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSCustomerList }
     *     
     */
    public ArrayOfWSCustomerList getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSCustomerList }
     *     
     */
    public void setCustomerList(ArrayOfWSCustomerList value) {
        this.customerList = value;
    }

}
