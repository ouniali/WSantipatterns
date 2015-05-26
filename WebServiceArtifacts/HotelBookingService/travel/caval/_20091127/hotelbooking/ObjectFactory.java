
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the travel.caval._20091127.hotelbooking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAvailableHotels_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getAvailableHotels");
    private final static QName _GetDetailedValuation_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getDetailedValuation");
    private final static QName _GetAvailableHotelsResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getAvailableHotelsResponse");
    private final static QName _NotifyHotelBookingsResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "notifyHotelBookingsResponse");
    private final static QName _GetListOfBoardTypes_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getListOfBoardTypes");
    private final static QName _GetDetailedValuationResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getDetailedValuationResponse");
    private final static QName _NotifyHotelBookings_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "notifyHotelBookings");
    private final static QName _GetOffersListResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getOffersListResponse");
    private final static QName _GetEstablishmentDataSheetsResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getEstablishmentDataSheetsResponse");
    private final static QName _GetOffersList_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getOffersList");
    private final static QName _ConfirmHotelBooking_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "confirmHotelBooking");
    private final static QName _ConfirmHotelBookingResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "confirmHotelBookingResponse");
    private final static QName _GetListOfBoardTypesResponse_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getListOfBoardTypesResponse");
    private final static QName _GetEstablishmentDataSheets_QNAME = new QName("http://caval.travel/20091127/hotelBooking", "getEstablishmentDataSheets");
    private final static QName _CavalHotelBookingConfirmRQAgencyEmail_QNAME = new QName("", "agencyEmail");
    private final static QName _CavalHotelBookingConfirmRQArrivalFlightNumber_QNAME = new QName("", "arrivalFlightNumber");
    private final static QName _CavalHotelBookingConfirmRQPassengers_QNAME = new QName("", "passengers");
    private final static QName _CavalHotelBookingConfirmRQDepartureFlightTime_QNAME = new QName("", "departureFlightTime");
    private final static QName _CavalHotelBookingConfirmRQArrivalFlightTime_QNAME = new QName("", "arrivalFlightTime");
    private final static QName _CavalHotelBookingConfirmRQCommentForBookingDept_QNAME = new QName("", "commentForBookingDept");
    private final static QName _CavalHotelBookingConfirmRQGuestCountryCode_QNAME = new QName("", "guestCountryCode");
    private final static QName _CavalHotelBookingConfirmRQDepartureFlightNumber_QNAME = new QName("", "departureFlightNumber");
    private final static QName _CavalHotelBookingConfirmRQAgencyReference_QNAME = new QName("", "agencyReference");
    private final static QName _CavalHotelBookingConfirmRQCommentForHotel_QNAME = new QName("", "commentForHotel");
    private final static QName _CavalHotelBookingConfirmRQExpectedNetPrice_QNAME = new QName("", "expectedNetPrice");
    private final static QName _CavalHotelBookingConfirmRQTitular_QNAME = new QName("", "titular");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: travel.caval._20091127.hotelbooking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CavalHotelAvailabilityRQ }
     * 
     */
    public CavalHotelAvailabilityRQ createCavalHotelAvailabilityRQ() {
        return new CavalHotelAvailabilityRQ();
    }

    /**
     * Create an instance of {@link GetOffersList }
     * 
     */
    public GetOffersList createGetOffersList() {
        return new GetOffersList();
    }

    /**
     * Create an instance of {@link ConfirmHotelBooking }
     * 
     */
    public ConfirmHotelBooking createConfirmHotelBooking() {
        return new ConfirmHotelBooking();
    }

    /**
     * Create an instance of {@link GetEstablishmentDataSheetsResponse }
     * 
     */
    public GetEstablishmentDataSheetsResponse createGetEstablishmentDataSheetsResponse() {
        return new GetEstablishmentDataSheetsResponse();
    }

    /**
     * Create an instance of {@link GetEstablishmentDataSheets }
     * 
     */
    public GetEstablishmentDataSheets createGetEstablishmentDataSheets() {
        return new GetEstablishmentDataSheets();
    }

    /**
     * Create an instance of {@link ConfirmHotelBookingResponse }
     * 
     */
    public ConfirmHotelBookingResponse createConfirmHotelBookingResponse() {
        return new ConfirmHotelBookingResponse();
    }

    /**
     * Create an instance of {@link GetListOfBoardTypesResponse }
     * 
     */
    public GetListOfBoardTypesResponse createGetListOfBoardTypesResponse() {
        return new GetListOfBoardTypesResponse();
    }

    /**
     * Create an instance of {@link GetAvailableHotelsResponse }
     * 
     */
    public GetAvailableHotelsResponse createGetAvailableHotelsResponse() {
        return new GetAvailableHotelsResponse();
    }

    /**
     * Create an instance of {@link NotifyHotelBookingsResponse }
     * 
     */
    public NotifyHotelBookingsResponse createNotifyHotelBookingsResponse() {
        return new NotifyHotelBookingsResponse();
    }

    /**
     * Create an instance of {@link GetDetailedValuation }
     * 
     */
    public GetDetailedValuation createGetDetailedValuation() {
        return new GetDetailedValuation();
    }

    /**
     * Create an instance of {@link GetAvailableHotels }
     * 
     */
    public GetAvailableHotels createGetAvailableHotels() {
        return new GetAvailableHotels();
    }

    /**
     * Create an instance of {@link GetDetailedValuationResponse }
     * 
     */
    public GetDetailedValuationResponse createGetDetailedValuationResponse() {
        return new GetDetailedValuationResponse();
    }

    /**
     * Create an instance of {@link GetOffersListResponse }
     * 
     */
    public GetOffersListResponse createGetOffersListResponse() {
        return new GetOffersListResponse();
    }

    /**
     * Create an instance of {@link NotifyHotelBookings }
     * 
     */
    public NotifyHotelBookings createNotifyHotelBookings() {
        return new NotifyHotelBookings();
    }

    /**
     * Create an instance of {@link GetListOfBoardTypes }
     * 
     */
    public GetListOfBoardTypes createGetListOfBoardTypes() {
        return new GetListOfBoardTypes();
    }

    /**
     * Create an instance of {@link CavalHotelBookingValuationRQ }
     * 
     */
    public CavalHotelBookingValuationRQ createCavalHotelBookingValuationRQ() {
        return new CavalHotelBookingValuationRQ();
    }

    /**
     * Create an instance of {@link AvailRQOccupation }
     * 
     */
    public AvailRQOccupation createAvailRQOccupation() {
        return new AvailRQOccupation();
    }

    /**
     * Create an instance of {@link CavalHotelBookingValuationRS }
     * 
     */
    public CavalHotelBookingValuationRS createCavalHotelBookingValuationRS() {
        return new CavalHotelBookingValuationRS();
    }

    /**
     * Create an instance of {@link CavalHotelAvailabilityRS }
     * 
     */
    public CavalHotelAvailabilityRS createCavalHotelAvailabilityRS() {
        return new CavalHotelAvailabilityRS();
    }

    /**
     * Create an instance of {@link BoardType }
     * 
     */
    public BoardType createBoardType() {
        return new BoardType();
    }

    /**
     * Create an instance of {@link Occupation }
     * 
     */
    public Occupation createOccupation() {
        return new Occupation();
    }

    /**
     * Create an instance of {@link ZoneWithOffers }
     * 
     */
    public ZoneWithOffers createZoneWithOffers() {
        return new ZoneWithOffers();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link RoomOccupation }
     * 
     */
    public RoomOccupation createRoomOccupation() {
        return new RoomOccupation();
    }

    /**
     * Create an instance of {@link EstablishmentDataSheet }
     * 
     */
    public EstablishmentDataSheet createEstablishmentDataSheet() {
        return new EstablishmentDataSheet();
    }

    /**
     * Create an instance of {@link CavalGetEstablishmentDataSheetsRS }
     * 
     */
    public CavalGetEstablishmentDataSheetsRS createCavalGetEstablishmentDataSheetsRS() {
        return new CavalGetEstablishmentDataSheetsRS();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link CavalGetEstablishmentDataSheetsRQ }
     * 
     */
    public CavalGetEstablishmentDataSheetsRQ createCavalGetEstablishmentDataSheetsRQ() {
        return new CavalGetEstablishmentDataSheetsRQ();
    }

    /**
     * Create an instance of {@link CombinationPrice }
     * 
     */
    public CombinationPrice createCombinationPrice() {
        return new CombinationPrice();
    }

    /**
     * Create an instance of {@link ValuatedOccupation }
     * 
     */
    public ValuatedOccupation createValuatedOccupation() {
        return new ValuatedOccupation();
    }

    /**
     * Create an instance of {@link HotelBooking }
     * 
     */
    public HotelBooking createHotelBooking() {
        return new HotelBooking();
    }

    /**
     * Create an instance of {@link Classification }
     * 
     */
    public Classification createClassification() {
        return new Classification();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link FeaturesGroup }
     * 
     */
    public FeaturesGroup createFeaturesGroup() {
        return new FeaturesGroup();
    }

    /**
     * Create an instance of {@link Supplement }
     * 
     */
    public Supplement createSupplement() {
        return new Supplement();
    }

    /**
     * Create an instance of {@link AvailableEstablishment }
     * 
     */
    public AvailableEstablishment createAvailableEstablishment() {
        return new AvailableEstablishment();
    }

    /**
     * Create an instance of {@link MultilanguageText }
     * 
     */
    public MultilanguageText createMultilanguageText() {
        return new MultilanguageText();
    }

    /**
     * Create an instance of {@link CavalGetOffersListRS }
     * 
     */
    public CavalGetOffersListRS createCavalGetOffersListRS() {
        return new CavalGetOffersListRS();
    }

    /**
     * Create an instance of {@link DatesRange }
     * 
     */
    public DatesRange createDatesRange() {
        return new DatesRange();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link CavalGetOffersListRQ }
     * 
     */
    public CavalGetOffersListRQ createCavalGetOffersListRQ() {
        return new CavalGetOffersListRQ();
    }

    /**
     * Create an instance of {@link BoardPrice }
     * 
     */
    public BoardPrice createBoardPrice() {
        return new BoardPrice();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link DesiredSupplement }
     * 
     */
    public DesiredSupplement createDesiredSupplement() {
        return new DesiredSupplement();
    }

    /**
     * Create an instance of {@link ValuatedLine }
     * 
     */
    public ValuatedLine createValuatedLine() {
        return new ValuatedLine();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link CavalGetListOfBoardTypesRS }
     * 
     */
    public CavalGetListOfBoardTypesRS createCavalGetListOfBoardTypesRS() {
        return new CavalGetListOfBoardTypesRS();
    }

    /**
     * Create an instance of {@link CavalHotelBookingNotificationRS }
     * 
     */
    public CavalHotelBookingNotificationRS createCavalHotelBookingNotificationRS() {
        return new CavalHotelBookingNotificationRS();
    }

    /**
     * Create an instance of {@link CavalHotelBookingNotificationRQ }
     * 
     */
    public CavalHotelBookingNotificationRQ createCavalHotelBookingNotificationRQ() {
        return new CavalHotelBookingNotificationRQ();
    }

    /**
     * Create an instance of {@link CavalHotelBookingConfirmRQ }
     * 
     */
    public CavalHotelBookingConfirmRQ createCavalHotelBookingConfirmRQ() {
        return new CavalHotelBookingConfirmRQ();
    }

    /**
     * Create an instance of {@link CavalGetListOfBoardTypesRQ }
     * 
     */
    public CavalGetListOfBoardTypesRQ createCavalGetListOfBoardTypesRQ() {
        return new CavalGetListOfBoardTypesRQ();
    }

    /**
     * Create an instance of {@link CavalHotelBookingConfirmRS }
     * 
     */
    public CavalHotelBookingConfirmRS createCavalHotelBookingConfirmRS() {
        return new CavalHotelBookingConfirmRS();
    }

    /**
     * Create an instance of {@link OfferCategory }
     * 
     */
    public OfferCategory createOfferCategory() {
        return new OfferCategory();
    }

    /**
     * Create an instance of {@link EstablishmentRemark }
     * 
     */
    public EstablishmentRemark createEstablishmentRemark() {
        return new EstablishmentRemark();
    }

    /**
     * Create an instance of {@link CancellationCost }
     * 
     */
    public CancellationCost createCancellationCost() {
        return new CancellationCost();
    }

    /**
     * Create an instance of {@link CavalHotelAvailabilityRQ.CoverageArea }
     * 
     */
    public CavalHotelAvailabilityRQ.CoverageArea createCavalHotelAvailabilityRQCoverageArea() {
        return new CavalHotelAvailabilityRQ.CoverageArea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableHotels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getAvailableHotels")
    public JAXBElement<GetAvailableHotels> createGetAvailableHotels(GetAvailableHotels value) {
        return new JAXBElement<GetAvailableHotels>(_GetAvailableHotels_QNAME, GetAvailableHotels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailedValuation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getDetailedValuation")
    public JAXBElement<GetDetailedValuation> createGetDetailedValuation(GetDetailedValuation value) {
        return new JAXBElement<GetDetailedValuation>(_GetDetailedValuation_QNAME, GetDetailedValuation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableHotelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getAvailableHotelsResponse")
    public JAXBElement<GetAvailableHotelsResponse> createGetAvailableHotelsResponse(GetAvailableHotelsResponse value) {
        return new JAXBElement<GetAvailableHotelsResponse>(_GetAvailableHotelsResponse_QNAME, GetAvailableHotelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyHotelBookingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "notifyHotelBookingsResponse")
    public JAXBElement<NotifyHotelBookingsResponse> createNotifyHotelBookingsResponse(NotifyHotelBookingsResponse value) {
        return new JAXBElement<NotifyHotelBookingsResponse>(_NotifyHotelBookingsResponse_QNAME, NotifyHotelBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfBoardTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getListOfBoardTypes")
    public JAXBElement<GetListOfBoardTypes> createGetListOfBoardTypes(GetListOfBoardTypes value) {
        return new JAXBElement<GetListOfBoardTypes>(_GetListOfBoardTypes_QNAME, GetListOfBoardTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailedValuationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getDetailedValuationResponse")
    public JAXBElement<GetDetailedValuationResponse> createGetDetailedValuationResponse(GetDetailedValuationResponse value) {
        return new JAXBElement<GetDetailedValuationResponse>(_GetDetailedValuationResponse_QNAME, GetDetailedValuationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyHotelBookings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "notifyHotelBookings")
    public JAXBElement<NotifyHotelBookings> createNotifyHotelBookings(NotifyHotelBookings value) {
        return new JAXBElement<NotifyHotelBookings>(_NotifyHotelBookings_QNAME, NotifyHotelBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffersListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getOffersListResponse")
    public JAXBElement<GetOffersListResponse> createGetOffersListResponse(GetOffersListResponse value) {
        return new JAXBElement<GetOffersListResponse>(_GetOffersListResponse_QNAME, GetOffersListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstablishmentDataSheetsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getEstablishmentDataSheetsResponse")
    public JAXBElement<GetEstablishmentDataSheetsResponse> createGetEstablishmentDataSheetsResponse(GetEstablishmentDataSheetsResponse value) {
        return new JAXBElement<GetEstablishmentDataSheetsResponse>(_GetEstablishmentDataSheetsResponse_QNAME, GetEstablishmentDataSheetsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getOffersList")
    public JAXBElement<GetOffersList> createGetOffersList(GetOffersList value) {
        return new JAXBElement<GetOffersList>(_GetOffersList_QNAME, GetOffersList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmHotelBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "confirmHotelBooking")
    public JAXBElement<ConfirmHotelBooking> createConfirmHotelBooking(ConfirmHotelBooking value) {
        return new JAXBElement<ConfirmHotelBooking>(_ConfirmHotelBooking_QNAME, ConfirmHotelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmHotelBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "confirmHotelBookingResponse")
    public JAXBElement<ConfirmHotelBookingResponse> createConfirmHotelBookingResponse(ConfirmHotelBookingResponse value) {
        return new JAXBElement<ConfirmHotelBookingResponse>(_ConfirmHotelBookingResponse_QNAME, ConfirmHotelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfBoardTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getListOfBoardTypesResponse")
    public JAXBElement<GetListOfBoardTypesResponse> createGetListOfBoardTypesResponse(GetListOfBoardTypesResponse value) {
        return new JAXBElement<GetListOfBoardTypesResponse>(_GetListOfBoardTypesResponse_QNAME, GetListOfBoardTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstablishmentDataSheets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caval.travel/20091127/hotelBooking", name = "getEstablishmentDataSheets")
    public JAXBElement<GetEstablishmentDataSheets> createGetEstablishmentDataSheets(GetEstablishmentDataSheets value) {
        return new JAXBElement<GetEstablishmentDataSheets>(_GetEstablishmentDataSheets_QNAME, GetEstablishmentDataSheets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyEmail", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQAgencyEmail(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQAgencyEmail_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arrivalFlightNumber", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQArrivalFlightNumber(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQArrivalFlightNumber_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Passenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "passengers", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<Passenger> createCavalHotelBookingConfirmRQPassengers(Passenger value) {
        return new JAXBElement<Passenger>(_CavalHotelBookingConfirmRQPassengers_QNAME, Passenger.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "departureFlightTime", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQDepartureFlightTime(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQDepartureFlightTime_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arrivalFlightTime", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQArrivalFlightTime(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQArrivalFlightTime_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "commentForBookingDept", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQCommentForBookingDept(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQCommentForBookingDept_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "guestCountryCode", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQGuestCountryCode(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQGuestCountryCode_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "departureFlightNumber", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQDepartureFlightNumber(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQDepartureFlightNumber_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agencyReference", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQAgencyReference(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQAgencyReference_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "commentForHotel", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQCommentForHotel(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQCommentForHotel_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expectedNetPrice", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<Amount> createCavalHotelBookingConfirmRQExpectedNetPrice(Amount value) {
        return new JAXBElement<Amount>(_CavalHotelBookingConfirmRQExpectedNetPrice_QNAME, Amount.class, CavalHotelBookingConfirmRQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "titular", scope = CavalHotelBookingConfirmRQ.class)
    public JAXBElement<String> createCavalHotelBookingConfirmRQTitular(String value) {
        return new JAXBElement<String>(_CavalHotelBookingConfirmRQTitular_QNAME, String.class, CavalHotelBookingConfirmRQ.class, value);
    }

}
