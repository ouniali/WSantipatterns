
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AffiliationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistribSystems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DistribSystem" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Brands" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypeBrand" minOccurs="0"/>
 *         &lt;element name="LoyalPrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypeLoyalProgram" minOccurs="0"/>
 *         &lt;element name="Awards" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypeAward" minOccurs="0"/>
 *         &lt;element name="PartnerInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypePartnerInfo" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationInfoType", propOrder = {
    "distribSystems",
    "brands",
    "loyalPrograms",
    "awards",
    "partnerInfos",
    "descriptions"
})
public class AffiliationInfoType {

    @XmlElement(name = "DistribSystems")
    protected AffiliationInfoType.DistribSystems distribSystems;
    @XmlElement(name = "Brands")
    protected ArrayOfAffiliationInfoTypeBrand brands;
    @XmlElement(name = "LoyalPrograms")
    protected ArrayOfAffiliationInfoTypeLoyalProgram loyalPrograms;
    @XmlElement(name = "Awards")
    protected ArrayOfAffiliationInfoTypeAward awards;
    @XmlElement(name = "PartnerInfos")
    protected ArrayOfAffiliationInfoTypePartnerInfo partnerInfos;
    @XmlElement(name = "Descriptions")
    protected ArrayOfParagraphType descriptions;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the distribSystems property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.DistribSystems }
     *     
     */
    public AffiliationInfoType.DistribSystems getDistribSystems() {
        return distribSystems;
    }

    /**
     * Sets the value of the distribSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.DistribSystems }
     *     
     */
    public void setDistribSystems(AffiliationInfoType.DistribSystems value) {
        this.distribSystems = value;
    }

    /**
     * Gets the value of the brands property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypeBrand }
     *     
     */
    public ArrayOfAffiliationInfoTypeBrand getBrands() {
        return brands;
    }

    /**
     * Sets the value of the brands property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypeBrand }
     *     
     */
    public void setBrands(ArrayOfAffiliationInfoTypeBrand value) {
        this.brands = value;
    }

    /**
     * Gets the value of the loyalPrograms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypeLoyalProgram }
     *     
     */
    public ArrayOfAffiliationInfoTypeLoyalProgram getLoyalPrograms() {
        return loyalPrograms;
    }

    /**
     * Sets the value of the loyalPrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypeLoyalProgram }
     *     
     */
    public void setLoyalPrograms(ArrayOfAffiliationInfoTypeLoyalProgram value) {
        this.loyalPrograms = value;
    }

    /**
     * Gets the value of the awards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypeAward }
     *     
     */
    public ArrayOfAffiliationInfoTypeAward getAwards() {
        return awards;
    }

    /**
     * Sets the value of the awards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypeAward }
     *     
     */
    public void setAwards(ArrayOfAffiliationInfoTypeAward value) {
        this.awards = value;
    }

    /**
     * Gets the value of the partnerInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypePartnerInfo }
     *     
     */
    public ArrayOfAffiliationInfoTypePartnerInfo getPartnerInfos() {
        return partnerInfos;
    }

    /**
     * Sets the value of the partnerInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypePartnerInfo }
     *     
     */
    public void setPartnerInfos(ArrayOfAffiliationInfoTypePartnerInfo value) {
        this.partnerInfos = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public ArrayOfParagraphType getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public void setDescriptions(ArrayOfParagraphType value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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
     *         &lt;element name="DistribSystem" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "distribSystem"
    })
    public static class DistribSystems {

        @XmlElement(name = "DistribSystem")
        protected AffiliationInfoType.DistribSystems.DistribSystem distribSystem;

        /**
         * Gets the value of the distribSystem property.
         * 
         * @return
         *     possible object is
         *     {@link AffiliationInfoType.DistribSystems.DistribSystem }
         *     
         */
        public AffiliationInfoType.DistribSystems.DistribSystem getDistribSystem() {
            return distribSystem;
        }

        /**
         * Sets the value of the distribSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffiliationInfoType.DistribSystems.DistribSystem }
         *     
         */
        public void setDistribSystem(AffiliationInfoType.DistribSystems.DistribSystem value) {
            this.distribSystem = value;
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
         *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "companyName"
        })
        public static class DistribSystem {

            @XmlElement(name = "CompanyName")
            protected CompanyNameType companyName;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
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

            /**
             * Gets the value of the companyName property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getCompanyName() {
                return companyName;
            }

            /**
             * Sets the value of the companyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setCompanyName(CompanyNameType value) {
                this.companyName = value;
            }

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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

        }

    }

}
