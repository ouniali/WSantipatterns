
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueIDResponseOfNomenclatureID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueIDResponseOfNomenclatureID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueIDResponseOfNomenclatureID" type="{https://NewHotel/Web/Services/}KeyValueIDResponseOfNomenclatureID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueIDResponseOfNomenclatureID", propOrder = {
    "keyValueIDResponseOfNomenclatureID"
})
public class ArrayOfKeyValueIDResponseOfNomenclatureID {

    @XmlElement(name = "KeyValueIDResponseOfNomenclatureID", nillable = true)
    protected List<KeyValueIDResponseOfNomenclatureID> keyValueIDResponseOfNomenclatureID;

    /**
     * Gets the value of the keyValueIDResponseOfNomenclatureID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueIDResponseOfNomenclatureID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueIDResponseOfNomenclatureID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueIDResponseOfNomenclatureID }
     * 
     * 
     */
    public List<KeyValueIDResponseOfNomenclatureID> getKeyValueIDResponseOfNomenclatureID() {
        if (keyValueIDResponseOfNomenclatureID == null) {
            keyValueIDResponseOfNomenclatureID = new ArrayList<KeyValueIDResponseOfNomenclatureID>();
        }
        return this.keyValueIDResponseOfNomenclatureID;
    }

}
