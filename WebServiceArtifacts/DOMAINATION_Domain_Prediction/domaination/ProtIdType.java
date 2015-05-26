
package domaination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniProt_RefSeq_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtIdType", propOrder = {
    "uniProtRefSeqID"
})
public class ProtIdType {

    @XmlElement(name = "UniProt_RefSeq_ID", required = true)
    protected String uniProtRefSeqID;

    /**
     * Gets the value of the uniProtRefSeqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniProtRefSeqID() {
        return uniProtRefSeqID;
    }

    /**
     * Sets the value of the uniProtRefSeqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniProtRefSeqID(String value) {
        this.uniProtRefSeqID = value;
    }

}
