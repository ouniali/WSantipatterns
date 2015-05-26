
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
 *         &lt;element name="IncChrgSTT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STTNonSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="STTSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotChrgAmtSTT">
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
 *         &lt;element name="TaxPaySTTAvgRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STTPaid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RebateUs88E">
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
    "incChrgSTT",
    "taxPaySTTAvgRate",
    "sttPaid",
    "rebateUs88E"
})
@XmlRootElement(name = "ScheduleSTTR")
public class ScheduleSTTR {

    @XmlElement(name = "IncChrgSTT", required = true)
    protected ScheduleSTTR.IncChrgSTT incChrgSTT;
    @XmlElement(name = "TaxPaySTTAvgRate", required = true)
    protected BigInteger taxPaySTTAvgRate;
    @XmlElement(name = "STTPaid", required = true)
    protected BigInteger sttPaid;
    @XmlElement(name = "RebateUs88E", required = true)
    protected BigInteger rebateUs88E;

    /**
     * Gets the value of the incChrgSTT property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleSTTR.IncChrgSTT }
     *     
     */
    public ScheduleSTTR.IncChrgSTT getIncChrgSTT() {
        return incChrgSTT;
    }

    /**
     * Sets the value of the incChrgSTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleSTTR.IncChrgSTT }
     *     
     */
    public void setIncChrgSTT(ScheduleSTTR.IncChrgSTT value) {
        this.incChrgSTT = value;
    }

    /**
     * Gets the value of the taxPaySTTAvgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxPaySTTAvgRate() {
        return taxPaySTTAvgRate;
    }

    /**
     * Sets the value of the taxPaySTTAvgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxPaySTTAvgRate(BigInteger value) {
        this.taxPaySTTAvgRate = value;
    }

    /**
     * Gets the value of the sttPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTTPaid() {
        return sttPaid;
    }

    /**
     * Sets the value of the sttPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTTPaid(BigInteger value) {
        this.sttPaid = value;
    }

    /**
     * Gets the value of the rebateUs88E property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRebateUs88E() {
        return rebateUs88E;
    }

    /**
     * Sets the value of the rebateUs88E property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRebateUs88E(BigInteger value) {
        this.rebateUs88E = value;
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
     *         &lt;element name="STTNonSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="STTSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotChrgAmtSTT">
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
        "sttNonSpecBus",
        "sttSpecBus",
        "totChrgAmtSTT"
    })
    public static class IncChrgSTT {

        @XmlElement(name = "STTNonSpecBus", required = true)
        protected BigInteger sttNonSpecBus;
        @XmlElement(name = "STTSpecBus", required = true)
        protected BigInteger sttSpecBus;
        @XmlElement(name = "TotChrgAmtSTT", required = true)
        protected BigInteger totChrgAmtSTT;

        /**
         * Gets the value of the sttNonSpecBus property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTTNonSpecBus() {
            return sttNonSpecBus;
        }

        /**
         * Sets the value of the sttNonSpecBus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTTNonSpecBus(BigInteger value) {
            this.sttNonSpecBus = value;
        }

        /**
         * Gets the value of the sttSpecBus property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTTSpecBus() {
            return sttSpecBus;
        }

        /**
         * Sets the value of the sttSpecBus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTTSpecBus(BigInteger value) {
            this.sttSpecBus = value;
        }

        /**
         * Gets the value of the totChrgAmtSTT property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotChrgAmtSTT() {
            return totChrgAmtSTT;
        }

        /**
         * Sets the value of the totChrgAmtSTT property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotChrgAmtSTT(BigInteger value) {
            this.totChrgAmtSTT = value;
        }

    }

}
