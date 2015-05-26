
package tns;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for count_distinct_pmids_from_uniprot_accResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="count_distinct_pmids_from_uniprot_accResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count_distinct_pmids_from_uniprot_accResult" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "count_distinct_pmids_from_uniprot_accResponse", propOrder = {
    "countDistinctPmidsFromUniprotAccResult"
})
public class CountDistinctPmidsFromUniprotAccResponse {

    @XmlElementRef(name = "count_distinct_pmids_from_uniprot_accResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> countDistinctPmidsFromUniprotAccResult;

    /**
     * Gets the value of the countDistinctPmidsFromUniprotAccResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCountDistinctPmidsFromUniprotAccResult() {
        return countDistinctPmidsFromUniprotAccResult;
    }

    /**
     * Sets the value of the countDistinctPmidsFromUniprotAccResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCountDistinctPmidsFromUniprotAccResult(JAXBElement<BigInteger> value) {
        this.countDistinctPmidsFromUniprotAccResult = value;
    }

}
