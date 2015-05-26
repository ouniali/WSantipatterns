
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Error">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SubCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error", propOrder = {
    "code",
    "subCode"
})
public class Error {

    @XmlElement(name = "Code")
    protected short code;
    @XmlElement(name = "SubCode")
    protected short subCode;

    /**
     * Gets the value of the code property.
     * 
     */
    public short getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(short value) {
        this.code = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     */
    public short getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     */
    public void setSubCode(short value) {
        this.subCode = value;
    }

}
