
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_MerchantBusinessDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO_MerchantBusinessDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ABN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO_MerchantBusinessDetailType")
public class COMerchantBusinessDetailType {

    @XmlAttribute(name = "FullName")
    protected String fullName;
    @XmlAttribute(name = "ABN")
    protected String abn;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the abn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABN() {
        return abn;
    }

    /**
     * Sets the value of the abn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABN(String value) {
        this.abn = value;
    }

}
