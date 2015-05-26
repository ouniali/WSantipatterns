
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternatePackagingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternatePackagingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternatePackagingList" type="{http://services.digikey.com/SearchWS}ArrayOfAlternatePackaging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePackagingOptions", propOrder = {
    "alternatePackagingList"
})
public class AlternatePackagingOptions {

    @XmlElement(name = "AlternatePackagingList")
    protected ArrayOfAlternatePackaging alternatePackagingList;

    /**
     * Gets the value of the alternatePackagingList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlternatePackaging }
     *     
     */
    public ArrayOfAlternatePackaging getAlternatePackagingList() {
        return alternatePackagingList;
    }

    /**
     * Sets the value of the alternatePackagingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlternatePackaging }
     *     
     */
    public void setAlternatePackagingList(ArrayOfAlternatePackaging value) {
        this.alternatePackagingList = value;
    }

}
