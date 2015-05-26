
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CharityConcession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityConcession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endorsementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="effectiveTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityConcession", propOrder = {
    "endorsementType",
    "effectiveFrom",
    "effectiveTo"
})
public class CharityConcession {

    protected String endorsementType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveTo;

    /**
     * Gets the value of the endorsementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementType() {
        return endorsementType;
    }

    /**
     * Sets the value of the endorsementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementType(String value) {
        this.endorsementType = value;
    }

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
