
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharesOutstanding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharesOutstanding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="TotalDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExtractedDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PercentageSuccess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Shares" type="{http://www.xignite.com/services/}ArrayOfSharesAsOf" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesOutstanding", propOrder = {
    "security",
    "totalDocuments",
    "extractedDocuments",
    "percentageSuccess",
    "shares"
})
public class SharesOutstanding
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "TotalDocuments")
    protected int totalDocuments;
    @XmlElement(name = "ExtractedDocuments")
    protected int extractedDocuments;
    @XmlElement(name = "PercentageSuccess")
    protected double percentageSuccess;
    @XmlElement(name = "Shares")
    protected ArrayOfSharesAsOf shares;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the totalDocuments property.
     * 
     */
    public int getTotalDocuments() {
        return totalDocuments;
    }

    /**
     * Sets the value of the totalDocuments property.
     * 
     */
    public void setTotalDocuments(int value) {
        this.totalDocuments = value;
    }

    /**
     * Gets the value of the extractedDocuments property.
     * 
     */
    public int getExtractedDocuments() {
        return extractedDocuments;
    }

    /**
     * Sets the value of the extractedDocuments property.
     * 
     */
    public void setExtractedDocuments(int value) {
        this.extractedDocuments = value;
    }

    /**
     * Gets the value of the percentageSuccess property.
     * 
     */
    public double getPercentageSuccess() {
        return percentageSuccess;
    }

    /**
     * Sets the value of the percentageSuccess property.
     * 
     */
    public void setPercentageSuccess(double value) {
        this.percentageSuccess = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSharesAsOf }
     *     
     */
    public ArrayOfSharesAsOf getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSharesAsOf }
     *     
     */
    public void setShares(ArrayOfSharesAsOf value) {
        this.shares = value;
    }

}
