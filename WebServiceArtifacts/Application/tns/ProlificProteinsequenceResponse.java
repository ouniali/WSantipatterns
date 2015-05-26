
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prolific_proteinsequenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prolific_proteinsequenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prolific_proteinsequenceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prolific_proteinsequenceResponse", propOrder = {
    "prolificProteinsequenceResult"
})
public class ProlificProteinsequenceResponse {

    @XmlElementRef(name = "prolific_proteinsequenceResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prolificProteinsequenceResult;

    /**
     * Gets the value of the prolificProteinsequenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProlificProteinsequenceResult() {
        return prolificProteinsequenceResult;
    }

    /**
     * Sets the value of the prolificProteinsequenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProlificProteinsequenceResult(JAXBElement<String> value) {
        this.prolificProteinsequenceResult = value;
    }

}
