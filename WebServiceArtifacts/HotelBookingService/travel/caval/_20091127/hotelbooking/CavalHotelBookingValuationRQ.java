
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalHotelBookingValuationRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalHotelBookingValuationRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractAuthenticatedAgencyRQ">
 *       &lt;sequence>
 *         &lt;element name="establishmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="boardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupations" type="{http://caval.travel/20091127/hotelBooking}occupation" maxOccurs="unbounded"/>
 *         &lt;element name="desiredSupplements" type="{http://caval.travel/20091127/hotelBooking}desiredSupplement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guestCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalHotelBookingValuationRQ", propOrder = {
    "establishmentId",
    "checkIn",
    "checkOut",
    "boardCode",
    "occupations",
    "desiredSupplements",
    "guestCountryCode"
})
@XmlSeeAlso({
    CavalHotelBookingConfirmRQ.class
})
public class CavalHotelBookingValuationRQ
    extends AbstractAuthenticatedAgencyRQ
{

    @XmlElement(required = true)
    protected String establishmentId;
    @XmlElement(required = true)
    protected String checkIn;
    @XmlElement(required = true)
    protected String checkOut;
    protected String boardCode;
    @XmlElement(required = true, nillable = true)
    protected List<Occupation> occupations;
    @XmlElement(nillable = true)
    protected List<DesiredSupplement> desiredSupplements;
    protected String guestCountryCode;

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
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckIn(String value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOut(String value) {
        this.checkOut = value;
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
     * {@link Occupation }
     * 
     * 
     */
    public List<Occupation> getOccupations() {
        if (occupations == null) {
            occupations = new ArrayList<Occupation>();
        }
        return this.occupations;
    }

    /**
     * Gets the value of the desiredSupplements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desiredSupplements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesiredSupplements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesiredSupplement }
     * 
     * 
     */
    public List<DesiredSupplement> getDesiredSupplements() {
        if (desiredSupplements == null) {
            desiredSupplements = new ArrayList<DesiredSupplement>();
        }
        return this.desiredSupplements;
    }

    /**
     * Gets the value of the guestCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestCountryCode() {
        return guestCountryCode;
    }

    /**
     * Sets the value of the guestCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestCountryCode(String value) {
        this.guestCountryCode = value;
    }

}
