
package foodsearch1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 							Represents the outputs from the getFood web 
 * 							method.
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
 *         &lt;element name="food" type="{urn:FoodSearch1}Food"/>
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
    "food"
})
@XmlRootElement(name = "getFoodResponse")
public class GetFoodResponse {

    @XmlElement(required = true)
    protected Food food;

    /**
     * Gets the value of the food property.
     * 
     * @return
     *     possible object is
     *     {@link Food }
     *     
     */
    public Food getFood() {
        return food;
    }

    /**
     * Sets the value of the food property.
     * 
     * @param value
     *     allowed object is
     *     {@link Food }
     *     
     */
    public void setFood(Food value) {
        this.food = value;
    }

}
