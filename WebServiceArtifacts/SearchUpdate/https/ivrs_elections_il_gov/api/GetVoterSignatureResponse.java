
package https.ivrs_elections_il_gov.api;

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
 *         &lt;element name="GetVoterSignatureResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getVoterSignatureResult"
})
@XmlRootElement(name = "GetVoterSignatureResponse")
public class GetVoterSignatureResponse {

    @XmlElement(name = "GetVoterSignatureResult")
    protected byte[] getVoterSignatureResult;

    /**
     * Gets the value of the getVoterSignatureResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetVoterSignatureResult() {
        return getVoterSignatureResult;
    }

    /**
     * Sets the value of the getVoterSignatureResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetVoterSignatureResult(byte[] value) {
        this.getVoterSignatureResult = value;
    }

}
