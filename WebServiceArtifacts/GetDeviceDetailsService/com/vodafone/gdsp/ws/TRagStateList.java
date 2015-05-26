
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tRagStateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRagStateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ragState" type="{http://ws.gdsp.vodafone.com/}tRagOptions" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRagStateList", propOrder = {
    "ragState"
})
public class TRagStateList {

    @XmlSchemaType(name = "string")
    protected List<TRagOptions> ragState;

    /**
     * Gets the value of the ragState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ragState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRagState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRagOptions }
     * 
     * 
     */
    public List<TRagOptions> getRagState() {
        if (ragState == null) {
            ragState = new ArrayList<TRagOptions>();
        }
        return this.ragState;
    }

}
