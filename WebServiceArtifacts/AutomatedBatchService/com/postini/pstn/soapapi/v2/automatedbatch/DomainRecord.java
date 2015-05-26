
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domainRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domainRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasedfrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasedto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="neworg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainRecord", propOrder = {

})
public class DomainRecord {

    protected String alias;
    protected String aliasedfrom;
    protected String aliasedto;
    protected String domainid;
    protected String domainname;
    protected String neworg;
    protected String org;
    protected String substrip;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the aliasedfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasedfrom() {
        return aliasedfrom;
    }

    /**
     * Sets the value of the aliasedfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasedfrom(String value) {
        this.aliasedfrom = value;
    }

    /**
     * Gets the value of the aliasedto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasedto() {
        return aliasedto;
    }

    /**
     * Sets the value of the aliasedto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasedto(String value) {
        this.aliasedto = value;
    }

    /**
     * Gets the value of the domainid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainid() {
        return domainid;
    }

    /**
     * Sets the value of the domainid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainid(String value) {
        this.domainid = value;
    }

    /**
     * Gets the value of the domainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * Sets the value of the domainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

    /**
     * Gets the value of the neworg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeworg() {
        return neworg;
    }

    /**
     * Sets the value of the neworg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeworg(String value) {
        this.neworg = value;
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
     * Gets the value of the substrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstrip() {
        return substrip;
    }

    /**
     * Sets the value of the substrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstrip(String value) {
        this.substrip = value;
    }

}
