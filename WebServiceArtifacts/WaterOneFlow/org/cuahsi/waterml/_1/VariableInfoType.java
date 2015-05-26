
package org.cuahsi.waterml._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VariableInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variableCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="variableID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="variableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueType" type="{http://www.cuahsi.org/waterML/1.0/}valueTypeEnum" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.cuahsi.org/waterML/1.0/}dataTypeEnum" minOccurs="0"/>
 *         &lt;element name="generalCategory" type="{http://www.cuahsi.org/waterML/1.0/}generalCategoryEnum" minOccurs="0"/>
 *         &lt;element name="sampleMedium" type="{http://www.cuahsi.org/waterML/1.0/}SampleMediumEnum" minOccurs="0"/>
 *         &lt;element name="units" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="unitsAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="unitsCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;attribute name="unitsType" type="{http://www.cuahsi.org/waterML/1.0/}UnitsTypeEnum" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="options" type="{http://www.cuahsi.org/waterML/1.0/}ArrayOfOption" minOccurs="0"/>
 *         &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="related" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parentID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="relatedID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="NoDataValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeSupport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unit" type="{http://www.cuahsi.org/waterML/1.0/}UnitsType" minOccurs="0"/>
 *                   &lt;element name="timeInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="isRegular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableInfoType", propOrder = {
    "variableCode",
    "variableName",
    "variableDescription",
    "valueType",
    "dataType",
    "generalCategory",
    "sampleMedium",
    "units",
    "options",
    "note",
    "related",
    "extension",
    "noDataValue",
    "timeSupport"
})
public class VariableInfoType {

    protected List<VariableInfoType.VariableCode> variableCode;
    protected String variableName;
    protected String variableDescription;
    @XmlSchemaType(name = "string")
    protected ValueTypeEnum valueType;
    @XmlSchemaType(name = "string")
    protected DataTypeEnum dataType;
    @XmlSchemaType(name = "string")
    protected GeneralCategoryEnum generalCategory;
    @XmlSchemaType(name = "string")
    protected SampleMediumEnum sampleMedium;
    protected VariableInfoType.Units units;
    protected ArrayOfOption options;
    protected List<VariableInfoType.Note> note;
    protected VariableInfoType.Related related;
    protected Object extension;
    @XmlElement(name = "NoDataValue")
    protected String noDataValue;
    protected VariableInfoType.TimeSupport timeSupport;
    @XmlAttribute(name = "oid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String oid;
    @XmlAttribute(name = "metadataDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar metadataDateTime;

    /**
     * Gets the value of the variableCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableInfoType.VariableCode }
     * 
     * 
     */
    public List<VariableInfoType.VariableCode> getVariableCode() {
        if (variableCode == null) {
            variableCode = new ArrayList<VariableInfoType.VariableCode>();
        }
        return this.variableCode;
    }

    /**
     * Gets the value of the variableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Sets the value of the variableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

    /**
     * Gets the value of the variableDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableDescription() {
        return variableDescription;
    }

    /**
     * Sets the value of the variableDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableDescription(String value) {
        this.variableDescription = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnum }
     *     
     */
    public ValueTypeEnum getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnum }
     *     
     */
    public void setValueType(ValueTypeEnum value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeEnum }
     *     
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeEnum }
     *     
     */
    public void setDataType(DataTypeEnum value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the generalCategory property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCategoryEnum }
     *     
     */
    public GeneralCategoryEnum getGeneralCategory() {
        return generalCategory;
    }

    /**
     * Sets the value of the generalCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCategoryEnum }
     *     
     */
    public void setGeneralCategory(GeneralCategoryEnum value) {
        this.generalCategory = value;
    }

    /**
     * Gets the value of the sampleMedium property.
     * 
     * @return
     *     possible object is
     *     {@link SampleMediumEnum }
     *     
     */
    public SampleMediumEnum getSampleMedium() {
        return sampleMedium;
    }

