
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
 *         &lt;element name="IncOthThanOwnRaceHorse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DividendGross">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InterestGross">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RentFromMachPlantBldgs">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthersGross">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotalOSGross">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Deductions"/>
 *                   &lt;element name="BalanceNoRaceHorse">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WinLottRacePuzz" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotOthSrcNoRaceHorse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncFromOwnHorse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Receipts">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeductSec57">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BalanceOwnRaceHorse">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IncChargeable" minOccurs="0">
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
    "incOthThanOwnRaceHorse",
    "winLottRacePuzz",
    "totOthSrcNoRaceHorse",
    "incFromOwnHorse",
    "incChargeable"
})
@XmlRootElement(name = "ScheduleOS")
public class ScheduleOS {

    @XmlElement(name = "IncOthThanOwnRaceHorse")
    protected ScheduleOS.IncOthThanOwnRaceHorse incOthThanOwnRaceHorse;
    @XmlElement(name = "WinLottRacePuzz", defaultValue = "0")
    protected Long winLottRacePuzz;
    @XmlElement(name = "TotOthSrcNoRaceHorse", defaultValue = "0")
    protected Long totOthSrcNoRaceHorse;
    @XmlElement(name = "IncFromOwnHorse")
    protected ScheduleOS.IncFromOwnHorse incFromOwnHorse;
    @XmlElement(name = "IncChargeable", defaultValue = "0")
    protected BigInteger incChargeable;

    /**
     * Gets the value of the incOthThanOwnRaceHorse property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOS.IncOthThanOwnRaceHorse }
     *     
     */
    public ScheduleOS.IncOthThanOwnRaceHorse getIncOthThanOwnRaceHorse() {
        return incOthThanOwnRaceHorse;
    }

    /**
     * Sets the value of the incOthThanOwnRaceHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOS.IncOthThanOwnRaceHorse }
     *     
     */
    public void setIncOthThanOwnRaceHorse(ScheduleOS.IncOthThanOwnRaceHorse value) {
        this.incOthThanOwnRaceHorse = value;
    }

    /**
     * Gets the value of the winLottRacePuzz property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWinLottRacePuzz() {
        return winLottRacePuzz;
    }

    /**
     * Sets the value of the winLottRacePuzz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWinLottRacePuzz(Long value) {
        this.winLottRacePuzz = value;
    }

    /**
     * Gets the value of the totOthSrcNoRaceHorse property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotOthSrcNoRaceHorse() {
        return totOthSrcNoRaceHorse;
    }

    /**
     * Sets the value of the totOthSrcNoRaceHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotOthSrcNoRaceHorse(Long value) {
        this.totOthSrcNoRaceHorse = value;
    }

    /**
     * Gets the value of the incFromOwnHorse property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOS.IncFromOwnHorse }
     *     
     */
    public ScheduleOS.IncFromOwnHorse getIncFromOwnHorse() {
        return incFromOwnHorse;
    }

    /**
     * Sets the value of the incFromOwnHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOS.IncFromOwnHorse }
     *     
     */
    public void setIncFromOwnHorse(ScheduleOS.IncFromOwnHorse value) {
        this.incFromOwnHorse = value;
    }

    /**
     * Gets the value of the incChargeable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncChargeable() {
        return incChargeable;
    }

    /**
     * Sets the value of the incChargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncChargeable(BigInteger value) {
        this.incChargeable = value;
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
     *         &lt;element name="Receipts">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeductSec57">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BalanceOwnRaceHorse">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
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
        "receipts",
        "deductSec57",
        "balanceOwnRaceHorse"
    })
    public static class IncFromOwnHorse {

        @XmlElement(name = "Receipts", required = true, defaultValue = "0")
        protected BigInteger receipts;
        @XmlElement(name = "DeductSec57", required = true, defaultValue = "0")
        protected BigInteger deductSec57;
        @XmlElement(name = "BalanceOwnRaceHorse", defaultValue = "0")
        protected long balanceOwnRaceHorse;

        /**
         * Gets the value of the receipts property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReceipts() {
            return receipts;
        }

        /**
         * Sets the value of the receipts property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReceipts(BigInteger value) {
            this.receipts = value;
        }

        /**
         * Gets the value of the deductSec57 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeductSec57() {
            return deductSec57;
        }

        /**
         * Sets the value of the deductSec57 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeductSec57(BigInteger value) {
            this.deductSec57 = value;
        }

        /**
         * Gets the value of the balanceOwnRaceHorse property.
         * 
         */
        public long getBalanceOwnRaceHorse() {
            return balanceOwnRaceHorse;
        }

