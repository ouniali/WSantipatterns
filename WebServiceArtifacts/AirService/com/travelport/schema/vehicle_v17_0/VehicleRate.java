
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeDistance;
import com.travelport.schema.common_v15_0.TypeRateCategory;
import com.travelport.schema.common_v15_0.TypeRateGuarantee;
import com.travelport.schema.common_v15_0.TypeRateTimePeriod;


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
 *         &lt;element name="VehicleRateDescription" type="{http://www.travelport.com/schema/vehicle_v17_0}typeVehicleRateDescription" minOccurs="0"/>
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v17_0}typeRateHostIndicator" minOccurs="0"/>
 *         &lt;element name="HourlyLateCharge" type="{http://www.travelport.com/schema/vehicle_v17_0}typeRateInfo" minOccurs="0"/>
 *         &lt;element name="DailyLateCharge" type="{http://www.travelport.com/schema/vehicle_v17_0}typeRateInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}RateInclusions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="RateForPeriod" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="RatePeriod" type="{http://www.travelport.com/schema/common_v15_0}typeRateTimePeriod" />
 *       &lt;attribute name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ExtraMileageCharge" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Units" type="{http://www.travelport.com/schema/common_v15_0}typeDistance" />
 *       &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateAvailability" type="{http://www.travelport.com/schema/vehicle_v17_0}typeRateAvailability" />
 *       &lt;attribute name="DropOffCharge" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="BaseRate" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="RequiredCharges" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="RateCode" type="{http://www.travelport.com/schema/common_v15_0}typeRateCode" />
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v15_0}typeRateCategory" />
 *       &lt;attribute name="DiscountNumber" type="{http://www.travelport.com/schema/common_v15_0}typeDiscountNumber" />
 *       &lt;attribute name="VendorCode" type="{http://www.travelport.com/schema/common_v15_0}typeSupplierCode" />
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RateCodePeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateGuaranteeType" type="{http://www.travelport.com/schema/common_v15_0}typeRateGuarantee" />
 *       &lt;attribute name="RequiredPayment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Guarantee"/>
 *             &lt;enumeration value="Deposit"/>
 *             &lt;enumeration value="PrePayment"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DropOffChargesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleRateDescription",
    "rateHostIndicator",
    "hourlyLateCharge",
    "dailyLateCharge",
    "rateInclusions"
})
@XmlRootElement(name = "VehicleRate")
public class VehicleRate {

