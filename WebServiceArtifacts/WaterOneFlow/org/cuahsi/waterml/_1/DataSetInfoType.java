
package org.cuahsi.waterml._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DataSetInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cuahsi.org/waterML/1.0/}SourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="dataSetIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="defaultTimeZone">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ZoneAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                           &lt;attribute name="ZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="daylightSavingsTimeZone">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ZoneAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                           &lt;attribute name="ZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="dataSetLocation" type="{http://www.cuahsi.org/waterML/1.0/}GeogLocationType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetInfoType", propOrder = {
    "dataSetIdentifier",
    "timeZoneInfo",
    "dataSetDescription",
    "note",
    "dataSetLocation",
    "extension"
})
public class DataSetInfoType
    extends SourceInfoType
{

    protected String dataSetIdentifier;
    protected DataSetInfoType.TimeZoneInfo timeZoneInfo;
    protected String dataSetDescription;
    protected List<DataSetInfoType.Note> note;
    protected GeogLocationType dataSetLocation;
    protected Object extension;

    /**
     * Gets the value of the dataSetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetIdentifier() {
        return dataSetIdentifier;
    }

    /**
     * Sets the value of the dataSetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetIdentifier(String value) {
        this.dataSetIdentifier = value;
    }

    /**
     * Gets the value of the timeZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetInfoType.TimeZoneInfo }
     *     
     */
    public DataSetInfoType.TimeZoneInfo getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * Sets the value of the timeZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetInfoType.TimeZoneInfo }
     *     
     */
    public void setTimeZoneInfo(DataSetInfoType.TimeZoneInfo value) {
        this.timeZoneInfo = value;
    }

    /**
     * Gets the value of the dataSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetDescription() {
        return dataSetDescription;
    }

    /**
     * Sets the value of the dataSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetDescription(String value) {
        this.dataSetDescription = value;
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
     * {@link DataSetInfoType.Note }
     * 
     * 
     */
    public List<DataSetInfoType.Note> getNote() {
        if (note == null) {
            note = new ArrayList<DataSetInfoType.Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the dataSetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeogLocationType }
     *     
     */
    public GeogLocationType getDataSetLocation() {
        return dataSetLocation;
    }

    /**
     * Sets the value of the dataSetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeogLocationType }
     *     
     */
    public void setDataSetLocation(GeogLocationType value) {
        this.dataSetLocation = value;
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
     *         &lt;element name="defaultTimeZone">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ZoneAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                 &lt;attribute name="ZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="daylightSavingsTimeZone">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ZoneAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                 &lt;attribute name="ZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "defaultTimeZone",
        "daylightSavingsTimeZone"
    })
    public static class TimeZoneInfo {

        @XmlElement(required = true, nillable = true)
        protected DataSetInfoType.TimeZoneInfo.DefaultTimeZone defaultTimeZone;
        @XmlElement(required = true, nillable = true)
        protected DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone daylightSavingsTimeZone;

        /**
         * Gets the value of the defaultTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link DataSetInfoType.TimeZoneInfo.DefaultTimeZone }
         *     
         */
        public DataSetInfoType.TimeZoneInfo.DefaultTimeZone getDefaultTimeZone() {
            return defaultTimeZone;
        }

        /**
         * Sets the value of the defaultTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSetInfoType.TimeZoneInfo.DefaultTimeZone }
         *     
         */
        public void setDefaultTimeZone(DataSetInfoType.TimeZoneInfo.DefaultTimeZone value) {
            this.defaultTimeZone = value;
        }

        /**
         * Gets the value of the daylightSavingsTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
         *     
         */
        public DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone getDaylightSavingsTimeZone() {
            return daylightSavingsTimeZone;
        }

        /**
         * Sets the value of the daylightSavingsTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
         *     
         */
        public void setDaylightSavingsTimeZone(DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone value) {
            this.daylightSavingsTimeZone = value;
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
         *       &lt;attribute name="ZoneAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *       &lt;attribute name="ZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DaylightSavingsTimeZone {

            @XmlAttribute(name = "ZoneAbbreviation")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String zoneAbbreviation;
            @XmlAttribute(name = "ZoneOffset")
            protected String zoneOffset;

            /**
             * Gets the value of the zoneAbbreviation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZoneAbbreviation() {
                return zoneAbbreviation;
            }

            /**
             * Sets the value of the zoneAbbreviation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZoneAbbreviation(String value) {
                this.zoneAbbreviation = value;
            }

            /**
             * Gets the value of the zoneOffset property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZoneOffset() {
                return zoneOffset;
            }

            /**
             * Sets the value of the zoneOffset property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZoneOffset(String value) {
                this.zoneOffset = value;
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
         *       &lt;attribute name="ZoneAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *       &lt;attribute name="ZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DefaultTimeZone {

            @XmlAttribute(name = "ZoneAbbreviation")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String zoneAbbreviation;
            @XmlAttribute(name = "ZoneOffset")
            protected String zoneOffset;

            /**
             * Gets the value of the zoneAbbreviation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZoneAbbreviation() {
                return zoneAbbreviation;
            }

            /**
             * Sets the value of the zoneAbbreviation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZoneAbbreviation(String value) {
                this.zoneAbbreviation = value;
            }

            /**
             * Gets the value of the zoneOffset property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZoneOffset() {
                return zoneOffset;
            }

            /**
             * Sets the value of the zoneOffset property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZoneOffset(String value) {
                this.zoneOffset = value;
            }

        }

    }

}
