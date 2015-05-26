
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZIPCodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZIPCodeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalZIPOrPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedZIPOrPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityDeliveryInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateSortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateSortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AreaCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardGMTOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightGMTOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMTOffsetText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsesDayLightSavingsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USPSFinanceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CBSA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CBSADiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CBSATitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aliases" type="{http://www.strikeiron.com}ArrayOfAliasInfo" minOccurs="0"/>
 *         &lt;element name="Streets" type="{http://www.strikeiron.com}ArrayOfStreetInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZIPCodeResult", propOrder = {
    "originalZIPOrPostalCode",
    "formattedZIPOrPostalCode",
    "city",
    "stateOrProvinceCode",
    "stateOrProvinceName",
    "countryCode",
    "countryName",
    "countyName",
    "classificationCode",
    "classificationDescription",
    "cityDeliveryInd",
    "rateSortCode",
    "rateSortDescription",
    "areaCodes",
    "timeZoneName",
    "standardGMTOffset",
    "daylightGMTOffset",
    "gmtOffsetText",
    "usesDayLightSavingsInd",
    "latitude",
    "longitude",
    "elevation",
    "countyArea",
    "stateFIPS",
    "countyFIPS",
    "uspsFinanceNbr",
    "msa",
    "pmsa",
    "cbsa",
    "cbsaDiv",
    "cbsaTitle",
    "aliases",
    "streets"
})
public class ZIPCodeResult {

