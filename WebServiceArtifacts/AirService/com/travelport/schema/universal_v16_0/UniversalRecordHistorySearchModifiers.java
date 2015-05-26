
package com.travelport.schema.universal_v16_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementType" type="{http://www.travelport.com/schema/universal_v16_0}typeHistoryElement" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ModifiedRange">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="ModifiedStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     &lt;element name="ModifiedEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxResults" type="{http://www.travelport.com/schema/common_v15_0}typeMaxResults" default="20" />
 *       &lt;attribute name="StartFromResult" type="{http://www.travelport.com/schema/common_v15_0}typeStartFromResult" default="1" />
 *       &lt;attribute name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "elementType",
    "modifiedDate",
    "modifiedRange"
})
@XmlRootElement(name = "UniversalRecordHistorySearchModifiers")
public class UniversalRecordHistorySearchModifiers {

    @XmlElement(name = "ElementType")
    @XmlSchemaType(name = "string")
    protected TypeHistoryElement elementType;
    @XmlElement(name = "ModifiedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "ModifiedRange")
    protected UniversalRecordHistorySearchModifiers.ModifiedRange modifiedRange;
    @XmlAttribute(name = "MaxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "StartFromResult")
    protected BigInteger startFromResult;
    @XmlAttribute(name = "ModifiedBy")
    @XmlSchemaType(name = "anySimpleType")
    protected String modifiedBy;

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHistoryElement }
     *     
     */
    public TypeHistoryElement getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHistoryElement }
     *     
     */
    public void setElementType(TypeHistoryElement value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the modifiedRange property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecordHistorySearchModifiers.ModifiedRange }
     *     
     */
    public UniversalRecordHistorySearchModifiers.ModifiedRange getModifiedRange() {
        return modifiedRange;
    }

    /**
     * Sets the value of the modifiedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecordHistorySearchModifiers.ModifiedRange }
     *     
     */
    public void setModifiedRange(UniversalRecordHistorySearchModifiers.ModifiedRange value) {
        this.modifiedRange = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxResults() {
        if (maxResults == null) {
            return  20;
        } else {
            return maxResults;
        }
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the startFromResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartFromResult() {
        if (startFromResult == null) {
            return new BigInteger("1");
        } else {
            return startFromResult;
        }
    }

    /**
     * Sets the value of the startFromResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartFromResult(BigInteger value) {
        this.startFromResult = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
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
     *       &lt;sequence>
     *         &lt;element name="ModifiedStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="ModifiedEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modifiedStart",
        "modifiedEnd"
    })
    public static class ModifiedRange {

        @XmlElement(name = "ModifiedStart", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar modifiedStart;
        @XmlElement(name = "ModifiedEnd", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar modifiedEnd;

        /**
         * Gets the value of the modifiedStart property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModifiedStart() {
            return modifiedStart;
        }

        /**
         * Sets the value of the modifiedStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModifiedStart(XMLGregorianCalendar value) {
            this.modifiedStart = value;
        }

        /**
         * Gets the value of the modifiedEnd property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModifiedEnd() {
            return modifiedEnd;
        }

        /**
         * Sets the value of the modifiedEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModifiedEnd(XMLGregorianCalendar value) {
            this.modifiedEnd = value;
        }

    }

}
