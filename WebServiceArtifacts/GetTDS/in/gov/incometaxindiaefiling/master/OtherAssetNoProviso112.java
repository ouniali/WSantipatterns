
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
 *                   &lt;element name="AquisitCostIndexed">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ImproveCostIndexed">
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
 *         &lt;element name="ExemptionOrDednUs54s">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BalLTCGNo112">
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
    "exemptionOrDednUs54S",
    "balLTCGNo112"
})
@XmlRootElement(name = "OtherAssetNoProviso112")
public class OtherAssetNoProviso112 {

    @XmlElement(name = "FullConsideration", required = true, defaultValue = "0")
    protected BigInteger fullConsideration;
    @XmlElement(name = "DeductSec48", required = true)
    protected OtherAssetNoProviso112 .DeductSec48 deductSec48;
    @XmlElement(name = "BalanceCG", defaultValue = "0")
    protected long balanceCG;
    @XmlElement(name = "ExemptionOrDednUs54s", required = true, defaultValue = "0")
    protected BigInteger exemptionOrDednUs54S;
    @XmlElement(name = "BalLTCGNo112", defaultValue = "0")
    protected long balLTCGNo112;

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
     *     {@link OtherAssetNoProviso112 .DeductSec48 }
     *     
     */
    public OtherAssetNoProviso112 .DeductSec48 getDeductSec48() {
        return deductSec48;
    }

    /**
     * Sets the value of the deductSec48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAssetNoProviso112 .DeductSec48 }
     *     
     */
    public void setDeductSec48(OtherAssetNoProviso112 .DeductSec48 value) {
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
     * Gets the value of the balLTCGNo112 property.
     * 
     */
    public long getBalLTCGNo112() {
        return balLTCGNo112;
    }

    /**
     * Sets the value of the balLTCGNo112 property.
     * 
     */
    public void setBalLTCGNo112(long value) {
        this.balLTCGNo112 = value;
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
     *         &lt;element name="AquisitCostIndexed">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ImproveCostIndexed">
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
        "aquisitCostIndexed",
        "improveCostIndexed",
        "expOnTrans",
        "totalDedn"
    })
    public static class DeductSec48 {

        @XmlElement(name = "AquisitCostIndexed", required = true, defaultValue = "0")
        protected BigInteger aquisitCostIndexed;
        @XmlElement(name = "ImproveCostIndexed", required = true, defaultValue = "0")
        protected BigInteger improveCostIndexed;
        @XmlElement(name = "ExpOnTrans", required = true, defaultValue = "0")
        protected BigInteger expOnTrans;
        @XmlElement(name = "TotalDedn", required = true, defaultValue = "0")
        protected BigInteger totalDedn;

        /**
         * Gets the value of the aquisitCostIndexed property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAquisitCostIndexed() {
            return aquisitCostIndexed;
        }

        /**
         * Sets the value of the aquisitCostIndexed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAquisitCostIndexed(BigInteger value) {
            this.aquisitCostIndexed = value;
        }

        /**
         * Gets the value of the improveCostIndexed property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getImproveCostIndexed() {
            return improveCostIndexed;
        }

        /**
         * Sets the value of the improveCostIndexed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setImproveCostIndexed(BigInteger value) {
            this.improveCostIndexed = value;
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
