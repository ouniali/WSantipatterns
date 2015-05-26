
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NomenclatureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NomenclatureResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Nomenclatures" type="{https://NewHotel/Web/Services/}ArrayOfKeyValueIDCollectionResponseOfNomenclatureID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NomenclatureResponse", propOrder = {
    "workDate",
    "nomenclatures"
})
public class NomenclatureResponse
    extends BaseResponse
{

    @XmlElement(name = "WorkDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workDate;
    @XmlElement(name = "Nomenclatures")
    protected ArrayOfKeyValueIDCollectionResponseOfNomenclatureID nomenclatures;

    /**
     * Gets the value of the workDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkDate() {
        return workDate;
    }

    /**
     * Sets the value of the workDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkDate(XMLGregorianCalendar value) {
        this.workDate = value;
    }

    /**
     * Gets the value of the nomenclatures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueIDCollectionResponseOfNomenclatureID }
     *     
     */
    public ArrayOfKeyValueIDCollectionResponseOfNomenclatureID getNomenclatures() {
        return nomenclatures;
    }

    /**
     * Sets the value of the nomenclatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueIDCollectionResponseOfNomenclatureID }
     *     
     */
    public void setNomenclatures(ArrayOfKeyValueIDCollectionResponseOfNomenclatureID value) {
        this.nomenclatures = value;
    }

}
