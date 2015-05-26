
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation ChainId2DomainIds  (chain_id, domain_id)
 *                     
 * 
 * <p>Java class for ChainId2DomainIdsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChainId2DomainIdsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ChainId2DomainIdsRecord" type="{http://localhost:3000/api/soap/dataservices}ChainId2DomainIdsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainId2DomainIdsResponseType", propOrder = {
    "chainId2DomainIdsRecord"
})
public class ChainId2DomainIdsResponseType {

    @XmlElement(name = "ChainId2DomainIdsRecord")
    protected List<ChainId2DomainIdsRecordType> chainId2DomainIdsRecord;

    /**
     * Gets the value of the chainId2DomainIdsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chainId2DomainIdsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChainId2DomainIdsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChainId2DomainIdsRecordType }
     * 
     * 
     */
    public List<ChainId2DomainIdsRecordType> getChainId2DomainIdsRecord() {
        if (chainId2DomainIdsRecord == null) {
            chainId2DomainIdsRecord = new ArrayList<ChainId2DomainIdsRecordType>();
        }
        return this.chainId2DomainIdsRecord;
    }

}
