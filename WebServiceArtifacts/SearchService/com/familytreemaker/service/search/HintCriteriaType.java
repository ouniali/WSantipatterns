
package com.familytreemaker.service.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HintCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HintCriteriaType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:service.familytreemaker.com/Search}SearchCriteriaType">
 *       &lt;attribute name="Filter" default="TREES RECORDS">
 *         &lt;simpleType>
 *           &lt;list>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="TREES"/>
 *                 &lt;enumeration value="RECORDS"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/list>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HintCriteriaType")
public class HintCriteriaType
    extends SearchCriteriaType
{

    @XmlAttribute(name = "Filter")
    protected List<String> filter;

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilter() {
        if (filter == null) {
            filter = new ArrayList<String>();
        }
        return this.filter;
    }

}
