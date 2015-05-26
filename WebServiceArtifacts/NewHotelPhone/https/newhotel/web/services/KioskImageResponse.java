
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskImageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ImageData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskImageResponse", propOrder = {
    "imageId",
    "imageHash",
    "imageSize",
    "imageData"
})
public class KioskImageResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "ImageId")
    protected String imageId;
    @XmlElement(name = "ImageHash")
    protected String imageHash;
    @XmlElement(name = "ImageSize")
    protected long imageSize;
    @XmlElement(name = "ImageData")
    protected String imageData;

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
     * Gets the value of the imageHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHash() {
        return imageHash;
    }

    /**
     * Sets the value of the imageHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHash(String value) {
        this.imageHash = value;
    }

    /**
     * Gets the value of the imageSize property.
     * 
     */
    public long getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     */
    public void setImageSize(long value) {
        this.imageSize = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageData(String value) {
        this.imageData = value;
    }

}