    @XmlElement(name = "OriginalZIPOrPostalCode")
    protected String originalZIPOrPostalCode;
    @XmlElement(name = "FormattedZIPOrPostalCode")
    protected String formattedZIPOrPostalCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateOrProvinceCode")
    protected String stateOrProvinceCode;
    @XmlElement(name = "StateOrProvinceName")
    protected String stateOrProvinceName;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "ClassificationCode")
    protected String classificationCode;
    @XmlElement(name = "ClassificationDescription")
    protected String classificationDescription;
    @XmlElement(name = "CityDeliveryInd")
    protected String cityDeliveryInd;
    @XmlElement(name = "RateSortCode")
    protected String rateSortCode;
    @XmlElement(name = "RateSortDescription")
    protected String rateSortDescription;
    @XmlElement(name = "AreaCodes")
    protected String areaCodes;
    @XmlElement(name = "TimeZoneName")
    protected String timeZoneName;
    @XmlElement(name = "StandardGMTOffset")
    protected String standardGMTOffset;
    @XmlElement(name = "DaylightGMTOffset")
    protected String daylightGMTOffset;
    @XmlElement(name = "GMTOffsetText")
    protected String gmtOffsetText;
    @XmlElement(name = "UsesDayLightSavingsInd")
    protected String usesDayLightSavingsInd;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Elevation")
    protected String elevation;
    @XmlElement(name = "CountyArea")
    protected String countyArea;
    @XmlElement(name = "StateFIPS")
    protected String stateFIPS;
    @XmlElement(name = "CountyFIPS")
    protected String countyFIPS;
    @XmlElement(name = "USPSFinanceNbr")
    protected String uspsFinanceNbr;
    @XmlElement(name = "MSA")
    protected String msa;
    @XmlElement(name = "PMSA")
    protected String pmsa;
    @XmlElement(name = "CBSA")
    protected String cbsa;
    @XmlElement(name = "CBSADiv")
    protected String cbsaDiv;
    @XmlElement(name = "CBSATitle")
    protected String cbsaTitle;
    @XmlElement(name = "Aliases")
    protected ArrayOfAliasInfo aliases;
    @XmlElement(name = "Streets")
    protected ArrayOfStreetInfo streets;

    /**
     * Gets the value of the originalZIPOrPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalZIPOrPostalCode() {
        return originalZIPOrPostalCode;
    }

    /**
     * Sets the value of the originalZIPOrPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalZIPOrPostalCode(String value) {
        this.originalZIPOrPostalCode = value;
    }

    /**
     * Gets the value of the formattedZIPOrPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedZIPOrPostalCode() {
        return formattedZIPOrPostalCode;
    }

    /**
     * Sets the value of the formattedZIPOrPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedZIPOrPostalCode(String value) {
        this.formattedZIPOrPostalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Sets the value of the stateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvinceCode(String value) {
        this.stateOrProvinceCode = value;
    }

    /**
     * Gets the value of the stateOrProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvinceName() {
        return stateOrProvinceName;
    }

    /**
     * Sets the value of the stateOrProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvinceName(String value) {
        this.stateOrProvinceName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * Gets the value of the classificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationDescription() {
        return classificationDescription;
    }

    /**
     * Sets the value of the classificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationDescription(String value) {
        this.classificationDescription = value;
    }

    /**
     * Gets the value of the cityDeliveryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityDeliveryInd() {
        return cityDeliveryInd;
    }

    /**
     * Sets the value of the cityDeliveryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityDeliveryInd(String value) {
        this.cityDeliveryInd = value;
    }

    /**
     * Gets the value of the rateSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSortCode() {
        return rateSortCode;
    }

    /**
     * Sets the value of the rateSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSortCode(String value) {
        this.rateSortCode = value;
    }

    /**
     * Gets the value of the rateSortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSortDescription() {
        return rateSortDescription;
    }

    /**
     * Sets the value of the rateSortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSortDescription(String value) {
        this.rateSortDescription = value;
    }

    /**
     * Gets the value of the areaCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCodes() {
        return areaCodes;
    }

    /**
     * Sets the value of the areaCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCodes(String value) {
        this.areaCodes = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
    }

    /**
     * Gets the value of the standardGMTOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardGMTOffset() {
        return standardGMTOffset;
    }

    /**
     * Sets the value of the standardGMTOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardGMTOffset(String value) {
        this.standardGMTOffset = value;
    }

    /**
     * Gets the value of the daylightGMTOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightGMTOffset() {
        return daylightGMTOffset;
    }

    /**
     * Sets the value of the daylightGMTOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightGMTOffset(String value) {
        this.daylightGMTOffset = value;
    }

    /**
     * Gets the value of the gmtOffsetText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMTOffsetText() {
        return gmtOffsetText;
    }

    /**
     * Sets the value of the gmtOffsetText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMTOffsetText(String value) {
        this.gmtOffsetText = value;
    }

    /**
     * Gets the value of the usesDayLightSavingsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsesDayLightSavingsInd() {
        return usesDayLightSavingsInd;
    }

    /**
     * Sets the value of the usesDayLightSavingsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsesDayLightSavingsInd(String value) {
        this.usesDayLightSavingsInd = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevation(String value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the countyArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyArea() {
        return countyArea;
    }

    /**
     * Sets the value of the countyArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyArea(String value) {
        this.countyArea = value;
    }

    /**
     * Gets the value of the stateFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateFIPS() {
        return stateFIPS;
    }

    /**
     * Sets the value of the stateFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateFIPS(String value) {
        this.stateFIPS = value;
    }

    /**
     * Gets the value of the countyFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFIPS() {
        return countyFIPS;
    }

    /**
     * Sets the value of the countyFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFIPS(String value) {
        this.countyFIPS = value;
    }

    /**
     * Gets the value of the uspsFinanceNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSFinanceNbr() {
        return uspsFinanceNbr;
    }

    /**
     * Sets the value of the uspsFinanceNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSFinanceNbr(String value) {
        this.uspsFinanceNbr = value;
    }

    /**
     * Gets the value of the msa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSA() {
        return msa;
    }

    /**
     * Sets the value of the msa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSA(String value) {
        this.msa = value;
    }

    /**
     * Gets the value of the pmsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSA() {
        return pmsa;
    }

    /**
     * Sets the value of the pmsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSA(String value) {
        this.pmsa = value;
    }

    /**
     * Gets the value of the cbsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBSA() {
        return cbsa;
    }

    /**
     * Sets the value of the cbsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBSA(String value) {
        this.cbsa = value;
    }

    /**
     * Gets the value of the cbsaDiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBSADiv() {
        return cbsaDiv;
    }

    /**
     * Sets the value of the cbsaDiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBSADiv(String value) {
        this.cbsaDiv = value;
    }

    /**
     * Gets the value of the cbsaTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBSATitle() {
        return cbsaTitle;
    }

    /**
     * Sets the value of the cbsaTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBSATitle(String value) {
        this.cbsaTitle = value;
    }

    /**
     * Gets the value of the aliases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAliasInfo }
     *     
     */
    public ArrayOfAliasInfo getAliases() {
        return aliases;
    }

    /**
     * Sets the value of the aliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAliasInfo }
     *     
     */
    public void setAliases(ArrayOfAliasInfo value) {
        this.aliases = value;
    }

    /**
     * Gets the value of the streets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStreetInfo }
     *     
     */
    public ArrayOfStreetInfo getStreets() {
        return streets;
    }

    /**
     * Sets the value of the streets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStreetInfo }
     *     
     */
    public void setStreets(ArrayOfStreetInfo value) {
        this.streets = value;
    }

}
