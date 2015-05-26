
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation UniProtId2DomainIds (uniprot_acc)
 *                     
 * 
 * <p>Java class for UniProtId2DomainIdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniProtId2DomainIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniProtId2DomainIdsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}UniProtId2DomainIdsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniProtId2DomainIdsType", propOrder = {
    "uniProtId2DomainIdsRequestRecord"
})
public class UniProtId2DomainIdsType {

    @XmlElement(name = "UniProtId2DomainIdsRequestRecord", required = true)
    protected UniProtId2DomainIdsRequestRecordType uniProtId2DomainIdsRequestRecord;

    /**
     * Gets the value of the uniProtId2DomainIdsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UniProtId2DomainIdsRequestRecordType }
     *     
     */
    public UniProtId2DomainIdsRequestRecordType getUniProtId2DomainIdsRequestRecord() {
        return uniProtId2DomainIdsRequestRecord;
    }

    /**
     * Sets the value of the uniProtId2DomainIdsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniProtId2DomainIdsRequestRecordType }
     *     
     */
    public void setUniProtId2DomainIdsRequestRecord(UniProtId2DomainIdsRequestRecordType value) {
        this.uniProtId2DomainIdsRequestRecord = value;
    }

}
