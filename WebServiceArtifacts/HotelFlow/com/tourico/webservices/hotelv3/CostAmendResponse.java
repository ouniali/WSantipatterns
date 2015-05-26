
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.AmendResult;


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
 *         &lt;element name="CostAmendResult" type="{http://schemas.tourico.com/webservices/hotelv3}AmendResult" minOccurs="0"/>
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
    "costAmendResult"
})
@XmlRootElement(name = "CostAmendResponse")
public class CostAmendResponse {

    @XmlElement(name = "CostAmendResult")
    protected AmendResult costAmendResult;

    /**
     * Gets the value of the costAmendResult property.
     * 
     * @return
     *     possible object is
     *     {@link AmendResult }
     *     
     */
    public AmendResult getCostAmendResult() {
        return costAmendResult;
    }

    /**
     * Sets the value of the costAmendResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendResult }
     *     
     */
    public void setCostAmendResult(AmendResult value) {
        this.costAmendResult = value;
    }

}
