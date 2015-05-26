
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tariffResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariffResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="tariffList" type="{http://ws.gdsp.vodafone.com/}tTariffItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariffResponse", propOrder = {
    "returnCode",
    "tariffList"
})
public class TariffResponse {

    protected ReturnCode returnCode;
    protected TTariffItem tariffList;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the tariffList property.
     * 
     * @return
     *     possible object is
     *     {@link TTariffItem }
     *     
     */
    public TTariffItem getTariffList() {
        return tariffList;
    }

    /**
     * Sets the value of the tariffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTariffItem }
     *     
     */
    public void setTariffList(TTariffItem value) {
        this.tariffList = value;
    }

}
