
package tns;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for count_distinct_pmids_from_cidResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="count_distinct_pmids_from_cidResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count_distinct_pmids_from_cidResult" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "count_distinct_pmids_from_cidResponse", propOrder = {
    "countDistinctPmidsFromCidResult"
})
public class CountDistinctPmidsFromCidResponse {

    @XmlElementRef(name = "count_distinct_pmids_from_cidResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> countDistinctPmidsFromCidResult;

    /**
     * Gets the value of the countDistinctPmidsFromCidResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCountDistinctPmidsFromCidResult() {
        return countDistinctPmidsFromCidResult;
    }

    /**
     * Sets the value of the countDistinctPmidsFromCidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCountDistinctPmidsFromCidResult(JAXBElement<BigInteger> value) {
        this.countDistinctPmidsFromCidResult = value;
    }

}
