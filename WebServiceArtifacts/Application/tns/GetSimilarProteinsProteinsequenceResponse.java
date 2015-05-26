
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_similar_proteins_proteinsequenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_similar_proteins_proteinsequenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_similar_proteins_proteinsequenceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_similar_proteins_proteinsequenceResponse", propOrder = {
    "getSimilarProteinsProteinsequenceResult"
})
public class GetSimilarProteinsProteinsequenceResponse {

    @XmlElementRef(name = "get_similar_proteins_proteinsequenceResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getSimilarProteinsProteinsequenceResult;

    /**
     * Gets the value of the getSimilarProteinsProteinsequenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetSimilarProteinsProteinsequenceResult() {
        return getSimilarProteinsProteinsequenceResult;
    }

    /**
     * Sets the value of the getSimilarProteinsProteinsequenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetSimilarProteinsProteinsequenceResult(JAXBElement<String> value) {
        this.getSimilarProteinsProteinsequenceResult = value;
    }

}
