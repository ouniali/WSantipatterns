
package org.diacomp.webservices;

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
 *         &lt;element name="GetPublicationModelTypesResult" type="{http://www.diacomp.org/webservices/}ArrayOfString" minOccurs="0"/>
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
    "getPublicationModelTypesResult"
})
@XmlRootElement(name = "GetPublicationModelTypesResponse")
public class GetPublicationModelTypesResponse {

    @XmlElement(name = "GetPublicationModelTypesResult")
    protected ArrayOfString getPublicationModelTypesResult;

    /**
     * Gets the value of the getPublicationModelTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetPublicationModelTypesResult() {
        return getPublicationModelTypesResult;
    }

    /**
     * Sets the value of the getPublicationModelTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetPublicationModelTypesResult(ArrayOfString value) {
        this.getPublicationModelTypesResult = value;
    }

}
