
package org.opentravel.ota._2003._05;

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
 *         &lt;element name="OTA_HotelResRS" type="{http://www.opentravel.org/OTA/2003/05}OTA_HotelResRS" minOccurs="0"/>
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
    "otaHotelResRS"
})
@XmlRootElement(name = "OTA_HotelResV2ServiceResponse")
public class OTAHotelResV2ServiceResponse {

    @XmlElement(name = "OTA_HotelResRS")
    protected OTAHotelResRS otaHotelResRS;

    /**
     * Gets the value of the otaHotelResRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelResRS }
     *     
     */
    public OTAHotelResRS getOTAHotelResRS() {
        return otaHotelResRS;
    }

    /**
     * Sets the value of the otaHotelResRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRS }
     *     
     */
    public void setOTAHotelResRS(OTAHotelResRS value) {
        this.otaHotelResRS = value;
    }

}
