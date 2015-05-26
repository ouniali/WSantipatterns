
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultCounts" type="{http://vlbapi.bvdep.com/}ArrayOfDataBaseResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchInfo", propOrder = {
    "id",
    "resultCounts"
})
public class SearchInfo {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ResultCounts")
    protected ArrayOfDataBaseResult resultCounts;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the resultCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataBaseResult }
     *     
     */
    public ArrayOfDataBaseResult getResultCounts() {
        return resultCounts;
    }

    /**
     * Sets the value of the resultCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataBaseResult }
     *     
     */
    public void setResultCounts(ArrayOfDataBaseResult value) {
        this.resultCounts = value;
    }

}
