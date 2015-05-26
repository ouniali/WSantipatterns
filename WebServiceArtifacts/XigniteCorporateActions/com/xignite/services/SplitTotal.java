
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitTotal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="Instrument" type="{http://www.xignite.com/services/}Instrument" minOccurs="0"/>
 *         &lt;element name="MatchingSecurity" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="CumulativeRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitTotal", propOrder = {
    "instrument",
    "matchingSecurity",
    "cumulativeRatio",
    "fromDate",
    "toDate"
})
public class SplitTotal
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "Instrument")
    protected Instrument instrument;
    @XmlElement(name = "MatchingSecurity")
    protected Security matchingSecurity;
    @XmlElement(name = "CumulativeRatio")
    protected double cumulativeRatio;
    @XmlElement(name = "FromDate")
    protected String fromDate;
    @XmlElement(name = "ToDate")
    protected String toDate;

    /**
     * Gets the value of the instrument property.
     * 
     * @return
     *     possible object is
     *     {@link Instrument }
     *     
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instrument }
     *     
     */
    public void setInstrument(Instrument value) {
        this.instrument = value;
    }

    /**
     * Gets the value of the matchingSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getMatchingSecurity() {
        return matchingSecurity;
    }

    /**
     * Sets the value of the matchingSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setMatchingSecurity(Security value) {
        this.matchingSecurity = value;
    }

    /**
     * Gets the value of the cumulativeRatio property.
     * 
     */
    public double getCumulativeRatio() {
        return cumulativeRatio;
    }

    /**
     * Sets the value of the cumulativeRatio property.
     * 
     */
    public void setCumulativeRatio(double value) {
        this.cumulativeRatio = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

}
