
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSFareRuleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFareRuleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRules" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFareRule" minOccurs="0"/>
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
@XmlType(name = "WSFareRuleResponse", propOrder = {
    "fareRules",
    "status"
})
public class WSFareRuleResponse {

    @XmlElement(name = "FareRules")
    protected ArrayOfWSFareRule fareRules;
    @XmlElement(name = "Status")
    protected WSStatus status;

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSFareRule }
     *     
     */
    public ArrayOfWSFareRule getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSFareRule }
     *     
     */
    public void setFareRules(ArrayOfWSFareRule value) {
        this.fareRules = value;
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
