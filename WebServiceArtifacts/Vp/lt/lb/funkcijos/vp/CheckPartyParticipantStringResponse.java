
package lt.lb.funkcijos.vp;

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
 *         &lt;element name="CheckPartyParticipant_StringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkPartyParticipantStringResult"
})
@XmlRootElement(name = "CheckPartyParticipant_StringResponse")
public class CheckPartyParticipantStringResponse {

    @XmlElement(name = "CheckPartyParticipant_StringResult")
    protected String checkPartyParticipantStringResult;

    /**
     * Gets the value of the checkPartyParticipantStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPartyParticipantStringResult() {
        return checkPartyParticipantStringResult;
    }

    /**
     * Sets the value of the checkPartyParticipantStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPartyParticipantStringResult(String value) {
        this.checkPartyParticipantStringResult = value;
    }

}
