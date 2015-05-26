
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Type corresponding to the output data for the operation UniProtId2DomainIds
 *                     
 * 
 * <p>Java class for UniProtId2DomainIdsRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniProtId2DomainIdsRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="species_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="superfamily_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domain_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gene_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uniprot_acc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniProtId2DomainIdsRecordType", propOrder = {
    "speciesName",
    "superfamilyId",
    "domainId",
    "description",
    "geneName",
    "uniprotAcc"
})
public class UniProtId2DomainIdsRecordType {

    @XmlElement(name = "species_name", required = true, nillable = true)
    protected String speciesName;
    @XmlElement(name = "superfamily_id", required = true, nillable = true)
    protected String superfamilyId;
    @XmlElement(name = "domain_id", required = true, nillable = true)
    protected String domainId;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(name = "gene_name", required = true, nillable = true)
    protected String geneName;
    @XmlElement(name = "uniprot_acc", required = true, nillable = true)
    protected String uniprotAcc;

    /**
     * Gets the value of the speciesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesName() {
        return speciesName;
    }

    /**
     * Sets the value of the speciesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesName(String value) {
        this.speciesName = value;
    }

    /**
     * Gets the value of the superfamilyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperfamilyId() {
        return superfamilyId;
    }

    /**
     * Sets the value of the superfamilyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperfamilyId(String value) {
        this.superfamilyId = value;
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the geneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneName() {
        return geneName;
    }

    /**
     * Sets the value of the geneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneName(String value) {
        this.geneName = value;
    }

    /**
     * Gets the value of the uniprotAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniprotAcc() {
        return uniprotAcc;
    }

    /**
     * Sets the value of the uniprotAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniprotAcc(String value) {
        this.uniprotAcc = value;
    }

}
