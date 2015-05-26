
package foodsearch1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						The nutrients associated with a serving.
 * 					
 * 
 * <p>Java class for Nutrients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nutrients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="carbohydrate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="protein" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fiber" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sugar" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sodium" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="calcium" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="satfat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cholesterol" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nutrients", propOrder = {
    "calories",
    "fat",
    "carbohydrate",
    "protein",
    "fiber",
    "sugar",
    "sodium",
    "calcium",
    "satfat",
    "cholesterol"
})
public class Nutrients {

    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float calories;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float fat;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float carbohydrate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float protein;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float fiber;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float sugar;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float sodium;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float calcium;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float satfat;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float cholesterol;

    /**
     * Gets the value of the calories property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCalories(Float value) {
        this.calories = value;
    }

    /**
     * Gets the value of the fat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFat() {
        return fat;
    }

    /**
     * Sets the value of the fat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFat(Float value) {
        this.fat = value;
    }

    /**
     * Gets the value of the carbohydrate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCarbohydrate() {
        return carbohydrate;
    }

    /**
     * Sets the value of the carbohydrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCarbohydrate(Float value) {
        this.carbohydrate = value;
    }

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProtein(Float value) {
        this.protein = value;
    }

    /**
     * Gets the value of the fiber property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFiber() {
        return fiber;
    }

    /**
     * Sets the value of the fiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFiber(Float value) {
        this.fiber = value;
    }

    /**
     * Gets the value of the sugar property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSugar() {
        return sugar;
    }

    /**
     * Sets the value of the sugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSugar(Float value) {
        this.sugar = value;
    }

    /**
     * Gets the value of the sodium property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSodium() {
        return sodium;
    }

    /**
     * Sets the value of the sodium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSodium(Float value) {
        this.sodium = value;
    }

    /**
     * Gets the value of the calcium property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCalcium() {
        return calcium;
    }

    /**
     * Sets the value of the calcium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCalcium(Float value) {
        this.calcium = value;
    }

    /**
     * Gets the value of the satfat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSatfat() {
        return satfat;
    }

    /**
     * Sets the value of the satfat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSatfat(Float value) {
        this.satfat = value;
    }

    /**
     * Gets the value of the cholesterol property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCholesterol() {
        return cholesterol;
    }

    /**
     * Sets the value of the cholesterol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCholesterol(Float value) {
        this.cholesterol = value;
    }

}
