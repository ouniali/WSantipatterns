
package gov.nsw.lands.address.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nsw.lands.address.data.AddressResult;


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
 *         &lt;element name="findAddressReturn" type="{http://data.address.lands.nsw.gov}AddressResult"/>
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
    "findAddressReturn"
})
@XmlRootElement(name = "findAddressResponse")
public class FindAddressResponse {

    @XmlElement(required = true, nillable = true)
    protected AddressResult findAddressReturn;

    /**
     * Gets the value of the findAddressReturn property.
     * 
     * @return
     *     possible object is
     *     {@link AddressResult }
     *     
     */
    public AddressResult getFindAddressReturn() {
        return findAddressReturn;
    }

    /**
     * Sets the value of the findAddressReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressResult }
     *     
     */
    public void setFindAddressReturn(AddressResult value) {
        this.findAddressReturn = value;
    }

}
