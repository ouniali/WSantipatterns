
package com.travelport.schema.hotel_v17_0;

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
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/hotel_v17_0}typeBedding" />
 *       &lt;attribute name="NumberOfBeds" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HotelBedding")
public class HotelBedding {

    @XmlAttribute(name = "Type", required = true)
    protected TypeBedding type;
    @XmlAttribute(name = "NumberOfBeds")
    protected Integer numberOfBeds;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBedding }
     *     
     */
    public TypeBedding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBedding }
     *     
     */
    public void setType(TypeBedding value) {
        this.type = value;
    }

    /**
     * Gets the value of the numberOfBeds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Sets the value of the numberOfBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBeds(Integer value) {
        this.numberOfBeds = value;
    }

}
