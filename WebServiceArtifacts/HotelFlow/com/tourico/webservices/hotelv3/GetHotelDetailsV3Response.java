
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="GetHotelDetailsV3Result" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any namespace='http://tempuri.org/TWS_HotelDetailsV3.xsd'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "getHotelDetailsV3Result"
})
@XmlRootElement(name = "GetHotelDetailsV3Response")
public class GetHotelDetailsV3Response {

    @XmlElement(name = "GetHotelDetailsV3Result")
    protected GetHotelDetailsV3Response.GetHotelDetailsV3Result getHotelDetailsV3Result;

    /**
     * Gets the value of the getHotelDetailsV3Result property.
     * 
     * @return
     *     possible object is
     *     {@link GetHotelDetailsV3Response.GetHotelDetailsV3Result }
     *     
     */
    public GetHotelDetailsV3Response.GetHotelDetailsV3Result getGetHotelDetailsV3Result() {
        return getHotelDetailsV3Result;
    }

    /**
     * Sets the value of the getHotelDetailsV3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelDetailsV3Response.GetHotelDetailsV3Result }
     *     
     */
    public void setGetHotelDetailsV3Result(GetHotelDetailsV3Response.GetHotelDetailsV3Result value) {
        this.getHotelDetailsV3Result = value;
    }


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
     *         &lt;any namespace='http://tempuri.org/TWS_HotelDetailsV3.xsd'/>
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
        "any"
    })
    public static class GetHotelDetailsV3Result {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
