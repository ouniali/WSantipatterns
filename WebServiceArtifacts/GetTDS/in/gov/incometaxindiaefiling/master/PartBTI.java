
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Salaries" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncomeFromHP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProfBusGain" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProfGainNoSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProfGainSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProfGainSpecifiedBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotProfBusGain">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}CapGain" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncFromOS" minOccurs="0"/>
 *         &lt;element name="TotalTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrentYearLoss" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BalanceAfterSetoffLosses">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BroughtFwdLossesSetoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GrossTotalIncome" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="DeductionsUnderScheduleVIA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalIncome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetAgricultureIncomeOrOtherIncomeForRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AggregateIncome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LossesOfCurrentYearCarriedFwd" minOccurs="0">
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
    "salaries",
    "incomeFromHP",
    "profBusGain",
    "capGain",
    "incFromOS",
    "totalTI",
    "currentYearLoss",
    "balanceAfterSetoffLosses",
    "broughtFwdLossesSetoff",
    "grossTotalIncome",
    "deductionsUnderScheduleVIA",
    "totalIncome",
    "netAgricultureIncomeOrOtherIncomeForRate",
    "aggregateIncome",
    "lossesOfCurrentYearCarriedFwd"
})
@XmlRootElement(name = "PartB-TI")
public class PartBTI {

    @XmlElement(name = "Salaries", defaultValue = "0")
    protected BigInteger salaries;
    @XmlElement(name = "IncomeFromHP", defaultValue = "0")
    protected BigInteger incomeFromHP;
    @XmlElement(name = "ProfBusGain")
    protected PartBTI.ProfBusGain profBusGain;
    @XmlElement(name = "CapGain")
    protected CapGain capGain;
    @XmlElement(name = "IncFromOS")
    protected IncFromOS incFromOS;
    @XmlElement(name = "TotalTI", required = true, defaultValue = "0")
    protected BigInteger totalTI;
    @XmlElement(name = "CurrentYearLoss", defaultValue = "0")
    protected BigInteger currentYearLoss;
    @XmlElement(name = "BalanceAfterSetoffLosses", required = true, defaultValue = "0")
    protected BigInteger balanceAfterSetoffLosses;
    @XmlElement(name = "BroughtFwdLossesSetoff", defaultValue = "0")
    protected BigInteger broughtFwdLossesSetoff;
    @XmlElement(name = "GrossTotalIncome", required = true, defaultValue = "0")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger grossTotalIncome;
    @XmlElement(name = "DeductionsUnderScheduleVIA", defaultValue = "0")
    protected BigInteger deductionsUnderScheduleVIA;
    @XmlElement(name = "TotalIncome", required = true, defaultValue = "0")
    protected BigInteger totalIncome;
    @XmlElement(name = "NetAgricultureIncomeOrOtherIncomeForRate", defaultValue = "0")
    protected BigInteger netAgricultureIncomeOrOtherIncomeForRate;
    @XmlElement(name = "AggregateIncome", required = true, defaultValue = "0")
    protected BigInteger aggregateIncome;
    @XmlElement(name = "LossesOfCurrentYearCarriedFwd", defaultValue = "0")
    protected BigInteger lossesOfCurrentYearCarriedFwd;

    /**
     * Gets the value of the salaries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalaries() {
        return salaries;
    }

    /**
     * Sets the value of the salaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalaries(BigInteger value) {
        this.salaries = value;
    }

    /**
     * Gets the value of the incomeFromHP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncomeFromHP() {
        return incomeFromHP;
    }

    /**
     * Sets the value of the incomeFromHP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncomeFromHP(BigInteger value) {
        this.incomeFromHP = value;
    }

    /**
     * Gets the value of the profBusGain property.
     * 
     * @return
     *     possible object is
     *     {@link PartBTI.ProfBusGain }
     *     
     */
    public PartBTI.ProfBusGain getProfBusGain() {
        return profBusGain;
    }

    /**
     * Sets the value of the profBusGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartBTI.ProfBusGain }
     *     
     */
    public void setProfBusGain(PartBTI.ProfBusGain value) {
        this.profBusGain = value;
    }

    /**
     *  4. Income from Capital Gains 
     * 
     * @return
     *     possible object is
     *     {@link CapGain }
     *     
     */
    public CapGain getCapGain() {
        return capGain;
    }

    /**
     * Sets the value of the capGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapGain }
     *     
     */
    public void setCapGain(CapGain value) {
        this.capGain = value;
    }

    /**
     *  5. Income of other sources
     * 
     * @return
     *     possible object is
     *     {@link IncFromOS }
     *     
     */
    public IncFromOS getIncFromOS() {
        return incFromOS;
    }

    /**
     * Sets the value of the incFromOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncFromOS }
     *     
     */
    public void setIncFromOS(IncFromOS value) {
        this.incFromOS = value;
    }

