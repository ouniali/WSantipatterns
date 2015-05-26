
package ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import transfer.ws_2013.TransferBookingResult;


/**
 * <p>Java class for ArrayOfTransferBookingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransferBookingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferBookingResult" type="{WS_2013.Transfer}TransferBookingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransferBookingResult", propOrder = {
    "transferBookingResult"
})
public class ArrayOfTransferBookingResult {

    @XmlElement(name = "TransferBookingResult", nillable = true)
    protected List<TransferBookingResult> transferBookingResult;

    /**
     * Gets the value of the transferBookingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferBookingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferBookingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferBookingResult }
     * 
     * 
     */
    public List<TransferBookingResult> getTransferBookingResult() {
        if (transferBookingResult == null) {
            transferBookingResult = new ArrayList<TransferBookingResult>();
        }
        return this.transferBookingResult;
    }

}