        /**
         * Sets the value of the balanceOwnRaceHorse property.
         * 
         */
        public void setBalanceOwnRaceHorse(long value) {
            this.balanceOwnRaceHorse = value;
        }

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
     *         &lt;element name="DividendGross">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InterestGross">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RentFromMachPlantBldgs">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthersGross">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalOSGross">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Deductions"/>
     *         &lt;element name="BalanceNoRaceHorse">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
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
        "dividendGross",
        "interestGross",
        "rentFromMachPlantBldgs",
        "othersGross",
        "totalOSGross",
        "deductions",
        "balanceNoRaceHorse"
    })
    public static class IncOthThanOwnRaceHorse {

        @XmlElement(name = "DividendGross", required = true, defaultValue = "0")
        protected BigInteger dividendGross;
        @XmlElement(name = "InterestGross", required = true, defaultValue = "0")
        protected BigInteger interestGross;
        @XmlElement(name = "RentFromMachPlantBldgs", required = true, defaultValue = "0")
        protected BigInteger rentFromMachPlantBldgs;
        @XmlElement(name = "OthersGross", required = true, defaultValue = "0")
        protected BigInteger othersGross;
        @XmlElement(name = "TotalOSGross", required = true, defaultValue = "0")
        protected BigInteger totalOSGross;
        @XmlElement(name = "Deductions", required = true)
        protected Deductions deductions;
        @XmlElement(name = "BalanceNoRaceHorse", defaultValue = "0")
        protected long balanceNoRaceHorse;

        /**
         * Gets the value of the dividendGross property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDividendGross() {
            return dividendGross;
        }

        /**
         * Sets the value of the dividendGross property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDividendGross(BigInteger value) {
            this.dividendGross = value;
        }

        /**
         * Gets the value of the interestGross property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInterestGross() {
            return interestGross;
        }

        /**
         * Sets the value of the interestGross property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInterestGross(BigInteger value) {
            this.interestGross = value;
        }

        /**
         * Gets the value of the rentFromMachPlantBldgs property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRentFromMachPlantBldgs() {
            return rentFromMachPlantBldgs;
        }

        /**
         * Sets the value of the rentFromMachPlantBldgs property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRentFromMachPlantBldgs(BigInteger value) {
            this.rentFromMachPlantBldgs = value;
        }

        /**
         * Gets the value of the othersGross property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthersGross() {
            return othersGross;
        }

        /**
         * Sets the value of the othersGross property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthersGross(BigInteger value) {
            this.othersGross = value;
        }

        /**
         * Gets the value of the totalOSGross property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalOSGross() {
            return totalOSGross;
        }

        /**
         * Sets the value of the totalOSGross property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalOSGross(BigInteger value) {
            this.totalOSGross = value;
        }

        /**
         * Gets the value of the deductions property.
         * 
         * @return
         *     possible object is
         *     {@link Deductions }
         *     
         */
        public Deductions getDeductions() {
            return deductions;
        }

        /**
         * Sets the value of the deductions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Deductions }
         *     
         */
        public void setDeductions(Deductions value) {
            this.deductions = value;
        }

        /**
         * Gets the value of the balanceNoRaceHorse property.
         * 
         */
        public long getBalanceNoRaceHorse() {
            return balanceNoRaceHorse;
        }

        /**
         * Sets the value of the balanceNoRaceHorse property.
         * 
         */
        public void setBalanceNoRaceHorse(long value) {
            this.balanceNoRaceHorse = value;
        }

    }

}
