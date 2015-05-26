
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation PdbId2DomainIds  (pdb_code, domain_id)
 *                     
 * 
 * <p>Java class for PdbId2DomainIdsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbId2DomainIdsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PdbId2DomainIdsRecord" type="{http://localhost:3000/api/soap/dataservices}PdbId2DomainIdsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdbId2DomainIdsResponseType", propOrder = {
    "pdbId2DomainIdsRecord"
})
public class PdbId2DomainIdsResponseType {

    @XmlElement(name = "PdbId2DomainIdsRecord")
    protected List<PdbId2DomainIdsRecordType> pdbId2DomainIdsRecord;

    /**
     * Gets the value of the pdbId2DomainIdsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbId2DomainIdsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbId2DomainIdsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbId2DomainIdsRecordType }
     * 
     * 
     */
    public List<PdbId2DomainIdsRecordType> getPdbId2DomainIdsRecord() {
        if (pdbId2DomainIdsRecord == null) {
            pdbId2DomainIdsRecord = new ArrayList<PdbId2DomainIdsRecordType>();
        }
        return this.pdbId2DomainIdsRecord;
    }

}
