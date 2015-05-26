
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation ChainId2DomainIds (chain_id)
 *                     
 * 
 * <p>Java class for ChainId2DomainIdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChainId2DomainIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChainId2DomainIdsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}ChainId2DomainIdsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainId2DomainIdsType", propOrder = {
    "chainId2DomainIdsRequestRecord"
})
public class ChainId2DomainIdsType {

    @XmlElement(name = "ChainId2DomainIdsRequestRecord", required = true)
    protected ChainId2DomainIdsRequestRecordType chainId2DomainIdsRequestRecord;

    /**
     * Gets the value of the chainId2DomainIdsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ChainId2DomainIdsRequestRecordType }
     *     
     */
    public ChainId2DomainIdsRequestRecordType getChainId2DomainIdsRequestRecord() {
        return chainId2DomainIdsRequestRecord;
    }

    /**
     * Sets the value of the chainId2DomainIdsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChainId2DomainIdsRequestRecordType }
     *     
     */
    public void setChainId2DomainIdsRequestRecord(ChainId2DomainIdsRequestRecordType value) {
        this.chainId2DomainIdsRequestRecord = value;
    }

}
