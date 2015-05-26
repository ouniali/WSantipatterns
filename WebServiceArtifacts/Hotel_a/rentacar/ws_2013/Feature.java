
package rentacar.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnglishDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpanishDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortugueseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feature", propOrder = {
    "englishDescription",
    "spanishDescription",
    "portugueseDescription",
    "name"
})
public class Feature {

    @XmlElement(name = "EnglishDescription")
    protected String englishDescription;
    @XmlElement(name = "SpanishDescription")
    protected String spanishDescription;
    @XmlElement(name = "PortugueseDescription")
    protected String portugueseDescription;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the englishDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishDescription() {
        return englishDescription;
    }

    /**
     * Sets the value of the englishDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishDescription(String value) {
        this.englishDescription = value;
    }

    /**
     * Gets the value of the spanishDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanishDescription() {
        return spanishDescription;
    }

    /**
     * Sets the value of the spanishDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanishDescription(String value) {
        this.spanishDescription = value;
    }

    /**
     * Gets the value of the portugueseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortugueseDescription() {
        return portugueseDescription;
    }

    /**
     * Sets the value of the portugueseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortugueseDescription(String value) {
        this.portugueseDescription = value;
    }

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

}
