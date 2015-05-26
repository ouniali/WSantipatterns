
package com.epnet.webservices.searchservice._2007._07;

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
 *         &lt;element name="browseRequest" type="{http://epnet.com/webservices/SearchService/2007/07/}BrowseRequest" minOccurs="0"/>
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
    "browseRequest"
})
@XmlRootElement(name = "Browse")
public class Browse {

    protected BrowseRequest browseRequest;

    /**
     * Gets the value of the browseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BrowseRequest }
     *     
     */
    public BrowseRequest getBrowseRequest() {
        return browseRequest;
    }

    /**
     * Sets the value of the browseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowseRequest }
     *     
     */
    public void setBrowseRequest(BrowseRequest value) {
        this.browseRequest = value;
    }

}
