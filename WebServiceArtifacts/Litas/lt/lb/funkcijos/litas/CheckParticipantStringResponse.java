
package lt.lb.funkcijos.litas;

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
 *         &lt;element name="CheckParticipant_StringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkParticipantStringResult"
})
@XmlRootElement(name = "CheckParticipant_StringResponse")
public class CheckParticipantStringResponse {

    @XmlElement(name = "CheckParticipant_StringResult")
    protected String checkParticipantStringResult;

    /**
     * Gets the value of the checkParticipantStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckParticipantStringResult() {
        return checkParticipantStringResult;
    }

    /**
     * Sets the value of the checkParticipantStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckParticipantStringResult(String value) {
        this.checkParticipantStringResult = value;
    }

}
