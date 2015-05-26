
package com.xignite.services;

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
 *         &lt;element name="PredefinedQueryFilingsResult" type="{http://www.xignite.com/services/}QueryResult" minOccurs="0"/>
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
    "predefinedQueryFilingsResult"
})
@XmlRootElement(name = "PredefinedQueryFilingsResponse")
public class PredefinedQueryFilingsResponse {

    @XmlElement(name = "PredefinedQueryFilingsResult")
    protected QueryResult predefinedQueryFilingsResult;

    /**
     * Gets the value of the predefinedQueryFilingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPredefinedQueryFilingsResult() {
        return predefinedQueryFilingsResult;
    }

    /**
     * Sets the value of the predefinedQueryFilingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPredefinedQueryFilingsResult(QueryResult value) {
        this.predefinedQueryFilingsResult = value;
    }

}
