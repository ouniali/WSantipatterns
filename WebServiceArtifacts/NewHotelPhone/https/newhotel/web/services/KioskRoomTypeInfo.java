
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskRoomTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskRoomTypeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypeId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="RoomTypeAbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinPersons" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="MaxPersons" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskRoomTypeInfo", propOrder = {
    "roomTypeId",
    "roomTypeAbreviation",
    "roomTypeDescription",
    "roomTypeComments",
    "minPersons",
    "maxPersons",
    "imageId",
    "image"
})
public class KioskRoomTypeInfo {

    @XmlElement(name = "RoomTypeId", required = true)
    protected String roomTypeId;
    @XmlElement(name = "RoomTypeAbreviation")
    protected String roomTypeAbreviation;
    @XmlElement(name = "RoomTypeDescription")
    protected String roomTypeDescription;
    @XmlElement(name = "RoomTypeComments")
    protected String roomTypeComments;
    @XmlElement(name = "MinPersons")
    protected short minPersons;
    @XmlElement(name = "MaxPersons")
    protected short maxPersons;
    @XmlElement(name = "ImageId")
    protected String imageId;
    @XmlElement(name = "Image")
    protected String image;

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the roomTypeAbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeAbreviation() {
        return roomTypeAbreviation;
    }

    /**
     * Sets the value of the roomTypeAbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeAbreviation(String value) {
        this.roomTypeAbreviation = value;
    }

    /**
     * Gets the value of the roomTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    /**
     * Sets the value of the roomTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeDescription(String value) {
        this.roomTypeDescription = value;
    }

    /**
     * Gets the value of the roomTypeComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeComments() {
        return roomTypeComments;
    }

    /**
     * Sets the value of the roomTypeComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeComments(String value) {
        this.roomTypeComments = value;
    }

    /**
     * Gets the value of the minPersons property.
     * 
     */
    public short getMinPersons() {
        return minPersons;
    }

    /**
     * Sets the value of the minPersons property.
     * 
     */
    public void setMinPersons(short value) {
        this.minPersons = value;
    }

    /**
     * Gets the value of the maxPersons property.
     * 
     */
    public short getMaxPersons() {
        return maxPersons;
    }

    /**
     * Sets the value of the maxPersons property.
     * 
     */
    public void setMaxPersons(short value) {
        this.maxPersons = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

}
