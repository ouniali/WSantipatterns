
package travel.whl.api.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the travel.whl.api.soap package. 
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

    private final static QName _HotelAvailNotifRS_QNAME = new QName("http://api.whl.travel/soap", "HotelAvailNotifRS");
    private final static QName _HotelResRS_QNAME = new QName("http://api.whl.travel/soap", "HotelResRS");
    private final static QName _ParagraphTypeText_QNAME = new QName("", "Text");
    private final static QName _ParagraphTypeListItem_QNAME = new QName("", "ListItem");
    private final static QName _ParagraphTypeImage_QNAME = new QName("", "Image");
    private final static QName _ParagraphTypeURL_QNAME = new QName("", "URL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: travel.whl.api.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HotelAvailRS }
     * 
     */
    public HotelAvailRS createHotelAvailRS() {
        return new HotelAvailRS();
    }

    /**
     * Create an instance of {@link HotelAvailRQ }
     * 
     */
    public HotelAvailRQ createHotelAvailRQ() {
        return new HotelAvailRQ();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRQ }
     * 
     */
    public HotelDescriptiveInfoRQ createHotelDescriptiveInfoRQ() {
        return new HotelDescriptiveInfoRQ();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRS }
     * 
     */
    public HotelDescriptiveInfoRS createHotelDescriptiveInfoRS() {
        return new HotelDescriptiveInfoRS();
    }

    /**
     * Create an instance of {@link HotelAvailNotifRQ }
     * 
     */
    public HotelAvailNotifRQ createHotelAvailNotifRQ() {
        return new HotelAvailNotifRQ();
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
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link URLsType }
     * 
     */
    public URLsType createURLsType() {
        return new URLsType();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType }
     * 
     */
    public HotelDescriptiveContentType createHotelDescriptiveContentType() {
        return new HotelDescriptiveContentType();
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
     * Create an instance of {@link HotelReservationIDsType }
     * 
     */
    public HotelReservationIDsType createHotelReservationIDsType() {
        return new HotelReservationIDsType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link TextDescriptionType }
     * 
     */
    public TextDescriptionType createTextDescriptionType() {
        return new TextDescriptionType();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRequestType }
     * 
     */
    public HotelDescriptiveInfoRequestType createHotelDescriptiveInfoRequestType() {
        return new HotelDescriptiveInfoRequestType();
    }

    /**
     * Create an instance of {@link AddressesType }
     * 
     */
    public AddressesType createAddressesType() {
        return new AddressesType();
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
     * Create an instance of {@link ProfilesType }
     * 
     */
    public ProfilesType createProfilesType() {
        return new ProfilesType();
    }

    /**
     * Create an instance of {@link VideoDescriptionType }
     * 
     */
    public VideoDescriptionType createVideoDescriptionType() {
        return new VideoDescriptionType();
    }

    /**
     * Create an instance of {@link ImageDescriptionType }
     * 
     */
    public ImageDescriptionType createImageDescriptionType() {
        return new ImageDescriptionType();
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
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link GuestCountType }
     * 
     */
    public GuestCountType createGuestCountType() {
        return new GuestCountType();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType }
     * 
     */
    public AvailStatusMessageType createAvailStatusMessageType() {
        return new AvailStatusMessageType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link AreaInfoType }
     * 
     */
    public AreaInfoType createAreaInfoType() {
        return new AreaInfoType();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations }
     * 
     */
    public AreaInfoType.Recreations createAreaInfoTypeRecreations() {
        return new AreaInfoType.Recreations();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions }
     * 
     */
    public AreaInfoType.Attractions createAreaInfoTypeAttractions() {
        return new AreaInfoType.Attractions();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType }
     * 
     */
    public ItemSearchCriterionType createItemSearchCriterionType() {
        return new ItemSearchCriterionType();
    }

    /**
     * Create an instance of {@link HotelInfoType }
     * 
     */
    public HotelInfoType createHotelInfoType() {
        return new HotelInfoType();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType }
     * 
     */
    public HotelSearchCriteriaType createHotelSearchCriteriaType() {
        return new HotelSearchCriteriaType();
    }

    /**
     * Create an instance of {@link VideoItemsType }
     * 
     */
    public VideoItemsType createVideoItemsType() {
        return new VideoItemsType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType }
     * 
     */
    public LengthsOfStayType createLengthsOfStayType() {
        return new LengthsOfStayType();
    }

    /**
     * Create an instance of {@link HotelAdditionalChargesType }
     * 
     */
    public HotelAdditionalChargesType createHotelAdditionalChargesType() {
        return new HotelAdditionalChargesType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
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
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link CategoryCodesType }
     * 
     */
    public CategoryCodesType createCategoryCodesType() {
        return new CategoryCodesType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link ImageItemsType }
     * 
     */
    public ImageItemsType createImageItemsType() {
        return new ImageItemsType();
    }

    /**
     * Create an instance of {@link PaymentFormType }
     * 
     */
    public PaymentFormType createPaymentFormType() {
        return new PaymentFormType();
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
     * Create an instance of {@link TextItemsType }
     * 
     */
    public TextItemsType createTextItemsType() {
        return new TextItemsType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link RoomStaysType }
     * 
     */
    public RoomStaysType createRoomStaysType() {
        return new RoomStaysType();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRS.HotelDescriptiveContents }
     * 
     */
    public HotelDescriptiveInfoRS.HotelDescriptiveContents createHotelDescriptiveInfoRSHotelDescriptiveContents() {
        return new HotelDescriptiveInfoRS.HotelDescriptiveContents();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRQ.HotelDescriptiveInfos }
     * 
     */
    public HotelDescriptiveInfoRQ.HotelDescriptiveInfos createHotelDescriptiveInfoRQHotelDescriptiveInfos() {
        return new HotelDescriptiveInfoRQ.HotelDescriptiveInfos();
    }

    /**
     * Create an instance of {@link HotelAvailRS.RoomStays }
     * 
     */
    public HotelAvailRS.RoomStays createHotelAvailRSRoomStays() {
        return new HotelAvailRS.RoomStays();
    }

    /**
     * Create an instance of {@link DestinationListRS }
     * 
     */
    public DestinationListRS createDestinationListRS() {
        return new DestinationListRS();
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
     * Create an instance of {@link Destinations }
     * 
     */
    public Destinations createDestinations() {
        return new Destinations();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link HotelListRS }
     * 
     */
    public HotelListRS createHotelListRS() {
        return new HotelListRS();
    }

    /**
     * Create an instance of {@link HotelsType }
     * 
     */
    public HotelsType createHotelsType() {
        return new HotelsType();
    }

    /**
     * Create an instance of {@link GetBookingsRS }
     * 
     */
    public GetBookingsRS createGetBookingsRS() {
        return new GetBookingsRS();
    }

    /**
     * Create an instance of {@link GetBookingsResponseType }
     * 
     */
    public GetBookingsResponseType createGetBookingsResponseType() {
        return new GetBookingsResponseType();
    }

    /**
     * Create an instance of {@link HotelListRQ }
     * 
     */
    public HotelListRQ createHotelListRQ() {
        return new HotelListRQ();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link HotelAvailRQ.AvailRequestSegments }
     * 
     */
    public HotelAvailRQ.AvailRequestSegments createHotelAvailRQAvailRequestSegments() {
        return new HotelAvailRQ.AvailRequestSegments();
    }

    /**
     * Create an instance of {@link DestinationListRQ }
     * 
     */
    public DestinationListRQ createDestinationListRQ() {
        return new DestinationListRQ();
    }

    /**
     * Create an instance of {@link UpdateAllotmentRQ }
     * 
     */
    public UpdateAllotmentRQ createUpdateAllotmentRQ() {
        return new UpdateAllotmentRQ();
    }

    /**
     * Create an instance of {@link UpdateAllotmentType }
     * 
     */
    public UpdateAllotmentType createUpdateAllotmentType() {
        return new UpdateAllotmentType();
    }

    /**
     * Create an instance of {@link UpdateAllotmentRS }
     * 
     */
    public UpdateAllotmentRS createUpdateAllotmentRS() {
        return new UpdateAllotmentRS();
    }

    /**
     * Create an instance of {@link MessageAcknowledgementType }
     * 
     */
    public MessageAcknowledgementType createMessageAcknowledgementType() {
        return new MessageAcknowledgementType();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link HotelAvailNotifRQ.AvailStatusMessages }
     * 
     */
    public HotelAvailNotifRQ.AvailStatusMessages createHotelAvailNotifRQAvailStatusMessages() {
        return new HotelAvailNotifRQ.AvailStatusMessages();
    }

    /**
     * Create an instance of {@link ApplicationFault }
     * 
     */
    public ApplicationFault createApplicationFault() {
        return new ApplicationFault();
    }

    /**
     * Create an instance of {@link NationListRS }
     * 
     */
    public NationListRS createNationListRS() {
        return new NationListRS();
    }

    /**
     * Create an instance of {@link CountriesType }
     * 
     */
    public CountriesType createCountriesType() {
        return new CountriesType();
    }

    /**
     * Create an instance of {@link CountryListRS }
     * 
     */
    public CountryListRS createCountryListRS() {
        return new CountryListRS();
    }

    /**
     * Create an instance of {@link NationListRQ }
     * 
     */
    public NationListRQ createNationListRQ() {
        return new NationListRQ();
    }

    /**
     * Create an instance of {@link HotelResRQ }
     * 
     */
    public HotelResRQ createHotelResRQ() {
        return new HotelResRQ();
    }

    /**
     * Create an instance of {@link HotelResRequestType }
     * 
     */
    public HotelResRequestType createHotelResRequestType() {
        return new HotelResRequestType();
    }

    /**
     * Create an instance of {@link HotelReservationsType }
     * 
     */
    public HotelReservationsType createHotelReservationsType() {
        return new HotelReservationsType();
    }

    /**
     * Create an instance of {@link GetBookingsRQ }
     * 
     */
    public GetBookingsRQ createGetBookingsRQ() {
        return new GetBookingsRQ();
    }

    /**
     * Create an instance of {@link GetBookingsType }
     * 
     */
    public GetBookingsType createGetBookingsType() {
        return new GetBookingsType();
    }

    /**
     * Create an instance of {@link HotelResResponseType }
     * 
     */
    public HotelResResponseType createHotelResResponseType() {
        return new HotelResResponseType();
    }

    /**
     * Create an instance of {@link CountryListRQ }
     * 
     */
    public CountryListRQ createCountryListRQ() {
        return new CountryListRQ();
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
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link BankAcctType }
     * 
     */
    public BankAcctType createBankAcctType() {
        return new BankAcctType();
    }

    /**
     * Create an instance of {@link InventoryType }
     * 
     */
    public InventoryType createInventoryType() {
        return new InventoryType();
    }

    /**
     * Create an instance of {@link ExtrasType }
     * 
     */
    public ExtrasType createExtrasType() {
        return new ExtrasType();
    }

    /**
     * Create an instance of {@link ResGuestType }
     * 
     */
    public ResGuestType createResGuestType() {
        return new ResGuestType();
    }

    /**
     * Create an instance of {@link ResGuestsType }
     * 
     */
    public ResGuestsType createResGuestsType() {
        return new ResGuestsType();
    }

    /**
     * Create an instance of {@link RoomTypeType }
     * 
     */
    public RoomTypeType createRoomTypeType() {
        return new RoomTypeType();
    }

    /**
     * Create an instance of {@link BookingsType }
     * 
     */
    public BookingsType createBookingsType() {
        return new BookingsType();
    }

    /**
     * Create an instance of {@link RoomRateType }
     * 
     */
    public RoomRateType createRoomRateType() {
        return new RoomRateType();
    }

    /**
     * Create an instance of {@link ResCommonDetailType }
     * 
     */
    public ResCommonDetailType createResCommonDetailType() {
        return new ResCommonDetailType();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link ResGlobalInfoType }
     * 
     */
    public ResGlobalInfoType createResGlobalInfoType() {
        return new ResGlobalInfoType();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link GuestDetailType }
     * 
     */
    public GuestDetailType createGuestDetailType() {
        return new GuestDetailType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType }
     * 
     */
    public MultimediaDescriptionsType createMultimediaDescriptionsType() {
        return new MultimediaDescriptionsType();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType }
     * 
     */
    public HotelSearchCriterionType createHotelSearchCriterionType() {
        return new HotelSearchCriterionType();
    }

    /**
     * Create an instance of {@link ImageItemType }
     * 
     */
    public ImageItemType createImageItemType() {
        return new ImageItemType();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionType }
     * 
     */
    public MultimediaDescriptionType createMultimediaDescriptionType() {
        return new MultimediaDescriptionType();
    }

    /**
     * Create an instance of {@link RoomDetailsType }
     * 
     */
    public RoomDetailsType createRoomDetailsType() {
        return new RoomDetailsType();
    }

    /**
     * Create an instance of {@link StreetNmbrType }
     * 
     */
    public StreetNmbrType createStreetNmbrType() {
        return new StreetNmbrType();
    }

    /**
     * Create an instance of {@link HotelReservationType }
     * 
     */
    public HotelReservationType createHotelReservationType() {
        return new HotelReservationType();
    }

    /**
     * Create an instance of {@link VideoItemType }
     * 
     */
    public VideoItemType createVideoItemType() {
        return new VideoItemType();
    }

    /**
     * Create an instance of {@link DateTimeSpanType }
     * 
     */
    public DateTimeSpanType createDateTimeSpanType() {
        return new DateTimeSpanType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link BookingType }
     * 
     */
    public BookingType createBookingType() {
        return new BookingType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link ExServiceType }
     * 
     */
    public ExServiceType createExServiceType() {
        return new ExServiceType();
    }

    /**
     * Create an instance of {@link StatusApplicationControlType }
     * 
     */
    public StatusApplicationControlType createStatusApplicationControlType() {
        return new StatusApplicationControlType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType }
     * 
     */
    public BasicPropertyInfoType createBasicPropertyInfoType() {
        return new BasicPropertyInfoType();
    }

    /**
     * Create an instance of {@link GuestsType }
     * 
     */
    public GuestsType createGuestsType() {
        return new GuestsType();
    }

    /**
     * Create an instance of {@link LanguagesType }
     * 
     */
    public LanguagesType createLanguagesType() {
        return new LanguagesType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link RoomDetailType }
     * 
     */
    public RoomDetailType createRoomDetailType() {
        return new RoomDetailType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
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
     * Create an instance of {@link ContactInfosType }
     * 
     */
    public ContactInfosType createContactInfosType() {
        return new ContactInfosType();
    }

    /**
     * Create an instance of {@link CriteriaType }
     * 
     */
    public CriteriaType createCriteriaType() {
        return new CriteriaType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentsType }
     * 
     */
    public AcceptedPaymentsType createAcceptedPaymentsType() {
        return new AcceptedPaymentsType();
    }

    /**
     * Create an instance of {@link RoomsType }
     * 
     */
    public RoomsType createRoomsType() {
        return new RoomsType();
    }

    /**
     * Create an instance of {@link CountryNameType }
     * 
     */
    public CountryNameType createCountryNameType() {
        return new CountryNameType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     * 
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link CancelPenaltiesType }
     * 
     */
    public CancelPenaltiesType createCancelPenaltiesType() {
        return new CancelPenaltiesType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomTypes }
     * 
     */
    public RoomStayType.RoomTypes createRoomStayTypeRoomTypes() {
        return new RoomStayType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate }
     * 
     */
    public RoomStayType.RoomRates.RoomRate createRoomStayTypeRoomRatesRoomRate() {
        return new RoomStayType.RoomRates.RoomRate();
    }

    /**
     * Create an instance of {@link AddressType.StreetNmbr }
     * 
     */
    public AddressType.StreetNmbr createAddressTypeStreetNmbr() {
        return new AddressType.StreetNmbr();
    }

    /**
     * Create an instance of {@link URLsType.URL }
     * 
     */
    public URLsType.URL createURLsTypeURL() {
        return new URLsType.URL();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.Policies }
     * 
     */
    public HotelDescriptiveContentType.Policies createHotelDescriptiveContentTypePolicies() {
        return new HotelDescriptiveContentType.Policies();
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
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy createPoliciesTypePolicyCommissionPolicy() {
        return new PoliciesType.Policy.CommissionPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.FeePolicies }
     * 
     */
    public PoliciesType.Policy.FeePolicies createPoliciesTypePolicyFeePolicies() {
        return new PoliciesType.Policy.FeePolicies();
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
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.AmountPercent createRequiredPaymentsTypeGuaranteePaymentAmountPercent() {
        return new RequiredPaymentsType.GuaranteePayment.AmountPercent();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType.HotelReservationID }
     * 
     */
    public HotelReservationIDsType.HotelReservationID createHotelReservationIDsTypeHotelReservationID() {
        return new HotelReservationIDsType.HotelReservationID();
    }

    /**
     * Create an instance of {@link ContactInfoType.CompanyName }
     * 
     */
    public ContactInfoType.CompanyName createContactInfoTypeCompanyName() {
        return new ContactInfoType.CompanyName();
    }

    /**
     * Create an instance of {@link TextDescriptionType.Description }
     * 
     */
    public TextDescriptionType.Description createTextDescriptionTypeDescription() {
        return new TextDescriptionType.Description();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRequestType.HotelInfo }
     * 
     */
    public HotelDescriptiveInfoRequestType.HotelInfo createHotelDescriptiveInfoRequestTypeHotelInfo() {
        return new HotelDescriptiveInfoRequestType.HotelInfo();
    }

    /**
     * Create an instance of {@link AddressesType.Address }
     * 
     */
    public AddressesType.Address createAddressesTypeAddress() {
        return new AddressesType.Address();
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
     * Create an instance of {@link ProfilesType.ProfileInfo }
     * 
     */
    public ProfilesType.ProfileInfo createProfilesTypeProfileInfo() {
        return new ProfilesType.ProfileInfo();
    }

    /**
     * Create an instance of {@link VideoDescriptionType.VideoFormat }
     * 
     */
    public VideoDescriptionType.VideoFormat createVideoDescriptionTypeVideoFormat() {
        return new VideoDescriptionType.VideoFormat();
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
     * Create an instance of {@link ParagraphType.ListItem }
     * 
     */
    public ParagraphType.ListItem createParagraphTypeListItem() {
        return new ParagraphType.ListItem();
    }

    /**
     * Create an instance of {@link GuestCountType.GuestCount }
     * 
     */
    public GuestCountType.GuestCount createGuestCountTypeGuestCount() {
        return new GuestCountType.GuestCount();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.RestrictionStatus }
     * 
     */
    public AvailStatusMessageType.RestrictionStatus createAvailStatusMessageTypeRestrictionStatus() {
        return new AvailStatusMessageType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link SourceType.RequestorID }
     * 
     */
    public SourceType.RequestorID createSourceTypeRequestorID() {
        return new SourceType.RequestorID();
    }

    /**
     * Create an instance of {@link SourceType.BookingChannel }
     * 
     */
    public SourceType.BookingChannel createSourceTypeBookingChannel() {
        return new SourceType.BookingChannel();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation }
     * 
     */
    public AreaInfoType.Recreations.Recreation createAreaInfoTypeRecreationsRecreation() {
        return new AreaInfoType.Recreations.Recreation();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction }
     * 
     */
    public AreaInfoType.Attractions.Attraction createAreaInfoTypeAttractionsAttraction() {
        return new AreaInfoType.Attractions.Attraction();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.HotelRef }
     * 
     */
    public ItemSearchCriterionType.HotelRef createItemSearchCriterionTypeHotelRef() {
        return new ItemSearchCriterionType.HotelRef();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelName }
     * 
     */
    public HotelInfoType.HotelName createHotelInfoTypeHotelName() {
        return new HotelInfoType.HotelName();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions }
     * 
     */
    public HotelInfoType.Descriptions createHotelInfoTypeDescriptions() {
        return new HotelInfoType.Descriptions();
    }

    /**
     * Create an instance of {@link HotelInfoType.Position }
     * 
     */
    public HotelInfoType.Position createHotelInfoTypePosition() {
        return new HotelInfoType.Position();
    }

    /**
     * Create an instance of {@link HotelInfoType.Services }
     * 
     */
    public HotelInfoType.Services createHotelInfoTypeServices() {
        return new HotelInfoType.Services();
    }

    /**
     * Create an instance of {@link HotelInfoType.HostInfo }
     * 
     */
    public HotelInfoType.HostInfo createHotelInfoTypeHostInfo() {
        return new HotelInfoType.HostInfo();
    }

    /**
     * Create an instance of {@link HotelInfoType.CaringForDestination }
     * 
     */
    public HotelInfoType.CaringForDestination createHotelInfoTypeCaringForDestination() {
        return new HotelInfoType.CaringForDestination();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.Criterion }
     * 
     */
    public HotelSearchCriteriaType.Criterion createHotelSearchCriteriaTypeCriterion() {
        return new HotelSearchCriteriaType.Criterion();
    }

    /**
     * Create an instance of {@link VideoItemsType.VideoItem }
     * 
     */
    public VideoItemsType.VideoItem createVideoItemsTypeVideoItem() {
        return new VideoItemsType.VideoItem();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay }
     * 
     */
    public LengthsOfStayType.LengthOfStay createLengthsOfStayTypeLengthOfStay() {
        return new LengthsOfStayType.LengthOfStay();
    }

    /**
     * Create an instance of {@link HotelAdditionalChargesType.AdditionalCharge }
     * 
     */
    public HotelAdditionalChargesType.AdditionalCharge createHotelAdditionalChargesTypeAdditionalCharge() {
        return new HotelAdditionalChargesType.AdditionalCharge();
    }

    /**
     * Create an instance of {@link RateType.Rate }
     * 
     */
    public RateType.Rate createRateTypeRate() {
        return new RateType.Rate();
    }

    /**
     * Create an instance of {@link AmountType.Discount }
     * 
     */
    public AmountType.Discount createAmountTypeDiscount() {
        return new AmountType.Discount();
    }

    /**
     * Create an instance of {@link ContactsType.Name.JobTitle }
     * 
     */
    public ContactsType.Name.JobTitle createContactsTypeNameJobTitle() {
        return new ContactsType.Name.JobTitle();
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
     * Create an instance of {@link ImageItemsType.ImageItem }
     * 
     */
    public ImageItemsType.ImageItem createImageItemsTypeImageItem() {
        return new ImageItemsType.ImageItem();
    }

    /**
     * Create an instance of {@link PaymentFormType.Cash }
     * 
     */
    public PaymentFormType.Cash createPaymentFormTypeCash() {
        return new PaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link EmailsType.Email }
     * 
     */
    public EmailsType.Email createEmailsTypeEmail() {
        return new EmailsType.Email();
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
     * Create an instance of {@link TextItemsType.TextItem }
     * 
     */
    public TextItemsType.TextItem createTextItemsTypeTextItem() {
        return new TextItemsType.TextItem();
    }

    /**
     * Create an instance of {@link CancelPenaltyType.Deadline }
     * 
     */
    public CancelPenaltyType.Deadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyType.Deadline();
    }

    /**
     * Create an instance of {@link RoomStaysType.RoomStay }
     * 
     */
    public RoomStaysType.RoomStay createRoomStaysTypeRoomStay() {
        return new RoomStaysType.RoomStay();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent }
     * 
     */
    public HotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent createHotelDescriptiveInfoRSHotelDescriptiveContentsHotelDescriptiveContent() {
        return new HotelDescriptiveInfoRS.HotelDescriptiveContents.HotelDescriptiveContent();
    }

    /**
     * Create an instance of {@link HotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo }
     * 
     */
    public HotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo createHotelDescriptiveInfoRQHotelDescriptiveInfosHotelDescriptiveInfo() {
        return new HotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo();
    }

    /**
     * Create an instance of {@link HotelAvailRS.RoomStays.RoomStay }
     * 
     */
    public HotelAvailRS.RoomStays.RoomStay createHotelAvailRSRoomStaysRoomStay() {
        return new HotelAvailRS.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAcknowledgementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.whl.travel/soap", name = "HotelAvailNotifRS")
    public JAXBElement<MessageAcknowledgementType> createHotelAvailNotifRS(MessageAcknowledgementType value) {
        return new JAXBElement<MessageAcknowledgementType>(_HotelAvailNotifRS_QNAME, MessageAcknowledgementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelResResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.whl.travel/soap", name = "HotelResRS")
    public JAXBElement<HotelResResponseType> createHotelResRS(HotelResResponseType value) {
        return new JAXBElement<HotelResResponseType>(_HotelResRS_QNAME, HotelResResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormattedTextTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Text", scope = ParagraphType.class)
    public JAXBElement<FormattedTextTextType> createParagraphTypeText(FormattedTextTextType value) {
        return new JAXBElement<FormattedTextTextType>(_ParagraphTypeText_QNAME, FormattedTextTextType.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParagraphType.ListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ListItem", scope = ParagraphType.class)
    public JAXBElement<ParagraphType.ListItem> createParagraphTypeListItem(ParagraphType.ListItem value) {
        return new JAXBElement<ParagraphType.ListItem>(_ParagraphTypeListItem_QNAME, ParagraphType.ListItem.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Image", scope = ParagraphType.class)
    public JAXBElement<String> createParagraphTypeImage(String value) {
        return new JAXBElement<String>(_ParagraphTypeImage_QNAME, String.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "URL", scope = ParagraphType.class)
    public JAXBElement<String> createParagraphTypeURL(String value) {
        return new JAXBElement<String>(_ParagraphTypeURL_QNAME, String.class, ParagraphType.class, value);
    }

}
