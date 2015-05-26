
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskReservationInvoiceTaxLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskReservationInvoiceTaxLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskReservationInvoiceTaxLine" type="{https://NewHotel/Web/Services/}KioskReservationInvoiceTaxLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskReservationInvoiceTaxLine", propOrder = {
    "kioskReservationInvoiceTaxLine"
})
public class ArrayOfKioskReservationInvoiceTaxLine {

    @XmlElement(name = "KioskReservationInvoiceTaxLine", nillable = true)
    protected List<KioskReservationInvoiceTaxLine> kioskReservationInvoiceTaxLine;

    /**
     * Gets the value of the kioskReservationInvoiceTaxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskReservationInvoiceTaxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskReservationInvoiceTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskReservationInvoiceTaxLine }
     * 
     * 
     */
    public List<KioskReservationInvoiceTaxLine> getKioskReservationInvoiceTaxLine() {
        if (kioskReservationInvoiceTaxLine == null) {
            kioskReservationInvoiceTaxLine = new ArrayList<KioskReservationInvoiceTaxLine>();
        }
        return this.kioskReservationInvoiceTaxLine;
    }

}
