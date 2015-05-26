
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskRoomTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskRoomTypeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskRoomTypeInfo" type="{https://NewHotel/Web/Services/}KioskRoomTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskRoomTypeInfo", propOrder = {
    "kioskRoomTypeInfo"
})
public class ArrayOfKioskRoomTypeInfo {

    @XmlElement(name = "KioskRoomTypeInfo", nillable = true)
    protected List<KioskRoomTypeInfo> kioskRoomTypeInfo;

    /**
     * Gets the value of the kioskRoomTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskRoomTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskRoomTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskRoomTypeInfo }
     * 
     * 
     */
    public List<KioskRoomTypeInfo> getKioskRoomTypeInfo() {
        if (kioskRoomTypeInfo == null) {
            kioskRoomTypeInfo = new ArrayList<KioskRoomTypeInfo>();
        }
        return this.kioskRoomTypeInfo;
    }

}
