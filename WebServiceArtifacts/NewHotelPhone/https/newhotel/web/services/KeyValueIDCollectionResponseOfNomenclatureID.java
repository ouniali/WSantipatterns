
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValueIDCollectionResponseOfNomenclatureID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValueIDCollectionResponseOfNomenclatureID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{https://NewHotel/Web/Services/}NomenclatureID"/>
 *         &lt;element name="Items" type="{https://NewHotel/Web/Services/}ArrayOfKeyValueResponseOfNomenclatureID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueIDCollectionResponseOfNomenclatureID", propOrder = {
    "id",
    "items"
})
public class KeyValueIDCollectionResponseOfNomenclatureID {

    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "string")
    protected NomenclatureID id;
    @XmlElement(name = "Items")
    protected ArrayOfKeyValueResponseOfNomenclatureID items;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureID }
     *     
     */
    public NomenclatureID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureID }
     *     
     */
    public void setID(NomenclatureID value) {
        this.id = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueResponseOfNomenclatureID }
     *     
     */
    public ArrayOfKeyValueResponseOfNomenclatureID getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueResponseOfNomenclatureID }
     *     
     */
    public void setItems(ArrayOfKeyValueResponseOfNomenclatureID value) {
        this.items = value;
    }

}
