
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SiteInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cuahsi.org/waterML/1.0/}SourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="defaultId" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="siteID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="geoLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="geogLocation" type="{http://www.cuahsi.org/waterML/1.0/}GeogLocationType" minOccurs="0"/>
 *                   &lt;element name="localSiteXY" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="projectionInformation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elevation_m" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="verticalDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteInfoType", propOrder = {
    "siteName",
    "siteCode",
    "timeZoneInfo",
    "geoLocation",
    "elevationM",
    "verticalDatum",
    "note",
    "extension"
})
public class SiteInfoType
    extends SourceInfoType
{

    protected String siteName;
    protected List<SiteInfoType.SiteCode> siteCode;
    protected SiteInfoType.TimeZoneInfo timeZoneInfo;
    protected SiteInfoType.GeoLocation geoLocation;
    @XmlElement(name = "elevation_m")
    protected Double elevationM;
    protected String verticalDatum;
    protected List<SiteInfoType.Note> note;
    protected Object extension;
    @XmlAttribute(name = "oid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String oid;
    @XmlAttribute(name = "metadataDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar metadataDateTime;

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteInfoType.SiteCode }
     * 
     * 
     */
    public List<SiteInfoType.SiteCode> getSiteCode() {
        if (siteCode == null) {
            siteCode = new ArrayList<SiteInfoType.SiteCode>();
        }
        return this.siteCode;
    }

    /**
     * Gets the value of the timeZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfoType.TimeZoneInfo }
     *     
     */
    public SiteInfoType.TimeZoneInfo getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * Sets the value of the timeZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfoType.TimeZoneInfo }
     *     
     */
    public void setTimeZoneInfo(SiteInfoType.TimeZoneInfo value) {
        this.timeZoneInfo = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfoType.GeoLocation }
     *     
     */
    public SiteInfoType.GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfoType.GeoLocation }
     *     
     */
    public void setGeoLocation(SiteInfoType.GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the elevationM property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElevationM() {
        return elevationM;
    }

    /**
     * Sets the value of the elevationM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElevationM(Double value) {
        this.elevationM = value;
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalDatum(String value) {
        this.verticalDatum = value;
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
     * {@link SiteInfoType.Note }
     * 
     * 
     */
    public List<SiteInfoType.Note> getNote() {
        if (note == null) {
            note = new ArrayList<SiteInfoType.Note>();
        }
        return this.note;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="geogLocation" type="{http://www.cuahsi.org/waterML/1.0/}GeogLocationType" minOccurs="0"/>
     *         &lt;element name="localSiteXY" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="projectionInformation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "geogLocation",
        "localSiteXY"
    })
    public static class GeoLocation {

        protected GeogLocationType geogLocation;
        protected List<SiteInfoType.GeoLocation.LocalSiteXY> localSiteXY;

        /**
         * Gets the value of the geogLocation property.
         * 
         * @return
         *     possible object is
         *     {@link GeogLocationType }
         *     
         */
        public GeogLocationType getGeogLocation() {
            return geogLocation;
        }

        /**
         * Sets the value of the geogLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeogLocationType }
         *     
         */
        public void setGeogLocation(GeogLocationType value) {
            this.geogLocation = value;
        }

        /**
         * Gets the value of the localSiteXY property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the localSiteXY property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocalSiteXY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SiteInfoType.GeoLocation.LocalSiteXY }
         * 
         * 
         */
        public List<SiteInfoType.GeoLocation.LocalSiteXY> getLocalSiteXY() {
            if (localSiteXY == null) {
                localSiteXY = new ArrayList<SiteInfoType.GeoLocation.LocalSiteXY>();
            }
            return this.localSiteXY;
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
         *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
         *       &lt;/sequence>
         *       &lt;attribute name="projectionInformation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "x",
            "y",
            "z",
            "note"
        })
        public static class LocalSiteXY {

            @XmlElement(name = "X")
            protected double x;
            @XmlElement(name = "Y")
            protected double y;
            @XmlElement(name = "Z")
            protected Double z;
            protected List<SiteInfoType.GeoLocation.LocalSiteXY.Note> note;
            @XmlAttribute(name = "projectionInformation")
            protected String projectionInformation;

            /**
             * Gets the value of the x property.
             * 
             */
            public double getX() {
                return x;
            }

            /**
             * Sets the value of the x property.
             * 
             */
            public void setX(double value) {
                this.x = value;
            }

            /**
             * Gets the value of the y property.
             * 
             */
            public double getY() {
                return y;
            }

            /**
             * Sets the value of the y property.
             * 
             */
            public void setY(double value) {
                this.y = value;
            }

            /**
             * Gets the value of the z property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getZ() {
                return z;
            }

            /**
             * Sets the value of the z property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setZ(Double value) {
                this.z = value;
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
             * {@link SiteInfoType.GeoLocation.LocalSiteXY.Note }
             * 
             * 
             */
            public List<SiteInfoType.GeoLocation.LocalSiteXY.Note> getNote() {
                if (note == null) {
                    note = new ArrayList<SiteInfoType.GeoLocation.LocalSiteXY.Note>();
                }
                return this.note;
            }

            /**
             * Gets the value of the projectionInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProjectionInformation() {
                return projectionInformation;
            }

            /**
             * Sets the value of the projectionInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProjectionInformation(String value) {
                this.projectionInformation = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="defaultId" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="siteID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
    public static class SiteCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "defaultId")
        protected Boolean defaultId;
        @XmlAttribute(name = "network")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String network;
        @XmlAttribute(name = "siteID")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String siteID;

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
         * Gets the value of the defaultId property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultId() {
            return defaultId;
        }

        /**
         * Sets the value of the defaultId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultId(Boolean value) {
            this.defaultId = value;
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
         * Gets the value of the siteID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteID() {
            return siteID;
        }

        /**
         * Sets the value of the siteID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteID(String value) {
            this.siteID = value;
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
        protected SiteInfoType.TimeZoneInfo.DefaultTimeZone defaultTimeZone;
        @XmlElement(required = true, nillable = true)
        protected SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone daylightSavingsTimeZone;

        /**
         * Gets the value of the defaultTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link SiteInfoType.TimeZoneInfo.DefaultTimeZone }
         *     
         */
        public SiteInfoType.TimeZoneInfo.DefaultTimeZone getDefaultTimeZone() {
            return defaultTimeZone;
        }

        /**
         * Sets the value of the defaultTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link SiteInfoType.TimeZoneInfo.DefaultTimeZone }
         *     
         */
        public void setDefaultTimeZone(SiteInfoType.TimeZoneInfo.DefaultTimeZone value) {
            this.defaultTimeZone = value;
        }

        /**
         * Gets the value of the daylightSavingsTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
         *     
         */
        public SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone getDaylightSavingsTimeZone() {
            return daylightSavingsTimeZone;
        }

        /**
         * Sets the value of the daylightSavingsTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
         *     
         */
        public void setDaylightSavingsTimeZone(SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone value) {
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
