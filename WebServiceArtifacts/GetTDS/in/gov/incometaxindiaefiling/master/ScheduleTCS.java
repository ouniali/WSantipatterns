
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
 *         &lt;element name="TCS" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}EmployerOrDeductorOrCollectDetl"/>
 *                   &lt;element name="TotalTCS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtTCSClaimedThisYear">
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
    "tcs"
})
@XmlRootElement(name = "ScheduleTCS")
public class ScheduleTCS {

    @XmlElement(name = "TCS", required = true)
    protected List<ScheduleTCS.TCS> tcs;

    /**
     * Gets the value of the tcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleTCS.TCS }
     * 
     * 
     */
    public List<ScheduleTCS.TCS> getTCS() {
        if (tcs == null) {
            tcs = new ArrayList<ScheduleTCS.TCS>();
        }
        return this.tcs;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}EmployerOrDeductorOrCollectDetl"/>
     *         &lt;element name="TotalTCS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtTCSClaimedThisYear">
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
        "employerOrDeductorOrCollectDetl",
        "totalTCS",
        "amtTCSClaimedThisYear"
    })
    public static class TCS {

        @XmlElement(name = "EmployerOrDeductorOrCollectDetl", required = true)
        protected EmployerOrDeductorOrCollectDetl employerOrDeductorOrCollectDetl;
        @XmlElement(name = "TotalTCS", required = true, defaultValue = "0")
        protected BigInteger totalTCS;
        @XmlElement(name = "AmtTCSClaimedThisYear", required = true, defaultValue = "0")
        protected BigInteger amtTCSClaimedThisYear;

        /**
         * Deductor Details
         * 
         * @return
         *     possible object is
         *     {@link EmployerOrDeductorOrCollectDetl }
         *     
         */
        public EmployerOrDeductorOrCollectDetl getEmployerOrDeductorOrCollectDetl() {
            return employerOrDeductorOrCollectDetl;
        }

        /**
         * Sets the value of the employerOrDeductorOrCollectDetl property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmployerOrDeductorOrCollectDetl }
         *     
         */
        public void setEmployerOrDeductorOrCollectDetl(EmployerOrDeductorOrCollectDetl value) {
            this.employerOrDeductorOrCollectDetl = value;
        }

        /**
         * Gets the value of the totalTCS property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalTCS() {
            return totalTCS;
        }

        /**
         * Sets the value of the totalTCS property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalTCS(BigInteger value) {
            this.totalTCS = value;
        }

        /**
         * Gets the value of the amtTCSClaimedThisYear property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtTCSClaimedThisYear() {
            return amtTCSClaimedThisYear;
        }

        /**
         * Sets the value of the amtTCSClaimedThisYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtTCSClaimedThisYear(BigInteger value) {
            this.amtTCSClaimedThisYear = value;
        }

    }

}
