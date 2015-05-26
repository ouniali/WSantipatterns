
package com.flightstats.weather.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for visibilityV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="visibilityV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="miles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lessThan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cavok" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visibilityV1", propOrder = {
    "miles",
    "lessThan",
    "cavok"
})
public class VisibilityV1 {

    protected String miles;
    protected Boolean lessThan;
    protected Boolean cavok;

    /**
     * Gets the value of the miles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiles() {
        return miles;
    }

    /**
     * Sets the value of the miles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiles(String value) {
        this.miles = value;
    }

    /**
     * Gets the value of the lessThan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLessThan() {
        return lessThan;
    }

    /**
     * Sets the value of the lessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLessThan(Boolean value) {
        this.lessThan = value;
    }

    /**
     * Gets the value of the cavok property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCavok() {
        return cavok;
    }

    /**
     * Sets the value of the cavok property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCavok(Boolean value) {
        this.cavok = value;
    }

}
