
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SourceOfBusiness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceOfBusiness">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PrimaryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecondaryID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecondaryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SubSourceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SubSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MarketSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CroCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceOfBusiness", propOrder = {
    "value"
})
public class SourceOfBusiness {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PrimaryCode")
    protected String primaryCode;
    @XmlAttribute(name = "PrimaryID")
    protected String primaryID;
    @XmlAttribute(name = "SecondaryID")
    protected String secondaryID;
    @XmlAttribute(name = "SecondaryCode")
    protected String secondaryCode;
    @XmlAttribute(name = "SubSourceID")
    protected String subSourceID;
    @XmlAttribute(name = "SubSourceCode")
    protected String subSourceCode;
    @XmlAttribute(name = "MarketSourceCode")
    protected String marketSourceCode;
    @XmlAttribute(name = "CroCode")
    protected String croCode;
    @XmlAttribute(name = "SourceOfBusinessCode")
    protected String sourceOfBusinessCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the primaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCode() {
        return primaryCode;
    }

    /**
     * Sets the value of the primaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCode(String value) {
        this.primaryCode = value;
    }

    /**
     * Gets the value of the primaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryID() {
        return primaryID;
    }

    /**
     * Sets the value of the primaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryID(String value) {
        this.primaryID = value;
    }

    /**
     * Gets the value of the secondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryID() {
        return secondaryID;
    }

    /**
     * Sets the value of the secondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryID(String value) {
        this.secondaryID = value;
    }

    /**
     * Gets the value of the secondaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCode() {
        return secondaryCode;
    }

    /**
     * Sets the value of the secondaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCode(String value) {
        this.secondaryCode = value;
    }

    /**
     * Gets the value of the subSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSourceID() {
        return subSourceID;
    }

    /**
     * Sets the value of the subSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSourceID(String value) {
        this.subSourceID = value;
    }

    /**
     * Gets the value of the subSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSourceCode() {
        return subSourceCode;
    }

    /**
     * Sets the value of the subSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSourceCode(String value) {
        this.subSourceCode = value;
    }

    /**
     * Gets the value of the marketSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSourceCode() {
        return marketSourceCode;
    }

    /**
     * Sets the value of the marketSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSourceCode(String value) {
        this.marketSourceCode = value;
    }

    /**
     * Gets the value of the croCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCroCode() {
        return croCode;
    }

    /**
     * Sets the value of the croCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCroCode(String value) {
        this.croCode = value;
    }

    /**
     * Gets the value of the sourceOfBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusinessCode() {
        return sourceOfBusinessCode;
    }

    /**
     * Sets the value of the sourceOfBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusinessCode(String value) {
        this.sourceOfBusinessCode = value;
    }

}
