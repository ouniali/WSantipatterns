
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prolific_nucleotidesequenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prolific_nucleotidesequenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prolific_nucleotidesequenceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prolific_nucleotidesequenceResponse", propOrder = {
    "prolificNucleotidesequenceResult"
})
public class ProlificNucleotidesequenceResponse {

    @XmlElementRef(name = "prolific_nucleotidesequenceResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prolificNucleotidesequenceResult;

    /**
     * Gets the value of the prolificNucleotidesequenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProlificNucleotidesequenceResult() {
        return prolificNucleotidesequenceResult;
    }

    /**
     * Sets the value of the prolificNucleotidesequenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProlificNucleotidesequenceResult(JAXBElement<String> value) {
        this.prolificNucleotidesequenceResult = value;
    }

}
