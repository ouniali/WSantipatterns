
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adduserargs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adduserargs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="welcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adduserargs", propOrder = {

})
public class Adduserargs {

    protected String org;
    protected String welcome;

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the welcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcome() {
        return welcome;
    }

    /**
     * Sets the value of the welcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcome(String value) {
        this.welcome = value;
    }

}
