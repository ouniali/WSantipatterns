
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes multimedia item(s).
 * 
 * <p>Java class for MultimediaDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="VideoItems" type="{http://api.whl.travel/soap}VideoItemsType" minOccurs="0"/>
 *         &lt;element name="ImageItems" type="{http://api.whl.travel/soap}ImageItemsType" minOccurs="0"/>
 *         &lt;element name="TextItems" type="{http://api.whl.travel/soap}TextItemsType" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ImageCategory" type="{http://api.whl.travel/soap}StringLength1to64" />
 *       &lt;attribute name="CollectionID" type="{http://api.whl.travel/soap}StringLength1to32" />
 *       &lt;attribute name="CollectionName" type="{http://api.whl.travel/soap}StringLength1to64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionType", propOrder = {
    "videoItems",
    "imageItems",
    "textItems"
})
public class MultimediaDescriptionType {

    @XmlElement(name = "VideoItems")
    protected VideoItemsType videoItems;
    @XmlElement(name = "ImageItems")
    protected ImageItemsType imageItems;
    @XmlElement(name = "TextItems")
    protected TextItemsType textItems;
    @XmlAttribute(name = "ImageCategory")
    protected String imageCategory;
    @XmlAttribute(name = "CollectionID")
    protected String collectionID;
    @XmlAttribute(name = "CollectionName")
    protected String collectionName;

    /**
     * Gets the value of the videoItems property.
     * 
     * @return
     *     possible object is
     *     {@link VideoItemsType }
     *     
     */
    public VideoItemsType getVideoItems() {
        return videoItems;
    }

    /**
     * Sets the value of the videoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoItemsType }
     *     
     */
    public void setVideoItems(VideoItemsType value) {
        this.videoItems = value;
    }

    /**
     * Gets the value of the imageItems property.
     * 
     * @return
     *     possible object is
     *     {@link ImageItemsType }
     *     
     */
    public ImageItemsType getImageItems() {
        return imageItems;
    }

    /**
     * Sets the value of the imageItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageItemsType }
     *     
     */
    public void setImageItems(ImageItemsType value) {
        this.imageItems = value;
    }

    /**
     * Gets the value of the textItems property.
     * 
     * @return
     *     possible object is
     *     {@link TextItemsType }
     *     
     */
    public TextItemsType getTextItems() {
        return textItems;
    }

    /**
     * Sets the value of the textItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextItemsType }
     *     
     */
    public void setTextItems(TextItemsType value) {
        this.textItems = value;
    }

    /**
     * Gets the value of the imageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageCategory() {
        return imageCategory;
    }

    /**
     * Sets the value of the imageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageCategory(String value) {
        this.imageCategory = value;
    }

    /**
     * Gets the value of the collectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionID() {
        return collectionID;
    }

    /**
     * Sets the value of the collectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionID(String value) {
        this.collectionID = value;
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

}
