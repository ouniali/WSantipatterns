
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="OTA_HotelDescriptiveInfoRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="HotelDescriptiveInfos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HotelDescriptiveInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveInfoRequestType">
 *                                     &lt;attribute name="StateCodeList">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="CountryCodeList">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="BrandCodeList">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ApplicableDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LangRequested" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "otaHotelDescriptiveInfoRQ"
})
@XmlRootElement(name = "OTA_HotelDescriptiveInfoService")
public class OTAHotelDescriptiveInfoService {

    @XmlElement(name = "OTA_HotelDescriptiveInfoRQ")
    protected OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ otaHotelDescriptiveInfoRQ;

    /**
     * Gets the value of the otaHotelDescriptiveInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ }
     *     
     */
    public OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ getOTAHotelDescriptiveInfoRQ() {
        return otaHotelDescriptiveInfoRQ;
    }

    /**
     * Sets the value of the otaHotelDescriptiveInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ }
     *     
     */
    public void setOTAHotelDescriptiveInfoRQ(OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ value) {
        this.otaHotelDescriptiveInfoRQ = value;
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
     *         &lt;element name="HotelDescriptiveInfos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HotelDescriptiveInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveInfoRequestType">
     *                           &lt;attribute name="StateCodeList">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="CountryCodeList">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="BrandCodeList">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ApplicableDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LangRequested" type="{http://www.w3.org/2001/XMLSchema}language" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "hotelDescriptiveInfos"
    })
    public static class OTAHotelDescriptiveInfoRQ {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "HotelDescriptiveInfos")
        protected OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos hotelDescriptiveInfos;
        @XmlAttribute(name = "PrimaryLangID")
        protected String primaryLangID;

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
         * Gets the value of the hotelDescriptiveInfos property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos }
         *     
         */
        public OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos getHotelDescriptiveInfos() {
            return hotelDescriptiveInfos;
        }

        /**
         * Sets the value of the hotelDescriptiveInfos property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos }
         *     
         */
        public void setHotelDescriptiveInfos(OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos value) {
            this.hotelDescriptiveInfos = value;
        }

        /**
         * Gets the value of the primaryLangID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryLangID() {
            return primaryLangID;
        }

        /**
         * Sets the value of the primaryLangID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryLangID(String value) {
            this.primaryLangID = value;
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
         *         &lt;element name="HotelDescriptiveInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveInfoRequestType">
         *                 &lt;attribute name="StateCodeList">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="CountryCodeList">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="BrandCodeList">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ApplicableDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="LangRequested" type="{http://www.w3.org/2001/XMLSchema}language" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelDescriptiveInfo"
        })
        public static class HotelDescriptiveInfos {

            @XmlElement(name = "HotelDescriptiveInfo")
            protected List<OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo> hotelDescriptiveInfo;
            @XmlAttribute(name = "LangRequested")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
            protected String langRequested;

            /**
             * Gets the value of the hotelDescriptiveInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelDescriptiveInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelDescriptiveInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo }
             * 
             * 
             */
            public List<OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo> getHotelDescriptiveInfo() {
                if (hotelDescriptiveInfo == null) {
                    hotelDescriptiveInfo = new ArrayList<OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo>();
                }
                return this.hotelDescriptiveInfo;
            }

            /**
             * Gets the value of the langRequested property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLangRequested() {
                return langRequested;
            }

            /**
             * Sets the value of the langRequested property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLangRequested(String value) {
                this.langRequested = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveInfoRequestType">
             *       &lt;attribute name="StateCodeList">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="CountryCodeList">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="BrandCodeList">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ApplicableDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class HotelDescriptiveInfo
                extends HotelDescriptiveInfoRequestType
            {

                @XmlAttribute(name = "StateCodeList")
                protected List<String> stateCodeList;
                @XmlAttribute(name = "CountryCodeList")
                protected List<String> countryCodeList;
                @XmlAttribute(name = "BrandCodeList")
                protected List<String> brandCodeList;
                @XmlAttribute(name = "MoreDataEchoToken")
                protected String moreDataEchoToken;
                @XmlAttribute(name = "ApplicableDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar applicableDate;

                /**
                 * Gets the value of the stateCodeList property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the stateCodeList property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStateCodeList().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getStateCodeList() {
                    if (stateCodeList == null) {
                        stateCodeList = new ArrayList<String>();
                    }
                    return this.stateCodeList;
                }

                /**
                 * Gets the value of the countryCodeList property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the countryCodeList property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCountryCodeList().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getCountryCodeList() {
                    if (countryCodeList == null) {
                        countryCodeList = new ArrayList<String>();
                    }
                    return this.countryCodeList;
                }

                /**
                 * Gets the value of the brandCodeList property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the brandCodeList property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBrandCodeList().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getBrandCodeList() {
                    if (brandCodeList == null) {
                        brandCodeList = new ArrayList<String>();
                    }
                    return this.brandCodeList;
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

                /**
                 * Gets the value of the applicableDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getApplicableDate() {
                    return applicableDate;
                }

                /**
                 * Sets the value of the applicableDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setApplicableDate(XMLGregorianCalendar value) {
                    this.applicableDate = value;
                }

            }

        }

    }

}
