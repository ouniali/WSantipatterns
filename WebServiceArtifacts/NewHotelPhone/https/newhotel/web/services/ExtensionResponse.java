
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{https://NewHotel/Web/Services/}ExtensionType"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionPrice" type="{https://NewHotel/Web/Services/}PhonePrice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionResponse", propOrder = {
    "extensionId",
    "description",
    "type",
    "room",
    "group",
    "currentAccountId",
    "extensionPrice"
})
public class ExtensionResponse {

    @XmlElement(name = "ExtensionId")
    protected String extensionId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ExtensionType type;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "CurrentAccountId")
    protected String currentAccountId;
    @XmlElement(name = "ExtensionPrice", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PhonePrice extensionPrice;

    /**
     * Gets the value of the extensionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionId() {
        return extensionId;
    }

    /**
     * Sets the value of the extensionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionId(String value) {
        this.extensionId = value;
    }

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setType(ExtensionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the currentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAccountId() {
        return currentAccountId;
    }

    /**
     * Sets the value of the currentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAccountId(String value) {
        this.currentAccountId = value;
    }

    /**
     * Gets the value of the extensionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PhonePrice }
     *     
     */
    public PhonePrice getExtensionPrice() {
        return extensionPrice;
    }

    /**
     * Sets the value of the extensionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhonePrice }
     *     
     */
    public void setExtensionPrice(PhonePrice value) {
        this.extensionPrice = value;
    }

}
