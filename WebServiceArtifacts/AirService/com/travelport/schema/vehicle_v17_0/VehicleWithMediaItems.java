
package com.travelport.schema.vehicle_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.MediaItem;
import com.travelport.schema.common_v15_0.TypeResultMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vehicle"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}MediaItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaResultMessage" type="{http://www.travelport.com/schema/common_v15_0}typeResultMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicle",
    "mediaItem",
    "mediaResultMessage"
})
@XmlRootElement(name = "VehicleWithMediaItems")
public class VehicleWithMediaItems {

    @XmlElement(name = "Vehicle", required = true)
    protected Vehicle vehicle;
    @XmlElement(name = "MediaItem", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<MediaItem> mediaItem;
    @XmlElement(name = "MediaResultMessage")
    protected List<TypeResultMessage> mediaResultMessage;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Photos and other media urls for the item referenced above.Gets the value of the mediaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaItem }
     * 
     * 
     */
    public List<MediaItem> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<MediaItem>();
        }
        return this.mediaItem;
    }

    /**
     * Gets the value of the mediaResultMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaResultMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaResultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * 
     * 
     */
    public List<TypeResultMessage> getMediaResultMessage() {
        if (mediaResultMessage == null) {
            mediaResultMessage = new ArrayList<TypeResultMessage>();
        }
        return this.mediaResultMessage;
    }

}