    /**
     * Sets the value of the sampleMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleMediumEnum }
     *     
     */
    public void setSampleMedium(SampleMediumEnum value) {
        this.sampleMedium = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link VariableInfoType.Units }
     *     
     */
    public VariableInfoType.Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableInfoType.Units }
     *     
     */
    public void setUnits(VariableInfoType.Units value) {
        this.units = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOption }
     *     
     */
    public ArrayOfOption getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOption }
     *     
     */
    public void setOptions(ArrayOfOption value) {
        this.options = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableInfoType.Note }
     * 
     * 
     */
    public List<VariableInfoType.Note> getNote() {
        if (note == null) {
            note = new ArrayList<VariableInfoType.Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the related property.
     * 
     * @return
     *     possible object is
     *     {@link VariableInfoType.Related }
     *     
     */
    public VariableInfoType.Related getRelated() {
        return related;
    }

    /**
     * Sets the value of the related property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableInfoType.Related }
     *     
     */
    public void setRelated(VariableInfoType.Related value) {
        this.related = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    /**
     * Gets the value of the noDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDataValue() {
        return noDataValue;
    }

    /**
     * Sets the value of the noDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDataValue(String value) {
        this.noDataValue = value;
    }

    /**
     * Gets the value of the timeSupport property.
     * 
     * @return
     *     possible object is
     *     {@link VariableInfoType.TimeSupport }
     *     
     */
    public VariableInfoType.TimeSupport getTimeSupport() {
        return timeSupport;
    }

    /**
     * Sets the value of the timeSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableInfoType.TimeSupport }
     *     
     */
    public void setTimeSupport(VariableInfoType.TimeSupport value) {
        this.timeSupport = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Note {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "href")
        protected String href;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "show")
        protected String show;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the show property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShow() {
            return show;
        }

        /**
         * Sets the value of the show property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShow(String value) {
            this.show = value;
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
     *         &lt;element name="parentID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="relatedID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
    @XmlType(name = "", propOrder = {
        "parentID",
        "relatedID"
    })
    public static class Related {

        protected List<VariableInfoType.Related.ParentID> parentID;
        protected List<VariableInfoType.Related.RelatedID> relatedID;

        /**
         * Gets the value of the parentID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parentID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParentID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariableInfoType.Related.ParentID }
         * 
         * 
         */
        public List<VariableInfoType.Related.ParentID> getParentID() {
            if (parentID == null) {
                parentID = new ArrayList<VariableInfoType.Related.ParentID>();
            }
            return this.parentID;
        }

        /**
         * Gets the value of the relatedID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariableInfoType.Related.RelatedID }
         * 
         * 
         */
        public List<VariableInfoType.Related.RelatedID> getRelatedID() {
            if (relatedID == null) {
                relatedID = new ArrayList<VariableInfoType.Related.RelatedID>();
            }
            return this.relatedID;
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
        public static class ParentID {

            @XmlValue
            protected String value;
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
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
        public static class RelatedID {

            @XmlValue
            protected String value;
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
     *         &lt;element name="unit" type="{http://www.cuahsi.org/waterML/1.0/}UnitsType" minOccurs="0"/>
     *         &lt;element name="timeInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="isRegular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unit",
        "timeInterval"
    })
    public static class TimeSupport {

        protected UnitsType unit;
        protected Integer timeInterval;
        @XmlAttribute(name = "isRegular")
        protected Boolean isRegular;

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link UnitsType }
         *     
         */
        public UnitsType getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitsType }
         *     
         */
        public void setUnit(UnitsType value) {
            this.unit = value;
        }

        /**
         * Gets the value of the timeInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTimeInterval() {
            return timeInterval;
        }

        /**
         * Sets the value of the timeInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTimeInterval(Integer value) {
            this.timeInterval = value;
        }

        /**
         * Gets the value of the isRegular property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRegular() {
            return isRegular;
        }

        /**
         * Sets the value of the isRegular property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsRegular(Boolean value) {
            this.isRegular = value;
        }

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
     *       &lt;attribute name="unitsAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="unitsCode" type="{http://www.w3.org/2001/XMLSchema}token" />
     *       &lt;attribute name="unitsType" type="{http://www.cuahsi.org/waterML/1.0/}UnitsTypeEnum" />
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
    public static class Units {

        @XmlValue
        protected String value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="variableID" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class VariableCode {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "network")
        protected String network;
        @XmlAttribute(name = "vocabulary")
        protected String vocabulary;
        @XmlAttribute(name = "default")
        protected Boolean _default;
        @XmlAttribute(name = "variableID")
        protected BigInteger variableID;

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

        /**
         * Gets the value of the variableID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVariableID() {
            return variableID;
        }

        /**
         * Sets the value of the variableID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setVariableID(BigInteger value) {
            this.variableID = value;
        }

    }

}
