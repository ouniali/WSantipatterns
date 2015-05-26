
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}RateTypes"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaturityUnit" type="{http://www.xignite.com/services/}MaturityUnitTypes"/>
 *         &lt;element name="MaturityCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeasonallyAdjusted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discontinued" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDescription", propOrder = {
    "type",
    "description",
    "name",
    "maturity",
    "maturityUnit",
    "maturityCount",
    "seasonallyAdjusted",
    "availability",
    "source",
    "discontinued",
    "service",
    "suffix",
    "factor",
    "precision"
})
public class RateDescription
    extends Common
{

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Maturity")
    protected String maturity;
    @XmlElement(name = "MaturityUnit", required = true)
    @XmlSchemaType(name = "string")
    protected MaturityUnitTypes maturityUnit;
    @XmlElement(name = "MaturityCount")
    protected int maturityCount;
    @XmlElement(name = "SeasonallyAdjusted")
    protected boolean seasonallyAdjusted;
    @XmlElement(name = "Availability")
    protected String availability;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Discontinued")
    protected boolean discontinued;
    @XmlElement(name = "Service")
    protected String service;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "Factor")
    protected int factor;
    @XmlElement(name = "Precision")
    protected int precision;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturity(String value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the maturityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityUnitTypes }
     *     
     */
    public MaturityUnitTypes getMaturityUnit() {
        return maturityUnit;
    }

    /**
     * Sets the value of the maturityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityUnitTypes }
     *     
     */
    public void setMaturityUnit(MaturityUnitTypes value) {
        this.maturityUnit = value;
    }

    /**
     * Gets the value of the maturityCount property.
     * 
     */
    public int getMaturityCount() {
        return maturityCount;
    }

    /**
     * Sets the value of the maturityCount property.
     * 
     */
    public void setMaturityCount(int value) {
        this.maturityCount = value;
    }

    /**
     * Gets the value of the seasonallyAdjusted property.
     * 
     */
    public boolean isSeasonallyAdjusted() {
        return seasonallyAdjusted;
    }

    /**
     * Sets the value of the seasonallyAdjusted property.
     * 
     */
    public void setSeasonallyAdjusted(boolean value) {
        this.seasonallyAdjusted = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the discontinued property.
     * 
     */
    public boolean isDiscontinued() {
        return discontinued;
    }

    /**
     * Sets the value of the discontinued property.
     * 
     */
    public void setDiscontinued(boolean value) {
        this.discontinued = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     */
    public int getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     */
    public void setFactor(int value) {
        this.factor = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

}
