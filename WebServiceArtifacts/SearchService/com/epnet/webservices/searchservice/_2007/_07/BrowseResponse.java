
package com.epnet.webservices.searchservice._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epnet.webservices.searchservice.response._2007._07.EPServicesEITBrowseResponse;


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
 *         &lt;element name="browseResponse" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}EP.Services.EIT.BrowseResponse"/>
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
    "browseResponse"
})
@XmlRootElement(name = "BrowseResponse")
public class BrowseResponse {

    @XmlElement(required = true, nillable = true)
    protected EPServicesEITBrowseResponse browseResponse;

    /**
     * Gets the value of the browseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EPServicesEITBrowseResponse }
     *     
     */
    public EPServicesEITBrowseResponse getBrowseResponse() {
        return browseResponse;
    }

    /**
     * Sets the value of the browseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPServicesEITBrowseResponse }
     *     
     */
    public void setBrowseResponse(EPServicesEITBrowseResponse value) {
        this.browseResponse = value;
    }

}
