
package com.epnet.webservices.searchservice._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epnet.webservices.searchservice.response._2007._07.EPServicesEITClusterResponse;


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
 *         &lt;element name="clusterResponse" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}EP.Services.EIT.ClusterResponse"/>
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
    "clusterResponse"
})
@XmlRootElement(name = "GetClustersResponse")
public class GetClustersResponse {

    @XmlElement(required = true, nillable = true)
    protected EPServicesEITClusterResponse clusterResponse;

    /**
     * Gets the value of the clusterResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EPServicesEITClusterResponse }
     *     
     */
    public EPServicesEITClusterResponse getClusterResponse() {
        return clusterResponse;
    }

    /**
     * Sets the value of the clusterResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPServicesEITClusterResponse }
     *     
     */
    public void setClusterResponse(EPServicesEITClusterResponse value) {
        this.clusterResponse = value;
    }

}
