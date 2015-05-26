
package scooby;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FastaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FastaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FASTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOMCUT" type="{Scooby}DOMCUTType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FastaType", propOrder = {
    "fasta",
    "domcut"
})
public class FastaType {

    @XmlElement(name = "FASTA", required = true)
    protected String fasta;
    @XmlElement(name = "DOMCUT", required = true, defaultValue = "DOMCUT_B")
    protected DOMCUTType domcut;

    /**
     * Gets the value of the fasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASTA() {
        return fasta;
    }

    /**
     * Sets the value of the fasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASTA(String value) {
        this.fasta = value;
    }

    /**
     * Gets the value of the domcut property.
     * 
     * @return
     *     possible object is
     *     {@link DOMCUTType }
     *     
     */
    public DOMCUTType getDOMCUT() {
        return domcut;
    }

    /**
     * Sets the value of the domcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOMCUTType }
     *     
     */
    public void setDOMCUT(DOMCUTType value) {
        this.domcut = value;
    }

}
