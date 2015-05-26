
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
 *         &lt;element name="GetPublicationsResult" type="{http://www.diacomp.org/webservices/}ArrayOfPublication" minOccurs="0"/>
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
    "getPublicationsResult"
})
@XmlRootElement(name = "GetPublicationsResponse")
public class GetPublicationsResponse {

    @XmlElement(name = "GetPublicationsResult")
    protected ArrayOfPublication getPublicationsResult;

    /**
     * Gets the value of the getPublicationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublication }
     *     
     */
    public ArrayOfPublication getGetPublicationsResult() {
        return getPublicationsResult;
    }

    /**
     * Sets the value of the getPublicationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublication }
     *     
     */
    public void setGetPublicationsResult(ArrayOfPublication value) {
        this.getPublicationsResult = value;
    }

}
