
package com.epnet.webservices.searchservice.response._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Facets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Facets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clusters" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}SearchClusterResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facets", propOrder = {
    "clusters"
})
public class Facets {

    @XmlElement(name = "Clusters")
    protected SearchClusterResponse clusters;

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link SearchClusterResponse }
     *     
     */
    public SearchClusterResponse getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchClusterResponse }
     *     
     */
    public void setClusters(SearchClusterResponse value) {
        this.clusters = value;
    }

}
