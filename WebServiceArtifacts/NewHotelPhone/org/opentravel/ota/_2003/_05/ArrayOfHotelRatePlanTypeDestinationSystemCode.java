
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArrayOfHotelRatePlanTypeDestinationSystemCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeDestinationSystemCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationSystemCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LengthOfStayRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="POS_RuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RateAccessID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GuaranteeDepositRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CancelRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "ArrayOfHotelRatePlanTypeDestinationSystemCode", propOrder = {
    "destinationSystemCode"
})
public class ArrayOfHotelRatePlanTypeDestinationSystemCode {

    @XmlElement(name = "DestinationSystemCode")
    protected List<ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode> destinationSystemCode;

    /**
     * Gets the value of the destinationSystemCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationSystemCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationSystemCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode }
     * 
     * 
     */
    public List<ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode> getDestinationSystemCode() {
        if (destinationSystemCode == null) {
            destinationSystemCode = new ArrayList<ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode>();
        }
        return this.destinationSystemCode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LengthOfStayRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="POS_RuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RateAccessID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuaranteeDepositRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CancelRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DestinationSystemCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChainRateLevelCrossRef")
        protected String chainRateLevelCrossRef;
        @XmlAttribute(name = "ChainRateCodeCrossRef")
        protected String chainRateCodeCrossRef;
        @XmlAttribute(name = "LengthOfStayRuleID")
        protected String lengthOfStayRuleID;
        @XmlAttribute(name = "POS_RuleID")
        protected String posRuleID;
        @XmlAttribute(name = "RateAccessID")
        protected String rateAccessID;
        @XmlAttribute(name = "GuaranteeDepositRuleID")
        protected String guaranteeDepositRuleID;
        @XmlAttribute(name = "CancelRuleID")
        protected String cancelRuleID;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the chainRateLevelCrossRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainRateLevelCrossRef() {
            return chainRateLevelCrossRef;
        }

        /**
         * Sets the value of the chainRateLevelCrossRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainRateLevelCrossRef(String value) {
            this.chainRateLevelCrossRef = value;
        }

        /**
         * Gets the value of the chainRateCodeCrossRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainRateCodeCrossRef() {
            return chainRateCodeCrossRef;
        }

        /**
         * Sets the value of the chainRateCodeCrossRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainRateCodeCrossRef(String value) {
            this.chainRateCodeCrossRef = value;
        }

        /**
         * Gets the value of the lengthOfStayRuleID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLengthOfStayRuleID() {
            return lengthOfStayRuleID;
        }

        /**
         * Sets the value of the lengthOfStayRuleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLengthOfStayRuleID(String value) {
            this.lengthOfStayRuleID = value;
        }

        /**
         * Gets the value of the posRuleID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSRuleID() {
            return posRuleID;
        }

        /**
         * Sets the value of the posRuleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSRuleID(String value) {
            this.posRuleID = value;
        }

        /**
         * Gets the value of the rateAccessID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateAccessID() {
            return rateAccessID;
        }

        /**
         * Sets the value of the rateAccessID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateAccessID(String value) {
            this.rateAccessID = value;
        }

        /**
         * Gets the value of the guaranteeDepositRuleID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeDepositRuleID() {
            return guaranteeDepositRuleID;
        }

        /**
         * Sets the value of the guaranteeDepositRuleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeDepositRuleID(String value) {
            this.guaranteeDepositRuleID = value;
        }

        /**
         * Gets the value of the cancelRuleID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelRuleID() {
            return cancelRuleID;
        }

        /**
         * Sets the value of the cancelRuleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelRuleID(String value) {
            this.cancelRuleID = value;
        }

    }

}
