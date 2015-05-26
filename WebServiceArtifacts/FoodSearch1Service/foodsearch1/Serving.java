
package foodsearch1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						The serving associated with a food.
 * 					
 * 
 * <p>Java class for Serving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Serving">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nutrients" type="{urn:FoodSearch1}Nutrients"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Serving", propOrder = {
    "name",
    "nutrients"
})
public class Serving {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Nutrients nutrients;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nutrients property.
     * 
     * @return
     *     possible object is
     *     {@link Nutrients }
     *     
     */
    public Nutrients getNutrients() {
        return nutrients;
    }

    /**
     * Sets the value of the nutrients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nutrients }
     *     
     */
    public void setNutrients(Nutrients value) {
        this.nutrients = value;
    }

}
