
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
 *         &lt;element name="NameOfEmployer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="75"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PANofEmployer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AddressDetail"/>
 *         &lt;element name="Salarys">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Salary">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AllowancesExemptUSection10">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AllowancesNotExempt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValueOfPerquisites">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProfitsinLieuOfSalary">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IncomeFromSalary">
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
    "nameOfEmployer",
    "paNofEmployer",
    "addressDetail",
    "salarys"
})
@XmlRootElement(name = "Salaries")
public class Salaries {

    @XmlElement(name = "NameOfEmployer", required = true)
    protected String nameOfEmployer;
    @XmlElement(name = "PANofEmployer")
    protected String paNofEmployer;
    @XmlElement(name = "AddressDetail", required = true)
    protected AddressDetail addressDetail;
    @XmlElement(name = "Salarys", required = true)
    protected Salaries.Salarys salarys;

    /**
     * Gets the value of the nameOfEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    /**
     * Sets the value of the nameOfEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfEmployer(String value) {
        this.nameOfEmployer = value;
    }

    /**
     * Gets the value of the paNofEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANofEmployer() {
        return paNofEmployer;
    }

    /**
     * Sets the value of the paNofEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANofEmployer(String value) {
        this.paNofEmployer = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetail }
     *     
     */
    public AddressDetail getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetail }
     *     
     */
    public void setAddressDetail(AddressDetail value) {
        this.addressDetail = value;
    }

    /**
     * Gets the value of the salarys property.
     * 
     * @return
     *     possible object is
     *     {@link Salaries.Salarys }
     *     
     */
    public Salaries.Salarys getSalarys() {
        return salarys;
    }

    /**
     * Sets the value of the salarys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Salaries.Salarys }
     *     
     */
    public void setSalarys(Salaries.Salarys value) {
        this.salarys = value;
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
     *         &lt;element name="Salary">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AllowancesExemptUSection10">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AllowancesNotExempt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ValueOfPerquisites">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProfitsinLieuOfSalary">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IncomeFromSalary">
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
        "salary",
        "allowancesExemptUSection10",
        "allowancesNotExempt",
        "valueOfPerquisites",
        "profitsinLieuOfSalary",
        "incomeFromSalary"
    })
    public static class Salarys {

        @XmlElement(name = "Salary", required = true, defaultValue = "0")
        protected BigInteger salary;
        @XmlElement(name = "AllowancesExemptUSection10", required = true, defaultValue = "0")
        protected BigInteger allowancesExemptUSection10;
        @XmlElement(name = "AllowancesNotExempt", required = true, defaultValue = "0")
        protected BigInteger allowancesNotExempt;
        @XmlElement(name = "ValueOfPerquisites", required = true, defaultValue = "0")
        protected BigInteger valueOfPerquisites;
        @XmlElement(name = "ProfitsinLieuOfSalary", required = true, defaultValue = "0")
        protected BigInteger profitsinLieuOfSalary;
        @XmlElement(name = "IncomeFromSalary", required = true, defaultValue = "0")
        protected BigInteger incomeFromSalary;

        /**
         * Gets the value of the salary property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSalary() {
            return salary;
        }

        /**
         * Sets the value of the salary property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSalary(BigInteger value) {
            this.salary = value;
        }

        /**
         * Gets the value of the allowancesExemptUSection10 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAllowancesExemptUSection10() {
            return allowancesExemptUSection10;
        }

        /**
         * Sets the value of the allowancesExemptUSection10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAllowancesExemptUSection10(BigInteger value) {
            this.allowancesExemptUSection10 = value;
        }

        /**
         * Gets the value of the allowancesNotExempt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAllowancesNotExempt() {
            return allowancesNotExempt;
        }

        /**
         * Sets the value of the allowancesNotExempt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAllowancesNotExempt(BigInteger value) {
            this.allowancesNotExempt = value;
        }

        /**
         * Gets the value of the valueOfPerquisites property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValueOfPerquisites() {
            return valueOfPerquisites;
        }

        /**
         * Sets the value of the valueOfPerquisites property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValueOfPerquisites(BigInteger value) {
            this.valueOfPerquisites = value;
        }

        /**
         * Gets the value of the profitsinLieuOfSalary property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProfitsinLieuOfSalary() {
            return profitsinLieuOfSalary;
        }

        /**
         * Sets the value of the profitsinLieuOfSalary property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProfitsinLieuOfSalary(BigInteger value) {
            this.profitsinLieuOfSalary = value;
        }

        /**
         * Gets the value of the incomeFromSalary property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIncomeFromSalary() {
            return incomeFromSalary;
        }

        /**
         * Sets the value of the incomeFromSalary property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIncomeFromSalary(BigInteger value) {
            this.incomeFromSalary = value;
        }

    }

}
