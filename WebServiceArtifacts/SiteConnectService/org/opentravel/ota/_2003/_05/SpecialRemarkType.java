
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SpecialRemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelerRefNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
 *                 &lt;attribute name="RangePosition">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="First"/>
 *                       &lt;enumeration value="Last"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightRefNumber" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightRefNumberGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="AuthorizedViewers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AuthorizedViewer" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="ViewerCarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RemarkType" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRemarkType", propOrder = {
    "travelerRefNumber",
    "flightRefNumber",
    "text",
    "airline",
    "authorizedViewers"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialRemarks.SpecialRemark.class
})
public class SpecialRemarkType {

    @XmlElement(name = "TravelerRefNumber")
    protected List<SpecialRemarkType.TravelerRefNumber> travelerRefNumber;
    @XmlElement(name = "FlightRefNumber")
    protected List<SpecialRemarkType.FlightRefNumber> flightRefNumber;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Airline")
    protected List<CompanyNameType> airline;
    @XmlElement(name = "AuthorizedViewers")
    protected SpecialRemarkType.AuthorizedViewers authorizedViewers;
    @XmlAttribute(name = "RemarkType", required = true)
    protected String remarkType;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRemarkType.TravelerRefNumber }
     * 
     * 
     */
    public List<SpecialRemarkType.TravelerRefNumber> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<SpecialRemarkType.TravelerRefNumber>();
        }
        return this.travelerRefNumber;
    }

    /**
     * Gets the value of the flightRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRemarkType.FlightRefNumber }
     * 
     * 
     */
    public List<SpecialRemarkType.FlightRefNumber> getFlightRefNumber() {
        if (flightRefNumber == null) {
            flightRefNumber = new ArrayList<SpecialRemarkType.FlightRefNumber>();
        }
        return this.flightRefNumber;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getAirline() {
        if (airline == null) {
            airline = new ArrayList<CompanyNameType>();
        }
        return this.airline;
    }

    /**
     * Gets the value of the authorizedViewers property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRemarkType.AuthorizedViewers }
     *     
     */
    public SpecialRemarkType.AuthorizedViewers getAuthorizedViewers() {
        return authorizedViewers;
    }

    /**
     * Sets the value of the authorizedViewers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRemarkType.AuthorizedViewers }
     *     
     */
    public void setAuthorizedViewers(SpecialRemarkType.AuthorizedViewers value) {
        this.authorizedViewers = value;
    }

    /**
     * Gets the value of the remarkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkType() {
        return remarkType;
    }

    /**
     * Sets the value of the remarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkType(String value) {
        this.remarkType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     *         &lt;element name="AuthorizedViewer" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="ViewerCarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
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
        "authorizedViewer"
    })
    public static class AuthorizedViewers {

        @XmlElement(name = "AuthorizedViewer", required = true)
        protected List<SpecialRemarkType.AuthorizedViewers.AuthorizedViewer> authorizedViewer;

        /**
         * Gets the value of the authorizedViewer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authorizedViewer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthorizedViewer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialRemarkType.AuthorizedViewers.AuthorizedViewer }
         * 
         * 
         */
        public List<SpecialRemarkType.AuthorizedViewers.AuthorizedViewer> getAuthorizedViewer() {
            if (authorizedViewer == null) {
                authorizedViewer = new ArrayList<SpecialRemarkType.AuthorizedViewers.AuthorizedViewer>();
            }
            return this.authorizedViewer;
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
         *       &lt;attribute name="ViewerCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="ViewerCarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AuthorizedViewer {

            @XmlAttribute(name = "ViewerCode")
            protected String viewerCode;
            @XmlAttribute(name = "ViewerCarrierCode")
            protected String viewerCarrierCode;

            /**
             * Gets the value of the viewerCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewerCode() {
                return viewerCode;
            }

            /**
             * Sets the value of the viewerCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewerCode(String value) {
                this.viewerCode = value;
            }

            /**
             * Gets the value of the viewerCarrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewerCarrierCode() {
                return viewerCarrierCode;
            }

            /**
             * Sets the value of the viewerCarrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewerCarrierCode(String value) {
                this.viewerCarrierCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightRefNumberGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
     *       &lt;attribute name="RangePosition">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="First"/>
     *             &lt;enumeration value="Last"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RangePosition")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String rangePosition;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

        /**
         * Gets the value of the rangePosition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangePosition() {
            return rangePosition;
        }

        /**
         * Sets the value of the rangePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangePosition(String value) {
            this.rangePosition = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the surnameRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * Sets the value of the surnameRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
        }

    }

}
