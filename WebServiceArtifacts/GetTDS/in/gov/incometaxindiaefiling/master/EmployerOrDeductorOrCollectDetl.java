
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
 *         &lt;element name="TAN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z]\d\d\d\d\d[A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmployerOrDeductorOrCollecterName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *               &lt;minLength value="1"/>
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
    "tan",
    "employerOrDeductorOrCollecterName"
})
@XmlRootElement(name = "EmployerOrDeductorOrCollectDetl")
public class EmployerOrDeductorOrCollectDetl {

    @XmlElement(name = "TAN", required = true)
    protected String tan;
    @XmlElement(name = "EmployerOrDeductorOrCollecterName", required = true)
    protected String employerOrDeductorOrCollecterName;

    /**
     * Gets the value of the tan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAN() {
        return tan;
    }

    /**
     * Sets the value of the tan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAN(String value) {
        this.tan = value;
    }

    /**
     * Gets the value of the employerOrDeductorOrCollecterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerOrDeductorOrCollecterName() {
        return employerOrDeductorOrCollecterName;
    }

    /**
     * Sets the value of the employerOrDeductorOrCollecterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerOrDeductorOrCollecterName(String value) {
        this.employerOrDeductorOrCollecterName = value;
    }

}
