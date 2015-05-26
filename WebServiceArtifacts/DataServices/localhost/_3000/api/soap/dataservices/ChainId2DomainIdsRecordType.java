
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Type corresponding to the output data for the operation ChainId2DomainIds
 *                     
 * 
 * <p>Java class for ChainId2DomainIdsRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChainId2DomainIdsRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chain_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domain_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainId2DomainIdsRecordType", propOrder = {
    "chainId",
    "domainId"
})
public class ChainId2DomainIdsRecordType {

    @XmlElement(name = "chain_id", required = true, nillable = true)
    protected String chainId;
    @XmlElement(name = "domain_id", required = true, nillable = true)
    protected String domainId;

    /**
     * Gets the value of the chainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainId() {
        return chainId;
    }

    /**
     * Sets the value of the chainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainId(String value) {
        this.chainId = value;
    }

    /**
     * Gets the value of the domainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Sets the value of the domainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

}
