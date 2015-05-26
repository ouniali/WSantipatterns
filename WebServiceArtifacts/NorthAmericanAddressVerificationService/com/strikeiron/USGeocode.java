
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USGeocode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USGeocode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.strikeiron.com}Geocode">
 *       &lt;sequence>
 *         &lt;element name="CensusTract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USGeocode", propOrder = {
    "censusTract",
    "stateNumber",
    "countyNumber",
    "blockNumber",
    "blockGroup"
})
public class USGeocode
    extends Geocode
{

    @XmlElement(name = "CensusTract")
    protected String censusTract;
    @XmlElement(name = "StateNumber")
    protected String stateNumber;
    @XmlElement(name = "CountyNumber")
    protected String countyNumber;
    @XmlElement(name = "BlockNumber")
    protected String blockNumber;
    @XmlElement(name = "BlockGroup")
    protected String blockGroup;

    /**
     * Gets the value of the censusTract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusTract() {
        return censusTract;
    }

    /**
     * Sets the value of the censusTract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusTract(String value) {
        this.censusTract = value;
    }

    /**
     * Gets the value of the stateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateNumber() {
        return stateNumber;
    }

    /**
     * Sets the value of the stateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateNumber(String value) {
        this.stateNumber = value;
    }

    /**
     * Gets the value of the countyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyNumber() {
        return countyNumber;
    }

    /**
     * Sets the value of the countyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyNumber(String value) {
        this.countyNumber = value;
    }

    /**
     * Gets the value of the blockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNumber(String value) {
        this.blockNumber = value;
    }

    /**
     * Gets the value of the blockGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockGroup() {
        return blockGroup;
    }

    /**
     * Sets the value of the blockGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockGroup(String value) {
        this.blockGroup = value;
    }

}
