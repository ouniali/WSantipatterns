
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskImageCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskImageCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Images" type="{https://NewHotel/Web/Services/}ArrayOfKioskImageResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskImageCollectionResponse", propOrder = {
    "images"
})
public class KioskImageCollectionResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "Images")
    protected ArrayOfKioskImageResponse images;

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskImageResponse }
     *     
     */
    public ArrayOfKioskImageResponse getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskImageResponse }
     *     
     */
    public void setImages(ArrayOfKioskImageResponse value) {
        this.images = value;
    }

}