    /**
     * Gets the value of the totalTI property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTI() {
        return totalTI;
    }

    /**
     * Sets the value of the totalTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTI(BigInteger value) {
        this.totalTI = value;
    }

    /**
     * Gets the value of the currentYearLoss property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentYearLoss() {
        return currentYearLoss;
    }

    /**
     * Sets the value of the currentYearLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentYearLoss(BigInteger value) {
        this.currentYearLoss = value;
    }

    /**
     * Gets the value of the balanceAfterSetoffLosses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBalanceAfterSetoffLosses() {
        return balanceAfterSetoffLosses;
    }

    /**
     * Sets the value of the balanceAfterSetoffLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBalanceAfterSetoffLosses(BigInteger value) {
        this.balanceAfterSetoffLosses = value;
    }

    /**
     * Gets the value of the broughtFwdLossesSetoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroughtFwdLossesSetoff() {
        return broughtFwdLossesSetoff;
    }

    /**
     * Sets the value of the broughtFwdLossesSetoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroughtFwdLossesSetoff(BigInteger value) {
        this.broughtFwdLossesSetoff = value;
    }

    /**
     * Gets the value of the grossTotalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossTotalIncome() {
        return grossTotalIncome;
    }

    /**
     * Sets the value of the grossTotalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossTotalIncome(BigInteger value) {
        this.grossTotalIncome = value;
    }

    /**
     * Gets the value of the deductionsUnderScheduleVIA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductionsUnderScheduleVIA() {
        return deductionsUnderScheduleVIA;
    }

    /**
     * Sets the value of the deductionsUnderScheduleVIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductionsUnderScheduleVIA(BigInteger value) {
        this.deductionsUnderScheduleVIA = value;
    }

    /**
     * Gets the value of the totalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalIncome() {
        return totalIncome;
    }

    /**
     * Sets the value of the totalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalIncome(BigInteger value) {
        this.totalIncome = value;
    }

    /**
     * Gets the value of the netAgricultureIncomeOrOtherIncomeForRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetAgricultureIncomeOrOtherIncomeForRate() {
        return netAgricultureIncomeOrOtherIncomeForRate;
    }

    /**
     * Sets the value of the netAgricultureIncomeOrOtherIncomeForRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetAgricultureIncomeOrOtherIncomeForRate(BigInteger value) {
        this.netAgricultureIncomeOrOtherIncomeForRate = value;
    }

    /**
     * Gets the value of the aggregateIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAggregateIncome() {
        return aggregateIncome;
    }

    /**
     * Sets the value of the aggregateIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAggregateIncome(BigInteger value) {
        this.aggregateIncome = value;
    }

    /**
     * Gets the value of the lossesOfCurrentYearCarriedFwd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLossesOfCurrentYearCarriedFwd() {
        return lossesOfCurrentYearCarriedFwd;
    }

    /**
     * Sets the value of the lossesOfCurrentYearCarriedFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLossesOfCurrentYearCarriedFwd(BigInteger value) {
        this.lossesOfCurrentYearCarriedFwd = value;
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
     *         &lt;element name="ProfGainNoSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProfGainSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProfGainSpecifiedBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotProfBusGain">
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
        "profGainNoSpecBus",
        "profGainSpecBus",
        "profGainSpecifiedBus",
        "totProfBusGain"
    })
    public static class ProfBusGain {

        @XmlElement(name = "ProfGainNoSpecBus", defaultValue = "0")
        protected long profGainNoSpecBus;
        @XmlElement(name = "ProfGainSpecBus", required = true, defaultValue = "0")
        protected BigInteger profGainSpecBus;
        @XmlElement(name = "ProfGainSpecifiedBus", required = true, defaultValue = "0")
        protected BigInteger profGainSpecifiedBus;
        @XmlElement(name = "TotProfBusGain", required = true, defaultValue = "0")
        protected BigInteger totProfBusGain;

        /**
         * Gets the value of the profGainNoSpecBus property.
         * 
         */
        public long getProfGainNoSpecBus() {
            return profGainNoSpecBus;
        }

        /**
         * Sets the value of the profGainNoSpecBus property.
         * 
         */
        public void setProfGainNoSpecBus(long value) {
            this.profGainNoSpecBus = value;
        }

        /**
         * Gets the value of the profGainSpecBus property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProfGainSpecBus() {
            return profGainSpecBus;
        }

        /**
         * Sets the value of the profGainSpecBus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProfGainSpecBus(BigInteger value) {
            this.profGainSpecBus = value;
        }

        /**
         * Gets the value of the profGainSpecifiedBus property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProfGainSpecifiedBus() {
            return profGainSpecifiedBus;
        }

        /**
         * Sets the value of the profGainSpecifiedBus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProfGainSpecifiedBus(BigInteger value) {
            this.profGainSpecifiedBus = value;
        }

        /**
         * Gets the value of the totProfBusGain property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotProfBusGain() {
            return totProfBusGain;
        }

        /**
         * Sets the value of the totProfBusGain property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotProfBusGain(BigInteger value) {
            this.totProfBusGain = value;
        }

    }

}
