
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="OTA_HotelDescriptiveInfoRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfWarningType" minOccurs="0"/>
 *                     &lt;element name="HotelDescriptiveContents" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
 *                                       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="JPCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfErrorType" minOccurs="0"/>
 *                     &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IntCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="TransactionStatusCode" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Start"/>
 *                       &lt;enumeration value="End"/>
 *                       &lt;enumeration value="Rollback"/>
 *                       &lt;enumeration value="InSeries"/>
 *                       &lt;enumeration value="Continuation"/>
 *                       &lt;enumeration value="Subsequent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
    "otaHotelDescriptiveInfoRS"
})
@XmlRootElement(name = "OTA_HotelDescriptiveInfoServiceResponse")
public class OTAHotelDescriptiveInfoServiceResponse {

    @XmlElement(name = "OTA_HotelDescriptiveInfoRS")
    protected OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS otaHotelDescriptiveInfoRS;

    /**
     * Gets the value of the otaHotelDescriptiveInfoRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS }
     *     
     */
    public OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS getOTAHotelDescriptiveInfoRS() {
        return otaHotelDescriptiveInfoRS;
    }

    /**
     * Sets the value of the otaHotelDescriptiveInfoRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS }
     *     
     */
    public void setOTAHotelDescriptiveInfoRS(OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS value) {
        this.otaHotelDescriptiveInfoRS = value;
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
     *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfWarningType" minOccurs="0"/>
     *           &lt;element name="HotelDescriptiveContents" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
     *                             &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="JPCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfErrorType" minOccurs="0"/>
     *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IntCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="TransactionStatusCode" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Start"/>
     *             &lt;enumeration value="End"/>
     *             &lt;enumeration value="Rollback"/>
     *             &lt;enumeration value="InSeries"/>
     *             &lt;enumeration value="Continuation"/>
     *             &lt;enumeration value="Subsequent"/>
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
    @XmlType(name = "", propOrder = {
        "pos",
        "warningsOrHotelDescriptiveContentsOrErrors"
    })
    public static class OTAHotelDescriptiveInfoRS {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElements({
            @XmlElement(name = "Warnings", type = ArrayOfWarningType.class),
            @XmlElement(name = "HotelDescriptiveContents", type = OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents.class),
            @XmlElement(name = "Errors", type = ArrayOfErrorType.class),
            @XmlElement(name = "Success", type = SuccessType.class)
        })
        protected List<Object> warningsOrHotelDescriptiveContentsOrErrors;
        @XmlAttribute(name = "URL")
        protected String url;
        @XmlAttribute(name = "IntCode")
        protected String intCode;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "TransactionStatusCode", required = true)
        protected String transactionStatusCode;

        /**
         * Gets the value of the pos property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public ArrayOfSourceType getPOS() {
            return pos;
        }

        /**
         * Sets the value of the pos property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public void setPOS(ArrayOfSourceType value) {
            this.pos = value;
        }

        /**
         * Gets the value of the warningsOrHotelDescriptiveContentsOrErrors property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningsOrHotelDescriptiveContentsOrErrors property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningsOrHotelDescriptiveContentsOrErrors().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfWarningType }
         * {@link OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents }
         * {@link ArrayOfErrorType }
         * {@link SuccessType }
         * 
         * 
         */
        public List<Object> getWarningsOrHotelDescriptiveContentsOrErrors() {
            if (warningsOrHotelDescriptiveContentsOrErrors == null) {
                warningsOrHotelDescriptiveContentsOrErrors = new ArrayList<Object>();
            }
            return this.warningsOrHotelDescriptiveContentsOrErrors;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the intCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntCode() {
            return intCode;
        }

        /**
         * Sets the value of the intCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntCode(String value) {
            this.intCode = value;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * Gets the value of the transactionStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionStatusCode() {
            return transactionStatusCode;
        }

        /**
         * Sets the value of the transactionStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionStatusCode(String value) {
            this.transactionStatusCode = value;
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
         *         &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
         *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="JPCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelDescriptiveContent"
        })
        public static class HotelDescriptiveContents {

            @XmlElement(name = "HotelDescriptiveContent")
            protected List<OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent> hotelDescriptiveContent;
            @XmlAttribute(name = "AreaID")
            protected String areaID;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "BrandCode")
            protected String brandCode;
            @XmlAttribute(name = "HotelCode")
            protected String hotelCode;
            @XmlAttribute(name = "JPCode")
            protected String jpCode;
            @XmlAttribute(name = "HotelCityCode")
            protected String hotelCityCode;
            @XmlAttribute(name = "HotelName")
            protected String hotelName;
            @XmlAttribute(name = "HotelCodeContext")
            protected String hotelCodeContext;
            @XmlAttribute(name = "ChainName")
            protected String chainName;
            @XmlAttribute(name = "BrandName")
            protected String brandName;
            @XmlAttribute(name = "Overwrite")
            protected Boolean overwrite;

            /**
             * Gets the value of the hotelDescriptiveContent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelDescriptiveContent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelDescriptiveContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent }
             * 
             * 
             */
            public List<OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent> getHotelDescriptiveContent() {
                if (hotelDescriptiveContent == null) {
                    hotelDescriptiveContent = new ArrayList<OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent>();
                }
                return this.hotelDescriptiveContent;
            }

            /**
             * Gets the value of the areaID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaID() {
                return areaID;
            }

            /**
             * Sets the value of the areaID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaID(String value) {
                this.areaID = value;
            }

            /**
             * Gets the value of the chainCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * Sets the value of the chainCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * Gets the value of the brandCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandCode() {
                return brandCode;
            }

            /**
             * Sets the value of the brandCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandCode(String value) {
                this.brandCode = value;
            }

            /**
             * Gets the value of the hotelCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCode() {
                return hotelCode;
            }

            /**
             * Sets the value of the hotelCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCode(String value) {
                this.hotelCode = value;
            }

            /**
             * Gets the value of the jpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJPCode() {
                return jpCode;
            }

            /**
             * Sets the value of the jpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJPCode(String value) {
                this.jpCode = value;
            }

            /**
             * Gets the value of the hotelCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCityCode() {
                return hotelCityCode;
            }

            /**
             * Sets the value of the hotelCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCityCode(String value) {
                this.hotelCityCode = value;
            }

            /**
             * Gets the value of the hotelName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelName() {
                return hotelName;
            }

            /**
             * Sets the value of the hotelName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelName(String value) {
                this.hotelName = value;
            }

            /**
             * Gets the value of the hotelCodeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCodeContext() {
                return hotelCodeContext;
            }

            /**
             * Sets the value of the hotelCodeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCodeContext(String value) {
                this.hotelCodeContext = value;
            }

            /**
             * Gets the value of the chainName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainName() {
                return chainName;
            }

            /**
             * Sets the value of the chainName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainName(String value) {
                this.chainName = value;
            }

            /**
             * Gets the value of the brandName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandName() {
                return brandName;
            }

            /**
             * Sets the value of the brandName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandName(String value) {
                this.brandName = value;
            }

            /**
             * Gets the value of the overwrite property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverwrite() {
                return overwrite;
            }

            /**
             * Sets the value of the overwrite property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverwrite(Boolean value) {
                this.overwrite = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class HotelDescriptiveContent
                extends HotelDescriptiveContentType
            {

                @XmlAttribute(name = "ChainCode")
                protected String chainCode;
                @XmlAttribute(name = "BrandCode")
                protected String brandCode;
                @XmlAttribute(name = "HotelCode")
                protected String hotelCode;
                @XmlAttribute(name = "HotelCityCode")
                protected String hotelCityCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;
                @XmlAttribute(name = "HotelCodeContext")
                protected String hotelCodeContext;
                @XmlAttribute(name = "ChainName")
                protected String chainName;
                @XmlAttribute(name = "BrandName")
                protected String brandName;
                @XmlAttribute(name = "Overwrite")
                protected Boolean overwrite;
                @XmlAttribute(name = "MoreDataEchoToken")
                protected String moreDataEchoToken;

                /**
                 * Gets the value of the chainCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * Sets the value of the chainCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * Gets the value of the brandCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * Sets the value of the brandCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * Gets the value of the hotelCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * Sets the value of the hotelCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * Gets the value of the hotelCityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * Sets the value of the hotelCityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * Gets the value of the hotelName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * Sets the value of the hotelName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * Gets the value of the hotelCodeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * Sets the value of the hotelCodeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * Gets the value of the chainName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * Sets the value of the chainName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * Gets the value of the brandName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * Sets the value of the brandName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }

                /**
                 * Gets the value of the overwrite property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOverwrite() {
                    return overwrite;
                }

                /**
                 * Sets the value of the overwrite property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOverwrite(Boolean value) {
                    this.overwrite = value;
                }

                /**
                 * Gets the value of the moreDataEchoToken property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoreDataEchoToken() {
                    return moreDataEchoToken;
                }

                /**
                 * Sets the value of the moreDataEchoToken property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoreDataEchoToken(String value) {
                    this.moreDataEchoToken = value;
                }

            }

        }

    }

}
