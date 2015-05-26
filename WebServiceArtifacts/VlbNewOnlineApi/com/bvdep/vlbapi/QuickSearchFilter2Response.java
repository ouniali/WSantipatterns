
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
 *         &lt;element name="QuickSearchFilter2Result" type="{http://vlbapi.bvdep.com/}SearchInfo"/>
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
    "quickSearchFilter2Result"
})
@XmlRootElement(name = "QuickSearchFilter2Response")
public class QuickSearchFilter2Response {

    @XmlElement(name = "QuickSearchFilter2Result", required = true)
    protected SearchInfo quickSearchFilter2Result;

    /**
     * Gets the value of the quickSearchFilter2Result property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInfo }
     *     
     */
    public SearchInfo getQuickSearchFilter2Result() {
        return quickSearchFilter2Result;
    }

    /**
     * Sets the value of the quickSearchFilter2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInfo }
     *     
     */
    public void setQuickSearchFilter2Result(SearchInfo value) {
        this.quickSearchFilter2Result = value;
    }

}
