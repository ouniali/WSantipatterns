
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="WDVFirstDay">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionsGrThan180Days">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RealizationTotalPeriod">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullRateDeprAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionsLessThan180Days">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RealizationPeriodLessThan180days">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HalfRateDeprAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepreciationAtFullRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepreciationAtHalfRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddlnDeprOnGT180DayAdditions">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddlnDeprOnLessThan180DayAdditions">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDepreciation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpdrOnTrforSaleAsset">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CapGainUs50">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WDVLastDay">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "wdvFirstDay",
    "additionsGrThan180Days",
    "realizationTotalPeriod",
    "fullRateDeprAmt",
    "additionsLessThan180Days",
    "realizationPeriodLessThan180Days",
    "halfRateDeprAmt",
    "depreciationAtFullRate",
    "depreciationAtHalfRate",
    "addlnDeprOnGT180DayAdditions",
    "addlnDeprOnLessThan180DayAdditions",
    "totalDepreciation",
    "expdrOnTrforSaleAsset",
    "capGainUs50",
    "wdvLastDay"
})
@XmlRootElement(name = "DepreciationDetail")
public class DepreciationDetail {

    @XmlElement(name = "WDVFirstDay", required = true, defaultValue = "0")
    protected BigInteger wdvFirstDay;
    @XmlElement(name = "AdditionsGrThan180Days", required = true, defaultValue = "0")
    protected BigInteger additionsGrThan180Days;
    @XmlElement(name = "RealizationTotalPeriod", required = true, defaultValue = "0")
    protected BigInteger realizationTotalPeriod;
    @XmlElement(name = "FullRateDeprAmt", required = true, defaultValue = "0")
    protected BigInteger fullRateDeprAmt;
    @XmlElement(name = "AdditionsLessThan180Days", required = true, defaultValue = "0")
    protected BigInteger additionsLessThan180Days;
    @XmlElement(name = "RealizationPeriodLessThan180days", required = true, defaultValue = "0")
    protected BigInteger realizationPeriodLessThan180Days;
    @XmlElement(name = "HalfRateDeprAmt", required = true, defaultValue = "0")
    protected BigInteger halfRateDeprAmt;
    @XmlElement(name = "DepreciationAtFullRate", required = true, defaultValue = "0")
    protected BigInteger depreciationAtFullRate;
    @XmlElement(name = "DepreciationAtHalfRate", required = true, defaultValue = "0")
    protected BigInteger depreciationAtHalfRate;
    @XmlElement(name = "AddlnDeprOnGT180DayAdditions", required = true, defaultValue = "0")
    protected BigInteger addlnDeprOnGT180DayAdditions;
    @XmlElement(name = "AddlnDeprOnLessThan180DayAdditions", required = true, defaultValue = "0")
    protected BigInteger addlnDeprOnLessThan180DayAdditions;
    @XmlElement(name = "TotalDepreciation", required = true, defaultValue = "0")
    protected BigInteger totalDepreciation;
    @XmlElement(name = "ExpdrOnTrforSaleAsset", required = true, defaultValue = "0")
    protected BigInteger expdrOnTrforSaleAsset;
    @XmlElement(name = "CapGainUs50", defaultValue = "0")
    protected long capGainUs50;
    @XmlElement(name = "WDVLastDay", required = true, defaultValue = "0")
    protected BigInteger wdvLastDay;

