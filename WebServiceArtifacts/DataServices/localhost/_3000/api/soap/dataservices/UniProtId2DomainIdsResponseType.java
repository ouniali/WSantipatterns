
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation UniProtId2DomainIds  (species_name, superfamily_id, domain_id, description, gene_name, uniprot_acc)
 *                     
 * 
 * <p>Java class for UniProtId2DomainIdsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniProtId2DomainIdsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="UniProtId2DomainIdsRecord" type="{http://localhost:3000/api/soap/dataservices}UniProtId2DomainIdsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniProtId2DomainIdsResponseType", propOrder = {
    "uniProtId2DomainIdsRecord"
})
public class UniProtId2DomainIdsResponseType {

    @XmlElement(name = "UniProtId2DomainIdsRecord")
    protected List<UniProtId2DomainIdsRecordType> uniProtId2DomainIdsRecord;

    /**
     * Gets the value of the uniProtId2DomainIdsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniProtId2DomainIdsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniProtId2DomainIdsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniProtId2DomainIdsRecordType }
     * 
     * 
     */
    public List<UniProtId2DomainIdsRecordType> getUniProtId2DomainIdsRecord() {
        if (uniProtId2DomainIdsRecord == null) {
            uniProtId2DomainIdsRecord = new ArrayList<UniProtId2DomainIdsRecordType>();
        }
        return this.uniProtId2DomainIdsRecord;
    }

}
