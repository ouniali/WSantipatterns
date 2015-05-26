
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccommodationSegmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationSegmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/>
 *         &lt;element name="RoomProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomProfile" type="{http://www.opentravel.org/OTA/2003/05}RoomProfileType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MealPlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResortCodeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestinationLevelGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationSegmentRequestType", propOrder = {
    "identity",
    "dateRange",
    "roomProfiles",
    "mealPlans"
})
public class AccommodationSegmentRequestType {

    @XmlElement(name = "Identity")
    protected PropertyIdentityType identity;
    @XmlElement(name = "DateRange", required = true)
    protected DateTimeSpanType dateRange;
    @XmlElement(name = "RoomProfiles")
    protected AccommodationSegmentRequestType.RoomProfiles roomProfiles;
    @XmlElement(name = "MealPlans")
    protected AccommodationSegmentRequestType.MealPlans mealPlans;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ResortCode")
    protected String resortCode;
    @XmlAttribute(name = "ResortName")
    protected String resortName;
    @XmlAttribute(name = "DestinationCode")
    protected String destinationCode;
    @XmlAttribute(name = "DestinationLevel")
    protected DestinationLevelType destinationLevel;
    @XmlAttribute(name = "DestinationName")
    protected String destinationName;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdentityType }
     *     
     */
    public PropertyIdentityType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdentityType }
     *     
     */
    public void setIdentity(PropertyIdentityType value) {
        this.identity = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setDateRange(DateTimeSpanType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the roomProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSegmentRequestType.RoomProfiles }
     *     
     */
    public AccommodationSegmentRequestType.RoomProfiles getRoomProfiles() {
        return roomProfiles;
    }

    /**
     * Sets the value of the roomProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSegmentRequestType.RoomProfiles }
     *     
     */
    public void setRoomProfiles(AccommodationSegmentRequestType.RoomProfiles value) {
        this.roomProfiles = value;
    }

    /**
     * Gets the value of the mealPlans property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSegmentRequestType.MealPlans }
     *     
     */
    public AccommodationSegmentRequestType.MealPlans getMealPlans() {
        return mealPlans;
    }

    /**
     * Sets the value of the mealPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSegmentRequestType.MealPlans }
     *     
     */
    public void setMealPlans(AccommodationSegmentRequestType.MealPlans value) {
        this.mealPlans = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the resortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResortCode() {
        return resortCode;
    }

    /**
     * Sets the value of the resortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResortCode(String value) {
        this.resortCode = value;
    }

    /**
     * Gets the value of the resortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResortName() {
        return resortName;
    }

    /**
     * Sets the value of the resortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResortName(String value) {
        this.resortName = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * Gets the value of the destinationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationLevelType }
     *     
     */
    public DestinationLevelType getDestinationLevel() {
        return destinationLevel;
    }

    /**
     * Sets the value of the destinationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationLevelType }
     *     
     */
    public void setDestinationLevel(DestinationLevelType value) {
        this.destinationLevel = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
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
     *         &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
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
        "mealPlan"
    })
    public static class MealPlans {

        @XmlElement(name = "MealPlan", required = true)
        protected List<MealPlanType> mealPlan;

        /**
         * Gets the value of the mealPlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MealPlanType }
         * 
         * 
         */
        public List<MealPlanType> getMealPlan() {
            if (mealPlan == null) {
                mealPlan = new ArrayList<MealPlanType>();
            }
            return this.mealPlan;
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
     *         &lt;element name="RoomProfile" type="{http://www.opentravel.org/OTA/2003/05}RoomProfileType" maxOccurs="9"/>
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
        "roomProfile"
    })
    public static class RoomProfiles {

        @XmlElement(name = "RoomProfile", required = true)
        protected List<RoomProfileType> roomProfile;

        /**
         * Gets the value of the roomProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomProfileType }
         * 
         * 
         */
        public List<RoomProfileType> getRoomProfile() {
            if (roomProfile == null) {
                roomProfile = new ArrayList<RoomProfileType>();
            }
            return this.roomProfile;
        }

    }

}
