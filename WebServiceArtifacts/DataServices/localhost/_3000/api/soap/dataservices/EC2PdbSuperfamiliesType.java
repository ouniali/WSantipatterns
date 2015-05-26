
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation EC2PdbSuperfamilies (ec_code)
 *                     
 * 
 * <p>Java class for EC2PdbSuperfamiliesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EC2PdbSuperfamiliesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EC2PdbSuperfamiliesRequestRecord" type="{http://localhost:3000/api/soap/dataservices}EC2PdbSuperfamiliesRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EC2PdbSuperfamiliesType", propOrder = {
    "ec2PdbSuperfamiliesRequestRecord"
})
public class EC2PdbSuperfamiliesType {

    @XmlElement(name = "EC2PdbSuperfamiliesRequestRecord", required = true)
    protected EC2PdbSuperfamiliesRequestRecordType ec2PdbSuperfamiliesRequestRecord;

    /**
     * Gets the value of the ec2PdbSuperfamiliesRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link EC2PdbSuperfamiliesRequestRecordType }
     *     
     */
    public EC2PdbSuperfamiliesRequestRecordType getEC2PdbSuperfamiliesRequestRecord() {
        return ec2PdbSuperfamiliesRequestRecord;
    }

    /**
     * Sets the value of the ec2PdbSuperfamiliesRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link EC2PdbSuperfamiliesRequestRecordType }
     *     
     */
    public void setEC2PdbSuperfamiliesRequestRecord(EC2PdbSuperfamiliesRequestRecordType value) {
        this.ec2PdbSuperfamiliesRequestRecord = value;
    }

}
