
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskRoomInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskRoomInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskRoomInfo" type="{https://NewHotel/Web/Services/}KioskRoomInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskRoomInfo", propOrder = {
    "kioskRoomInfo"
})
public class ArrayOfKioskRoomInfo {

    @XmlElement(name = "KioskRoomInfo", nillable = true)
    protected List<KioskRoomInfo> kioskRoomInfo;

    /**
     * Gets the value of the kioskRoomInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskRoomInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskRoomInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskRoomInfo }
     * 
     * 
     */
    public List<KioskRoomInfo> getKioskRoomInfo() {
        if (kioskRoomInfo == null) {
            kioskRoomInfo = new ArrayList<KioskRoomInfo>();
        }
        return this.kioskRoomInfo;
    }

}
