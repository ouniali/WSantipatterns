
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getHotelListbyCityResult" type="{http://ws_2013.services.cangooroo.net/}ArrayOfHotelListbyCity" minOccurs="0"/>
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
    "getHotelListbyCityResult"
})
@XmlRootElement(name = "getHotelListbyCityResponse")
public class GetHotelListbyCityResponse {

    protected ArrayOfHotelListbyCity getHotelListbyCityResult;

    /**
     * Gets the value of the getHotelListbyCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelListbyCity }
     *     
     */
    public ArrayOfHotelListbyCity getGetHotelListbyCityResult() {
        return getHotelListbyCityResult;
    }

    /**
     * Sets the value of the getHotelListbyCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelListbyCity }
     *     
     */
    public void setGetHotelListbyCityResult(ArrayOfHotelListbyCity value) {
        this.getHotelListbyCityResult = value;
    }

}
