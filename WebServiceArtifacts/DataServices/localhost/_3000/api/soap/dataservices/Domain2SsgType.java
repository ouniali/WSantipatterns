
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation Domain2Ssg (domain_id)
 *                     
 * 
 * <p>Java class for Domain2SsgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Domain2SsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domain2SsgRequestRecord" type="{http://localhost:3000/api/soap/dataservices}Domain2SsgRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Domain2SsgType", propOrder = {
    "domain2SsgRequestRecord"
})
public class Domain2SsgType {

    @XmlElement(name = "Domain2SsgRequestRecord", required = true)
    protected Domain2SsgRequestRecordType domain2SsgRequestRecord;

    /**
     * Gets the value of the domain2SsgRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Domain2SsgRequestRecordType }
     *     
     */
    public Domain2SsgRequestRecordType getDomain2SsgRequestRecord() {
        return domain2SsgRequestRecord;
    }

    /**
     * Sets the value of the domain2SsgRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Domain2SsgRequestRecordType }
     *     
     */
    public void setDomain2SsgRequestRecord(Domain2SsgRequestRecordType value) {
        this.domain2SsgRequestRecord = value;
    }

}
