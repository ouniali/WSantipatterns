
package com.carrierate;

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
 *         &lt;element name="ConfirmQuoteRequestInfo" type="{http://carrierate.com/}ConfirmQuoteRequestInfo"/>
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
    "confirmQuoteRequestInfo"
})
@XmlRootElement(name = "ConfirmShipment")
public class ConfirmShipment {

    @XmlElement(name = "ConfirmQuoteRequestInfo", required = true, nillable = true)
    protected ConfirmQuoteRequestInfo confirmQuoteRequestInfo;

    /**
     * Gets the value of the confirmQuoteRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmQuoteRequestInfo }
     *     
     */
    public ConfirmQuoteRequestInfo getConfirmQuoteRequestInfo() {
        return confirmQuoteRequestInfo;
    }

    /**
     * Sets the value of the confirmQuoteRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmQuoteRequestInfo }
     *     
     */
    public void setConfirmQuoteRequestInfo(ConfirmQuoteRequestInfo value) {
        this.confirmQuoteRequestInfo = value;
    }

}
