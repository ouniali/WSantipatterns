
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimilarConceptProfilesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimilarConceptProfilesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}MatchingResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimilarConceptProfilesResponse", propOrder = {
    "matchingResult"
})
public class GetSimilarConceptProfilesResponse {

    @XmlElement(name = "MatchingResult", namespace = "http://services.conceptprofilemining.lumc.nl/")
    protected MatchingResult matchingResult;

    /**
     * Gets the value of the matchingResult property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingResult }
     *     
     */
    public MatchingResult getMatchingResult() {
        return matchingResult;
    }

    /**
     * Sets the value of the matchingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingResult }
     *     
     */
    public void setMatchingResult(MatchingResult value) {
        this.matchingResult = value;
    }

}
