
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HotelDescriptiveContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="HotelInfo" type="{http://www.opentravel.org/OTA/2003/05}HotelInfoType" minOccurs="0"/>
 *         &lt;element name="FacilityInfo" type="{http://www.opentravel.org/OTA/2003/05}FacilityInfoType" minOccurs="0"/>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType">
 *                 &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaInfo" type="{http://www.opentravel.org/OTA/2003/05}AreaInfoType" minOccurs="0"/>
 *         &lt;element name="AffiliationInfo" type="{http://www.opentravel.org/OTA/2003/05}AffiliationInfoType" minOccurs="0"/>
 *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions_Type" minOccurs="0"/>
 *         &lt;element name="GDS_Info" type="{http://www.opentravel.org/OTA/2003/05}GDS_InfoType" minOccurs="0"/>
 *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/>
 *         &lt;element name="EffectivePeriods" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelDescriptiveContentTypeEffectivePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DistanceUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AreaUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WeightUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDescriptiveContentType", propOrder = {
    "destinationSystemsCode",
    "hotelInfo",
    "facilityInfo",
    "policies",
    "areaInfo",
    "affiliationInfo",
    "multimediaDescriptions",
    "contactInfos",
    "tpaExtensions",
    "gdsInfo",
    "viewerships",
    "effectivePeriods"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.OTAHotelDescriptiveInfoServiceResponse.OTAHotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent.class
})
public class HotelDescriptiveContentType {

