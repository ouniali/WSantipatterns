
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import hotel.v2.webservice.cangooroo.RoomResultCancellationPolicies;
import ws_2013.PriceValue;


/**
 * <p>Java class for RoomResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Promotion" type="{WS_2013.Hotel}Promotions" minOccurs="0"/>
 *         &lt;element name="QtyAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgeOfTheChildren" type="{WS_2013.Hotel}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SellPricePerRoom" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="SellPriceTotal" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="BoardDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CheckInHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOutHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BreakdownSales" type="{WS_2013.Hotel}ArrayOfBreakdown" minOccurs="0"/>
 *         &lt;element name="Commission" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Amenities" type="{WS_2013.Hotel}ArrayOfAmenity" minOccurs="0"/>
 *         &lt;element name="RoomPictures" type="{WS_2013.Hotel}ArrayOfRoomDetailPhoto" minOccurs="0"/>
 *         &lt;element name="TaxesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendedRoom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DynamicInventory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OperatorCancellationPolicies" type="{WS_2013.Hotel}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="HotelDirectPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BreakfastIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsNonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomResultBase", propOrder = {
    "promotion",
    "qtyAdults",
    "ageOfTheChildren",
    "roomId",
    "hotelId",
    "sellPricePerRoom",
    "sellPriceTotal",
    "boardDescription",
    "roomDescription",
    "available",
    "checkInHour",
    "checkOutHour",
    "hotelCategory",
    "specialOffer",
    "quantity",
    "breakdownSales",
    "commission",
    "commissionPercent",
    "amenities",
    "roomPictures",
    "taxesIncluded",
    "remarks",
    "termsAndConditions",
    "recommendedRoom",
    "dynamicInventory",
    "operatorCancellationPolicies",
    "hotelDirectPayment",
    "breakfastIncluded",
    "isNonRefundable"
})
@XmlSeeAlso({
    RoomResult.class,
    RoomResultCancellationPolicies.class
})
public abstract class RoomResultBase {

    @XmlElement(name = "Promotion")
    protected Promotions promotion;
    @XmlElement(name = "QtyAdults")
    protected int qtyAdults;
    @XmlElement(name = "AgeOfTheChildren")
    protected ArrayOfInt ageOfTheChildren;
    @XmlElement(name = "RoomId")
    protected String roomId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "SellPricePerRoom")
    protected PriceValue sellPricePerRoom;
    @XmlElement(name = "SellPriceTotal")
    protected PriceValue sellPriceTotal;
    @XmlElement(name = "BoardDescription")
    protected String boardDescription;
    @XmlElement(name = "RoomDescription")
    protected String roomDescription;
    @XmlElement(name = "Available")
    protected boolean available;
    @XmlElement(name = "CheckInHour")
    protected String checkInHour;
    @XmlElement(name = "CheckOutHour")
    protected String checkOutHour;
    @XmlElement(name = "HotelCategory")
    protected String hotelCategory;
    @XmlElement(name = "SpecialOffer")
    protected boolean specialOffer;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "BreakdownSales")
    protected ArrayOfBreakdown breakdownSales;
    @XmlElement(name = "Commission")
    protected PriceValue commission;
    @XmlElement(name = "CommissionPercent")
    protected double commissionPercent;
    @XmlElement(name = "Amenities")
    protected ArrayOfAmenity amenities;
    @XmlElement(name = "RoomPictures")
    protected ArrayOfRoomDetailPhoto roomPictures;
    @XmlElement(name = "TaxesIncluded")
    protected boolean taxesIncluded;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "TermsAndConditions")
    protected String termsAndConditions;
    @XmlElement(name = "RecommendedRoom")
    protected boolean recommendedRoom;
    @XmlElement(name = "DynamicInventory")
    protected boolean dynamicInventory;
    @XmlElement(name = "OperatorCancellationPolicies")
    protected ArrayOfCancellationPolicy operatorCancellationPolicies;
    @XmlElement(name = "HotelDirectPayment")
    protected boolean hotelDirectPayment;
    @XmlElement(name = "BreakfastIncluded")
    protected boolean breakfastIncluded;
    @XmlElement(name = "IsNonRefundable")
    protected boolean isNonRefundable;

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotion(Promotions value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the qtyAdults property.
     * 
     */
    public int getQtyAdults() {
        return qtyAdults;
    }

    /**
     * Sets the value of the qtyAdults property.
     * 
     */
    public void setQtyAdults(int value) {
        this.qtyAdults = value;
    }

    /**
     * Gets the value of the ageOfTheChildren property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAgeOfTheChildren() {
        return ageOfTheChildren;
    }

    /**
     * Sets the value of the ageOfTheChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAgeOfTheChildren(ArrayOfInt value) {
        this.ageOfTheChildren = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomId(String value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the sellPricePerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSellPricePerRoom() {
        return sellPricePerRoom;
    }

    /**
     * Sets the value of the sellPricePerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSellPricePerRoom(PriceValue value) {
        this.sellPricePerRoom = value;
    }

    /**
     * Gets the value of the sellPriceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSellPriceTotal() {
        return sellPriceTotal;
    }

    /**
     * Sets the value of the sellPriceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSellPriceTotal(PriceValue value) {
        this.sellPriceTotal = value;
    }

    /**
     * Gets the value of the boardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardDescription() {
        return boardDescription;
    }

    /**
     * Sets the value of the boardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardDescription(String value) {
        this.boardDescription = value;
    }

    /**
     * Gets the value of the roomDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Sets the value of the roomDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the checkInHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInHour() {
        return checkInHour;
    }

    /**
     * Sets the value of the checkInHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInHour(String value) {
        this.checkInHour = value;
    }

    /**
     * Gets the value of the checkOutHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutHour() {
        return checkOutHour;
    }

    /**
     * Sets the value of the checkOutHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutHour(String value) {
        this.checkOutHour = value;
    }

    /**
     * Gets the value of the hotelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCategory() {
        return hotelCategory;
    }

    /**
     * Sets the value of the hotelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCategory(String value) {
        this.hotelCategory = value;
    }

    /**
     * Gets the value of the specialOffer property.
     * 
     */
    public boolean isSpecialOffer() {
        return specialOffer;
    }

    /**
     * Sets the value of the specialOffer property.
     * 
     */
    public void setSpecialOffer(boolean value) {
        this.specialOffer = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the breakdownSales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBreakdown }
     *     
     */
    public ArrayOfBreakdown getBreakdownSales() {
        return breakdownSales;
    }

    /**
     * Sets the value of the breakdownSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBreakdown }
     *     
     */
    public void setBreakdownSales(ArrayOfBreakdown value) {
        this.breakdownSales = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setCommission(PriceValue value) {
        this.commission = value;
    }

    /**
     * Gets the value of the commissionPercent property.
     * 
     */
    public double getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * Sets the value of the commissionPercent property.
     * 
     */
    public void setCommissionPercent(double value) {
        this.commissionPercent = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAmenity }
     *     
     */
    public ArrayOfAmenity getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAmenity }
     *     
     */
    public void setAmenities(ArrayOfAmenity value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the roomPictures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomDetailPhoto }
     *     
     */
    public ArrayOfRoomDetailPhoto getRoomPictures() {
        return roomPictures;
    }

    /**
     * Sets the value of the roomPictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomDetailPhoto }
     *     
     */
    public void setRoomPictures(ArrayOfRoomDetailPhoto value) {
        this.roomPictures = value;
    }

    /**
     * Gets the value of the taxesIncluded property.
     * 
     */
    public boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    /**
     * Sets the value of the taxesIncluded property.
     * 
     */
    public void setTaxesIncluded(boolean value) {
        this.taxesIncluded = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the recommendedRoom property.
     * 
     */
    public boolean isRecommendedRoom() {
        return recommendedRoom;
    }

    /**
     * Sets the value of the recommendedRoom property.
     * 
     */
    public void setRecommendedRoom(boolean value) {
        this.recommendedRoom = value;
    }

    /**
     * Gets the value of the dynamicInventory property.
     * 
     */
    public boolean isDynamicInventory() {
        return dynamicInventory;
    }

    /**
     * Sets the value of the dynamicInventory property.
     * 
     */
    public void setDynamicInventory(boolean value) {
        this.dynamicInventory = value;
    }

    /**
     * Gets the value of the operatorCancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getOperatorCancellationPolicies() {
        return operatorCancellationPolicies;
    }

    /**
     * Sets the value of the operatorCancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setOperatorCancellationPolicies(ArrayOfCancellationPolicy value) {
        this.operatorCancellationPolicies = value;
    }

    /**
     * Gets the value of the hotelDirectPayment property.
     * 
     */
    public boolean isHotelDirectPayment() {
        return hotelDirectPayment;
    }

    /**
     * Sets the value of the hotelDirectPayment property.
     * 
     */
    public void setHotelDirectPayment(boolean value) {
        this.hotelDirectPayment = value;
    }

    /**
     * Gets the value of the breakfastIncluded property.
     * 
     */
    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    /**
     * Sets the value of the breakfastIncluded property.
     * 
     */
    public void setBreakfastIncluded(boolean value) {
        this.breakfastIncluded = value;
    }

    /**
     * Gets the value of the isNonRefundable property.
     * 
     */
    public boolean isIsNonRefundable() {
        return isNonRefundable;
    }

    /**
     * Sets the value of the isNonRefundable property.
     * 
     */
    public void setIsNonRefundable(boolean value) {
        this.isNonRefundable = value;
    }

}
