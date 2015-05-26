
package com.bvdep.vlbapi;

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
 *         &lt;element name="GetHierarchyResult" type="{http://vlbapi.bvdep.com/}SearchInfo"/>
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
    "getHierarchyResult"
})
@XmlRootElement(name = "GetHierarchyResponse")
public class GetHierarchyResponse {

    @XmlElement(name = "GetHierarchyResult", required = true)
    protected SearchInfo getHierarchyResult;

    /**
     * Gets the value of the getHierarchyResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInfo }
     *     
     */
    public SearchInfo getGetHierarchyResult() {
        return getHierarchyResult;
    }

    /**
     * Sets the value of the getHierarchyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInfo }
     *     
     */
    public void setGetHierarchyResult(SearchInfo value) {
        this.getHierarchyResult = value;
    }

}
