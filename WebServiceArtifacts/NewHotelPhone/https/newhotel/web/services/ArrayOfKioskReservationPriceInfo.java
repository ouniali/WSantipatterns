
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskReservationPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskReservationPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskReservationPriceInfo" type="{https://NewHotel/Web/Services/}KioskReservationPriceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskReservationPriceInfo", propOrder = {
    "kioskReservationPriceInfo"
})
public class ArrayOfKioskReservationPriceInfo {

    @XmlElement(name = "KioskReservationPriceInfo", nillable = true)
    protected List<KioskReservationPriceInfo> kioskReservationPriceInfo;

    /**
     * Gets the value of the kioskReservationPriceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskReservationPriceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskReservationPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskReservationPriceInfo }
     * 
     * 
     */
    public List<KioskReservationPriceInfo> getKioskReservationPriceInfo() {
        if (kioskReservationPriceInfo == null) {
            kioskReservationPriceInfo = new ArrayList<KioskReservationPriceInfo>();
        }
        return this.kioskReservationPriceInfo;
    }

}
