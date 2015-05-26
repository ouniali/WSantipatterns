
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
 *         &lt;element name="VoterUpdate" type="{https://ivrs.elections.il.gov/api}WsUpdateRequest2"/>
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
    "voterUpdate"
})
@XmlRootElement(name = "StatewideVoterUpdate2Std")
public class StatewideVoterUpdate2Std {

    @XmlElement(name = "VoterUpdate", required = true, nillable = true)
    protected WsUpdateRequest2 voterUpdate;

    /**
     * Gets the value of the voterUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link WsUpdateRequest2 }
     *     
     */
    public WsUpdateRequest2 getVoterUpdate() {
        return voterUpdate;
    }

    /**
     * Sets the value of the voterUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsUpdateRequest2 }
     *     
     */
    public void setVoterUpdate(WsUpdateRequest2 value) {
        this.voterUpdate = value;
    }

}
