
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ClientURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInformationType", propOrder = {

})
public class UserInformationType {

    @XmlElement(name = "ClientURL", required = true)
    protected String clientURL;

    /**
     * Gets the value of the clientURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientURL() {
        return clientURL;
    }

    /**
     * Sets the value of the clientURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientURL(String value) {
        this.clientURL = value;
    }

}
