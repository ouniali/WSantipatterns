
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
 *         &lt;element name="StatewideVoterUpdate2StdResult" type="{https://ivrs.elections.il.gov/api}VoterUpdateReturn" minOccurs="0"/>
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
    "statewideVoterUpdate2StdResult"
})
@XmlRootElement(name = "StatewideVoterUpdate2StdResponse")
public class StatewideVoterUpdate2StdResponse {

    @XmlElement(name = "StatewideVoterUpdate2StdResult")
    protected VoterUpdateReturn statewideVoterUpdate2StdResult;

    /**
     * Gets the value of the statewideVoterUpdate2StdResult property.
     * 
     * @return
     *     possible object is
     *     {@link VoterUpdateReturn }
     *     
     */
    public VoterUpdateReturn getStatewideVoterUpdate2StdResult() {
        return statewideVoterUpdate2StdResult;
    }

    /**
     * Sets the value of the statewideVoterUpdate2StdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterUpdateReturn }
     *     
     */
    public void setStatewideVoterUpdate2StdResult(VoterUpdateReturn value) {
        this.statewideVoterUpdate2StdResult = value;
    }

}
