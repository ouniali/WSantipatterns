
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransferReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransferReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferReservationEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}TransferReservationEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransferReservationEN", propOrder = {
    "transferReservationEN"
})
public class ArrayOfTransferReservationEN {

    @XmlElement(name = "TransferReservationEN", nillable = true)
    protected List<TransferReservationEN> transferReservationEN;

    /**
     * Gets the value of the transferReservationEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferReservationEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferReservationEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferReservationEN }
     * 
     * 
     */
    public List<TransferReservationEN> getTransferReservationEN() {
        if (transferReservationEN == null) {
            transferReservationEN = new ArrayList<TransferReservationEN>();
        }
        return this.transferReservationEN;
    }

}
