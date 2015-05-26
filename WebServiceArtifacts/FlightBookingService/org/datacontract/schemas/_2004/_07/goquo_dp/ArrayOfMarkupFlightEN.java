
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarkupFlightEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarkupFlightEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkupFlightEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}MarkupFlightEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarkupFlightEN", propOrder = {
    "markupFlightEN"
})
public class ArrayOfMarkupFlightEN {

    @XmlElement(name = "MarkupFlightEN", nillable = true)
    protected List<MarkupFlightEN> markupFlightEN;

    /**
     * Gets the value of the markupFlightEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markupFlightEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkupFlightEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkupFlightEN }
     * 
     * 
     */
    public List<MarkupFlightEN> getMarkupFlightEN() {
        if (markupFlightEN == null) {
            markupFlightEN = new ArrayList<MarkupFlightEN>();
        }
        return this.markupFlightEN;
    }

}
