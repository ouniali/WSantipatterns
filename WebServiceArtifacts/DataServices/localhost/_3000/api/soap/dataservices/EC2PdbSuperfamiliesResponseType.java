
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation EC2PdbSuperfamilies  (superfamily_id, domain_id, description, ec_code)
 *                     
 * 
 * <p>Java class for EC2PdbSuperfamiliesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EC2PdbSuperfamiliesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="EC2PdbSuperfamiliesRecord" type="{http://localhost:3000/api/soap/dataservices}EC2PdbSuperfamiliesRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EC2PdbSuperfamiliesResponseType", propOrder = {
    "ec2PdbSuperfamiliesRecord"
})
public class EC2PdbSuperfamiliesResponseType {

    @XmlElement(name = "EC2PdbSuperfamiliesRecord")
    protected List<EC2PdbSuperfamiliesRecordType> ec2PdbSuperfamiliesRecord;

    /**
     * Gets the value of the ec2PdbSuperfamiliesRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ec2PdbSuperfamiliesRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEC2PdbSuperfamiliesRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EC2PdbSuperfamiliesRecordType }
     * 
     * 
     */
    public List<EC2PdbSuperfamiliesRecordType> getEC2PdbSuperfamiliesRecord() {
        if (ec2PdbSuperfamiliesRecord == null) {
            ec2PdbSuperfamiliesRecord = new ArrayList<EC2PdbSuperfamiliesRecordType>();
        }
        return this.ec2PdbSuperfamiliesRecord;
    }

}
