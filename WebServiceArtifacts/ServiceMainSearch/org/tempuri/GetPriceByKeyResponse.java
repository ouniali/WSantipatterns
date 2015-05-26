
package org.tempuri;

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
 *         &lt;element name="GetPriceByKeyResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "getPriceByKeyResult"
})
@XmlRootElement(name = "GetPriceByKeyResponse")
public class GetPriceByKeyResponse {

    @XmlElement(name = "GetPriceByKeyResult")
    protected Double getPriceByKeyResult;

    /**
     * Gets the value of the getPriceByKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGetPriceByKeyResult() {
        return getPriceByKeyResult;
    }

    /**
     * Sets the value of the getPriceByKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGetPriceByKeyResult(Double value) {
        this.getPriceByKeyResult = value;
    }

}
