
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="publicationSearch" type="{http://www.diacomp.org/webservices/}PublicationSearch" minOccurs="0"/>
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
    "publicationSearch"
})
@XmlRootElement(name = "GetPublicationsBySearch")
public class GetPublicationsBySearch {

    protected PublicationSearch publicationSearch;

    /**
     * Gets the value of the publicationSearch property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationSearch }
     *     
     */
    public PublicationSearch getPublicationSearch() {
        return publicationSearch;
    }

    /**
     * Sets the value of the publicationSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationSearch }
     *     
     */
    public void setPublicationSearch(PublicationSearch value) {
        this.publicationSearch = value;
    }

}
