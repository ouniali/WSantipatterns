
package com.tourico.schemas.webservices.hotelv3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermAndConditionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermAndConditionsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TermAndConditions" type="{http://schemas.tourico.com/webservices/hotelv3}TermAndCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermAndConditionsResult", propOrder = {
    "termAndConditions"
})
public class TermAndConditionsResult {

    @XmlElement(name = "TermAndConditions")
    protected List<TermAndCondition> termAndConditions;

    /**
     * Gets the value of the termAndConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termAndConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermAndConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermAndCondition }
     * 
     * 
     */
    public List<TermAndCondition> getTermAndConditions() {
        if (termAndConditions == null) {
            termAndConditions = new ArrayList<TermAndCondition>();
        }
        return this.termAndConditions;
    }

}
