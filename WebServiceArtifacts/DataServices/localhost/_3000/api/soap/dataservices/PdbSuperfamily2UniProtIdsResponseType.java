
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation PdbSuperfamily2UniProtIds  (species_name, superfamily_id, domain_id, description, gene_name, uniprot_acc)
 *                     
 * 
 * <p>Java class for PdbSuperfamily2UniProtIdsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbSuperfamily2UniProtIdsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PdbSuperfamily2UniProtIdsRecord" type="{http://localhost:3000/api/soap/dataservices}PdbSuperfamily2UniProtIdsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdbSuperfamily2UniProtIdsResponseType", propOrder = {
    "pdbSuperfamily2UniProtIdsRecord"
})
public class PdbSuperfamily2UniProtIdsResponseType {

    @XmlElement(name = "PdbSuperfamily2UniProtIdsRecord")
    protected List<PdbSuperfamily2UniProtIdsRecordType> pdbSuperfamily2UniProtIdsRecord;

    /**
     * Gets the value of the pdbSuperfamily2UniProtIdsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbSuperfamily2UniProtIdsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbSuperfamily2UniProtIdsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbSuperfamily2UniProtIdsRecordType }
     * 
     * 
     */
    public List<PdbSuperfamily2UniProtIdsRecordType> getPdbSuperfamily2UniProtIdsRecord() {
        if (pdbSuperfamily2UniProtIdsRecord == null) {
            pdbSuperfamily2UniProtIdsRecord = new ArrayList<PdbSuperfamily2UniProtIdsRecordType>();
        }
        return this.pdbSuperfamily2UniProtIdsRecord;
    }

}
