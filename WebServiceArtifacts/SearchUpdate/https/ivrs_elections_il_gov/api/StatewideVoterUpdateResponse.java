
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
 *         &lt;element name="StatewideVoterUpdateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "statewideVoterUpdateResult"
})
@XmlRootElement(name = "StatewideVoterUpdateResponse")
public class StatewideVoterUpdateResponse {

    @XmlElement(name = "StatewideVoterUpdateResult")
    protected String statewideVoterUpdateResult;

    /**
     * Gets the value of the statewideVoterUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatewideVoterUpdateResult() {
        return statewideVoterUpdateResult;
    }

    /**
     * Sets the value of the statewideVoterUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatewideVoterUpdateResult(String value) {
        this.statewideVoterUpdateResult = value;
    }

}
