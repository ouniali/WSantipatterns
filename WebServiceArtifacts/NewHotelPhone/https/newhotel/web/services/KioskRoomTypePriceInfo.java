
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskRoomTypePriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskRoomTypePriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PensionMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PensionModeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceRateId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PriceRateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{https://NewHotel/Web/Services/}KioskRoomTypeInfo" minOccurs="0"/>
 *         &lt;element name="Prices" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationPriceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskRoomTypePriceInfo", propOrder = {
    "pensionMode",
    "pensionModeDescription",
    "priceRateId",
    "priceRateDescription",
    "roomType",
    "prices"
})
public class KioskRoomTypePriceInfo {

    @XmlElement(name = "PensionMode", required = true, type = Short.class, nillable = true)
    protected Short pensionMode;
    @XmlElement(name = "PensionModeDescription")
    protected String pensionModeDescription;
    @XmlElement(name = "PriceRateId", required = true, nillable = true)
    protected String priceRateId;
    @XmlElement(name = "PriceRateDescription")
    protected String priceRateDescription;
    @XmlElement(name = "RoomType")
    protected KioskRoomTypeInfo roomType;
    @XmlElement(name = "Prices")
    protected ArrayOfKioskReservationPriceInfo prices;

    /**
     * Gets the value of the pensionMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPensionMode() {
        return pensionMode;
    }

    /**
     * Sets the value of the pensionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPensionMode(Short value) {
        this.pensionMode = value;
    }

    /**
     * Gets the value of the pensionModeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionModeDescription() {
        return pensionModeDescription;
    }

    /**
     * Sets the value of the pensionModeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionModeDescription(String value) {
        this.pensionModeDescription = value;
    }

    /**
     * Gets the value of the priceRateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRateId() {
        return priceRateId;
    }

    /**
     * Sets the value of the priceRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRateId(String value) {
        this.priceRateId = value;
    }

    /**
     * Gets the value of the priceRateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRateDescription() {
        return priceRateDescription;
    }

    /**
     * Sets the value of the priceRateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRateDescription(String value) {
        this.priceRateDescription = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public KioskRoomTypeInfo getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public void setRoomType(KioskRoomTypeInfo value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationPriceInfo }
     *     
     */
    public ArrayOfKioskReservationPriceInfo getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationPriceInfo }
     *     
     */
    public void setPrices(ArrayOfKioskReservationPriceInfo value) {
        this.prices = value;
    }

}
