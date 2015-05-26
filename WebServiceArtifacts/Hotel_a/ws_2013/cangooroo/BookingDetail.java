
package ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{Cangooroo.WS_2013}BookingDetailBase">
 *       &lt;sequence>
 *         &lt;element name="Rooms" type="{Cangooroo.WS_2013}ArrayOfHotelBookingRoomResult" minOccurs="0"/>
 *         &lt;element name="Transfers" type="{Cangooroo.WS_2013}ArrayOfTransferBookingResult" minOccurs="0"/>
 *         &lt;element name="Tours" type="{Cangooroo.WS_2013}ArrayOfTourBookingResult" minOccurs="0"/>
 *         &lt;element name="Cars" type="{Cangooroo.WS_2013}ArrayOfRentACarBookingResult" minOccurs="0"/>
 *         &lt;element name="TrainTickets" type="{Cangooroo.WS_2013}ArrayOfTrainBookingResult" minOccurs="0"/>
 *         &lt;element name="TrainPass" type="{Cangooroo.WS_2013}ArrayOfTrainPassBookingResult" minOccurs="0"/>
 *         &lt;element name="Insurances" type="{Cangooroo.WS_2013}ArrayOfInsuranceBookingResult" minOccurs="0"/>
 *         &lt;element name="TravelPackage" type="{Cangooroo.WS_2013}ArrayOfTravelPackageBookingResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingDetail", propOrder = {
    "rooms",
    "transfers",
    "tours",
    "cars",
    "trainTickets",
    "trainPass",
    "insurances",
    "travelPackage"
})
public class BookingDetail
    extends BookingDetailBase
{

    @XmlElement(name = "Rooms")
    protected ArrayOfHotelBookingRoomResult rooms;
    @XmlElement(name = "Transfers")
    protected ArrayOfTransferBookingResult transfers;
    @XmlElement(name = "Tours")
    protected ArrayOfTourBookingResult tours;
    @XmlElement(name = "Cars")
    protected ArrayOfRentACarBookingResult cars;
    @XmlElement(name = "TrainTickets")
    protected ArrayOfTrainBookingResult trainTickets;
    @XmlElement(name = "TrainPass")
    protected ArrayOfTrainPassBookingResult trainPass;
    @XmlElement(name = "Insurances")
    protected ArrayOfInsuranceBookingResult insurances;
    @XmlElement(name = "TravelPackage")
    protected ArrayOfTravelPackageBookingResult travelPackage;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelBookingRoomResult }
     *     
     */
    public ArrayOfHotelBookingRoomResult getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelBookingRoomResult }
     *     
     */
    public void setRooms(ArrayOfHotelBookingRoomResult value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the transfers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferBookingResult }
     *     
     */
    public ArrayOfTransferBookingResult getTransfers() {
        return transfers;
    }

    /**
     * Sets the value of the transfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferBookingResult }
     *     
     */
    public void setTransfers(ArrayOfTransferBookingResult value) {
        this.transfers = value;
    }

    /**
     * Gets the value of the tours property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTourBookingResult }
     *     
     */
    public ArrayOfTourBookingResult getTours() {
        return tours;
    }

    /**
     * Sets the value of the tours property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTourBookingResult }
     *     
     */
    public void setTours(ArrayOfTourBookingResult value) {
        this.tours = value;
    }

    /**
     * Gets the value of the cars property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRentACarBookingResult }
     *     
     */
    public ArrayOfRentACarBookingResult getCars() {
        return cars;
    }

    /**
     * Sets the value of the cars property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRentACarBookingResult }
     *     
     */
    public void setCars(ArrayOfRentACarBookingResult value) {
        this.cars = value;
    }

    /**
     * Gets the value of the trainTickets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrainBookingResult }
     *     
     */
    public ArrayOfTrainBookingResult getTrainTickets() {
        return trainTickets;
    }

    /**
     * Sets the value of the trainTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrainBookingResult }
     *     
     */
    public void setTrainTickets(ArrayOfTrainBookingResult value) {
        this.trainTickets = value;
    }

    /**
     * Gets the value of the trainPass property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrainPassBookingResult }
     *     
     */
    public ArrayOfTrainPassBookingResult getTrainPass() {
        return trainPass;
    }

    /**
     * Sets the value of the trainPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrainPassBookingResult }
     *     
     */
    public void setTrainPass(ArrayOfTrainPassBookingResult value) {
        this.trainPass = value;
    }

    /**
     * Gets the value of the insurances property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsuranceBookingResult }
     *     
     */
    public ArrayOfInsuranceBookingResult getInsurances() {
        return insurances;
    }

    /**
     * Sets the value of the insurances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsuranceBookingResult }
     *     
     */
    public void setInsurances(ArrayOfInsuranceBookingResult value) {
        this.insurances = value;
    }

    /**
     * Gets the value of the travelPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTravelPackageBookingResult }
     *     
     */
    public ArrayOfTravelPackageBookingResult getTravelPackage() {
        return travelPackage;
    }

    /**
     * Sets the value of the travelPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTravelPackageBookingResult }
     *     
     */
    public void setTravelPackage(ArrayOfTravelPackageBookingResult value) {
        this.travelPackage = value;
    }

}
