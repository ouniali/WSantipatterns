
package org.opentravel.ota._2003._05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opentravel.ota._2003._05 package. 
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

    private final static QName _TPAExtensions_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions");
    private final static QName _OTAHotelAvailNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelAvailNotifRS");
    private final static QName _OTAHotelRateAmountNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelRateAmountNotifRS");
    private final static QName _ParagraphTypeImage_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Image");
    private final static QName _ParagraphTypeURL_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "URL");
    private final static QName _ParagraphTypeText_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Text");
    private final static QName _ParagraphTypeListItem_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ListItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opentravel.ota._2003._05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAVehRetResRQ }
     * 
     */
    public OTAVehRetResRQ createOTAVehRetResRQ() {
        return new OTAVehRetResRQ();
    }

    /**
     * Create an instance of {@link OTAHotelRateAmountNotifRQ }
     * 
     */
    public OTAHotelRateAmountNotifRQ createOTAHotelRateAmountNotifRQ() {
        return new OTAHotelRateAmountNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRQ }
     * 
     */
    public OTAHotelAvailNotifRQ createOTAHotelAvailNotifRQ() {
        return new OTAHotelAvailNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRQ }
     * 
     */
    public OTAHotelAvailRQ createOTAHotelAvailRQ() {
        return new OTAHotelAvailRQ();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS }
     * 
     */
    public OTAHotelAvailRS createOTAHotelAvailRS() {
        return new OTAHotelAvailRS();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType }
     * 
     */
    public OriginDestinationInformationType createOriginDestinationInformationType() {
        return new OriginDestinationInformationType();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link TravelerInfoType }
     * 
     */
    public TravelerInfoType createTravelerInfoType() {
        return new TravelerInfoType();
    }

    /**
     * Create an instance of {@link AirTravelerType }
     * 
     */
    public AirTravelerType createAirTravelerType() {
        return new AirTravelerType();
    }

    /**
     * Create an instance of {@link TravelerInfoType.AirTraveler }
     * 
     */
    public TravelerInfoType.AirTraveler createTravelerInfoTypeAirTraveler() {
        return new TravelerInfoType.AirTraveler();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType }
     * 
     */
    public SpecialReqDetailsType createSpecialReqDetailsType() {
        return new SpecialReqDetailsType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialRemarks }
     * 
     */
    public SpecialReqDetailsType.SpecialRemarks createSpecialReqDetailsTypeSpecialRemarks() {
        return new SpecialReqDetailsType.SpecialRemarks();
    }

    /**
     * Create an instance of {@link SpecialRemarkType }
     * 
     */
    public SpecialRemarkType createSpecialRemarkType() {
        return new SpecialRemarkType();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.AuthorizedViewers }
     * 
     */
    public SpecialRemarkType.AuthorizedViewers createSpecialRemarkTypeAuthorizedViewers() {
        return new SpecialRemarkType.AuthorizedViewers();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.Remarks }
     * 
     */
    public SpecialReqDetailsType.Remarks createSpecialReqDetailsTypeRemarks() {
        return new SpecialReqDetailsType.Remarks();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.OtherServiceInformations }
     * 
     */
    public SpecialReqDetailsType.OtherServiceInformations createSpecialReqDetailsTypeOtherServiceInformations() {
        return new SpecialReqDetailsType.OtherServiceInformations();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType }
     * 
     */
    public OtherServiceInfoType createOtherServiceInfoType() {
        return new OtherServiceInfoType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialServiceRequests }
     * 
     */
    public SpecialReqDetailsType.SpecialServiceRequests createSpecialReqDetailsTypeSpecialServiceRequests() {
        return new SpecialReqDetailsType.SpecialServiceRequests();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SeatRequests }
     * 
     */
    public SpecialReqDetailsType.SeatRequests createSpecialReqDetailsTypeSeatRequests() {
        return new SpecialReqDetailsType.SeatRequests();
    }

    /**
     * Create an instance of {@link OperationScheduleType }
     * 
     */
    public OperationScheduleType createOperationScheduleType() {
        return new OperationScheduleType();
    }

    /**
     * Create an instance of {@link OperationScheduleType.OperationTimes }
     * 
     */
    public OperationScheduleType.OperationTimes createOperationScheduleTypeOperationTimes() {
        return new OperationScheduleType.OperationTimes();
    }

    /**
     * Create an instance of {@link FeaturesType }
     * 
     */
    public FeaturesType createFeaturesType() {
        return new FeaturesType();
    }

    /**
     * Create an instance of {@link FeaturesType.Feature }
     * 
     */
    public FeaturesType.Feature createFeaturesTypeFeature() {
        return new FeaturesType.Feature();
    }

    /**
     * Create an instance of {@link PoliciesType }
     * 
     */
    public PoliciesType createPoliciesType() {
        return new PoliciesType();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy }
     * 
     */
    public PoliciesType.Policy createPoliciesTypePolicy() {
        return new PoliciesType.Policy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy createPoliciesTypePolicyCommissionPolicy() {
        return new PoliciesType.Policy.CommissionPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.StayRequirements }
     * 
     */
    public PoliciesType.Policy.StayRequirements createPoliciesTypePolicyStayRequirements() {
        return new PoliciesType.Policy.StayRequirements();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PetsPolicies }
     * 
     */
    public PoliciesType.Policy.PetsPolicies createPoliciesTypePolicyPetsPolicies() {
        return new PoliciesType.Policy.PetsPolicies();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.TaxPolicies }
     * 
     */
    public PoliciesType.Policy.TaxPolicies createPoliciesTypePolicyTaxPolicies() {
        return new PoliciesType.Policy.TaxPolicies();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CheckoutCharges }
     * 
     */
    public PoliciesType.Policy.CheckoutCharges createPoliciesTypePolicyCheckoutCharges() {
        return new PoliciesType.Policy.CheckoutCharges();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfoCodes }
     * 
     */
    public PoliciesType.Policy.PolicyInfoCodes createPoliciesTypePolicyPolicyInfoCodes() {
        return new PoliciesType.Policy.PolicyInfoCodes();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType }
     * 
     */
    public RequiredPaymentsType createRequiredPaymentsType() {
        return new RequiredPaymentsType();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment createRequiredPaymentsTypeGuaranteePayment() {
        return new RequiredPaymentsType.GuaranteePayment();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail }
     * 
     */
    public PkgInvoiceDetail createPkgInvoiceDetail() {
        return new PkgInvoiceDetail();
    }

    /**
     * Create an instance of {@link AccessesType }
     * 
     */
    public AccessesType createAccessesType() {
        return new AccessesType();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType }
     * 
     */
    public AirItineraryPricingInfoType createAirItineraryPricingInfoType() {
        return new AirItineraryPricingInfoType();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos createAirItineraryPricingInfoTypeFareInfos() {
        return new AirItineraryPricingInfoType.FareInfos();
    }

    /**
     * Create an instance of {@link FareInfoType }
     * 
     */
    public FareInfoType createFareInfoType() {
        return new FareInfoType();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo }
     * 
     */
    public FareInfoType.FareInfo createFareInfoTypeFareInfo() {
        return new FareInfoType.FareInfo();
    }

    /**
     * Create an instance of {@link RuleInfoType }
     * 
     */
    public RuleInfoType createRuleInfoType() {
        return new RuleInfoType();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules }
     * 
     */
    public RuleInfoType.ResTicketingRules createRuleInfoTypeResTicketingRules() {
        return new RuleInfoType.ResTicketingRules();
    }

    /**
     * Create an instance of {@link AdvResTicketingType }
     * 
     */
    public AdvResTicketingType createAdvResTicketingType() {
        return new AdvResTicketingType();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link FareType.Discounts }
     * 
     */
    public FareType.Discounts createFareTypeDiscounts() {
        return new FareType.Discounts();
    }

    /**
     * Create an instance of {@link FareType.ExchangeInfo }
     * 
     */
    public FareType.ExchangeInfo createFareTypeExchangeInfo() {
        return new FareType.ExchangeInfo();
    }

    /**
     * Create an instance of {@link AddressesType }
     * 
     */
    public AddressesType createAddressesType() {
        return new AddressesType();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType }
     * 
     */
    public ItineraryItemResponseType createItineraryItemResponseType() {
        return new ItineraryItemResponseType();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType }
     * 
     */
    public VehicleRentalCoreType createVehicleRentalCoreType() {
        return new VehicleRentalCoreType();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation }
     * 
     */
    public ItineraryItemResponseType.Accommodation createItineraryItemResponseTypeAccommodation() {
        return new ItineraryItemResponseType.Accommodation();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles createItineraryItemResponseTypeAccommodationRoomProfiles() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles();
    }

    /**
     * Create an instance of {@link RoomProfileType }
     * 
     */
    public RoomProfileType createRoomProfileType() {
        return new RoomProfileType();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile createItineraryItemResponseTypeAccommodationRoomProfilesRoomProfile() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices createItineraryItemResponseTypeAccommodationRoomProfilesRoomProfilePrices() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices();
    }

    /**
     * Create an instance of {@link FacilityInfoType }
     * 
     */
    public FacilityInfoType createFacilityInfoType() {
        return new FacilityInfoType();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms }
     * 
     */
    public FacilityInfoType.GuestRooms createFacilityInfoTypeGuestRooms() {
        return new FacilityInfoType.GuestRooms();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom createFacilityInfoTypeGuestRoomsGuestRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.Amenities createFacilityInfoTypeGuestRoomsGuestRoomAmenities() {
        return new FacilityInfoType.GuestRooms.GuestRoom.Amenities();
    }

    /**
     * Create an instance of {@link MeetingRoomsType }
     * 
     */
    public MeetingRoomsType createMeetingRoomsType() {
        return new MeetingRoomsType();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms }
     * 
     */
    public FacilityInfoType.MeetingRooms createFacilityInfoTypeMeetingRooms() {
        return new FacilityInfoType.MeetingRooms();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom }
     * 
     */
    public MeetingRoomsType.MeetingRoom createMeetingRoomsTypeMeetingRoom() {
        return new MeetingRoomsType.MeetingRoom();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType }
     * 
     */
    public BasicPropertyInfoType createBasicPropertyInfoType() {
        return new BasicPropertyInfoType();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.ContactNumbers }
     * 
     */
    public BasicPropertyInfoType.ContactNumbers createBasicPropertyInfoTypeContactNumbers() {
        return new BasicPropertyInfoType.ContactNumbers();
    }

    /**
     * Create an instance of {@link PkgPassengerListItem }
     * 
     */
    public PkgPassengerListItem createPkgPassengerListItem() {
        return new PkgPassengerListItem();
    }

    /**
     * Create an instance of {@link VideoDescriptionType }
     * 
     */
    public VideoDescriptionType createVideoDescriptionType() {
        return new VideoDescriptionType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType }
     * 
     */
    public VehicleLocationAdditionalDetailsType createVehicleLocationAdditionalDetailsType() {
        return new VehicleLocationAdditionalDetailsType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations }
     * 
     */
    public VehicleLocationAdditionalDetailsType.OneWayDropLocations createVehicleLocationAdditionalDetailsTypeOneWayDropLocations() {
        return new VehicleLocationAdditionalDetailsType.OneWayDropLocations();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle createVehicleLocationAdditionalDetailsTypeShuttle() {
        return new VehicleLocationAdditionalDetailsType.Shuttle();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos createVehicleLocationAdditionalDetailsTypeShuttleShuttleInfos() {
        return new VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType }
     * 
     */
    public FlightSegmentBaseType createFlightSegmentBaseType() {
        return new FlightSegmentBaseType();
    }

    /**
     * Create an instance of {@link ItineraryItemRequestType }
     * 
     */
    public ItineraryItemRequestType createItineraryItemRequestType() {
        return new ItineraryItemRequestType();
    }

    /**
     * Create an instance of {@link PaymentFormType }
     * 
     */
    public PaymentFormType createPaymentFormType() {
        return new PaymentFormType();
    }

    /**
     * Create an instance of {@link PaymentResponseType }
     * 
     */
    public PaymentResponseType createPaymentResponseType() {
        return new PaymentResponseType();
    }

    /**
     * Create an instance of {@link PaymentFormType.Ticket }
     * 
     */
    public PaymentFormType.Ticket createPaymentFormTypeTicket() {
        return new PaymentFormType.Ticket();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption }
     * 
     */
    public PaymentFormType.LoyaltyRedemption createPaymentFormTypeLoyaltyRedemption() {
        return new PaymentFormType.LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link DateTimeSpanType }
     * 
     */
    public DateTimeSpanType createDateTimeSpanType() {
        return new DateTimeSpanType();
    }

    /**
     * Create an instance of {@link InvBlockRoomType }
     * 
     */
    public InvBlockRoomType createInvBlockRoomType() {
        return new InvBlockRoomType();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RatePlans }
     * 
     */
    public InvBlockRoomType.RatePlans createInvBlockRoomTypeRatePlans() {
        return new InvBlockRoomType.RatePlans();
    }

    /**
     * Create an instance of {@link RateUploadType }
     * 
     */
    public RateUploadType createRateUploadType() {
        return new RateUploadType();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RatePlans.RatePlan }
     * 
     */
    public InvBlockRoomType.RatePlans.RatePlan createInvBlockRoomTypeRatePlansRatePlan() {
        return new InvBlockRoomType.RatePlans.RatePlan();
    }

    /**
     * Create an instance of {@link RateUploadType.AdditionalGuestAmounts }
     * 
     */
    public RateUploadType.AdditionalGuestAmounts createRateUploadTypeAdditionalGuestAmounts() {
        return new RateUploadType.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link RateUploadType.BaseByGuestAmts }
     * 
     */
    public RateUploadType.BaseByGuestAmts createRateUploadTypeBaseByGuestAmts() {
        return new RateUploadType.BaseByGuestAmts();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RoomTypeAllocations }
     * 
     */
    public InvBlockRoomType.RoomTypeAllocations createInvBlockRoomTypeRoomTypeAllocations() {
        return new InvBlockRoomType.RoomTypeAllocations();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType }
     * 
     */
    public TravelerInfoSummaryType createTravelerInfoSummaryType() {
        return new TravelerInfoSummaryType();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType }
     * 
     */
    public PriceRequestInformationType createPriceRequestInformationType() {
        return new PriceRequestInformationType();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation createTravelerInfoSummaryTypePriceRequestInformation() {
        return new TravelerInfoSummaryType.PriceRequestInformation();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing createTravelerInfoSummaryTypePriceRequestInformationDiscountPricing() {
        return new TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing();
    }

    /**
     * Create an instance of {@link CabinOptionType }
     * 
     */
    public CabinOptionType createCabinOptionType() {
        return new CabinOptionType();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType }
     * 
     */
    public OriginDestinationOptionType createOriginDestinationOptionType() {
        return new OriginDestinationOptionType();
    }

    /**
     * Create an instance of {@link FlightSegmentType }
     * 
     */
    public FlightSegmentType createFlightSegmentType() {
        return new FlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType }
     * 
     */
    public BookFlightSegmentType createBookFlightSegmentType() {
        return new BookFlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvails }
     * 
     */
    public BookFlightSegmentType.BookingClassAvails createBookFlightSegmentTypeBookingClassAvails() {
        return new BookFlightSegmentType.BookingClassAvails();
    }

    /**
     * Create an instance of {@link AreaInfoType }
     * 
     */
    public AreaInfoType createAreaInfoType() {
        return new AreaInfoType();
    }

    /**
     * Create an instance of {@link AreaInfoType.OtherHotels }
     * 
     */
    public AreaInfoType.OtherHotels createAreaInfoTypeOtherHotels() {
        return new AreaInfoType.OtherHotels();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations }
     * 
     */
    public AreaInfoType.Recreations createAreaInfoTypeRecreations() {
        return new AreaInfoType.Recreations();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation }
     * 
     */
    public AreaInfoType.Recreations.Recreation createAreaInfoTypeRecreationsRecreation() {
        return new AreaInfoType.Recreations.Recreation();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.RecreationDetails }
     * 
     */
    public AreaInfoType.Recreations.Recreation.RecreationDetails createAreaInfoTypeRecreationsRecreationRecreationDetails() {
        return new AreaInfoType.Recreations.Recreation.RecreationDetails();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions }
     * 
     */
    public AreaInfoType.Attractions createAreaInfoTypeAttractions() {
        return new AreaInfoType.Attractions();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction }
     * 
     */
    public AreaInfoType.Attractions.Attraction createAreaInfoTypeAttractionsAttraction() {
        return new AreaInfoType.Attractions.Attraction();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link RefPointsType }
     * 
     */
    public RefPointsType createRefPointsType() {
        return new RefPointsType();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType }
     * 
     */
    public RatePlanCandidatesType createRatePlanCandidatesType() {
        return new RatePlanCandidatesType();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate createRatePlanCandidatesTypeRatePlanCandidate() {
        return new RatePlanCandidatesType.RatePlanCandidate();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.HotelRefs createRatePlanCandidatesTypeRatePlanCandidateHotelRefs() {
        return new RatePlanCandidatesType.RatePlanCandidate.HotelRefs();
    }

    /**
     * Create an instance of {@link PaymentDetailType }
     * 
     */
    public PaymentDetailType createPaymentDetailType() {
        return new PaymentDetailType();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType }
     * 
     */
    public VehicleAdditionalDriverRequirementsType createVehicleAdditionalDriverRequirementsType() {
        return new VehicleAdditionalDriverRequirementsType();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos createVehicleAdditionalDriverRequirementsTypeAddlDriverInfos() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles createVehicleAdditionalDriverRequirementsTypeAddlDriverInfosVehicles() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles();
    }

    /**
     * Create an instance of {@link VehicleCoreType }
     * 
     */
    public VehicleCoreType createVehicleCoreType() {
        return new VehicleCoreType();
    }

    /**
     * Create an instance of {@link SailingInfoType }
     * 
     */
    public SailingInfoType createSailingInfoType() {
        return new SailingInfoType();
    }

    /**
     * Create an instance of {@link SailingBaseType }
     * 
     */
    public SailingBaseType createSailingBaseType() {
        return new SailingBaseType();
    }

    /**
     * Create an instance of {@link AirlinePrefType }
     * 
     */
    public AirlinePrefType createAirlinePrefType() {
        return new AirlinePrefType();
    }

    /**
     * Create an instance of {@link AirlinePrefType.AccountInformation }
     * 
     */
    public AirlinePrefType.AccountInformation createAirlinePrefTypeAccountInformation() {
        return new AirlinePrefType.AccountInformation();
    }

    /**
     * Create an instance of {@link AirlinePrefType.TourCodePref }
     * 
     */
    public AirlinePrefType.TourCodePref createAirlinePrefTypeTourCodePref() {
        return new AirlinePrefType.TourCodePref();
    }

    /**
     * Create an instance of {@link CruiseReservationType }
     * 
     */
    public CruiseReservationType createCruiseReservationType() {
        return new CruiseReservationType();
    }

    /**
     * Create an instance of {@link CruiseReservationType.PaymentsDue }
     * 
     */
    public CruiseReservationType.PaymentsDue createCruiseReservationTypePaymentsDue() {
        return new CruiseReservationType.PaymentsDue();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType }
     * 
     */
    public ItemSearchCriterionType createItemSearchCriterionType() {
        return new ItemSearchCriterionType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType }
     * 
     */
    public CabinAvailabilityType createCabinAvailabilityType() {
        return new CabinAvailabilityType();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType }
     * 
     */
    public VehicleRentalTransactionType createVehicleRentalTransactionType() {
        return new VehicleRentalTransactionType();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PricedEquips }
     * 
     */
    public VehicleRentalTransactionType.PricedEquips createVehicleRentalTransactionTypePricedEquips() {
        return new VehicleRentalTransactionType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PricedEquips.PricedEquip }
     * 
     */
    public VehicleRentalTransactionType.PricedEquips.PricedEquip createVehicleRentalTransactionTypePricedEquipsPricedEquip() {
        return new VehicleRentalTransactionType.PricedEquips.PricedEquip();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link TransportInfoType }
     * 
     */
    public TransportInfoType createTransportInfoType() {
        return new TransportInfoType();
    }

    /**
     * Create an instance of {@link AccommodationInfoType }
     * 
     */
    public AccommodationInfoType createAccommodationInfoType() {
        return new AccommodationInfoType();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType }
     * 
     */
    public PkgAirSegmentType createPkgAirSegmentType() {
        return new PkgAirSegmentType();
    }

    /**
     * Create an instance of {@link RowDetailsType }
     * 
     */
    public RowDetailsType createRowDetailsType() {
        return new RowDetailsType();
    }

    /**
     * Create an instance of {@link RowDetailsType.AirSeats }
     * 
     */
    public RowDetailsType.AirSeats createRowDetailsTypeAirSeats() {
        return new RowDetailsType.AirSeats();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link CustomerType.PaymentForm }
     * 
     */
    public CustomerType.PaymentForm createCustomerTypePaymentForm() {
        return new CustomerType.PaymentForm();
    }

    /**
     * Create an instance of {@link OrdersType }
     * 
     */
    public OrdersType createOrdersType() {
        return new OrdersType();
    }

    /**
     * Create an instance of {@link OrdersType.Order }
     * 
     */
    public OrdersType.Order createOrdersTypeOrder() {
        return new OrdersType.Order();
    }

    /**
     * Create an instance of {@link OrdersType.Order.Products }
     * 
     */
    public OrdersType.Order.Products createOrdersTypeOrderProducts() {
        return new OrdersType.Order.Products();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType }
     * 
     */
    public VehicleRentalRateType createVehicleRentalRateType() {
        return new VehicleRentalRateType();
    }

    /**
     * Create an instance of {@link RateQualifierType }
     * 
     */
    public RateQualifierType createRateQualifierType() {
        return new RateQualifierType();
    }

    /**
     * Create an instance of {@link RateQualifierType.RateComments }
     * 
     */
    public RateQualifierType.RateComments createRateQualifierTypeRateComments() {
        return new RateQualifierType.RateComments();
    }

    /**
     * Create an instance of {@link ProductDescriptionsType }
     * 
     */
    public ProductDescriptionsType createProductDescriptionsType() {
        return new ProductDescriptionsType();
    }

    /**
     * Create an instance of {@link RateRulesType }
     * 
     */
    public RateRulesType createRateRulesType() {
        return new RateRulesType();
    }

    /**
     * Create an instance of {@link RateRulesType.CancelPenaltyInfo }
     * 
     */
    public RateRulesType.CancelPenaltyInfo createRateRulesTypeCancelPenaltyInfo() {
        return new RateRulesType.CancelPenaltyInfo();
    }

    /**
     * Create an instance of {@link RateRulesType.PaymentRules }
     * 
     */
    public RateRulesType.PaymentRules createRateRulesTypePaymentRules() {
        return new RateRulesType.PaymentRules();
    }

    /**
     * Create an instance of {@link RateRulesType.PaymentRules.AcceptablePayments }
     * 
     */
    public RateRulesType.PaymentRules.AcceptablePayments createRateRulesTypePaymentRulesAcceptablePayments() {
        return new RateRulesType.PaymentRules.AcceptablePayments();
    }

    /**
     * Create an instance of {@link RateRulesType.PickupReturnRules }
     * 
     */
    public RateRulesType.PickupReturnRules createRateRulesTypePickupReturnRules() {
        return new RateRulesType.PickupReturnRules();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType }
     * 
     */
    public OffLocationServiceCoreType createOffLocationServiceCoreType() {
        return new OffLocationServiceCoreType();
    }

    /**
     * Create an instance of {@link DestinationSystemCodesType }
     * 
     */
    public DestinationSystemCodesType createDestinationSystemCodesType() {
        return new DestinationSystemCodesType();
    }

    /**
     * Create an instance of {@link SellableProductsType }
     * 
     */
    public SellableProductsType createSellableProductsType() {
        return new SellableProductsType();
    }

    /**
     * Create an instance of {@link SellableProductsType.SellableProduct }
     * 
     */
    public SellableProductsType.SellableProduct createSellableProductsTypeSellableProduct() {
        return new SellableProductsType.SellableProduct();
    }

    /**
     * Create an instance of {@link SellableProductsType.SellableProduct.DestinationSystemCodes }
     * 
     */
    public SellableProductsType.SellableProduct.DestinationSystemCodes createSellableProductsTypeSellableProductDestinationSystemCodes() {
        return new SellableProductsType.SellableProduct.DestinationSystemCodes();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType }
     * 
     */
    public VehicleAvailCoreType createVehicleAvailCoreType() {
        return new VehicleAvailCoreType();
    }

    /**
     * Create an instance of {@link RecipientInfosType }
     * 
     */
    public RecipientInfosType createRecipientInfosType() {
        return new RecipientInfosType();
    }

    /**
     * Create an instance of {@link RecipientInfosType.RecipientInfo }
     * 
     */
    public RecipientInfosType.RecipientInfo createRecipientInfosTypeRecipientInfo() {
        return new RecipientInfosType.RecipientInfo();
    }

    /**
     * Create an instance of {@link CommonPrefType }
     * 
     */
    public CommonPrefType createCommonPrefType() {
        return new CommonPrefType();
    }

    /**
     * Create an instance of {@link CostingItemType }
     * 
     */
    public CostingItemType createCostingItemType() {
        return new CostingItemType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType }
     * 
     */
    public VehicleAvailRQCoreType createVehicleAvailRQCoreType() {
        return new VehicleAvailRQCoreType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.SpecialEquipPrefs }
     * 
     */
    public VehicleAvailRQCoreType.SpecialEquipPrefs createVehicleAvailRQCoreTypeSpecialEquipPrefs() {
        return new VehicleAvailRQCoreType.SpecialEquipPrefs();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.VehPrefs }
     * 
     */
    public VehicleAvailRQCoreType.VehPrefs createVehicleAvailRQCoreTypeVehPrefs() {
        return new VehicleAvailRQCoreType.VehPrefs();
    }

    /**
     * Create an instance of {@link VehiclePrefType }
     * 
     */
    public VehiclePrefType createVehiclePrefType() {
        return new VehiclePrefType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.VendorPrefs }
     * 
     */
    public VehicleAvailRQCoreType.VendorPrefs createVehicleAvailRQCoreTypeVendorPrefs() {
        return new VehicleAvailRQCoreType.VendorPrefs();
    }

    /**
     * Create an instance of {@link RoomStayType }
     * 
     */
    public RoomStayType createRoomStayType() {
        return new RoomStayType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates }
     * 
     */
    public RoomStayType.RoomRates createRoomStayTypeRoomRates() {
        return new RoomStayType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomRateType }
     * 
     */
    public RoomRateType createRoomRateType() {
        return new RoomRateType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate }
     * 
     */
    public RoomStayType.RoomRates.RoomRate createRoomStayTypeRoomRatesRoomRate() {
        return new RoomStayType.RoomRates.RoomRate();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.GuestCounts }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.GuestCounts createRoomStayTypeRoomRatesRoomRateGuestCounts() {
        return new RoomStayType.RoomRates.RoomRate.GuestCounts();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.Restrictions }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.Restrictions createRoomStayTypeRoomRatesRoomRateRestrictions() {
        return new RoomStayType.RoomRates.RoomRate.Restrictions();
    }

    /**
     * Create an instance of {@link RoomRateType.Features }
     * 
     */
    public RoomRateType.Features createRoomRateTypeFeatures() {
        return new RoomRateType.Features();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentBaseType }
     * 
     */
    public PkgFlightSegmentBaseType createPkgFlightSegmentBaseType() {
        return new PkgFlightSegmentBaseType();
    }

    /**
     * Create an instance of {@link HotelRoomListType }
     * 
     */
    public HotelRoomListType createHotelRoomListType() {
        return new HotelRoomListType();
    }

    /**
     * Create an instance of {@link HotelRoomListType.RoomStays }
     * 
     */
    public HotelRoomListType.RoomStays createHotelRoomListTypeRoomStays() {
        return new HotelRoomListType.RoomStays();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterContact }
     * 
     */
    public HotelRoomListType.MasterContact createHotelRoomListTypeMasterContact() {
        return new HotelRoomListType.MasterContact();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests }
     * 
     */
    public HotelRoomListType.Guests createHotelRoomListTypeGuests() {
        return new HotelRoomListType.Guests();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests.Guest }
     * 
     */
    public HotelRoomListType.Guests.Guest createHotelRoomListTypeGuestsGuest() {
        return new HotelRoomListType.Guests.Guest();
    }

    /**
     * Create an instance of {@link HotelPaymentFormType }
     * 
     */
    public HotelPaymentFormType createHotelPaymentFormType() {
        return new HotelPaymentFormType();
    }

    /**
     * Create an instance of {@link TravelerRPHs }
     * 
     */
    public TravelerRPHs createTravelerRPHs() {
        return new TravelerRPHs();
    }

    /**
     * Create an instance of {@link AffiliationInfoType }
     * 
     */
    public AffiliationInfoType createAffiliationInfoType() {
        return new AffiliationInfoType();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.PartnerInfos }
     * 
     */
    public AffiliationInfoType.PartnerInfos createAffiliationInfoTypePartnerInfos() {
        return new AffiliationInfoType.PartnerInfos();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Awards }
     * 
     */
    public AffiliationInfoType.Awards createAffiliationInfoTypeAwards() {
        return new AffiliationInfoType.Awards();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms }
     * 
     */
    public AffiliationInfoType.LoyalPrograms createAffiliationInfoTypeLoyalPrograms() {
        return new AffiliationInfoType.LoyalPrograms();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms.LoyalProgram }
     * 
     */
    public AffiliationInfoType.LoyalPrograms.LoyalProgram createAffiliationInfoTypeLoyalProgramsLoyalProgram() {
        return new AffiliationInfoType.LoyalPrograms.LoyalProgram();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Brands }
     * 
     */
    public AffiliationInfoType.Brands createAffiliationInfoTypeBrands() {
        return new AffiliationInfoType.Brands();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems }
     * 
     */
    public AffiliationInfoType.DistribSystems createAffiliationInfoTypeDistribSystems() {
        return new AffiliationInfoType.DistribSystems();
    }

    /**
     * Create an instance of {@link CancelInfoRSType }
     * 
     */
    public CancelInfoRSType createCancelInfoRSType() {
        return new CancelInfoRSType();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType }
     * 
     */
    public SpecificFlightInfoType createSpecificFlightInfoType() {
        return new SpecificFlightInfoType();
    }

    /**
     * Create an instance of {@link PricedItineraryType }
     * 
     */
    public PricedItineraryType createPricedItineraryType() {
        return new PricedItineraryType();
    }

    /**
     * Create an instance of {@link TicketingInfoType }
     * 
     */
    public TicketingInfoType createTicketingInfoType() {
        return new TicketingInfoType();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TicketingInfo }
     * 
     */
    public PricedItineraryType.TicketingInfo createPricedItineraryTypeTicketingInfo() {
        return new PricedItineraryType.TicketingInfo();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link TextDescriptionType }
     * 
     */
    public TextDescriptionType createTextDescriptionType() {
        return new TextDescriptionType();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType }
     * 
     */
    public VoluntaryChangesType createVoluntaryChangesType() {
        return new VoluntaryChangesType();
    }

    /**
     * Create an instance of {@link GuestRoomType }
     * 
     */
    public GuestRoomType createGuestRoomType() {
        return new GuestRoomType();
    }

    /**
     * Create an instance of {@link GuestRoomType.Amenities }
     * 
     */
    public GuestRoomType.Amenities createGuestRoomTypeAmenities() {
        return new GuestRoomType.Amenities();
    }

    /**
     * Create an instance of {@link AdjustmentsType }
     * 
     */
    public AdjustmentsType createAdjustmentsType() {
        return new AdjustmentsType();
    }

    /**
     * Create an instance of {@link PhonePrefType }
     * 
     */
    public PhonePrefType createPhonePrefType() {
        return new PhonePrefType();
    }

    /**
     * Create an instance of {@link ImageDescriptionType }
     * 
     */
    public ImageDescriptionType createImageDescriptionType() {
        return new ImageDescriptionType();
    }

    /**
     * Create an instance of {@link StayRestrictionsType }
     * 
     */
    public StayRestrictionsType createStayRestrictionsType() {
        return new StayRestrictionsType();
    }

    /**
     * Create an instance of {@link GDSInfoType }
     * 
     */
    public GDSInfoType createGDSInfoType() {
        return new GDSInfoType();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes }
     * 
     */
    public GDSInfoType.GDSCodes createGDSInfoTypeGDSCodes() {
        return new GDSInfoType.GDSCodes();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode createGDSInfoTypeGDSCodesGDSCode() {
        return new GDSInfoType.GDSCodes.GDSCode();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails createGDSInfoTypeGDSCodesGDSCodeGDSCodeDetails() {
        return new GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails();
    }

    /**
     * Create an instance of {@link PhonesType }
     * 
     */
    public PhonesType createPhonesType() {
        return new PhonesType();
    }

    /**
     * Create an instance of {@link SpecialRequestType }
     * 
     */
    public SpecialRequestType createSpecialRequestType() {
        return new SpecialRequestType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link SeatMapDetailsType }
     * 
     */
    public SeatMapDetailsType createSeatMapDetailsType() {
        return new SeatMapDetailsType();
    }

    /**
     * Create an instance of {@link CabinClassType }
     * 
     */
    public CabinClassType createCabinClassType() {
        return new CabinClassType();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType }
     * 
     */
    public VehicleSegmentCoreType createVehicleSegmentCoreType() {
        return new VehicleSegmentCoreType();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType }
     * 
     */
    public HotelSearchCriteriaType createHotelSearchCriteriaType() {
        return new HotelSearchCriteriaType();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType }
     * 
     */
    public HotelSearchCriterionType createHotelSearchCriterionType() {
        return new HotelSearchCriterionType();
    }

    /**
     * Create an instance of {@link PreferencesType }
     * 
     */
    public PreferencesType createPreferencesType() {
        return new PreferencesType();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType }
     * 
     */
    public VehicleLocationVehiclesType createVehicleLocationVehiclesType() {
        return new VehicleLocationVehiclesType();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType.VehicleInfos }
     * 
     */
    public VehicleLocationVehiclesType.VehicleInfos createVehicleLocationVehiclesTypeVehicleInfos() {
        return new VehicleLocationVehiclesType.VehicleInfos();
    }

    /**
     * Create an instance of {@link LengthsOfStayType }
     * 
     */
    public LengthsOfStayType createLengthsOfStayType() {
        return new LengthsOfStayType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay }
     * 
     */
    public LengthsOfStayType.LengthOfStay createLengthsOfStayTypeLengthOfStay() {
        return new LengthsOfStayType.LengthOfStay();
    }

    /**
     * Create an instance of {@link org.opentravel.ota._2003._05.ProfileType }
     * 
     */
    public org.opentravel.ota._2003._05.ProfileType createProfileType() {
        return new org.opentravel.ota._2003._05.ProfileType();
    }

    /**
     * Create an instance of {@link org.opentravel.ota._2003._05.ProfileType.Comments }
     * 
     */
    public org.opentravel.ota._2003._05.ProfileType.Comments createProfileTypeComments() {
        return new org.opentravel.ota._2003._05.ProfileType.Comments();
    }

    /**
     * Create an instance of {@link org.opentravel.ota._2003._05.ProfileType.Comments.Comment }
     * 
     */
    public org.opentravel.ota._2003._05.ProfileType.Comments.Comment createProfileTypeCommentsComment() {
        return new org.opentravel.ota._2003._05.ProfileType.Comments.Comment();
    }

    /**
     * Create an instance of {@link HotelAdditionalChargesType }
     * 
     */
    public HotelAdditionalChargesType createHotelAdditionalChargesType() {
        return new HotelAdditionalChargesType();
    }

    /**
     * Create an instance of {@link RoomPriceType }
     * 
     */
    public RoomPriceType createRoomPriceType() {
        return new RoomPriceType();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType }
     * 
     */
    public VehicleLocationDetailsType createVehicleLocationDetailsType() {
        return new VehicleLocationDetailsType();
    }

    /**
     * Create an instance of {@link CategoryCodesType }
     * 
     */
    public CategoryCodesType createCategoryCodesType() {
        return new CategoryCodesType();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo }
     * 
     */
    public CategoryCodesType.GuestRoomInfo createCategoryCodesTypeGuestRoomInfo() {
        return new CategoryCodesType.GuestRoomInfo();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo.RateRanges }
     * 
     */
    public CategoryCodesType.GuestRoomInfo.RateRanges createCategoryCodesTypeGuestRoomInfoRateRanges() {
        return new CategoryCodesType.GuestRoomInfo.RateRanges();
    }

    /**
     * Create an instance of {@link AccommodationSegmentRequestType }
     * 
     */
    public AccommodationSegmentRequestType createAccommodationSegmentRequestType() {
        return new AccommodationSegmentRequestType();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType }
     * 
     */
    public VehicleSegmentAdditionalInfoType createVehicleSegmentAdditionalInfoType() {
        return new VehicleSegmentAdditionalInfoType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link RatePlanType }
     * 
     */
    public RatePlanType createRatePlanType() {
        return new RatePlanType();
    }

    /**
     * Create an instance of {@link RestaurantType }
     * 
     */
    public RestaurantType createRestaurantType() {
        return new RestaurantType();
    }

    /**
     * Create an instance of {@link RestaurantType.CuisineCodes }
     * 
     */
    public RestaurantType.CuisineCodes createRestaurantTypeCuisineCodes() {
        return new RestaurantType.CuisineCodes();
    }

    /**
     * Create an instance of {@link RestaurantType.InfoCodes }
     * 
     */
    public RestaurantType.InfoCodes createRestaurantTypeInfoCodes() {
        return new RestaurantType.InfoCodes();
    }

    /**
     * Create an instance of {@link ImageItemsType }
     * 
     */
    public ImageItemsType createImageItemsType() {
        return new ImageItemsType();
    }

    /**
     * Create an instance of {@link EmailsType }
     * 
     */
    public EmailsType createEmailsType() {
        return new EmailsType();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType }
     * 
     */
    public AvailRequestSegmentsType createAvailRequestSegmentsType() {
        return new AvailRequestSegmentsType();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment createAvailRequestSegmentsTypeAvailRequestSegment() {
        return new AvailRequestSegmentsType.AvailRequestSegment();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates createAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidates() {
        return new AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType }
     * 
     */
    public SailingCategoryInfoType createSailingCategoryInfoType() {
        return new SailingCategoryInfoType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory createSailingCategoryInfoTypeSelectedCategory() {
        return new SailingCategoryInfoType.SelectedCategory();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin createSailingCategoryInfoTypeSelectedCategorySelectedCabin() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes createSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttributes() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.CabinAttributes createSailingCategoryInfoTypeSelectedCategoryCabinAttributes() {
        return new SailingCategoryInfoType.SelectedCategory.CabinAttributes();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link AgreementsType }
     * 
     */
    public AgreementsType createAgreementsType() {
        return new AgreementsType();
    }

    /**
     * Create an instance of {@link VehicleReservationSummaryType }
     * 
     */
    public VehicleReservationSummaryType createVehicleReservationSummaryType() {
        return new VehicleReservationSummaryType();
    }

    /**
     * Create an instance of {@link RoomStaysType }
     * 
     */
    public RoomStaysType createRoomStaysType() {
        return new RoomStaysType();
    }

    /**
     * Create an instance of {@link RoomStaysType.RoomStay }
     * 
     */
    public RoomStaysType.RoomStay createRoomStaysTypeRoomStay() {
        return new RoomStaysType.RoomStay();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType }
     * 
     */
    public DOWRestrictionsType createDOWRestrictionsType() {
        return new DOWRestrictionsType();
    }

    /**
     * Create an instance of {@link WeatherInfoType }
     * 
     */
    public WeatherInfoType createWeatherInfoType() {
        return new WeatherInfoType();
    }

    /**
     * Create an instance of {@link FareCodeOptionType }
     * 
     */
    public FareCodeOptionType createFareCodeOptionType() {
        return new FareCodeOptionType();
    }

    /**
     * Create an instance of {@link URLsType }
     * 
     */
    public URLsType createURLsType() {
        return new URLsType();
    }

    /**
     * Create an instance of {@link RevenueCategoryType }
     * 
     */
    public RevenueCategoryType createRevenueCategoryType() {
        return new RevenueCategoryType();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType }
     * 
     */
    public VehicleRentalDetailsType createVehicleRentalDetailsType() {
        return new VehicleRentalDetailsType();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType }
     * 
     */
    public AllianceConsortiumType createAllianceConsortiumType() {
        return new AllianceConsortiumType();
    }

    /**
     * Create an instance of {@link VehicleChargeType }
     * 
     */
    public VehicleChargeType createVehicleChargeType() {
        return new VehicleChargeType();
    }

    /**
     * Create an instance of {@link VehicleChargeType.TaxAmounts }
     * 
     */
    public VehicleChargeType.TaxAmounts createVehicleChargeTypeTaxAmounts() {
        return new VehicleChargeType.TaxAmounts();
    }

    /**
     * Create an instance of {@link TransportationType }
     * 
     */
    public TransportationType createTransportationType() {
        return new TransportationType();
    }

    /**
     * Create an instance of {@link FlightLegType }
     * 
     */
    public FlightLegType createFlightLegType() {
        return new FlightLegType();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType }
     * 
     */
    public PropertyValueMatchType createPropertyValueMatchType() {
        return new PropertyValueMatchType();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.Amenities }
     * 
     */
    public PropertyValueMatchType.Amenities createPropertyValueMatchTypeAmenities() {
        return new PropertyValueMatchType.Amenities();
    }

    /**
     * Create an instance of {@link BookingRulesType }
     * 
     */
    public BookingRulesType createBookingRulesType() {
        return new BookingRulesType();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule }
     * 
     */
    public BookingRulesType.BookingRule createBookingRulesTypeBookingRule() {
        return new BookingRulesType.BookingRule();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AddtionalRules }
     * 
     */
    public BookingRulesType.BookingRule.AddtionalRules createBookingRulesTypeBookingRuleAddtionalRules() {
        return new BookingRulesType.BookingRule.AddtionalRules();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AcceptableGuarantees }
     * 
     */
    public BookingRulesType.BookingRule.AcceptableGuarantees createBookingRulesTypeBookingRuleAcceptableGuarantees() {
        return new BookingRulesType.BookingRule.AcceptableGuarantees();
    }

    /**
     * Create an instance of {@link GuaranteeType }
     * 
     */
    public GuaranteeType createGuaranteeType() {
        return new GuaranteeType();
    }

    /**
     * Create an instance of {@link GuaranteeType.GuaranteesAccepted }
     * 
     */
    public GuaranteeType.GuaranteesAccepted createGuaranteeTypeGuaranteesAccepted() {
        return new GuaranteeType.GuaranteesAccepted();
    }

    /**
     * Create an instance of {@link ViewershipsType }
     * 
     */
    public ViewershipsType createViewershipsType() {
        return new ViewershipsType();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership }
     * 
     */
    public ViewershipsType.Viewership createViewershipsTypeViewership() {
        return new ViewershipsType.Viewership();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.DistributorTypes }
     * 
     */
    public ViewershipsType.Viewership.DistributorTypes createViewershipsTypeViewershipDistributorTypes() {
        return new ViewershipsType.Viewership.DistributorTypes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.BookingChannelCodes }
     * 
     */
    public ViewershipsType.Viewership.BookingChannelCodes createViewershipsTypeViewershipBookingChannelCodes() {
        return new ViewershipsType.Viewership.BookingChannelCodes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.LocationCodes }
     * 
     */
    public ViewershipsType.Viewership.LocationCodes createViewershipsTypeViewershipLocationCodes() {
        return new ViewershipsType.Viewership.LocationCodes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ProfileTypes }
     * 
     */
    public ViewershipsType.Viewership.ProfileTypes createViewershipsTypeViewershipProfileTypes() {
        return new ViewershipsType.Viewership.ProfileTypes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.SystemCodes }
     * 
     */
    public ViewershipsType.Viewership.SystemCodes createViewershipsTypeViewershipSystemCodes() {
        return new ViewershipsType.Viewership.SystemCodes();
    }

    /**
     * Create an instance of {@link DocumentHandlingType }
     * 
     */
    public DocumentHandlingType createDocumentHandlingType() {
        return new DocumentHandlingType();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType }
     * 
     */
    public StatisticApplicationSetType createStatisticApplicationSetType() {
        return new StatisticApplicationSetType();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.CountCategorySummaries }
     * 
     */
    public StatisticApplicationSetType.CountCategorySummaries createStatisticApplicationSetTypeCountCategorySummaries() {
        return new StatisticApplicationSetType.CountCategorySummaries();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.RevenueCategorySummaries }
     * 
     */
    public StatisticApplicationSetType.RevenueCategorySummaries createStatisticApplicationSetTypeRevenueCategorySummaries() {
        return new StatisticApplicationSetType.RevenueCategorySummaries();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.StatisticCodes }
     * 
     */
    public StatisticApplicationSetType.StatisticCodes createStatisticApplicationSetTypeStatisticCodes() {
        return new StatisticApplicationSetType.StatisticCodes();
    }

    /**
     * Create an instance of {@link OffLocationServiceType }
     * 
     */
    public OffLocationServiceType createOffLocationServiceType() {
        return new OffLocationServiceType();
    }

    /**
     * Create an instance of {@link PackageResponseType }
     * 
     */
    public PackageResponseType createPackageResponseType() {
        return new PackageResponseType();
    }

    /**
     * Create an instance of {@link RateAmountMessageType }
     * 
     */
    public RateAmountMessageType createRateAmountMessageType() {
        return new RateAmountMessageType();
    }

    /**
     * Create an instance of {@link RateAmountMessageType.Rates }
     * 
     */
    public RateAmountMessageType.Rates createRateAmountMessageTypeRates() {
        return new RateAmountMessageType.Rates();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType }
     * 
     */
    public VehicleVendorAvailabilityType createVehicleVendorAvailabilityType() {
        return new VehicleVendorAvailabilityType();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails createVehicleVendorAvailabilityTypeVehAvails() {
        return new VehicleVendorAvailabilityType.VehAvails();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails.VehAvail }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails.VehAvail createVehicleVendorAvailabilityTypeVehAvailsVehAvail() {
        return new VehicleVendorAvailabilityType.VehAvails.VehAvail();
    }

    /**
     * Create an instance of {@link InvBlockType }
     * 
     */
    public InvBlockType createInvBlockType() {
        return new InvBlockType();
    }

    /**
     * Create an instance of {@link InvBlockType.BlockDescriptions }
     * 
     */
    public InvBlockType.BlockDescriptions createInvBlockTypeBlockDescriptions() {
        return new InvBlockType.BlockDescriptions();
    }

    /**
     * Create an instance of {@link RFPResponseDetailType }
     * 
     */
    public RFPResponseDetailType createRFPResponseDetailType() {
        return new RFPResponseDetailType();
    }

    /**
     * Create an instance of {@link RoomSharesType }
     * 
     */
    public RoomSharesType createRoomSharesType() {
        return new RoomSharesType();
    }

    /**
     * Create an instance of {@link RoomSharesType.RoomShare }
     * 
     */
    public RoomSharesType.RoomShare createRoomSharesTypeRoomShare() {
        return new RoomSharesType.RoomShare();
    }

    /**
     * Create an instance of {@link RoomSharesType.RoomShare.GuestRPHs }
     * 
     */
    public RoomSharesType.RoomShare.GuestRPHs createRoomSharesTypeRoomShareGuestRPHs() {
        return new RoomSharesType.RoomShare.GuestRPHs();
    }

    /**
     * Create an instance of {@link PkgPassengerRPHs }
     * 
     */
    public PkgPassengerRPHs createPkgPassengerRPHs() {
        return new PkgPassengerRPHs();
    }

    /**
     * Create an instance of {@link RestaurantsType }
     * 
     */
    public RestaurantsType createRestaurantsType() {
        return new RestaurantsType();
    }

    /**
     * Create an instance of {@link RestaurantsType.SrvcInfoCodes }
     * 
     */
    public RestaurantsType.SrvcInfoCodes createRestaurantsTypeSrvcInfoCodes() {
        return new RestaurantsType.SrvcInfoCodes();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant }
     * 
     */
    public RestaurantsType.Restaurant createRestaurantsTypeRestaurant() {
        return new RestaurantsType.Restaurant();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant.SrvcInfoCodes }
     * 
     */
    public RestaurantsType.Restaurant.SrvcInfoCodes createRestaurantsTypeRestaurantSrvcInfoCodes() {
        return new RestaurantsType.Restaurant.SrvcInfoCodes();
    }

    /**
     * Create an instance of {@link GuestCountType }
     * 
     */
    public GuestCountType createGuestCountType() {
        return new GuestCountType();
    }

    /**
     * Create an instance of {@link MealPlanType }
     * 
     */
    public MealPlanType createMealPlanType() {
        return new MealPlanType();
    }

    /**
     * Create an instance of {@link MealPlanType.Prices }
     * 
     */
    public MealPlanType.Prices createMealPlanTypePrices() {
        return new MealPlanType.Prices();
    }

    /**
     * Create an instance of {@link HotelReservationType }
     * 
     */
    public HotelReservationType createHotelReservationType() {
        return new HotelReservationType();
    }

    /**
     * Create an instance of {@link ShipInfoType }
     * 
     */
    public ShipInfoType createShipInfoType() {
        return new ShipInfoType();
    }

    /**
     * Create an instance of {@link VehicleAvailRSCoreType }
     * 
     */
    public VehicleAvailRSCoreType createVehicleAvailRSCoreType() {
        return new VehicleAvailRSCoreType();
    }

    /**
     * Create an instance of {@link TaxItemType }
     * 
     */
    public TaxItemType createTaxItemType() {
        return new TaxItemType();
    }

    /**
     * Create an instance of {@link ResCommonDetailType }
     * 
     */
    public ResCommonDetailType createResCommonDetailType() {
        return new ResCommonDetailType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link MeetingRoomCapacityType }
     * 
     */
    public MeetingRoomCapacityType createMeetingRoomCapacityType() {
        return new MeetingRoomCapacityType();
    }

    /**
     * Create an instance of {@link FacilityChoicesType }
     * 
     */
    public FacilityChoicesType createFacilityChoicesType() {
        return new FacilityChoicesType();
    }

    /**
     * Create an instance of {@link ContactsType }
     * 
     */
    public ContactsType createContactsType() {
        return new ContactsType();
    }

    /**
     * Create an instance of {@link ContactsType.Name }
     * 
     */
    public ContactsType.Name createContactsTypeName() {
        return new ContactsType.Name();
    }

    /**
     * Create an instance of {@link SearchQualifierType }
     * 
     */
    public SearchQualifierType createSearchQualifierType() {
        return new SearchQualifierType();
    }

    /**
     * Create an instance of {@link ExtrasCoreType }
     * 
     */
    public ExtrasCoreType createExtrasCoreType() {
        return new ExtrasCoreType();
    }

    /**
     * Create an instance of {@link ExtrasInfoType }
     * 
     */
    public ExtrasInfoType createExtrasInfoType() {
        return new ExtrasInfoType();
    }

    /**
     * Create an instance of {@link RoomTypeType }
     * 
     */
    public RoomTypeType createRoomTypeType() {
        return new RoomTypeType();
    }

    /**
     * Create an instance of {@link AcceptablePaymentCardsInfoType }
     * 
     */
    public AcceptablePaymentCardsInfoType createAcceptablePaymentCardsInfoType() {
        return new AcceptablePaymentCardsInfoType();
    }

    /**
     * Create an instance of {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards }
     * 
     */
    public AcceptablePaymentCardsInfoType.AcceptablePaymentCards createAcceptablePaymentCardsInfoTypeAcceptablePaymentCards() {
        return new AcceptablePaymentCardsInfoType.AcceptablePaymentCards();
    }

    /**
     * Create an instance of {@link ServiceRPHsType }
     * 
     */
    public ServiceRPHsType createServiceRPHsType() {
        return new ServiceRPHsType();
    }

    /**
     * Create an instance of {@link TextItemsType }
     * 
     */
    public TextItemsType createTextItemsType() {
        return new TextItemsType();
    }

    /**
     * Create an instance of {@link OperationSchedulesPlusChargeType }
     * 
     */
    public OperationSchedulesPlusChargeType createOperationSchedulesPlusChargeType() {
        return new OperationSchedulesPlusChargeType();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType }
     * 
     */
    public VehicleLocationLiabilitiesType createVehicleLocationLiabilitiesType() {
        return new VehicleLocationLiabilitiesType();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages createVehicleLocationLiabilitiesTypeCoverages() {
        return new VehicleLocationLiabilitiesType.Coverages();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage createVehicleLocationLiabilitiesTypeCoveragesCoverage() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFees() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFee() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFeeVehicles() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles();
    }

    /**
     * Create an instance of {@link SailingSearchQualifierType }
     * 
     */
    public SailingSearchQualifierType createSailingSearchQualifierType() {
        return new SailingSearchQualifierType();
    }

    /**
     * Create an instance of {@link AirItineraryType }
     * 
     */
    public AirItineraryType createAirItineraryType() {
        return new AirItineraryType();
    }

    /**
     * Create an instance of {@link AirItineraryType.OriginDestinationOptions }
     * 
     */
    public AirItineraryType.OriginDestinationOptions createAirItineraryTypeOriginDestinationOptions() {
        return new AirItineraryType.OriginDestinationOptions();
    }

    /**
     * Create an instance of {@link CustomerCountsType }
     * 
     */
    public CustomerCountsType createCustomerCountsType() {
        return new CustomerCountsType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType }
     * 
     */
    public VehicleLocationAdditionalFeesType createVehicleLocationAdditionalFeesType() {
        return new VehicleLocationAdditionalFeesType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges }
     * 
     */
    public VehicleLocationAdditionalFeesType.MiscellaneousCharges createVehicleLocationAdditionalFeesTypeMiscellaneousCharges() {
        return new VehicleLocationAdditionalFeesType.MiscellaneousCharges();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Surcharges }
     * 
     */
    public VehicleLocationAdditionalFeesType.Surcharges createVehicleLocationAdditionalFeesTypeSurcharges() {
        return new VehicleLocationAdditionalFeesType.Surcharges();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Fees }
     * 
     */
    public VehicleLocationAdditionalFeesType.Fees createVehicleLocationAdditionalFeesTypeFees() {
        return new VehicleLocationAdditionalFeesType.Fees();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Taxes }
     * 
     */
    public VehicleLocationAdditionalFeesType.Taxes createVehicleLocationAdditionalFeesTypeTaxes() {
        return new VehicleLocationAdditionalFeesType.Taxes();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType }
     * 
     */
    public HotelDescriptiveContentType createHotelDescriptiveContentType() {
        return new HotelDescriptiveContentType();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.EffectivePeriods }
     * 
     */
    public HotelDescriptiveContentType.EffectivePeriods createHotelDescriptiveContentTypeEffectivePeriods() {
        return new HotelDescriptiveContentType.EffectivePeriods();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQAdditionalInfoType }
     * 
     */
    public VehicleRetrieveResRQAdditionalInfoType createVehicleRetrieveResRQAdditionalInfoType() {
        return new VehicleRetrieveResRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link ResGuestRPHsType }
     * 
     */
    public ResGuestRPHsType createResGuestRPHsType() {
        return new ResGuestRPHsType();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType }
     * 
     */
    public AirSearchPrefsType createAirSearchPrefsType() {
        return new AirSearchPrefsType();
    }

    /**
     * Create an instance of {@link RoutingHopType }
     * 
     */
    public RoutingHopType createRoutingHopType() {
        return new RoutingHopType();
    }

    /**
     * Create an instance of {@link LoyaltyPointsAccrualsType }
     * 
     */
    public LoyaltyPointsAccrualsType createLoyaltyPointsAccrualsType() {
        return new LoyaltyPointsAccrualsType();
    }

    /**
     * Create an instance of {@link CruiseProfileType }
     * 
     */
    public CruiseProfileType createCruiseProfileType() {
        return new CruiseProfileType();
    }

    /**
     * Create an instance of {@link VehicleAvailAdditionalInfoType }
     * 
     */
    public VehicleAvailAdditionalInfoType createVehicleAvailAdditionalInfoType() {
        return new VehicleAvailAdditionalInfoType();
    }

    /**
     * Create an instance of {@link CabinAvailType }
     * 
     */
    public CabinAvailType createCabinAvailType() {
        return new CabinAvailType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType }
     * 
     */
    public VehicleReservationRQCoreType createVehicleReservationRQCoreType() {
        return new VehicleReservationRQCoreType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.SpecialEquipPrefs }
     * 
     */
    public VehicleReservationRQCoreType.SpecialEquipPrefs createVehicleReservationRQCoreTypeSpecialEquipPrefs() {
        return new VehicleReservationRQCoreType.SpecialEquipPrefs();
    }

    /**
     * Create an instance of {@link StatisticType }
     * 
     */
    public StatisticType createStatisticType() {
        return new StatisticType();
    }

    /**
     * Create an instance of {@link ConnectionType }
     * 
     */
    public ConnectionType createConnectionType() {
        return new ConnectionType();
    }

    /**
     * Create an instance of {@link TravelClubType }
     * 
     */
    public TravelClubType createTravelClubType() {
        return new TravelClubType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link VehicleAvailVendorInfoType }
     * 
     */
    public VehicleAvailVendorInfoType createVehicleAvailVendorInfoType() {
        return new VehicleAvailVendorInfoType();
    }

    /**
     * Create an instance of {@link CompanyInfoType }
     * 
     */
    public CompanyInfoType createCompanyInfoType() {
        return new CompanyInfoType();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType }
     * 
     */
    public AvailStatusMessageType createAvailStatusMessageType() {
        return new AvailStatusMessageType();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.BestAvailableRates }
     * 
     */
    public AvailStatusMessageType.BestAvailableRates createAvailStatusMessageTypeBestAvailableRates() {
        return new AvailStatusMessageType.BestAvailableRates();
    }

    /**
     * Create an instance of {@link VehicleReservationType }
     * 
     */
    public VehicleReservationType createVehicleReservationType() {
        return new VehicleReservationType();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQCoreType }
     * 
     */
    public VehicleRetrieveResRQCoreType createVehicleRetrieveResRQCoreType() {
        return new VehicleRetrieveResRQCoreType();
    }

    /**
     * Create an instance of {@link AirReservationType }
     * 
     */
    public AirReservationType createAirReservationType() {
        return new AirReservationType();
    }

    /**
     * Create an instance of {@link AirReservationType.PricingOverview }
     * 
     */
    public AirReservationType.PricingOverview createAirReservationTypePricingOverview() {
        return new AirReservationType.PricingOverview();
    }

    /**
     * Create an instance of {@link AirReservationType.Queues }
     * 
     */
    public AirReservationType.Queues createAirReservationTypeQueues() {
        return new AirReservationType.Queues();
    }

    /**
     * Create an instance of {@link HotelInfoType }
     * 
     */
    public HotelInfoType createHotelInfoType() {
        return new HotelInfoType();
    }

    /**
     * Create an instance of {@link HotelInfoType.Languages }
     * 
     */
    public HotelInfoType.Languages createHotelInfoTypeLanguages() {
        return new HotelInfoType.Languages();
    }

    /**
     * Create an instance of {@link HotelInfoType.OwnershipManagementInfos }
     * 
     */
    public HotelInfoType.OwnershipManagementInfos createHotelInfoTypeOwnershipManagementInfos() {
        return new HotelInfoType.OwnershipManagementInfos();
    }

    /**
     * Create an instance of {@link HotelInfoType.Services }
     * 
     */
    public HotelInfoType.Services createHotelInfoTypeServices() {
        return new HotelInfoType.Services();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelInfoCodes }
     * 
     */
    public HotelInfoType.HotelInfoCodes createHotelInfoTypeHotelInfoCodes() {
        return new HotelInfoType.HotelInfoCodes();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions }
     * 
     */
    public HotelInfoType.Descriptions createHotelInfoTypeDescriptions() {
        return new HotelInfoType.Descriptions();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType }
     * 
     */
    public VehicleAgeRequirementsType createVehicleAgeRequirementsType() {
        return new VehicleAgeRequirementsType();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age }
     * 
     */
    public VehicleAgeRequirementsType.Age createVehicleAgeRequirementsTypeAge() {
        return new VehicleAgeRequirementsType.Age();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.Vehicles }
     * 
     */
    public VehicleAgeRequirementsType.Age.Vehicles createVehicleAgeRequirementsTypeAgeVehicles() {
        return new VehicleAgeRequirementsType.Age.Vehicles();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.AgeInfos }
     * 
     */
    public VehicleAgeRequirementsType.Age.AgeInfos createVehicleAgeRequirementsTypeAgeAgeInfos() {
        return new VehicleAgeRequirementsType.Age.AgeInfos();
    }

    /**
     * Create an instance of {@link VideoItemsType }
     * 
     */
    public VideoItemsType createVideoItemsType() {
        return new VideoItemsType();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType }
     * 
     */
    public CustomerPrimaryAdditionalType createCustomerPrimaryAdditionalType() {
        return new CustomerPrimaryAdditionalType();
    }

    /**
     * Create an instance of {@link MembershipType }
     * 
     */
    public MembershipType createMembershipType() {
        return new MembershipType();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType }
     * 
     */
    public CruiseGuestDetailType createCruiseGuestDetailType() {
        return new CruiseGuestDetailType();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.AirAccommodations }
     * 
     */
    public CruiseGuestDetailType.AirAccommodations createCruiseGuestDetailTypeAirAccommodations() {
        return new CruiseGuestDetailType.AirAccommodations();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedPackages }
     * 
     */
    public CruiseGuestDetailType.SelectedPackages createCruiseGuestDetailTypeSelectedPackages() {
        return new CruiseGuestDetailType.SelectedPackages();
    }

    /**
     * Create an instance of {@link CruisePackageType }
     * 
     */
    public CruisePackageType createCruisePackageType() {
        return new CruisePackageType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType }
     * 
     */
    public PTCFareBreakdownType createPTCFareBreakdownType() {
        return new PTCFareBreakdownType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingUnit }
     * 
     */
    public PTCFareBreakdownType.PricingUnit createPTCFareBreakdownTypePricingUnit() {
        return new PTCFareBreakdownType.PricingUnit();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingUnit.FareComponent }
     * 
     */
    public PTCFareBreakdownType.PricingUnit.FareComponent createPTCFareBreakdownTypePricingUnitFareComponent() {
        return new PTCFareBreakdownType.PricingUnit.FareComponent();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements }
     * 
     */
    public PTCFareBreakdownType.Endorsements createPTCFareBreakdownTypeEndorsements() {
        return new PTCFareBreakdownType.Endorsements();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TicketDesignators }
     * 
     */
    public PTCFareBreakdownType.TicketDesignators createPTCFareBreakdownTypeTicketDesignators() {
        return new PTCFareBreakdownType.TicketDesignators();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare }
     * 
     */
    public PTCFareBreakdownType.PassengerFare createPTCFareBreakdownTypePassengerFare() {
        return new PTCFareBreakdownType.PassengerFare();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail }
     * 
     */
    public PTCFareBreakdownType.PassengerFare.TicketFeeDetail createPTCFareBreakdownTypePassengerFareTicketFeeDetail() {
        return new PTCFareBreakdownType.PassengerFare.TicketFeeDetail();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee }
     * 
     */
    public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee createPTCFareBreakdownTypePassengerFareTicketFeeDetailFee() {
        return new PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee();
    }

    /**
     * Create an instance of {@link PricedItinerariesType }
     * 
     */
    public PricedItinerariesType createPricedItinerariesType() {
        return new PricedItinerariesType();
    }

    /**
     * Create an instance of {@link BaseInvCountType }
     * 
     */
    public BaseInvCountType createBaseInvCountType() {
        return new BaseInvCountType();
    }

    /**
     * Create an instance of {@link BaseInvCountType.InvCounts }
     * 
     */
    public BaseInvCountType.InvCounts createBaseInvCountTypeInvCounts() {
        return new BaseInvCountType.InvCounts();
    }

    /**
     * Create an instance of {@link BaseInvCountType.InvCounts.InvCount }
     * 
     */
    public BaseInvCountType.InvCounts.InvCount createBaseInvCountTypeInvCountsInvCount() {
        return new BaseInvCountType.InvCounts.InvCount();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType }
     * 
     */
    public CruiseGuestInfoType createCruiseGuestInfoType() {
        return new CruiseGuestInfoType();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.PaymentOptions }
     * 
     */
    public CruiseGuestInfoType.PaymentOptions createCruiseGuestInfoTypePaymentOptions() {
        return new CruiseGuestInfoType.PaymentOptions();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.LinkedBookings }
     * 
     */
    public CruiseGuestInfoType.LinkedBookings createCruiseGuestInfoTypeLinkedBookings() {
        return new CruiseGuestInfoType.LinkedBookings();
    }

    /**
     * Create an instance of {@link AuthorizationType }
     * 
     */
    public AuthorizationType createAuthorizationType() {
        return new AuthorizationType();
    }

    /**
     * Create an instance of {@link AuthorizationType.AccountAuthorization }
     * 
     */
    public AuthorizationType.AccountAuthorization createAuthorizationTypeAccountAuthorization() {
        return new AuthorizationType.AccountAuthorization();
    }

    /**
     * Create an instance of {@link RoomStayLiteType }
     * 
     */
    public RoomStayLiteType createRoomStayLiteType() {
        return new RoomStayLiteType();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType }
     * 
     */
    public VehicleProfileRentalPrefType createVehicleProfileRentalPrefType() {
        return new VehicleProfileRentalPrefType();
    }

    /**
     * Create an instance of {@link ResGuestType }
     * 
     */
    public ResGuestType createResGuestType() {
        return new ResGuestType();
    }

    /**
     * Create an instance of {@link ResGuestType.ProfileRPHs }
     * 
     */
    public ResGuestType.ProfileRPHs createResGuestTypeProfileRPHs() {
        return new ResGuestType.ProfileRPHs();
    }

    /**
     * Create an instance of {@link CategoryOptionType }
     * 
     */
    public CategoryOptionType createCategoryOptionType() {
        return new CategoryOptionType();
    }

    /**
     * Create an instance of {@link CategoryOptionType.PriceInfos }
     * 
     */
    public CategoryOptionType.PriceInfos createCategoryOptionTypePriceInfos() {
        return new CategoryOptionType.PriceInfos();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType }
     * 
     */
    public VehicleReservationRQAdditionalInfoType createVehicleReservationRQAdditionalInfoType() {
        return new VehicleReservationRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.CoveragePrefs }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.CoveragePrefs createVehicleReservationRQAdditionalInfoTypeCoveragePrefs() {
        return new VehicleReservationRQAdditionalInfoType.CoveragePrefs();
    }

    /**
     * Create an instance of {@link FulfillmentType }
     * 
     */
    public FulfillmentType createFulfillmentType() {
        return new FulfillmentType();
    }

    /**
     * Create an instance of {@link FulfillmentType.PaymentDetails }
     * 
     */
    public FulfillmentType.PaymentDetails createFulfillmentTypePaymentDetails() {
        return new FulfillmentType.PaymentDetails();
    }

    /**
     * Create an instance of {@link HotelResModifyType }
     * 
     */
    public HotelResModifyType createHotelResModifyType() {
        return new HotelResModifyType();
    }

    /**
     * Create an instance of {@link HotelResModifyType.HotelResModify }
     * 
     */
    public HotelResModifyType.HotelResModify createHotelResModifyTypeHotelResModify() {
        return new HotelResModifyType.HotelResModify();
    }

    /**
     * Create an instance of {@link VerificationType }
     * 
     */
    public VerificationType createVerificationType() {
        return new VerificationType();
    }

    /**
     * Create an instance of {@link SailingType }
     * 
     */
    public SailingType createSailingType() {
        return new SailingType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQAdditionalInfoType }
     * 
     */
    public VehicleAvailRQAdditionalInfoType createVehicleAvailRQAdditionalInfoType() {
        return new VehicleAvailRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQAdditionalInfoType.CoveragePrefs }
     * 
     */
    public VehicleAvailRQAdditionalInfoType.CoveragePrefs createVehicleAvailRQAdditionalInfoTypeCoveragePrefs() {
        return new VehicleAvailRQAdditionalInfoType.CoveragePrefs();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType }
     * 
     */
    public CruiseBookingInfoType createCruiseBookingInfoType() {
        return new CruiseBookingInfoType();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices }
     * 
     */
    public CruiseBookingInfoType.GuestPrices createCruiseBookingInfoTypeGuestPrices() {
        return new CruiseBookingInfoType.GuestPrices();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices.GuestPrice }
     * 
     */
    public CruiseBookingInfoType.GuestPrices.GuestPrice createCruiseBookingInfoTypeGuestPricesGuestPrice() {
        return new CruiseBookingInfoType.GuestPrices.GuestPrice();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos }
     * 
     */
    public CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos createCruiseBookingInfoTypeGuestPricesGuestPricePriceInfos() {
        return new CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.PaymentSchedule }
     * 
     */
    public CruiseBookingInfoType.PaymentSchedule createCruiseBookingInfoTypePaymentSchedule() {
        return new CruiseBookingInfoType.PaymentSchedule();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.BookingPrices }
     * 
     */
    public CruiseBookingInfoType.BookingPrices createCruiseBookingInfoTypeBookingPrices() {
        return new CruiseBookingInfoType.BookingPrices();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.CurrencyConversions }
     * 
     */
    public OTAHotelAvailRS.CurrencyConversions createOTAHotelAvailRSCurrencyConversions() {
        return new OTAHotelAvailRS.CurrencyConversions();
    }

    /**
     * Create an instance of {@link AreasType }
     * 
     */
    public AreasType createAreasType() {
        return new AreasType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.RoomStays }
     * 
     */
    public OTAHotelAvailRS.RoomStays createOTAHotelAvailRSRoomStays() {
        return new OTAHotelAvailRS.RoomStays();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.RoomStays.RoomStay }
     * 
     */
    public OTAHotelAvailRS.RoomStays.RoomStay createOTAHotelAvailRSRoomStaysRoomStay() {
        return new OTAHotelAvailRS.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays }
     * 
     */
    public OTAHotelAvailRS.HotelStays createOTAHotelAvailRSHotelStays() {
        return new OTAHotelAvailRS.HotelStays();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays.HotelStay }
     * 
     */
    public OTAHotelAvailRS.HotelStays.HotelStay createOTAHotelAvailRSHotelStaysHotelStay() {
        return new OTAHotelAvailRS.HotelStays.HotelStay();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays.HotelStay.Availability }
     * 
     */
    public OTAHotelAvailRS.HotelStays.HotelStay.Availability createOTAHotelAvailRSHotelStaysHotelStayAvailability() {
        return new OTAHotelAvailRS.HotelStays.HotelStay.Availability();
    }

    /**
     * Create an instance of {@link ProfilesType }
     * 
     */
    public ProfilesType createProfilesType() {
        return new ProfilesType();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType }
     * 
     */
    public HotelReservationIDsType createHotelReservationIDsType() {
        return new HotelReservationIDsType();
    }

    /**
     * Create an instance of {@link OTAHotelResNotifRS }
     * 
     */
    public OTAHotelResNotifRS createOTAHotelResNotifRS() {
        return new OTAHotelResNotifRS();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link HotelReservationsType }
     * 
     */
    public HotelReservationsType createHotelReservationsType() {
        return new HotelReservationsType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link OTAVehRetResRQ.VehRetResRQCore }
     * 
     */
    public OTAVehRetResRQ.VehRetResRQCore createOTAVehRetResRQVehRetResRQCore() {
        return new OTAVehRetResRQ.VehRetResRQCore();
    }

    /**
     * Create an instance of {@link OTAVehRetResRQ.VehRetResRQInfo }
     * 
     */
    public OTAVehRetResRQ.VehRetResRQInfo createOTAVehRetResRQVehRetResRQInfo() {
        return new OTAVehRetResRQ.VehRetResRQInfo();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link OTAHotelRateAmountNotifRQ.RateAmountMessages }
     * 
     */
    public OTAHotelRateAmountNotifRQ.RateAmountMessages createOTAHotelRateAmountNotifRQRateAmountMessages() {
        return new OTAHotelRateAmountNotifRQ.RateAmountMessages();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link OTAHotelResNotifRQ }
     * 
     */
    public OTAHotelResNotifRQ createOTAHotelResNotifRQ() {
        return new OTAHotelResNotifRQ();
    }

    /**
     * Create an instance of {@link MessageAcknowledgementType }
     * 
     */
    public MessageAcknowledgementType createMessageAcknowledgementType() {
        return new MessageAcknowledgementType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRQ.AvailStatusMessages }
     * 
     */
    public OTAHotelAvailNotifRQ.AvailStatusMessages createOTAHotelAvailNotifRQAvailStatusMessages() {
        return new OTAHotelAvailNotifRQ.AvailStatusMessages();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRQ.AvailRequestSegments }
     * 
     */
    public OTAHotelAvailRQ.AvailRequestSegments createOTAHotelAvailRQAvailRequestSegments() {
        return new OTAHotelAvailRQ.AvailRequestSegments();
    }

    /**
     * Create an instance of {@link ServicesType }
     * 
     */
    public ServicesType createServicesType() {
        return new ServicesType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.Criteria }
     * 
     */
    public OTAHotelAvailRS.Criteria createOTAHotelAvailRSCriteria() {
        return new OTAHotelAvailRS.Criteria();
    }

    /**
     * Create an instance of {@link TransportationsType }
     * 
     */
    public TransportationsType createTransportationsType() {
        return new TransportationsType();
    }

    /**
     * Create an instance of {@link SeatingPrefType }
     * 
     */
    public SeatingPrefType createSeatingPrefType() {
        return new SeatingPrefType();
    }

    /**
     * Create an instance of {@link TimeDurationType }
     * 
     */
    public TimeDurationType createTimeDurationType() {
        return new TimeDurationType();
    }

    /**
     * Create an instance of {@link OperatingAirlineType }
     * 
     */
    public OperatingAirlineType createOperatingAirlineType() {
        return new OperatingAirlineType();
    }

    /**
     * Create an instance of {@link OperationSchedulesType }
     * 
     */
    public OperationSchedulesType createOperationSchedulesType() {
        return new OperationSchedulesType();
    }

    /**
     * Create an instance of {@link RevenueDetailType }
     * 
     */
    public RevenueDetailType createRevenueDetailType() {
        return new RevenueDetailType();
    }

    /**
     * Create an instance of {@link VehicleChargePurposeType }
     * 
     */
    public VehicleChargePurposeType createVehicleChargePurposeType() {
        return new VehicleChargePurposeType();
    }

    /**
     * Create an instance of {@link BusinessSrvcPrefType }
     * 
     */
    public BusinessSrvcPrefType createBusinessSrvcPrefType() {
        return new BusinessSrvcPrefType();
    }

    /**
     * Create an instance of {@link AirTaxType }
     * 
     */
    public AirTaxType createAirTaxType() {
        return new AirTaxType();
    }

    /**
     * Create an instance of {@link ExtrasType }
     * 
     */
    public ExtrasType createExtrasType() {
        return new ExtrasType();
    }

    /**
     * Create an instance of {@link RoomRateLiteType }
     * 
     */
    public RoomRateLiteType createRoomRateLiteType() {
        return new RoomRateLiteType();
    }

    /**
     * Create an instance of {@link WrittenConfInstType }
     * 
     */
    public WrittenConfInstType createWrittenConfInstType() {
        return new WrittenConfInstType();
    }

    /**
     * Create an instance of {@link VehicleAvailRSAdditionalInfoType }
     * 
     */
    public VehicleAvailRSAdditionalInfoType createVehicleAvailRSAdditionalInfoType() {
        return new VehicleAvailRSAdditionalInfoType();
    }

    /**
     * Create an instance of {@link ReservationIDType }
     * 
     */
    public ReservationIDType createReservationIDType() {
        return new ReservationIDType();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType }
     * 
     */
    public SpecialServiceRequestType createSpecialServiceRequestType() {
        return new SpecialServiceRequestType();
    }

    /**
     * Create an instance of {@link VehicleResRSCoreType }
     * 
     */
    public VehicleResRSCoreType createVehicleResRSCoreType() {
        return new VehicleResRSCoreType();
    }

    /**
     * Create an instance of {@link PaymentRulesType }
     * 
     */
    public PaymentRulesType createPaymentRulesType() {
        return new PaymentRulesType();
    }

    /**
     * Create an instance of {@link BookingPriceInfoType }
     * 
     */
    public BookingPriceInfoType createBookingPriceInfoType() {
        return new BookingPriceInfoType();
    }

    /**
     * Create an instance of {@link RoomAmenityPrefType }
     * 
     */
    public RoomAmenityPrefType createRoomAmenityPrefType() {
        return new RoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link ReferencePlaceHolderType }
     * 
     */
    public ReferencePlaceHolderType createReferencePlaceHolderType() {
        return new ReferencePlaceHolderType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType }
     * 
     */
    public MultimediaDescriptionsType createMultimediaDescriptionsType() {
        return new MultimediaDescriptionsType();
    }

    /**
     * Create an instance of {@link OwnInsuranceChoiceType }
     * 
     */
    public OwnInsuranceChoiceType createOwnInsuranceChoiceType() {
        return new OwnInsuranceChoiceType();
    }

    /**
     * Create an instance of {@link ImageItemType }
     * 
     */
    public ImageItemType createImageItemType() {
        return new ImageItemType();
    }

    /**
     * Create an instance of {@link AmountLiteType }
     * 
     */
    public AmountLiteType createAmountLiteType() {
        return new AmountLiteType();
    }

    /**
     * Create an instance of {@link StreetNmbrType }
     * 
     */
    public StreetNmbrType createStreetNmbrType() {
        return new StreetNmbrType();
    }

    /**
     * Create an instance of {@link VendorMessageType }
     * 
     */
    public VendorMessageType createVendorMessageType() {
        return new VendorMessageType();
    }

    /**
     * Create an instance of {@link PeriodPriceType }
     * 
     */
    public PeriodPriceType createPeriodPriceType() {
        return new PeriodPriceType();
    }

    /**
     * Create an instance of {@link RelatedTravelerType }
     * 
     */
    public RelatedTravelerType createRelatedTravelerType() {
        return new RelatedTravelerType();
    }

    /**
     * Create an instance of {@link TicketDistribPrefType }
     * 
     */
    public TicketDistribPrefType createTicketDistribPrefType() {
        return new TicketDistribPrefType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityType }
     * 
     */
    public SeatAvailabilityType createSeatAvailabilityType() {
        return new SeatAvailabilityType();
    }

    /**
     * Create an instance of {@link RoomTypeLiteType }
     * 
     */
    public RoomTypeLiteType createRoomTypeLiteType() {
        return new RoomTypeLiteType();
    }

    /**
     * Create an instance of {@link EquipmentTypePref }
     * 
     */
    public EquipmentTypePref createEquipmentTypePref() {
        return new EquipmentTypePref();
    }

    /**
     * Create an instance of {@link CompanyNamePrefType }
     * 
     */
    public CompanyNamePrefType createCompanyNamePrefType() {
        return new CompanyNamePrefType();
    }

    /**
     * Create an instance of {@link ContactInfoRootType }
     * 
     */
    public ContactInfoRootType createContactInfoRootType() {
        return new ContactInfoRootType();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link SpecRequestPrefType }
     * 
     */
    public SpecRequestPrefType createSpecRequestPrefType() {
        return new SpecRequestPrefType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link PropertyIdentityType }
     * 
     */
    public PropertyIdentityType createPropertyIdentityType() {
        return new PropertyIdentityType();
    }

    /**
     * Create an instance of {@link PriceInfoType }
     * 
     */
    public PriceInfoType createPriceInfoType() {
        return new PriceInfoType();
    }

    /**
     * Create an instance of {@link VehicleLocationInformationType }
     * 
     */
    public VehicleLocationInformationType createVehicleLocationInformationType() {
        return new VehicleLocationInformationType();
    }

    /**
     * Create an instance of {@link AmenityOptionType }
     * 
     */
    public AmenityOptionType createAmenityOptionType() {
        return new AmenityOptionType();
    }

    /**
     * Create an instance of {@link RateLiteType }
     * 
     */
    public RateLiteType createRateLiteType() {
        return new RateLiteType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     * 
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link MonetaryRuleType }
     * 
     */
    public MonetaryRuleType createMonetaryRuleType() {
        return new MonetaryRuleType();
    }

    /**
     * Create an instance of {@link CertificationType }
     * 
     */
    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link StateProvType }
     * 
     */
    public StateProvType createStateProvType() {
        return new StateProvType();
    }

    /**
     * Create an instance of {@link LocationGeneralType }
     * 
     */
    public LocationGeneralType createLocationGeneralType() {
        return new LocationGeneralType();
    }

    /**
     * Create an instance of {@link TravelDateTimeType }
     * 
     */
    public TravelDateTimeType createTravelDateTimeType() {
        return new TravelDateTimeType();
    }

    /**
     * Create an instance of {@link VehicleTourInfoType }
     * 
     */
    public VehicleTourInfoType createVehicleTourInfoType() {
        return new VehicleTourInfoType();
    }

    /**
     * Create an instance of {@link RelatedTravelerPrefType }
     * 
     */
    public RelatedTravelerPrefType createRelatedTravelerPrefType() {
        return new RelatedTravelerPrefType();
    }

    /**
     * Create an instance of {@link ResGuestsType }
     * 
     */
    public ResGuestsType createResGuestsType() {
        return new ResGuestsType();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentType }
     * 
     */
    public PkgFlightSegmentType createPkgFlightSegmentType() {
        return new PkgFlightSegmentType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramType }
     * 
     */
    public LoyaltyProgramType createLoyaltyProgramType() {
        return new LoyaltyProgramType();
    }

    /**
     * Create an instance of {@link PersonalSrvcPrefType }
     * 
     */
    public PersonalSrvcPrefType createPersonalSrvcPrefType() {
        return new PersonalSrvcPrefType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentPricedType }
     * 
     */
    public VehicleEquipmentPricedType createVehicleEquipmentPricedType() {
        return new VehicleEquipmentPricedType();
    }

    /**
     * Create an instance of {@link RatePlanLiteType }
     * 
     */
    public RatePlanLiteType createRatePlanLiteType() {
        return new RatePlanLiteType();
    }

    /**
     * Create an instance of {@link AirInfoType }
     * 
     */
    public AirInfoType createAirInfoType() {
        return new AirInfoType();
    }

    /**
     * Create an instance of {@link AirFeeType }
     * 
     */
    public AirFeeType createAirFeeType() {
        return new AirFeeType();
    }

    /**
     * Create an instance of {@link PersonalInsuranceItemType }
     * 
     */
    public PersonalInsuranceItemType createPersonalInsuranceItemType() {
        return new PersonalInsuranceItemType();
    }

    /**
     * Create an instance of {@link ResGlobalInfoType }
     * 
     */
    public ResGlobalInfoType createResGlobalInfoType() {
        return new ResGlobalInfoType();
    }

    /**
     * Create an instance of {@link SourceIdentificationType }
     * 
     */
    public SourceIdentificationType createSourceIdentificationType() {
        return new SourceIdentificationType();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link HotelResModifyRequestType }
     * 
     */
    public HotelResModifyRequestType createHotelResModifyRequestType() {
        return new HotelResModifyRequestType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link FormattedTextType }
     * 
     */
    public FormattedTextType createFormattedTextType() {
        return new FormattedTextType();
    }

    /**
     * Create an instance of {@link CoveragePricedType }
     * 
     */
    public CoveragePricedType createCoveragePricedType() {
        return new CoveragePricedType();
    }

    /**
     * Create an instance of {@link SupplementChargesType }
     * 
     */
    public SupplementChargesType createSupplementChargesType() {
        return new SupplementChargesType();
    }

    /**
     * Create an instance of {@link SeatRequestType }
     * 
     */
    public SeatRequestType createSeatRequestType() {
        return new SeatRequestType();
    }

    /**
     * Create an instance of {@link PropertyAmenityPrefType }
     * 
     */
    public PropertyAmenityPrefType createPropertyAmenityPrefType() {
        return new PropertyAmenityPrefType();
    }

    /**
     * Create an instance of {@link CancelInfoRQType }
     * 
     */
    public CancelInfoRQType createCancelInfoRQType() {
        return new CancelInfoRQType();
    }

    /**
     * Create an instance of {@link FareBasisCodeType }
     * 
     */
    public FareBasisCodeType createFareBasisCodeType() {
        return new FareBasisCodeType();
    }

    /**
     * Create an instance of {@link InvCountType }
     * 
     */
    public InvCountType createInvCountType() {
        return new InvCountType();
    }

    /**
     * Create an instance of {@link PhysChallFeaturePrefType }
     * 
     */
    public PhysChallFeaturePrefType createPhysChallFeaturePrefType() {
        return new PhysChallFeaturePrefType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentsType }
     * 
     */
    public AcceptedPaymentsType createAcceptedPaymentsType() {
        return new AcceptedPaymentsType();
    }

    /**
     * Create an instance of {@link HotelResResponseType }
     * 
     */
    public HotelResResponseType createHotelResResponseType() {
        return new HotelResResponseType();
    }

    /**
     * Create an instance of {@link LoyaltyPrefType }
     * 
     */
    public LoyaltyPrefType createLoyaltyPrefType() {
        return new LoyaltyPrefType();
    }

    /**
     * Create an instance of {@link VehicleWhereAtFacilityType }
     * 
     */
    public VehicleWhereAtFacilityType createVehicleWhereAtFacilityType() {
        return new VehicleWhereAtFacilityType();
    }

    /**
     * Create an instance of {@link InterestPrefType }
     * 
     */
    public InterestPrefType createInterestPrefType() {
        return new InterestPrefType();
    }

    /**
     * Create an instance of {@link RevenueDetailsType }
     * 
     */
    public RevenueDetailsType createRevenueDetailsType() {
        return new RevenueDetailsType();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link VendorMessagesType }
     * 
     */
    public VendorMessagesType createVendorMessagesType() {
        return new VendorMessagesType();
    }

    /**
     * Create an instance of {@link SpecialServiceType }
     * 
     */
    public SpecialServiceType createSpecialServiceType() {
        return new SpecialServiceType();
    }

    /**
     * Create an instance of {@link VehicleArrivalDetailsType }
     * 
     */
    public VehicleArrivalDetailsType createVehicleArrivalDetailsType() {
        return new VehicleArrivalDetailsType();
    }

    /**
     * Create an instance of {@link DOWRulesType }
     * 
     */
    public DOWRulesType createDOWRulesType() {
        return new DOWRulesType();
    }

    /**
     * Create an instance of {@link OtherSrvcPrefType }
     * 
     */
    public OtherSrvcPrefType createOtherSrvcPrefType() {
        return new OtherSrvcPrefType();
    }

    /**
     * Create an instance of {@link TravelerInformationType }
     * 
     */
    public TravelerInformationType createTravelerInformationType() {
        return new TravelerInformationType();
    }

    /**
     * Create an instance of {@link TimeInstantType }
     * 
     */
    public TimeInstantType createTimeInstantType() {
        return new TimeInstantType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link RecreationSrvcPrefType }
     * 
     */
    public RecreationSrvcPrefType createRecreationSrvcPrefType() {
        return new RecreationSrvcPrefType();
    }

    /**
     * Create an instance of {@link AccommodationDetailType }
     * 
     */
    public AccommodationDetailType createAccommodationDetailType() {
        return new AccommodationDetailType();
    }

    /**
     * Create an instance of {@link VehicleResRSAdditionalInfoType }
     * 
     */
    public VehicleResRSAdditionalInfoType createVehicleResRSAdditionalInfoType() {
        return new VehicleResRSAdditionalInfoType();
    }

    /**
     * Create an instance of {@link PkgCautionType }
     * 
     */
    public PkgCautionType createPkgCautionType() {
        return new PkgCautionType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link MarketingCabinType }
     * 
     */
    public MarketingCabinType createMarketingCabinType() {
        return new MarketingCabinType();
    }

    /**
     * Create an instance of {@link EmployeeInfoType }
     * 
     */
    public EmployeeInfoType createEmployeeInfoType() {
        return new EmployeeInfoType();
    }

    /**
     * Create an instance of {@link StayInfoType }
     * 
     */
    public StayInfoType createStayInfoType() {
        return new StayInfoType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionType }
     * 
     */
    public MultimediaDescriptionType createMultimediaDescriptionType() {
        return new MultimediaDescriptionType();
    }

    /**
     * Create an instance of {@link ServiceRequestType }
     * 
     */
    public ServiceRequestType createServiceRequestType() {
        return new ServiceRequestType();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link TicketingInfoRSType }
     * 
     */
    public TicketingInfoRSType createTicketingInfoRSType() {
        return new TicketingInfoRSType();
    }

    /**
     * Create an instance of {@link BedTypePrefType }
     * 
     */
    public BedTypePrefType createBedTypePrefType() {
        return new BedTypePrefType();
    }

    /**
     * Create an instance of {@link HotelResRequestType }
     * 
     */
    public HotelResRequestType createHotelResRequestType() {
        return new HotelResRequestType();
    }

    /**
     * Create an instance of {@link ChargesType }
     * 
     */
    public ChargesType createChargesType() {
        return new ChargesType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link StatusApplicationControlType }
     * 
     */
    public StatusApplicationControlType createStatusApplicationControlType() {
        return new StatusApplicationControlType();
    }

    /**
     * Create an instance of {@link PkgPriceType }
     * 
     */
    public PkgPriceType createPkgPriceType() {
        return new PkgPriceType();
    }

    /**
     * Create an instance of {@link InsurancePrefType }
     * 
     */
    public InsurancePrefType createInsurancePrefType() {
        return new InsurancePrefType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link RevenueCategoriesType }
     * 
     */
    public RevenueCategoriesType createRevenueCategoriesType() {
        return new RevenueCategoriesType();
    }

    /**
     * Create an instance of {@link PropertyTypePrefType }
     * 
     */
    public PropertyTypePrefType createPropertyTypePrefType() {
        return new PropertyTypePrefType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link SecurityFeaturePrefType }
     * 
     */
    public SecurityFeaturePrefType createSecurityFeaturePrefType() {
        return new SecurityFeaturePrefType();
    }

    /**
     * Create an instance of {@link HotelPrefType }
     * 
     */
    public HotelPrefType createHotelPrefType() {
        return new HotelPrefType();
    }

    /**
     * Create an instance of {@link CancelPenaltiesType }
     * 
     */
    public CancelPenaltiesType createCancelPenaltiesType() {
        return new CancelPenaltiesType();
    }

    /**
     * Create an instance of {@link PropertyNamePrefType }
     * 
     */
    public PropertyNamePrefType createPropertyNamePrefType() {
        return new PropertyNamePrefType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link HotelResModifyResponseType }
     * 
     */
    public HotelResModifyResponseType createHotelResModifyResponseType() {
        return new HotelResModifyResponseType();
    }

    /**
     * Create an instance of {@link RoomStayCandidateType }
     * 
     */
    public RoomStayCandidateType createRoomStayCandidateType() {
        return new RoomStayCandidateType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link AdditionalGuestAmountType }
     * 
     */
    public AdditionalGuestAmountType createAdditionalGuestAmountType() {
        return new AdditionalGuestAmountType();
    }

    /**
     * Create an instance of {@link CoverageType }
     * 
     */
    public CoverageType createCoverageType() {
        return new CoverageType();
    }

    /**
     * Create an instance of {@link BankAcctType }
     * 
     */
    public BankAcctType createBankAcctType() {
        return new BankAcctType();
    }

    /**
     * Create an instance of {@link FoodSrvcPrefType }
     * 
     */
    public FoodSrvcPrefType createFoodSrvcPrefType() {
        return new FoodSrvcPrefType();
    }

    /**
     * Create an instance of {@link PkgRoomInventoryType }
     * 
     */
    public PkgRoomInventoryType createPkgRoomInventoryType() {
        return new PkgRoomInventoryType();
    }

    /**
     * Create an instance of {@link PetInfoPrefType }
     * 
     */
    public PetInfoPrefType createPetInfoPrefType() {
        return new PetInfoPrefType();
    }

    /**
     * Create an instance of {@link InsuranceType }
     * 
     */
    public InsuranceType createInsuranceType() {
        return new InsuranceType();
    }

    /**
     * Create an instance of {@link PaymentFormPrefType }
     * 
     */
    public PaymentFormPrefType createPaymentFormPrefType() {
        return new PaymentFormPrefType();
    }

    /**
     * Create an instance of {@link RoomLocationPrefType }
     * 
     */
    public RoomLocationPrefType createRoomLocationPrefType() {
        return new RoomLocationPrefType();
    }

    /**
     * Create an instance of {@link AdditionalDetailsType }
     * 
     */
    public AdditionalDetailsType createAdditionalDetailsType() {
        return new AdditionalDetailsType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link MealPrefType }
     * 
     */
    public MealPrefType createMealPrefType() {
        return new MealPrefType();
    }

    /**
     * Create an instance of {@link AdditionalDetailType }
     * 
     */
    public AdditionalDetailType createAdditionalDetailType() {
        return new AdditionalDetailType();
    }

    /**
     * Create an instance of {@link AirportPrefType }
     * 
     */
    public AirportPrefType createAirportPrefType() {
        return new AirportPrefType();
    }

    /**
     * Create an instance of {@link MeetingRoomCodeType }
     * 
     */
    public MeetingRoomCodeType createMeetingRoomCodeType() {
        return new MeetingRoomCodeType();
    }

    /**
     * Create an instance of {@link AddressPrefType }
     * 
     */
    public AddressPrefType createAddressPrefType() {
        return new AddressPrefType();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityType }
     * 
     */
    public PassengerTypeQuantityType createPassengerTypeQuantityType() {
        return new PassengerTypeQuantityType();
    }

    /**
     * Create an instance of {@link FolioIDsType }
     * 
     */
    public FolioIDsType createFolioIDsType() {
        return new FolioIDsType();
    }

    /**
     * Create an instance of {@link OffLocationServicePricedType }
     * 
     */
    public OffLocationServicePricedType createOffLocationServicePricedType() {
        return new OffLocationServicePricedType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentType }
     * 
     */
    public VehicleEquipmentType createVehicleEquipmentType() {
        return new VehicleEquipmentType();
    }

    /**
     * Create an instance of {@link FormattedTextSubSectionType }
     * 
     */
    public FormattedTextSubSectionType createFormattedTextSubSectionType() {
        return new FormattedTextSubSectionType();
    }

    /**
     * Create an instance of {@link TravelArrangerType }
     * 
     */
    public TravelArrangerType createTravelArrangerType() {
        return new TravelArrangerType();
    }

    /**
     * Create an instance of {@link VideoItemType }
     * 
     */
    public VideoItemType createVideoItemType() {
        return new VideoItemType();
    }

    /**
     * Create an instance of {@link RequiredPaymentLiteType }
     * 
     */
    public RequiredPaymentLiteType createRequiredPaymentLiteType() {
        return new RequiredPaymentLiteType();
    }

    /**
     * Create an instance of {@link GuestType }
     * 
     */
    public GuestType createGuestType() {
        return new GuestType();
    }

    /**
     * Create an instance of {@link PkgTravelSegment }
     * 
     */
    public PkgTravelSegment createPkgTravelSegment() {
        return new PkgTravelSegment();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link BlackoutDateType }
     * 
     */
    public BlackoutDateType createBlackoutDateType() {
        return new BlackoutDateType();
    }

    /**
     * Create an instance of {@link CommissionInfoType }
     * 
     */
    public CommissionInfoType createCommissionInfoType() {
        return new CommissionInfoType();
    }

    /**
     * Create an instance of {@link MediaEntertainPrefType }
     * 
     */
    public MediaEntertainPrefType createMediaEntertainPrefType() {
        return new MediaEntertainPrefType();
    }

    /**
     * Create an instance of {@link CancelRuleType }
     * 
     */
    public CancelRuleType createCancelRuleType() {
        return new CancelRuleType();
    }

    /**
     * Create an instance of {@link RelativePositionType }
     * 
     */
    public RelativePositionType createRelativePositionType() {
        return new RelativePositionType();
    }

    /**
     * Create an instance of {@link EmployerType }
     * 
     */
    public EmployerType createEmployerType() {
        return new EmployerType();
    }

    /**
     * Create an instance of {@link PropertyClassPrefType }
     * 
     */
    public PropertyClassPrefType createPropertyClassPrefType() {
        return new PropertyClassPrefType();
    }

    /**
     * Create an instance of {@link GuestTransportationType }
     * 
     */
    public GuestTransportationType createGuestTransportationType() {
        return new GuestTransportationType();
    }

    /**
     * Create an instance of {@link ContactInfosType }
     * 
     */
    public ContactInfosType createContactInfosType() {
        return new ContactInfosType();
    }

    /**
     * Create an instance of {@link NamePrefType }
     * 
     */
    public NamePrefType createNamePrefType() {
        return new NamePrefType();
    }

    /**
     * Create an instance of {@link StayInfosType }
     * 
     */
    public StayInfosType createStayInfosType() {
        return new StayInfosType();
    }

    /**
     * Create an instance of {@link DeductibleType }
     * 
     */
    public DeductibleType createDeductibleType() {
        return new DeductibleType();
    }

    /**
     * Create an instance of {@link OperationSchedulePlusChargeType }
     * 
     */
    public OperationSchedulePlusChargeType createOperationSchedulePlusChargeType() {
        return new OperationSchedulePlusChargeType();
    }

    /**
     * Create an instance of {@link StatisticsType }
     * 
     */
    public StatisticsType createStatisticsType() {
        return new StatisticsType();
    }

    /**
     * Create an instance of {@link PropertyLocationPrefType }
     * 
     */
    public PropertyLocationPrefType createPropertyLocationPrefType() {
        return new PropertyLocationPrefType();
    }

    /**
     * Create an instance of {@link VehicleSpecialReqPrefType }
     * 
     */
    public VehicleSpecialReqPrefType createVehicleSpecialReqPrefType() {
        return new VehicleSpecialReqPrefType();
    }

    /**
     * Create an instance of {@link CountryNameType }
     * 
     */
    public CountryNameType createCountryNameType() {
        return new CountryNameType();
    }

    /**
     * Create an instance of {@link CoverageDetailsType }
     * 
     */
    public CoverageDetailsType createCoverageDetailsType() {
        return new CoverageDetailsType();
    }

    /**
     * Create an instance of {@link AffiliationsType }
     * 
     */
    public AffiliationsType createAffiliationsType() {
        return new AffiliationsType();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.OriginLocation }
     * 
     */
    public OriginDestinationInformationType.OriginLocation createOriginDestinationInformationTypeOriginLocation() {
        return new OriginDestinationInformationType.OriginLocation();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.DestinationLocation }
     * 
     */
    public OriginDestinationInformationType.DestinationLocation createOriginDestinationInformationTypeDestinationLocation() {
        return new OriginDestinationInformationType.DestinationLocation();
    }

    /**
     * Create an instance of {@link ContactPersonType.Telephone }
     * 
     */
    public ContactPersonType.Telephone createContactPersonTypeTelephone() {
        return new ContactPersonType.Telephone();
    }

    /**
     * Create an instance of {@link AirTravelerType.ProfileRef }
     * 
     */
    public AirTravelerType.ProfileRef createAirTravelerTypeProfileRef() {
        return new AirTravelerType.ProfileRef();
    }

    /**
     * Create an instance of {@link AirTravelerType.Telephone }
     * 
     */
    public AirTravelerType.Telephone createAirTravelerTypeTelephone() {
        return new AirTravelerType.Telephone();
    }

    /**
     * Create an instance of {@link AirTravelerType.Email }
     * 
     */
    public AirTravelerType.Email createAirTravelerTypeEmail() {
        return new AirTravelerType.Email();
    }

    /**
     * Create an instance of {@link AirTravelerType.Address }
     * 
     */
    public AirTravelerType.Address createAirTravelerTypeAddress() {
        return new AirTravelerType.Address();
    }

    /**
     * Create an instance of {@link AirTravelerType.CustLoyalty }
     * 
     */
    public AirTravelerType.CustLoyalty createAirTravelerTypeCustLoyalty() {
        return new AirTravelerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link AirTravelerType.Document }
     * 
     */
    public AirTravelerType.Document createAirTravelerTypeDocument() {
        return new AirTravelerType.Document();
    }

    /**
     * Create an instance of {@link AirTravelerType.TravelerRefNumber }
     * 
     */
    public AirTravelerType.TravelerRefNumber createAirTravelerTypeTravelerRefNumber() {
        return new AirTravelerType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link AirTravelerType.FlightSegmentRPHs }
     * 
     */
    public AirTravelerType.FlightSegmentRPHs createAirTravelerTypeFlightSegmentRPHs() {
        return new AirTravelerType.FlightSegmentRPHs();
    }

    /**
     * Create an instance of {@link TravelerInfoType.AirTraveler.Comment }
     * 
     */
    public TravelerInfoType.AirTraveler.Comment createTravelerInfoTypeAirTravelerComment() {
        return new TravelerInfoType.AirTraveler.Comment();
    }

    /**
     * Create an instance of {@link DocumentType.AdditionalPersonNames }
     * 
     */
    public DocumentType.AdditionalPersonNames createDocumentTypeAdditionalPersonNames() {
        return new DocumentType.AdditionalPersonNames();
    }

    /**
     * Create an instance of {@link AddressType.StreetNmbr }
     * 
     */
    public AddressType.StreetNmbr createAddressTypeStreetNmbr() {
        return new AddressType.StreetNmbr();
    }

    /**
     * Create an instance of {@link AddressType.BldgRoom }
     * 
     */
    public AddressType.BldgRoom createAddressTypeBldgRoom() {
        return new AddressType.BldgRoom();
    }

    /**
     * Create an instance of {@link OrganizationType.OrgMemberName }
     * 
     */
    public OrganizationType.OrgMemberName createOrganizationTypeOrgMemberName() {
        return new OrganizationType.OrgMemberName();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialRemarks.SpecialRemark }
     * 
     */
    public SpecialReqDetailsType.SpecialRemarks.SpecialRemark createSpecialReqDetailsTypeSpecialRemarksSpecialRemark() {
        return new SpecialReqDetailsType.SpecialRemarks.SpecialRemark();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.TravelerRefNumber }
     * 
     */
    public SpecialRemarkType.TravelerRefNumber createSpecialRemarkTypeTravelerRefNumber() {
        return new SpecialRemarkType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.FlightRefNumber }
     * 
     */
    public SpecialRemarkType.FlightRefNumber createSpecialRemarkTypeFlightRefNumber() {
        return new SpecialRemarkType.FlightRefNumber();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.AuthorizedViewers.AuthorizedViewer }
     * 
     */
    public SpecialRemarkType.AuthorizedViewers.AuthorizedViewer createSpecialRemarkTypeAuthorizedViewersAuthorizedViewer() {
        return new SpecialRemarkType.AuthorizedViewers.AuthorizedViewer();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.Remarks.Remark }
     * 
     */
    public SpecialReqDetailsType.Remarks.Remark createSpecialReqDetailsTypeRemarksRemark() {
        return new SpecialReqDetailsType.Remarks.Remark();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation }
     * 
     */
    public SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation createSpecialReqDetailsTypeOtherServiceInformationsOtherServiceInformation() {
        return new SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType.TravelerRefNumber }
     * 
     */
    public OtherServiceInfoType.TravelerRefNumber createOtherServiceInfoTypeTravelerRefNumber() {
        return new OtherServiceInfoType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest }
     * 
     */
    public SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest createSpecialReqDetailsTypeSpecialServiceRequestsSpecialServiceRequest() {
        return new SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SeatRequests.SeatRequest }
     * 
     */
    public SpecialReqDetailsType.SeatRequests.SeatRequest createSpecialReqDetailsTypeSeatRequestsSeatRequest() {
        return new SpecialReqDetailsType.SeatRequests.SeatRequest();
    }

    /**
     * Create an instance of {@link OperationScheduleType.OperationTimes.OperationTime }
     * 
     */
    public OperationScheduleType.OperationTimes.OperationTime createOperationScheduleTypeOperationTimesOperationTime() {
        return new OperationScheduleType.OperationTimes.OperationTime();
    }

    /**
     * Create an instance of {@link FeaturesType.Feature.Charge }
     * 
     */
    public FeaturesType.Feature.Charge createFeaturesTypeFeatureCharge() {
        return new FeaturesType.Feature.Charge();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.GuaranteePaymentPolicy }
     * 
     */
    public PoliciesType.Policy.GuaranteePaymentPolicy createPoliciesTypePolicyGuaranteePaymentPolicy() {
        return new PoliciesType.Policy.GuaranteePaymentPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfo }
     * 
     */
    public PoliciesType.Policy.PolicyInfo createPoliciesTypePolicyPolicyInfo() {
        return new PoliciesType.Policy.PolicyInfo();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.FeePolicies }
     * 
     */
    public PoliciesType.Policy.FeePolicies createPoliciesTypePolicyFeePolicies() {
        return new PoliciesType.Policy.FeePolicies();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy.PaymentCompany createPoliciesTypePolicyCommissionPolicyPaymentCompany() {
        return new PoliciesType.Policy.CommissionPolicy.PaymentCompany();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.StayRequirements.StayRequirement }
     * 
     */
    public PoliciesType.Policy.StayRequirements.StayRequirement createPoliciesTypePolicyStayRequirementsStayRequirement() {
        return new PoliciesType.Policy.StayRequirements.StayRequirement();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
     * 
     */
    public PoliciesType.Policy.PetsPolicies.PetsPolicy createPoliciesTypePolicyPetsPoliciesPetsPolicy() {
        return new PoliciesType.Policy.PetsPolicies.PetsPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.TaxPolicies.TaxPolicy }
     * 
     */
    public PoliciesType.Policy.TaxPolicies.TaxPolicy createPoliciesTypePolicyTaxPoliciesTaxPolicy() {
        return new PoliciesType.Policy.TaxPolicies.TaxPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CheckoutCharges.CheckoutCharge }
     * 
     */
    public PoliciesType.Policy.CheckoutCharges.CheckoutCharge createPoliciesTypePolicyCheckoutChargesCheckoutCharge() {
        return new PoliciesType.Policy.CheckoutCharges.CheckoutCharge();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode }
     * 
     */
    public PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode createPoliciesTypePolicyPolicyInfoCodesPolicyInfoCode() {
        return new PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.AmountPercent createRequiredPaymentsTypeGuaranteePaymentAmountPercent() {
        return new RequiredPaymentsType.GuaranteePayment.AmountPercent();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.Deadline }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.Deadline createRequiredPaymentsTypeGuaranteePaymentDeadline() {
        return new RequiredPaymentsType.GuaranteePayment.Deadline();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.Address }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.Address createRequiredPaymentsTypeGuaranteePaymentAddress() {
        return new RequiredPaymentsType.GuaranteePayment.Address();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.CostingItems }
     * 
     */
    public PkgInvoiceDetail.CostingItems createPkgInvoiceDetailCostingItems() {
        return new PkgInvoiceDetail.CostingItems();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.GrossAmount }
     * 
     */
    public PkgInvoiceDetail.GrossAmount createPkgInvoiceDetailGrossAmount() {
        return new PkgInvoiceDetail.GrossAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.DepositAmount }
     * 
     */
    public PkgInvoiceDetail.DepositAmount createPkgInvoiceDetailDepositAmount() {
        return new PkgInvoiceDetail.DepositAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.AgentCommission }
     * 
     */
    public PkgInvoiceDetail.AgentCommission createPkgInvoiceDetailAgentCommission() {
        return new PkgInvoiceDetail.AgentCommission();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.NetAmount }
     * 
     */
    public PkgInvoiceDetail.NetAmount createPkgInvoiceDetailNetAmount() {
        return new PkgInvoiceDetail.NetAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.BalanceDueAmount }
     * 
     */
    public PkgInvoiceDetail.BalanceDueAmount createPkgInvoiceDetailBalanceDueAmount() {
        return new PkgInvoiceDetail.BalanceDueAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.AmountReceived }
     * 
     */
    public PkgInvoiceDetail.AmountReceived createPkgInvoiceDetailAmountReceived() {
        return new PkgInvoiceDetail.AmountReceived();
    }

    /**
     * Create an instance of {@link AccessesType.Access }
     * 
     */
    public AccessesType.Access createAccessesTypeAccess() {
        return new AccessesType.Access();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.ItinTotalFare }
     * 
     */
    public AirItineraryPricingInfoType.ItinTotalFare createAirItineraryPricingInfoTypeItinTotalFare() {
        return new AirItineraryPricingInfoType.ItinTotalFare();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     * 
     */
    public AirItineraryPricingInfoType.PTCFareBreakdowns createAirItineraryPricingInfoTypePTCFareBreakdowns() {
        return new AirItineraryPricingInfoType.PTCFareBreakdowns();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo createAirItineraryPricingInfoTypeFareInfosFareInfo() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo();
    }

    /**
     * Create an instance of {@link FareInfoType.FareReference }
     * 
     */
    public FareInfoType.FareReference createFareInfoTypeFareReference() {
        return new FareInfoType.FareReference();
    }

    /**
     * Create an instance of {@link FareInfoType.RuleInfo }
     * 
     */
    public FareInfoType.RuleInfo createFareInfoTypeRuleInfo() {
        return new FareInfoType.RuleInfo();
    }

    /**
     * Create an instance of {@link FareInfoType.Date }
     * 
     */
    public FareInfoType.Date createFareInfoTypeDate() {
        return new FareInfoType.Date();
    }

    /**
     * Create an instance of {@link FareInfoType.DiscountPricing }
     * 
     */
    public FareInfoType.DiscountPricing createFareInfoTypeDiscountPricing() {
        return new FareInfoType.DiscountPricing();
    }

    /**
     * Create an instance of {@link FareInfoType.City }
     * 
     */
    public FareInfoType.City createFareInfoTypeCity() {
        return new FareInfoType.City();
    }

    /**
     * Create an instance of {@link FareInfoType.Airport }
     * 
     */
    public FareInfoType.Airport createFareInfoTypeAirport() {
        return new FareInfoType.Airport();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Date }
     * 
     */
    public FareInfoType.FareInfo.Date createFareInfoTypeFareInfoDate() {
        return new FareInfoType.FareInfo.Date();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Fare }
     * 
     */
    public FareInfoType.FareInfo.Fare createFareInfoTypeFareInfoFare() {
        return new FareInfoType.FareInfo.Fare();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.PTC }
     * 
     */
    public FareInfoType.FareInfo.PTC createFareInfoTypeFareInfoPTC() {
        return new FareInfoType.FareInfo.PTC();
    }

    /**
     * Create an instance of {@link RuleInfoType.ChargesRules }
     * 
     */
    public RuleInfoType.ChargesRules createRuleInfoTypeChargesRules() {
        return new RuleInfoType.ChargesRules();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
     * 
     */
    public RuleInfoType.ResTicketingRules.AdvResTicketing createRuleInfoTypeResTicketingRulesAdvResTicketing() {
        return new RuleInfoType.ResTicketingRules.AdvResTicketing();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvReservation }
     * 
     */
    public AdvResTicketingType.AdvReservation createAdvResTicketingTypeAdvReservation() {
        return new AdvResTicketingType.AdvReservation();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvTicketing }
     * 
     */
    public AdvResTicketingType.AdvTicketing createAdvResTicketingTypeAdvTicketing() {
        return new AdvResTicketingType.AdvTicketing();
    }

    /**
     * Create an instance of {@link FareType.BaseFare }
     * 
     */
    public FareType.BaseFare createFareTypeBaseFare() {
        return new FareType.BaseFare();
    }

    /**
     * Create an instance of {@link FareType.EquivFare }
     * 
     */
    public FareType.EquivFare createFareTypeEquivFare() {
        return new FareType.EquivFare();
    }

    /**
     * Create an instance of {@link FareType.Taxes }
     * 
     */
    public FareType.Taxes createFareTypeTaxes() {
        return new FareType.Taxes();
    }

    /**
     * Create an instance of {@link FareType.Fees }
     * 
     */
    public FareType.Fees createFareTypeFees() {
        return new FareType.Fees();
    }

    /**
     * Create an instance of {@link FareType.TotalFare }
     * 
     */
    public FareType.TotalFare createFareTypeTotalFare() {
        return new FareType.TotalFare();
    }

    /**
     * Create an instance of {@link FareType.FareConstruction }
     * 
     */
    public FareType.FareConstruction createFareTypeFareConstruction() {
        return new FareType.FareConstruction();
    }

    /**
     * Create an instance of {@link FareType.UnstructuredFareCalc }
     * 
     */
    public FareType.UnstructuredFareCalc createFareTypeUnstructuredFareCalc() {
        return new FareType.UnstructuredFareCalc();
    }

    /**
     * Create an instance of {@link FareType.FareBaggageAllowance }
     * 
     */
    public FareType.FareBaggageAllowance createFareTypeFareBaggageAllowance() {
        return new FareType.FareBaggageAllowance();
    }

    /**
     * Create an instance of {@link FareType.TourCode }
     * 
     */
    public FareType.TourCode createFareTypeTourCode() {
        return new FareType.TourCode();
    }

    /**
     * Create an instance of {@link FareType.Remark }
     * 
     */
    public FareType.Remark createFareTypeRemark() {
        return new FareType.Remark();
    }

    /**
     * Create an instance of {@link FareType.OriginalIssueInfo }
     * 
     */
    public FareType.OriginalIssueInfo createFareTypeOriginalIssueInfo() {
        return new FareType.OriginalIssueInfo();
    }

    /**
     * Create an instance of {@link FareType.Discounts.Discount }
     * 
     */
    public FareType.Discounts.Discount createFareTypeDiscountsDiscount() {
        return new FareType.Discounts.Discount();
    }

    /**
     * Create an instance of {@link FareType.ExchangeInfo.CouponInfo }
     * 
     */
    public FareType.ExchangeInfo.CouponInfo createFareTypeExchangeInfoCouponInfo() {
        return new FareType.ExchangeInfo.CouponInfo();
    }

    /**
     * Create an instance of {@link FareType.ExchangeInfo.OriginalOriginDestination }
     * 
     */
    public FareType.ExchangeInfo.OriginalOriginDestination createFareTypeExchangeInfoOriginalOriginDestination() {
        return new FareType.ExchangeInfo.OriginalOriginDestination();
    }

    /**
     * Create an instance of {@link AddressesType.Address }
     * 
     */
    public AddressesType.Address createAddressesTypeAddress() {
        return new AddressesType.Address();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.RentalCar }
     * 
     */
    public ItineraryItemResponseType.RentalCar createItineraryItemResponseTypeRentalCar() {
        return new ItineraryItemResponseType.RentalCar();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType.PickUpLocation }
     * 
     */
    public VehicleRentalCoreType.PickUpLocation createVehicleRentalCoreTypePickUpLocation() {
        return new VehicleRentalCoreType.PickUpLocation();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType.ReturnLocation }
     * 
     */
    public VehicleRentalCoreType.ReturnLocation createVehicleRentalCoreTypeReturnLocation() {
        return new VehicleRentalCoreType.ReturnLocation();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.AccommodationClass }
     * 
     */
    public ItineraryItemResponseType.Accommodation.AccommodationClass createItineraryItemResponseTypeAccommodationAccommodationClass() {
        return new ItineraryItemResponseType.Accommodation.AccommodationClass();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.MealPlans }
     * 
     */
    public ItineraryItemResponseType.Accommodation.MealPlans createItineraryItemResponseTypeAccommodationMealPlans() {
        return new ItineraryItemResponseType.Accommodation.MealPlans();
    }

    /**
     * Create an instance of {@link RoomProfileType.PassengerRPHs }
     * 
     */
    public RoomProfileType.PassengerRPHs createRoomProfileTypePassengerRPHs() {
        return new RoomProfileType.PassengerRPHs();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price createItineraryItemResponseTypeAccommodationRoomProfilesRoomProfilePricesPrice() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.TypeRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.TypeRoom createFacilityInfoTypeGuestRoomsGuestRoomTypeRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom.TypeRoom();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity createFacilityInfoTypeGuestRoomsGuestRoomAmenitiesAmenity() {
        return new FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.Codes }
     * 
     */
    public FacilityInfoType.MeetingRooms.Codes createFacilityInfoTypeMeetingRoomsCodes() {
        return new FacilityInfoType.MeetingRooms.Codes();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.Codes }
     * 
     */
    public MeetingRoomsType.MeetingRoom.Codes createMeetingRoomsTypeMeetingRoomCodes() {
        return new MeetingRoomsType.MeetingRoom.Codes();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.Dimension }
     * 
     */
    public MeetingRoomsType.MeetingRoom.Dimension createMeetingRoomsTypeMeetingRoomDimension() {
        return new MeetingRoomsType.MeetingRoom.Dimension();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.AvailableCapacities }
     * 
     */
    public MeetingRoomsType.MeetingRoom.AvailableCapacities createMeetingRoomsTypeMeetingRoomAvailableCapacities() {
        return new MeetingRoomsType.MeetingRoom.AvailableCapacities();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Position }
     * 
     */
    public BasicPropertyInfoType.Position createBasicPropertyInfoTypePosition() {
        return new BasicPropertyInfoType.Position();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Award }
     * 
     */
    public BasicPropertyInfoType.Award createBasicPropertyInfoTypeAward() {
        return new BasicPropertyInfoType.Award();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.HotelAmenity }
     * 
     */
    public BasicPropertyInfoType.HotelAmenity createBasicPropertyInfoTypeHotelAmenity() {
        return new BasicPropertyInfoType.HotelAmenity();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Recreation }
     * 
     */
    public BasicPropertyInfoType.Recreation createBasicPropertyInfoTypeRecreation() {
        return new BasicPropertyInfoType.Recreation();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Service }
     * 
     */
    public BasicPropertyInfoType.Service createBasicPropertyInfoTypeService() {
        return new BasicPropertyInfoType.Service();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Policy }
     * 
     */
    public BasicPropertyInfoType.Policy createBasicPropertyInfoTypePolicy() {
        return new BasicPropertyInfoType.Policy();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.ContactNumbers.ContactNumber }
     * 
     */
    public BasicPropertyInfoType.ContactNumbers.ContactNumber createBasicPropertyInfoTypeContactNumbersContactNumber() {
        return new BasicPropertyInfoType.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PkgPassengerListItem.SpecialNeed }
     * 
     */
    public PkgPassengerListItem.SpecialNeed createPkgPassengerListItemSpecialNeed() {
        return new PkgPassengerListItem.SpecialNeed();
    }

    /**
     * Create an instance of {@link VideoDescriptionType.VideoFormat }
     * 
     */
    public VideoDescriptionType.VideoFormat createVideoDescriptionTypeVideoFormat() {
        return new VideoDescriptionType.VideoFormat();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos }
     * 
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos createVehicleLocationAdditionalDetailsTypeVehRentLocInfos() {
        return new VehicleLocationAdditionalDetailsType.VehRentLocInfos();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation }
     * 
     */
    public VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation createVehicleLocationAdditionalDetailsTypeOneWayDropLocationsOneWayDropLocation() {
        return new VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo createVehicleLocationAdditionalDetailsTypeShuttleShuttleInfosShuttleInfo() {
        return new VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.DepartureAirport }
     * 
     */
    public FlightSegmentBaseType.DepartureAirport createFlightSegmentBaseTypeDepartureAirport() {
        return new FlightSegmentBaseType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.ArrivalAirport }
     * 
     */
    public FlightSegmentBaseType.ArrivalAirport createFlightSegmentBaseTypeArrivalAirport() {
        return new FlightSegmentBaseType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link ItineraryItemRequestType.RentalCar }
     * 
     */
    public ItineraryItemRequestType.RentalCar createItineraryItemRequestTypeRentalCar() {
        return new ItineraryItemRequestType.RentalCar();
    }

    /**
     * Create an instance of {@link PaymentFormType.Voucher }
     * 
     */
    public PaymentFormType.Voucher createPaymentFormTypeVoucher() {
        return new PaymentFormType.Voucher();
    }

    /**
     * Create an instance of {@link PaymentFormType.MiscChargeOrder }
     * 
     */
    public PaymentFormType.MiscChargeOrder createPaymentFormTypeMiscChargeOrder() {
        return new PaymentFormType.MiscChargeOrder();
    }

    /**
     * Create an instance of {@link PaymentFormType.Cash }
     * 
     */
    public PaymentFormType.Cash createPaymentFormTypeCash() {
        return new PaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link PaymentResponseType.PaymentAmount }
     * 
     */
    public PaymentResponseType.PaymentAmount createPaymentResponseTypePaymentAmount() {
        return new PaymentResponseType.PaymentAmount();
    }

    /**
     * Create an instance of {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
     * 
     */
    public PaymentFormType.Ticket.ConjunctionTicketNbr createPaymentFormTypeTicketConjunctionTicketNbr() {
        return new PaymentFormType.Ticket.ConjunctionTicketNbr();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
     * 
     */
    public PaymentFormType.LoyaltyRedemption.LoyaltyCertificate createPaymentFormTypeLoyaltyRedemptionLoyaltyCertificate() {
        return new PaymentFormType.LoyaltyRedemption.LoyaltyCertificate();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.StartDateWindow }
     * 
     */
    public DateTimeSpanType.StartDateWindow createDateTimeSpanTypeStartDateWindow() {
        return new DateTimeSpanType.StartDateWindow();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.EndDateWindow }
     * 
     */
    public DateTimeSpanType.EndDateWindow createDateTimeSpanTypeEndDateWindow() {
        return new DateTimeSpanType.EndDateWindow();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.DaysOfWeeks }
     * 
     */
    public InvBlockRoomType.DaysOfWeeks createInvBlockRoomTypeDaysOfWeeks() {
        return new InvBlockRoomType.DaysOfWeeks();
    }

    /**
     * Create an instance of {@link RateUploadType.GuaranteePolicies }
     * 
     */
    public RateUploadType.GuaranteePolicies createRateUploadTypeGuaranteePolicies() {
        return new RateUploadType.GuaranteePolicies();
    }

    /**
     * Create an instance of {@link RateUploadType.MealsIncluded }
     * 
     */
    public RateUploadType.MealsIncluded createRateUploadTypeMealsIncluded() {
        return new RateUploadType.MealsIncluded();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RatePlans.RatePlan.MarketCode }
     * 
     */
    public InvBlockRoomType.RatePlans.RatePlan.MarketCode createInvBlockRoomTypeRatePlansRatePlanMarketCode() {
        return new InvBlockRoomType.RatePlans.RatePlan.MarketCode();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RatePlans.RatePlan.MethodInfo }
     * 
     */
    public InvBlockRoomType.RatePlans.RatePlan.MethodInfo createInvBlockRoomTypeRatePlansRatePlanMethodInfo() {
        return new InvBlockRoomType.RatePlans.RatePlan.MethodInfo();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks }
     * 
     */
    public InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks createInvBlockRoomTypeRatePlansRatePlanDaysOfWeeks() {
        return new InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks();
    }

    /**
     * Create an instance of {@link RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount }
     * 
     */
    public RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount createRateUploadTypeAdditionalGuestAmountsAdditionalGuestAmount() {
        return new RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount();
    }

    /**
     * Create an instance of {@link RateUploadType.BaseByGuestAmts.BaseByGuestAmt }
     * 
     */
    public RateUploadType.BaseByGuestAmts.BaseByGuestAmt createRateUploadTypeBaseByGuestAmtsBaseByGuestAmt() {
        return new RateUploadType.BaseByGuestAmts.BaseByGuestAmt();
    }

    /**
     * Create an instance of {@link InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation }
     * 
     */
    public InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation createInvBlockRoomTypeRoomTypeAllocationsRoomTypeAllocation() {
        return new InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.NegotiatedFareCode }
     * 
     */
    public PriceRequestInformationType.NegotiatedFareCode createPriceRequestInformationTypeNegotiatedFareCode() {
        return new PriceRequestInformationType.NegotiatedFareCode();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.RebookOption }
     * 
     */
    public PriceRequestInformationType.RebookOption createPriceRequestInformationTypeRebookOption() {
        return new PriceRequestInformationType.RebookOption();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref createTravelerInfoSummaryTypePriceRequestInformationFareRestrictionPref() {
        return new TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride createTravelerInfoSummaryTypePriceRequestInformationSegmentOverride() {
        return new TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.Account }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.Account createTravelerInfoSummaryTypePriceRequestInformationAccount() {
        return new TravelerInfoSummaryType.PriceRequestInformation.Account();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement createTravelerInfoSummaryTypePriceRequestInformationLocationRequirement() {
        return new TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference createTravelerInfoSummaryTypePriceRequestInformationDiscountPricingFlightReference() {
        return new TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference();
    }

    /**
     * Create an instance of {@link CabinOptionType.CabinConfiguration }
     * 
     */
    public CabinOptionType.CabinConfiguration createCabinOptionTypeCabinConfiguration() {
        return new CabinOptionType.CabinConfiguration();
    }

    /**
     * Create an instance of {@link CabinOptionType.MeasurementInfo }
     * 
     */
    public CabinOptionType.MeasurementInfo createCabinOptionTypeMeasurementInfo() {
        return new CabinOptionType.MeasurementInfo();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType.FlightSegment }
     * 
     */
    public OriginDestinationOptionType.FlightSegment createOriginDestinationOptionTypeFlightSegment() {
        return new OriginDestinationOptionType.FlightSegment();
    }

    /**
     * Create an instance of {@link FlightSegmentType.MarketingAirline }
     * 
     */
    public FlightSegmentType.MarketingAirline createFlightSegmentTypeMarketingAirline() {
        return new FlightSegmentType.MarketingAirline();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.StopLocation }
     * 
     */
    public BookFlightSegmentType.StopLocation createBookFlightSegmentTypeStopLocation() {
        return new BookFlightSegmentType.StopLocation();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvails.BookingClassAvail }
     * 
     */
    public BookFlightSegmentType.BookingClassAvails.BookingClassAvail createBookFlightSegmentTypeBookingClassAvailsBookingClassAvail() {
        return new BookFlightSegmentType.BookingClassAvails.BookingClassAvail();
    }

    /**
     * Create an instance of {@link AreaInfoType.RefPoints }
     * 
     */
    public AreaInfoType.RefPoints createAreaInfoTypeRefPoints() {
        return new AreaInfoType.RefPoints();
    }

    /**
     * Create an instance of {@link AreaInfoType.OtherHotels.OtherHotel }
     * 
     */
    public AreaInfoType.OtherHotels.OtherHotel createAreaInfoTypeOtherHotelsOtherHotel() {
        return new AreaInfoType.OtherHotels.OtherHotel();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
     * 
     */
    public AreaInfoType.Recreations.Recreation.MultimediaDescriptions createAreaInfoTypeRecreationsRecreationMultimediaDescriptions() {
        return new AreaInfoType.Recreations.Recreation.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail }
     * 
     */
    public AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail createAreaInfoTypeRecreationsRecreationRecreationDetailsRecreationDetail() {
        return new AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction.Contact }
     * 
     */
    public AreaInfoType.Attractions.Attraction.Contact createAreaInfoTypeAttractionsAttractionContact() {
        return new AreaInfoType.Attractions.Attraction.Contact();
    }

    /**
     * Create an instance of {@link ContactInfoType.CompanyName }
     * 
     */
    public ContactInfoType.CompanyName createContactInfoTypeCompanyName() {
        return new ContactInfoType.CompanyName();
    }

    /**
     * Create an instance of {@link RefPointsType.RefPoint }
     * 
     */
    public RefPointsType.RefPoint createRefPointsTypeRefPoint() {
        return new RefPointsType.RefPoint();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.MealsIncluded }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.MealsIncluded createRatePlanCandidatesTypeRatePlanCandidateMealsIncluded() {
        return new RatePlanCandidatesType.RatePlanCandidate.MealsIncluded();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy createRatePlanCandidatesTypeRatePlanCandidateArrivalPolicy() {
        return new RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission createRatePlanCandidatesTypeRatePlanCandidateRatePlanCommission() {
        return new RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef createRatePlanCandidatesTypeRatePlanCandidateHotelRefsHotelRef() {
        return new RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef();
    }

    /**
     * Create an instance of {@link PaymentDetailType.PaymentAmount }
     * 
     */
    public PaymentDetailType.PaymentAmount createPaymentDetailTypePaymentAmount() {
        return new PaymentDetailType.PaymentAmount();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo createVehicleAdditionalDriverRequirementsTypeAddlDriverInfosAddlDriverInfo() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle createVehicleAdditionalDriverRequirementsTypeAddlDriverInfosVehiclesVehicle() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehType }
     * 
     */
    public VehicleCoreType.VehType createVehicleCoreTypeVehType() {
        return new VehicleCoreType.VehType();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehClass }
     * 
     */
    public VehicleCoreType.VehClass createVehicleCoreTypeVehClass() {
        return new VehicleCoreType.VehClass();
    }

    /**
     * Create an instance of {@link SailingInfoType.SelectedSailing }
     * 
     */
    public SailingInfoType.SelectedSailing createSailingInfoTypeSelectedSailing() {
        return new SailingInfoType.SelectedSailing();
    }

    /**
     * Create an instance of {@link SailingInfoType.InclusivePackageOption }
     * 
     */
    public SailingInfoType.InclusivePackageOption createSailingInfoTypeInclusivePackageOption() {
        return new SailingInfoType.InclusivePackageOption();
    }

    /**
     * Create an instance of {@link SailingInfoType.Currency }
     * 
     */
    public SailingInfoType.Currency createSailingInfoTypeCurrency() {
        return new SailingInfoType.Currency();
    }

    /**
     * Create an instance of {@link SailingBaseType.CruiseLine }
     * 
     */
    public SailingBaseType.CruiseLine createSailingBaseTypeCruiseLine() {
        return new SailingBaseType.CruiseLine();
    }

    /**
     * Create an instance of {@link SailingBaseType.Region }
     * 
     */
    public SailingBaseType.Region createSailingBaseTypeRegion() {
        return new SailingBaseType.Region();
    }

    /**
     * Create an instance of {@link SailingBaseType.DeparturePort }
     * 
     */
    public SailingBaseType.DeparturePort createSailingBaseTypeDeparturePort() {
        return new SailingBaseType.DeparturePort();
    }

    /**
     * Create an instance of {@link SailingBaseType.ArrivalPort }
     * 
     */
    public SailingBaseType.ArrivalPort createSailingBaseTypeArrivalPort() {
        return new SailingBaseType.ArrivalPort();
    }

    /**
     * Create an instance of {@link AirlinePrefType.VendorPref }
     * 
     */
    public AirlinePrefType.VendorPref createAirlinePrefTypeVendorPref() {
        return new AirlinePrefType.VendorPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FareRestrictPref }
     * 
     */
    public AirlinePrefType.FareRestrictPref createAirlinePrefTypeFareRestrictPref() {
        return new AirlinePrefType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FarePref }
     * 
     */
    public AirlinePrefType.FarePref createAirlinePrefTypeFarePref() {
        return new AirlinePrefType.FarePref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FlightTypePref }
     * 
     */
    public AirlinePrefType.FlightTypePref createAirlinePrefTypeFlightTypePref() {
        return new AirlinePrefType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.CabinPref }
     * 
     */
    public AirlinePrefType.CabinPref createAirlinePrefTypeCabinPref() {
        return new AirlinePrefType.CabinPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SeatPref }
     * 
     */
    public AirlinePrefType.SeatPref createAirlinePrefTypeSeatPref() {
        return new AirlinePrefType.SeatPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SSRPref }
     * 
     */
    public AirlinePrefType.SSRPref createAirlinePrefTypeSSRPref() {
        return new AirlinePrefType.SSRPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.KeywordPref }
     * 
     */
    public AirlinePrefType.KeywordPref createAirlinePrefTypeKeywordPref() {
        return new AirlinePrefType.KeywordPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.AccountInformation.TaxRegistrationDetails }
     * 
     */
    public AirlinePrefType.AccountInformation.TaxRegistrationDetails createAirlinePrefTypeAccountInformationTaxRegistrationDetails() {
        return new AirlinePrefType.AccountInformation.TaxRegistrationDetails();
    }

    /**
     * Create an instance of {@link AirlinePrefType.TourCodePref.TourCodeInfo }
     * 
     */
    public AirlinePrefType.TourCodePref.TourCodeInfo createAirlinePrefTypeTourCodePrefTourCodeInfo() {
        return new AirlinePrefType.TourCodePref.TourCodeInfo();
    }

    /**
     * Create an instance of {@link AirlinePrefType.TourCodePref.StaffTourCodeInfo }
     * 
     */
    public AirlinePrefType.TourCodePref.StaffTourCodeInfo createAirlinePrefTypeTourCodePrefStaffTourCodeInfo() {
        return new AirlinePrefType.TourCodePref.StaffTourCodeInfo();
    }

    /**
     * Create an instance of {@link CruiseReservationType.PaymentsDue.PaymentDue }
     * 
     */
    public CruiseReservationType.PaymentsDue.PaymentDue createCruiseReservationTypePaymentsDuePaymentDue() {
        return new CruiseReservationType.PaymentsDue.PaymentDue();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Position }
     * 
     */
    public ItemSearchCriterionType.Position createItemSearchCriterionTypePosition() {
        return new ItemSearchCriterionType.Position();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Address }
     * 
     */
    public ItemSearchCriterionType.Address createItemSearchCriterionTypeAddress() {
        return new ItemSearchCriterionType.Address();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Telephone }
     * 
     */
    public ItemSearchCriterionType.Telephone createItemSearchCriterionTypeTelephone() {
        return new ItemSearchCriterionType.Telephone();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.RefPoint }
     * 
     */
    public ItemSearchCriterionType.RefPoint createItemSearchCriterionTypeRefPoint() {
        return new ItemSearchCriterionType.RefPoint();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.CodeRef }
     * 
     */
    public ItemSearchCriterionType.CodeRef createItemSearchCriterionTypeCodeRef() {
        return new ItemSearchCriterionType.CodeRef();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.HotelRef }
     * 
     */
    public ItemSearchCriterionType.HotelRef createItemSearchCriterionTypeHotelRef() {
        return new ItemSearchCriterionType.HotelRef();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Radius }
     * 
     */
    public ItemSearchCriterionType.Radius createItemSearchCriterionTypeRadius() {
        return new ItemSearchCriterionType.Radius();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.MapArea }
     * 
     */
    public ItemSearchCriterionType.MapArea createItemSearchCriterionTypeMapArea() {
        return new ItemSearchCriterionType.MapArea();
    }

    /**
     * Create an instance of {@link ParagraphType.ListItem }
     * 
     */
    public ParagraphType.ListItem createParagraphTypeListItem() {
        return new ParagraphType.ListItem();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType.Meal }
     * 
     */
    public CabinAvailabilityType.Meal createCabinAvailabilityTypeMeal() {
        return new CabinAvailabilityType.Meal();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType.BaggageAllowance }
     * 
     */
    public CabinAvailabilityType.BaggageAllowance createCabinAvailabilityTypeBaggageAllowance() {
        return new CabinAvailabilityType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PickUpReturnDetails }
     * 
     */
    public VehicleRentalTransactionType.PickUpReturnDetails createVehicleRentalTransactionTypePickUpReturnDetails() {
        return new VehicleRentalTransactionType.PickUpReturnDetails();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.Vehicle }
     * 
     */
    public VehicleRentalTransactionType.Vehicle createVehicleRentalTransactionTypeVehicle() {
        return new VehicleRentalTransactionType.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.Fees }
     * 
     */
    public VehicleRentalTransactionType.Fees createVehicleRentalTransactionTypeFees() {
        return new VehicleRentalTransactionType.Fees();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.TotalCharge }
     * 
     */
    public VehicleRentalTransactionType.TotalCharge createVehicleRentalTransactionTypeTotalCharge() {
        return new VehicleRentalTransactionType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PricedEquips.PricedEquip.Equipment }
     * 
     */
    public VehicleRentalTransactionType.PricedEquips.PricedEquip.Equipment createVehicleRentalTransactionTypePricedEquipsPricedEquipEquipment() {
        return new VehicleRentalTransactionType.PricedEquips.PricedEquip.Equipment();
    }

    /**
     * Create an instance of {@link VehicleType.VehMakeModel }
     * 
     */
    public VehicleType.VehMakeModel createVehicleTypeVehMakeModel() {
        return new VehicleType.VehMakeModel();
    }

    /**
     * Create an instance of {@link VehicleType.VehIdentity }
     * 
     */
    public VehicleType.VehIdentity createVehicleTypeVehIdentity() {
        return new VehicleType.VehIdentity();
    }

    /**
     * Create an instance of {@link TransportInfoType.TransportInfo }
     * 
     */
    public TransportInfoType.TransportInfo createTransportInfoTypeTransportInfo() {
        return new TransportInfoType.TransportInfo();
    }

    /**
     * Create an instance of {@link AccommodationInfoType.Resort }
     * 
     */
    public AccommodationInfoType.Resort createAccommodationInfoTypeResort() {
        return new AccommodationInfoType.Resort();
    }

    /**
     * Create an instance of {@link AccommodationInfoType.AccommodationClass }
     * 
     */
    public AccommodationInfoType.AccommodationClass createAccommodationInfoTypeAccommodationClass() {
        return new AccommodationInfoType.AccommodationClass();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType.AvailableSeats }
     * 
     */
    public PkgAirSegmentType.AvailableSeats createPkgAirSegmentTypeAvailableSeats() {
        return new PkgAirSegmentType.AvailableSeats();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType.Passengers }
     * 
     */
    public PkgAirSegmentType.Passengers createPkgAirSegmentTypePassengers() {
        return new PkgAirSegmentType.Passengers();
    }

    /**
     * Create an instance of {@link RowDetailsType.AirRowCharacteristics }
     * 
     */
    public RowDetailsType.AirRowCharacteristics createRowDetailsTypeAirRowCharacteristics() {
        return new RowDetailsType.AirRowCharacteristics();
    }

    /**
     * Create an instance of {@link RowDetailsType.AirSeats.AirSeat }
     * 
     */
    public RowDetailsType.AirSeats.AirSeat createRowDetailsTypeAirSeatsAirSeat() {
        return new RowDetailsType.AirSeats.AirSeat();
    }

    /**
     * Create an instance of {@link CustomerType.Telephone }
     * 
     */
    public CustomerType.Telephone createCustomerTypeTelephone() {
        return new CustomerType.Telephone();
    }

    /**
     * Create an instance of {@link CustomerType.Email }
     * 
     */
    public CustomerType.Email createCustomerTypeEmail() {
        return new CustomerType.Email();
    }

    /**
     * Create an instance of {@link CustomerType.Address }
     * 
     */
    public CustomerType.Address createCustomerTypeAddress() {
        return new CustomerType.Address();
    }

    /**
     * Create an instance of {@link CustomerType.URL }
     * 
     */
    public CustomerType.URL createCustomerTypeURL() {
        return new CustomerType.URL();
    }

    /**
     * Create an instance of {@link CustomerType.CitizenCountryName }
     * 
     */
    public CustomerType.CitizenCountryName createCustomerTypeCitizenCountryName() {
        return new CustomerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link CustomerType.PhysChallName }
     * 
     */
    public CustomerType.PhysChallName createCustomerTypePhysChallName() {
        return new CustomerType.PhysChallName();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty }
     * 
     */
    public CustomerType.CustLoyalty createCustomerTypeCustLoyalty() {
        return new CustomerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link CustomerType.AdditionalLanguage }
     * 
     */
    public CustomerType.AdditionalLanguage createCustomerTypeAdditionalLanguage() {
        return new CustomerType.AdditionalLanguage();
    }

    /**
     * Create an instance of {@link CustomerType.PaymentForm.AssociatedSupplier }
     * 
     */
    public CustomerType.PaymentForm.AssociatedSupplier createCustomerTypePaymentFormAssociatedSupplier() {
        return new CustomerType.PaymentForm.AssociatedSupplier();
    }

    /**
     * Create an instance of {@link OrdersType.Order.Products.Product }
     * 
     */
    public OrdersType.Order.Products.Product createOrdersTypeOrderProductsProduct() {
        return new OrdersType.Order.Products.Product();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateDistance }
     * 
     */
    public VehicleRentalRateType.RateDistance createVehicleRentalRateTypeRateDistance() {
        return new VehicleRentalRateType.RateDistance();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.VehicleCharges }
     * 
     */
    public VehicleRentalRateType.VehicleCharges createVehicleRentalRateTypeVehicleCharges() {
        return new VehicleRentalRateType.VehicleCharges();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateQualifier }
     * 
     */
    public VehicleRentalRateType.RateQualifier createVehicleRentalRateTypeRateQualifier() {
        return new VehicleRentalRateType.RateQualifier();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateRestrictions }
     * 
     */
    public VehicleRentalRateType.RateRestrictions createVehicleRentalRateTypeRateRestrictions() {
        return new VehicleRentalRateType.RateRestrictions();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateGuarantee }
     * 
     */
    public VehicleRentalRateType.RateGuarantee createVehicleRentalRateTypeRateGuarantee() {
        return new VehicleRentalRateType.RateGuarantee();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.PickupReturnRule }
     * 
     */
    public VehicleRentalRateType.PickupReturnRule createVehicleRentalRateTypePickupReturnRule() {
        return new VehicleRentalRateType.PickupReturnRule();
    }

    /**
     * Create an instance of {@link RateQualifierType.RateComments.RateComment }
     * 
     */
    public RateQualifierType.RateComments.RateComment createRateQualifierTypeRateCommentsRateComment() {
        return new RateQualifierType.RateComments.RateComment();
    }

    /**
     * Create an instance of {@link ProductDescriptionsType.ProductDescription }
     * 
     */
    public ProductDescriptionsType.ProductDescription createProductDescriptionsTypeProductDescription() {
        return new ProductDescriptionsType.ProductDescription();
    }

    /**
     * Create an instance of {@link RateRulesType.AdvanceBooking }
     * 
     */
    public RateRulesType.AdvanceBooking createRateRulesTypeAdvanceBooking() {
        return new RateRulesType.AdvanceBooking();
    }

    /**
     * Create an instance of {@link RateRulesType.RateGuarantee }
     * 
     */
    public RateRulesType.RateGuarantee createRateRulesTypeRateGuarantee() {
        return new RateRulesType.RateGuarantee();
    }

    /**
     * Create an instance of {@link RateRulesType.RateDeposit }
     * 
     */
    public RateRulesType.RateDeposit createRateRulesTypeRateDeposit() {
        return new RateRulesType.RateDeposit();
    }

    /**
     * Create an instance of {@link RateRulesType.CancelPenaltyInfo.Deadline }
     * 
     */
    public RateRulesType.CancelPenaltyInfo.Deadline createRateRulesTypeCancelPenaltyInfoDeadline() {
        return new RateRulesType.CancelPenaltyInfo.Deadline();
    }

    /**
     * Create an instance of {@link RateRulesType.CancelPenaltyInfo.PenaltyFee }
     * 
     */
    public RateRulesType.CancelPenaltyInfo.PenaltyFee createRateRulesTypeCancelPenaltyInfoPenaltyFee() {
        return new RateRulesType.CancelPenaltyInfo.PenaltyFee();
    }

    /**
     * Create an instance of {@link RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment }
     * 
     */
    public RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment createRateRulesTypePaymentRulesAcceptablePaymentsAcceptablePayment() {
        return new RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment();
    }

    /**
     * Create an instance of {@link RateRulesType.PickupReturnRules.EarliestPickup }
     * 
     */
    public RateRulesType.PickupReturnRules.EarliestPickup createRateRulesTypePickupReturnRulesEarliestPickup() {
        return new RateRulesType.PickupReturnRules.EarliestPickup();
    }

    /**
     * Create an instance of {@link RateRulesType.PickupReturnRules.LatestPickup }
     * 
     */
    public RateRulesType.PickupReturnRules.LatestPickup createRateRulesTypePickupReturnRulesLatestPickup() {
        return new RateRulesType.PickupReturnRules.LatestPickup();
    }

    /**
     * Create an instance of {@link RateRulesType.PickupReturnRules.LatestReturn }
     * 
     */
    public RateRulesType.PickupReturnRules.LatestReturn createRateRulesTypePickupReturnRulesLatestReturn() {
        return new RateRulesType.PickupReturnRules.LatestReturn();
    }

    /**
     * Create an instance of {@link RateRulesType.PickupReturnRules.EarliestReturn }
     * 
     */
    public RateRulesType.PickupReturnRules.EarliestReturn createRateRulesTypePickupReturnRulesEarliestReturn() {
        return new RateRulesType.PickupReturnRules.EarliestReturn();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType.Address }
     * 
     */
    public OffLocationServiceCoreType.Address createOffLocationServiceCoreTypeAddress() {
        return new OffLocationServiceCoreType.Address();
    }

    /**
     * Create an instance of {@link DestinationSystemCodesType.DestinationSystemCode }
     * 
     */
    public DestinationSystemCodesType.DestinationSystemCode createDestinationSystemCodesTypeDestinationSystemCode() {
        return new DestinationSystemCodesType.DestinationSystemCode();
    }

    /**
     * Create an instance of {@link SellableProductsType.SellableProduct.InventoryBlock }
     * 
     */
    public SellableProductsType.SellableProduct.InventoryBlock createSellableProductsTypeSellableProductInventoryBlock() {
        return new SellableProductsType.SellableProduct.InventoryBlock();
    }

    /**
     * Create an instance of {@link SellableProductsType.SellableProduct.DestinationSystemCodes.DestinationSystemCode }
     * 
     */
    public SellableProductsType.SellableProduct.DestinationSystemCodes.DestinationSystemCode createSellableProductsTypeSellableProductDestinationSystemCodesDestinationSystemCode() {
        return new SellableProductsType.SellableProduct.DestinationSystemCodes.DestinationSystemCode();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.TotalCharge }
     * 
     */
    public VehicleAvailCoreType.TotalCharge createVehicleAvailCoreTypeTotalCharge() {
        return new VehicleAvailCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.PricedEquips }
     * 
     */
    public VehicleAvailCoreType.PricedEquips createVehicleAvailCoreTypePricedEquips() {
        return new VehicleAvailCoreType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Fees }
     * 
     */
    public VehicleAvailCoreType.Fees createVehicleAvailCoreTypeFees() {
        return new VehicleAvailCoreType.Fees();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Reference }
     * 
     */
    public VehicleAvailCoreType.Reference createVehicleAvailCoreTypeReference() {
        return new VehicleAvailCoreType.Reference();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Vendor }
     * 
     */
    public VehicleAvailCoreType.Vendor createVehicleAvailCoreTypeVendor() {
        return new VehicleAvailCoreType.Vendor();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.VendorLocation }
     * 
     */
    public VehicleAvailCoreType.VendorLocation createVehicleAvailCoreTypeVendorLocation() {
        return new VehicleAvailCoreType.VendorLocation();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.DropOffLocation }
     * 
     */
    public VehicleAvailCoreType.DropOffLocation createVehicleAvailCoreTypeDropOffLocation() {
        return new VehicleAvailCoreType.DropOffLocation();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Discount }
     * 
     */
    public VehicleAvailCoreType.Discount createVehicleAvailCoreTypeDiscount() {
        return new VehicleAvailCoreType.Discount();
    }

    /**
     * Create an instance of {@link RecipientInfosType.RecipientInfo.ShippingInfo }
     * 
     */
    public RecipientInfosType.RecipientInfo.ShippingInfo createRecipientInfosTypeRecipientInfoShippingInfo() {
        return new RecipientInfosType.RecipientInfo.ShippingInfo();
    }

    /**
     * Create an instance of {@link RecipientInfosType.RecipientInfo.Comments }
     * 
     */
    public RecipientInfosType.RecipientInfo.Comments createRecipientInfosTypeRecipientInfoComments() {
        return new RecipientInfosType.RecipientInfo.Comments();
    }

    /**
     * Create an instance of {@link CommonPrefType.ContactPref }
     * 
     */
    public CommonPrefType.ContactPref createCommonPrefTypeContactPref() {
        return new CommonPrefType.ContactPref();
    }

    /**
     * Create an instance of {@link CostingItemType.UnitCost }
     * 
     */
    public CostingItemType.UnitCost createCostingItemTypeUnitCost() {
        return new CostingItemType.UnitCost();
    }

    /**
     * Create an instance of {@link CostingItemType.ExtendedCost }
     * 
     */
    public CostingItemType.ExtendedCost createCostingItemTypeExtendedCost() {
        return new CostingItemType.ExtendedCost();
    }

    /**
     * Create an instance of {@link CostingItemType.Commission }
     * 
     */
    public CostingItemType.Commission createCostingItemTypeCommission() {
        return new CostingItemType.Commission();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.DriverType }
     * 
     */
    public VehicleAvailRQCoreType.DriverType createVehicleAvailRQCoreTypeDriverType() {
        return new VehicleAvailRQCoreType.DriverType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.RateQualifier }
     * 
     */
    public VehicleAvailRQCoreType.RateQualifier createVehicleAvailRQCoreTypeRateQualifier() {
        return new VehicleAvailRQCoreType.RateQualifier();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.RateRange }
     * 
     */
    public VehicleAvailRQCoreType.RateRange createVehicleAvailRQCoreTypeRateRange() {
        return new VehicleAvailRQCoreType.RateRange();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.SpecialEquipPrefs.SpecialEquipPref }
     * 
     */
    public VehicleAvailRQCoreType.SpecialEquipPrefs.SpecialEquipPref createVehicleAvailRQCoreTypeSpecialEquipPrefsSpecialEquipPref() {
        return new VehicleAvailRQCoreType.SpecialEquipPrefs.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.VehPrefs.VehPref }
     * 
     */
    public VehicleAvailRQCoreType.VehPrefs.VehPref createVehicleAvailRQCoreTypeVehPrefsVehPref() {
        return new VehicleAvailRQCoreType.VehPrefs.VehPref();
    }

    /**
     * Create an instance of {@link VehiclePrefType.VehMakeModel }
     * 
     */
    public VehiclePrefType.VehMakeModel createVehiclePrefTypeVehMakeModel() {
        return new VehiclePrefType.VehMakeModel();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType.VendorPrefs.VendorPref }
     * 
     */
    public VehicleAvailRQCoreType.VendorPrefs.VendorPref createVehicleAvailRQCoreTypeVendorPrefsVendorPref() {
        return new VehicleAvailRQCoreType.VendorPrefs.VendorPref();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomTypes }
     * 
     */
    public RoomStayType.RoomTypes createRoomStayTypeRoomTypes() {
        return new RoomStayType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomStayType.RatePlans }
     * 
     */
    public RoomStayType.RatePlans createRoomStayTypeRatePlans() {
        return new RoomStayType.RatePlans();
    }

    /**
     * Create an instance of {@link RoomStayType.MapURL }
     * 
     */
    public RoomStayType.MapURL createRoomStayTypeMapURL() {
        return new RoomStayType.MapURL();
    }

    /**
     * Create an instance of {@link RoomRateType.Availability }
     * 
     */
    public RoomRateType.Availability createRoomRateTypeAvailability() {
        return new RoomRateType.Availability();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction createRoomStayTypeRoomRatesRoomRateAdvanceBookingRestriction() {
        return new RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.GuestCounts.GuestCount }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.GuestCounts.GuestCount createRoomStayTypeRoomRatesRoomRateGuestCountsGuestCount() {
        return new RoomStayType.RoomRates.RoomRate.GuestCounts.GuestCount();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.Restrictions.Restriction }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.Restrictions.Restriction createRoomStayTypeRoomRatesRoomRateRestrictionsRestriction() {
        return new RoomStayType.RoomRates.RoomRate.Restrictions.Restriction();
    }

    /**
     * Create an instance of {@link RoomRateType.Features.Feature }
     * 
     */
    public RoomRateType.Features.Feature createRoomRateTypeFeaturesFeature() {
        return new RoomRateType.Features.Feature();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentBaseType.DepartureAirport }
     * 
     */
    public PkgFlightSegmentBaseType.DepartureAirport createPkgFlightSegmentBaseTypeDepartureAirport() {
        return new PkgFlightSegmentBaseType.DepartureAirport();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentBaseType.ArrivalAirport }
     * 
     */
    public PkgFlightSegmentBaseType.ArrivalAirport createPkgFlightSegmentBaseTypeArrivalAirport() {
        return new PkgFlightSegmentBaseType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterAccount }
     * 
     */
    public HotelRoomListType.MasterAccount createHotelRoomListTypeMasterAccount() {
        return new HotelRoomListType.MasterAccount();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Event }
     * 
     */
    public HotelRoomListType.Event createHotelRoomListTypeEvent() {
        return new HotelRoomListType.Event();
    }

    /**
     * Create an instance of {@link HotelRoomListType.RoomStays.RoomStay }
     * 
     */
    public HotelRoomListType.RoomStays.RoomStay createHotelRoomListTypeRoomStaysRoomStay() {
        return new HotelRoomListType.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link DirectBillType.CompanyName }
     * 
     */
    public DirectBillType.CompanyName createDirectBillTypeCompanyName() {
        return new DirectBillType.CompanyName();
    }

    /**
     * Create an instance of {@link DirectBillType.Telephone }
     * 
     */
    public DirectBillType.Telephone createDirectBillTypeTelephone() {
        return new DirectBillType.Telephone();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterContact.UniqueIDs }
     * 
     */
    public HotelRoomListType.MasterContact.UniqueIDs createHotelRoomListTypeMasterContactUniqueIDs() {
        return new HotelRoomListType.MasterContact.UniqueIDs();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterContact.Loyalty }
     * 
     */
    public HotelRoomListType.MasterContact.Loyalty createHotelRoomListTypeMasterContactLoyalty() {
        return new HotelRoomListType.MasterContact.Loyalty();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests.Guest.Loyalty }
     * 
     */
    public HotelRoomListType.Guests.Guest.Loyalty createHotelRoomListTypeGuestsGuestLoyalty() {
        return new HotelRoomListType.Guests.Guest.Loyalty();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests.Guest.GuaranteePayment }
     * 
     */
    public HotelRoomListType.Guests.Guest.GuaranteePayment createHotelRoomListTypeGuestsGuestGuaranteePayment() {
        return new HotelRoomListType.Guests.Guest.GuaranteePayment();
    }

    /**
     * Create an instance of {@link HotelPaymentFormType.MasterAccountUsage }
     * 
     */
    public HotelPaymentFormType.MasterAccountUsage createHotelPaymentFormTypeMasterAccountUsage() {
        return new HotelPaymentFormType.MasterAccountUsage();
    }

    /**
     * Create an instance of {@link TravelerRPHs.TravelerRPH }
     * 
     */
    public TravelerRPHs.TravelerRPH createTravelerRPHsTravelerRPH() {
        return new TravelerRPHs.TravelerRPH();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Descriptions }
     * 
     */
    public AffiliationInfoType.Descriptions createAffiliationInfoTypeDescriptions() {
        return new AffiliationInfoType.Descriptions();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.PartnerInfos.PartnerInfo }
     * 
     */
    public AffiliationInfoType.PartnerInfos.PartnerInfo createAffiliationInfoTypePartnerInfosPartnerInfo() {
        return new AffiliationInfoType.PartnerInfos.PartnerInfo();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Awards.Award }
     * 
     */
    public AffiliationInfoType.Awards.Award createAffiliationInfoTypeAwardsAward() {
        return new AffiliationInfoType.Awards.Award();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription }
     * 
     */
    public AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription createAffiliationInfoTypeLoyalProgramsLoyalProgramProgramDescription() {
        return new AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction }
     * 
     */
    public AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction createAffiliationInfoTypeLoyalProgramsLoyalProgramProgramRestriction() {
        return new AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Brands.Brand }
     * 
     */
    public AffiliationInfoType.Brands.Brand createAffiliationInfoTypeBrandsBrand() {
        return new AffiliationInfoType.Brands.Brand();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems.DistribSystem }
     * 
     */
    public AffiliationInfoType.DistribSystems.DistribSystem createAffiliationInfoTypeDistribSystemsDistribSystem() {
        return new AffiliationInfoType.DistribSystems.DistribSystem();
    }

    /**
     * Create an instance of {@link CancelInfoRSType.CancelRules }
     * 
     */
    public CancelInfoRSType.CancelRules createCancelInfoRSTypeCancelRules() {
        return new CancelInfoRSType.CancelRules();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType.BookingClassPref }
     * 
     */
    public SpecificFlightInfoType.BookingClassPref createSpecificFlightInfoTypeBookingClassPref() {
        return new SpecificFlightInfoType.BookingClassPref();
    }

    /**
     * Create an instance of {@link PricedItineraryType.AirItineraryPricingInfo }
     * 
     */
    public PricedItineraryType.AirItineraryPricingInfo createPricedItineraryTypeAirItineraryPricingInfo() {
        return new PricedItineraryType.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link TicketingInfoType.TicketAdvisory }
     * 
     */
    public TicketingInfoType.TicketAdvisory createTicketingInfoTypeTicketAdvisory() {
        return new TicketingInfoType.TicketAdvisory();
    }

    /**
     * Create an instance of {@link TicketingInfoType.TicketingVendor }
     * 
     */
    public TicketingInfoType.TicketingVendor createTicketingInfoTypeTicketingVendor() {
        return new TicketingInfoType.TicketingVendor();
    }

    /**
     * Create an instance of {@link TicketingInfoType.PricingSystem }
     * 
     */
    public TicketingInfoType.PricingSystem createTicketingInfoTypePricingSystem() {
        return new TicketingInfoType.PricingSystem();
    }

    /**
     * Create an instance of {@link TicketingInfoType.TotalFare }
     * 
     */
    public TicketingInfoType.TotalFare createTicketingInfoTypeTotalFare() {
        return new TicketingInfoType.TotalFare();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TicketingInfo.DeliveryInfo }
     * 
     */
    public PricedItineraryType.TicketingInfo.DeliveryInfo createPricedItineraryTypeTicketingInfoDeliveryInfo() {
        return new PricedItineraryType.TicketingInfo.DeliveryInfo();
    }

    /**
     * Create an instance of {@link CommentType.Comment }
     * 
     */
    public CommentType.Comment createCommentTypeComment() {
        return new CommentType.Comment();
    }

    /**
     * Create an instance of {@link TextDescriptionType.Description }
     * 
     */
    public TextDescriptionType.Description createTextDescriptionTypeDescription() {
        return new TextDescriptionType.Description();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType.Penalty }
     * 
     */
    public VoluntaryChangesType.Penalty createVoluntaryChangesTypePenalty() {
        return new VoluntaryChangesType.Penalty();
    }

    /**
     * Create an instance of {@link GuestRoomType.Quantities }
     * 
     */
    public GuestRoomType.Quantities createGuestRoomTypeQuantities() {
        return new GuestRoomType.Quantities();
    }

    /**
     * Create an instance of {@link GuestRoomType.Occupancy }
     * 
     */
    public GuestRoomType.Occupancy createGuestRoomTypeOccupancy() {
        return new GuestRoomType.Occupancy();
    }

    /**
     * Create an instance of {@link GuestRoomType.Room }
     * 
     */
    public GuestRoomType.Room createGuestRoomTypeRoom() {
        return new GuestRoomType.Room();
    }

    /**
     * Create an instance of {@link GuestRoomType.RoomLevelFees }
     * 
     */
    public GuestRoomType.RoomLevelFees createGuestRoomTypeRoomLevelFees() {
        return new GuestRoomType.RoomLevelFees();
    }

    /**
     * Create an instance of {@link GuestRoomType.Amenities.Amenity }
     * 
     */
    public GuestRoomType.Amenities.Amenity createGuestRoomTypeAmenitiesAmenity() {
        return new GuestRoomType.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link AdjustmentsType.Adjustment }
     * 
     */
    public AdjustmentsType.Adjustment createAdjustmentsTypeAdjustment() {
        return new AdjustmentsType.Adjustment();
    }

    /**
     * Create an instance of {@link PhonePrefType.Telephone }
     * 
     */
    public PhonePrefType.Telephone createPhonePrefTypeTelephone() {
        return new PhonePrefType.Telephone();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.ImageFormat }
     * 
     */
    public ImageDescriptionType.ImageFormat createImageDescriptionTypeImageFormat() {
        return new ImageDescriptionType.ImageFormat();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.Description }
     * 
     */
    public ImageDescriptionType.Description createImageDescriptionTypeDescription() {
        return new ImageDescriptionType.Description();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MinimumStay }
     * 
     */
    public StayRestrictionsType.MinimumStay createStayRestrictionsTypeMinimumStay() {
        return new StayRestrictionsType.MinimumStay();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MaximumStay }
     * 
     */
    public StayRestrictionsType.MaximumStay createStayRestrictionsTypeMaximumStay() {
        return new StayRestrictionsType.MaximumStay();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails.GDSCodeDetail }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails.GDSCodeDetail createGDSInfoTypeGDSCodesGDSCodeGDSCodeDetailsGDSCodeDetail() {
        return new GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails.GDSCodeDetail();
    }

    /**
     * Create an instance of {@link PhonesType.Phone }
     * 
     */
    public PhonesType.Phone createPhonesTypePhone() {
        return new PhonesType.Phone();
    }

    /**
     * Create an instance of {@link SpecialRequestType.SpecialRequest }
     * 
     */
    public SpecialRequestType.SpecialRequest createSpecialRequestTypeSpecialRequest() {
        return new SpecialRequestType.SpecialRequest();
    }

    /**
     * Create an instance of {@link SourceType.RequestorID }
     * 
     */
    public SourceType.RequestorID createSourceTypeRequestorID() {
        return new SourceType.RequestorID();
    }

    /**
     * Create an instance of {@link SourceType.Position }
     * 
     */
    public SourceType.Position createSourceTypePosition() {
        return new SourceType.Position();
    }

    /**
     * Create an instance of {@link SourceType.BookingChannel }
     * 
     */
    public SourceType.BookingChannel createSourceTypeBookingChannel() {
        return new SourceType.BookingChannel();
    }

    /**
     * Create an instance of {@link SeatMapDetailsType.CabinClass }
     * 
     */
    public SeatMapDetailsType.CabinClass createSeatMapDetailsTypeCabinClass() {
        return new SeatMapDetailsType.CabinClass();
    }

    /**
     * Create an instance of {@link CabinClassType.AirRows }
     * 
     */
    public CabinClassType.AirRows createCabinClassTypeAirRows() {
        return new CabinClassType.AirRows();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.ConfID }
     * 
     */
    public VehicleSegmentCoreType.ConfID createVehicleSegmentCoreTypeConfID() {
        return new VehicleSegmentCoreType.ConfID();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.PricedEquips }
     * 
     */
    public VehicleSegmentCoreType.PricedEquips createVehicleSegmentCoreTypePricedEquips() {
        return new VehicleSegmentCoreType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.Fees }
     * 
     */
    public VehicleSegmentCoreType.Fees createVehicleSegmentCoreTypeFees() {
        return new VehicleSegmentCoreType.Fees();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.TotalCharge }
     * 
     */
    public VehicleSegmentCoreType.TotalCharge createVehicleSegmentCoreTypeTotalCharge() {
        return new VehicleSegmentCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.Criterion }
     * 
     */
    public HotelSearchCriteriaType.Criterion createHotelSearchCriteriaTypeCriterion() {
        return new HotelSearchCriteriaType.Criterion();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.HotelAmenity }
     * 
     */
    public HotelSearchCriterionType.HotelAmenity createHotelSearchCriterionTypeHotelAmenity() {
        return new HotelSearchCriterionType.HotelAmenity();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.HotelFeature }
     * 
     */
    public HotelSearchCriterionType.HotelFeature createHotelSearchCriterionTypeHotelFeature() {
        return new HotelSearchCriterionType.HotelFeature();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Award }
     * 
     */
    public HotelSearchCriterionType.Award createHotelSearchCriterionTypeAward() {
        return new HotelSearchCriterionType.Award();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Recreation }
     * 
     */
    public HotelSearchCriterionType.Recreation createHotelSearchCriterionTypeRecreation() {
        return new HotelSearchCriterionType.Recreation();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Service }
     * 
     */
    public HotelSearchCriterionType.Service createHotelSearchCriterionTypeService() {
        return new HotelSearchCriterionType.Service();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Transportation }
     * 
     */
    public HotelSearchCriterionType.Transportation createHotelSearchCriterionTypeTransportation() {
        return new HotelSearchCriterionType.Transportation();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RateRange }
     * 
     */
    public HotelSearchCriterionType.RateRange createHotelSearchCriterionTypeRateRange() {
        return new HotelSearchCriterionType.RateRange();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RoomStayCandidates }
     * 
     */
    public HotelSearchCriterionType.RoomStayCandidates createHotelSearchCriterionTypeRoomStayCandidates() {
        return new HotelSearchCriterionType.RoomStayCandidates();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Media }
     * 
     */
    public HotelSearchCriterionType.Media createHotelSearchCriterionTypeMedia() {
        return new HotelSearchCriterionType.Media();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.HotelMeetingFacility }
     * 
     */
    public HotelSearchCriterionType.HotelMeetingFacility createHotelSearchCriterionTypeHotelMeetingFacility() {
        return new HotelSearchCriterionType.HotelMeetingFacility();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.MealPlan }
     * 
     */
    public HotelSearchCriterionType.MealPlan createHotelSearchCriterionTypeMealPlan() {
        return new HotelSearchCriterionType.MealPlan();
    }

    /**
     * Create an instance of {@link PreferencesType.PrefCollection }
     * 
     */
    public PreferencesType.PrefCollection createPreferencesTypePrefCollection() {
        return new PreferencesType.PrefCollection();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType.Vehicle }
     * 
     */
    public VehicleLocationVehiclesType.Vehicle createVehicleLocationVehiclesTypeVehicle() {
        return new VehicleLocationVehiclesType.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType.VehicleInfos.VehicleInfo }
     * 
     */
    public VehicleLocationVehiclesType.VehicleInfos.VehicleInfo createVehicleLocationVehiclesTypeVehicleInfosVehicleInfo() {
        return new VehicleLocationVehiclesType.VehicleInfos.VehicleInfo();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay.LOSPattern }
     * 
     */
    public LengthsOfStayType.LengthOfStay.LOSPattern createLengthsOfStayTypeLengthOfStayLOSPattern() {
        return new LengthsOfStayType.LengthOfStay.LOSPattern();
    }

    /**
     * Create an instance of {@link org.opentravel.ota._2003._05.ProfileType.UserID }
     * 
     */
    public org.opentravel.ota._2003._05.ProfileType.UserID createProfileTypeUserID() {
        return new org.opentravel.ota._2003._05.ProfileType.UserID();
    }

    /**
     * Create an instance of {@link org.opentravel.ota._2003._05.ProfileType.Comments.Comment.AuthorizedViewer }
     * 
     */
    public org.opentravel.ota._2003._05.ProfileType.Comments.Comment.AuthorizedViewer createProfileTypeCommentsCommentAuthorizedViewer() {
        return new org.opentravel.ota._2003._05.ProfileType.Comments.Comment.AuthorizedViewer();
    }

    /**
     * Create an instance of {@link HotelAdditionalChargesType.AdditionalCharge }
     * 
     */
    public HotelAdditionalChargesType.AdditionalCharge createHotelAdditionalChargesTypeAdditionalCharge() {
        return new HotelAdditionalChargesType.AdditionalCharge();
    }

    /**
     * Create an instance of {@link RoomPriceType.ProfilePrice }
     * 
     */
    public RoomPriceType.ProfilePrice createRoomPriceTypeProfilePrice() {
        return new RoomPriceType.ProfilePrice();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType.Telephone }
     * 
     */
    public VehicleLocationDetailsType.Telephone createVehicleLocationDetailsTypeTelephone() {
        return new VehicleLocationDetailsType.Telephone();
    }

    /**
     * Create an instance of {@link CategoryCodesType.LocationCategory }
     * 
     */
    public CategoryCodesType.LocationCategory createCategoryCodesTypeLocationCategory() {
        return new CategoryCodesType.LocationCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.SegmentCategory }
     * 
     */
    public CategoryCodesType.SegmentCategory createCategoryCodesTypeSegmentCategory() {
        return new CategoryCodesType.SegmentCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.HotelCategory }
     * 
     */
    public CategoryCodesType.HotelCategory createCategoryCodesTypeHotelCategory() {
        return new CategoryCodesType.HotelCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.ArchitecturalStyle }
     * 
     */
    public CategoryCodesType.ArchitecturalStyle createCategoryCodesTypeArchitecturalStyle() {
        return new CategoryCodesType.ArchitecturalStyle();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo.RateRanges.RateRange }
     * 
     */
    public CategoryCodesType.GuestRoomInfo.RateRanges.RateRange createCategoryCodesTypeGuestRoomInfoRateRangesRateRange() {
        return new CategoryCodesType.GuestRoomInfo.RateRanges.RateRange();
    }

    /**
     * Create an instance of {@link AccommodationSegmentRequestType.RoomProfiles }
     * 
     */
    public AccommodationSegmentRequestType.RoomProfiles createAccommodationSegmentRequestTypeRoomProfiles() {
        return new AccommodationSegmentRequestType.RoomProfiles();
    }

    /**
     * Create an instance of {@link AccommodationSegmentRequestType.MealPlans }
     * 
     */
    public AccommodationSegmentRequestType.MealPlans createAccommodationSegmentRequestTypeMealPlans() {
        return new AccommodationSegmentRequestType.MealPlans();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType.PaymentRules }
     * 
     */
    public VehicleSegmentAdditionalInfoType.PaymentRules createVehicleSegmentAdditionalInfoTypePaymentRules() {
        return new VehicleSegmentAdditionalInfoType.PaymentRules();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType.PricedCoverages }
     * 
     */
    public VehicleSegmentAdditionalInfoType.PricedCoverages createVehicleSegmentAdditionalInfoTypePricedCoverages() {
        return new VehicleSegmentAdditionalInfoType.PricedCoverages();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType.VendorMessages }
     * 
     */
    public VehicleSegmentAdditionalInfoType.VendorMessages createVehicleSegmentAdditionalInfoTypeVendorMessages() {
        return new VehicleSegmentAdditionalInfoType.VendorMessages();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalGuestAmounts }
     * 
     */
    public AmountType.AdditionalGuestAmounts createAmountTypeAdditionalGuestAmounts() {
        return new AmountType.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link AmountType.Discount }
     * 
     */
    public AmountType.Discount createAmountTypeDiscount() {
        return new AmountType.Discount();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanInclusions }
     * 
     */
    public RatePlanType.RatePlanInclusions createRatePlanTypeRatePlanInclusions() {
        return new RatePlanType.RatePlanInclusions();
    }

    /**
     * Create an instance of {@link RatePlanType.MealsIncluded }
     * 
     */
    public RatePlanType.MealsIncluded createRatePlanTypeMealsIncluded() {
        return new RatePlanType.MealsIncluded();
    }

    /**
     * Create an instance of {@link RatePlanType.RestrictionStatus }
     * 
     */
    public RatePlanType.RestrictionStatus createRatePlanTypeRestrictionStatus() {
        return new RatePlanType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link RestaurantType.MultimediaDescriptions }
     * 
     */
    public RestaurantType.MultimediaDescriptions createRestaurantTypeMultimediaDescriptions() {
        return new RestaurantType.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link RestaurantType.CuisineCodes.CuisineCode }
     * 
     */
    public RestaurantType.CuisineCodes.CuisineCode createRestaurantTypeCuisineCodesCuisineCode() {
        return new RestaurantType.CuisineCodes.CuisineCode();
    }

    /**
     * Create an instance of {@link RestaurantType.InfoCodes.InfoCode }
     * 
     */
    public RestaurantType.InfoCodes.InfoCode createRestaurantTypeInfoCodesInfoCode() {
        return new RestaurantType.InfoCodes.InfoCode();
    }

    /**
     * Create an instance of {@link ImageItemsType.ImageItem }
     * 
     */
    public ImageItemsType.ImageItem createImageItemsTypeImageItem() {
        return new ImageItemsType.ImageItem();
    }

    /**
     * Create an instance of {@link EmailsType.Email }
     * 
     */
    public EmailsType.Email createEmailsTypeEmail() {
        return new EmailsType.Email();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.RateRange }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.RateRange createAvailRequestSegmentsTypeAvailRequestSegmentRateRange() {
        return new AvailRequestSegmentsType.AvailRequestSegment.RateRange();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria createAvailRequestSegmentsTypeAvailRequestSegmentHotelSearchCriteria() {
        return new AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate createAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidatesRoomStayCandidate() {
        return new AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardType.Telephone }
     * 
     */
    public PaymentCardType.Telephone createPaymentCardTypeTelephone() {
        return new PaymentCardType.Telephone();
    }

    /**
     * Create an instance of {@link PaymentCardType.CustLoyalty }
     * 
     */
    public PaymentCardType.CustLoyalty createPaymentCardTypeCustLoyalty() {
        return new PaymentCardType.CustLoyalty();
    }

    /**
     * Create an instance of {@link PaymentCardType.SignatureOnFile }
     * 
     */
    public PaymentCardType.SignatureOnFile createPaymentCardTypeSignatureOnFile() {
        return new PaymentCardType.SignatureOnFile();
    }

    /**
     * Create an instance of {@link PaymentCardType.MagneticStripe }
     * 
     */
    public PaymentCardType.MagneticStripe createPaymentCardTypeMagneticStripe() {
        return new PaymentCardType.MagneticStripe();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute createSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttributesCabinAttribute() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute createSailingCategoryInfoTypeSelectedCategoryCabinAttributesCabinAttribute() {
        return new SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionableAmount }
     * 
     */
    public CommissionType.CommissionableAmount createCommissionTypeCommissionableAmount() {
        return new CommissionType.CommissionableAmount();
    }

    /**
     * Create an instance of {@link CommissionType.PrepaidAmount }
     * 
     */
    public CommissionType.PrepaidAmount createCommissionTypePrepaidAmount() {
        return new CommissionType.PrepaidAmount();
    }

    /**
     * Create an instance of {@link CommissionType.FlatCommission }
     * 
     */
    public CommissionType.FlatCommission createCommissionTypeFlatCommission() {
        return new CommissionType.FlatCommission();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionPayableAmount }
     * 
     */
    public CommissionType.CommissionPayableAmount createCommissionTypeCommissionPayableAmount() {
        return new CommissionType.CommissionPayableAmount();
    }

    /**
     * Create an instance of {@link CancelPenaltyType.Deadline }
     * 
     */
    public CancelPenaltyType.Deadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyType.Deadline();
    }

    /**
     * Create an instance of {@link AgreementsType.ProfileSecurity }
     * 
     */
    public AgreementsType.ProfileSecurity createAgreementsTypeProfileSecurity() {
        return new AgreementsType.ProfileSecurity();
    }

    /**
     * Create an instance of {@link VehicleReservationSummaryType.ConfID }
     * 
     */
    public VehicleReservationSummaryType.ConfID createVehicleReservationSummaryTypeConfID() {
        return new VehicleReservationSummaryType.ConfID();
    }

    /**
     * Create an instance of {@link RoomStaysType.RoomStay.Reference }
     * 
     */
    public RoomStaysType.RoomStay.Reference createRoomStaysTypeRoomStayReference() {
        return new RoomStaysType.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.AvailableDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.AvailableDaysOfWeek createDOWRestrictionsTypeAvailableDaysOfWeek() {
        return new DOWRestrictionsType.AvailableDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.ArrivalDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.ArrivalDaysOfWeek createDOWRestrictionsTypeArrivalDaysOfWeek() {
        return new DOWRestrictionsType.ArrivalDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.DepartureDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.DepartureDaysOfWeek createDOWRestrictionsTypeDepartureDaysOfWeek() {
        return new DOWRestrictionsType.DepartureDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.RequiredDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.RequiredDaysOfWeek createDOWRestrictionsTypeRequiredDaysOfWeek() {
        return new DOWRestrictionsType.RequiredDaysOfWeek();
    }

    /**
     * Create an instance of {@link WeatherInfoType.Precipitation }
     * 
     */
    public WeatherInfoType.Precipitation createWeatherInfoTypePrecipitation() {
        return new WeatherInfoType.Precipitation();
    }

    /**
     * Create an instance of {@link WeatherInfoType.Temperature }
     * 
     */
    public WeatherInfoType.Temperature createWeatherInfoTypeTemperature() {
        return new WeatherInfoType.Temperature();
    }

    /**
     * Create an instance of {@link FareCodeOptionType.FareRemark }
     * 
     */
    public FareCodeOptionType.FareRemark createFareCodeOptionTypeFareRemark() {
        return new FareCodeOptionType.FareRemark();
    }

    /**
     * Create an instance of {@link URLsType.URL }
     * 
     */
    public URLsType.URL createURLsTypeURL() {
        return new URLsType.URL();
    }

    /**
     * Create an instance of {@link RevenueCategoryType.SummaryAmount }
     * 
     */
    public RevenueCategoryType.SummaryAmount createRevenueCategoryTypeSummaryAmount() {
        return new RevenueCategoryType.SummaryAmount();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType.FuelLevelDetails }
     * 
     */
    public VehicleRentalDetailsType.FuelLevelDetails createVehicleRentalDetailsTypeFuelLevelDetails() {
        return new VehicleRentalDetailsType.FuelLevelDetails();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType.OdometerReading }
     * 
     */
    public VehicleRentalDetailsType.OdometerReading createVehicleRentalDetailsTypeOdometerReading() {
        return new VehicleRentalDetailsType.OdometerReading();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType.ConditionReport }
     * 
     */
    public VehicleRentalDetailsType.ConditionReport createVehicleRentalDetailsTypeConditionReport() {
        return new VehicleRentalDetailsType.ConditionReport();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType.AllianceMember }
     * 
     */
    public AllianceConsortiumType.AllianceMember createAllianceConsortiumTypeAllianceMember() {
        return new AllianceConsortiumType.AllianceMember();
    }

    /**
     * Create an instance of {@link VehicleChargeType.MinMax }
     * 
     */
    public VehicleChargeType.MinMax createVehicleChargeTypeMinMax() {
        return new VehicleChargeType.MinMax();
    }

    /**
     * Create an instance of {@link VehicleChargeType.Calculation }
     * 
     */
    public VehicleChargeType.Calculation createVehicleChargeTypeCalculation() {
        return new VehicleChargeType.Calculation();
    }

    /**
     * Create an instance of {@link VehicleChargeType.TaxAmounts.TaxAmount }
     * 
     */
    public VehicleChargeType.TaxAmounts.TaxAmount createVehicleChargeTypeTaxAmountsTaxAmount() {
        return new VehicleChargeType.TaxAmounts.TaxAmount();
    }

    /**
     * Create an instance of {@link TransportationType.Transportation }
     * 
     */
    public TransportationType.Transportation createTransportationTypeTransportation() {
        return new TransportationType.Transportation();
    }

    /**
     * Create an instance of {@link FlightLegType.DepartureAirport }
     * 
     */
    public FlightLegType.DepartureAirport createFlightLegTypeDepartureAirport() {
        return new FlightLegType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightLegType.ArrivalAirport }
     * 
     */
    public FlightLegType.ArrivalAirport createFlightLegTypeArrivalAirport() {
        return new FlightLegType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.SearchValueMatch }
     * 
     */
    public PropertyValueMatchType.SearchValueMatch createPropertyValueMatchTypeSearchValueMatch() {
        return new PropertyValueMatchType.SearchValueMatch();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.RateRange }
     * 
     */
    public PropertyValueMatchType.RateRange createPropertyValueMatchTypeRateRange() {
        return new PropertyValueMatchType.RateRange();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.Amenities.Amenity }
     * 
     */
    public PropertyValueMatchType.Amenities.Amenity createPropertyValueMatchTypeAmenitiesAmenity() {
        return new PropertyValueMatchType.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.RestrictionStatus }
     * 
     */
    public BookingRulesType.BookingRule.RestrictionStatus createBookingRulesTypeBookingRuleRestrictionStatus() {
        return new BookingRulesType.BookingRule.RestrictionStatus();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.CheckoutCharge }
     * 
     */
    public BookingRulesType.BookingRule.CheckoutCharge createBookingRulesTypeBookingRuleCheckoutCharge() {
        return new BookingRulesType.BookingRule.CheckoutCharge();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AddtionalRules.AdditionalRule }
     * 
     */
    public BookingRulesType.BookingRule.AddtionalRules.AdditionalRule createBookingRulesTypeBookingRuleAddtionalRulesAdditionalRule() {
        return new BookingRulesType.BookingRule.AddtionalRules.AdditionalRule();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee }
     * 
     */
    public BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee createBookingRulesTypeBookingRuleAcceptableGuaranteesAcceptableGuarantee() {
        return new BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee();
    }

    /**
     * Create an instance of {@link GuaranteeType.Deadline }
     * 
     */
    public GuaranteeType.Deadline createGuaranteeTypeDeadline() {
        return new GuaranteeType.Deadline();
    }

    /**
     * Create an instance of {@link GuaranteeType.GuaranteesAccepted.GuaranteeAccepted }
     * 
     */
    public GuaranteeType.GuaranteesAccepted.GuaranteeAccepted createGuaranteeTypeGuaranteesAcceptedGuaranteeAccepted() {
        return new GuaranteeType.GuaranteesAccepted.GuaranteeAccepted();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ViewershipCodes }
     * 
     */
    public ViewershipsType.Viewership.ViewershipCodes createViewershipsTypeViewershipViewershipCodes() {
        return new ViewershipsType.Viewership.ViewershipCodes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ProfileRefs }
     * 
     */
    public ViewershipsType.Viewership.ProfileRefs createViewershipsTypeViewershipProfileRefs() {
        return new ViewershipsType.Viewership.ProfileRefs();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.Profiles }
     * 
     */
    public ViewershipsType.Viewership.Profiles createViewershipsTypeViewershipProfiles() {
        return new ViewershipsType.Viewership.Profiles();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.DistributorTypes.DistributorType }
     * 
     */
    public ViewershipsType.Viewership.DistributorTypes.DistributorType createViewershipsTypeViewershipDistributorTypesDistributorType() {
        return new ViewershipsType.Viewership.DistributorTypes.DistributorType();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode }
     * 
     */
    public ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode createViewershipsTypeViewershipBookingChannelCodesBookingChannelCode() {
        return new ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.LocationCodes.LocationCode }
     * 
     */
    public ViewershipsType.Viewership.LocationCodes.LocationCode createViewershipsTypeViewershipLocationCodesLocationCode() {
        return new ViewershipsType.Viewership.LocationCodes.LocationCode();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ProfileTypes.ProfileType }
     * 
     */
    public ViewershipsType.Viewership.ProfileTypes.ProfileType createViewershipsTypeViewershipProfileTypesProfileType() {
        return new ViewershipsType.Viewership.ProfileTypes.ProfileType();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.SystemCodes.SystemCode }
     * 
     */
    public ViewershipsType.Viewership.SystemCodes.SystemCode createViewershipsTypeViewershipSystemCodesSystemCode() {
        return new ViewershipsType.Viewership.SystemCodes.SystemCode();
    }

    /**
     * Create an instance of {@link DocumentHandlingType.VendorOption }
     * 
     */
    public DocumentHandlingType.VendorOption createDocumentHandlingTypeVendorOption() {
        return new DocumentHandlingType.VendorOption();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.ReportSummaries }
     * 
     */
    public StatisticApplicationSetType.ReportSummaries createStatisticApplicationSetTypeReportSummaries() {
        return new StatisticApplicationSetType.ReportSummaries();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary }
     * 
     */
    public StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary createStatisticApplicationSetTypeCountCategorySummariesCountCategorySummary() {
        return new StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary }
     * 
     */
    public StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary createStatisticApplicationSetTypeRevenueCategorySummariesRevenueCategorySummary() {
        return new StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.StatisticCodes.StatisticCode }
     * 
     */
    public StatisticApplicationSetType.StatisticCodes.StatisticCode createStatisticApplicationSetTypeStatisticCodesStatisticCode() {
        return new StatisticApplicationSetType.StatisticCodes.StatisticCode();
    }

    /**
     * Create an instance of {@link OffLocationServiceType.Telephone }
     * 
     */
    public OffLocationServiceType.Telephone createOffLocationServiceTypeTelephone() {
        return new OffLocationServiceType.Telephone();
    }

    /**
     * Create an instance of {@link PackageResponseType.DateRange }
     * 
     */
    public PackageResponseType.DateRange createPackageResponseTypeDateRange() {
        return new PackageResponseType.DateRange();
    }

    /**
     * Create an instance of {@link PackageResponseType.ItineraryItems }
     * 
     */
    public PackageResponseType.ItineraryItems createPackageResponseTypeItineraryItems() {
        return new PackageResponseType.ItineraryItems();
    }

    /**
     * Create an instance of {@link PackageResponseType.Extras }
     * 
     */
    public PackageResponseType.Extras createPackageResponseTypeExtras() {
        return new PackageResponseType.Extras();
    }

    /**
     * Create an instance of {@link PackageResponseType.Cautions }
     * 
     */
    public PackageResponseType.Cautions createPackageResponseTypeCautions() {
        return new PackageResponseType.Cautions();
    }

    /**
     * Create an instance of {@link RateAmountMessageType.Rates.Rate }
     * 
     */
    public RateAmountMessageType.Rates.Rate createRateAmountMessageTypeRatesRate() {
        return new RateAmountMessageType.Rates.Rate();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking createVehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking() {
        return new VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking();
    }

    /**
     * Create an instance of {@link InvBlockType.HotelRef }
     * 
     */
    public InvBlockType.HotelRef createInvBlockTypeHotelRef() {
        return new InvBlockType.HotelRef();
    }

    /**
     * Create an instance of {@link InvBlockType.InvBlockDates }
     * 
     */
    public InvBlockType.InvBlockDates createInvBlockTypeInvBlockDates() {
        return new InvBlockType.InvBlockDates();
    }

    /**
     * Create an instance of {@link InvBlockType.RoomTypes }
     * 
     */
    public InvBlockType.RoomTypes createInvBlockTypeRoomTypes() {
        return new InvBlockType.RoomTypes();
    }

    /**
     * Create an instance of {@link InvBlockType.MethodInfo }
     * 
     */
    public InvBlockType.MethodInfo createInvBlockTypeMethodInfo() {
        return new InvBlockType.MethodInfo();
    }

    /**
     * Create an instance of {@link InvBlockType.Contacts }
     * 
     */
    public InvBlockType.Contacts createInvBlockTypeContacts() {
        return new InvBlockType.Contacts();
    }

    /**
     * Create an instance of {@link InvBlockType.BlockDescriptions.BlockDescription }
     * 
     */
    public InvBlockType.BlockDescriptions.BlockDescription createInvBlockTypeBlockDescriptionsBlockDescription() {
        return new InvBlockType.BlockDescriptions.BlockDescription();
    }

    /**
     * Create an instance of {@link RFPResponseDetailType.Comments }
     * 
     */
    public RFPResponseDetailType.Comments createRFPResponseDetailTypeComments() {
        return new RFPResponseDetailType.Comments();
    }

    /**
     * Create an instance of {@link RoomSharesType.RoomShare.GuestRPHs.GuestRPH }
     * 
     */
    public RoomSharesType.RoomShare.GuestRPHs.GuestRPH createRoomSharesTypeRoomShareGuestRPHsGuestRPH() {
        return new RoomSharesType.RoomShare.GuestRPHs.GuestRPH();
    }

    /**
     * Create an instance of {@link PkgPassengerRPHs.PassengerRPH }
     * 
     */
    public PkgPassengerRPHs.PassengerRPH createPkgPassengerRPHsPassengerRPH() {
        return new PkgPassengerRPHs.PassengerRPH();
    }

    /**
     * Create an instance of {@link RestaurantsType.SrvcInfoCodes.SrvcInfoCode }
     * 
     */
    public RestaurantsType.SrvcInfoCodes.SrvcInfoCode createRestaurantsTypeSrvcInfoCodesSrvcInfoCode() {
        return new RestaurantsType.SrvcInfoCodes.SrvcInfoCode();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode }
     * 
     */
    public RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode createRestaurantsTypeRestaurantSrvcInfoCodesSrvcInfoCode() {
        return new RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode();
    }

    /**
     * Create an instance of {@link GuestCountType.GuestCount }
     * 
     */
    public GuestCountType.GuestCount createGuestCountTypeGuestCount() {
        return new GuestCountType.GuestCount();
    }

    /**
     * Create an instance of {@link MealPlanType.PassengerRPHs }
     * 
     */
    public MealPlanType.PassengerRPHs createMealPlanTypePassengerRPHs() {
        return new MealPlanType.PassengerRPHs();
    }

    /**
     * Create an instance of {@link MealPlanType.Prices.Price }
     * 
     */
    public MealPlanType.Prices.Price createMealPlanTypePricesPrice() {
        return new MealPlanType.Prices.Price();
    }

    /**
     * Create an instance of {@link HotelReservationType.Queue }
     * 
     */
    public HotelReservationType.Queue createHotelReservationTypeQueue() {
        return new HotelReservationType.Queue();
    }

    /**
     * Create an instance of {@link ShipInfoType.Ship }
     * 
     */
    public ShipInfoType.Ship createShipInfoTypeShip() {
        return new ShipInfoType.Ship();
    }

    /**
     * Create an instance of {@link ShipInfoType.ShipLength }
     * 
     */
    public ShipInfoType.ShipLength createShipInfoTypeShipLength() {
        return new ShipInfoType.ShipLength();
    }

    /**
     * Create an instance of {@link ShipInfoType.ShipVoltage }
     * 
     */
    public ShipInfoType.ShipVoltage createShipInfoTypeShipVoltage() {
        return new ShipInfoType.ShipVoltage();
    }

    /**
     * Create an instance of {@link VehicleAvailRSCoreType.VehVendorAvails }
     * 
     */
    public VehicleAvailRSCoreType.VehVendorAvails createVehicleAvailRSCoreTypeVehVendorAvails() {
        return new VehicleAvailRSCoreType.VehVendorAvails();
    }

    /**
     * Create an instance of {@link TaxItemType.TaxAmount }
     * 
     */
    public TaxItemType.TaxAmount createTaxItemTypeTaxAmount() {
        return new TaxItemType.TaxAmount();
    }

    /**
     * Create an instance of {@link ResCommonDetailType.TimeSpan }
     * 
     */
    public ResCommonDetailType.TimeSpan createResCommonDetailTypeTimeSpan() {
        return new ResCommonDetailType.TimeSpan();
    }

    /**
     * Create an instance of {@link RateType.Rate }
     * 
     */
    public RateType.Rate createRateTypeRate() {
        return new RateType.Rate();
    }

    /**
     * Create an instance of {@link MeetingRoomCapacityType.Occupancy }
     * 
     */
    public MeetingRoomCapacityType.Occupancy createMeetingRoomCapacityTypeOccupancy() {
        return new MeetingRoomCapacityType.Occupancy();
    }

    /**
     * Create an instance of {@link FacilityChoicesType.AvailableRooms }
     * 
     */
    public FacilityChoicesType.AvailableRooms createFacilityChoicesTypeAvailableRooms() {
        return new FacilityChoicesType.AvailableRooms();
    }

    /**
     * Create an instance of {@link FacilityChoicesType.AvailableMealPlans }
     * 
     */
    public FacilityChoicesType.AvailableMealPlans createFacilityChoicesTypeAvailableMealPlans() {
        return new FacilityChoicesType.AvailableMealPlans();
    }

    /**
     * Create an instance of {@link FacilityChoicesType.RoomPrices }
     * 
     */
    public FacilityChoicesType.RoomPrices createFacilityChoicesTypeRoomPrices() {
        return new FacilityChoicesType.RoomPrices();
    }

    /**
     * Create an instance of {@link ContactsType.Name.JobTitle }
     * 
     */
    public ContactsType.Name.JobTitle createContactsTypeNameJobTitle() {
        return new ContactsType.Name.JobTitle();
    }

    /**
     * Create an instance of {@link SearchQualifierType.Residency }
     * 
     */
    public SearchQualifierType.Residency createSearchQualifierTypeResidency() {
        return new SearchQualifierType.Residency();
    }

    /**
     * Create an instance of {@link SearchQualifierType.PriceRange }
     * 
     */
    public SearchQualifierType.PriceRange createSearchQualifierTypePriceRange() {
        return new SearchQualifierType.PriceRange();
    }

    /**
     * Create an instance of {@link SearchQualifierType.Status }
     * 
     */
    public SearchQualifierType.Status createSearchQualifierTypeStatus() {
        return new SearchQualifierType.Status();
    }

    /**
     * Create an instance of {@link SearchQualifierType.Dining }
     * 
     */
    public SearchQualifierType.Dining createSearchQualifierTypeDining() {
        return new SearchQualifierType.Dining();
    }

    /**
     * Create an instance of {@link ExtrasCoreType.SubCategory }
     * 
     */
    public ExtrasCoreType.SubCategory createExtrasCoreTypeSubCategory() {
        return new ExtrasCoreType.SubCategory();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.Criteria }
     * 
     */
    public ExtrasInfoType.Criteria createExtrasInfoTypeCriteria() {
        return new ExtrasInfoType.Criteria();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.Periods }
     * 
     */
    public ExtrasInfoType.Periods createExtrasInfoTypePeriods() {
        return new ExtrasInfoType.Periods();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.AdditionalInfoPrompt }
     * 
     */
    public ExtrasInfoType.AdditionalInfoPrompt createExtrasInfoTypeAdditionalInfoPrompt() {
        return new ExtrasInfoType.AdditionalInfoPrompt();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.ParentExtras }
     * 
     */
    public ExtrasInfoType.ParentExtras createExtrasInfoTypeParentExtras() {
        return new ExtrasInfoType.ParentExtras();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.ExtraLocationInfo }
     * 
     */
    public ExtrasInfoType.ExtraLocationInfo createExtrasInfoTypeExtraLocationInfo() {
        return new ExtrasInfoType.ExtraLocationInfo();
    }

    /**
     * Create an instance of {@link RoomTypeType.Amenities }
     * 
     */
    public RoomTypeType.Amenities createRoomTypeTypeAmenities() {
        return new RoomTypeType.Amenities();
    }

    /**
     * Create an instance of {@link RoomTypeType.Occupancy }
     * 
     */
    public RoomTypeType.Occupancy createRoomTypeTypeOccupancy() {
        return new RoomTypeType.Occupancy();
    }

    /**
     * Create an instance of {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard }
     * 
     */
    public AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard createAcceptablePaymentCardsInfoTypeAcceptablePaymentCardsAcceptablePaymentCard() {
        return new AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard();
    }

    /**
     * Create an instance of {@link ServiceRPHsType.ServiceRPH }
     * 
     */
    public ServiceRPHsType.ServiceRPH createServiceRPHsTypeServiceRPH() {
        return new ServiceRPHsType.ServiceRPH();
    }

    /**
     * Create an instance of {@link TextItemsType.TextItem }
     * 
     */
    public TextItemsType.TextItem createTextItemsTypeTextItem() {
        return new TextItemsType.TextItem();
    }

    /**
     * Create an instance of {@link OperationSchedulesPlusChargeType.OperationSchedule }
     * 
     */
    public OperationSchedulesPlusChargeType.OperationSchedule createOperationSchedulesPlusChargeTypeOperationSchedule() {
        return new OperationSchedulesPlusChargeType.OperationSchedule();
    }

    /**
     * Create an instance of {@link PackageType.DateRange }
     * 
     */
    public PackageType.DateRange createPackageTypeDateRange() {
        return new PackageType.DateRange();
    }

    /**
     * Create an instance of {@link PackageType.ItineraryItems }
     * 
     */
    public PackageType.ItineraryItems createPackageTypeItineraryItems() {
        return new PackageType.ItineraryItems();
    }

    /**
     * Create an instance of {@link PackageType.Extras }
     * 
     */
    public PackageType.Extras createPackageTypeExtras() {
        return new PackageType.Extras();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFeeVehiclesVehicle() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link SailingSearchQualifierType.Port }
     * 
     */
    public SailingSearchQualifierType.Port createSailingSearchQualifierTypePort() {
        return new SailingSearchQualifierType.Port();
    }

    /**
     * Create an instance of {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption }
     * 
     */
    public AirItineraryType.OriginDestinationOptions.OriginDestinationOption createAirItineraryTypeOriginDestinationOptionsOriginDestinationOption() {
        return new AirItineraryType.OriginDestinationOptions.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link CustomerCountsType.CustomerCount }
     * 
     */
    public CustomerCountsType.CustomerCount createCustomerCountsTypeCustomerCount() {
        return new CustomerCountsType.CustomerCount();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge }
     * 
     */
    public VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge createVehicleLocationAdditionalFeesTypeMiscellaneousChargesMiscellaneousCharge() {
        return new VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Surcharges.Surcharge }
     * 
     */
    public VehicleLocationAdditionalFeesType.Surcharges.Surcharge createVehicleLocationAdditionalFeesTypeSurchargesSurcharge() {
        return new VehicleLocationAdditionalFeesType.Surcharges.Surcharge();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Fees.Fee }
     * 
     */
    public VehicleLocationAdditionalFeesType.Fees.Fee createVehicleLocationAdditionalFeesTypeFeesFee() {
        return new VehicleLocationAdditionalFeesType.Fees.Fee();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Taxes.Tax }
     * 
     */
    public VehicleLocationAdditionalFeesType.Taxes.Tax createVehicleLocationAdditionalFeesTypeTaxesTax() {
        return new VehicleLocationAdditionalFeesType.Taxes.Tax();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.Policies }
     * 
     */
    public HotelDescriptiveContentType.Policies createHotelDescriptiveContentTypePolicies() {
        return new HotelDescriptiveContentType.Policies();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod }
     * 
     */
    public HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod createHotelDescriptiveContentTypeEffectivePeriodsEffectivePeriod() {
        return new HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQAdditionalInfoType.Telephone }
     * 
     */
    public VehicleRetrieveResRQAdditionalInfoType.Telephone createVehicleRetrieveResRQAdditionalInfoTypeTelephone() {
        return new VehicleRetrieveResRQAdditionalInfoType.Telephone();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQAdditionalInfoType.SearchDateRange }
     * 
     */
    public VehicleRetrieveResRQAdditionalInfoType.SearchDateRange createVehicleRetrieveResRQAdditionalInfoTypeSearchDateRange() {
        return new VehicleRetrieveResRQAdditionalInfoType.SearchDateRange();
    }

    /**
     * Create an instance of {@link ResGuestRPHsType.ResGuestRPH }
     * 
     */
    public ResGuestRPHsType.ResGuestRPH createResGuestRPHsTypeResGuestRPH() {
        return new ResGuestRPHsType.ResGuestRPH();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.VendorPref }
     * 
     */
    public AirSearchPrefsType.VendorPref createAirSearchPrefsTypeVendorPref() {
        return new AirSearchPrefsType.VendorPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FlightTypePref }
     * 
     */
    public AirSearchPrefsType.FlightTypePref createAirSearchPrefsTypeFlightTypePref() {
        return new AirSearchPrefsType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FareRestrictPref }
     * 
     */
    public AirSearchPrefsType.FareRestrictPref createAirSearchPrefsTypeFareRestrictPref() {
        return new AirSearchPrefsType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.CabinPref }
     * 
     */
    public AirSearchPrefsType.CabinPref createAirSearchPrefsTypeCabinPref() {
        return new AirSearchPrefsType.CabinPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TicketDistribPref }
     * 
     */
    public AirSearchPrefsType.TicketDistribPref createAirSearchPrefsTypeTicketDistribPref() {
        return new AirSearchPrefsType.TicketDistribPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.BookingSeatPref }
     * 
     */
    public AirSearchPrefsType.BookingSeatPref createAirSearchPrefsTypeBookingSeatPref() {
        return new AirSearchPrefsType.BookingSeatPref();
    }

    /**
     * Create an instance of {@link RoutingHopType.RoutingHop }
     * 
     */
    public RoutingHopType.RoutingHop createRoutingHopTypeRoutingHop() {
        return new RoutingHopType.RoutingHop();
    }

    /**
     * Create an instance of {@link LoyaltyPointsAccrualsType.SelectedLoyalty }
     * 
     */
    public LoyaltyPointsAccrualsType.SelectedLoyalty createLoyaltyPointsAccrualsTypeSelectedLoyalty() {
        return new LoyaltyPointsAccrualsType.SelectedLoyalty();
    }

    /**
     * Create an instance of {@link CruiseProfileType.CruiseProfile }
     * 
     */
    public CruiseProfileType.CruiseProfile createCruiseProfileTypeCruiseProfile() {
        return new CruiseProfileType.CruiseProfile();
    }

    /**
     * Create an instance of {@link VehicleAvailAdditionalInfoType.PricedCoverages }
     * 
     */
    public VehicleAvailAdditionalInfoType.PricedCoverages createVehicleAvailAdditionalInfoTypePricedCoverages() {
        return new VehicleAvailAdditionalInfoType.PricedCoverages();
    }

    /**
     * Create an instance of {@link CabinAvailType.BaggageAllowance }
     * 
     */
    public CabinAvailType.BaggageAllowance createCabinAvailTypeBaggageAllowance() {
        return new CabinAvailType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.DriverType }
     * 
     */
    public VehicleReservationRQCoreType.DriverType createVehicleReservationRQCoreTypeDriverType() {
        return new VehicleReservationRQCoreType.DriverType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.Fees }
     * 
     */
    public VehicleReservationRQCoreType.Fees createVehicleReservationRQCoreTypeFees() {
        return new VehicleReservationRQCoreType.Fees();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.VehicleCharges }
     * 
     */
    public VehicleReservationRQCoreType.VehicleCharges createVehicleReservationRQCoreTypeVehicleCharges() {
        return new VehicleReservationRQCoreType.VehicleCharges();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.RateDistance }
     * 
     */
    public VehicleReservationRQCoreType.RateDistance createVehicleReservationRQCoreTypeRateDistance() {
        return new VehicleReservationRQCoreType.RateDistance();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.TotalCharge }
     * 
     */
    public VehicleReservationRQCoreType.TotalCharge createVehicleReservationRQCoreTypeTotalCharge() {
        return new VehicleReservationRQCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.Queue }
     * 
     */
    public VehicleReservationRQCoreType.Queue createVehicleReservationRQCoreTypeQueue() {
        return new VehicleReservationRQCoreType.Queue();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref }
     * 
     */
    public VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref createVehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref() {
        return new VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link StatisticType.StatisticApplicationSets }
     * 
     */
    public StatisticType.StatisticApplicationSets createStatisticTypeStatisticApplicationSets() {
        return new StatisticType.StatisticApplicationSets();
    }

    /**
     * Create an instance of {@link ConnectionType.ConnectionLocation }
     * 
     */
    public ConnectionType.ConnectionLocation createConnectionTypeConnectionLocation() {
        return new ConnectionType.ConnectionLocation();
    }

    /**
     * Create an instance of {@link TravelClubType.ClubMemberName }
     * 
     */
    public TravelClubType.ClubMemberName createTravelClubTypeClubMemberName() {
        return new TravelClubType.ClubMemberName();
    }

    /**
     * Create an instance of {@link MessageType.OriginalPayloadStdAttributes }
     * 
     */
    public MessageType.OriginalPayloadStdAttributes createMessageTypeOriginalPayloadStdAttributes() {
        return new MessageType.OriginalPayloadStdAttributes();
    }

    /**
     * Create an instance of {@link VehicleAvailVendorInfoType.TourInfo }
     * 
     */
    public VehicleAvailVendorInfoType.TourInfo createVehicleAvailVendorInfoTypeTourInfo() {
        return new VehicleAvailVendorInfoType.TourInfo();
    }

    /**
     * Create an instance of {@link CompanyInfoType.AddressInfo }
     * 
     */
    public CompanyInfoType.AddressInfo createCompanyInfoTypeAddressInfo() {
        return new CompanyInfoType.AddressInfo();
    }

    /**
     * Create an instance of {@link CompanyInfoType.TelephoneInfo }
     * 
     */
    public CompanyInfoType.TelephoneInfo createCompanyInfoTypeTelephoneInfo() {
        return new CompanyInfoType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link CompanyInfoType.Email }
     * 
     */
    public CompanyInfoType.Email createCompanyInfoTypeEmail() {
        return new CompanyInfoType.Email();
    }

    /**
     * Create an instance of {@link CompanyInfoType.PaymentForm }
     * 
     */
    public CompanyInfoType.PaymentForm createCompanyInfoTypePaymentForm() {
        return new CompanyInfoType.PaymentForm();
    }

    /**
     * Create an instance of {@link CompanyInfoType.TripPurpose }
     * 
     */
    public CompanyInfoType.TripPurpose createCompanyInfoTypeTripPurpose() {
        return new CompanyInfoType.TripPurpose();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.HurdleRate }
     * 
     */
    public AvailStatusMessageType.HurdleRate createAvailStatusMessageTypeHurdleRate() {
        return new AvailStatusMessageType.HurdleRate();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.Delta }
     * 
     */
    public AvailStatusMessageType.Delta createAvailStatusMessageTypeDelta() {
        return new AvailStatusMessageType.Delta();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.RestrictionStatus }
     * 
     */
    public AvailStatusMessageType.RestrictionStatus createAvailStatusMessageTypeRestrictionStatus() {
        return new AvailStatusMessageType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.BestAvailableRates.BestAvailableRate }
     * 
     */
    public AvailStatusMessageType.BestAvailableRates.BestAvailableRate createAvailStatusMessageTypeBestAvailableRatesBestAvailableRate() {
        return new AvailStatusMessageType.BestAvailableRates.BestAvailableRate();
    }

    /**
     * Create an instance of {@link VehicleReservationType.VehSegmentCore }
     * 
     */
    public VehicleReservationType.VehSegmentCore createVehicleReservationTypeVehSegmentCore() {
        return new VehicleReservationType.VehSegmentCore();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQCoreType.CustLoyalty }
     * 
     */
    public VehicleRetrieveResRQCoreType.CustLoyalty createVehicleRetrieveResRQCoreTypeCustLoyalty() {
        return new VehicleRetrieveResRQCoreType.CustLoyalty();
    }

    /**
     * Create an instance of {@link AirReservationType.BookingReferenceID }
     * 
     */
    public AirReservationType.BookingReferenceID createAirReservationTypeBookingReferenceID() {
        return new AirReservationType.BookingReferenceID();
    }

    /**
     * Create an instance of {@link AirReservationType.PricingOverview.PricingIndicator }
     * 
     */
    public AirReservationType.PricingOverview.PricingIndicator createAirReservationTypePricingOverviewPricingIndicator() {
        return new AirReservationType.PricingOverview.PricingIndicator();
    }

    /**
     * Create an instance of {@link AirReservationType.PricingOverview.Account }
     * 
     */
    public AirReservationType.PricingOverview.Account createAirReservationTypePricingOverviewAccount() {
        return new AirReservationType.PricingOverview.Account();
    }

    /**
     * Create an instance of {@link AirReservationType.Queues.Queue }
     * 
     */
    public AirReservationType.Queues.Queue createAirReservationTypeQueuesQueue() {
        return new AirReservationType.Queues.Queue();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelName }
     * 
     */
    public HotelInfoType.HotelName createHotelInfoTypeHotelName() {
        return new HotelInfoType.HotelName();
    }

    /**
     * Create an instance of {@link HotelInfoType.ClosedSeasons }
     * 
     */
    public HotelInfoType.ClosedSeasons createHotelInfoTypeClosedSeasons() {
        return new HotelInfoType.ClosedSeasons();
    }

    /**
     * Create an instance of {@link HotelInfoType.RelativePositions }
     * 
     */
    public HotelInfoType.RelativePositions createHotelInfoTypeRelativePositions() {
        return new HotelInfoType.RelativePositions();
    }

    /**
     * Create an instance of {@link HotelInfoType.Position }
     * 
     */
    public HotelInfoType.Position createHotelInfoTypePosition() {
        return new HotelInfoType.Position();
    }

    /**
     * Create an instance of {@link HotelInfoType.WeatherInfos }
     * 
     */
    public HotelInfoType.WeatherInfos createHotelInfoTypeWeatherInfos() {
        return new HotelInfoType.WeatherInfos();
    }

    /**
     * Create an instance of {@link HotelInfoType.Languages.Language }
     * 
     */
    public HotelInfoType.Languages.Language createHotelInfoTypeLanguagesLanguage() {
        return new HotelInfoType.Languages.Language();
    }

    /**
     * Create an instance of {@link HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo }
     * 
     */
    public HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo createHotelInfoTypeOwnershipManagementInfosOwnershipManagementInfo() {
        return new HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo();
    }

    /**
     * Create an instance of {@link HotelInfoType.Services.Service }
     * 
     */
    public HotelInfoType.Services.Service createHotelInfoTypeServicesService() {
        return new HotelInfoType.Services.Service();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelInfoCodes.HotelInfoCode }
     * 
     */
    public HotelInfoType.HotelInfoCodes.HotelInfoCode createHotelInfoTypeHotelInfoCodesHotelInfoCode() {
        return new HotelInfoType.HotelInfoCodes.HotelInfoCode();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.Renovation }
     * 
     */
    public HotelInfoType.Descriptions.Renovation createHotelInfoTypeDescriptionsRenovation() {
        return new HotelInfoType.Descriptions.Renovation();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.MultimediaDescriptions }
     * 
     */
    public HotelInfoType.Descriptions.MultimediaDescriptions createHotelInfoTypeDescriptionsMultimediaDescriptions() {
        return new HotelInfoType.Descriptions.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.AgeSurcharge }
     * 
     */
    public VehicleAgeRequirementsType.Age.AgeSurcharge createVehicleAgeRequirementsTypeAgeAgeSurcharge() {
        return new VehicleAgeRequirementsType.Age.AgeSurcharge();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.Vehicles.Vehicle }
     * 
     */
    public VehicleAgeRequirementsType.Age.Vehicles.Vehicle createVehicleAgeRequirementsTypeAgeVehiclesVehicle() {
        return new VehicleAgeRequirementsType.Age.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo }
     * 
     */
    public VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo createVehicleAgeRequirementsTypeAgeAgeInfosAgeInfo() {
        return new VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo();
    }

    /**
     * Create an instance of {@link VideoItemsType.VideoItem }
     * 
     */
    public VideoItemsType.VideoItem createVideoItemsTypeVideoItem() {
        return new VideoItemsType.VideoItem();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType.Primary }
     * 
     */
    public CustomerPrimaryAdditionalType.Primary createCustomerPrimaryAdditionalTypePrimary() {
        return new CustomerPrimaryAdditionalType.Primary();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType.Additional }
     * 
     */
    public CustomerPrimaryAdditionalType.Additional createCustomerPrimaryAdditionalTypeAdditional() {
        return new CustomerPrimaryAdditionalType.Additional();
    }

    /**
     * Create an instance of {@link MembershipType.Membership }
     * 
     */
    public MembershipType.Membership createMembershipTypeMembership() {
        return new MembershipType.Membership();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedFareCode }
     * 
     */
    public CruiseGuestDetailType.SelectedFareCode createCruiseGuestDetailTypeSelectedFareCode() {
        return new CruiseGuestDetailType.SelectedFareCode();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.ContactInfo }
     * 
     */
    public CruiseGuestDetailType.ContactInfo createCruiseGuestDetailTypeContactInfo() {
        return new CruiseGuestDetailType.ContactInfo();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.LoyaltyInfo }
     * 
     */
    public CruiseGuestDetailType.LoyaltyInfo createCruiseGuestDetailTypeLoyaltyInfo() {
        return new CruiseGuestDetailType.LoyaltyInfo();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.LinkedTraveler }
     * 
     */
    public CruiseGuestDetailType.LinkedTraveler createCruiseGuestDetailTypeLinkedTraveler() {
        return new CruiseGuestDetailType.LinkedTraveler();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedDining }
     * 
     */
    public CruiseGuestDetailType.SelectedDining createCruiseGuestDetailTypeSelectedDining() {
        return new CruiseGuestDetailType.SelectedDining();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedInsurance }
     * 
     */
    public CruiseGuestDetailType.SelectedInsurance createCruiseGuestDetailTypeSelectedInsurance() {
        return new CruiseGuestDetailType.SelectedInsurance();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedSpecialServices }
     * 
     */
    public CruiseGuestDetailType.SelectedSpecialServices createCruiseGuestDetailTypeSelectedSpecialServices() {
        return new CruiseGuestDetailType.SelectedSpecialServices();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.AirAccommodations.AirAccommodation }
     * 
     */
    public CruiseGuestDetailType.AirAccommodations.AirAccommodation createCruiseGuestDetailTypeAirAccommodationsAirAccommodation() {
        return new CruiseGuestDetailType.AirAccommodations.AirAccommodation();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedPackages.SelectedPackage }
     * 
     */
    public CruiseGuestDetailType.SelectedPackages.SelectedPackage createCruiseGuestDetailTypeSelectedPackagesSelectedPackage() {
        return new CruiseGuestDetailType.SelectedPackages.SelectedPackage();
    }

    /**
     * Create an instance of {@link CruisePackageType.Location }
     * 
     */
    public CruisePackageType.Location createCruisePackageTypeLocation() {
        return new CruisePackageType.Location();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareBasisCodes }
     * 
     */
    public PTCFareBreakdownType.FareBasisCodes createPTCFareBreakdownTypeFareBasisCodes() {
        return new PTCFareBreakdownType.FareBasisCodes();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TravelerRefNumber }
     * 
     */
    public PTCFareBreakdownType.TravelerRefNumber createPTCFareBreakdownTypeTravelerRefNumber() {
        return new PTCFareBreakdownType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfo }
     * 
     */
    public PTCFareBreakdownType.FareInfo createPTCFareBreakdownTypeFareInfo() {
        return new PTCFareBreakdownType.FareInfo();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg }
     * 
     */
    public PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg createPTCFareBreakdownTypePricingUnitFareComponentFlightLeg() {
        return new PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements.Endorsement }
     * 
     */
    public PTCFareBreakdownType.Endorsements.Endorsement createPTCFareBreakdownTypeEndorsementsEndorsement() {
        return new PTCFareBreakdownType.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TicketDesignators.TicketDesignator }
     * 
     */
    public PTCFareBreakdownType.TicketDesignators.TicketDesignator createPTCFareBreakdownTypeTicketDesignatorsTicketDesignator() {
        return new PTCFareBreakdownType.TicketDesignators.TicketDesignator();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total }
     * 
     */
    public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total createPTCFareBreakdownTypePassengerFareTicketFeeDetailTotal() {
        return new PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee }
     * 
     */
    public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee createPTCFareBreakdownTypePassengerFareTicketFeeDetailFeeBaseFee() {
        return new PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes }
     * 
     */
    public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes createPTCFareBreakdownTypePassengerFareTicketFeeDetailFeeTaxes() {
        return new PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total }
     * 
     */
    public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total createPTCFareBreakdownTypePassengerFareTicketFeeDetailFeeTotal() {
        return new PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total();
    }

    /**
     * Create an instance of {@link PricedItinerariesType.PricedItinerary }
     * 
     */
    public PricedItinerariesType.PricedItinerary createPricedItinerariesTypePricedItinerary() {
        return new PricedItinerariesType.PricedItinerary();
    }

    /**
     * Create an instance of {@link BaseInvCountType.OffSell }
     * 
     */
    public BaseInvCountType.OffSell createBaseInvCountTypeOffSell() {
        return new BaseInvCountType.OffSell();
    }

    /**
     * Create an instance of {@link BaseInvCountType.InvCounts.InvCount.InvBlockCutoff }
     * 
     */
    public BaseInvCountType.InvCounts.InvCount.InvBlockCutoff createBaseInvCountTypeInvCountsInvCountInvBlockCutoff() {
        return new BaseInvCountType.InvCounts.InvCount.InvBlockCutoff();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.GuestDetails }
     * 
     */
    public CruiseGuestInfoType.GuestDetails createCruiseGuestInfoTypeGuestDetails() {
        return new CruiseGuestInfoType.GuestDetails();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.CancellationPenalty }
     * 
     */
    public CruiseGuestInfoType.CancellationPenalty createCruiseGuestInfoTypeCancellationPenalty() {
        return new CruiseGuestInfoType.CancellationPenalty();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.PaymentOptions.PaymentOption }
     * 
     */
    public CruiseGuestInfoType.PaymentOptions.PaymentOption createCruiseGuestInfoTypePaymentOptionsPaymentOption() {
        return new CruiseGuestInfoType.PaymentOptions.PaymentOption();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.LinkedBookings.LinkedBooking }
     * 
     */
    public CruiseGuestInfoType.LinkedBookings.LinkedBooking createCruiseGuestInfoTypeLinkedBookingsLinkedBooking() {
        return new CruiseGuestInfoType.LinkedBookings.LinkedBooking();
    }

    /**
     * Create an instance of {@link AuthorizationType.CheckAuthorization }
     * 
     */
    public AuthorizationType.CheckAuthorization createAuthorizationTypeCheckAuthorization() {
        return new AuthorizationType.CheckAuthorization();
    }

    /**
     * Create an instance of {@link AuthorizationType.CreditCardAuthorization }
     * 
     */
    public AuthorizationType.CreditCardAuthorization createAuthorizationTypeCreditCardAuthorization() {
        return new AuthorizationType.CreditCardAuthorization();
    }

    /**
     * Create an instance of {@link AuthorizationType.BookingReferenceID }
     * 
     */
    public AuthorizationType.BookingReferenceID createAuthorizationTypeBookingReferenceID() {
        return new AuthorizationType.BookingReferenceID();
    }

    /**
     * Create an instance of {@link AuthorizationType.AccountAuthorization.AccountInfo }
     * 
     */
    public AuthorizationType.AccountAuthorization.AccountInfo createAuthorizationTypeAccountAuthorizationAccountInfo() {
        return new AuthorizationType.AccountAuthorization.AccountInfo();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.RoomTypes }
     * 
     */
    public RoomStayLiteType.RoomTypes createRoomStayLiteTypeRoomTypes() {
        return new RoomStayLiteType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.RatePlans }
     * 
     */
    public RoomStayLiteType.RatePlans createRoomStayLiteTypeRatePlans() {
        return new RoomStayLiteType.RatePlans();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.RoomRates }
     * 
     */
    public RoomStayLiteType.RoomRates createRoomStayLiteTypeRoomRates() {
        return new RoomStayLiteType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.BasicPropertyInfo }
     * 
     */
    public RoomStayLiteType.BasicPropertyInfo createRoomStayLiteTypeBasicPropertyInfo() {
        return new RoomStayLiteType.BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.LoyaltyPref }
     * 
     */
    public VehicleProfileRentalPrefType.LoyaltyPref createVehicleProfileRentalPrefTypeLoyaltyPref() {
        return new VehicleProfileRentalPrefType.LoyaltyPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.PaymentFormPref }
     * 
     */
    public VehicleProfileRentalPrefType.PaymentFormPref createVehicleProfileRentalPrefTypePaymentFormPref() {
        return new VehicleProfileRentalPrefType.PaymentFormPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.CoveragePref }
     * 
     */
    public VehicleProfileRentalPrefType.CoveragePref createVehicleProfileRentalPrefTypeCoveragePref() {
        return new VehicleProfileRentalPrefType.CoveragePref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.SpecialEquipPref }
     * 
     */
    public VehicleProfileRentalPrefType.SpecialEquipPref createVehicleProfileRentalPrefTypeSpecialEquipPref() {
        return new VehicleProfileRentalPrefType.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link ResGuestType.ProfileRPHs.ProfileRPH }
     * 
     */
    public ResGuestType.ProfileRPHs.ProfileRPH createResGuestTypeProfileRPHsProfileRPH() {
        return new ResGuestType.ProfileRPHs.ProfileRPH();
    }

    /**
     * Create an instance of {@link CategoryOptionType.Dining }
     * 
     */
    public CategoryOptionType.Dining createCategoryOptionTypeDining() {
        return new CategoryOptionType.Dining();
    }

    /**
     * Create an instance of {@link CategoryOptionType.PriceInfos.PriceInfo }
     * 
     */
    public CategoryOptionType.PriceInfos.PriceInfo createCategoryOptionTypePriceInfosPriceInfo() {
        return new CategoryOptionType.PriceInfos.PriceInfo();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.RentalPaymentPref }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.RentalPaymentPref createVehicleReservationRQAdditionalInfoTypeRentalPaymentPref() {
        return new VehicleReservationRQAdditionalInfoType.RentalPaymentPref();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.Reference }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.Reference createVehicleReservationRQAdditionalInfoTypeReference() {
        return new VehicleReservationRQAdditionalInfoType.Reference();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.CoveragePrefs.CoveragePref }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.CoveragePrefs.CoveragePref createVehicleReservationRQAdditionalInfoTypeCoveragePrefsCoveragePref() {
        return new VehicleReservationRQAdditionalInfoType.CoveragePrefs.CoveragePref();
    }

    /**
     * Create an instance of {@link FulfillmentType.Receipt }
     * 
     */
    public FulfillmentType.Receipt createFulfillmentTypeReceipt() {
        return new FulfillmentType.Receipt();
    }

    /**
     * Create an instance of {@link FulfillmentType.PaymentText }
     * 
     */
    public FulfillmentType.PaymentText createFulfillmentTypePaymentText() {
        return new FulfillmentType.PaymentText();
    }

    /**
     * Create an instance of {@link FulfillmentType.PaymentDetails.PaymentDetail }
     * 
     */
    public FulfillmentType.PaymentDetails.PaymentDetail createFulfillmentTypePaymentDetailsPaymentDetail() {
        return new FulfillmentType.PaymentDetails.PaymentDetail();
    }

    /**
     * Create an instance of {@link HotelResModifyType.HotelResModify.Verification }
     * 
     */
    public HotelResModifyType.HotelResModify.Verification createHotelResModifyTypeHotelResModifyVerification() {
        return new HotelResModifyType.HotelResModify.Verification();
    }

    /**
     * Create an instance of {@link VerificationType.PersonName }
     * 
     */
    public VerificationType.PersonName createVerificationTypePersonName() {
        return new VerificationType.PersonName();
    }

    /**
     * Create an instance of {@link VerificationType.TelephoneInfo }
     * 
     */
    public VerificationType.TelephoneInfo createVerificationTypeTelephoneInfo() {
        return new VerificationType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link VerificationType.CustLoyalty }
     * 
     */
    public VerificationType.CustLoyalty createVerificationTypeCustLoyalty() {
        return new VerificationType.CustLoyalty();
    }

    /**
     * Create an instance of {@link VerificationType.ReservationTimeSpan }
     * 
     */
    public VerificationType.ReservationTimeSpan createVerificationTypeReservationTimeSpan() {
        return new VerificationType.ReservationTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationType.AssociatedQuantity }
     * 
     */
    public VerificationType.AssociatedQuantity createVerificationTypeAssociatedQuantity() {
        return new VerificationType.AssociatedQuantity();
    }

    /**
     * Create an instance of {@link VerificationType.StartLocation }
     * 
     */
    public VerificationType.StartLocation createVerificationTypeStartLocation() {
        return new VerificationType.StartLocation();
    }

    /**
     * Create an instance of {@link VerificationType.EndLocation }
     * 
     */
    public VerificationType.EndLocation createVerificationTypeEndLocation() {
        return new VerificationType.EndLocation();
    }

    /**
     * Create an instance of {@link SailingType.Dining }
     * 
     */
    public SailingType.Dining createSailingTypeDining() {
        return new SailingType.Dining();
    }

    /**
     * Create an instance of {@link VehicleAvailRQAdditionalInfoType.CoveragePrefs.CoveragePref }
     * 
     */
    public VehicleAvailRQAdditionalInfoType.CoveragePrefs.CoveragePref createVehicleAvailRQAdditionalInfoTypeCoveragePrefsCoveragePref() {
        return new VehicleAvailRQAdditionalInfoType.CoveragePrefs.CoveragePref();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo }
     * 
     */
    public CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo createCruiseBookingInfoTypeGuestPricesGuestPricePriceInfosPriceInfo() {
        return new CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.PaymentSchedule.Payment }
     * 
     */
    public CruiseBookingInfoType.PaymentSchedule.Payment createCruiseBookingInfoTypePaymentSchedulePayment() {
        return new CruiseBookingInfoType.PaymentSchedule.Payment();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.BookingPrices.BookingPrice }
     * 
     */
    public CruiseBookingInfoType.BookingPrices.BookingPrice createCruiseBookingInfoTypeBookingPricesBookingPrice() {
        return new CruiseBookingInfoType.BookingPrices.BookingPrice();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.CurrencyConversions.CurrencyConversion }
     * 
     */
    public OTAHotelAvailRS.CurrencyConversions.CurrencyConversion createOTAHotelAvailRSCurrencyConversionsCurrencyConversion() {
        return new OTAHotelAvailRS.CurrencyConversions.CurrencyConversion();
    }

    /**
     * Create an instance of {@link AreasType.Area }
     * 
     */
    public AreasType.Area createAreasTypeArea() {
        return new AreasType.Area();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.RoomStays.RoomStay.Reference }
     * 
     */
    public OTAHotelAvailRS.RoomStays.RoomStay.Reference createOTAHotelAvailRSRoomStaysRoomStayReference() {
        return new OTAHotelAvailRS.RoomStays.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction }
     * 
     */
    public OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction createOTAHotelAvailRSHotelStaysHotelStayAvailabilityRestriction() {
        return new OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction();
    }

    /**
     * Create an instance of {@link ProfilesType.ProfileInfo }
     * 
     */
    public ProfilesType.ProfileInfo createProfilesTypeProfileInfo() {
        return new ProfilesType.ProfileInfo();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType.HotelReservationID }
     * 
     */
    public HotelReservationIDsType.HotelReservationID createHotelReservationIDsTypeHotelReservationID() {
        return new HotelReservationIDsType.HotelReservationID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPAExtensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TPA_Extensions")
    public JAXBElement<TPAExtensionsType> createTPAExtensions(TPAExtensionsType value) {
        return new JAXBElement<TPAExtensionsType>(_TPAExtensions_QNAME, TPAExtensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAcknowledgementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelAvailNotifRS")
    public JAXBElement<MessageAcknowledgementType> createOTAHotelAvailNotifRS(MessageAcknowledgementType value) {
        return new JAXBElement<MessageAcknowledgementType>(_OTAHotelAvailNotifRS_QNAME, MessageAcknowledgementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAcknowledgementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelRateAmountNotifRS")
    public JAXBElement<MessageAcknowledgementType> createOTAHotelRateAmountNotifRS(MessageAcknowledgementType value) {
        return new JAXBElement<MessageAcknowledgementType>(_OTAHotelRateAmountNotifRS_QNAME, MessageAcknowledgementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Image", scope = ParagraphType.class)
    public JAXBElement<String> createParagraphTypeImage(String value) {
        return new JAXBElement<String>(_ParagraphTypeImage_QNAME, String.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "URL", scope = ParagraphType.class)
    public JAXBElement<String> createParagraphTypeURL(String value) {
        return new JAXBElement<String>(_ParagraphTypeURL_QNAME, String.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormattedTextTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Text", scope = ParagraphType.class)
    public JAXBElement<FormattedTextTextType> createParagraphTypeText(FormattedTextTextType value) {
        return new JAXBElement<FormattedTextTextType>(_ParagraphTypeText_QNAME, FormattedTextTextType.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParagraphType.ListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ListItem", scope = ParagraphType.class)
    public JAXBElement<ParagraphType.ListItem> createParagraphTypeListItem(ParagraphType.ListItem value) {
        return new JAXBElement<ParagraphType.ListItem>(_ParagraphTypeListItem_QNAME, ParagraphType.ListItem.class, ParagraphType.class, value);
    }

}