    @XmlElement(name = "VehicleRateDescription")
    protected TypeVehicleRateDescription vehicleRateDescription;
    @XmlElement(name = "RateHostIndicator")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "HourlyLateCharge")
    protected TypeRateInfo hourlyLateCharge;
    @XmlElement(name = "DailyLateCharge")
    protected TypeRateInfo dailyLateCharge;
    @XmlElement(name = "RateInclusions")
    protected RateInclusions rateInclusions;
    @XmlAttribute(name = "EstimatedTotalAmount")
    protected String estimatedTotalAmount;
    @XmlAttribute(name = "RateForPeriod")
    protected String rateForPeriod;
    @XmlAttribute(name = "RatePeriod")
    protected TypeRateTimePeriod ratePeriod;
    @XmlAttribute(name = "NumberOfPeriods")
    protected Integer numberOfPeriods;
    @XmlAttribute(name = "UnlimitedMileage")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "MileageAllowance")
    protected Integer mileageAllowance;
    @XmlAttribute(name = "ExtraMileageCharge")
    protected String extraMileageCharge;
    @XmlAttribute(name = "Units")
    protected TypeDistance units;
    @XmlAttribute(name = "RateSource")
    protected String rateSource;
    @XmlAttribute(name = "RateAvailability")
    protected TypeRateAvailability rateAvailability;
    @XmlAttribute(name = "DropOffCharge")
    protected String dropOffCharge;
    @XmlAttribute(name = "BaseRate")
    protected String baseRate;
    @XmlAttribute(name = "RequiredCharges")
    protected String requiredCharges;
    @XmlAttribute(name = "RateCode")
    protected String rateCode;
    @XmlAttribute(name = "RateCategory")
    protected TypeRateCategory rateCategory;
    @XmlAttribute(name = "DiscountNumber")
    protected String discountNumber;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "RateGuaranteed")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RateCodePeriod")
    protected String rateCodePeriod;
    @XmlAttribute(name = "PromotionalCode")
    protected String promotionalCode;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "RateGuaranteeType")
    protected TypeRateGuarantee rateGuaranteeType;
    @XmlAttribute(name = "RequiredPayment")
    protected String requiredPayment;
    @XmlAttribute(name = "DropOffChargesIncluded")
    protected Boolean dropOffChargesIncluded;

    /**
     * Gets the value of the vehicleRateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleRateDescription }
     *     
     */
    public TypeVehicleRateDescription getVehicleRateDescription() {
        return vehicleRateDescription;
    }

    /**
     * Sets the value of the vehicleRateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleRateDescription }
     *     
     */
    public void setVehicleRateDescription(TypeVehicleRateDescription value) {
        this.vehicleRateDescription = value;
    }

    /**
     * Gets the value of the rateHostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    public TypeRateHostIndicator getRateHostIndicator() {
        return rateHostIndicator;
    }

    /**
     * Sets the value of the rateHostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    public void setRateHostIndicator(TypeRateHostIndicator value) {
        this.rateHostIndicator = value;
    }

    /**
     * Gets the value of the hourlyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    public TypeRateInfo getHourlyLateCharge() {
        return hourlyLateCharge;
    }

    /**
     * Sets the value of the hourlyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    public void setHourlyLateCharge(TypeRateInfo value) {
        this.hourlyLateCharge = value;
    }

    /**
     * Gets the value of the dailyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    public TypeRateInfo getDailyLateCharge() {
        return dailyLateCharge;
    }

    /**
     * Sets the value of the dailyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    public void setDailyLateCharge(TypeRateInfo value) {
        this.dailyLateCharge = value;
    }

    /**
     * Gets the value of the rateInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RateInclusions }
     *     
     */
    public RateInclusions getRateInclusions() {
        return rateInclusions;
    }

    /**
     * Sets the value of the rateInclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInclusions }
     *     
     */
    public void setRateInclusions(RateInclusions value) {
        this.rateInclusions = value;
    }

    /**
     * Gets the value of the estimatedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedTotalAmount() {
        return estimatedTotalAmount;
    }

    /**
     * Sets the value of the estimatedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedTotalAmount(String value) {
        this.estimatedTotalAmount = value;
    }

    /**
     * Gets the value of the rateForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateForPeriod() {
        return rateForPeriod;
    }

    /**
     * Sets the value of the rateForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateForPeriod(String value) {
        this.rateForPeriod = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    public TypeRateTimePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    public void setRatePeriod(TypeRateTimePeriod value) {
        this.ratePeriod = value;
    }

    /**
     * Gets the value of the numberOfPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Sets the value of the numberOfPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPeriods(Integer value) {
        this.numberOfPeriods = value;
    }

    /**
     * Gets the value of the unlimitedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedMileage() {
        return unlimitedMileage;
    }

    /**
     * Sets the value of the unlimitedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedMileage(Boolean value) {
        this.unlimitedMileage = value;
    }

    /**
     * Gets the value of the mileageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMileageAllowance() {
        return mileageAllowance;
    }

    /**
     * Sets the value of the mileageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMileageAllowance(Integer value) {
        this.mileageAllowance = value;
    }

    /**
     * Gets the value of the extraMileageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraMileageCharge() {
        return extraMileageCharge;
    }

    /**
     * Sets the value of the extraMileageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraMileageCharge(String value) {
        this.extraMileageCharge = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setUnits(TypeDistance value) {
        this.units = value;
    }

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSource(String value) {
        this.rateSource = value;
    }

    /**
     * Gets the value of the rateAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateAvailability }
     *     
     */
    public TypeRateAvailability getRateAvailability() {
        return rateAvailability;
    }

    /**
     * Sets the value of the rateAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateAvailability }
     *     
     */
    public void setRateAvailability(TypeRateAvailability value) {
        this.rateAvailability = value;
    }

    /**
     * Gets the value of the dropOffCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffCharge() {
        return dropOffCharge;
    }

    /**
     * Sets the value of the dropOffCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffCharge(String value) {
        this.dropOffCharge = value;
    }

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRate(String value) {
        this.baseRate = value;
    }

    /**
     * Gets the value of the requiredCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredCharges() {
        return requiredCharges;
    }

    /**
     * Sets the value of the requiredCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredCharges(String value) {
        this.requiredCharges = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateCategory }
     *     
     */
    public TypeRateCategory getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateCategory }
     *     
     */
    public void setRateCategory(TypeRateCategory value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the discountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountNumber() {
        return discountNumber;
    }

    /**
     * Sets the value of the discountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountNumber(String value) {
        this.discountNumber = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRateGuaranteed() {
        if (rateGuaranteed == null) {
            return false;
        } else {
            return rateGuaranteed;
        }
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the rateCodePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCodePeriod() {
        return rateCodePeriod;
    }

    /**
     * Sets the value of the rateCodePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCodePeriod(String value) {
        this.rateCodePeriod = value;
    }

    /**
     * Gets the value of the promotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Sets the value of the promotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the rateGuaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateGuarantee }
     *     
     */
    public TypeRateGuarantee getRateGuaranteeType() {
        return rateGuaranteeType;
    }

    /**
     * Sets the value of the rateGuaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateGuarantee }
     *     
     */
    public void setRateGuaranteeType(TypeRateGuarantee value) {
        this.rateGuaranteeType = value;
    }

    /**
     * Gets the value of the requiredPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredPayment() {
        return requiredPayment;
    }

    /**
     * Sets the value of the requiredPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredPayment(String value) {
        this.requiredPayment = value;
    }

    /**
     * Gets the value of the dropOffChargesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropOffChargesIncluded() {
        return dropOffChargesIncluded;
    }

    /**
     * Sets the value of the dropOffChargesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropOffChargesIncluded(Boolean value) {
        this.dropOffChargesIncluded = value;
    }

}
