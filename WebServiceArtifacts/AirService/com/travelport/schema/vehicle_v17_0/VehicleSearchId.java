
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="MediaLinksSearchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleSearchId")
public class VehicleSearchId {

    @XmlAttribute(name = "MediaLinksSearchId", required = true)
    protected String mediaLinksSearchId;

    /**
     * Gets the value of the mediaLinksSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaLinksSearchId() {
        return mediaLinksSearchId;
    }

    /**
     * Sets the value of the mediaLinksSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaLinksSearchId(String value) {
        this.mediaLinksSearchId = value;
    }

}
