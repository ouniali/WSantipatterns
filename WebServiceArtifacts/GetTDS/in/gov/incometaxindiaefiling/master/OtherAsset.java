
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
 *         &lt;element name="FullConsideration">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductSec48">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AquisitCost">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ImproveCost">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ExpOnTrans">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotalDedn">
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
 *         &lt;element name="BalanceCG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LossSec94of7Or94of8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExemptionOrDednUs54s">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BalCG">
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
    "fullConsideration",
    "deductSec48",
    "balanceCG",
    "lossSec94Of7Or94Of8",
    "exemptionOrDednUs54S",
    "balCG"
})
@XmlRootElement(name = "OtherAsset")
public class OtherAsset {

    @XmlElement(name = "FullConsideration", required = true, defaultValue = "0")
    protected BigInteger fullConsideration;
    @XmlElement(name = "DeductSec48", required = true)
    protected OtherAsset.DeductSec48 deductSec48;
    @XmlElement(name = "BalanceCG", defaultValue = "0")
    protected long balanceCG;
    @XmlElement(name = "LossSec94of7Or94of8", defaultValue = "0")
    protected BigInteger lossSec94Of7Or94Of8;
    @XmlElement(name = "ExemptionOrDednUs54s", required = true, defaultValue = "0")
    protected BigInteger exemptionOrDednUs54S;
    @XmlElement(name = "BalCG", defaultValue = "0")
    protected long balCG;

    /**
     * Gets the value of the fullConsideration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullConsideration() {
        return fullConsideration;
    }

    /**
     * Sets the value of the fullConsideration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullConsideration(BigInteger value) {
        this.fullConsideration = value;
    }

    /**
     * Gets the value of the deductSec48 property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAsset.DeductSec48 }
     *     
     */
    public OtherAsset.DeductSec48 getDeductSec48() {
        return deductSec48;
    }

    /**
     * Sets the value of the deductSec48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAsset.DeductSec48 }
     *     
     */
    public void setDeductSec48(OtherAsset.DeductSec48 value) {
        this.deductSec48 = value;
    }

    /**
     * Gets the value of the balanceCG property.
     * 
     */
    public long getBalanceCG() {
        return balanceCG;
    }

    /**
     * Sets the value of the balanceCG property.
     * 
     */
    public void setBalanceCG(long value) {
        this.balanceCG = value;
    }

    /**
     * Gets the value of the lossSec94Of7Or94Of8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLossSec94Of7Or94Of8() {
        return lossSec94Of7Or94Of8;
    }

    /**
     * Sets the value of the lossSec94Of7Or94Of8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLossSec94Of7Or94Of8(BigInteger value) {
        this.lossSec94Of7Or94Of8 = value;
    }

    /**
     * Gets the value of the exemptionOrDednUs54S property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExemptionOrDednUs54S() {
        return exemptionOrDednUs54S;
    }

    /**
     * Sets the value of the exemptionOrDednUs54S property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExemptionOrDednUs54S(BigInteger value) {
        this.exemptionOrDednUs54S = value;
    }

    /**
     * Gets the value of the balCG property.
     * 
     */
    public long getBalCG() {
        return balCG;
    }

    /**
     * Sets the value of the balCG property.
     * 
     */
    public void setBalCG(long value) {
        this.balCG = value;
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
     *         &lt;element name="AquisitCost">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ImproveCost">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ExpOnTrans">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalDedn">
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
        "aquisitCost",
        "improveCost",
        "expOnTrans",
        "totalDedn"
    })
    public static class DeductSec48 {

        @XmlElement(name = "AquisitCost", required = true, defaultValue = "0")
        protected BigInteger aquisitCost;
        @XmlElement(name = "ImproveCost", required = true, defaultValue = "0")
        protected BigInteger improveCost;
        @XmlElement(name = "ExpOnTrans", required = true, defaultValue = "0")
        protected BigInteger expOnTrans;
        @XmlElement(name = "TotalDedn", required = true, defaultValue = "0")
        protected BigInteger totalDedn;

        /**
         * Gets the value of the aquisitCost property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAquisitCost() {
            return aquisitCost;
        }

        /**
         * Sets the value of the aquisitCost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAquisitCost(BigInteger value) {
            this.aquisitCost = value;
        }

        /**
         * Gets the value of the improveCost property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getImproveCost() {
            return improveCost;
        }

        /**
         * Sets the value of the improveCost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setImproveCost(BigInteger value) {
            this.improveCost = value;
        }

        /**
         * Gets the value of the expOnTrans property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExpOnTrans() {
            return expOnTrans;
        }

        /**
         * Sets the value of the expOnTrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExpOnTrans(BigInteger value) {
            this.expOnTrans = value;
        }

        /**
         * Gets the value of the totalDedn property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalDedn() {
            return totalDedn;
        }

        /**
         * Sets the value of the totalDedn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalDedn(BigInteger value) {
            this.totalDedn = value;
        }

    }

}
