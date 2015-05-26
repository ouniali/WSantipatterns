
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyList" type="{http://services.digikey.com/SearchWS}ArrayOfFamily" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cid" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "familyList"
})
public class Category {

    @XmlElement(name = "FamilyList")
    protected ArrayOfFamily familyList;
    @XmlAttribute(name = "cid", required = true)
    protected int cid;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the familyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFamily }
     *     
     */
    public ArrayOfFamily getFamilyList() {
        return familyList;
    }

    /**
     * Sets the value of the familyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFamily }
     *     
     */
    public void setFamilyList(ArrayOfFamily value) {
        this.familyList = value;
    }

    /**
     * Gets the value of the cid property.
     * 
     */
    public int getCid() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     */
    public void setCid(int value) {
        this.cid = value;
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

}
