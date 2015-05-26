
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation PdbSuperfamily2ECs  (superfamily_id, domain_id, ec_code)
 *                     
 * 
 * <p>Java class for PdbSuperfamily2ECsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbSuperfamily2ECsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PdbSuperfamily2ECsRecord" type="{http://localhost:3000/api/soap/dataservices}PdbSuperfamily2ECsRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdbSuperfamily2ECsResponseType", propOrder = {
    "pdbSuperfamily2ECsRecord"
})
public class PdbSuperfamily2ECsResponseType {

    @XmlElement(name = "PdbSuperfamily2ECsRecord")
    protected List<PdbSuperfamily2ECsRecordType> pdbSuperfamily2ECsRecord;

    /**
     * Gets the value of the pdbSuperfamily2ECsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbSuperfamily2ECsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbSuperfamily2ECsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbSuperfamily2ECsRecordType }
     * 
     * 
     */
    public List<PdbSuperfamily2ECsRecordType> getPdbSuperfamily2ECsRecord() {
        if (pdbSuperfamily2ECsRecord == null) {
            pdbSuperfamily2ECsRecord = new ArrayList<PdbSuperfamily2ECsRecordType>();
        }
        return this.pdbSuperfamily2ECsRecord;
    }

}
