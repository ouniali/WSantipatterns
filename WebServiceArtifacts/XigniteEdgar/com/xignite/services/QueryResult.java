
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Filings" type="{http://www.xignite.com/services/}ArrayOfShortFiling" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "security",
    "filings"
})
public class QueryResult
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Filings")
    protected ArrayOfShortFiling filings;

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
     * Gets the value of the filings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShortFiling }
     *     
     */
    public ArrayOfShortFiling getFilings() {
        return filings;
    }

    /**
     * Sets the value of the filings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShortFiling }
     *     
     */
    public void setFilings(ArrayOfShortFiling value) {
        this.filings = value;
    }

}
