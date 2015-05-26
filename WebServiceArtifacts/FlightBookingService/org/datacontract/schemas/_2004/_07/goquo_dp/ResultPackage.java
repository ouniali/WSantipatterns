
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingFailedProducts" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}BookedProducts" minOccurs="0"/>
 *         &lt;element name="FlightReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationEN" minOccurs="0"/>
 *         &lt;element name="FlightReservationSegmentsListResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfFlightReservationSegmentsEN" minOccurs="0"/>
 *         &lt;element name="FlightReservationSegmentsResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationSegmentsEN" minOccurs="0"/>
 *         &lt;element name="HotelReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfHotelReservationEN" minOccurs="0"/>
 *         &lt;element name="InsuranceReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfInsuranceReservationEN" minOccurs="0"/>
 *         &lt;element name="IsAllowedtoBookAgain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBookingSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCreditCardSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMethodCalled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultileg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPaymentFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTicketMailSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTicketingDeadlineFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTransationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultiLegFlightReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfFlightReservationEN" minOccurs="0"/>
 *         &lt;element name="Multileg_Flights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfMultilegFlightReservation" minOccurs="0"/>
 *         &lt;element name="PaymentFailedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfTourReservationEN" minOccurs="0"/>
 *         &lt;element name="TransferReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfTransferReservationEN" minOccurs="0"/>
 *         &lt;element name="UpdatedB2BAvailableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultPackage", propOrder = {
    "bookingFailedProducts",
    "flightReservationResult",
    "flightReservationSegmentsListResult",
    "flightReservationSegmentsResult",
    "hotelReservationResult",
    "insuranceReservationResult",
    "isAllowedtoBookAgain",
    "isBookingSuccess",
    "isCreditCardSuccess",
    "isMethodCalled",
    "isMultileg",
    "isPaymentFailed",
    "isTicketMailSend",
    "isTicketingDeadlineFailed",
    "isTransationSuccess",
    "multiLegFlightReservationResult",
    "multilegFlights",
    "paymentFailedMessage",
    "reservationStatus",
    "resultMessage",
    "tourReservationResult",
    "transferReservationResult",
    "updatedB2BAvailableAmount"
})
public class ResultPackage {

