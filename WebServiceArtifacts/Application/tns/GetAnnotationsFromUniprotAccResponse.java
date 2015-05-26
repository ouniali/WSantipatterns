
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_annotations_from_uniprot_accResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_annotations_from_uniprot_accResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_annotations_from_uniprot_accResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_annotations_from_uniprot_accResponse", propOrder = {
    "getAnnotationsFromUniprotAccResult"
})
public class GetAnnotationsFromUniprotAccResponse {

    @XmlElementRef(name = "get_annotations_from_uniprot_accResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getAnnotationsFromUniprotAccResult;

    /**
     * Gets the value of the getAnnotationsFromUniprotAccResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetAnnotationsFromUniprotAccResult() {
        return getAnnotationsFromUniprotAccResult;
    }

    /**
     * Sets the value of the getAnnotationsFromUniprotAccResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetAnnotationsFromUniprotAccResult(JAXBElement<String> value) {
        this.getAnnotationsFromUniprotAccResult = value;
    }

}
