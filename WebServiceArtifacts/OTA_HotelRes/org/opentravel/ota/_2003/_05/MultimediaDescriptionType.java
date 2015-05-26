
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultimediaDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ImageItems" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfImageItemsTypeImageItem" minOccurs="0"/>
 *           &lt;element name="VideoItems" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVideoItemsTypeVideoItem" minOccurs="0"/>
 *           &lt;element name="TextItems" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfTextItemsTypeTextItem" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionType", propOrder = {
    "imageItems",
    "videoItems",
    "textItems"
})
public class MultimediaDescriptionType {

    @XmlElement(name = "ImageItems")
    protected ArrayOfImageItemsTypeImageItem imageItems;
    @XmlElement(name = "VideoItems")
    protected ArrayOfVideoItemsTypeVideoItem videoItems;
    @XmlElement(name = "TextItems")
    protected ArrayOfTextItemsTypeTextItem textItems;

    /**
     * Gets the value of the imageItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImageItemsTypeImageItem }
     *     
     */
    public ArrayOfImageItemsTypeImageItem getImageItems() {
        return imageItems;
    }

    /**
     * Sets the value of the imageItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImageItemsTypeImageItem }
     *     
     */
    public void setImageItems(ArrayOfImageItemsTypeImageItem value) {
        this.imageItems = value;
    }

    /**
     * Gets the value of the videoItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoItemsTypeVideoItem }
     *     
     */
    public ArrayOfVideoItemsTypeVideoItem getVideoItems() {
        return videoItems;
    }

    /**
     * Sets the value of the videoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoItemsTypeVideoItem }
     *     
     */
    public void setVideoItems(ArrayOfVideoItemsTypeVideoItem value) {
        this.videoItems = value;
    }

    /**
     * Gets the value of the textItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTextItemsTypeTextItem }
     *     
     */
    public ArrayOfTextItemsTypeTextItem getTextItems() {
        return textItems;
    }

    /**
     * Sets the value of the textItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTextItemsTypeTextItem }
     *     
     */
    public void setTextItems(ArrayOfTextItemsTypeTextItem value) {
        this.textItems = value;
    }

}
