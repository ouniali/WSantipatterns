
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OI_QuerySettingsRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OI_QuerySettingsRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DateRangeQuery" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}OI_DateRangeQueryRQType" minOccurs="0"/>
 *           &lt;element name="TodayQuery" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}OI_TodayQueryRQType" minOccurs="0"/>
 *           &lt;element name="CompleteQuery" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}OI_CompleteQueryRQType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OI_QuerySettingsRQType", propOrder = {
    "dateRangeQuery",
    "todayQuery",
    "completeQuery"
})
public class OIQuerySettingsRQType {

    @XmlElement(name = "DateRangeQuery")
    protected OIDateRangeQueryRQType dateRangeQuery;
    @XmlElement(name = "TodayQuery")
    protected OITodayQueryRQType todayQuery;
    @XmlElement(name = "CompleteQuery")
    protected OICompleteQueryRQType completeQuery;

    /**
     * Gets the value of the dateRangeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OIDateRangeQueryRQType }
     *     
     */
    public OIDateRangeQueryRQType getDateRangeQuery() {
        return dateRangeQuery;
    }

    /**
     * Sets the value of the dateRangeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OIDateRangeQueryRQType }
     *     
     */
    public void setDateRangeQuery(OIDateRangeQueryRQType value) {
        this.dateRangeQuery = value;
    }

    /**
     * Gets the value of the todayQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OITodayQueryRQType }
     *     
     */
    public OITodayQueryRQType getTodayQuery() {
        return todayQuery;
    }

    /**
     * Sets the value of the todayQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OITodayQueryRQType }
     *     
     */
    public void setTodayQuery(OITodayQueryRQType value) {
        this.todayQuery = value;
    }

    /**
     * Gets the value of the completeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OICompleteQueryRQType }
     *     
     */
    public OICompleteQueryRQType getCompleteQuery() {
        return completeQuery;
    }

    /**
     * Sets the value of the completeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OICompleteQueryRQType }
     *     
     */
    public void setCompleteQuery(OICompleteQueryRQType value) {
        this.completeQuery = value;
    }

}
