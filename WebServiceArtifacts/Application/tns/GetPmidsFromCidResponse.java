
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_pmids_from_cidResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_pmids_from_cidResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_pmids_from_cidResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_pmids_from_cidResponse", propOrder = {
    "getPmidsFromCidResult"
})
public class GetPmidsFromCidResponse {

    @XmlElementRef(name = "get_pmids_from_cidResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getPmidsFromCidResult;

    /**
     * Gets the value of the getPmidsFromCidResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetPmidsFromCidResult() {
        return getPmidsFromCidResult;
    }

    /**
     * Sets the value of the getPmidsFromCidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetPmidsFromCidResult(JAXBElement<String> value) {
        this.getPmidsFromCidResult = value;
    }

}
