
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Type corresponding to the output data for the operation Domain2Ssg
 *                     
 * 
 * <p>Java class for Domain2SsgRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Domain2SsgRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssg_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="superfamily_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Domain2SsgRecordType", propOrder = {
    "ssgNumber",
    "superfamilyId",
    "domainId"
})
public class Domain2SsgRecordType {

    @XmlElement(name = "ssg_number", required = true, nillable = true)
    protected String ssgNumber;
    @XmlElement(name = "superfamily_id", required = true, nillable = true)
    protected String superfamilyId;
    @XmlElement(name = "domain_id", required = true, nillable = true)
    protected String domainId;

    /**
     * Gets the value of the ssgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsgNumber() {
        return ssgNumber;
    }

    /**
     * Sets the value of the ssgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsgNumber(String value) {
        this.ssgNumber = value;
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

}
