
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskRoomTypePriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskRoomTypePriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskRoomTypePriceInfo" type="{https://NewHotel/Web/Services/}KioskRoomTypePriceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskRoomTypePriceInfo", propOrder = {
    "kioskRoomTypePriceInfo"
})
public class ArrayOfKioskRoomTypePriceInfo {

    @XmlElement(name = "KioskRoomTypePriceInfo", nillable = true)
    protected List<KioskRoomTypePriceInfo> kioskRoomTypePriceInfo;

    /**
     * Gets the value of the kioskRoomTypePriceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskRoomTypePriceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskRoomTypePriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskRoomTypePriceInfo }
     * 
     * 
     */
    public List<KioskRoomTypePriceInfo> getKioskRoomTypePriceInfo() {
        if (kioskRoomTypePriceInfo == null) {
            kioskRoomTypePriceInfo = new ArrayList<KioskRoomTypePriceInfo>();
        }
        return this.kioskRoomTypePriceInfo;
    }

}
