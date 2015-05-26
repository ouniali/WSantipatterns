
package com.familytreemaker.service.search;

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
 *         &lt;element name="GetTemplateResult" type="{urn:service.familytreemaker.com/Search}SearchTemplateType"/>
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
    "getTemplateResult"
})
@XmlRootElement(name = "GetTemplateResponse")
public class GetTemplateResponse {

    @XmlElement(name = "GetTemplateResult", required = true, nillable = true)
    protected SearchTemplateType getTemplateResult;

    /**
     * Gets the value of the getTemplateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTemplateType }
     *     
     */
    public SearchTemplateType getGetTemplateResult() {
        return getTemplateResult;
    }

    /**
     * Sets the value of the getTemplateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTemplateType }
     *     
     */
    public void setGetTemplateResult(SearchTemplateType value) {
        this.getTemplateResult = value;
    }

}
