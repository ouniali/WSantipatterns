
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element name="RepName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RepAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="75"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RepPAN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "repName",
    "repAddress",
    "repPAN"
})
@XmlRootElement(name = "AssesseeRep")
public class AssesseeRep {

    @XmlElement(name = "RepName", required = true)
    protected String repName;
    @XmlElement(name = "RepAddress", required = true)
    protected String repAddress;
    @XmlElement(name = "RepPAN")
    protected String repPAN;

    /**
     * Gets the value of the repName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepName() {
        return repName;
    }

    /**
     * Sets the value of the repName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepName(String value) {
        this.repName = value;
    }

    /**
     * Gets the value of the repAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepAddress() {
        return repAddress;
    }

    /**
     * Sets the value of the repAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepAddress(String value) {
        this.repAddress = value;
    }

    /**
     * Gets the value of the repPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepPAN() {
        return repPAN;
    }

    /**
     * Sets the value of the repPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepPAN(String value) {
        this.repPAN = value;
    }

}
