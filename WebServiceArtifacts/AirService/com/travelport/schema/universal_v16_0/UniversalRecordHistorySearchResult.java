
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Old" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ModifiedBy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ElementType" use="required" type="{http://www.travelport.com/schema/universal_v16_0}typeHistoryElement" />
 *       &lt;attribute name="Action" use="required" type="{http://www.travelport.com/schema/universal_v16_0}typeHistoryAction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "old",
    "_new"
})
@XmlRootElement(name = "UniversalRecordHistorySearchResult")
public class UniversalRecordHistorySearchResult {

    @XmlElement(name = "Old")
    protected String old;
    @XmlElement(name = "New")
    protected String _new;
    @XmlAttribute(name = "ModifiedBy", required = true)
    protected String modifiedBy;
    @XmlAttribute(name = "ModifiedDate", required = true)
    protected String modifiedDate;
    @XmlAttribute(name = "ElementType", required = true)
    protected TypeHistoryElement elementType;
    @XmlAttribute(name = "Action", required = true)
    protected TypeHistoryAction action;

    /**
     * Gets the value of the old property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOld() {
        return old;
    }

    /**
     * Sets the value of the old property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOld(String value) {
        this.old = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNew(String value) {
        this._new = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHistoryElement }
     *     
     */
    public TypeHistoryElement getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHistoryElement }
     *     
     */
    public void setElementType(TypeHistoryElement value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHistoryAction }
     *     
     */
    public TypeHistoryAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHistoryAction }
     *     
     */
    public void setAction(TypeHistoryAction value) {
        this.action = value;
    }

}
