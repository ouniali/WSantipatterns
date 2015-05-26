
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v15_0.TypeDateRange;


/**
 * Specifies dates as either specific date or a date range
 * 
 * <p>Java class for typeDateSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeDateSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateRange" type="{http://www.travelport.com/schema/common_v15_0}typeDateRange" minOccurs="0"/>
 *         &lt;element name="SpecificDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDateSpec", propOrder = {
    "dateRange",
    "specificDate"
})
public class TypeDateSpec {

    @XmlElement(name = "DateRange")
    protected TypeDateRange dateRange;
    @XmlElement(name = "SpecificDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar specificDate;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateRange }
     *     
     */
    public TypeDateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateRange }
     *     
     */
    public void setDateRange(TypeDateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the specificDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecificDate() {
        return specificDate;
    }

    /**
     * Sets the value of the specificDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecificDate(XMLGregorianCalendar value) {
        this.specificDate = value;
    }

}
