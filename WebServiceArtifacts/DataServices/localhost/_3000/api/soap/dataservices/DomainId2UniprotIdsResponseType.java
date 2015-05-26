
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation DomainId2UniprotIds  (species_name, superfamily_id, domain_id, description, gene_name, uniprot_acc)
 *                     
 * 
 * <p>Java class for DomainId2UniprotIdsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainId2UniprotIdsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="DomainId2UniprotIdsRecord" type="{http://localhost:3000/api/soap/dataservices}DomainId2UniprotIdsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainId2UniprotIdsResponseType", propOrder = {
    "domainId2UniprotIdsRecord"
})
public class DomainId2UniprotIdsResponseType {

    @XmlElement(name = "DomainId2UniprotIdsRecord")
    protected List<DomainId2UniprotIdsRecordType> domainId2UniprotIdsRecord;

    /**
     * Gets the value of the domainId2UniprotIdsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainId2UniprotIdsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainId2UniprotIdsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainId2UniprotIdsRecordType }
     * 
     * 
     */
    public List<DomainId2UniprotIdsRecordType> getDomainId2UniprotIdsRecord() {
        if (domainId2UniprotIdsRecord == null) {
            domainId2UniprotIdsRecord = new ArrayList<DomainId2UniprotIdsRecordType>();
        }
        return this.domainId2UniprotIdsRecord;
    }

}
