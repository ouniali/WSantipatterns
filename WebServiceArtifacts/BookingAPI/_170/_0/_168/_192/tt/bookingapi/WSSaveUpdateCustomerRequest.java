
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSaveUpdateCustomerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSaveUpdateCustomerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerList" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSCustomerList" minOccurs="0"/>
 *         &lt;element name="UserAction" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSaveUpdateCustomerRequest", propOrder = {
    "customerList",
    "userAction"
})
public class WSSaveUpdateCustomerRequest {

    @XmlElement(name = "CustomerList")
    protected ArrayOfWSCustomerList customerList;
    @XmlElement(name = "UserAction")
    protected ArrayOfString userAction;

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
     * Gets the value of the userAction property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getUserAction() {
        return userAction;
    }

    /**
     * Sets the value of the userAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setUserAction(ArrayOfString value) {
        this.userAction = value;
    }

}
