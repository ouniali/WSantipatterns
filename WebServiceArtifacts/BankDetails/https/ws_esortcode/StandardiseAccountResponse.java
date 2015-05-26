
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
 *         &lt;element name="StandardiseAccountResult" type="{https://ws.esortcode.com}Standardise" minOccurs="0"/>
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
    "standardiseAccountResult"
})
@XmlRootElement(name = "StandardiseAccountResponse")
public class StandardiseAccountResponse {

    @XmlElement(name = "StandardiseAccountResult")
    protected Standardise standardiseAccountResult;

    /**
     * Gets the value of the standardiseAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Standardise }
     *     
     */
    public Standardise getStandardiseAccountResult() {
        return standardiseAccountResult;
    }

    /**
     * Sets the value of the standardiseAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Standardise }
     *     
     */
    public void setStandardiseAccountResult(Standardise value) {
        this.standardiseAccountResult = value;
    }

}
