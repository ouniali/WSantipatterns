
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
 *         &lt;element name="Salary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalCurYr" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotHPlossCurYr" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotBusLoss" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotOthSrcLossNoRaceHorse" minOccurs="0">
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
 *         &lt;element name="TotalLossSetOff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotHPlossCurYrSetoff" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotBusLossSetoff" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotOthSrcLossNoRaceHorseSetoff" minOccurs="0">
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
 *         &lt;element name="LossRemAftSetOff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BalHPlossCurYrAftSetoff" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BalBusLossAftSetoff" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BalOthSrcLossNoRaceHorseAftSetoff" minOccurs="0">
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
    "salary",
    "hp",
    "busProfExclSpecProf",
    "speculativeInc",
    "specifiedInc",
    "stcg",
    "ltcg",
    "othSrcExclRaceHorse",
    "othSrcRaceHorse",
    "totalCurYr",
    "totalLossSetOff",
    "lossRemAftSetOff"
})
@XmlRootElement(name = "ScheduleCYLA")
public class ScheduleCYLA {

    @XmlElement(name = "Salary")
    protected ScheduleCYLA.Salary salary;
    @XmlElement(name = "HP")
    protected ScheduleCYLA.HP hp;
    @XmlElement(name = "BusProfExclSpecProf")
    protected ScheduleCYLA.BusProfExclSpecProf busProfExclSpecProf;
    @XmlElement(name = "SpeculativeInc")
    protected ScheduleCYLA.SpeculativeInc speculativeInc;
    @XmlElement(name = "SpecifiedInc")
    protected ScheduleCYLA.SpecifiedInc specifiedInc;
    @XmlElement(name = "STCG")
    protected ScheduleCYLA.STCG stcg;
    @XmlElement(name = "LTCG")
    protected ScheduleCYLA.LTCG ltcg;
    @XmlElement(name = "OthSrcExclRaceHorse")
    protected ScheduleCYLA.OthSrcExclRaceHorse othSrcExclRaceHorse;
    @XmlElement(name = "OthSrcRaceHorse")
    protected ScheduleCYLA.OthSrcRaceHorse othSrcRaceHorse;
    @XmlElement(name = "TotalCurYr")
    protected ScheduleCYLA.TotalCurYr totalCurYr;
    @XmlElement(name = "TotalLossSetOff")
    protected ScheduleCYLA.TotalLossSetOff totalLossSetOff;
    @XmlElement(name = "LossRemAftSetOff")
    protected ScheduleCYLA.LossRemAftSetOff lossRemAftSetOff;

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.Salary }
     *     
     */
    public ScheduleCYLA.Salary getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.Salary }
     *     
     */
    public void setSalary(ScheduleCYLA.Salary value) {
        this.salary = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.HP }
     *     
     */
    public ScheduleCYLA.HP getHP() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.HP }
     *     
     */
    public void setHP(ScheduleCYLA.HP value) {
        this.hp = value;
    }

    /**
     * Gets the value of the busProfExclSpecProf property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.BusProfExclSpecProf }
     *     
     */
    public ScheduleCYLA.BusProfExclSpecProf getBusProfExclSpecProf() {
        return busProfExclSpecProf;
    }

    /**
     * Sets the value of the busProfExclSpecProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.BusProfExclSpecProf }
     *     
     */
    public void setBusProfExclSpecProf(ScheduleCYLA.BusProfExclSpecProf value) {
        this.busProfExclSpecProf = value;
    }

    /**
     * Gets the value of the speculativeInc property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.SpeculativeInc }
     *     
     */
    public ScheduleCYLA.SpeculativeInc getSpeculativeInc() {
        return speculativeInc;
    }

    /**
     * Sets the value of the speculativeInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.SpeculativeInc }
     *     
     */
    public void setSpeculativeInc(ScheduleCYLA.SpeculativeInc value) {
        this.speculativeInc = value;
    }

    /**
     * Gets the value of the specifiedInc property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.SpecifiedInc }
     *     
     */
    public ScheduleCYLA.SpecifiedInc getSpecifiedInc() {
        return specifiedInc;
    }

    /**
     * Sets the value of the specifiedInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.SpecifiedInc }
     *     
     */
    public void setSpecifiedInc(ScheduleCYLA.SpecifiedInc value) {
        this.specifiedInc = value;
    }

    /**
     * Gets the value of the stcg property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.STCG }
     *     
     */
    public ScheduleCYLA.STCG getSTCG() {
        return stcg;
    }

    /**
     * Sets the value of the stcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.STCG }
     *     
     */
    public void setSTCG(ScheduleCYLA.STCG value) {
        this.stcg = value;
    }

    /**
     * Gets the value of the ltcg property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.LTCG }
     *     
     */
    public ScheduleCYLA.LTCG getLTCG() {
        return ltcg;
    }

    /**
     * Sets the value of the ltcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.LTCG }
     *     
     */
    public void setLTCG(ScheduleCYLA.LTCG value) {
        this.ltcg = value;
    }

    /**
     * Gets the value of the othSrcExclRaceHorse property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.OthSrcExclRaceHorse }
     *     
     */
    public ScheduleCYLA.OthSrcExclRaceHorse getOthSrcExclRaceHorse() {
        return othSrcExclRaceHorse;
    }

    /**
     * Sets the value of the othSrcExclRaceHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.OthSrcExclRaceHorse }
     *     
     */
    public void setOthSrcExclRaceHorse(ScheduleCYLA.OthSrcExclRaceHorse value) {
        this.othSrcExclRaceHorse = value;
    }

    /**
     * Gets the value of the othSrcRaceHorse property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.OthSrcRaceHorse }
     *     
     */
    public ScheduleCYLA.OthSrcRaceHorse getOthSrcRaceHorse() {
        return othSrcRaceHorse;
    }

    /**
     * Sets the value of the othSrcRaceHorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.OthSrcRaceHorse }
     *     
     */
    public void setOthSrcRaceHorse(ScheduleCYLA.OthSrcRaceHorse value) {
        this.othSrcRaceHorse = value;
    }

    /**
     * Gets the value of the totalCurYr property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.TotalCurYr }
     *     
     */
    public ScheduleCYLA.TotalCurYr getTotalCurYr() {
        return totalCurYr;
    }

    /**
     * Sets the value of the totalCurYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.TotalCurYr }
     *     
     */
    public void setTotalCurYr(ScheduleCYLA.TotalCurYr value) {
        this.totalCurYr = value;
    }

    /**
     * Gets the value of the totalLossSetOff property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.TotalLossSetOff }
     *     
     */
    public ScheduleCYLA.TotalLossSetOff getTotalLossSetOff() {
        return totalLossSetOff;
    }

    /**
     * Sets the value of the totalLossSetOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.TotalLossSetOff }
     *     
     */
    public void setTotalLossSetOff(ScheduleCYLA.TotalLossSetOff value) {
        this.totalLossSetOff = value;
    }

    /**
     * Gets the value of the lossRemAftSetOff property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCYLA.LossRemAftSetOff }
     *     
     */
    public ScheduleCYLA.LossRemAftSetOff getLossRemAftSetOff() {
        return lossRemAftSetOff;
    }

    /**
     * Sets the value of the lossRemAftSetOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCYLA.LossRemAftSetOff }
     *     
     */
    public void setLossRemAftSetOff(ScheduleCYLA.LossRemAftSetOff value) {
        this.lossRemAftSetOff = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class BusProfExclSpecProf {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class HP {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class LTCG {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element name="BalHPlossCurYrAftSetoff" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BalBusLossAftSetoff" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BalOthSrcLossNoRaceHorseAftSetoff" minOccurs="0">
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
        "balHPlossCurYrAftSetoff",
        "balBusLossAftSetoff",
        "balOthSrcLossNoRaceHorseAftSetoff"
    })
    public static class LossRemAftSetOff {

        @XmlElement(name = "BalHPlossCurYrAftSetoff", defaultValue = "0")
        protected BigInteger balHPlossCurYrAftSetoff;
        @XmlElement(name = "BalBusLossAftSetoff", defaultValue = "0")
        protected BigInteger balBusLossAftSetoff;
        @XmlElement(name = "BalOthSrcLossNoRaceHorseAftSetoff", defaultValue = "0")
        protected BigInteger balOthSrcLossNoRaceHorseAftSetoff;

        /**
         * Gets the value of the balHPlossCurYrAftSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBalHPlossCurYrAftSetoff() {
            return balHPlossCurYrAftSetoff;
        }

        /**
         * Sets the value of the balHPlossCurYrAftSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBalHPlossCurYrAftSetoff(BigInteger value) {
            this.balHPlossCurYrAftSetoff = value;
        }

        /**
         * Gets the value of the balBusLossAftSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBalBusLossAftSetoff() {
            return balBusLossAftSetoff;
        }

        /**
         * Sets the value of the balBusLossAftSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBalBusLossAftSetoff(BigInteger value) {
            this.balBusLossAftSetoff = value;
        }

        /**
         * Gets the value of the balOthSrcLossNoRaceHorseAftSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBalOthSrcLossNoRaceHorseAftSetoff() {
            return balOthSrcLossNoRaceHorseAftSetoff;
        }

        /**
         * Sets the value of the balOthSrcLossNoRaceHorseAftSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBalOthSrcLossNoRaceHorseAftSetoff(BigInteger value) {
            this.balOthSrcLossNoRaceHorseAftSetoff = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class OthSrcExclRaceHorse {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class OthSrcRaceHorse {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class STCG {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class Salary {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class SpecifiedInc {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncCYLA"/>
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
        "incCYLA"
    })
    public static class SpeculativeInc {

        @XmlElement(name = "IncCYLA", required = true)
        protected IncCYLA incCYLA;

        /**
         * Gets the value of the incCYLA property.
         * 
         * @return
         *     possible object is
         *     {@link IncCYLA }
         *     
         */
        public IncCYLA getIncCYLA() {
            return incCYLA;
        }

        /**
         * Sets the value of the incCYLA property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncCYLA }
         *     
         */
        public void setIncCYLA(IncCYLA value) {
            this.incCYLA = value;
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
     *         &lt;element name="TotHPlossCurYr" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotBusLoss" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotOthSrcLossNoRaceHorse" minOccurs="0">
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
        "totHPlossCurYr",
        "totBusLoss",
        "totOthSrcLossNoRaceHorse"
    })
    public static class TotalCurYr {

        @XmlElement(name = "TotHPlossCurYr", defaultValue = "0")
        protected BigInteger totHPlossCurYr;
        @XmlElement(name = "TotBusLoss", defaultValue = "0")
        protected BigInteger totBusLoss;
        @XmlElement(name = "TotOthSrcLossNoRaceHorse", defaultValue = "0")
        protected BigInteger totOthSrcLossNoRaceHorse;

        /**
         * Gets the value of the totHPlossCurYr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotHPlossCurYr() {
            return totHPlossCurYr;
        }

        /**
         * Sets the value of the totHPlossCurYr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotHPlossCurYr(BigInteger value) {
            this.totHPlossCurYr = value;
        }

        /**
         * Gets the value of the totBusLoss property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotBusLoss() {
            return totBusLoss;
        }

        /**
         * Sets the value of the totBusLoss property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotBusLoss(BigInteger value) {
            this.totBusLoss = value;
        }

        /**
         * Gets the value of the totOthSrcLossNoRaceHorse property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotOthSrcLossNoRaceHorse() {
            return totOthSrcLossNoRaceHorse;
        }

        /**
         * Sets the value of the totOthSrcLossNoRaceHorse property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotOthSrcLossNoRaceHorse(BigInteger value) {
            this.totOthSrcLossNoRaceHorse = value;
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
     *         &lt;element name="TotHPlossCurYrSetoff" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotBusLossSetoff" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotOthSrcLossNoRaceHorseSetoff" minOccurs="0">
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
        "totHPlossCurYrSetoff",
        "totBusLossSetoff",
        "totOthSrcLossNoRaceHorseSetoff"
    })
    public static class TotalLossSetOff {

        @XmlElement(name = "TotHPlossCurYrSetoff", defaultValue = "0")
        protected BigInteger totHPlossCurYrSetoff;
        @XmlElement(name = "TotBusLossSetoff", defaultValue = "0")
        protected BigInteger totBusLossSetoff;
        @XmlElement(name = "TotOthSrcLossNoRaceHorseSetoff", defaultValue = "0")
        protected BigInteger totOthSrcLossNoRaceHorseSetoff;

        /**
         * Gets the value of the totHPlossCurYrSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotHPlossCurYrSetoff() {
            return totHPlossCurYrSetoff;
        }

        /**
         * Sets the value of the totHPlossCurYrSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotHPlossCurYrSetoff(BigInteger value) {
            this.totHPlossCurYrSetoff = value;
        }

        /**
         * Gets the value of the totBusLossSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotBusLossSetoff() {
            return totBusLossSetoff;
        }

        /**
         * Sets the value of the totBusLossSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotBusLossSetoff(BigInteger value) {
            this.totBusLossSetoff = value;
        }

        /**
         * Gets the value of the totOthSrcLossNoRaceHorseSetoff property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotOthSrcLossNoRaceHorseSetoff() {
            return totOthSrcLossNoRaceHorseSetoff;
        }

        /**
         * Sets the value of the totOthSrcLossNoRaceHorseSetoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotOthSrcLossNoRaceHorseSetoff(BigInteger value) {
            this.totOthSrcLossNoRaceHorseSetoff = value;
        }

    }

}
