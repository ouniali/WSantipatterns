
package cpdbns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fsetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fsetType",
    "accType"
})
@XmlRootElement(name = "getDefaultBackgroundSize")
public class GetDefaultBackgroundSize {

    @XmlElement(required = true)
    protected String fsetType;
    @XmlElement(required = true)
    protected String accType;

    /**
     * Gets the value of the fsetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsetType() {
        return fsetType;
    }

    /**
     * Sets the value of the fsetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsetType(String value) {
        this.fsetType = value;
    }

    /**
     * Gets the value of the accType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccType() {
        return accType;
    }

    /**
     * Sets the value of the accType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccType(String value) {
        this.accType = value;
    }

}
