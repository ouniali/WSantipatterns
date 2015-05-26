
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskReservationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskReservationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskReservationDetail" type="{https://NewHotel/Web/Services/}KioskReservationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskReservationDetail", propOrder = {
    "kioskReservationDetail"
})
public class ArrayOfKioskReservationDetail {

    @XmlElement(name = "KioskReservationDetail", nillable = true)
    protected List<KioskReservationDetail> kioskReservationDetail;

    /**
     * Gets the value of the kioskReservationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskReservationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskReservationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskReservationDetail }
     * 
     * 
     */
    public List<KioskReservationDetail> getKioskReservationDetail() {
        if (kioskReservationDetail == null) {
            kioskReservationDetail = new ArrayList<KioskReservationDetail>();
        }
        return this.kioskReservationDetail;
    }

}
