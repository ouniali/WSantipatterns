
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tParameterGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tParameterGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameterGroups" type="{http://ws.gdsp.vodafone.com/}tParameterDetails" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tParameterGroup", propOrder = {
    "restriction",
    "parameterGroups"
})
public class TParameterGroup {

    @XmlElement(required = true)
    protected String restriction;
    @XmlElement(nillable = true)
    protected List<TParameterDetails> parameterGroups;

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the parameterGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TParameterDetails }
     * 
     * 
     */
    public List<TParameterDetails> getParameterGroups() {
        if (parameterGroups == null) {
            parameterGroups = new ArrayList<TParameterDetails>();
        }
        return this.parameterGroups;
    }

}
