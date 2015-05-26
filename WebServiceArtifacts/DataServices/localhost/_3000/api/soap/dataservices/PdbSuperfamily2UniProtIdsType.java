
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation PdbSuperfamily2UniProtIds (superfamily_id)
 *                     
 * 
 * <p>Java class for PdbSuperfamily2UniProtIdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbSuperfamily2UniProtIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PdbSuperfamily2UniProtIdsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}PdbSuperfamily2UniProtIdsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdbSuperfamily2UniProtIdsType", propOrder = {
    "pdbSuperfamily2UniProtIdsRequestRecord"
})
public class PdbSuperfamily2UniProtIdsType {

    @XmlElement(name = "PdbSuperfamily2UniProtIdsRequestRecord", required = true)
    protected PdbSuperfamily2UniProtIdsRequestRecordType pdbSuperfamily2UniProtIdsRequestRecord;

    /**
     * Gets the value of the pdbSuperfamily2UniProtIdsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PdbSuperfamily2UniProtIdsRequestRecordType }
     *     
     */
    public PdbSuperfamily2UniProtIdsRequestRecordType getPdbSuperfamily2UniProtIdsRequestRecord() {
        return pdbSuperfamily2UniProtIdsRequestRecord;
    }

    /**
     * Sets the value of the pdbSuperfamily2UniProtIdsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdbSuperfamily2UniProtIdsRequestRecordType }
     *     
     */
    public void setPdbSuperfamily2UniProtIdsRequestRecord(PdbSuperfamily2UniProtIdsRequestRecordType value) {
        this.pdbSuperfamily2UniProtIdsRequestRecord = value;
    }

}
