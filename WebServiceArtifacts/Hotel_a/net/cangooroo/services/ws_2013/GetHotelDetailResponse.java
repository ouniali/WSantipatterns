
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
 *         &lt;element name="getHotelDetailResult" type="{http://ws_2013.services.cangooroo.net/}ArrayOfHotelDetail" minOccurs="0"/>
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
    "getHotelDetailResult"
})
@XmlRootElement(name = "getHotelDetailResponse")
public class GetHotelDetailResponse {

    protected ArrayOfHotelDetail getHotelDetailResult;

    /**
     * Gets the value of the getHotelDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDetail }
     *     
     */
    public ArrayOfHotelDetail getGetHotelDetailResult() {
        return getHotelDetailResult;
    }

    /**
     * Sets the value of the getHotelDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDetail }
     *     
     */
    public void setGetHotelDetailResult(ArrayOfHotelDetail value) {
        this.getHotelDetailResult = value;
    }

}
