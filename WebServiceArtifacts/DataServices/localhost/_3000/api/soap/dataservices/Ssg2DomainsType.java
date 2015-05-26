
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation Ssg2Domains (ssg_number, superfamily_id)
 *                     
 * 
 * <p>Java class for Ssg2DomainsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ssg2DomainsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ssg2DomainsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}Ssg2DomainsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ssg2DomainsType", propOrder = {
    "ssg2DomainsRequestRecord"
})
public class Ssg2DomainsType {

    @XmlElement(name = "Ssg2DomainsRequestRecord", required = true)
    protected Ssg2DomainsRequestRecordType ssg2DomainsRequestRecord;

    /**
     * Gets the value of the ssg2DomainsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Ssg2DomainsRequestRecordType }
     *     
     */
    public Ssg2DomainsRequestRecordType getSsg2DomainsRequestRecord() {
        return ssg2DomainsRequestRecord;
    }

    /**
     * Sets the value of the ssg2DomainsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ssg2DomainsRequestRecordType }
     *     
     */
    public void setSsg2DomainsRequestRecord(Ssg2DomainsRequestRecordType value) {
        this.ssg2DomainsRequestRecord = value;
    }

}
