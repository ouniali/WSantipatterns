
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.BookInfo;


/**
 * <p>Java class for RGInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{http://schemas.tourico.com/webservices}BookInfo" minOccurs="0"/>
 *         &lt;element name="ResGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ResGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGInfoResults", propOrder = {
    "info",
    "resGroup"
})
public class RGInfoResults {

    @XmlElement(name = "Info")
    protected BookInfo info;
    @XmlElement(name = "ResGroup")
    protected ResGroup resGroup;

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
     * Gets the value of the resGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ResGroup }
     *     
     */
    public ResGroup getResGroup() {
        return resGroup;
    }

    /**
     * Sets the value of the resGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGroup }
     *     
     */
    public void setResGroup(ResGroup value) {
        this.resGroup = value;
    }

}
