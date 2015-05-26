
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInsuranceReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInsuranceReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceReservationEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}InsuranceReservationEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsuranceReservationEN", propOrder = {
    "insuranceReservationEN"
})
public class ArrayOfInsuranceReservationEN {

    @XmlElement(name = "InsuranceReservationEN", nillable = true)
    protected List<InsuranceReservationEN> insuranceReservationEN;

    /**
     * Gets the value of the insuranceReservationEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceReservationEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceReservationEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceReservationEN }
     * 
     * 
     */
    public List<InsuranceReservationEN> getInsuranceReservationEN() {
        if (insuranceReservationEN == null) {
            insuranceReservationEN = new ArrayList<InsuranceReservationEN>();
        }
        return this.insuranceReservationEN;
    }

}
