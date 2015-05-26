
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation Ssg2Domains  (ssg_number, domain_id, superfamily_id)
 *                     
 * 
 * <p>Java class for Ssg2DomainsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ssg2DomainsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Ssg2DomainsRecord" type="{http://localhost:3000/api/soap/dataservices}Ssg2DomainsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ssg2DomainsResponseType", propOrder = {
    "ssg2DomainsRecord"
})
public class Ssg2DomainsResponseType {

    @XmlElement(name = "Ssg2DomainsRecord")
    protected List<Ssg2DomainsRecordType> ssg2DomainsRecord;

    /**
     * Gets the value of the ssg2DomainsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssg2DomainsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsg2DomainsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ssg2DomainsRecordType }
     * 
     * 
     */
    public List<Ssg2DomainsRecordType> getSsg2DomainsRecord() {
        if (ssg2DomainsRecord == null) {
            ssg2DomainsRecord = new ArrayList<Ssg2DomainsRecordType>();
        }
        return this.ssg2DomainsRecord;
    }

}
