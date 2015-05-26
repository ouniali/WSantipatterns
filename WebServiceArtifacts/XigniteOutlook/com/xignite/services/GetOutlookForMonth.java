
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="OutlookType" type="{http://www.xignite.com/services/}OutlookTypes"/>
 *         &lt;element name="ForDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "outlookType",
    "forDate"
})
@XmlRootElement(name = "GetOutlookForMonth")
public class GetOutlookForMonth {

    @XmlList
    @XmlElement(name = "OutlookType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> outlookType;
    @XmlElement(name = "ForDate")
    protected String forDate;

    /**
     * Gets the value of the outlookType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outlookType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutlookType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutlookType() {
        if (outlookType == null) {
            outlookType = new ArrayList<String>();
        }
        return this.outlookType;
    }

    /**
     * Gets the value of the forDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForDate() {
        return forDate;
    }

    /**
     * Sets the value of the forDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForDate(String value) {
        this.forDate = value;
    }

}