    @XmlElement(name = "DestinationSystemsCode")
    protected ArrayOfString destinationSystemsCode;
    @XmlElement(name = "HotelInfo")
    protected HotelInfoType hotelInfo;
    @XmlElement(name = "FacilityInfo")
    protected FacilityInfoType facilityInfo;
    @XmlElement(name = "Policies")
    protected HotelDescriptiveContentType.Policies policies;
    @XmlElement(name = "AreaInfo")
    protected AreaInfoType areaInfo;
    @XmlElement(name = "AffiliationInfo")
    protected AffiliationInfoType affiliationInfo;
    @XmlElement(name = "MultimediaDescriptions")
    protected MultimediaDescriptionsType multimediaDescriptions;
    @XmlElement(name = "ContactInfos")
    protected ArrayOfContactInfoRootType contactInfos;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "GDS_Info")
    protected GDSInfoType gdsInfo;
    @XmlElement(name = "Viewerships")
    protected ArrayOfViewershipsTypeViewership viewerships;
    @XmlElement(name = "EffectivePeriods")
    protected ArrayOfHotelDescriptiveContentTypeEffectivePeriod effectivePeriods;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "TimeZone")
    protected String timeZone;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "DistanceUnitOfMeasureCode")
    protected String distanceUnitOfMeasureCode;
    @XmlAttribute(name = "AreaUnitOfMeasureCode")
    protected String areaUnitOfMeasureCode;
    @XmlAttribute(name = "WeightUnitOfMeasureCode")
    protected String weightUnitOfMeasureCode;

    /**
     * Gets the value of the destinationSystemsCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * Sets the value of the destinationSystemsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDestinationSystemsCode(ArrayOfString value) {
        this.destinationSystemsCode = value;
    }

    /**
     * Gets the value of the hotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType }
     *     
     */
    public HotelInfoType getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Sets the value of the hotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType }
     *     
     */
    public void setHotelInfo(HotelInfoType value) {
        this.hotelInfo = value;
    }

    /**
     * Gets the value of the facilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType }
     *     
     */
    public FacilityInfoType getFacilityInfo() {
        return facilityInfo;
    }

    /**
     * Sets the value of the facilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType }
     *     
     */
    public void setFacilityInfo(FacilityInfoType value) {
        this.facilityInfo = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveContentType.Policies }
     *     
     */
    public HotelDescriptiveContentType.Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveContentType.Policies }
     *     
     */
    public void setPolicies(HotelDescriptiveContentType.Policies value) {
        this.policies = value;
    }

    /**
     * Gets the value of the areaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType }
     *     
     */
    public AreaInfoType getAreaInfo() {
        return areaInfo;
    }

    /**
     * Sets the value of the areaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType }
     *     
     */
    public void setAreaInfo(AreaInfoType value) {
        this.areaInfo = value;
    }

    /**
     * Gets the value of the affiliationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType }
     *     
     */
    public AffiliationInfoType getAffiliationInfo() {
        return affiliationInfo;
    }

    /**
     * Sets the value of the affiliationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType }
     *     
     */
    public void setAffiliationInfo(AffiliationInfoType value) {
        this.affiliationInfo = value;
    }

    /**
     * Gets the value of the multimediaDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link MultimediaDescriptionsType }
     *     
     */
    public MultimediaDescriptionsType getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * Sets the value of the multimediaDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaDescriptionsType }
     *     
     */
    public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
        this.multimediaDescriptions = value;
    }

    /**
     * Gets the value of the contactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactInfoRootType }
     *     
     */
    public ArrayOfContactInfoRootType getContactInfos() {
        return contactInfos;
    }

    /**
     * Sets the value of the contactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactInfoRootType }
     *     
     */
    public void setContactInfos(ArrayOfContactInfoRootType value) {
        this.contactInfos = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the gdsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GDSInfoType }
     *     
     */
    public GDSInfoType getGDSInfo() {
        return gdsInfo;
    }

    /**
     * Sets the value of the gdsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDSInfoType }
     *     
     */
    public void setGDSInfo(GDSInfoType value) {
        this.gdsInfo = value;
    }

    /**
     * Gets the value of the viewerships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfViewershipsTypeViewership }
     *     
     */
    public ArrayOfViewershipsTypeViewership getViewerships() {
        return viewerships;
    }

    /**
     * Sets the value of the viewerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfViewershipsTypeViewership }
     *     
     */
    public void setViewerships(ArrayOfViewershipsTypeViewership value) {
        this.viewerships = value;
    }

    /**
     * Gets the value of the effectivePeriods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     *     
     */
    public ArrayOfHotelDescriptiveContentTypeEffectivePeriod getEffectivePeriods() {
        return effectivePeriods;
    }

    /**
     * Sets the value of the effectivePeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     *     
     */
    public void setEffectivePeriods(ArrayOfHotelDescriptiveContentTypeEffectivePeriod value) {
        this.effectivePeriods = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the unitOfMeasureQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * Sets the value of the unitOfMeasureQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
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
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the distanceUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnitOfMeasureCode() {
        return distanceUnitOfMeasureCode;
    }

    /**
     * Sets the value of the distanceUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnitOfMeasureCode(String value) {
        this.distanceUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the areaUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUnitOfMeasureCode() {
        return areaUnitOfMeasureCode;
    }

    /**
     * Sets the value of the areaUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUnitOfMeasureCode(String value) {
        this.areaUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the weightUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnitOfMeasureCode() {
        return weightUnitOfMeasureCode;
    }

    /**
     * Sets the value of the weightUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnitOfMeasureCode(String value) {
        this.weightUnitOfMeasureCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType">
     *       &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policies
        extends PoliciesType
    {

        @XmlAttribute(name = "GuaranteeRoomTypeViaGDS")
        protected Boolean guaranteeRoomTypeViaGDS;
        @XmlAttribute(name = "GuaranteeRoomTypeViaCRC")
        protected Boolean guaranteeRoomTypeViaCRC;
        @XmlAttribute(name = "GuaranteeRoomTypeViaProperty")
        protected Boolean guaranteeRoomTypeViaProperty;

        /**
         * Gets the value of the guaranteeRoomTypeViaGDS property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaGDS() {
            return guaranteeRoomTypeViaGDS;
        }

        /**
         * Sets the value of the guaranteeRoomTypeViaGDS property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaGDS(Boolean value) {
            this.guaranteeRoomTypeViaGDS = value;
        }

        /**
         * Gets the value of the guaranteeRoomTypeViaCRC property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaCRC() {
            return guaranteeRoomTypeViaCRC;
        }

        /**
         * Sets the value of the guaranteeRoomTypeViaCRC property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaCRC(Boolean value) {
            this.guaranteeRoomTypeViaCRC = value;
        }

        /**
         * Gets the value of the guaranteeRoomTypeViaProperty property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaProperty() {
            return guaranteeRoomTypeViaProperty;
        }

        /**
         * Sets the value of the guaranteeRoomTypeViaProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaProperty(Boolean value) {
            this.guaranteeRoomTypeViaProperty = value;
        }

    }

}
