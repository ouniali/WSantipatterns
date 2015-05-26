
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFareRulesEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFareRulesEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRulesEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FareRulesEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFareRulesEN", propOrder = {
    "fareRulesEN"
})
public class ArrayOfFareRulesEN {

    @XmlElement(name = "FareRulesEN", nillable = true)
    protected List<FareRulesEN> fareRulesEN;

    /**
     * Gets the value of the fareRulesEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRulesEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRulesEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRulesEN }
     * 
     * 
     */
    public List<FareRulesEN> getFareRulesEN() {
        if (fareRulesEN == null) {
            fareRulesEN = new ArrayList<FareRulesEN>();
        }
        return this.fareRulesEN;
    }

}
