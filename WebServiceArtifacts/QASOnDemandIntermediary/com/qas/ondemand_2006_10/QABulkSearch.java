
package com.qas.ondemand_2006_10;

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
 *         &lt;element name="Country" type="{http://www.qas.com/OnDemand-2006-10}DataIDType"/>
 *         &lt;element name="Engine" type="{http://www.qas.com/OnDemand-2006-10}EngineType"/>
 *         &lt;element name="Layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulkSearchTerm" type="{http://www.qas.com/OnDemand-2006-10}QASearchType" minOccurs="0"/>
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
    "country",
    "engine",
    "layout",
    "bulkSearchTerm"
})
@XmlRootElement(name = "QABulkSearch")
public class QABulkSearch {

    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Engine", required = true)
    protected EngineType engine;
    @XmlElement(name = "Layout")
    protected String layout;
    @XmlElement(name = "BulkSearchTerm")
    protected QASearchType bulkSearchTerm;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link EngineType }
     *     
     */
    public EngineType getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineType }
     *     
     */
    public void setEngine(EngineType value) {
        this.engine = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the bulkSearchTerm property.
     * 
     * @return
     *     possible object is
     *     {@link QASearchType }
     *     
     */
    public QASearchType getBulkSearchTerm() {
        return bulkSearchTerm;
    }

    /**
     * Sets the value of the bulkSearchTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QASearchType }
     *     
     */
    public void setBulkSearchTerm(QASearchType value) {
        this.bulkSearchTerm = value;
    }

}
