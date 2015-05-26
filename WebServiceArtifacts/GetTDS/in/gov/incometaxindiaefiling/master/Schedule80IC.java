
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
 *         &lt;element name="DeductInSikkim">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductInHimachalP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductInUttaranchal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductInNorthEast">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Assam">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ArunachalPradesh">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Manipur">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Mizoram">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Meghalaya">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Nagaland">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Tripura">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotDeductInNorthEast">
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
 *         &lt;element name="TotSchedule80_IC">
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
    "deductInSikkim",
    "deductInHimachalP",
    "deductInUttaranchal",
    "deductInNorthEast",
    "totSchedule80IC"
})
@XmlRootElement(name = "Schedule80_IC")
public class Schedule80IC {

    @XmlElement(name = "DeductInSikkim", required = true, defaultValue = "0")
    protected BigInteger deductInSikkim;
    @XmlElement(name = "DeductInHimachalP", required = true, defaultValue = "0")
    protected BigInteger deductInHimachalP;
    @XmlElement(name = "DeductInUttaranchal", required = true, defaultValue = "0")
    protected BigInteger deductInUttaranchal;
    @XmlElement(name = "DeductInNorthEast", required = true)
    protected Schedule80IC.DeductInNorthEast deductInNorthEast;
    @XmlElement(name = "TotSchedule80_IC", required = true, defaultValue = "0")
    protected BigInteger totSchedule80IC;

    /**
     * Gets the value of the deductInSikkim property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductInSikkim() {
        return deductInSikkim;
    }

    /**
     * Sets the value of the deductInSikkim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductInSikkim(BigInteger value) {
        this.deductInSikkim = value;
    }

    /**
     * Gets the value of the deductInHimachalP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductInHimachalP() {
        return deductInHimachalP;
    }

    /**
     * Sets the value of the deductInHimachalP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductInHimachalP(BigInteger value) {
        this.deductInHimachalP = value;
    }

    /**
     * Gets the value of the deductInUttaranchal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductInUttaranchal() {
        return deductInUttaranchal;
    }

    /**
     * Sets the value of the deductInUttaranchal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductInUttaranchal(BigInteger value) {
        this.deductInUttaranchal = value;
    }

    /**
     * Gets the value of the deductInNorthEast property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule80IC.DeductInNorthEast }
     *     
     */
    public Schedule80IC.DeductInNorthEast getDeductInNorthEast() {
        return deductInNorthEast;
    }

    /**
     * Sets the value of the deductInNorthEast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule80IC.DeductInNorthEast }
     *     
     */
    public void setDeductInNorthEast(Schedule80IC.DeductInNorthEast value) {
        this.deductInNorthEast = value;
    }

    /**
     * Gets the value of the totSchedule80IC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotSchedule80IC() {
        return totSchedule80IC;
    }

    /**
     * Sets the value of the totSchedule80IC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotSchedule80IC(BigInteger value) {
        this.totSchedule80IC = value;
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
     *         &lt;element name="Assam">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ArunachalPradesh">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Manipur">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Mizoram">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Meghalaya">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Nagaland">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Tripura">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotDeductInNorthEast">
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
        "assam",
        "arunachalPradesh",
        "manipur",
        "mizoram",
        "meghalaya",
        "nagaland",
        "tripura",
        "totDeductInNorthEast"
    })
    public static class DeductInNorthEast {

        @XmlElement(name = "Assam", required = true, defaultValue = "0")
        protected BigInteger assam;
        @XmlElement(name = "ArunachalPradesh", required = true, defaultValue = "0")
        protected BigInteger arunachalPradesh;
        @XmlElement(name = "Manipur", required = true, defaultValue = "0")
        protected BigInteger manipur;
        @XmlElement(name = "Mizoram", required = true, defaultValue = "0")
        protected BigInteger mizoram;
        @XmlElement(name = "Meghalaya", required = true, defaultValue = "0")
        protected BigInteger meghalaya;
        @XmlElement(name = "Nagaland", required = true, defaultValue = "0")
        protected BigInteger nagaland;
        @XmlElement(name = "Tripura", required = true, defaultValue = "0")
        protected BigInteger tripura;
        @XmlElement(name = "TotDeductInNorthEast", required = true, defaultValue = "0")
        protected BigInteger totDeductInNorthEast;

        /**
         * Gets the value of the assam property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAssam() {
            return assam;
        }

        /**
         * Sets the value of the assam property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAssam(BigInteger value) {
            this.assam = value;
        }

        /**
         * Gets the value of the arunachalPradesh property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArunachalPradesh() {
            return arunachalPradesh;
        }

        /**
         * Sets the value of the arunachalPradesh property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArunachalPradesh(BigInteger value) {
            this.arunachalPradesh = value;
        }

        /**
         * Gets the value of the manipur property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getManipur() {
            return manipur;
        }

        /**
         * Sets the value of the manipur property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setManipur(BigInteger value) {
            this.manipur = value;
        }

        /**
         * Gets the value of the mizoram property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMizoram() {
            return mizoram;
        }

        /**
         * Sets the value of the mizoram property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMizoram(BigInteger value) {
            this.mizoram = value;
        }

        /**
         * Gets the value of the meghalaya property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeghalaya() {
            return meghalaya;
        }

        /**
         * Sets the value of the meghalaya property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeghalaya(BigInteger value) {
            this.meghalaya = value;
        }

        /**
         * Gets the value of the nagaland property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNagaland() {
            return nagaland;
        }

        /**
         * Sets the value of the nagaland property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNagaland(BigInteger value) {
            this.nagaland = value;
        }

        /**
         * Gets the value of the tripura property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTripura() {
            return tripura;
        }

        /**
         * Sets the value of the tripura property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTripura(BigInteger value) {
            this.tripura = value;
        }

        /**
         * Gets the value of the totDeductInNorthEast property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotDeductInNorthEast() {
            return totDeductInNorthEast;
        }

        /**
         * Sets the value of the totDeductInNorthEast property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotDeductInNorthEast(BigInteger value) {
            this.totDeductInNorthEast = value;
        }

    }

}
