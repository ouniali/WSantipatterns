
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation PdbId2DomainIds (pdb_code)
 *                     
 * 
 * <p>Java class for PdbId2DomainIdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbId2DomainIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PdbId2DomainIdsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}PdbId2DomainIdsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdbId2DomainIdsType", propOrder = {
    "pdbId2DomainIdsRequestRecord"
})
public class PdbId2DomainIdsType {

    @XmlElement(name = "PdbId2DomainIdsRequestRecord", required = true)
    protected PdbId2DomainIdsRequestRecordType pdbId2DomainIdsRequestRecord;

    /**
     * Gets the value of the pdbId2DomainIdsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PdbId2DomainIdsRequestRecordType }
     *     
     */
    public PdbId2DomainIdsRequestRecordType getPdbId2DomainIdsRequestRecord() {
        return pdbId2DomainIdsRequestRecord;
    }

    /**
     * Sets the value of the pdbId2DomainIdsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdbId2DomainIdsRequestRecordType }
     *     
     */
    public void setPdbId2DomainIdsRequestRecord(PdbId2DomainIdsRequestRecordType value) {
        this.pdbId2DomainIdsRequestRecord = value;
    }

}
