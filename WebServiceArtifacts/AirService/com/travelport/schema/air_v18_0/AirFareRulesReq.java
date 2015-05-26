
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AirReservationSelector">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="AirReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareRuleLookup" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareRuleKey" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirFareDisplayRuleKey"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirFareRulesModifier" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v18_0}typeFareRuleType" default="long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationSelector",
    "fareRuleLookup",
    "fareRuleKey",
    "airFareDisplayRuleKey",
    "airFareRulesModifier"
})
@XmlRootElement(name = "AirFareRulesReq")
public class AirFareRulesReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationSelector")
    protected AirFareRulesReq.AirReservationSelector airReservationSelector;
    @XmlElement(name = "FareRuleLookup")
    protected FareRuleLookup fareRuleLookup;
    @XmlElement(name = "FareRuleKey")
    protected List<FareRuleKey> fareRuleKey;
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    @XmlElement(name = "AirFareRulesModifier")
    protected AirFareRulesModifier airFareRulesModifier;
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;

    /**
     * Gets the value of the airReservationSelector property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareRulesReq.AirReservationSelector }
     *     
     */
    public AirFareRulesReq.AirReservationSelector getAirReservationSelector() {
        return airReservationSelector;
    }

    /**
     * Sets the value of the airReservationSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareRulesReq.AirReservationSelector }
     *     
     */
    public void setAirReservationSelector(AirFareRulesReq.AirReservationSelector value) {
        this.airReservationSelector = value;
    }

    /**
     * Gets the value of the fareRuleLookup property.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleLookup }
     *     
     */
    public FareRuleLookup getFareRuleLookup() {
        return fareRuleLookup;
    }

    /**
     * Sets the value of the fareRuleLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleLookup }
     *     
     */
    public void setFareRuleLookup(FareRuleLookup value) {
        this.fareRuleLookup = value;
    }

    /**
     * Gets the value of the fareRuleKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRuleKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleKey }
     * 
     * 
     */
    public List<FareRuleKey> getFareRuleKey() {
        if (fareRuleKey == null) {
            fareRuleKey = new ArrayList<FareRuleKey>();
        }
        return this.fareRuleKey;
    }

    /**
     * Gets the value of the airFareDisplayRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * Gets the value of the airFareRulesModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareRulesModifier }
     *     
     */
    public AirFareRulesModifier getAirFareRulesModifier() {
        return airFareRulesModifier;
    }

    /**
     * Sets the value of the airFareRulesModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareRulesModifier }
     *     
     */
    public void setAirFareRulesModifier(AirFareRulesModifier value) {
        this.airFareRulesModifier = value;
    }

    /**
     * Gets the value of the fareRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRuleType }
     *     
     */
    public TypeFareRuleType getFareRuleType() {
        if (fareRuleType == null) {
            return TypeFareRuleType.LONG;
        } else {
            return fareRuleType;
        }
    }

    /**
     * Sets the value of the fareRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRuleType }
     *     
     */
    public void setFareRuleType(TypeFareRuleType value) {
        this.fareRuleType = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareInfoRef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AirReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareInfoRef"
    })
    public static class AirReservationSelector {

        @XmlElement(name = "FareInfoRef")
        protected List<FareInfoRef> fareInfoRef;
        @XmlAttribute(name = "AirReservationLocatorCode", required = true)
        protected String airReservationLocatorCode;

        /**
         * Gets the value of the fareInfoRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfoRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfoRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfoRef }
         * 
         * 
         */
        public List<FareInfoRef> getFareInfoRef() {
            if (fareInfoRef == null) {
                fareInfoRef = new ArrayList<FareInfoRef>();
            }
            return this.fareInfoRef;
        }

        /**
         * Gets the value of the airReservationLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirReservationLocatorCode() {
            return airReservationLocatorCode;
        }

        /**
         * Sets the value of the airReservationLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirReservationLocatorCode(String value) {
            this.airReservationLocatorCode = value;
        }

    }

}
