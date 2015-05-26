
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PR_ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Images" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_ImageType" minOccurs="0"/>
 *         &lt;element name="Seasons" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPR_SeasonType" minOccurs="0"/>
 *         &lt;element name="MarketingDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_ProductClassificationType" minOccurs="0"/>
 *         &lt;element name="PickupLocations" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPR_PickupLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maximum_capacity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_AvailReqType" />
 *       &lt;attribute name="multi_booking" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="minimum_minimum_nights" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maximum_minimum_nights" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="number_sleeping_areas" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tax_exempt" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_ProductType", propOrder = {
    "description",
    "images",
    "seasons",
    "marketingDetails",
    "pickupLocations"
})
public class PRProductType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Images")
    protected ArrayOfCOImageType images;
    @XmlElement(name = "Seasons")
    protected ArrayOfPRSeasonType seasons;
    @XmlElement(name = "MarketingDetails")
    protected PRProductClassificationType marketingDetails;
    @XmlElement(name = "PickupLocations")
    protected ArrayOfPRPickupLocationType pickupLocations;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "maximum_capacity", required = true)
    protected int maximumCapacity;
    @XmlAttribute(name = "type", required = true)
    protected COAvailReqType type;
    @XmlAttribute(name = "multi_booking", required = true)
    protected boolean multiBooking;
    @XmlAttribute(name = "minimum_minimum_nights")
    protected Integer minimumMinimumNights;
    @XmlAttribute(name = "maximum_minimum_nights")
    protected Integer maximumMinimumNights;
    @XmlAttribute(name = "number_sleeping_areas")
    protected Integer numberSleepingAreas;
    @XmlAttribute(name = "tax_exempt", required = true)
    protected boolean taxExempt;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "obx_id")
    protected String obxId;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCOImageType }
     *     
     */
    public ArrayOfCOImageType getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCOImageType }
     *     
     */
    public void setImages(ArrayOfCOImageType value) {
        this.images = value;
    }

    /**
     * Gets the value of the seasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRSeasonType }
     *     
     */
    public ArrayOfPRSeasonType getSeasons() {
        return seasons;
    }

    /**
     * Sets the value of the seasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRSeasonType }
     *     
     */
    public void setSeasons(ArrayOfPRSeasonType value) {
        this.seasons = value;
    }

    /**
     * Gets the value of the marketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRProductClassificationType }
     *     
     */
    public PRProductClassificationType getMarketingDetails() {
        return marketingDetails;
    }

    /**
     * Sets the value of the marketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRProductClassificationType }
     *     
     */
    public void setMarketingDetails(PRProductClassificationType value) {
        this.marketingDetails = value;
    }

    /**
     * Gets the value of the pickupLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRPickupLocationType }
     *     
     */
    public ArrayOfPRPickupLocationType getPickupLocations() {
        return pickupLocations;
    }

    /**
     * Sets the value of the pickupLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRPickupLocationType }
     *     
     */
    public void setPickupLocations(ArrayOfPRPickupLocationType value) {
        this.pickupLocations = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the maximumCapacity property.
     * 
     */
    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Sets the value of the maximumCapacity property.
     * 
     */
    public void setMaximumCapacity(int value) {
        this.maximumCapacity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link COAvailReqType }
     *     
     */
    public COAvailReqType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link COAvailReqType }
     *     
     */
    public void setType(COAvailReqType value) {
        this.type = value;
    }

    /**
     * Gets the value of the multiBooking property.
     * 
     */
    public boolean isMultiBooking() {
        return multiBooking;
    }

    /**
     * Sets the value of the multiBooking property.
     * 
     */
    public void setMultiBooking(boolean value) {
        this.multiBooking = value;
    }

    /**
     * Gets the value of the minimumMinimumNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumMinimumNights() {
        return minimumMinimumNights;
    }

    /**
     * Sets the value of the minimumMinimumNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumMinimumNights(Integer value) {
        this.minimumMinimumNights = value;
    }

    /**
     * Gets the value of the maximumMinimumNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMinimumNights() {
        return maximumMinimumNights;
    }

    /**
     * Sets the value of the maximumMinimumNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMinimumNights(Integer value) {
        this.maximumMinimumNights = value;
    }

    /**
     * Gets the value of the numberSleepingAreas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberSleepingAreas() {
        return numberSleepingAreas;
    }

    /**
     * Sets the value of the numberSleepingAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberSleepingAreas(Integer value) {
        this.numberSleepingAreas = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     */
    public boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     */
    public void setTaxExempt(boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the obxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObxId() {
        return obxId;
    }

    /**
     * Sets the value of the obxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObxId(String value) {
        this.obxId = value;
    }

}
