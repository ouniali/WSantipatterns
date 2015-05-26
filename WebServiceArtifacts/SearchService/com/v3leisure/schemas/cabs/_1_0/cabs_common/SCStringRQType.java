
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_StringRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_StringRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="contains" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="begins_with" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ends_with" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exact" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_StringRQType")
public class SCStringRQType {

    @XmlAttribute(name = "contains")
    protected String contains;
    @XmlAttribute(name = "begins_with")
    protected String beginsWith;
    @XmlAttribute(name = "ends_with")
    protected String endsWith;
    @XmlAttribute(name = "exact")
    protected String exact;
    @XmlAttribute(name = "exclude")
    protected Boolean exclude;

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContains() {
        return contains;
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContains(String value) {
        this.contains = value;
    }

    /**
     * Gets the value of the beginsWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginsWith() {
        return beginsWith;
    }

    /**
     * Sets the value of the beginsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginsWith(String value) {
        this.beginsWith = value;
    }

    /**
     * Gets the value of the endsWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsWith() {
        return endsWith;
    }

    /**
     * Sets the value of the endsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsWith(String value) {
        this.endsWith = value;
    }

    /**
     * Gets the value of the exact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExact() {
        return exact;
    }

    /**
     * Sets the value of the exact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExact(String value) {
        this.exact = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

}
