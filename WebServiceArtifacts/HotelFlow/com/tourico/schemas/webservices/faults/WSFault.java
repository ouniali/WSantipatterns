
package com.tourico.schemas.webservices.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TouricoLogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFault", propOrder = {
    "wsErrorCode",
    "touricoLogId",
    "description"
})
public class WSFault {

    @XmlElement(name = "WSErrorCode")
    protected int wsErrorCode;
    @XmlElement(name = "TouricoLogId")
    protected String touricoLogId;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the wsErrorCode property.
     * 
     */
    public int getWSErrorCode() {
        return wsErrorCode;
    }

    /**
     * Sets the value of the wsErrorCode property.
     * 
     */
    public void setWSErrorCode(int value) {
        this.wsErrorCode = value;
    }

    /**
     * Gets the value of the touricoLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouricoLogId() {
        return touricoLogId;
    }

    /**
     * Sets the value of the touricoLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouricoLogId(String value) {
        this.touricoLogId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
