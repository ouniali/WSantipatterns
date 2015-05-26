
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
 *         &lt;element name="CheckCDParticipantCode_StringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkCDParticipantCodeStringResult"
})
@XmlRootElement(name = "CheckCDParticipantCode_StringResponse")
public class CheckCDParticipantCodeStringResponse {

    @XmlElement(name = "CheckCDParticipantCode_StringResult")
    protected String checkCDParticipantCodeStringResult;

    /**
     * Gets the value of the checkCDParticipantCodeStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCDParticipantCodeStringResult() {
        return checkCDParticipantCodeStringResult;
    }

    /**
     * Sets the value of the checkCDParticipantCodeStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCDParticipantCodeStringResult(String value) {
        this.checkCDParticipantCodeStringResult = value;
    }

}
