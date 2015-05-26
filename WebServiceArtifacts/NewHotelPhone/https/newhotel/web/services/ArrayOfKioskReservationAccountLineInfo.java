
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskReservationAccountLineInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskReservationAccountLineInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskReservationAccountLineInfo" type="{https://NewHotel/Web/Services/}KioskReservationAccountLineInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskReservationAccountLineInfo", propOrder = {
    "kioskReservationAccountLineInfo"
})
public class ArrayOfKioskReservationAccountLineInfo {

    @XmlElement(name = "KioskReservationAccountLineInfo", nillable = true)
    protected List<KioskReservationAccountLineInfo> kioskReservationAccountLineInfo;

    /**
     * Gets the value of the kioskReservationAccountLineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskReservationAccountLineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskReservationAccountLineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskReservationAccountLineInfo }
     * 
     * 
     */
    public List<KioskReservationAccountLineInfo> getKioskReservationAccountLineInfo() {
        if (kioskReservationAccountLineInfo == null) {
            kioskReservationAccountLineInfo = new ArrayList<KioskReservationAccountLineInfo>();
        }
        return this.kioskReservationAccountLineInfo;
    }

}
