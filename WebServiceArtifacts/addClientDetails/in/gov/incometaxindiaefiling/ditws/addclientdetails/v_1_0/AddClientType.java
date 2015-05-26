
package in.gov.incometaxindiaefiling.ditws.addclientdetails.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addClientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addClientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addClientDetails" type="{http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0}addClientDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addClientType", propOrder = {
    "addClientDetails"
})
public class AddClientType {

    @XmlElement(required = true, nillable = true)
    protected AddClientDetailsType addClientDetails;

    /**
     * Gets the value of the addClientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddClientDetailsType }
     *     
     */
    public AddClientDetailsType getAddClientDetails() {
        return addClientDetails;
    }

    /**
     * Sets the value of the addClientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddClientDetailsType }
     *     
     */
    public void setAddClientDetails(AddClientDetailsType value) {
        this.addClientDetails = value;
    }

}
