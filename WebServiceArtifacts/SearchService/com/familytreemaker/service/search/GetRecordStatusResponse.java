
package com.familytreemaker.service.search;

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
 *         &lt;element name="GetRecordStatusResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getRecordStatusResult"
})
@XmlRootElement(name = "GetRecordStatusResponse")
public class GetRecordStatusResponse {

    @XmlElement(name = "GetRecordStatusResult")
    protected int getRecordStatusResult;

    /**
     * Gets the value of the getRecordStatusResult property.
     * 
     */
    public int getGetRecordStatusResult() {
        return getRecordStatusResult;
    }

    /**
     * Sets the value of the getRecordStatusResult property.
     * 
     */
    public void setGetRecordStatusResult(int value) {
        this.getRecordStatusResult = value;
    }

}
