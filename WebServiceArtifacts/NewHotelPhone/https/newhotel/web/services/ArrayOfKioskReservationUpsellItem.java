
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskReservationUpsellItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskReservationUpsellItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskReservationUpsellItem" type="{https://NewHotel/Web/Services/}KioskReservationUpsellItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskReservationUpsellItem", propOrder = {
    "kioskReservationUpsellItem"
})
public class ArrayOfKioskReservationUpsellItem {

    @XmlElement(name = "KioskReservationUpsellItem", nillable = true)
    protected List<KioskReservationUpsellItem> kioskReservationUpsellItem;

    /**
     * Gets the value of the kioskReservationUpsellItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskReservationUpsellItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskReservationUpsellItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskReservationUpsellItem }
     * 
     * 
     */
    public List<KioskReservationUpsellItem> getKioskReservationUpsellItem() {
        if (kioskReservationUpsellItem == null) {
            kioskReservationUpsellItem = new ArrayList<KioskReservationUpsellItem>();
        }
        return this.kioskReservationUpsellItem;
    }

}