    /**
     * Gets the value of the wdvFirstDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWDVFirstDay() {
        return wdvFirstDay;
    }

    /**
     * Sets the value of the wdvFirstDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWDVFirstDay(BigInteger value) {
        this.wdvFirstDay = value;
    }

    /**
     * Gets the value of the additionsGrThan180Days property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdditionsGrThan180Days() {
        return additionsGrThan180Days;
    }

    /**
     * Sets the value of the additionsGrThan180Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdditionsGrThan180Days(BigInteger value) {
        this.additionsGrThan180Days = value;
    }

    /**
     * Gets the value of the realizationTotalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRealizationTotalPeriod() {
        return realizationTotalPeriod;
    }

    /**
     * Sets the value of the realizationTotalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRealizationTotalPeriod(BigInteger value) {
        this.realizationTotalPeriod = value;
    }

    /**
     * Gets the value of the fullRateDeprAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullRateDeprAmt() {
        return fullRateDeprAmt;
    }

    /**
     * Sets the value of the fullRateDeprAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullRateDeprAmt(BigInteger value) {
        this.fullRateDeprAmt = value;
    }

    /**
     * Gets the value of the additionsLessThan180Days property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdditionsLessThan180Days() {
        return additionsLessThan180Days;
    }

    /**
     * Sets the value of the additionsLessThan180Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdditionsLessThan180Days(BigInteger value) {
        this.additionsLessThan180Days = value;
    }

    /**
     * Gets the value of the realizationPeriodLessThan180Days property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRealizationPeriodLessThan180Days() {
        return realizationPeriodLessThan180Days;
    }

    /**
     * Sets the value of the realizationPeriodLessThan180Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRealizationPeriodLessThan180Days(BigInteger value) {
        this.realizationPeriodLessThan180Days = value;
    }

    /**
     * Gets the value of the halfRateDeprAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHalfRateDeprAmt() {
        return halfRateDeprAmt;
    }

    /**
     * Sets the value of the halfRateDeprAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHalfRateDeprAmt(BigInteger value) {
        this.halfRateDeprAmt = value;
    }

    /**
     * Gets the value of the depreciationAtFullRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepreciationAtFullRate() {
        return depreciationAtFullRate;
    }

    /**
     * Sets the value of the depreciationAtFullRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepreciationAtFullRate(BigInteger value) {
        this.depreciationAtFullRate = value;
    }

    /**
     * Gets the value of the depreciationAtHalfRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepreciationAtHalfRate() {
        return depreciationAtHalfRate;
    }

    /**
     * Sets the value of the depreciationAtHalfRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepreciationAtHalfRate(BigInteger value) {
        this.depreciationAtHalfRate = value;
    }

    /**
     * Gets the value of the addlnDeprOnGT180DayAdditions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddlnDeprOnGT180DayAdditions() {
        return addlnDeprOnGT180DayAdditions;
    }

    /**
     * Sets the value of the addlnDeprOnGT180DayAdditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddlnDeprOnGT180DayAdditions(BigInteger value) {
        this.addlnDeprOnGT180DayAdditions = value;
    }

    /**
     * Gets the value of the addlnDeprOnLessThan180DayAdditions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddlnDeprOnLessThan180DayAdditions() {
        return addlnDeprOnLessThan180DayAdditions;
    }

    /**
     * Sets the value of the addlnDeprOnLessThan180DayAdditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddlnDeprOnLessThan180DayAdditions(BigInteger value) {
        this.addlnDeprOnLessThan180DayAdditions = value;
    }

    /**
     * Gets the value of the totalDepreciation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDepreciation() {
        return totalDepreciation;
    }

    /**
     * Sets the value of the totalDepreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDepreciation(BigInteger value) {
        this.totalDepreciation = value;
    }

    /**
     * Gets the value of the expdrOnTrforSaleAsset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpdrOnTrforSaleAsset() {
        return expdrOnTrforSaleAsset;
    }

    /**
     * Sets the value of the expdrOnTrforSaleAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpdrOnTrforSaleAsset(BigInteger value) {
        this.expdrOnTrforSaleAsset = value;
    }

    /**
     * Gets the value of the capGainUs50 property.
     * 
     */
    public long getCapGainUs50() {
        return capGainUs50;
    }

    /**
     * Sets the value of the capGainUs50 property.
     * 
     */
    public void setCapGainUs50(long value) {
        this.capGainUs50 = value;
    }

    /**
     * Gets the value of the wdvLastDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWDVLastDay() {
        return wdvLastDay;
    }

    /**
     * Sets the value of the wdvLastDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWDVLastDay(BigInteger value) {
        this.wdvLastDay = value;
    }

}
