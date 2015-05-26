
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
 *         &lt;element name="SplCodeRateTax" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SecCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="1A"/>
 *                         &lt;enumeration value="21"/>
 *                         &lt;enumeration value="22"/>
 *                         &lt;enumeration value="5A1a"/>
 *                         &lt;enumeration value="FA"/>
 *                         &lt;enumeration value="5A1b1"/>
 *                         &lt;enumeration value="5A1b2"/>
 *                         &lt;enumeration value="5A1b3"/>
 *                         &lt;enumeration value="5AB1a"/>
 *                         &lt;enumeration value="5AB1b"/>
 *                         &lt;enumeration value="5AC"/>
 *                         &lt;enumeration value="5ACA"/>
 *                         &lt;enumeration value="5B"/>
 *                         &lt;enumeration value="5BB"/>
 *                         &lt;enumeration value="5BBA"/>
 *                         &lt;enumeration value="5BBB"/>
 *                         &lt;enumeration value="5BBC"/>
 *                         &lt;enumeration value="5Ea"/>
 *                         &lt;enumeration value="5Eb"/>
 *                         &lt;enumeration value="DTAA"/>
 *                         &lt;enumeration value="5A1ai"/>
 *                         &lt;enumeration value="5A1aii"/>
 *                         &lt;enumeration value="5AD"/>
 *                         &lt;enumeration value="11A"/>
 *                         &lt;enumeration value="4A1"/>
 *                         &lt;enumeration value="4A2"/>
 *                         &lt;enumeration value="7A"/>
 *                         &lt;enumeration value="7B1"/>
 *                         &lt;enumeration value="7B2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SplRatePercent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="10"/>
 *                         &lt;enumeration value="15"/>
 *                         &lt;enumeration value="12.5"/>
 *                         &lt;enumeration value="20"/>
 *                         &lt;enumeration value="30"/>
 *                         &lt;enumeration value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SplRateInc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SplRateIncTax">
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
 *         &lt;element name="TotSplRateIncTax">
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
    "splCodeRateTax",
    "totSplRateIncTax"
})
@XmlRootElement(name = "ScheduleSI")
public class ScheduleSI {

    @XmlElement(name = "SplCodeRateTax", required = true)
    protected List<ScheduleSI.SplCodeRateTax> splCodeRateTax;
    @XmlElement(name = "TotSplRateIncTax", required = true, defaultValue = "0")
    protected BigInteger totSplRateIncTax;

    /**
     * Gets the value of the splCodeRateTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splCodeRateTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplCodeRateTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleSI.SplCodeRateTax }
     * 
     * 
     */
    public List<ScheduleSI.SplCodeRateTax> getSplCodeRateTax() {
        if (splCodeRateTax == null) {
            splCodeRateTax = new ArrayList<ScheduleSI.SplCodeRateTax>();
        }
        return this.splCodeRateTax;
    }

    /**
     * Gets the value of the totSplRateIncTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotSplRateIncTax() {
        return totSplRateIncTax;
    }

    /**
     * Sets the value of the totSplRateIncTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotSplRateIncTax(BigInteger value) {
        this.totSplRateIncTax = value;
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
     *         &lt;element name="SecCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="1A"/>
     *               &lt;enumeration value="21"/>
     *               &lt;enumeration value="22"/>
     *               &lt;enumeration value="5A1a"/>
     *               &lt;enumeration value="FA"/>
     *               &lt;enumeration value="5A1b1"/>
     *               &lt;enumeration value="5A1b2"/>
     *               &lt;enumeration value="5A1b3"/>
     *               &lt;enumeration value="5AB1a"/>
     *               &lt;enumeration value="5AB1b"/>
     *               &lt;enumeration value="5AC"/>
     *               &lt;enumeration value="5ACA"/>
     *               &lt;enumeration value="5B"/>
     *               &lt;enumeration value="5BB"/>
     *               &lt;enumeration value="5BBA"/>
     *               &lt;enumeration value="5BBB"/>
     *               &lt;enumeration value="5BBC"/>
     *               &lt;enumeration value="5Ea"/>
     *               &lt;enumeration value="5Eb"/>
     *               &lt;enumeration value="DTAA"/>
     *               &lt;enumeration value="5A1ai"/>
     *               &lt;enumeration value="5A1aii"/>
     *               &lt;enumeration value="5AD"/>
     *               &lt;enumeration value="11A"/>
     *               &lt;enumeration value="4A1"/>
     *               &lt;enumeration value="4A2"/>
     *               &lt;enumeration value="7A"/>
     *               &lt;enumeration value="7B1"/>
     *               &lt;enumeration value="7B2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SplRatePercent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="10"/>
     *               &lt;enumeration value="15"/>
     *               &lt;enumeration value="12.5"/>
     *               &lt;enumeration value="20"/>
     *               &lt;enumeration value="30"/>
     *               &lt;enumeration value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SplRateInc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SplRateIncTax">
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
        "secCode",
        "splRatePercent",
        "splRateInc",
        "splRateIncTax"
    })
    public static class SplCodeRateTax {

        @XmlElement(name = "SecCode", required = true)
        protected String secCode;
        @XmlElement(name = "SplRatePercent", defaultValue = "1")
        protected double splRatePercent;
        @XmlElement(name = "SplRateInc", required = true, defaultValue = "0")
        protected BigInteger splRateInc;
        @XmlElement(name = "SplRateIncTax", required = true, defaultValue = "0")
        protected BigInteger splRateIncTax;

        /**
         * Gets the value of the secCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecCode() {
            return secCode;
        }

        /**
         * Sets the value of the secCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecCode(String value) {
            this.secCode = value;
        }

        /**
         * Gets the value of the splRatePercent property.
         * 
         */
        public double getSplRatePercent() {
            return splRatePercent;
        }

        /**
         * Sets the value of the splRatePercent property.
         * 
         */
        public void setSplRatePercent(double value) {
            this.splRatePercent = value;
        }

        /**
         * Gets the value of the splRateInc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSplRateInc() {
            return splRateInc;
        }

        /**
         * Sets the value of the splRateInc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSplRateInc(BigInteger value) {
            this.splRateInc = value;
        }

        /**
         * Gets the value of the splRateIncTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSplRateIncTax() {
            return splRateIncTax;
        }

        /**
         * Sets the value of the splRateIncTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSplRateIncTax(BigInteger value) {
            this.splRateIncTax = value;
        }

    }

}
