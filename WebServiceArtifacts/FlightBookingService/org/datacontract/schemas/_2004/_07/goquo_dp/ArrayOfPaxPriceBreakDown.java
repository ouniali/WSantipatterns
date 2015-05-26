
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaxPriceBreakDown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaxPriceBreakDown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxPriceBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PaxPriceBreakDown" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaxPriceBreakDown", propOrder = {
    "paxPriceBreakDown"
})
public class ArrayOfPaxPriceBreakDown {

    @XmlElement(name = "PaxPriceBreakDown", nillable = true)
    protected List<PaxPriceBreakDown> paxPriceBreakDown;

    /**
     * Gets the value of the paxPriceBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxPriceBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxPriceBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxPriceBreakDown }
     * 
     * 
     */
    public List<PaxPriceBreakDown> getPaxPriceBreakDown() {
        if (paxPriceBreakDown == null) {
            paxPriceBreakDown = new ArrayList<PaxPriceBreakDown>();
        }
        return this.paxPriceBreakDown;
    }

}
