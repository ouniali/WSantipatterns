
package uk.co.hha.apps.mis;

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
 *         &lt;element name="GetPredictedHighLowTideResult" type="{http://apps.hha.co.uk/mis}Tide" minOccurs="0"/>
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
    "getPredictedHighLowTideResult"
})
@XmlRootElement(name = "GetPredictedHighLowTideResponse")
public class GetPredictedHighLowTideResponse {

    @XmlElement(name = "GetPredictedHighLowTideResult")
    protected Tide getPredictedHighLowTideResult;

    /**
     * Gets the value of the getPredictedHighLowTideResult property.
     * 
     * @return
     *     possible object is
     *     {@link Tide }
     *     
     */
    public Tide getGetPredictedHighLowTideResult() {
        return getPredictedHighLowTideResult;
    }

    /**
     * Sets the value of the getPredictedHighLowTideResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tide }
     *     
     */
    public void setGetPredictedHighLowTideResult(Tide value) {
        this.getPredictedHighLowTideResult = value;
    }

}
