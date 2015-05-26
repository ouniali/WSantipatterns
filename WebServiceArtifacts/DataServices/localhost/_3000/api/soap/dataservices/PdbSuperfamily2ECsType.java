
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation PdbSuperfamily2ECs (superfamily_id)
 *                     
 * 
 * <p>Java class for PdbSuperfamily2ECsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdbSuperfamily2ECsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PdbSuperfamily2ECsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}PdbSuperfamily2ECsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdbSuperfamily2ECsType", propOrder = {
    "pdbSuperfamily2ECsRequestRecord"
})
public class PdbSuperfamily2ECsType {

    @XmlElement(name = "PdbSuperfamily2ECsRequestRecord", required = true)
    protected PdbSuperfamily2ECsRequestRecordType pdbSuperfamily2ECsRequestRecord;

    /**
     * Gets the value of the pdbSuperfamily2ECsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PdbSuperfamily2ECsRequestRecordType }
     *     
     */
    public PdbSuperfamily2ECsRequestRecordType getPdbSuperfamily2ECsRequestRecord() {
        return pdbSuperfamily2ECsRequestRecord;
    }

    /**
     * Sets the value of the pdbSuperfamily2ECsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdbSuperfamily2ECsRequestRecordType }
     *     
     */
    public void setPdbSuperfamily2ECsRequestRecord(PdbSuperfamily2ECsRequestRecordType value) {
        this.pdbSuperfamily2ECsRequestRecord = value;
    }

}
