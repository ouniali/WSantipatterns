
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Request type for the operation Superfamily2Ssgs (superfamily_id)
 *                     
 * 
 * <p>Java class for Superfamily2SsgsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Superfamily2SsgsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Superfamily2SsgsRequestRecord" type="{http://localhost:3000/api/soap/dataservices}Superfamily2SsgsRequestRecordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Superfamily2SsgsType", propOrder = {
    "superfamily2SsgsRequestRecord"
})
public class Superfamily2SsgsType {

    @XmlElement(name = "Superfamily2SsgsRequestRecord", required = true)
    protected Superfamily2SsgsRequestRecordType superfamily2SsgsRequestRecord;

    /**
     * Gets the value of the superfamily2SsgsRequestRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Superfamily2SsgsRequestRecordType }
     *     
     */
    public Superfamily2SsgsRequestRecordType getSuperfamily2SsgsRequestRecord() {
        return superfamily2SsgsRequestRecord;
    }

    /**
     * Sets the value of the superfamily2SsgsRequestRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Superfamily2SsgsRequestRecordType }
     *     
     */
    public void setSuperfamily2SsgsRequestRecord(Superfamily2SsgsRequestRecordType value) {
        this.superfamily2SsgsRequestRecord = value;
    }

}
