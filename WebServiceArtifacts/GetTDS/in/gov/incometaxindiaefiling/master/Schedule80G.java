
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Don100Percent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
 *                   &lt;element name="TotEligibleDon100Percent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotDon100Percent">
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
 *         &lt;element name="Don50PercentNoApprReqd" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
 *                   &lt;element name="TotEligibleDon50Percent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotDon50PercentNoApprReqd">
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
 *         &lt;element name="Don100PercentApprReqd" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
 *                   &lt;element name="TotEligibleDon100PercentApprReqd">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotDon100PercentApprReqd">
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
 *         &lt;element name="Don50PercentApprReqd" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
 *                   &lt;element name="TotEligibleDon50PercentApprReqd">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotDon50PercentApprReqd">
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
 *         &lt;element name="TotalEligibleDonationsUs80G">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDonationsUs80G">
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
    "don100Percent",
    "don50PercentNoApprReqd",
    "don100PercentApprReqd",
    "don50PercentApprReqd",
    "totalEligibleDonationsUs80G",
    "totalDonationsUs80G"
})
@XmlRootElement(name = "Schedule80G")
public class Schedule80G {

    @XmlElement(name = "Don100Percent")
    protected Schedule80G.Don100Percent don100Percent;
    @XmlElement(name = "Don50PercentNoApprReqd")
    protected Schedule80G.Don50PercentNoApprReqd don50PercentNoApprReqd;
    @XmlElement(name = "Don100PercentApprReqd")
    protected Schedule80G.Don100PercentApprReqd don100PercentApprReqd;
    @XmlElement(name = "Don50PercentApprReqd")
    protected Schedule80G.Don50PercentApprReqd don50PercentApprReqd;
    @XmlElement(name = "TotalEligibleDonationsUs80G", required = true, defaultValue = "0")
    protected BigInteger totalEligibleDonationsUs80G;
    @XmlElement(name = "TotalDonationsUs80G", required = true, defaultValue = "0")
    protected BigInteger totalDonationsUs80G;

    /**
     * Gets the value of the don100Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule80G.Don100Percent }
     *     
     */
    public Schedule80G.Don100Percent getDon100Percent() {
        return don100Percent;
    }

    /**
     * Sets the value of the don100Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule80G.Don100Percent }
     *     
     */
    public void setDon100Percent(Schedule80G.Don100Percent value) {
        this.don100Percent = value;
    }

    /**
     * Gets the value of the don50PercentNoApprReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule80G.Don50PercentNoApprReqd }
     *     
     */
    public Schedule80G.Don50PercentNoApprReqd getDon50PercentNoApprReqd() {
        return don50PercentNoApprReqd;
    }

    /**
     * Sets the value of the don50PercentNoApprReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule80G.Don50PercentNoApprReqd }
     *     
     */
    public void setDon50PercentNoApprReqd(Schedule80G.Don50PercentNoApprReqd value) {
        this.don50PercentNoApprReqd = value;
    }

    /**
     * Gets the value of the don100PercentApprReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule80G.Don100PercentApprReqd }
     *     
     */
    public Schedule80G.Don100PercentApprReqd getDon100PercentApprReqd() {
        return don100PercentApprReqd;
    }

    /**
     * Sets the value of the don100PercentApprReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule80G.Don100PercentApprReqd }
     *     
     */
    public void setDon100PercentApprReqd(Schedule80G.Don100PercentApprReqd value) {
        this.don100PercentApprReqd = value;
    }

    /**
     * Gets the value of the don50PercentApprReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule80G.Don50PercentApprReqd }
     *     
     */
    public Schedule80G.Don50PercentApprReqd getDon50PercentApprReqd() {
        return don50PercentApprReqd;
    }

    /**
     * Sets the value of the don50PercentApprReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule80G.Don50PercentApprReqd }
     *     
     */
    public void setDon50PercentApprReqd(Schedule80G.Don50PercentApprReqd value) {
        this.don50PercentApprReqd = value;
    }

    /**
     * Gets the value of the totalEligibleDonationsUs80G property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEligibleDonationsUs80G() {
        return totalEligibleDonationsUs80G;
    }

    /**
     * Sets the value of the totalEligibleDonationsUs80G property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEligibleDonationsUs80G(BigInteger value) {
        this.totalEligibleDonationsUs80G = value;
    }

    /**
     * Gets the value of the totalDonationsUs80G property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDonationsUs80G() {
        return totalDonationsUs80G;
    }

    /**
     * Sets the value of the totalDonationsUs80G property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDonationsUs80G(BigInteger value) {
        this.totalDonationsUs80G = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
     *         &lt;element name="TotEligibleDon100Percent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotDon100Percent">
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
        "doneeWithPan",
        "totEligibleDon100Percent",
        "totDon100Percent"
    })
    public static class Don100Percent {

        @XmlElement(name = "DoneeWithPan", required = true)
        protected List<DoneeWithPan> doneeWithPan;
        @XmlElement(name = "TotEligibleDon100Percent", required = true, defaultValue = "0")
        protected BigInteger totEligibleDon100Percent;
        @XmlElement(name = "TotDon100Percent", required = true, defaultValue = "0")
        protected BigInteger totDon100Percent;

        /**
         * Gets the value of the doneeWithPan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doneeWithPan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoneeWithPan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DoneeWithPan }
         * 
         * 
         */
        public List<DoneeWithPan> getDoneeWithPan() {
            if (doneeWithPan == null) {
                doneeWithPan = new ArrayList<DoneeWithPan>();
            }
            return this.doneeWithPan;
        }

