
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element name="Long-Term-112_1_Applicable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Long-Term" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Short-Term-Under-111A" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Short-Term" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
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
    "longTerm1121Applicable",
    "longTerm",
    "shortTermUnder111A",
    "shortTerm"
})
@XmlRootElement(name = "AccruOrRecOfCG")
public class AccruOrRecOfCG {

    @XmlElement(name = "Long-Term-112_1_Applicable")
    protected AccruOrRecOfCG.LongTerm1121Applicable longTerm1121Applicable;
    @XmlElement(name = "Long-Term")
    protected AccruOrRecOfCG.LongTerm longTerm;
    @XmlElement(name = "Short-Term-Under-111A")
    protected AccruOrRecOfCG.ShortTermUnder111A shortTermUnder111A;
    @XmlElement(name = "Short-Term")
    protected AccruOrRecOfCG.ShortTerm shortTerm;

    /**
     * Gets the value of the longTerm1121Applicable property.
     * 
     * @return
     *     possible object is
     *     {@link AccruOrRecOfCG.LongTerm1121Applicable }
     *     
     */
    public AccruOrRecOfCG.LongTerm1121Applicable getLongTerm1121Applicable() {
        return longTerm1121Applicable;
    }

    /**
     * Sets the value of the longTerm1121Applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruOrRecOfCG.LongTerm1121Applicable }
     *     
     */
    public void setLongTerm1121Applicable(AccruOrRecOfCG.LongTerm1121Applicable value) {
        this.longTerm1121Applicable = value;
    }

    /**
     * Gets the value of the longTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AccruOrRecOfCG.LongTerm }
     *     
     */
    public AccruOrRecOfCG.LongTerm getLongTerm() {
        return longTerm;
    }

    /**
     * Sets the value of the longTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruOrRecOfCG.LongTerm }
     *     
     */
    public void setLongTerm(AccruOrRecOfCG.LongTerm value) {
        this.longTerm = value;
    }

    /**
     * Gets the value of the shortTermUnder111A property.
     * 
     * @return
     *     possible object is
     *     {@link AccruOrRecOfCG.ShortTermUnder111A }
     *     
     */
    public AccruOrRecOfCG.ShortTermUnder111A getShortTermUnder111A() {
        return shortTermUnder111A;
    }

    /**
     * Sets the value of the shortTermUnder111A property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruOrRecOfCG.ShortTermUnder111A }
     *     
     */
    public void setShortTermUnder111A(AccruOrRecOfCG.ShortTermUnder111A value) {
        this.shortTermUnder111A = value;
    }

    /**
     * Gets the value of the shortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AccruOrRecOfCG.ShortTerm }
     *     
     */
    public AccruOrRecOfCG.ShortTerm getShortTerm() {
        return shortTerm;
    }

    /**
     * Sets the value of the shortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruOrRecOfCG.ShortTerm }
     *     
     */
    public void setShortTerm(AccruOrRecOfCG.ShortTerm value) {
        this.shortTerm = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
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
        "dateRange"
    })
    public static class LongTerm {

        @XmlElement(name = "DateRange", required = true)
        protected DateRange dateRange;

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setDateRange(DateRange value) {
            this.dateRange = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
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
        "dateRange"
    })
    public static class LongTerm1121Applicable {

        @XmlElement(name = "DateRange", required = true)
        protected DateRange dateRange;

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setDateRange(DateRange value) {
            this.dateRange = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
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
        "dateRange"
    })
    public static class ShortTerm {

        @XmlElement(name = "DateRange", required = true)
        protected DateRange dateRange;

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setDateRange(DateRange value) {
            this.dateRange = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DateRange"/>
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
        "dateRange"
    })
    public static class ShortTermUnder111A {

        @XmlElement(name = "DateRange", required = true)
        protected DateRange dateRange;

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setDateRange(DateRange value) {
            this.dateRange = value;
        }

    }

}
