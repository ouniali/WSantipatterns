
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
 *         &lt;element name="HP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusProfExclSpecProf" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpeculativeInc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecifiedInc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STCG" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LTCG" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OthSrcExclRaceHorse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OthSrcRaceHorse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalBFLossSetOff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotBFLossSetoff">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotUnabsorbedDeprSetoff">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotAllUs35cl4Setoff">
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
 *         &lt;element name="IncomeOfCurrYrAftCYLABFLA">
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
    "hp",
    "busProfExclSpecProf",
    "speculativeInc",
    "specifiedInc",
    "stcg",
    "ltcg",
    "othSrcExclRaceHorse",
    "othSrcRaceHorse",
    "totalBFLossSetOff",
    "incomeOfCurrYrAftCYLABFLA"
})
@XmlRootElement(name = "ScheduleBFLA")
public class ScheduleBFLA {

    @XmlElement(name = "HP")
    protected ScheduleBFLA.HP hp;
    @XmlElement(name = "BusProfExclSpecProf")
    protected ScheduleBFLA.BusProfExclSpecProf busProfExclSpecProf;
    @XmlElement(name = "SpeculativeInc")
    protected ScheduleBFLA.SpeculativeInc speculativeInc;
    @XmlElement(name = "SpecifiedInc")
    protected ScheduleBFLA.SpecifiedInc specifiedInc;
    @XmlElement(name = "STCG")
    protected ScheduleBFLA.STCG stcg;
    @XmlElement(name = "LTCG")
    protected ScheduleBFLA.LTCG ltcg;
    @XmlElement(name = "OthSrcExclRaceHorse")
    protected ScheduleBFLA.OthSrcExclRaceHorse othSrcExclRaceHorse;
    @XmlElement(name = "OthSrcRaceHorse")
    protected ScheduleBFLA.OthSrcRaceHorse othSrcRaceHorse;
    @XmlElement(name = "TotalBFLossSetOff")
    protected ScheduleBFLA.TotalBFLossSetOff totalBFLossSetOff;
    @XmlElement(name = "IncomeOfCurrYrAftCYLABFLA", required = true, defaultValue = "0")
    protected BigInteger incomeOfCurrYrAftCYLABFLA;

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.HP }
     *     
     */
    public ScheduleBFLA.HP getHP() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.HP }
     *     
     */
    public void setHP(ScheduleBFLA.HP value) {
        this.hp = value;
    }

    /**
     * Gets the value of the busProfExclSpecProf property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.BusProfExclSpecProf }
     *     
     */
    public ScheduleBFLA.BusProfExclSpecProf getBusProfExclSpecProf() {
        return busProfExclSpecProf;
    }

    /**
     * Sets the value of the busProfExclSpecProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.BusProfExclSpecProf }
     *     
     */
    public void setBusProfExclSpecProf(ScheduleBFLA.BusProfExclSpecProf value) {
        this.busProfExclSpecProf = value;
    }

    /**
     * Gets the value of the speculativeInc property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.SpeculativeInc }
     *     
     */
    public ScheduleBFLA.SpeculativeInc getSpeculativeInc() {
        return speculativeInc;
    }

    /**
     * Sets the value of the speculativeInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.SpeculativeInc }
     *     
     */
    public void setSpeculativeInc(ScheduleBFLA.SpeculativeInc value) {
        this.speculativeInc = value;
    }

    /**
     * Gets the value of the specifiedInc property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.SpecifiedInc }
     *     
     */
    public ScheduleBFLA.SpecifiedInc getSpecifiedInc() {
        return specifiedInc;
    }

    /**
     * Sets the value of the specifiedInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.SpecifiedInc }
     *     
     */
    public void setSpecifiedInc(ScheduleBFLA.SpecifiedInc value) {
        this.specifiedInc = value;
    }

    /**
     * Gets the value of the stcg property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.STCG }
     *     
     */
    public ScheduleBFLA.STCG getSTCG() {
        return stcg;
    }

    /**
     * Sets the value of the stcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.STCG }
     *     
     */
    public void setSTCG(ScheduleBFLA.STCG value) {
        this.stcg = value;
    }

    /**
     * Gets the value of the ltcg property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.LTCG }
     *     
     */
    public ScheduleBFLA.LTCG getLTCG() {
        return ltcg;
    }

    /**
     * Sets the value of the ltcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.LTCG }
     *     
     */
    public void setLTCG(ScheduleBFLA.LTCG value) {
        this.ltcg = value;
    }

    /**
     * Gets the value of the othSrcExclRaceHorse property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.OthSrcExclRaceHorse }
     *     
     */
    public ScheduleBFLA.OthSrcExclRaceHorse getOthSrcExclRaceHorse() {
        return othSrcExclRaceHorse;
    }

    /**
     * Sets the value of the othSrcExclRaceHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.OthSrcExclRaceHorse }
     *     
     */
    public void setOthSrcExclRaceHorse(ScheduleBFLA.OthSrcExclRaceHorse value) {
        this.othSrcExclRaceHorse = value;
    }

    /**
     * Gets the value of the othSrcRaceHorse property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.OthSrcRaceHorse }
     *     
     */
    public ScheduleBFLA.OthSrcRaceHorse getOthSrcRaceHorse() {
        return othSrcRaceHorse;
    }

    /**
     * Sets the value of the othSrcRaceHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.OthSrcRaceHorse }
     *     
     */
    public void setOthSrcRaceHorse(ScheduleBFLA.OthSrcRaceHorse value) {
        this.othSrcRaceHorse = value;
    }

    /**
     * Gets the value of the totalBFLossSetOff property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBFLA.TotalBFLossSetOff }
     *     
     */
    public ScheduleBFLA.TotalBFLossSetOff getTotalBFLossSetOff() {
        return totalBFLossSetOff;
    }

    /**
     * Sets the value of the totalBFLossSetOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBFLA.TotalBFLossSetOff }
     *     
     */
    public void setTotalBFLossSetOff(ScheduleBFLA.TotalBFLossSetOff value) {
        this.totalBFLossSetOff = value;
    }

    /**
     * Gets the value of the incomeOfCurrYrAftCYLABFLA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncomeOfCurrYrAftCYLABFLA() {
        return incomeOfCurrYrAftCYLABFLA;
    }

    /**
     * Sets the value of the incomeOfCurrYrAftCYLABFLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncomeOfCurrYrAftCYLABFLA(BigInteger value) {
        this.incomeOfCurrYrAftCYLABFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class BusProfExclSpecProf {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class HP {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class LTCG {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class OthSrcExclRaceHorse {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class OthSrcRaceHorse {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class STCG {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class SpecifiedInc {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncBFLA"/>
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
        "incBFLA"
    })
    public static class SpeculativeInc {

        @XmlElement(name = "IncBFLA", required = true)
        protected IncBFLA incBFLA;

        /**
         * Gets the value of the incBFLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncBFLA }
         *     
         */
        public IncBFLA getIncBFLA() {
            return incBFLA;
        }

        /**
         * Sets the value of the incBFLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncBFLA }
         *     
         */
        public void setIncBFLA(IncBFLA value) {
            this.incBFLA = value;
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
     *         &lt;element name="TotBFLossSetoff">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotUnabsorbedDeprSetoff">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotAllUs35cl4Setoff">
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
        "totBFLossSetoff",
        "totUnabsorbedDeprSetoff",
        "totAllUs35Cl4Setoff"
    })
    public static class TotalBFLossSetOff {

        @XmlElement(name = "TotBFLossSetoff", required = true, defaultValue = "0")
        protected BigInteger totBFLossSetoff;
        @XmlElement(name = "TotUnabsorbedDeprSetoff", required = true, defaultValue = "0")
        protected BigInteger totUnabsorbedDeprSetoff;
        @XmlElement(name = "TotAllUs35cl4Setoff", required = true, defaultValue = "0")
        protected BigInteger totAllUs35Cl4Setoff;

        /**
         * Gets the value of the totBFLossSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotBFLossSetoff() {
            return totBFLossSetoff;
        }

        /**
         * Sets the value of the totBFLossSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotBFLossSetoff(BigInteger value) {
            this.totBFLossSetoff = value;
        }

        /**
         * Gets the value of the totUnabsorbedDeprSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotUnabsorbedDeprSetoff() {
            return totUnabsorbedDeprSetoff;
        }

        /**
         * Sets the value of the totUnabsorbedDeprSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotUnabsorbedDeprSetoff(BigInteger value) {
            this.totUnabsorbedDeprSetoff = value;
        }

        /**
         * Gets the value of the totAllUs35Cl4Setoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotAllUs35Cl4Setoff() {
            return totAllUs35Cl4Setoff;
        }

        /**
         * Sets the value of the totAllUs35Cl4Setoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotAllUs35Cl4Setoff(BigInteger value) {
            this.totAllUs35Cl4Setoff = value;
        }

    }

}
