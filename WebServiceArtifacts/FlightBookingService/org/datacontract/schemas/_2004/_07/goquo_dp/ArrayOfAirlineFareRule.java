
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAirlineFareRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAirlineFareRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineFareRule" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineFareRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAirlineFareRule", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "airlineFareRule"
})
public class ArrayOfAirlineFareRule {

    @XmlElement(name = "AirlineFareRule", nillable = true)
    protected List<AirlineFareRule> airlineFareRule;

    /**
     * Gets the value of the airlineFareRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineFareRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineFareRule }
     * 
     * 
     */
    public List<AirlineFareRule> getAirlineFareRule() {
        if (airlineFareRule == null) {
            airlineFareRule = new ArrayList<AirlineFareRule>();
        }
        return this.airlineFareRule;
    }

}
