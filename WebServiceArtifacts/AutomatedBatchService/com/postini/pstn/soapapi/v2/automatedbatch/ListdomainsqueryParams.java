
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listdomainsqueryParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listdomainsqueryParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aliases" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childorgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgtagqs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryqs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listdomainsqueryParams", propOrder = {

})
public class ListdomainsqueryParams {

    protected String aliases;
    protected String childorgs;
    protected String end;
    protected String fields;
    protected String orgtagqs;
    protected String primaryqs;
    protected String sort;
    protected String start;
    protected String targetOrg;

    /**
     * Gets the value of the aliases property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliases() {
        return aliases;
    }

    /**
     * Sets the value of the aliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliases(String value) {
        this.aliases = value;
    }

    /**
     * Gets the value of the childorgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildorgs() {
        return childorgs;
    }

    /**
     * Sets the value of the childorgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildorgs(String value) {
        this.childorgs = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFields(String value) {
        this.fields = value;
    }

    /**
     * Gets the value of the orgtagqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtagqs() {
        return orgtagqs;
    }

    /**
     * Sets the value of the orgtagqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtagqs(String value) {
        this.orgtagqs = value;
    }

    /**
     * Gets the value of the primaryqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryqs() {
        return primaryqs;
    }

    /**
     * Sets the value of the primaryqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryqs(String value) {
        this.primaryqs = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the targetOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOrg() {
        return targetOrg;
    }

    /**
     * Sets the value of the targetOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOrg(String value) {
        this.targetOrg = value;
    }

}
