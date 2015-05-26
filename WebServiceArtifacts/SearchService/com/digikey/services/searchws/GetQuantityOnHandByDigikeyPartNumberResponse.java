
package com.digikey.services.searchws;

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
 *         &lt;element name="GetQuantityOnHandByDigikeyPartNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getQuantityOnHandByDigikeyPartNumberResult"
})
@XmlRootElement(name = "GetQuantityOnHandByDigikeyPartNumberResponse")
public class GetQuantityOnHandByDigikeyPartNumberResponse {

    @XmlElement(name = "GetQuantityOnHandByDigikeyPartNumberResult")
    protected int getQuantityOnHandByDigikeyPartNumberResult;

    /**
     * Gets the value of the getQuantityOnHandByDigikeyPartNumberResult property.
     * 
     */
    public int getGetQuantityOnHandByDigikeyPartNumberResult() {
        return getQuantityOnHandByDigikeyPartNumberResult;
    }

    /**
     * Sets the value of the getQuantityOnHandByDigikeyPartNumberResult property.
     * 
     */
    public void setGetQuantityOnHandByDigikeyPartNumberResult(int value) {
        this.getQuantityOnHandByDigikeyPartNumberResult = value;
    }

}
