
package domaination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultsResponseTypeWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultsResponseTypeWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultsResponse" type="{Domaination}resultsResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultsResponseTypeWrapper", propOrder = {
    "resultsResponse"
})
public class ResultsResponseTypeWrapper {

    @XmlElement(required = true)
    protected ResultsResponseType resultsResponse;

    /**
     * Gets the value of the resultsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResultsResponseType }
     *     
     */
    public ResultsResponseType getResultsResponse() {
        return resultsResponse;
    }

    /**
     * Sets the value of the resultsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsResponseType }
     *     
     */
    public void setResultsResponse(ResultsResponseType value) {
        this.resultsResponse = value;
    }

}
