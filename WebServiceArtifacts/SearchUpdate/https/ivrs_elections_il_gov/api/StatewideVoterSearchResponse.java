
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
 *         &lt;element name="StatewideVoterSearchResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "statewideVoterSearchResult"
})
@XmlRootElement(name = "StatewideVoterSearchResponse")
public class StatewideVoterSearchResponse {

    @XmlElement(name = "StatewideVoterSearchResult")
    protected String statewideVoterSearchResult;

    /**
     * Gets the value of the statewideVoterSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatewideVoterSearchResult() {
        return statewideVoterSearchResult;
    }

    /**
     * Sets the value of the statewideVoterSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatewideVoterSearchResult(String value) {
        this.statewideVoterSearchResult = value;
    }

}
