
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rptOwnerId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rptOwnerId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rptOwnerCik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rptOwnerId", propOrder = {
    "rptOwnerCik",
    "rptOwnerName"
})
public class RptOwnerId {

    protected String rptOwnerCik;
    protected String rptOwnerName;

    /**
     * Gets the value of the rptOwnerCik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerCik() {
        return rptOwnerCik;
    }

    /**
     * Sets the value of the rptOwnerCik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerCik(String value) {
        this.rptOwnerCik = value;
    }

    /**
     * Gets the value of the rptOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerName() {
        return rptOwnerName;
    }

    /**
     * Sets the value of the rptOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerName(String value) {
        this.rptOwnerName = value;
    }

}
