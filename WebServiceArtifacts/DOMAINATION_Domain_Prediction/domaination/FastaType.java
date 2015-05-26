
package domaination;

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
    "fasta"
})
public class FastaType {

    @XmlElement(name = "FASTA", required = true)
    protected String fasta;

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

}
