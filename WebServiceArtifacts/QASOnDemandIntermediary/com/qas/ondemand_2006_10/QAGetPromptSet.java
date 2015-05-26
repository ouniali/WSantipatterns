
package com.qas.ondemand_2006_10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Engine" type="{http://www.qas.com/OnDemand-2006-10}EngineType" minOccurs="0"/>
 *         &lt;element name="PromptSet" type="{http://www.qas.com/OnDemand-2006-10}PromptSetType"/>
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
    "promptSet"
})
@XmlRootElement(name = "QAGetPromptSet")
public class QAGetPromptSet {

    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Engine")
    protected EngineType engine;
    @XmlElement(name = "PromptSet", required = true)
    @XmlSchemaType(name = "string")
    protected PromptSetType promptSet;

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
     * Gets the value of the promptSet property.
     * 
     * @return
     *     possible object is
     *     {@link PromptSetType }
     *     
     */
    public PromptSetType getPromptSet() {
        return promptSet;
    }

    /**
     * Sets the value of the promptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptSetType }
     *     
     */
    public void setPromptSet(PromptSetType value) {
        this.promptSet = value;
    }

}
