
package org.cuahsi.waterml._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TsValuesSingleVariableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TsValuesSingleVariableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.cuahsi.org/waterML/1.0/}ValueSingleVariable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qualifier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="qualifierCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;attribute name="qualifierID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="qualityControlLevel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qualityControlLevelID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="qualityControlLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="timeZoneShiftApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="unitsAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitsCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="unitsType" type="{http://www.cuahsi.org/waterML/1.0/}UnitsTypeEnum" />
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="unitsAreConverted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TsValuesSingleVariableType", propOrder = {
    "value",
    "qualifier",
    "qualityControlLevel"
})
public class TsValuesSingleVariableType {

    protected List<ValueSingleVariable> value;
    protected List<TsValuesSingleVariableType.Qualifier> qualifier;
    protected TsValuesSingleVariableType.QualityControlLevel qualityControlLevel;
    @XmlAttribute(name = "timeZoneShiftApplied")
    protected Boolean timeZoneShiftApplied;
    @XmlAttribute(name = "unitsAbbreviation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitsAbbreviation;
    @XmlAttribute(name = "unitsCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unitsCode;
    @XmlAttribute(name = "unitsType")
    protected UnitsTypeEnum unitsType;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute(name = "unitsAreConverted")
    protected Boolean unitsAreConverted;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSingleVariable }
     * 
     * 
     */
    public List<ValueSingleVariable> getValue() {
        if (value == null) {
            value = new ArrayList<ValueSingleVariable>();
        }
        return this.value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TsValuesSingleVariableType.Qualifier }
     * 
     * 
     */
    public List<TsValuesSingleVariableType.Qualifier> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<TsValuesSingleVariableType.Qualifier>();
        }
        return this.qualifier;
    }

    /**
     * Gets the value of the qualityControlLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TsValuesSingleVariableType.QualityControlLevel }
     *     
     */
    public TsValuesSingleVariableType.QualityControlLevel getQualityControlLevel() {
        return qualityControlLevel;
    }

    /**
     * Sets the value of the qualityControlLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TsValuesSingleVariableType.QualityControlLevel }
     *     
     */
    public void setQualityControlLevel(TsValuesSingleVariableType.QualityControlLevel value) {
        this.qualityControlLevel = value;
    }

    /**
     * Gets the value of the timeZoneShiftApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeZoneShiftApplied() {
        return timeZoneShiftApplied;
    }

    /**
     * Sets the value of the timeZoneShiftApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeZoneShiftApplied(Boolean value) {
        this.timeZoneShiftApplied = value;
    }

    /**
     * Gets the value of the unitsAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsAbbreviation() {
        return unitsAbbreviation;
    }

    /**
     * Sets the value of the unitsAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsAbbreviation(String value) {
        this.unitsAbbreviation = value;
    }

    /**
     * Gets the value of the unitsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsCode() {
        return unitsCode;
    }

    /**
     * Sets the value of the unitsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsCode(String value) {
        this.unitsCode = value;
    }

    /**
     * Gets the value of the unitsType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsTypeEnum }
     *     
     */
    public UnitsTypeEnum getUnitsType() {
        return unitsType;
    }

    /**
     * Sets the value of the unitsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsTypeEnum }
     *     
     */
    public void setUnitsType(UnitsTypeEnum value) {
        this.unitsType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the unitsAreConverted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnitsAreConverted() {
        if (unitsAreConverted == null) {
            return false;
        } else {
            return unitsAreConverted;
        }
    }

    /**
     * Sets the value of the unitsAreConverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnitsAreConverted(Boolean value) {
        this.unitsAreConverted = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="qualifierCode" type="{http://www.w3.org/2001/XMLSchema}token" />
     *       &lt;attribute name="qualifierID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Qualifier {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "qualifierCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String qualifierCode;
        @XmlAttribute(name = "qualifierID")
        protected BigInteger qualifierID;
        @XmlAttribute(name = "oid")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String oid;
        @XmlAttribute(name = "metadataDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar metadataDateTime;
        @XmlAttribute(name = "network")
        protected String network;
        @XmlAttribute(name = "vocabulary")
        protected String vocabulary;
        @XmlAttribute(name = "default")
        protected Boolean _default;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the qualifierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifierCode() {
            return qualifierCode;
        }

        /**
         * Sets the value of the qualifierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifierCode(String value) {
            this.qualifierCode = value;
        }

        /**
         * Gets the value of the qualifierID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQualifierID() {
            return qualifierID;
        }

        /**
         * Sets the value of the qualifierID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQualifierID(BigInteger value) {
            this.qualifierID = value;
        }

        /**
         * Gets the value of the oid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOid() {
            return oid;
        }

        /**
         * Sets the value of the oid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOid(String value) {
            this.oid = value;
        }

        /**
         * Gets the value of the metadataDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMetadataDateTime() {
            return metadataDateTime;
        }

        /**
         * Sets the value of the metadataDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMetadataDateTime(XMLGregorianCalendar value) {
            this.metadataDateTime = value;
        }

        /**
         * Gets the value of the network property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetwork() {
            return network;
        }

        /**
         * Sets the value of the network property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetwork(String value) {
            this.network = value;
        }

        /**
         * Gets the value of the vocabulary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVocabulary() {
            return vocabulary;
        }

        /**
         * Sets the value of the vocabulary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVocabulary(String value) {
            this.vocabulary = value;
        }

        /**
         * Gets the value of the default property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

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
     *         &lt;element name="qualityControlLevelID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="qualityControlLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "qualityControlLevelID"
    })
    public static class QualityControlLevel {

        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String qualityControlLevelID;
        @XmlAttribute(name = "qualityControlLevelCode")
        protected String qualityControlLevelCode;
        @XmlAttribute(name = "oid")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String oid;
        @XmlAttribute(name = "metadataDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar metadataDateTime;
        @XmlAttribute(name = "network")
        protected String network;
        @XmlAttribute(name = "vocabulary")
        protected String vocabulary;
        @XmlAttribute(name = "default")
        protected Boolean _default;

        /**
         * Gets the value of the qualityControlLevelID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityControlLevelID() {
            return qualityControlLevelID;
        }

        /**
         * Sets the value of the qualityControlLevelID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityControlLevelID(String value) {
            this.qualityControlLevelID = value;
        }

        /**
         * Gets the value of the qualityControlLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityControlLevelCode() {
            return qualityControlLevelCode;
        }

        /**
         * Sets the value of the qualityControlLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityControlLevelCode(String value) {
            this.qualityControlLevelCode = value;
        }

        /**
         * Gets the value of the oid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOid() {
            return oid;
        }

        /**
         * Sets the value of the oid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOid(String value) {
            this.oid = value;
        }

        /**
         * Gets the value of the metadataDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMetadataDateTime() {
            return metadataDateTime;
        }

        /**
         * Sets the value of the metadataDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMetadataDateTime(XMLGregorianCalendar value) {
            this.metadataDateTime = value;
        }

        /**
         * Gets the value of the network property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetwork() {
            return network;
        }

        /**
         * Sets the value of the network property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetwork(String value) {
            this.network = value;
        }

        /**
         * Gets the value of the vocabulary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVocabulary() {
            return vocabulary;
        }

        /**
         * Sets the value of the vocabulary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVocabulary(String value) {
            this.vocabulary = value;
        }

        /**
         * Gets the value of the default property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

    }

}
