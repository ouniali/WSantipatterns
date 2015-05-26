
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spoolRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spoolRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="auto_unspool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despool_max_connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spool_delay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spool_mech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="used_pct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="used_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spoolRecord", propOrder = {

})
public class SpoolRecord {

    @XmlElement(name = "auto_unspool")
    protected String autoUnspool;
    @XmlElement(name = "despool_max_connections")
    protected String despoolMaxConnections;
    protected String duration;
    protected String org;
    protected String quota;
    @XmlElement(name = "spool_delay")
    protected String spoolDelay;
    @XmlElement(name = "spool_mech")
    protected String spoolMech;
    protected String status;
    @XmlElement(name = "used_pct")
    protected String usedPct;
    @XmlElement(name = "used_size")
    protected String usedSize;

    /**
     * Gets the value of the autoUnspool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoUnspool() {
        return autoUnspool;
    }

    /**
     * Sets the value of the autoUnspool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoUnspool(String value) {
        this.autoUnspool = value;
    }

    /**
     * Gets the value of the despoolMaxConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespoolMaxConnections() {
        return despoolMaxConnections;
    }

    /**
     * Sets the value of the despoolMaxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespoolMaxConnections(String value) {
        this.despoolMaxConnections = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuota(String value) {
        this.quota = value;
    }

    /**
     * Gets the value of the spoolDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpoolDelay() {
        return spoolDelay;
    }

    /**
     * Sets the value of the spoolDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpoolDelay(String value) {
        this.spoolDelay = value;
    }

    /**
     * Gets the value of the spoolMech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpoolMech() {
        return spoolMech;
    }

    /**
     * Sets the value of the spoolMech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpoolMech(String value) {
        this.spoolMech = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the usedPct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedPct() {
        return usedPct;
    }

    /**
     * Sets the value of the usedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedPct(String value) {
        this.usedPct = value;
    }

    /**
     * Gets the value of the usedSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedSize() {
        return usedSize;
    }

    /**
     * Sets the value of the usedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedSize(String value) {
        this.usedSize = value;
    }

}
