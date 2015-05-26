
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NomenclatureRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NomenclatureRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Nomenclatures" type="{https://NewHotel/Web/Services/}ArrayOfNomenclatureID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NomenclatureRequest", propOrder = {
    "nomenclatures"
})
public class NomenclatureRequest
    extends BaseRequest
{

    @XmlElement(name = "Nomenclatures")
    protected ArrayOfNomenclatureID nomenclatures;

    /**
     * Gets the value of the nomenclatures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNomenclatureID }
     *     
     */
    public ArrayOfNomenclatureID getNomenclatures() {
        return nomenclatures;
    }

    /**
     * Sets the value of the nomenclatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNomenclatureID }
     *     
     */
    public void setNomenclatures(ArrayOfNomenclatureID value) {
        this.nomenclatures = value;
    }

}
