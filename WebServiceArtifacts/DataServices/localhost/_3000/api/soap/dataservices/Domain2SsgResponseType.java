
package localhost._3000.api.soap.dataservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Response type for the operation Domain2Ssg  (ssg_number, superfamily_id, domain_id)
 *                     
 * 
 * <p>Java class for Domain2SsgResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Domain2SsgResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Domain2SsgRecord" type="{http://localhost:3000/api/soap/dataservices}Domain2SsgRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Domain2SsgResponseType", propOrder = {
    "domain2SsgRecord"
})
public class Domain2SsgResponseType {

    @XmlElement(name = "Domain2SsgRecord")
    protected List<Domain2SsgRecordType> domain2SsgRecord;

    /**
     * Gets the value of the domain2SsgRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domain2SsgRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomain2SsgRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Domain2SsgRecordType }
     * 
     * 
     */
    public List<Domain2SsgRecordType> getDomain2SsgRecord() {
        if (domain2SsgRecord == null) {
            domain2SsgRecord = new ArrayList<Domain2SsgRecordType>();
        }
        return this.domain2SsgRecord;
    }

}
