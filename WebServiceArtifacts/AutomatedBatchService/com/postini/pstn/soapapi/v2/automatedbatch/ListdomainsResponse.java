
package com.postini.pstn.soapapi.v2.automatedbatch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listdomainsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listdomainsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}domainRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listdomainsResponse", propOrder = {
    "domain"
})
public class ListdomainsResponse {

    protected List<DomainRecord> domain;

    /**
     * Gets the value of the domain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainRecord }
     * 
     * 
     */
    public List<DomainRecord> getDomain() {
        if (domain == null) {
            domain = new ArrayList<DomainRecord>();
        }
        return this.domain;
    }

}
