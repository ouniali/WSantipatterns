
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
 *         &lt;element name="CheckParticipantAccountType_StringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkParticipantAccountTypeStringResult"
})
@XmlRootElement(name = "CheckParticipantAccountType_StringResponse")
public class CheckParticipantAccountTypeStringResponse {

    @XmlElement(name = "CheckParticipantAccountType_StringResult")
    protected String checkParticipantAccountTypeStringResult;

    /**
     * Gets the value of the checkParticipantAccountTypeStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckParticipantAccountTypeStringResult() {
        return checkParticipantAccountTypeStringResult;
    }

    /**
     * Sets the value of the checkParticipantAccountTypeStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckParticipantAccountTypeStringResult(String value) {
        this.checkParticipantAccountTypeStringResult = value;
    }

}
