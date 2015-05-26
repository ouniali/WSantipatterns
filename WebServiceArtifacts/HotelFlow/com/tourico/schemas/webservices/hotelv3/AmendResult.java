
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.BookInfo;


/**
 * <p>Java class for AmendResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{http://schemas.tourico.com/webservices}BookInfo" minOccurs="0"/>
 *         &lt;element name="AmendInfo" type="{http://schemas.tourico.com/webservices/hotelv3}AmendInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendResult", propOrder = {
    "info",
    "amendInfo"
})
public class AmendResult {

    @XmlElement(name = "Info")
    protected BookInfo info;
    @XmlElement(name = "AmendInfo")
    protected AmendInfo amendInfo;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link BookInfo }
     *     
     */
    public BookInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookInfo }
     *     
     */
    public void setInfo(BookInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the amendInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AmendInfo }
     *     
     */
    public AmendInfo getAmendInfo() {
        return amendInfo;
    }

    /**
     * Sets the value of the amendInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInfo }
     *     
     */
    public void setAmendInfo(AmendInfo value) {
        this.amendInfo = value;
    }

}
