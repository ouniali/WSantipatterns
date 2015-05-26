
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation DomainId2UniprotIds (domain_id)
 *                     
 * 
 * <p>Java class for DomainId2UniprotIdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainId2UniprotIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomainId2UniprotIdsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}DomainId2UniprotIdsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainId2UniprotIdsType", propOrder = {
    "domainId2UniprotIdsRequestRecord"
})
public class DomainId2UniprotIdsType {

    @XmlElement(name = "DomainId2UniprotIdsRequestRecord", required = true)
    protected DomainId2UniprotIdsRequestRecordType domainId2UniprotIdsRequestRecord;

    /**
     * Gets the value of the domainId2UniprotIdsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link DomainId2UniprotIdsRequestRecordType }
     *     
     */
    public DomainId2UniprotIdsRequestRecordType getDomainId2UniprotIdsRequestRecord() {
        return domainId2UniprotIdsRequestRecord;
    }

    /**
     * Sets the value of the domainId2UniprotIdsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainId2UniprotIdsRequestRecordType }
     *     
     */
    public void setDomainId2UniprotIdsRequestRecord(DomainId2UniprotIdsRequestRecordType value) {
        this.domainId2UniprotIdsRequestRecord = value;
    }

}