        /**
         * Gets the value of the totEligibleDon100Percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotEligibleDon100Percent() {
            return totEligibleDon100Percent;
        }

        /**
         * Sets the value of the totEligibleDon100Percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotEligibleDon100Percent(BigInteger value) {
            this.totEligibleDon100Percent = value;
        }

        /**
         * Gets the value of the totDon100Percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotDon100Percent() {
            return totDon100Percent;
        }

        /**
         * Sets the value of the totDon100Percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotDon100Percent(BigInteger value) {
            this.totDon100Percent = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
     *         &lt;element name="TotEligibleDon100PercentApprReqd">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotDon100PercentApprReqd">
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
        "doneeWithPan",
        "totEligibleDon100PercentApprReqd",
        "totDon100PercentApprReqd"
    })
    public static class Don100PercentApprReqd {

        @XmlElement(name = "DoneeWithPan", required = true)
        protected List<DoneeWithPan> doneeWithPan;
        @XmlElement(name = "TotEligibleDon100PercentApprReqd", required = true, defaultValue = "0")
        protected BigInteger totEligibleDon100PercentApprReqd;
        @XmlElement(name = "TotDon100PercentApprReqd", required = true, defaultValue = "0")
        protected BigInteger totDon100PercentApprReqd;

        /**
         * Gets the value of the doneeWithPan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doneeWithPan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoneeWithPan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DoneeWithPan }
         * 
         * 
         */
        public List<DoneeWithPan> getDoneeWithPan() {
            if (doneeWithPan == null) {
                doneeWithPan = new ArrayList<DoneeWithPan>();
            }
            return this.doneeWithPan;
        }

        /**
         * Gets the value of the totEligibleDon100PercentApprReqd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotEligibleDon100PercentApprReqd() {
            return totEligibleDon100PercentApprReqd;
        }

        /**
         * Sets the value of the totEligibleDon100PercentApprReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotEligibleDon100PercentApprReqd(BigInteger value) {
            this.totEligibleDon100PercentApprReqd = value;
        }

        /**
         * Gets the value of the totDon100PercentApprReqd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotDon100PercentApprReqd() {
            return totDon100PercentApprReqd;
        }

        /**
         * Sets the value of the totDon100PercentApprReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotDon100PercentApprReqd(BigInteger value) {
            this.totDon100PercentApprReqd = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
     *         &lt;element name="TotEligibleDon50PercentApprReqd">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotDon50PercentApprReqd">
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
        "doneeWithPan",
        "totEligibleDon50PercentApprReqd",
        "totDon50PercentApprReqd"
    })
    public static class Don50PercentApprReqd {

        @XmlElement(name = "DoneeWithPan", required = true)
        protected List<DoneeWithPan> doneeWithPan;
        @XmlElement(name = "TotEligibleDon50PercentApprReqd", required = true, defaultValue = "0")
        protected BigInteger totEligibleDon50PercentApprReqd;
        @XmlElement(name = "TotDon50PercentApprReqd", required = true, defaultValue = "0")
        protected BigInteger totDon50PercentApprReqd;

        /**
         * Gets the value of the doneeWithPan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doneeWithPan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoneeWithPan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DoneeWithPan }
         * 
         * 
         */
        public List<DoneeWithPan> getDoneeWithPan() {
            if (doneeWithPan == null) {
                doneeWithPan = new ArrayList<DoneeWithPan>();
            }
            return this.doneeWithPan;
        }

        /**
         * Gets the value of the totEligibleDon50PercentApprReqd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotEligibleDon50PercentApprReqd() {
            return totEligibleDon50PercentApprReqd;
        }

        /**
         * Sets the value of the totEligibleDon50PercentApprReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotEligibleDon50PercentApprReqd(BigInteger value) {
            this.totEligibleDon50PercentApprReqd = value;
        }

        /**
         * Gets the value of the totDon50PercentApprReqd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotDon50PercentApprReqd() {
            return totDon50PercentApprReqd;
        }

        /**
         * Sets the value of the totDon50PercentApprReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotDon50PercentApprReqd(BigInteger value) {
            this.totDon50PercentApprReqd = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DoneeWithPan" maxOccurs="unbounded"/>
     *         &lt;element name="TotEligibleDon50Percent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotDon50PercentNoApprReqd">
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
        "doneeWithPan",
        "totEligibleDon50Percent",
        "totDon50PercentNoApprReqd"
    })
    public static class Don50PercentNoApprReqd {

        @XmlElement(name = "DoneeWithPan", required = true)
        protected List<DoneeWithPan> doneeWithPan;
        @XmlElement(name = "TotEligibleDon50Percent", required = true, defaultValue = "0")
        protected BigInteger totEligibleDon50Percent;
        @XmlElement(name = "TotDon50PercentNoApprReqd", required = true, defaultValue = "0")
        protected BigInteger totDon50PercentNoApprReqd;

        /**
         * Gets the value of the doneeWithPan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doneeWithPan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoneeWithPan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DoneeWithPan }
         * 
         * 
         */
        public List<DoneeWithPan> getDoneeWithPan() {
            if (doneeWithPan == null) {
                doneeWithPan = new ArrayList<DoneeWithPan>();
            }
            return this.doneeWithPan;
        }

        /**
         * Gets the value of the totEligibleDon50Percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotEligibleDon50Percent() {
            return totEligibleDon50Percent;
        }

        /**
         * Sets the value of the totEligibleDon50Percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotEligibleDon50Percent(BigInteger value) {
            this.totEligibleDon50Percent = value;
        }

        /**
         * Gets the value of the totDon50PercentNoApprReqd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotDon50PercentNoApprReqd() {
            return totDon50PercentNoApprReqd;
        }

        /**
         * Sets the value of the totDon50PercentNoApprReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotDon50PercentNoApprReqd(BigInteger value) {
            this.totDon50PercentNoApprReqd = value;
        }

    }

}
