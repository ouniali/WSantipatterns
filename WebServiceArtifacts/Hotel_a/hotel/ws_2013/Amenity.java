
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amenity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Amenity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmenityPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmenityES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmenityEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amenity", propOrder = {
    "amenityPT",
    "amenityES",
    "amenityEN"
})
public class Amenity {

    @XmlElement(name = "AmenityPT")
    protected String amenityPT;
    @XmlElement(name = "AmenityES")
    protected String amenityES;
    @XmlElement(name = "AmenityEN")
    protected String amenityEN;

    /**
     * Gets the value of the amenityPT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityPT() {
        return amenityPT;
    }

    /**
     * Sets the value of the amenityPT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityPT(String value) {
        this.amenityPT = value;
    }

    /**
     * Gets the value of the amenityES property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityES() {
        return amenityES;
    }

    /**
     * Sets the value of the amenityES property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityES(String value) {
        this.amenityES = value;
    }

    /**
     * Gets the value of the amenityEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityEN() {
        return amenityEN;
    }

    /**
     * Sets the value of the amenityEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityEN(String value) {
        this.amenityEN = value;
    }

}
