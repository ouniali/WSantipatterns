
package com.bvdep.vlbapi;

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
 *         &lt;element name="GetMMoUrlsResult" type="{http://vlbapi.bvdep.com/}ArrayOfMmoInfo" minOccurs="0"/>
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
    "getMMoUrlsResult"
})
@XmlRootElement(name = "GetMMoUrlsResponse")
public class GetMMoUrlsResponse {

    @XmlElement(name = "GetMMoUrlsResult")
    protected ArrayOfMmoInfo getMMoUrlsResult;

    /**
     * Gets the value of the getMMoUrlsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMmoInfo }
     *     
     */
    public ArrayOfMmoInfo getGetMMoUrlsResult() {
        return getMMoUrlsResult;
    }

    /**
     * Sets the value of the getMMoUrlsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMmoInfo }
     *     
     */
    public void setGetMMoUrlsResult(ArrayOfMmoInfo value) {
        this.getMMoUrlsResult = value;
    }

}
