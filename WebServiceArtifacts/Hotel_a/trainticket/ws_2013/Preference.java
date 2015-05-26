
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Preference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Options" type="{WS_2013.TrainTicket}ArrayOfOptionPreference" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preference", propOrder = {
    "description",
    "isRequired",
    "options",
    "type"
})
public class Preference {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsRequired")
    protected boolean isRequired;
    @XmlElement(name = "Options")
    protected ArrayOfOptionPreference options;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOptionPreference }
     *     
     */
    public ArrayOfOptionPreference getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOptionPreference }
     *     
     */
    public void setOptions(ArrayOfOptionPreference value) {
        this.options = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
