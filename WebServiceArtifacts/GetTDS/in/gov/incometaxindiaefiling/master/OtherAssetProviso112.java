
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
 *                   &lt;element name="AquisitCostNoIndex">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ImproveCostNoIndex">
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
 *         &lt;element name="BalLTCG112">
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
    "balLTCG112"
})
@XmlRootElement(name = "OtherAssetProviso112")
public class OtherAssetProviso112 {

    @XmlElement(name = "FullConsideration", required = true, defaultValue = "0")
    protected BigInteger fullConsideration;
    @XmlElement(name = "DeductSec48", required = true)
    protected OtherAssetProviso112 .DeductSec48 deductSec48;
    @XmlElement(name = "BalanceCG", defaultValue = "0")
    protected long balanceCG;
    @XmlElement(name = "ExemptionOrDednUs54s", required = true, defaultValue = "0")
    protected BigInteger exemptionOrDednUs54S;
    @XmlElement(name = "BalLTCG112", defaultValue = "0")
    protected long balLTCG112;

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
     *     {@link OtherAssetProviso112 .DeductSec48 }
     *     
     */
    public OtherAssetProviso112 .DeductSec48 getDeductSec48() {
        return deductSec48;
    }

    /**
     * Sets the value of the deductSec48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAssetProviso112 .DeductSec48 }
     *     
     */
    public void setDeductSec48(OtherAssetProviso112 .DeductSec48 value) {
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
     * Gets the value of the balLTCG112 property.
     * 
     */
    public long getBalLTCG112() {
        return balLTCG112;
    }

    /**
     * Sets the value of the balLTCG112 property.
     * 
     */
    public void setBalLTCG112(long value) {
        this.balLTCG112 = value;
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
     *         &lt;element name="AquisitCostNoIndex">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ImproveCostNoIndex">
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
        "aquisitCostNoIndex",
        "improveCostNoIndex",
        "expOnTrans",
        "totalDedn"
    })
    public static class DeductSec48 {

        @XmlElement(name = "AquisitCostNoIndex", required = true, defaultValue = "0")
        protected BigInteger aquisitCostNoIndex;
        @XmlElement(name = "ImproveCostNoIndex", required = true, defaultValue = "0")
        protected BigInteger improveCostNoIndex;
        @XmlElement(name = "ExpOnTrans", required = true, defaultValue = "0")
        protected BigInteger expOnTrans;
        @XmlElement(name = "TotalDedn", required = true, defaultValue = "0")
        protected BigInteger totalDedn;

        /**
         * Gets the value of the aquisitCostNoIndex property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAquisitCostNoIndex() {
            return aquisitCostNoIndex;
        }

        /**
         * Sets the value of the aquisitCostNoIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAquisitCostNoIndex(BigInteger value) {
            this.aquisitCostNoIndex = value;
        }

        /**
         * Gets the value of the improveCostNoIndex property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getImproveCostNoIndex() {
            return improveCostNoIndex;
        }

        /**
         * Sets the value of the improveCostNoIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setImproveCostNoIndex(BigInteger value) {
            this.improveCostNoIndex = value;
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
