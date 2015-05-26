
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValueIDResponseOfNomenclatureID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValueIDResponseOfNomenclatureID">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KeyValueResponseOfNomenclatureID">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{https://NewHotel/Web/Services/}NomenclatureID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueIDResponseOfNomenclatureID", propOrder = {
    "id"
})
public class KeyValueIDResponseOfNomenclatureID
    extends KeyValueResponseOfNomenclatureID
{

    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "string")
    protected NomenclatureID id;

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

}
