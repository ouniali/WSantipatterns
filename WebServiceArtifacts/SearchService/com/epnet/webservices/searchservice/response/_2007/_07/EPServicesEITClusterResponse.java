
package com.epnet.webservices.searchservice.response._2007._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EP.Services.EIT.ClusterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EP.Services.EIT.ClusterResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epnet.com/webservices/SearchService/Response/2007/07/}Response">
 *       &lt;sequence>
 *         &lt;element name="ClusterCategory" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ClusterCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EP.Services.EIT.ClusterResponse", propOrder = {
    "clusterCategory"
})
public class EPServicesEITClusterResponse
    extends Response
{

    @XmlElement(name = "ClusterCategory")
    protected List<ClusterCategory> clusterCategory;

    /**
     * Gets the value of the clusterCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterCategory }
     * 
     * 
     */
    public List<ClusterCategory> getClusterCategory() {
        if (clusterCategory == null) {
            clusterCategory = new ArrayList<ClusterCategory>();
        }
        return this.clusterCategory;
    }

}
