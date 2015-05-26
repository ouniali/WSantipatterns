
package trainpass.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ws_2013.PriceValue;


/**
 * <p>Java class for PassProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{WS_2013.TrainPass}ArrayOfAttribute" minOccurs="0"/>
 *         &lt;element name="CommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountriesCovered" type="{WS_2013.TrainPass}ArrayOfCountry" minOccurs="0"/>
 *         &lt;element name="Duration" type="{WS_2013.TrainPass}Duration" minOccurs="0"/>
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterrailPass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nSenior" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nYouths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NeedFirstTravelDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nFreeChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nMandatorySelectedCountries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalClassOfService" type="{WS_2013.TrainPass}PhysicalClassOfService" minOccurs="0"/>
 *         &lt;element name="QuantityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TermsAndConditionsEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SalePrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PassengerTypeDetails" type="{WS_2013.TrainPass}ArrayOfPassengerTypeDetail" minOccurs="0"/>
 *         &lt;element name="DefaultPassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassType" type="{WS_2013.TrainPass}ePassType"/>
 *         &lt;element name="ConsecutivePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QuantityCoveredCountries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassProduct", propOrder = {
    "attributes",
    "commissionPercentage",
    "countriesCovered",
    "duration",
    "familyId",
    "familyName",
    "interrailPass",
    "nAdults",
    "nChildren",
    "nSenior",
    "nYouths",
    "needFirstTravelDate",
    "nFreeChildren",
    "nMandatorySelectedCountries",
    "physicalClassOfService",
    "quantityEnabled",
    "termsAndConditionsEN",
    "termsAndConditionsPT",
    "productName",
    "productId",
    "currencyCommission",
    "valueCommission",
    "salePrice",
    "passengerTypeDetails",
    "defaultPassengerType",
    "passType",
    "consecutivePeriod",
    "conversionRate",
    "quantityCoveredCountries"
})
public class PassProduct {

    @XmlElement(name = "Attributes")
    protected ArrayOfAttribute attributes;
    @XmlElement(name = "CommissionPercentage")
    protected String commissionPercentage;
    @XmlElement(name = "CountriesCovered")
    protected ArrayOfCountry countriesCovered;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "FamilyId")
    protected int familyId;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "InterrailPass", required = true, type = Boolean.class, nillable = true)
    protected Boolean interrailPass;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nAdults;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nChildren;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nSenior;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nYouths;
    @XmlElement(name = "NeedFirstTravelDate", required = true, type = Boolean.class, nillable = true)
    protected Boolean needFirstTravelDate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nFreeChildren;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nMandatorySelectedCountries;
    @XmlElement(name = "PhysicalClassOfService")
    protected PhysicalClassOfService physicalClassOfService;
    @XmlElement(name = "QuantityEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean quantityEnabled;
    @XmlElement(name = "TermsAndConditionsEN")
    protected String termsAndConditionsEN;
    @XmlElement(name = "TermsAndConditionsPT")
    protected String termsAndConditionsPT;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "CurrencyCommission")
    protected String currencyCommission;
    @XmlElement(name = "ValueCommission")
    protected double valueCommission;
    @XmlElement(name = "SalePrice")
    protected PriceValue salePrice;
    @XmlElement(name = "PassengerTypeDetails")
    protected ArrayOfPassengerTypeDetail passengerTypeDetails;
    @XmlElement(name = "DefaultPassengerType")
    protected String defaultPassengerType;
    @XmlElement(name = "PassType", required = true)
    @XmlSchemaType(name = "string")
    protected EPassType passType;
    @XmlElement(name = "ConsecutivePeriod")
    protected boolean consecutivePeriod;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "QuantityCoveredCountries")
    protected int quantityCoveredCountries;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setAttributes(ArrayOfAttribute value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the commissionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    /**
     * Sets the value of the commissionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPercentage(String value) {
        this.commissionPercentage = value;
    }

    /**
     * Gets the value of the countriesCovered property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountry }
     *     
     */
    public ArrayOfCountry getCountriesCovered() {
        return countriesCovered;
    }

    /**
     * Sets the value of the countriesCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountry }
     *     
     */
    public void setCountriesCovered(ArrayOfCountry value) {
        this.countriesCovered = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the familyId property.
     * 
     */
    public int getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     */
    public void setFamilyId(int value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the interrailPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterrailPass() {
        return interrailPass;
    }

    /**
     * Sets the value of the interrailPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterrailPass(Boolean value) {
        this.interrailPass = value;
    }

    /**
     * Gets the value of the nAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNAdults() {
        return nAdults;
    }

    /**
     * Sets the value of the nAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNAdults(Integer value) {
        this.nAdults = value;
    }

    /**
     * Gets the value of the nChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNChildren() {
        return nChildren;
    }

    /**
     * Sets the value of the nChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNChildren(Integer value) {
        this.nChildren = value;
    }

    /**
     * Gets the value of the nSenior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSenior() {
        return nSenior;
    }

    /**
     * Sets the value of the nSenior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSenior(Integer value) {
        this.nSenior = value;
    }

    /**
     * Gets the value of the nYouths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNYouths() {
        return nYouths;
    }

    /**
     * Sets the value of the nYouths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNYouths(Integer value) {
        this.nYouths = value;
    }

    /**
     * Gets the value of the needFirstTravelDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedFirstTravelDate() {
        return needFirstTravelDate;
    }

    /**
     * Sets the value of the needFirstTravelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedFirstTravelDate(Boolean value) {
        this.needFirstTravelDate = value;
    }

    /**
     * Gets the value of the nFreeChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNFreeChildren() {
        return nFreeChildren;
    }

    /**
     * Sets the value of the nFreeChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNFreeChildren(Integer value) {
        this.nFreeChildren = value;
    }

    /**
     * Gets the value of the nMandatorySelectedCountries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNMandatorySelectedCountries() {
        return nMandatorySelectedCountries;
    }

    /**
     * Sets the value of the nMandatorySelectedCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNMandatorySelectedCountries(Integer value) {
        this.nMandatorySelectedCountries = value;
    }

    /**
     * Gets the value of the physicalClassOfService property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalClassOfService }
     *     
     */
    public PhysicalClassOfService getPhysicalClassOfService() {
        return physicalClassOfService;
    }

    /**
     * Sets the value of the physicalClassOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalClassOfService }
     *     
     */
    public void setPhysicalClassOfService(PhysicalClassOfService value) {
        this.physicalClassOfService = value;
    }

    /**
     * Gets the value of the quantityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityEnabled() {
        return quantityEnabled;
    }

    /**
     * Sets the value of the quantityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityEnabled(Boolean value) {
        this.quantityEnabled = value;
    }

    /**
     * Gets the value of the termsAndConditionsEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditionsEN() {
        return termsAndConditionsEN;
    }

    /**
     * Sets the value of the termsAndConditionsEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditionsEN(String value) {
        this.termsAndConditionsEN = value;
    }

    /**
     * Gets the value of the termsAndConditionsPT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditionsPT() {
        return termsAndConditionsPT;
    }

    /**
     * Sets the value of the termsAndConditionsPT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditionsPT(String value) {
        this.termsAndConditionsPT = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the currencyCommission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCommission() {
        return currencyCommission;
    }

    /**
     * Sets the value of the currencyCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCommission(String value) {
        this.currencyCommission = value;
    }

    /**
     * Gets the value of the valueCommission property.
     * 
     */
    public double getValueCommission() {
        return valueCommission;
    }

    /**
     * Sets the value of the valueCommission property.
     * 
     */
    public void setValueCommission(double value) {
        this.valueCommission = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSalePrice(PriceValue value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the passengerTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPassengerTypeDetail }
     *     
     */
    public ArrayOfPassengerTypeDetail getPassengerTypeDetails() {
        return passengerTypeDetails;
    }

    /**
     * Sets the value of the passengerTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPassengerTypeDetail }
     *     
     */
    public void setPassengerTypeDetails(ArrayOfPassengerTypeDetail value) {
        this.passengerTypeDetails = value;
    }

    /**
     * Gets the value of the defaultPassengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPassengerType() {
        return defaultPassengerType;
    }

    /**
     * Sets the value of the defaultPassengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPassengerType(String value) {
        this.defaultPassengerType = value;
    }

    /**
     * Gets the value of the passType property.
     * 
     * @return
     *     possible object is
     *     {@link EPassType }
     *     
     */
    public EPassType getPassType() {
        return passType;
    }

    /**
     * Sets the value of the passType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPassType }
     *     
     */
    public void setPassType(EPassType value) {
        this.passType = value;
    }

    /**
     * Gets the value of the consecutivePeriod property.
     * 
     */
    public boolean isConsecutivePeriod() {
        return consecutivePeriod;
    }

    /**
     * Sets the value of the consecutivePeriod property.
     * 
     */
    public void setConsecutivePeriod(boolean value) {
        this.consecutivePeriod = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     */
    public double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     */
    public void setConversionRate(double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the quantityCoveredCountries property.
     * 
     */
    public int getQuantityCoveredCountries() {
        return quantityCoveredCountries;
    }

    /**
     * Sets the value of the quantityCoveredCountries property.
     * 
     */
    public void setQuantityCoveredCountries(int value) {
        this.quantityCoveredCountries = value;
    }

}
