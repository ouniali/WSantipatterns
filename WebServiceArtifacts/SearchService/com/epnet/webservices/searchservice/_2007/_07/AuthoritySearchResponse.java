
package com.epnet.webservices.searchservice._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epnet.webservices.searchservice.response._2007._07.EPServicesEITAuthoritySearchResponse;


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
 *         &lt;element name="AuthoritySearchResponse" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}EP.Services.EIT.AuthoritySearchResponse"/>
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
    "authoritySearchResponse"
})
@XmlRootElement(name = "AuthoritySearchResponse")
public class AuthoritySearchResponse {

    @XmlElement(name = "AuthoritySearchResponse", required = true, nillable = true)
    protected EPServicesEITAuthoritySearchResponse authoritySearchResponse;

    /**
     * Gets the value of the authoritySearchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EPServicesEITAuthoritySearchResponse }
     *     
     */
    public EPServicesEITAuthoritySearchResponse getAuthoritySearchResponse() {
        return authoritySearchResponse;
    }

    /**
     * Sets the value of the authoritySearchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPServicesEITAuthoritySearchResponse }
     *     
     */
    public void setAuthoritySearchResponse(EPServicesEITAuthoritySearchResponse value) {
        this.authoritySearchResponse = value;
    }

}
