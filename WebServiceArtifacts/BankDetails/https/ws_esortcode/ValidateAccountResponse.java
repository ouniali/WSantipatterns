
package https.ws_esortcode;

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
 *         &lt;element name="ValidateAccountResult" type="{https://ws.esortcode.com}Validation" minOccurs="0"/>
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
    "validateAccountResult"
})
@XmlRootElement(name = "ValidateAccountResponse")
public class ValidateAccountResponse {

    @XmlElement(name = "ValidateAccountResult")
    protected Validation validateAccountResult;

    /**
     * Gets the value of the validateAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Validation }
     *     
     */
    public Validation getValidateAccountResult() {
        return validateAccountResult;
    }

    /**
     * Sets the value of the validateAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validation }
     *     
     */
    public void setValidateAccountResult(Validation value) {
        this.validateAccountResult = value;
    }

}
