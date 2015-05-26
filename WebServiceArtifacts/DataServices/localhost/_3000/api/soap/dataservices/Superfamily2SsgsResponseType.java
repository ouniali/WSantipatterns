
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation Superfamily2Ssgs  (ssg_number, superfamily_id)
 *                     
 * 
 * <p>Java class for Superfamily2SsgsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Superfamily2SsgsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Superfamily2SsgsRecord" type="{http://localhost:3000/api/soap/dataservices}Superfamily2SsgsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Superfamily2SsgsResponseType", propOrder = {
    "superfamily2SsgsRecord"
})
public class Superfamily2SsgsResponseType {

    @XmlElement(name = "Superfamily2SsgsRecord")
    protected List<Superfamily2SsgsRecordType> superfamily2SsgsRecord;

    /**
     * Gets the value of the superfamily2SsgsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superfamily2SsgsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperfamily2SsgsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Superfamily2SsgsRecordType }
     * 
     * 
     */
    public List<Superfamily2SsgsRecordType> getSuperfamily2SsgsRecord() {
        if (superfamily2SsgsRecord == null) {
            superfamily2SsgsRecord = new ArrayList<Superfamily2SsgsRecordType>();
        }
        return this.superfamily2SsgsRecord;
    }

}
