
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Type corresponding to the input data for the operation UniProtId2DomainIds
 *                     
 * 
 * <p>Java class for UniProtId2DomainIdsRequestRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniProtId2DomainIdsRequestRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniprot_acc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniProtId2DomainIdsRequestRecordType", propOrder = {
    "uniprotAcc"
})
public class UniProtId2DomainIdsRequestRecordType {

    @XmlElement(name = "uniprot_acc", required = true)
    protected String uniprotAcc;

    /**
     * Gets the value of the uniprotAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniprotAcc() {
        return uniprotAcc;
    }

    /**
     * Sets the value of the uniprotAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniprotAcc(String value) {
        this.uniprotAcc = value;
    }

}
