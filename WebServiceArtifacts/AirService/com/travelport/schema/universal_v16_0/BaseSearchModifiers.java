
package com.travelport.schema.universal_v16_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Controls and switches for the Universal Record Search and Saved Trip search request.
 * 
 * <p>Java class for BaseSearchModifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseSearchModifiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IncludeAllNames" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IncludeAgentInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxResults" type="{http://www.travelport.com/schema/common_v15_0}typeMaxResults" default="20" />
 *       &lt;attribute name="StartFromResult" type="{http://www.travelport.com/schema/common_v15_0}typeStartFromResult" />
 *       &lt;attribute name="ExcludeAir" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExcludeVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExcludeHotel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSearchModifiers", propOrder = {
    "travelDate"
})
@XmlSeeAlso({
    UniversalRecordSearchModifiers.class,
    SavedTripSearchModifiers.class
})
public class BaseSearchModifiers {

    @XmlElement(name = "TravelDate")
    protected TypeDateSpec travelDate;
    @XmlAttribute(name = "IncludeAllNames")
    protected Boolean includeAllNames;
    @XmlAttribute(name = "IncludeAgentInfo")
    protected Boolean includeAgentInfo;
    @XmlAttribute(name = "MaxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "StartFromResult")
    protected BigInteger startFromResult;
    @XmlAttribute(name = "ExcludeAir")
    protected Boolean excludeAir;
    @XmlAttribute(name = "ExcludeVehicle")
    protected Boolean excludeVehicle;
    @XmlAttribute(name = "ExcludeHotel")
    protected Boolean excludeHotel;

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setTravelDate(TypeDateSpec value) {
        this.travelDate = value;
    }

    /**
     * Gets the value of the includeAllNames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeAllNames() {
        if (includeAllNames == null) {
            return false;
        } else {
            return includeAllNames;
        }
    }

    /**
     * Sets the value of the includeAllNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllNames(Boolean value) {
        this.includeAllNames = value;
    }

    /**
     * Gets the value of the includeAgentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeAgentInfo() {
        if (includeAgentInfo == null) {
            return false;
        } else {
            return includeAgentInfo;
        }
    }

    /**
     * Sets the value of the includeAgentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAgentInfo(Boolean value) {
        this.includeAgentInfo = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxResults() {
        if (maxResults == null) {
            return  20;
        } else {
            return maxResults;
        }
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the startFromResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartFromResult() {
        return startFromResult;
    }

    /**
     * Sets the value of the startFromResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartFromResult(BigInteger value) {
        this.startFromResult = value;
    }

    /**
     * Gets the value of the excludeAir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeAir() {
        if (excludeAir == null) {
            return false;
        } else {
            return excludeAir;
        }
    }

    /**
     * Sets the value of the excludeAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeAir(Boolean value) {
        this.excludeAir = value;
    }

    /**
     * Gets the value of the excludeVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeVehicle() {
        if (excludeVehicle == null) {
            return false;
        } else {
            return excludeVehicle;
        }
    }

    /**
     * Sets the value of the excludeVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeVehicle(Boolean value) {
        this.excludeVehicle = value;
    }

    /**
     * Gets the value of the excludeHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeHotel() {
        if (excludeHotel == null) {
            return false;
        } else {
            return excludeHotel;
        }
    }

    /**
     * Sets the value of the excludeHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeHotel(Boolean value) {
        this.excludeHotel = value;
    }

}
