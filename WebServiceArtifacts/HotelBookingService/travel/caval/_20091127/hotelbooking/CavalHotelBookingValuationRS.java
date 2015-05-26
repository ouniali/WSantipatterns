
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalHotelBookingValuationRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalHotelBookingValuationRS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractRS">
 *       &lt;sequence>
 *         &lt;element name="establishmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupations" type="{http://caval.travel/20091127/hotelBooking}valuatedOccupation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="offerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appliedCategoryOffers" type="{http://caval.travel/20091127/hotelBooking}offerCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="netPrice" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="grossPrice" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valuationLines" type="{http://caval.travel/20091127/hotelBooking}valuatedLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableSupplements" type="{http://caval.travel/20091127/hotelBooking}supplement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancellationCosts" type="{http://caval.travel/20091127/hotelBooking}cancellationCost" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statsKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalHotelBookingValuationRS", propOrder = {
    "establishmentId",
    "establishmentName",
    "establishmentCategory",
    "establishmentAddress",
    "establishmentZip",
    "establishmentCity",
    "establishmentCountry",
    "establishmentImageUrl",
    "establishmentDescription",
    "checkin",
    "checkout",
    "boardCode",
    "boardName",
    "occupations",
    "status",
    "offer",
    "offerDescription",
    "appliedCategoryOffers",
    "netPrice",
    "grossPrice",
    "remarks",
    "valuationLines",
    "availableSupplements",
    "cancellationCosts",
    "statsKey"
})
public class CavalHotelBookingValuationRS
    extends AbstractRS
{

    protected String establishmentId;
    protected String establishmentName;
    protected String establishmentCategory;
    protected String establishmentAddress;
    protected String establishmentZip;
    protected String establishmentCity;
    protected String establishmentCountry;
    protected String establishmentImageUrl;
    protected String establishmentDescription;
    protected String checkin;
    protected String checkout;
    protected String boardCode;
    protected String boardName;
    @XmlElement(nillable = true)
    protected List<ValuatedOccupation> occupations;
    protected String status;
    protected boolean offer;
    protected String offerDescription;
    @XmlElement(nillable = true)
    protected List<OfferCategory> appliedCategoryOffers;
    protected Amount netPrice;
    protected Amount grossPrice;
    @XmlElement(nillable = true)
    protected List<String> remarks;
    @XmlElement(nillable = true)
    protected List<ValuatedLine> valuationLines;
    @XmlElement(nillable = true)
    protected List<Supplement> availableSupplements;
    @XmlElement(nillable = true)
    protected List<CancellationCost> cancellationCosts;
    protected String statsKey;

    /**
     * Gets the value of the establishmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentId() {
        return establishmentId;
    }

    /**
     * Sets the value of the establishmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentId(String value) {
        this.establishmentId = value;
    }

    /**
     * Gets the value of the establishmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentName() {
        return establishmentName;
    }

    /**
     * Sets the value of the establishmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentName(String value) {
        this.establishmentName = value;
    }

    /**
     * Gets the value of the establishmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCategory() {
        return establishmentCategory;
    }

    /**
     * Sets the value of the establishmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCategory(String value) {
        this.establishmentCategory = value;
    }

    /**
     * Gets the value of the establishmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentAddress() {
        return establishmentAddress;
    }

    /**
     * Sets the value of the establishmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentAddress(String value) {
        this.establishmentAddress = value;
    }

    /**
     * Gets the value of the establishmentZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentZip() {
        return establishmentZip;
    }

    /**
     * Sets the value of the establishmentZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentZip(String value) {
        this.establishmentZip = value;
    }

    /**
     * Gets the value of the establishmentCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCity() {
        return establishmentCity;
    }

    /**
     * Sets the value of the establishmentCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCity(String value) {
        this.establishmentCity = value;
    }

    /**
     * Gets the value of the establishmentCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCountry() {
        return establishmentCountry;
    }

    /**
     * Sets the value of the establishmentCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCountry(String value) {
        this.establishmentCountry = value;
    }

    /**
     * Gets the value of the establishmentImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentImageUrl() {
        return establishmentImageUrl;
    }

    /**
     * Sets the value of the establishmentImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentImageUrl(String value) {
        this.establishmentImageUrl = value;
    }

    /**
     * Gets the value of the establishmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentDescription() {
        return establishmentDescription;
    }

    /**
     * Sets the value of the establishmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentDescription(String value) {
        this.establishmentDescription = value;
    }

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckin() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckin(String value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckout() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckout(String value) {
        this.checkout = value;
    }

    /**
     * Gets the value of the boardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardCode() {
        return boardCode;
    }

    /**
     * Sets the value of the boardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardCode(String value) {
        this.boardCode = value;
    }

    /**
     * Gets the value of the boardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardName() {
        return boardName;
    }

    /**
     * Sets the value of the boardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardName(String value) {
        this.boardName = value;
    }

    /**
     * Gets the value of the occupations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuatedOccupation }
     * 
     * 
     */
    public List<ValuatedOccupation> getOccupations() {
        if (occupations == null) {
            occupations = new ArrayList<ValuatedOccupation>();
        }
        return this.occupations;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     */
    public boolean isOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     */
    public void setOffer(boolean value) {
        this.offer = value;
    }

    /**
     * Gets the value of the offerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * Sets the value of the offerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDescription(String value) {
        this.offerDescription = value;
    }

    /**
     * Gets the value of the appliedCategoryOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedCategoryOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedCategoryOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferCategory }
     * 
     * 
     */
    public List<OfferCategory> getAppliedCategoryOffers() {
        if (appliedCategoryOffers == null) {
            appliedCategoryOffers = new ArrayList<OfferCategory>();
        }
        return this.appliedCategoryOffers;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetPrice(Amount value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the grossPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGrossPrice() {
        return grossPrice;
    }

    /**
     * Sets the value of the grossPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGrossPrice(Amount value) {
        this.grossPrice = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<String>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the valuationLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuationLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuationLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuatedLine }
     * 
     * 
     */
    public List<ValuatedLine> getValuationLines() {
        if (valuationLines == null) {
            valuationLines = new ArrayList<ValuatedLine>();
        }
        return this.valuationLines;
    }

    /**
     * Gets the value of the availableSupplements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableSupplements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableSupplements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplement }
     * 
     * 
     */
    public List<Supplement> getAvailableSupplements() {
        if (availableSupplements == null) {
            availableSupplements = new ArrayList<Supplement>();
        }
        return this.availableSupplements;
    }

    /**
     * Gets the value of the cancellationCosts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellationCosts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellationCosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationCost }
     * 
     * 
     */
    public List<CancellationCost> getCancellationCosts() {
        if (cancellationCosts == null) {
            cancellationCosts = new ArrayList<CancellationCost>();
        }
        return this.cancellationCosts;
    }

    /**
     * Gets the value of the statsKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsKey() {
        return statsKey;
    }

    /**
     * Sets the value of the statsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsKey(String value) {
        this.statsKey = value;
    }

}
