
package foodsearch1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 							Represents the inputs to supply to the getFood
 * 							web method.
 * 						
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devkey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "devkey",
    "id"
})
@XmlRootElement(name = "getFood")
public class GetFood {

    @XmlElement(required = true)
    protected String devkey;
    @XmlElement(required = true)
    protected String id;

    /**
     * Gets the value of the devkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevkey() {
        return devkey;
    }

    /**
     * Sets the value of the devkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevkey(String value) {
        this.devkey = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
