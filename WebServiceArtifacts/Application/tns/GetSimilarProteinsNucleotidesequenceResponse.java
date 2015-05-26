
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_similar_proteins_nucleotidesequenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_similar_proteins_nucleotidesequenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_similar_proteins_nucleotidesequenceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_similar_proteins_nucleotidesequenceResponse", propOrder = {
    "getSimilarProteinsNucleotidesequenceResult"
})
public class GetSimilarProteinsNucleotidesequenceResponse {

    @XmlElementRef(name = "get_similar_proteins_nucleotidesequenceResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getSimilarProteinsNucleotidesequenceResult;

    /**
     * Gets the value of the getSimilarProteinsNucleotidesequenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetSimilarProteinsNucleotidesequenceResult() {
        return getSimilarProteinsNucleotidesequenceResult;
    }

    /**
     * Sets the value of the getSimilarProteinsNucleotidesequenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetSimilarProteinsNucleotidesequenceResult(JAXBElement<String> value) {
        this.getSimilarProteinsNucleotidesequenceResult = value;
    }

}
