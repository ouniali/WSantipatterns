
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.RGInfoResults;


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
 *         &lt;element name="GetRGInfoResult" type="{http://schemas.tourico.com/webservices/hotelv3}RGInfoResults" minOccurs="0"/>
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
    "getRGInfoResult"
})
@XmlRootElement(name = "GetRGInfoResponse")
public class GetRGInfoResponse {

    @XmlElement(name = "GetRGInfoResult")
    protected RGInfoResults getRGInfoResult;

    /**
     * Gets the value of the getRGInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link RGInfoResults }
     *     
     */
    public RGInfoResults getGetRGInfoResult() {
        return getRGInfoResult;
    }

    /**
     * Sets the value of the getRGInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGInfoResults }
     *     
     */
    public void setGetRGInfoResult(RGInfoResults value) {
        this.getRGInfoResult = value;
    }

}
