
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Type corresponding to the input data for the operation EC2PdbSuperfamilies
 *                     
 * 
 * <p>Java class for EC2PdbSuperfamiliesRequestRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EC2PdbSuperfamiliesRequestRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ec_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EC2PdbSuperfamiliesRequestRecordType", propOrder = {
    "ecCode"
})
public class EC2PdbSuperfamiliesRequestRecordType {

    @XmlElement(name = "ec_code", required = true)
    protected String ecCode;

    /**
     * Gets the value of the ecCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcCode() {
        return ecCode;
    }

    /**
     * Sets the value of the ecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcCode(String value) {
        this.ecCode = value;
    }

}
