
package travel.whl.api.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of LengthOfStay.
 * 
 * <p>Java class for LengthsOfStayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthsOfStayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LengthOfStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TimeUnit" type="{http://api.whl.travel/soap}TimeUnitType" />
 *                 &lt;attribute name="MinMaxMessageType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SetMinLOS"/>
 *                       &lt;enumeration value="RemoveMinLOS"/>
 *                       &lt;enumeration value="SetMaxLOS"/>
 *                       &lt;enumeration value="RemoveMaxLOS"/>
 *                       &lt;enumeration value="SetForwardMinStay"/>
 *                       &lt;enumeration value="RemoveForwardMinStay"/>
 *                       &lt;enumeration value="SetForwardMaxStay"/>
 *                       &lt;enumeration value="RemoveForwardMaxStay"/>
 *                       &lt;enumeration value="FixedLOS"/>
 *                       &lt;enumeration value="FullPatternLOS"/>
 *                       &lt;enumeration value="MinLOS"/>
 *                       &lt;enumeration value="MaxLOS"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ArrivalDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthsOfStayType", propOrder = {
    "lengthOfStay"
})
public class LengthsOfStayType {

    @XmlElement(name = "LengthOfStay")
    protected List<LengthsOfStayType.LengthOfStay> lengthOfStay;
    @XmlAttribute(name = "ArrivalDateBased")
    protected Boolean arrivalDateBased;

    /**
     * Gets the value of the lengthOfStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthOfStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthOfStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthsOfStayType.LengthOfStay }
     * 
     * 
     */
    public List<LengthsOfStayType.LengthOfStay> getLengthOfStay() {
        if (lengthOfStay == null) {
            lengthOfStay = new ArrayList<LengthsOfStayType.LengthOfStay>();
        }
        return this.lengthOfStay;
    }

    /**
     * Gets the value of the arrivalDateBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalDateBased() {
        return arrivalDateBased;
    }

    /**
     * Sets the value of the arrivalDateBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalDateBased(Boolean value) {
        this.arrivalDateBased = value;
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
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TimeUnit" type="{http://api.whl.travel/soap}TimeUnitType" />
     *       &lt;attribute name="MinMaxMessageType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SetMinLOS"/>
     *             &lt;enumeration value="RemoveMinLOS"/>
     *             &lt;enumeration value="SetMaxLOS"/>
     *             &lt;enumeration value="RemoveMaxLOS"/>
     *             &lt;enumeration value="SetForwardMinStay"/>
     *             &lt;enumeration value="RemoveForwardMinStay"/>
     *             &lt;enumeration value="SetForwardMaxStay"/>
     *             &lt;enumeration value="RemoveForwardMaxStay"/>
     *             &lt;enumeration value="FixedLOS"/>
     *             &lt;enumeration value="FullPatternLOS"/>
     *             &lt;enumeration value="MinLOS"/>
     *             &lt;enumeration value="MaxLOS"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LengthOfStay {

        @XmlAttribute(name = "Time")
        protected BigInteger time;
        @XmlAttribute(name = "TimeUnit")
        protected TimeUnitType timeUnit;
        @XmlAttribute(name = "MinMaxMessageType")
        protected String minMaxMessageType;

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTime(BigInteger value) {
            this.time = value;
        }

        /**
         * Gets the value of the timeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * Sets the value of the timeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
        }

        /**
         * Gets the value of the minMaxMessageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinMaxMessageType() {
            return minMaxMessageType;
        }

        /**
         * Sets the value of the minMaxMessageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinMaxMessageType(String value) {
            this.minMaxMessageType = value;
        }

    }

}
