
package defaultnamespace;

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
 *         &lt;element name="equation" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "equation"
})
@XmlRootElement(name = "solve")
public class Solve {

    @XmlElement(required = true, nillable = true)
    protected String equation;

    /**
     * Gets the value of the equation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquation() {
        return equation;
    }

    /**
     * Sets the value of the equation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquation(String value) {
        this.equation = value;
    }

}
