
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
 *         &lt;element name="DeductSTP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeductEHTP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeductFTZ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeductEPZ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeductSEZ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalDedUs10A">
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
    "deductSTP",
    "deductEHTP",
    "deductFTZ",
    "deductEPZ",
    "deductSEZ",
    "totalDedUs10A"
})
@XmlRootElement(name = "Schedule10A")
public class Schedule10A {

    @XmlElement(name = "DeductSTP")
    protected Schedule10A.DeductSTP deductSTP;
    @XmlElement(name = "DeductEHTP")
    protected Schedule10A.DeductEHTP deductEHTP;
    @XmlElement(name = "DeductFTZ")
    protected Schedule10A.DeductFTZ deductFTZ;
    @XmlElement(name = "DeductEPZ")
    protected Schedule10A.DeductEPZ deductEPZ;
    @XmlElement(name = "DeductSEZ")
    protected Schedule10A.DeductSEZ deductSEZ;
    @XmlElement(name = "TotalDedUs10A", required = true, defaultValue = "0")
    protected BigInteger totalDedUs10A;

    /**
     * Gets the value of the deductSTP property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10A.DeductSTP }
     *     
     */
    public Schedule10A.DeductSTP getDeductSTP() {
        return deductSTP;
    }

    /**
     * Sets the value of the deductSTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10A.DeductSTP }
     *     
     */
    public void setDeductSTP(Schedule10A.DeductSTP value) {
        this.deductSTP = value;
    }

    /**
     * Gets the value of the deductEHTP property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10A.DeductEHTP }
     *     
     */
    public Schedule10A.DeductEHTP getDeductEHTP() {
        return deductEHTP;
    }

    /**
     * Sets the value of the deductEHTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10A.DeductEHTP }
     *     
     */
    public void setDeductEHTP(Schedule10A.DeductEHTP value) {
        this.deductEHTP = value;
    }

    /**
     * Gets the value of the deductFTZ property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10A.DeductFTZ }
     *     
     */
    public Schedule10A.DeductFTZ getDeductFTZ() {
        return deductFTZ;
    }

    /**
     * Sets the value of the deductFTZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10A.DeductFTZ }
     *     
     */
    public void setDeductFTZ(Schedule10A.DeductFTZ value) {
        this.deductFTZ = value;
    }

    /**
     * Gets the value of the deductEPZ property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10A.DeductEPZ }
     *     
     */
    public Schedule10A.DeductEPZ getDeductEPZ() {
        return deductEPZ;
    }

    /**
     * Sets the value of the deductEPZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10A.DeductEPZ }
     *     
     */
    public void setDeductEPZ(Schedule10A.DeductEPZ value) {
        this.deductEPZ = value;
    }

    /**
     * Gets the value of the deductSEZ property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10A.DeductSEZ }
     *     
     */
    public Schedule10A.DeductSEZ getDeductSEZ() {
        return deductSEZ;
    }

    /**
     * Sets the value of the deductSEZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10A.DeductSEZ }
     *     
     */
    public void setDeductSEZ(Schedule10A.DeductSEZ value) {
        this.deductSEZ = value;
    }

    /**
     * Gets the value of the totalDedUs10A property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDedUs10A() {
        return totalDedUs10A;
    }

    /**
     * Sets the value of the totalDedUs10A property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDedUs10A(BigInteger value) {
        this.totalDedUs10A = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
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
        "dedUs10Detail"
    })
    public static class DeductEHTP {

        @XmlElement(name = "DedUs10Detail", required = true)
        protected DedUs10Detail dedUs10Detail;

        /**
         * Gets the value of the dedUs10Detail property.
         * 
         * @return
         *     possible object is
         *     {@link DedUs10Detail }
         *     
         */
        public DedUs10Detail getDedUs10Detail() {
            return dedUs10Detail;
        }

        /**
         * Sets the value of the dedUs10Detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link DedUs10Detail }
         *     
         */
        public void setDedUs10Detail(DedUs10Detail value) {
            this.dedUs10Detail = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
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
        "dedUs10Detail"
    })
    public static class DeductEPZ {

        @XmlElement(name = "DedUs10Detail", required = true)
        protected DedUs10Detail dedUs10Detail;

        /**
         * Gets the value of the dedUs10Detail property.
         * 
         * @return
         *     possible object is
         *     {@link DedUs10Detail }
         *     
         */
        public DedUs10Detail getDedUs10Detail() {
            return dedUs10Detail;
        }

        /**
         * Sets the value of the dedUs10Detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link DedUs10Detail }
         *     
         */
        public void setDedUs10Detail(DedUs10Detail value) {
            this.dedUs10Detail = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
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
        "dedUs10Detail"
    })
    public static class DeductFTZ {

        @XmlElement(name = "DedUs10Detail", required = true)
        protected DedUs10Detail dedUs10Detail;

        /**
         * Gets the value of the dedUs10Detail property.
         * 
         * @return
         *     possible object is
         *     {@link DedUs10Detail }
         *     
         */
        public DedUs10Detail getDedUs10Detail() {
            return dedUs10Detail;
        }

        /**
         * Sets the value of the dedUs10Detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link DedUs10Detail }
         *     
         */
        public void setDedUs10Detail(DedUs10Detail value) {
            this.dedUs10Detail = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
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
        "dedUs10Detail"
    })
    public static class DeductSEZ {

        @XmlElement(name = "DedUs10Detail", required = true)
        protected DedUs10Detail dedUs10Detail;

        /**
         * Gets the value of the dedUs10Detail property.
         * 
         * @return
         *     possible object is
         *     {@link DedUs10Detail }
         *     
         */
        public DedUs10Detail getDedUs10Detail() {
            return dedUs10Detail;
        }

        /**
         * Sets the value of the dedUs10Detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link DedUs10Detail }
         *     
         */
        public void setDedUs10Detail(DedUs10Detail value) {
            this.dedUs10Detail = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
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
        "dedUs10Detail"
    })
    public static class DeductSTP {

        @XmlElement(name = "DedUs10Detail", required = true)
        protected DedUs10Detail dedUs10Detail;

        /**
         * Gets the value of the dedUs10Detail property.
         * 
         * @return
         *     possible object is
         *     {@link DedUs10Detail }
         *     
         */
        public DedUs10Detail getDedUs10Detail() {
            return dedUs10Detail;
        }

        /**
         * Sets the value of the dedUs10Detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link DedUs10Detail }
         *     
         */
        public void setDedUs10Detail(DedUs10Detail value) {
            this.dedUs10Detail = value;
        }

    }

}