    @XmlElementRef(name = "BookingFailedProducts", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<BookedProducts> bookingFailedProducts;
    @XmlElementRef(name = "FlightReservationResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightReservationEN> flightReservationResult;
    @XmlElementRef(name = "FlightReservationSegmentsListResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightReservationSegmentsEN> flightReservationSegmentsListResult;
    @XmlElementRef(name = "FlightReservationSegmentsResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightReservationSegmentsEN> flightReservationSegmentsResult;
    @XmlElementRef(name = "HotelReservationResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelReservationEN> hotelReservationResult;
    @XmlElementRef(name = "InsuranceReservationResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInsuranceReservationEN> insuranceReservationResult;
    @XmlElement(name = "IsAllowedtoBookAgain")
    protected Boolean isAllowedtoBookAgain;
    @XmlElement(name = "IsBookingSuccess")
    protected Boolean isBookingSuccess;
    @XmlElement(name = "IsCreditCardSuccess")
    protected Boolean isCreditCardSuccess;
    @XmlElement(name = "IsMethodCalled")
    protected Boolean isMethodCalled;
    @XmlElement(name = "IsMultileg")
    protected Boolean isMultileg;
    @XmlElement(name = "IsPaymentFailed")
    protected Boolean isPaymentFailed;
    @XmlElement(name = "IsTicketMailSend")
    protected Boolean isTicketMailSend;
    @XmlElement(name = "IsTicketingDeadlineFailed")
    protected Boolean isTicketingDeadlineFailed;
    @XmlElement(name = "IsTransationSuccess")
    protected Boolean isTransationSuccess;
    @XmlElementRef(name = "MultiLegFlightReservationResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightReservationEN> multiLegFlightReservationResult;
    @XmlElementRef(name = "Multileg_Flights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMultilegFlightReservation> multilegFlights;
    @XmlElementRef(name = "PaymentFailedMessage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentFailedMessage;
    @XmlElement(name = "ReservationStatus")
    protected Integer reservationStatus;
    @XmlElementRef(name = "ResultMessage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultMessage;
    @XmlElementRef(name = "TourReservationResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTourReservationEN> tourReservationResult;
    @XmlElementRef(name = "TransferReservationResult", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransferReservationEN> transferReservationResult;
    @XmlElement(name = "UpdatedB2BAvailableAmount")
    protected BigDecimal updatedB2BAvailableAmount;

    /**
     * Gets the value of the bookingFailedProducts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BookedProducts }{@code >}
     *     
     */
    public JAXBElement<BookedProducts> getBookingFailedProducts() {
        return bookingFailedProducts;
    }

    /**
     * Sets the value of the bookingFailedProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BookedProducts }{@code >}
     *     
     */
    public void setBookingFailedProducts(JAXBElement<BookedProducts> value) {
        this.bookingFailedProducts = value;
    }

    /**
     * Gets the value of the flightReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}
     *     
     */
    public JAXBElement<FlightReservationEN> getFlightReservationResult() {
        return flightReservationResult;
    }

    /**
     * Sets the value of the flightReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}
     *     
     */
    public void setFlightReservationResult(JAXBElement<FlightReservationEN> value) {
        this.flightReservationResult = value;
    }

    /**
     * Gets the value of the flightReservationSegmentsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightReservationSegmentsEN> getFlightReservationSegmentsListResult() {
        return flightReservationSegmentsListResult;
    }

    /**
     * Sets the value of the flightReservationSegmentsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}
     *     
     */
    public void setFlightReservationSegmentsListResult(JAXBElement<ArrayOfFlightReservationSegmentsEN> value) {
        this.flightReservationSegmentsListResult = value;
    }

    /**
     * Gets the value of the flightReservationSegmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationSegmentsEN }{@code >}
     *     
     */
    public JAXBElement<FlightReservationSegmentsEN> getFlightReservationSegmentsResult() {
        return flightReservationSegmentsResult;
    }

    /**
     * Sets the value of the flightReservationSegmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationSegmentsEN }{@code >}
     *     
     */
    public void setFlightReservationSegmentsResult(JAXBElement<FlightReservationSegmentsEN> value) {
        this.flightReservationSegmentsResult = value;
    }

    /**
     * Gets the value of the hotelReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelReservationEN> getHotelReservationResult() {
        return hotelReservationResult;
    }

    /**
     * Sets the value of the hotelReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelReservationEN }{@code >}
     *     
     */
    public void setHotelReservationResult(JAXBElement<ArrayOfHotelReservationEN> value) {
        this.hotelReservationResult = value;
    }

    /**
     * Gets the value of the insuranceReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInsuranceReservationEN> getInsuranceReservationResult() {
        return insuranceReservationResult;
    }

    /**
     * Sets the value of the insuranceReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}
     *     
     */
    public void setInsuranceReservationResult(JAXBElement<ArrayOfInsuranceReservationEN> value) {
        this.insuranceReservationResult = value;
    }

    /**
     * Gets the value of the isAllowedtoBookAgain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowedtoBookAgain() {
        return isAllowedtoBookAgain;
    }

    /**
     * Sets the value of the isAllowedtoBookAgain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowedtoBookAgain(Boolean value) {
        this.isAllowedtoBookAgain = value;
    }

    /**
     * Gets the value of the isBookingSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBookingSuccess() {
        return isBookingSuccess;
    }

    /**
     * Sets the value of the isBookingSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBookingSuccess(Boolean value) {
        this.isBookingSuccess = value;
    }

    /**
     * Gets the value of the isCreditCardSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreditCardSuccess() {
        return isCreditCardSuccess;
    }

    /**
     * Sets the value of the isCreditCardSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreditCardSuccess(Boolean value) {
        this.isCreditCardSuccess = value;
    }

    /**
     * Gets the value of the isMethodCalled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMethodCalled() {
        return isMethodCalled;
    }

    /**
     * Sets the value of the isMethodCalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMethodCalled(Boolean value) {
        this.isMethodCalled = value;
    }

    /**
     * Gets the value of the isMultileg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultileg() {
        return isMultileg;
    }

    /**
     * Sets the value of the isMultileg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultileg(Boolean value) {
        this.isMultileg = value;
    }

    /**
     * Gets the value of the isPaymentFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentFailed() {
        return isPaymentFailed;
    }

    /**
     * Sets the value of the isPaymentFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentFailed(Boolean value) {
        this.isPaymentFailed = value;
    }

    /**
     * Gets the value of the isTicketMailSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTicketMailSend() {
        return isTicketMailSend;
    }

    /**
     * Sets the value of the isTicketMailSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTicketMailSend(Boolean value) {
        this.isTicketMailSend = value;
    }

    /**
     * Gets the value of the isTicketingDeadlineFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTicketingDeadlineFailed() {
        return isTicketingDeadlineFailed;
    }

    /**
     * Sets the value of the isTicketingDeadlineFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTicketingDeadlineFailed(Boolean value) {
        this.isTicketingDeadlineFailed = value;
    }

    /**
     * Gets the value of the isTransationSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTransationSuccess() {
        return isTransationSuccess;
    }

    /**
     * Sets the value of the isTransationSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTransationSuccess(Boolean value) {
        this.isTransationSuccess = value;
    }

    /**
     * Gets the value of the multiLegFlightReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightReservationEN> getMultiLegFlightReservationResult() {
        return multiLegFlightReservationResult;
    }

    /**
     * Sets the value of the multiLegFlightReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEN }{@code >}
     *     
     */
    public void setMultiLegFlightReservationResult(JAXBElement<ArrayOfFlightReservationEN> value) {
        this.multiLegFlightReservationResult = value;
    }

    /**
     * Gets the value of the multilegFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultilegFlightReservation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMultilegFlightReservation> getMultilegFlights() {
        return multilegFlights;
    }

    /**
     * Sets the value of the multilegFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultilegFlightReservation }{@code >}
     *     
     */
    public void setMultilegFlights(JAXBElement<ArrayOfMultilegFlightReservation> value) {
        this.multilegFlights = value;
    }

    /**
     * Gets the value of the paymentFailedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentFailedMessage() {
        return paymentFailedMessage;
    }

    /**
     * Sets the value of the paymentFailedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentFailedMessage(JAXBElement<String> value) {
        this.paymentFailedMessage = value;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReservationStatus(Integer value) {
        this.reservationStatus = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultMessage(JAXBElement<String> value) {
        this.resultMessage = value;
    }

    /**
     * Gets the value of the tourReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTourReservationEN> getTourReservationResult() {
        return tourReservationResult;
    }

    /**
     * Sets the value of the tourReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourReservationEN }{@code >}
     *     
     */
    public void setTourReservationResult(JAXBElement<ArrayOfTourReservationEN> value) {
        this.tourReservationResult = value;
    }

    /**
     * Gets the value of the transferReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransferReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransferReservationEN> getTransferReservationResult() {
        return transferReservationResult;
    }

    /**
     * Sets the value of the transferReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransferReservationEN }{@code >}
     *     
     */
    public void setTransferReservationResult(JAXBElement<ArrayOfTransferReservationEN> value) {
        this.transferReservationResult = value;
    }

    /**
     * Gets the value of the updatedB2BAvailableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpdatedB2BAvailableAmount() {
        return updatedB2BAvailableAmount;
    }

    /**
     * Sets the value of the updatedB2BAvailableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpdatedB2BAvailableAmount(BigDecimal value) {
        this.updatedB2BAvailableAmount = value;
    }

}
