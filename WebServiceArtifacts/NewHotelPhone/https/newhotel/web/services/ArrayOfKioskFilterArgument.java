
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKioskFilterArgument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKioskFilterArgument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskFilterArgument" type="{https://NewHotel/Web/Services/}KioskFilterArgument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKioskFilterArgument", propOrder = {
    "kioskFilterArgument"
})
public class ArrayOfKioskFilterArgument {

    @XmlElement(name = "KioskFilterArgument", nillable = true)
    protected List<KioskFilterArgument> kioskFilterArgument;

    /**
     * Gets the value of the kioskFilterArgument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kioskFilterArgument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKioskFilterArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KioskFilterArgument }
     * 
     * 
     */
    public List<KioskFilterArgument> getKioskFilterArgument() {
        if (kioskFilterArgument == null) {
            kioskFilterArgument = new ArrayList<KioskFilterArgument>();
        }
        return this.kioskFilterArgument;
    }

}
