
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskReservationInvoiceLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskReservationInvoiceLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskReservationInvoiceLine" type="{https://NewHotel/Web/Services/}KioskReservationInvoiceLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskReservationInvoiceLine", propOrder = {
    "kioskReservationInvoiceLine"
})
public class ArrayOfKioskReservationInvoiceLine {

    @XmlElement(name = "KioskReservationInvoiceLine", nillable = true)
    protected List<KioskReservationInvoiceLine> kioskReservationInvoiceLine;

    /**
     * Gets the value of the kioskReservationInvoiceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskReservationInvoiceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskReservationInvoiceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskReservationInvoiceLine }
     * 
     * 
     */
    public List<KioskReservationInvoiceLine> getKioskReservationInvoiceLine() {
        if (kioskReservationInvoiceLine == null) {
            kioskReservationInvoiceLine = new ArrayList<KioskReservationInvoiceLine>();
        }
        return this.kioskReservationInvoiceLine;
    }

}
