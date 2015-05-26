
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
 *         &lt;element name="QueryFilingsByReportingPeriodResult" type="{http://www.xignite.com/services/}QueryResult" minOccurs="0"/>
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
    "queryFilingsByReportingPeriodResult"
})
@XmlRootElement(name = "QueryFilingsByReportingPeriodResponse")
public class QueryFilingsByReportingPeriodResponse {

    @XmlElement(name = "QueryFilingsByReportingPeriodResult")
    protected QueryResult queryFilingsByReportingPeriodResult;

    /**
     * Gets the value of the queryFilingsByReportingPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getQueryFilingsByReportingPeriodResult() {
        return queryFilingsByReportingPeriodResult;
    }

    /**
     * Sets the value of the queryFilingsByReportingPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setQueryFilingsByReportingPeriodResult(QueryResult value) {
        this.queryFilingsByReportingPeriodResult = value;
    }

}
