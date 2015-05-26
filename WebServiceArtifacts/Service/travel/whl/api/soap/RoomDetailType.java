
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtraAdults" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtraChildren" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomDetailType", propOrder = {
    "name",
    "id",
    "quantity",
    "extraAdults",
    "extraChildren"
})
public class RoomDetailType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "ExtraAdults", required = true)
    protected String extraAdults;
    @XmlElement(name = "ExtraChildren", required = true)
    protected String extraChildren;

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

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the extraAdults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraAdults() {
        return extraAdults;
    }

    /**
     * Sets the value of the extraAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraAdults(String value) {
        this.extraAdults = value;
    }

    /**
     * Gets the value of the extraChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChildren() {
        return extraChildren;
    }

    /**
     * Sets the value of the extraChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChildren(String value) {
        this.extraChildren = value;
    }

}
