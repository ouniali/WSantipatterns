
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Type corresponding to the output data for the operation PdbId2DomainIds
 *                     
 * 
 * <p>Java class for PdbId2DomainIdsRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbId2DomainIdsRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdb_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PdbId2DomainIdsRecordType", propOrder = {
    "pdbCode",
    "domainId"
})
public class PdbId2DomainIdsRecordType {

    @XmlElement(name = "pdb_code", required = true, nillable = true)
    protected String pdbCode;
    @XmlElement(name = "domain_id", required = true, nillable = true)
    protected String domainId;

    /**
     * Gets the value of the pdbCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdbCode() {
        return pdbCode;
    }

    /**
     * Sets the value of the pdbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdbCode(String value) {
        this.pdbCode = value;
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
