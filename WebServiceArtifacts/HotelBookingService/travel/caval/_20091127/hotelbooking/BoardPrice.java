
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boardPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boardPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldNetPrice" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="oldGrossPrice" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="netPrice" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="grossPrice" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="offer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appliedCategoryOffers" type="{http://caval.travel/20091127/hotelBooking}offerCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boardPrice", propOrder = {
    "boardCategoryId",
    "boardCode",
    "boardName",
    "oldNetPrice",
    "oldGrossPrice",
    "netPrice",
    "grossPrice",
    "offer",
    "offerDescription",
    "appliedCategoryOffers",
    "key"
})
public class BoardPrice {

    protected String boardCategoryId;
    protected String boardCode;
    protected String boardName;
    protected Amount oldNetPrice;
    protected Amount oldGrossPrice;
    protected Amount netPrice;
    protected Amount grossPrice;
    protected Boolean offer;
    protected String offerDescription;
    @XmlElement(nillable = true)
    protected List<OfferCategory> appliedCategoryOffers;
    protected String key;

    /**
     * Gets the value of the boardCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardCategoryId() {
        return boardCategoryId;
    }

    /**
     * Sets the value of the boardCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardCategoryId(String value) {
        this.boardCategoryId = value;
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
     * Gets the value of the oldNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOldNetPrice() {
        return oldNetPrice;
    }

    /**
     * Sets the value of the oldNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOldNetPrice(Amount value) {
        this.oldNetPrice = value;
    }

    /**
     * Gets the value of the oldGrossPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOldGrossPrice() {
        return oldGrossPrice;
    }

    /**
     * Sets the value of the oldGrossPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOldGrossPrice(Amount value) {
        this.oldGrossPrice = value;
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
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffer(Boolean value) {
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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
