
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddressDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}Address">
 *       &lt;sequence>
 *         &lt;element name="effectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="effectiveTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDetails", propOrder = {
    "effectiveFrom",
    "effectiveTo"
})
public class AddressDetails
    extends Address
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveTo;

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveFrom(XMLGregorianCalendar value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the effectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveTo() {
        return effectiveTo;
    }

    /**
     * Sets the value of the effectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveTo(XMLGregorianCalendar value) {
        this.effectiveTo = value;
    }

}
