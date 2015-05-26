
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="HotelIds" type="{http://tourico.com/webservices/hotelv3}ArrayOfHotelID" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://tourico.com/webservices/hotelv3}ArrayOfFeature" minOccurs="0"/>
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
    "hotelIds",
    "features"
})
@XmlRootElement(name = "GetHotelDetailsV3")
public class GetHotelDetailsV3 {

    @XmlElement(name = "HotelIds")
    protected ArrayOfHotelID hotelIds;
    @XmlElement(name = "Features")
    protected ArrayOfFeature features;

    /**
     * Gets the value of the hotelIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelID }
     *     
     */
    public ArrayOfHotelID getHotelIds() {
        return hotelIds;
    }

    /**
     * Sets the value of the hotelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelID }
     *     
     */
    public void setHotelIds(ArrayOfHotelID value) {
        this.hotelIds = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeature }
     *     
     */
    public ArrayOfFeature getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeature }
     *     
     */
    public void setFeatures(ArrayOfFeature value) {
        this.features = value;
    }

}
