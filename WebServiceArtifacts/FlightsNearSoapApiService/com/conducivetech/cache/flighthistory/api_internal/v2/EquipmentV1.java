
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equipmentV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="turboProp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="jet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="widebody" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="regional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentV1", propOrder = {
    "iata",
    "name",
    "turboProp",
    "jet",
    "widebody",
    "regional"
})
public class EquipmentV1 {

    @XmlElement(required = true)
    protected String iata;
    @XmlElement(required = true)
    protected String name;
    protected boolean turboProp;
    protected boolean jet;
    protected boolean widebody;
    protected boolean regional;

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
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
     * Gets the value of the turboProp property.
     * 
     */
    public boolean isTurboProp() {
        return turboProp;
    }

    /**
     * Sets the value of the turboProp property.
     * 
     */
    public void setTurboProp(boolean value) {
        this.turboProp = value;
    }

    /**
     * Gets the value of the jet property.
     * 
     */
    public boolean isJet() {
        return jet;
    }

    /**
     * Sets the value of the jet property.
     * 
     */
    public void setJet(boolean value) {
        this.jet = value;
    }

    /**
     * Gets the value of the widebody property.
     * 
     */
    public boolean isWidebody() {
        return widebody;
    }

    /**
     * Sets the value of the widebody property.
     * 
     */
    public void setWidebody(boolean value) {
        this.widebody = value;
    }

    /**
     * Gets the value of the regional property.
     * 
     */
    public boolean isRegional() {
        return regional;
    }

    /**
     * Sets the value of the regional property.
     * 
     */
    public void setRegional(boolean value) {
        this.regional = value;
    }

}
