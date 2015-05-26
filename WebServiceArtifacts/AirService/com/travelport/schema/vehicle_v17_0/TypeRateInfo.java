
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeDistance;


/**
 * Additional information for extra days or hours.
 * 
 * <p>Java class for typeRateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RateForPeriod" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Units" type="{http://www.travelport.com/schema/common_v15_0}typeDistance" />
 *       &lt;attribute name="ExtraMileageCharge" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRateInfo")
public class TypeRateInfo {

    @XmlAttribute(name = "RateForPeriod")
    protected String rateForPeriod;
    @XmlAttribute(name = "NumberOfPeriods")
    protected Integer numberOfPeriods;
    @XmlAttribute(name = "UnlimitedMileage")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "MileageAllowance")
    protected Integer mileageAllowance;
    @XmlAttribute(name = "Units")
    protected TypeDistance units;
    @XmlAttribute(name = "ExtraMileageCharge")
    protected String extraMileageCharge;

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

}
