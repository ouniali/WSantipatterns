
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAgencyCustomerListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAgencyCustomerListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerList" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSCustomerList" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAgencyCustomerListResponse", propOrder = {
    "customerList",
    "status"
})
public class WSAgencyCustomerListResponse {

    @XmlElement(name = "CustomerList")
    protected ArrayOfWSCustomerList customerList;
    @XmlElement(name = "Status")
    protected WSStatus status;

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

}
