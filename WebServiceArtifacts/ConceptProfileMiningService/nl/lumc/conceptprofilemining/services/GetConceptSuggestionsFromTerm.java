
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getConceptSuggestionsFromTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConceptSuggestionsFromTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutOffValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConceptSuggestionsFromTerm", propOrder = {
    "cutOffValue",
    "term"
})
public class GetConceptSuggestionsFromTerm {

    protected int cutOffValue;
    protected String term;

    /**
     * Gets the value of the cutOffValue property.
     * 
     */
    public int getCutOffValue() {
        return cutOffValue;
    }

    /**
     * Sets the value of the cutOffValue property.
     * 
     */
    public void setCutOffValue(int value) {
        this.cutOffValue = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

}
