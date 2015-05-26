
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.TermAndConditionsRequest;


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
 *         &lt;element name="HotelId" type="{http://schemas.tourico.com/webservices/hotelv3}TermAndConditionsRequest" minOccurs="0"/>
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
    "hotelId"
})
@XmlRootElement(name = "GetTermAndConditions")
public class GetTermAndConditions {

    @XmlElement(name = "HotelId")
    protected TermAndConditionsRequest hotelId;

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link TermAndConditionsRequest }
     *     
     */
    public TermAndConditionsRequest getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermAndConditionsRequest }
     *     
     */
    public void setHotelId(TermAndConditionsRequest value) {
        this.hotelId = value;
    }

}
