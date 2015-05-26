
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.TermAndConditionsResult;


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
 *         &lt;element name="GetTermAndConditionsResult" type="{http://schemas.tourico.com/webservices/hotelv3}TermAndConditionsResult" minOccurs="0"/>
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
    "getTermAndConditionsResult"
})
@XmlRootElement(name = "GetTermAndConditionsResponse")
public class GetTermAndConditionsResponse {

    @XmlElement(name = "GetTermAndConditionsResult")
    protected TermAndConditionsResult getTermAndConditionsResult;

    /**
     * Gets the value of the getTermAndConditionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermAndConditionsResult }
     *     
     */
    public TermAndConditionsResult getGetTermAndConditionsResult() {
        return getTermAndConditionsResult;
    }

    /**
     * Sets the value of the getTermAndConditionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermAndConditionsResult }
     *     
     */
    public void setGetTermAndConditionsResult(TermAndConditionsResult value) {
        this.getTermAndConditionsResult = value;
    }

}
