
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestaurantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestaurantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaDescriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                 &lt;attribute name="Attire" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
 *         &lt;element name="InfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantTypeInfoCode" minOccurs="0"/>
 *         &lt;element name="CuisineCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantTypeCuisineCode" minOccurs="0"/>
 *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RestaurantName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxSingleParty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfferBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferLunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferDinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferBrunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantType", propOrder = {
    "multimediaDescriptions",
    "relativePosition",
    "operationSchedules",
    "infoCodes",
    "cuisineCodes",
    "descriptiveText"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.RestaurantsType.Restaurant.class
})
public class RestaurantType {

    @XmlElement(name = "MultimediaDescriptions")
    protected RestaurantType.MultimediaDescriptions multimediaDescriptions;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "OperationSchedules")
    protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
    @XmlElement(name = "InfoCodes")
    protected ArrayOfRestaurantTypeInfoCode infoCodes;
    @XmlElement(name = "CuisineCodes")
    protected ArrayOfRestaurantTypeCuisineCode cuisineCodes;
    @XmlElement(name = "DescriptiveText")
    protected String descriptiveText;
    @XmlAttribute(name = "RestaurantName")
    protected String restaurantName;
    @XmlAttribute(name = "MaxSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSeatingCapacity;
    @XmlAttribute(name = "MaxSingleParty")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSingleParty;
    @XmlAttribute(name = "InvCode")
    protected String invCode;
    @XmlAttribute(name = "OfferBreakfast")
    protected Boolean offerBreakfast;
    @XmlAttribute(name = "OfferLunch")
    protected Boolean offerLunch;
    @XmlAttribute(name = "OfferDinner")
    protected Boolean offerDinner;
    @XmlAttribute(name = "OfferBrunch")
    protected Boolean offerBrunch;
    @XmlAttribute(name = "ProximityCode")
    protected String proximityCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Sort")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sort;

    /**
     * Gets the value of the multimediaDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public RestaurantType.MultimediaDescriptions getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * Sets the value of the multimediaDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public void setMultimediaDescriptions(RestaurantType.MultimediaDescriptions value) {
        this.multimediaDescriptions = value;
    }

    /**
     * Gets the value of the relativePosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * Sets the value of the relativePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * Gets the value of the operationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     *     
     */
    public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Sets the value of the operationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     *     
     */
    public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
        this.operationSchedules = value;
    }

    /**
     * Gets the value of the infoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestaurantTypeInfoCode }
     *     
     */
    public ArrayOfRestaurantTypeInfoCode getInfoCodes() {
        return infoCodes;
    }

    /**
     * Sets the value of the infoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestaurantTypeInfoCode }
     *     
     */
    public void setInfoCodes(ArrayOfRestaurantTypeInfoCode value) {
        this.infoCodes = value;
    }

    /**
     * Gets the value of the cuisineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestaurantTypeCuisineCode }
     *     
     */
    public ArrayOfRestaurantTypeCuisineCode getCuisineCodes() {
        return cuisineCodes;
    }

    /**
     * Sets the value of the cuisineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestaurantTypeCuisineCode }
     *     
     */
    public void setCuisineCodes(ArrayOfRestaurantTypeCuisineCode value) {
        this.cuisineCodes = value;
    }

    /**
     * Gets the value of the descriptiveText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveText() {
        return descriptiveText;
    }

    /**
     * Sets the value of the descriptiveText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveText(String value) {
        this.descriptiveText = value;
    }

    /**
     * Gets the value of the restaurantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * Sets the value of the restaurantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantName(String value) {
        this.restaurantName = value;
    }

    /**
     * Gets the value of the maxSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    /**
     * Sets the value of the maxSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSeatingCapacity(BigInteger value) {
        this.maxSeatingCapacity = value;
    }

    /**
     * Gets the value of the maxSingleParty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSingleParty() {
        return maxSingleParty;
    }

    /**
     * Sets the value of the maxSingleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSingleParty(BigInteger value) {
        this.maxSingleParty = value;
    }

    /**
     * Gets the value of the invCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCode() {
        return invCode;
    }

    /**
     * Sets the value of the invCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCode(String value) {
        this.invCode = value;
    }

    /**
     * Gets the value of the offerBreakfast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBreakfast() {
        return offerBreakfast;
    }

    /**
     * Sets the value of the offerBreakfast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBreakfast(Boolean value) {
        this.offerBreakfast = value;
    }

    /**
     * Gets the value of the offerLunch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferLunch() {
        return offerLunch;
    }

    /**
     * Sets the value of the offerLunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferLunch(Boolean value) {
        this.offerLunch = value;
    }

    /**
     * Gets the value of the offerDinner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferDinner() {
        return offerDinner;
    }

    /**
     * Sets the value of the offerDinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferDinner(Boolean value) {
        this.offerDinner = value;
    }

    /**
     * Gets the value of the offerBrunch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBrunch() {
        return offerBrunch;
    }

    /**
     * Sets the value of the offerBrunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBrunch(Boolean value) {
        this.offerBrunch = value;
    }

    /**
     * Gets the value of the proximityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximityCode() {
        return proximityCode;
    }

    /**
     * Sets the value of the proximityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximityCode(String value) {
        this.proximityCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSort(BigInteger value) {
        this.sort = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *       &lt;attribute name="Attire" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaDescriptions
        extends MultimediaDescriptionsType
    {

        @XmlAttribute(name = "Attire")
        protected String attire;

        /**
         * Gets the value of the attire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttire() {
            return attire;
        }

        /**
         * Sets the value of the attire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttire(String value) {
            this.attire = value;
        }

    }

}
