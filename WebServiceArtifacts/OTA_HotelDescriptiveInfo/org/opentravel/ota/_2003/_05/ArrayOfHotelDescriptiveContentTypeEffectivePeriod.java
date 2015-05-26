
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelDescriptiveContentTypeEffectivePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelDescriptiveContentTypeEffectivePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectivePeriod" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelDescriptiveContentTypeEffectivePeriod", propOrder = {
    "effectivePeriod"
})
public class ArrayOfHotelDescriptiveContentTypeEffectivePeriod {

    @XmlElement(name = "EffectivePeriod")
    protected List<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod> effectivePeriod;

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod }
     * 
     * 
     */
    public List<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod> getEffectivePeriod() {
        if (effectivePeriod == null) {
            effectivePeriod = new ArrayList<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod>();
        }
        return this.effectivePeriod;
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
     *       &lt;attribute name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EffectivePeriod {

        @XmlAttribute(name = "StartPeriod")
        protected String startPeriod;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "EndPeriod")
        protected String endPeriod;

        /**
         * Gets the value of the startPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartPeriod() {
            return startPeriod;
        }

        /**
         * Sets the value of the startPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartPeriod(String value) {
            this.startPeriod = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the endPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndPeriod() {
            return endPeriod;
        }

        /**
         * Sets the value of the endPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndPeriod(String value) {
            this.endPeriod = value;
        }

    }

}
