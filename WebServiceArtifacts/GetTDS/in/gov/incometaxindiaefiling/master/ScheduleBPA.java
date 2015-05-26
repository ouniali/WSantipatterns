
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
 *         &lt;element name="PartnerFirmIncomes" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FirmPAN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="collapse"/>
 *                         &lt;length value="10"/>
 *                         &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FirmSalBonComRen">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IntFirmCap">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotalIncome">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Expenses">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetIncome">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Total">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AggreFirmSalBonComRen">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AggreIntFirmCap">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AggreTotalIncome">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AggreExpensesTotal">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AggreNetIncome">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
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
    "partnerFirmIncomes",
    "total"
})
@XmlRootElement(name = "ScheduleBPA")
public class ScheduleBPA {

    @XmlElement(name = "PartnerFirmIncomes", required = true)
    protected List<ScheduleBPA.PartnerFirmIncomes> partnerFirmIncomes;
    @XmlElement(name = "Total", required = true)
    protected ScheduleBPA.Total total;

    /**
     * Gets the value of the partnerFirmIncomes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerFirmIncomes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerFirmIncomes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleBPA.PartnerFirmIncomes }
     * 
     * 
     */
    public List<ScheduleBPA.PartnerFirmIncomes> getPartnerFirmIncomes() {
        if (partnerFirmIncomes == null) {
            partnerFirmIncomes = new ArrayList<ScheduleBPA.PartnerFirmIncomes>();
        }
        return this.partnerFirmIncomes;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleBPA.Total }
     *     
     */
    public ScheduleBPA.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleBPA.Total }
     *     
     */
    public void setTotal(ScheduleBPA.Total value) {
        this.total = value;
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
     *         &lt;element name="FirmPAN">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="collapse"/>
     *               &lt;length value="10"/>
     *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FirmSalBonComRen">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IntFirmCap">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotalIncome">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Expenses">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetIncome">
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
        "firmPAN",
        "firmSalBonComRen",
        "intFirmCap",
        "totalIncome",
        "expenses",
        "netIncome"
    })
    public static class PartnerFirmIncomes {

        @XmlElement(name = "FirmPAN", required = true)
        protected String firmPAN;
        @XmlElement(name = "FirmSalBonComRen", required = true, defaultValue = "0")
        protected BigInteger firmSalBonComRen;
        @XmlElement(name = "IntFirmCap", defaultValue = "0")
        protected long intFirmCap;
        @XmlElement(name = "TotalIncome", defaultValue = "0")
        protected long totalIncome;
        @XmlElement(name = "Expenses", required = true, defaultValue = "0")
        protected BigInteger expenses;
        @XmlElement(name = "NetIncome", defaultValue = "0")
        protected long netIncome;

        /**
         * Gets the value of the firmPAN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirmPAN() {
            return firmPAN;
        }

        /**
         * Sets the value of the firmPAN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirmPAN(String value) {
            this.firmPAN = value;
        }

        /**
         * Gets the value of the firmSalBonComRen property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFirmSalBonComRen() {
            return firmSalBonComRen;
        }

        /**
         * Sets the value of the firmSalBonComRen property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFirmSalBonComRen(BigInteger value) {
            this.firmSalBonComRen = value;
        }

        /**
         * Gets the value of the intFirmCap property.
         * 
         */
        public long getIntFirmCap() {
            return intFirmCap;
        }

        /**
         * Sets the value of the intFirmCap property.
         * 
         */
        public void setIntFirmCap(long value) {
            this.intFirmCap = value;
        }

        /**
         * Gets the value of the totalIncome property.
         * 
         */
        public long getTotalIncome() {
            return totalIncome;
        }

        /**
         * Sets the value of the totalIncome property.
         * 
         */
        public void setTotalIncome(long value) {
            this.totalIncome = value;
        }

        /**
         * Gets the value of the expenses property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExpenses() {
            return expenses;
        }

        /**
         * Sets the value of the expenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExpenses(BigInteger value) {
            this.expenses = value;
        }

        /**
         * Gets the value of the netIncome property.
         * 
         */
        public long getNetIncome() {
            return netIncome;
        }

        /**
         * Sets the value of the netIncome property.
         * 
         */
        public void setNetIncome(long value) {
            this.netIncome = value;
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
     *         &lt;element name="AggreFirmSalBonComRen">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AggreIntFirmCap">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AggreTotalIncome">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AggreExpensesTotal">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AggreNetIncome">
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
        "aggreFirmSalBonComRen",
        "aggreIntFirmCap",
        "aggreTotalIncome",
        "aggreExpensesTotal",
        "aggreNetIncome"
    })
    public static class Total {

        @XmlElement(name = "AggreFirmSalBonComRen", required = true, defaultValue = "0")
        protected BigInteger aggreFirmSalBonComRen;
        @XmlElement(name = "AggreIntFirmCap", defaultValue = "0")
        protected long aggreIntFirmCap;
        @XmlElement(name = "AggreTotalIncome", defaultValue = "0")
        protected long aggreTotalIncome;
        @XmlElement(name = "AggreExpensesTotal", required = true, defaultValue = "0")
        protected BigInteger aggreExpensesTotal;
        @XmlElement(name = "AggreNetIncome", defaultValue = "0")
        protected long aggreNetIncome;

        /**
         * Gets the value of the aggreFirmSalBonComRen property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAggreFirmSalBonComRen() {
            return aggreFirmSalBonComRen;
        }

        /**
         * Sets the value of the aggreFirmSalBonComRen property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAggreFirmSalBonComRen(BigInteger value) {
            this.aggreFirmSalBonComRen = value;
        }

        /**
         * Gets the value of the aggreIntFirmCap property.
         * 
         */
        public long getAggreIntFirmCap() {
            return aggreIntFirmCap;
        }

        /**
         * Sets the value of the aggreIntFirmCap property.
         * 
         */
        public void setAggreIntFirmCap(long value) {
            this.aggreIntFirmCap = value;
        }

        /**
         * Gets the value of the aggreTotalIncome property.
         * 
         */
        public long getAggreTotalIncome() {
            return aggreTotalIncome;
        }

        /**
         * Sets the value of the aggreTotalIncome property.
         * 
         */
        public void setAggreTotalIncome(long value) {
            this.aggreTotalIncome = value;
        }

        /**
         * Gets the value of the aggreExpensesTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAggreExpensesTotal() {
            return aggreExpensesTotal;
        }

        /**
         * Sets the value of the aggreExpensesTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAggreExpensesTotal(BigInteger value) {
            this.aggreExpensesTotal = value;
        }

        /**
         * Gets the value of the aggreNetIncome property.
         * 
         */
        public long getAggreNetIncome() {
            return aggreNetIncome;
        }

        /**
         * Sets the value of the aggreNetIncome property.
         * 
         */
        public void setAggreNetIncome(long value) {
            this.aggreNetIncome = value;
        }

    }

}
