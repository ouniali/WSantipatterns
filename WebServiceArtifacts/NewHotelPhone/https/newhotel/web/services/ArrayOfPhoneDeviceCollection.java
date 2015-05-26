
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPhoneDeviceCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPhoneDeviceCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhoneDeviceCollection" type="{https://NewHotel/Web/Services/}PhoneDeviceCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhoneDeviceCollection", propOrder = {
    "phoneDeviceCollection"
})
public class ArrayOfPhoneDeviceCollection {

    @XmlElement(name = "PhoneDeviceCollection", nillable = true)
    protected List<PhoneDeviceCollection> phoneDeviceCollection;

    /**
     * Gets the value of the phoneDeviceCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneDeviceCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneDeviceCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneDeviceCollection }
     * 
     * 
     */
    public List<PhoneDeviceCollection> getPhoneDeviceCollection() {
        if (phoneDeviceCollection == null) {
            phoneDeviceCollection = new ArrayList<PhoneDeviceCollection>();
        }
        return this.phoneDeviceCollection;
    }

}
