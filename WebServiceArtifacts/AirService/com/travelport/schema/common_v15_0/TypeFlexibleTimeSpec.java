
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type which can be used for flexible date/time specification -extends the generic type typeTimeSpec to provide extra options for search.
 * 
 * <p>Java class for typeFlexibleTimeSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeFlexibleTimeSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typeTimeSpec">
 *       &lt;sequence>
 *         &lt;element name="SearchExtraDays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFlexibleTimeSpec", propOrder = {
    "searchExtraDays"
})
public class TypeFlexibleTimeSpec
    extends TypeTimeSpec
{

    @XmlElement(name = "SearchExtraDays")
    protected TypeFlexibleTimeSpec.SearchExtraDays searchExtraDays;

    /**
     * Gets the value of the searchExtraDays property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFlexibleTimeSpec.SearchExtraDays }
     *     
     */
    public TypeFlexibleTimeSpec.SearchExtraDays getSearchExtraDays() {
        return searchExtraDays;
    }

    /**
     * Sets the value of the searchExtraDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFlexibleTimeSpec.SearchExtraDays }
     *     
     */
    public void setSearchExtraDays(TypeFlexibleTimeSpec.SearchExtraDays value) {
        this.searchExtraDays = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SearchExtraDays {

        @XmlAttribute(name = "DaysBefore")
        protected Integer daysBefore;
        @XmlAttribute(name = "DaysAfter")
        protected Integer daysAfter;

        /**
         * Gets the value of the daysBefore property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDaysBefore() {
            return daysBefore;
        }

        /**
         * Sets the value of the daysBefore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDaysBefore(Integer value) {
            this.daysBefore = value;
        }

        /**
         * Gets the value of the daysAfter property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDaysAfter() {
            return daysAfter;
        }

        /**
         * Sets the value of the daysAfter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDaysAfter(Integer value) {
            this.daysAfter = value;
        }

    }

}
