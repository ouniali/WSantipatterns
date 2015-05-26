
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
 *         &lt;element name="GetPublicationsBySearchResult" type="{http://www.diacomp.org/webservices/}ArrayOfPublication" minOccurs="0"/>
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
    "getPublicationsBySearchResult"
})
@XmlRootElement(name = "GetPublicationsBySearchResponse")
public class GetPublicationsBySearchResponse {

    @XmlElement(name = "GetPublicationsBySearchResult")
    protected ArrayOfPublication getPublicationsBySearchResult;

    /**
     * Gets the value of the getPublicationsBySearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublication }
     *     
     */
    public ArrayOfPublication getGetPublicationsBySearchResult() {
        return getPublicationsBySearchResult;
    }

    /**
     * Sets the value of the getPublicationsBySearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublication }
     *     
     */
    public void setGetPublicationsBySearchResult(ArrayOfPublication value) {
        this.getPublicationsBySearchResult = value;
    }

}
