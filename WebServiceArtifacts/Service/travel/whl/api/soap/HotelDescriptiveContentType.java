
package travel.whl.api.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The HotelDescriptiveContent element contains the descriptive information about a hotel property.
 * 
 * <p>Java class for HotelDescriptiveContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelInfo" type="{http://api.whl.travel/soap}HotelInfoType" minOccurs="0"/>
 *         &lt;element name="FacilityInfo" type="{http://api.whl.travel/soap}FacilityInfoType" minOccurs="0"/>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://api.whl.travel/soap}PoliciesType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaInfo" type="{http://api.whl.travel/soap}AreaInfoType" minOccurs="0"/>
 *         &lt;element name="MultimediaDescriptions" type="{http://api.whl.travel/soap}MultimediaDescriptionsType" minOccurs="0"/>
 *         &lt;element name="ContactInfos" type="{http://api.whl.travel/soap}ContactInfosType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://api.whl.travel/soap}CurrencyCodeGroup"/>
 *       &lt;attribute name="TimeZone" type="{http://api.whl.travel/soap}StringLength1to64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDescriptiveContentType", propOrder = {
    "hotelInfo",
    "facilityInfo",
    "policies",
    "areaInfo",
    "multimediaDescriptions",
    "contactInfos"
})
@XmlSeeAlso({
    travel.whl.api.soap.HotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent.class
})
public class HotelDescriptiveContentType {

    @XmlElement(name = "HotelInfo")
    protected HotelInfoType hotelInfo;
    @XmlElement(name = "FacilityInfo")
    protected FacilityInfoType facilityInfo;
    @XmlElement(name = "Policies")
    protected HotelDescriptiveContentType.Policies policies;
    @XmlElement(name = "AreaInfo")
    protected AreaInfoType areaInfo;
    @XmlElement(name = "MultimediaDescriptions")
    protected MultimediaDescriptionsType multimediaDescriptions;
    @XmlElement(name = "ContactInfos")
    protected ContactInfosType contactInfos;
    @XmlAttribute(name = "TimeZone")
    protected String timeZone;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

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
     *     {@link ContactInfosType }
     *     
     */
    public ContactInfosType getContactInfos() {
        return contactInfos;
    }

    /**
     * Sets the value of the contactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfosType }
     *     
     */
    public void setContactInfos(ContactInfosType value) {
        this.contactInfos = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://api.whl.travel/soap}PoliciesType">
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


    }

}
