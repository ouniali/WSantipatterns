
package https.newhotel.web.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.opentravel.ota._2003._05.OTAHotelAvailGetRS;
import org.opentravel.ota._2003._05.OTAHotelRatePlanRS;
import org.opentravel.ota._2003._05.OTAHotelResNotifRS;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.newhotel.web.services package. 
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

    private final static QName _OTAHotelResNotifRS_QNAME = new QName("https://NewHotel/Web/Services/", "OTA_HotelResNotifRS");
    private final static QName _OTAHotelAvailGetRS_QNAME = new QName("https://NewHotel/Web/Services/", "OTA_HotelAvailGetRS");
    private final static QName _AuthHeader_QNAME = new QName("https://NewHotel/Web/Services/", "AuthHeader");
    private final static QName _OTAHotelRatePlanRQ_QNAME = new QName("https://NewHotel/Web/Services/", "OTA_HotelRatePlanRQ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.newhotel.web.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPendingJobs }
     * 
     */
    public GetPendingJobs createGetPendingJobs() {
        return new GetPendingJobs();
    }

    /**
     * Create an instance of {@link PendingJobsRequest }
     * 
     */
    public PendingJobsRequest createPendingJobsRequest() {
        return new PendingJobsRequest();
    }

    /**
     * Create an instance of {@link RoomStatusChangeResponse }
     * 
     */
    public RoomStatusChangeResponse createRoomStatusChangeResponse() {
        return new RoomStatusChangeResponse();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link KioskGetHotelSettingsResponse }
     * 
     */
    public KioskGetHotelSettingsResponse createKioskGetHotelSettingsResponse() {
        return new KioskGetHotelSettingsResponse();
    }

    /**
     * Create an instance of {@link KioskHotelSettingsResponse }
     * 
     */
    public KioskHotelSettingsResponse createKioskHotelSettingsResponse() {
        return new KioskHotelSettingsResponse();
    }

    /**
     * Create an instance of {@link NotifyMessageCompletion }
     * 
     */
    public NotifyMessageCompletion createNotifyMessageCompletion() {
        return new NotifyMessageCompletion();
    }

    /**
     * Create an instance of {@link JobCompletionCollectionRequest }
     * 
     */
    public JobCompletionCollectionRequest createJobCompletionCollectionRequest() {
        return new JobCompletionCollectionRequest();
    }

    /**
     * Create an instance of {@link PhoneDeviceNotify }
     * 
     */
    public PhoneDeviceNotify createPhoneDeviceNotify() {
        return new PhoneDeviceNotify();
    }

    /**
     * Create an instance of {@link PhoneDeviceRequest }
     * 
     */
    public PhoneDeviceRequest createPhoneDeviceRequest() {
        return new PhoneDeviceRequest();
    }

    /**
     * Create an instance of {@link KioskGetAvailableRoomTypePricesResponse }
     * 
     */
    public KioskGetAvailableRoomTypePricesResponse createKioskGetAvailableRoomTypePricesResponse() {
        return new KioskGetAvailableRoomTypePricesResponse();
    }

    /**
     * Create an instance of {@link KioskRoomTypePricesCollectionResponse }
     * 
     */
    public KioskRoomTypePricesCollectionResponse createKioskRoomTypePricesCollectionResponse() {
        return new KioskRoomTypePricesCollectionResponse();
    }

    /**
     * Create an instance of {@link TransferCCCharge }
     * 
     */
    public TransferCCCharge createTransferCCCharge() {
        return new TransferCCCharge();
    }

    /**
     * Create an instance of {@link TransferCCRequest }
     * 
     */
    public TransferCCRequest createTransferCCRequest() {
        return new TransferCCRequest();
    }

    /**
     * Create an instance of {@link KioskGetImageResponse }
     * 
     */
    public KioskGetImageResponse createKioskGetImageResponse() {
        return new KioskGetImageResponse();
    }

    /**
     * Create an instance of {@link KioskImageResponse }
     * 
     */
    public KioskImageResponse createKioskImageResponse() {
        return new KioskImageResponse();
    }

    /**
     * Create an instance of {@link GetNomenclaturesResponse }
     * 
     */
    public GetNomenclaturesResponse createGetNomenclaturesResponse() {
        return new GetNomenclaturesResponse();
    }

    /**
     * Create an instance of {@link NomenclatureResponse }
     * 
     */
    public NomenclatureResponse createNomenclatureResponse() {
        return new NomenclatureResponse();
    }

    /**
     * Create an instance of {@link PhoneDeviceNotifyResponse }
     * 
     */
    public PhoneDeviceNotifyResponse createPhoneDeviceNotifyResponse() {
        return new PhoneDeviceNotifyResponse();
    }

    /**
     * Create an instance of {@link GetPendingMessageResponse }
     * 
     */
    public GetPendingMessageResponse createGetPendingMessageResponse() {
        return new GetPendingMessageResponse();
    }

    /**
     * Create an instance of {@link MessageNewGesCollectionResponse }
     * 
     */
    public MessageNewGesCollectionResponse createMessageNewGesCollectionResponse() {
        return new MessageNewGesCollectionResponse();
    }

    /**
     * Create an instance of {@link ScanDocumentResponse }
     * 
     */
    public ScanDocumentResponse createScanDocumentResponse() {
        return new ScanDocumentResponse();
    }

    /**
     * Create an instance of {@link KioskAddReservationPayment }
     * 
     */
    public KioskAddReservationPayment createKioskAddReservationPayment() {
        return new KioskAddReservationPayment();
    }

    /**
     * Create an instance of {@link KioskAddReservationPaymentRequest }
     * 
     */
    public KioskAddReservationPaymentRequest createKioskAddReservationPaymentRequest() {
        return new KioskAddReservationPaymentRequest();
    }

    /**
     * Create an instance of {@link BillforPayTV }
     * 
     */
    public BillforPayTV createBillforPayTV() {
        return new BillforPayTV();
    }

    /**
     * Create an instance of {@link BillPayTVCallRequest }
     * 
     */
    public BillPayTVCallRequest createBillPayTVCallRequest() {
        return new BillPayTVCallRequest();
    }

    /**
     * Create an instance of {@link KioskGetImageListResponse }
     * 
     */
    public KioskGetImageListResponse createKioskGetImageListResponse() {
        return new KioskGetImageListResponse();
    }

    /**
     * Create an instance of {@link KioskImageCollectionResponse }
     * 
     */
    public KioskImageCollectionResponse createKioskImageCollectionResponse() {
        return new KioskImageCollectionResponse();
    }

    /**
     * Create an instance of {@link KioskGetReservationResponse }
     * 
     */
    public KioskGetReservationResponse createKioskGetReservationResponse() {
        return new KioskGetReservationResponse();
    }

    /**
     * Create an instance of {@link KioskReservationDetailResponse }
     * 
     */
    public KioskReservationDetailResponse createKioskReservationDetailResponse() {
        return new KioskReservationDetailResponse();
    }

    /**
     * Create an instance of {@link ExtensionSynchronizeResponse }
     * 
     */
    public ExtensionSynchronizeResponse createExtensionSynchronizeResponse() {
        return new ExtensionSynchronizeResponse();
    }

    /**
     * Create an instance of {@link ExtensionSyncResponse }
     * 
     */
    public ExtensionSyncResponse createExtensionSyncResponse() {
        return new ExtensionSyncResponse();
    }

    /**
     * Create an instance of {@link PhoneCallChargeResponse }
     * 
     */
    public PhoneCallChargeResponse createPhoneCallChargeResponse() {
        return new PhoneCallChargeResponse();
    }

    /**
     * Create an instance of {@link ExportHotelStatistics }
     * 
     */
    public ExportHotelStatistics createExportHotelStatistics() {
        return new ExportHotelStatistics();
    }

    /**
     * Create an instance of {@link DateBaseRequest }
     * 
     */
    public DateBaseRequest createDateBaseRequest() {
        return new DateBaseRequest();
    }

    /**
     * Create an instance of {@link ExtensionSynchronize }
     * 
     */
    public ExtensionSynchronize createExtensionSynchronize() {
        return new ExtensionSynchronize();
    }

    /**
     * Create an instance of {@link BaseExtensionRequest }
     * 
     */
    public BaseExtensionRequest createBaseExtensionRequest() {
        return new BaseExtensionRequest();
    }

    /**
     * Create an instance of {@link NotifyWakeUpReceptionResponse }
     * 
     */
    public NotifyWakeUpReceptionResponse createNotifyWakeUpReceptionResponse() {
        return new NotifyWakeUpReceptionResponse();
    }

    /**
     * Create an instance of {@link GetPendingJobsResponse }
     * 
     */
    public GetPendingJobsResponse createGetPendingJobsResponse() {
        return new GetPendingJobsResponse();
    }

    /**
     * Create an instance of {@link JobCollectionResponse }
     * 
     */
    public JobCollectionResponse createJobCollectionResponse() {
        return new JobCollectionResponse();
    }

    /**
     * Create an instance of {@link ScanDocument }
     * 
     */
    public ScanDocument createScanDocument() {
        return new ScanDocument();
    }

    /**
     * Create an instance of {@link ScannerRequest }
     * 
     */
    public ScannerRequest createScannerRequest() {
        return new ScannerRequest();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationStatusResponse }
     * 
     */
    public KioskUpdateReservationStatusResponse createKioskUpdateReservationStatusResponse() {
        return new KioskUpdateReservationStatusResponse();
    }

    /**
     * Create an instance of {@link KioskGetAvailableRoomTypePrices }
     * 
     */
    public KioskGetAvailableRoomTypePrices createKioskGetAvailableRoomTypePrices() {
        return new KioskGetAvailableRoomTypePrices();
    }

    /**
     * Create an instance of {@link KioskGetRoomTypePricesRequest }
     * 
     */
    public KioskGetRoomTypePricesRequest createKioskGetRoomTypePricesRequest() {
        return new KioskGetRoomTypePricesRequest();
    }

    /**
     * Create an instance of {@link UpdateWakeUpResponse }
     * 
     */
    public UpdateWakeUpResponse createUpdateWakeUpResponse() {
        return new UpdateWakeUpResponse();
    }

    /**
     * Create an instance of {@link ExtensionSynchronizeTesterResponse }
     * 
     */
    public ExtensionSynchronizeTesterResponse createExtensionSynchronizeTesterResponse() {
        return new ExtensionSynchronizeTesterResponse();
    }

    /**
     * Create an instance of {@link NotifyJobCompletionResponse }
     * 
     */
    public NotifyJobCompletionResponse createNotifyJobCompletionResponse() {
        return new NotifyJobCompletionResponse();
    }

    /**
     * Create an instance of {@link KioskGetReservation }
     * 
     */
    public KioskGetReservation createKioskGetReservation() {
        return new KioskGetReservation();
    }

    /**
     * Create an instance of {@link KioskGetReservationRequest }
     * 
     */
    public KioskGetReservationRequest createKioskGetReservationRequest() {
        return new KioskGetReservationRequest();
    }

    /**
     * Create an instance of {@link KioskUpdateGroupStatusResponse }
     * 
     */
    public KioskUpdateGroupStatusResponse createKioskUpdateGroupStatusResponse() {
        return new KioskUpdateGroupStatusResponse();
    }

    /**
     * Create an instance of {@link NotifyJobCompletion }
     * 
     */
    public NotifyJobCompletion createNotifyJobCompletion() {
        return new NotifyJobCompletion();
    }

    /**
     * Create an instance of {@link AssignReservationRoomResponse }
     * 
     */
    public AssignReservationRoomResponse createAssignReservationRoomResponse() {
        return new AssignReservationRoomResponse();
    }

    /**
     * Create an instance of {@link UpdateWakeUp }
     * 
     */
    public UpdateWakeUp createUpdateWakeUp() {
        return new UpdateWakeUp();
    }

    /**
     * Create an instance of {@link WakeUpCompletionCollectionRequest }
     * 
     */
    public WakeUpCompletionCollectionRequest createWakeUpCompletionCollectionRequest() {
        return new WakeUpCompletionCollectionRequest();
    }

    /**
     * Create an instance of {@link PhoneCallCharge }
     * 
     */
    public PhoneCallCharge createPhoneCallCharge() {
        return new PhoneCallCharge();
    }

    /**
     * Create an instance of {@link PhoneCallRequest }
     * 
     */
    public PhoneCallRequest createPhoneCallRequest() {
        return new PhoneCallRequest();
    }

    /**
     * Create an instance of {@link RoomStatusChange }
     * 
     */
    public RoomStatusChange createRoomStatusChange() {
        return new RoomStatusChange();
    }

    /**
     * Create an instance of {@link RoomStatusRequest }
     * 
     */
    public RoomStatusRequest createRoomStatusRequest() {
        return new RoomStatusRequest();
    }

    /**
     * Create an instance of {@link KioskGetRoomTypes }
     * 
     */
    public KioskGetRoomTypes createKioskGetRoomTypes() {
        return new KioskGetRoomTypes();
    }

    /**
     * Create an instance of {@link KioskGetRoomTypesRequest }
     * 
     */
    public KioskGetRoomTypesRequest createKioskGetRoomTypesRequest() {
        return new KioskGetRoomTypesRequest();
    }

    /**
     * Create an instance of {@link KioskGetImageList }
     * 
     */
    public KioskGetImageList createKioskGetImageList() {
        return new KioskGetImageList();
    }

    /**
     * Create an instance of {@link KioskBaseRequest }
     * 
     */
    public KioskBaseRequest createKioskBaseRequest() {
        return new KioskBaseRequest();
    }

    /**
     * Create an instance of {@link KioskCreateReservation }
     * 
     */
    public KioskCreateReservation createKioskCreateReservation() {
        return new KioskCreateReservation();
    }

    /**
     * Create an instance of {@link KioskCreateReservationDetailsRequest }
     * 
     */
    public KioskCreateReservationDetailsRequest createKioskCreateReservationDetailsRequest() {
        return new KioskCreateReservationDetailsRequest();
    }

    /**
     * Create an instance of {@link KioskFindReservationResponse }
     * 
     */
    public KioskFindReservationResponse createKioskFindReservationResponse() {
        return new KioskFindReservationResponse();
    }

    /**
     * Create an instance of {@link KioskReservationInfoResponse }
     * 
     */
    public KioskReservationInfoResponse createKioskReservationInfoResponse() {
        return new KioskReservationInfoResponse();
    }

    /**
     * Create an instance of {@link KioskAddReservationUpsellItemsResponse }
     * 
     */
    public KioskAddReservationUpsellItemsResponse createKioskAddReservationUpsellItemsResponse() {
        return new KioskAddReservationUpsellItemsResponse();
    }

    /**
     * Create an instance of {@link NotifyMovementCompletionResponse }
     * 
     */
    public NotifyMovementCompletionResponse createNotifyMovementCompletionResponse() {
        return new NotifyMovementCompletionResponse();
    }

    /**
     * Create an instance of {@link BillforPayTVResponse }
     * 
     */
    public BillforPayTVResponse createBillforPayTVResponse() {
        return new BillforPayTVResponse();
    }

    /**
     * Create an instance of {@link BillPayTVResponse }
     * 
     */
    public BillPayTVResponse createBillPayTVResponse() {
        return new BillPayTVResponse();
    }

    /**
     * Create an instance of {@link GetPendingMessage }
     * 
     */
    public GetPendingMessage createGetPendingMessage() {
        return new GetPendingMessage();
    }

    /**
     * Create an instance of {@link PayTVCallChargeResponse }
     * 
     */
    public PayTVCallChargeResponse createPayTVCallChargeResponse() {
        return new PayTVCallChargeResponse();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationDetailsResponse }
     * 
     */
    public KioskUpdateReservationDetailsResponse createKioskUpdateReservationDetailsResponse() {
        return new KioskUpdateReservationDetailsResponse();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationDetails }
     * 
     */
    public KioskUpdateReservationDetails createKioskUpdateReservationDetails() {
        return new KioskUpdateReservationDetails();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationDetailsRequest }
     * 
     */
    public KioskUpdateReservationDetailsRequest createKioskUpdateReservationDetailsRequest() {
        return new KioskUpdateReservationDetailsRequest();
    }

    /**
     * Create an instance of {@link GetNomenclatures }
     * 
     */
    public GetNomenclatures createGetNomenclatures() {
        return new GetNomenclatures();
    }

    /**
     * Create an instance of {@link NomenclatureRequest }
     * 
     */
    public NomenclatureRequest createNomenclatureRequest() {
        return new NomenclatureRequest();
    }

    /**
     * Create an instance of {@link TransferCCChargeResponse }
     * 
     */
    public TransferCCChargeResponse createTransferCCChargeResponse() {
        return new TransferCCChargeResponse();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationGuests }
     * 
     */
    public KioskUpdateReservationGuests createKioskUpdateReservationGuests() {
        return new KioskUpdateReservationGuests();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationGuestsRequest }
     * 
     */
    public KioskUpdateReservationGuestsRequest createKioskUpdateReservationGuestsRequest() {
        return new KioskUpdateReservationGuestsRequest();
    }

    /**
     * Create an instance of {@link InternetCallChargeResponse }
     * 
     */
    public InternetCallChargeResponse createInternetCallChargeResponse() {
        return new InternetCallChargeResponse();
    }

    /**
     * Create an instance of {@link GetPendingMovements }
     * 
     */
    public GetPendingMovements createGetPendingMovements() {
        return new GetPendingMovements();
    }

    /**
     * Create an instance of {@link PendingMovementsRequest }
     * 
     */
    public PendingMovementsRequest createPendingMovementsRequest() {
        return new PendingMovementsRequest();
    }

    /**
     * Create an instance of {@link KioskUpdateGroupStatus }
     * 
     */
    public KioskUpdateGroupStatus createKioskUpdateGroupStatus() {
        return new KioskUpdateGroupStatus();
    }

    /**
     * Create an instance of {@link KioskUpdateGroupStatusRequest }
     * 
     */
    public KioskUpdateGroupStatusRequest createKioskUpdateGroupStatusRequest() {
        return new KioskUpdateGroupStatusRequest();
    }

    /**
     * Create an instance of {@link ExportHotelStatisticsResponse }
     * 
     */
    public ExportHotelStatisticsResponse createExportHotelStatisticsResponse() {
        return new ExportHotelStatisticsResponse();
    }

    /**
     * Create an instance of {@link BaseStringResponse }
     * 
     */
    public BaseStringResponse createBaseStringResponse() {
        return new BaseStringResponse();
    }

    /**
     * Create an instance of {@link KioskGetRoomsResponse }
     * 
     */
    public KioskGetRoomsResponse createKioskGetRoomsResponse() {
        return new KioskGetRoomsResponse();
    }

    /**
     * Create an instance of {@link KioskRoomCollectionResponse }
     * 
     */
    public KioskRoomCollectionResponse createKioskRoomCollectionResponse() {
        return new KioskRoomCollectionResponse();
    }

    /**
     * Create an instance of {@link GetWakeUpsResponse }
     * 
     */
    public GetWakeUpsResponse createGetWakeUpsResponse() {
        return new GetWakeUpsResponse();
    }

    /**
     * Create an instance of {@link WakeUpCollectionResponse }
     * 
     */
    public WakeUpCollectionResponse createWakeUpCollectionResponse() {
        return new WakeUpCollectionResponse();
    }

    /**
     * Create an instance of {@link GetPendingMovementsResponse }
     * 
     */
    public GetPendingMovementsResponse createGetPendingMovementsResponse() {
        return new GetPendingMovementsResponse();
    }

    /**
     * Create an instance of {@link MovementCollectionResponse }
     * 
     */
    public MovementCollectionResponse createMovementCollectionResponse() {
        return new MovementCollectionResponse();
    }

    /**
     * Create an instance of {@link ExtensionSynchronizeTester }
     * 
     */
    public ExtensionSynchronizeTester createExtensionSynchronizeTester() {
        return new ExtensionSynchronizeTester();
    }

    /**
     * Create an instance of {@link GetPendingJobsTesterResponse }
     * 
     */
    public GetPendingJobsTesterResponse createGetPendingJobsTesterResponse() {
        return new GetPendingJobsTesterResponse();
    }

    /**
     * Create an instance of {@link KioskGetRooms }
     * 
     */
    public KioskGetRooms createKioskGetRooms() {
        return new KioskGetRooms();
    }

    /**
     * Create an instance of {@link KioskGetRoomsRequest }
     * 
     */
    public KioskGetRoomsRequest createKioskGetRoomsRequest() {
        return new KioskGetRoomsRequest();
    }

    /**
     * Create an instance of {@link KioskCreateReservationResponse }
     * 
     */
    public KioskCreateReservationResponse createKioskCreateReservationResponse() {
        return new KioskCreateReservationResponse();
    }

    /**
     * Create an instance of {@link NotifyMessageCompletionResponse }
     * 
     */
    public NotifyMessageCompletionResponse createNotifyMessageCompletionResponse() {
        return new NotifyMessageCompletionResponse();
    }

    /**
     * Create an instance of {@link AuthHeader }
     * 
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link GetWakeUps }
     * 
     */
    public GetWakeUps createGetWakeUps() {
        return new GetWakeUps();
    }

    /**
     * Create an instance of {@link WakeUpRequest }
     * 
     */
    public WakeUpRequest createWakeUpRequest() {
        return new WakeUpRequest();
    }

    /**
     * Create an instance of {@link AssignReservationRoom }
     * 
     */
    public AssignReservationRoom createAssignReservationRoom() {
        return new AssignReservationRoom();
    }

    /**
     * Create an instance of {@link KioskAssignRoomRequest }
     * 
     */
    public KioskAssignRoomRequest createKioskAssignRoomRequest() {
        return new KioskAssignRoomRequest();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationStatus }
     * 
     */
    public KioskUpdateReservationStatus createKioskUpdateReservationStatus() {
        return new KioskUpdateReservationStatus();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationStatusRequest }
     * 
     */
    public KioskUpdateReservationStatusRequest createKioskUpdateReservationStatusRequest() {
        return new KioskUpdateReservationStatusRequest();
    }

    /**
     * Create an instance of {@link KioskUpdateReservationGuestsResponse }
     * 
     */
    public KioskUpdateReservationGuestsResponse createKioskUpdateReservationGuestsResponse() {
        return new KioskUpdateReservationGuestsResponse();
    }

    /**
     * Create an instance of {@link KioskAddReservationUpsellItems }
     * 
     */
    public KioskAddReservationUpsellItems createKioskAddReservationUpsellItems() {
        return new KioskAddReservationUpsellItems();
    }

    /**
     * Create an instance of {@link KioskAddReservationUpsellItemsRequest }
     * 
     */
    public KioskAddReservationUpsellItemsRequest createKioskAddReservationUpsellItemsRequest() {
        return new KioskAddReservationUpsellItemsRequest();
    }

    /**
     * Create an instance of {@link GetPendingJobsTester }
     * 
     */
    public GetPendingJobsTester createGetPendingJobsTester() {
        return new GetPendingJobsTester();
    }

    /**
     * Create an instance of {@link KioskFindReservation }
     * 
     */
    public KioskFindReservation createKioskFindReservation() {
        return new KioskFindReservation();
    }

    /**
     * Create an instance of {@link KioskFindReservationRequest }
     * 
     */
    public KioskFindReservationRequest createKioskFindReservationRequest() {
        return new KioskFindReservationRequest();
    }

    /**
     * Create an instance of {@link PayTVCallCharge }
     * 
     */
    public PayTVCallCharge createPayTVCallCharge() {
        return new PayTVCallCharge();
    }

    /**
     * Create an instance of {@link PayTVCallRequest }
     * 
     */
    public PayTVCallRequest createPayTVCallRequest() {
        return new PayTVCallRequest();
    }

    /**
     * Create an instance of {@link KioskAddReservationPaymentResponse }
     * 
     */
    public KioskAddReservationPaymentResponse createKioskAddReservationPaymentResponse() {
        return new KioskAddReservationPaymentResponse();
    }

    /**
     * Create an instance of {@link InternetCallCharge }
     * 
     */
    public InternetCallCharge createInternetCallCharge() {
        return new InternetCallCharge();
    }

    /**
     * Create an instance of {@link InternetCallRequest }
     * 
     */
    public InternetCallRequest createInternetCallRequest() {
        return new InternetCallRequest();
    }

    /**
     * Create an instance of {@link KioskGetImage }
     * 
     */
    public KioskGetImage createKioskGetImage() {
        return new KioskGetImage();
    }

    /**
     * Create an instance of {@link KioskImageRequest }
     * 
     */
    public KioskImageRequest createKioskImageRequest() {
        return new KioskImageRequest();
    }

    /**
     * Create an instance of {@link NotifyMovementCompletion }
     * 
     */
    public NotifyMovementCompletion createNotifyMovementCompletion() {
        return new NotifyMovementCompletion();
    }

    /**
     * Create an instance of {@link MovementCompletionCollectionRequest }
     * 
     */
    public MovementCompletionCollectionRequest createMovementCompletionCollectionRequest() {
        return new MovementCompletionCollectionRequest();
    }

    /**
     * Create an instance of {@link KioskGetRoomTypesResponse }
     * 
     */
    public KioskGetRoomTypesResponse createKioskGetRoomTypesResponse() {
        return new KioskGetRoomTypesResponse();
    }

    /**
     * Create an instance of {@link KioskRoomTypeCollectionResponse }
     * 
     */
    public KioskRoomTypeCollectionResponse createKioskRoomTypeCollectionResponse() {
        return new KioskRoomTypeCollectionResponse();
    }

    /**
     * Create an instance of {@link NotifyWakeUpReception }
     * 
     */
    public NotifyWakeUpReception createNotifyWakeUpReception() {
        return new NotifyWakeUpReception();
    }

    /**
     * Create an instance of {@link KioskGetHotelSettings }
     * 
     */
    public KioskGetHotelSettings createKioskGetHotelSettings() {
        return new KioskGetHotelSettings();
    }

    /**
     * Create an instance of {@link ArrayOfNomenclatureID }
     * 
     */
    public ArrayOfNomenclatureID createArrayOfNomenclatureID() {
        return new ArrayOfNomenclatureID();
    }

    /**
     * Create an instance of {@link ArrayOfWakeUpCompletionRequest }
     * 
     */
    public ArrayOfWakeUpCompletionRequest createArrayOfWakeUpCompletionRequest() {
        return new ArrayOfWakeUpCompletionRequest();
    }

    /**
     * Create an instance of {@link NameValueResponse }
     * 
     */
    public NameValueResponse createNameValueResponse() {
        return new NameValueResponse();
    }

    /**
     * Create an instance of {@link PhonePriceCollection }
     * 
     */
    public PhonePriceCollection createPhonePriceCollection() {
        return new PhonePriceCollection();
    }

    /**
     * Create an instance of {@link ArrayOfExtensionSyncItemResponse }
     * 
     */
    public ArrayOfExtensionSyncItemResponse createArrayOfExtensionSyncItemResponse() {
        return new ArrayOfExtensionSyncItemResponse();
    }

    /**
     * Create an instance of {@link KioskReservationInvoiceLine }
     * 
     */
    public KioskReservationInvoiceLine createKioskReservationInvoiceLine() {
        return new KioskReservationInvoiceLine();
    }

    /**
     * Create an instance of {@link KioskRoomTypePriceInfo }
     * 
     */
    public KioskRoomTypePriceInfo createKioskRoomTypePriceInfo() {
        return new KioskRoomTypePriceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueIDCollectionResponseOfNomenclatureID }
     * 
     */
    public ArrayOfKeyValueIDCollectionResponseOfNomenclatureID createArrayOfKeyValueIDCollectionResponseOfNomenclatureID() {
        return new ArrayOfKeyValueIDCollectionResponseOfNomenclatureID();
    }

    /**
     * Create an instance of {@link KioskReservationPriceInfo }
     * 
     */
    public KioskReservationPriceInfo createKioskReservationPriceInfo() {
        return new KioskReservationPriceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfErrorResponse }
     * 
     */
    public ArrayOfErrorResponse createArrayOfErrorResponse() {
        return new ArrayOfErrorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPhonePriceCollection }
     * 
     */
    public ArrayOfPhonePriceCollection createArrayOfPhonePriceCollection() {
        return new ArrayOfPhonePriceCollection();
    }

    /**
     * Create an instance of {@link ArrayOfJobCompletionRequest }
     * 
     */
    public ArrayOfJobCompletionRequest createArrayOfJobCompletionRequest() {
        return new ArrayOfJobCompletionRequest();
    }

    /**
     * Create an instance of {@link KioskReservationUpsellItem }
     * 
     */
    public KioskReservationUpsellItem createKioskReservationUpsellItem() {
        return new KioskReservationUpsellItem();
    }

    /**
     * Create an instance of {@link KioskReservationInvoice }
     * 
     */
    public KioskReservationInvoice createKioskReservationInvoice() {
        return new KioskReservationInvoice();
    }

    /**
     * Create an instance of {@link JobResponse }
     * 
     */
    public JobResponse createJobResponse() {
        return new JobResponse();
    }

    /**
     * Create an instance of {@link JobCompletionRequest }
     * 
     */
    public JobCompletionRequest createJobCompletionRequest() {
        return new JobCompletionRequest();
    }

    /**
     * Create an instance of {@link KioskReservationAccountInfo }
     * 
     */
    public KioskReservationAccountInfo createKioskReservationAccountInfo() {
        return new KioskReservationAccountInfo();
    }

    /**
     * Create an instance of {@link ExtensionResponse }
     * 
     */
    public ExtensionResponse createExtensionResponse() {
        return new ExtensionResponse();
    }

    /**
     * Create an instance of {@link KioskReservationDetail }
     * 
     */
    public KioskReservationDetail createKioskReservationDetail() {
        return new KioskReservationDetail();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationGuest }
     * 
     */
    public ArrayOfKioskReservationGuest createArrayOfKioskReservationGuest() {
        return new ArrayOfKioskReservationGuest();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueIDResponseOfNomenclatureID }
     * 
     */
    public ArrayOfKeyValueIDResponseOfNomenclatureID createArrayOfKeyValueIDResponseOfNomenclatureID() {
        return new ArrayOfKeyValueIDResponseOfNomenclatureID();
    }

    /**
     * Create an instance of {@link ArrayOfMovementsDetailsResponse }
     * 
     */
    public ArrayOfMovementsDetailsResponse createArrayOfMovementsDetailsResponse() {
        return new ArrayOfMovementsDetailsResponse();
    }

    /**
     * Create an instance of {@link DevolutionDetailsRequest }
     * 
     */
    public DevolutionDetailsRequest createDevolutionDetailsRequest() {
        return new DevolutionDetailsRequest();
    }

    /**
     * Create an instance of {@link KioskFilterArgument }
     * 
     */
    public KioskFilterArgument createKioskFilterArgument() {
        return new KioskFilterArgument();
    }

    /**
     * Create an instance of {@link DevolutionDetailsResponse }
     * 
     */
    public DevolutionDetailsResponse createDevolutionDetailsResponse() {
        return new DevolutionDetailsResponse();
    }

    /**
     * Create an instance of {@link MovementCompletionRequest }
     * 
     */
    public MovementCompletionRequest createMovementCompletionRequest() {
        return new MovementCompletionRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationInvoiceLine }
     * 
     */
    public ArrayOfKioskReservationInvoiceLine createArrayOfKioskReservationInvoiceLine() {
        return new ArrayOfKioskReservationInvoiceLine();
    }

    /**
     * Create an instance of {@link KioskReservationAccountLineInfo }
     * 
     */
    public KioskReservationAccountLineInfo createKioskReservationAccountLineInfo() {
        return new KioskReservationAccountLineInfo();
    }

    /**
     * Create an instance of {@link PhoneDeviceCollection }
     * 
     */
    public PhoneDeviceCollection createPhoneDeviceCollection() {
        return new PhoneDeviceCollection();
    }

    /**
     * Create an instance of {@link ArrayOfMessageNewGesResponse }
     * 
     */
    public ArrayOfMessageNewGesResponse createArrayOfMessageNewGesResponse() {
        return new ArrayOfMessageNewGesResponse();
    }

    /**
     * Create an instance of {@link KeyValueIDCollectionResponseOfNomenclatureID }
     * 
     */
    public KeyValueIDCollectionResponseOfNomenclatureID createKeyValueIDCollectionResponseOfNomenclatureID() {
        return new KeyValueIDCollectionResponseOfNomenclatureID();
    }

    /**
     * Create an instance of {@link ArrayOfGuid }
     * 
     */
    public ArrayOfGuid createArrayOfGuid() {
        return new ArrayOfGuid();
    }

    /**
     * Create an instance of {@link ReservationDetailsResponse }
     * 
     */
    public ReservationDetailsResponse createReservationDetailsResponse() {
        return new ReservationDetailsResponse();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationDetail }
     * 
     */
    public ArrayOfKioskReservationDetail createArrayOfKioskReservationDetail() {
        return new ArrayOfKioskReservationDetail();
    }

    /**
     * Create an instance of {@link KeyValueIDResponseOfNomenclatureID }
     * 
     */
    public KeyValueIDResponseOfNomenclatureID createKeyValueIDResponseOfNomenclatureID() {
        return new KeyValueIDResponseOfNomenclatureID();
    }

    /**
     * Create an instance of {@link ArrayOfJobResponse }
     * 
     */
    public ArrayOfJobResponse createArrayOfJobResponse() {
        return new ArrayOfJobResponse();
    }

    /**
     * Create an instance of {@link WakeUpResponse }
     * 
     */
    public WakeUpResponse createWakeUpResponse() {
        return new WakeUpResponse();
    }

    /**
     * Create an instance of {@link TransferCCResponse }
     * 
     */
    public TransferCCResponse createTransferCCResponse() {
        return new TransferCCResponse();
    }

    /**
     * Create an instance of {@link ReplieDetailsResponse }
     * 
     */
    public ReplieDetailsResponse createReplieDetailsResponse() {
        return new ReplieDetailsResponse();
    }

    /**
     * Create an instance of {@link KioskRoomInfo }
     * 
     */
    public KioskRoomInfo createKioskRoomInfo() {
        return new KioskRoomInfo();
    }

    /**
     * Create an instance of {@link ExtensionSyncItemResponse }
     * 
     */
    public ExtensionSyncItemResponse createExtensionSyncItemResponse() {
        return new ExtensionSyncItemResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationPriceInfo }
     * 
     */
    public ArrayOfKioskReservationPriceInfo createArrayOfKioskReservationPriceInfo() {
        return new ArrayOfKioskReservationPriceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfKioskRoomTypeInfo }
     * 
     */
    public ArrayOfKioskRoomTypeInfo createArrayOfKioskRoomTypeInfo() {
        return new ArrayOfKioskRoomTypeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMovementResponse }
     * 
     */
    public ArrayOfMovementResponse createArrayOfMovementResponse() {
        return new ArrayOfMovementResponse();
    }

    /**
     * Create an instance of {@link TransferCCDataRequest }
     * 
     */
    public TransferCCDataRequest createTransferCCDataRequest() {
        return new TransferCCDataRequest();
    }

    /**
     * Create an instance of {@link MessageNewGesResponse }
     * 
     */
    public MessageNewGesResponse createMessageNewGesResponse() {
        return new MessageNewGesResponse();
    }

    /**
     * Create an instance of {@link MovementsDetailsResponse }
     * 
     */
    public MovementsDetailsResponse createMovementsDetailsResponse() {
        return new MovementsDetailsResponse();
    }

    /**
     * Create an instance of {@link KioskReservationInfo }
     * 
     */
    public KioskReservationInfo createKioskReservationInfo() {
        return new KioskReservationInfo();
    }

    /**
     * Create an instance of {@link KioskReservationInvoiceTaxLine }
     * 
     */
    public KioskReservationInvoiceTaxLine createKioskReservationInvoiceTaxLine() {
        return new KioskReservationInvoiceTaxLine();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link KioskBaseResponse }
     * 
     */
    public KioskBaseResponse createKioskBaseResponse() {
        return new KioskBaseResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKioskFilterArgument }
     * 
     */
    public ArrayOfKioskFilterArgument createArrayOfKioskFilterArgument() {
        return new ArrayOfKioskFilterArgument();
    }

    /**
     * Create an instance of {@link WakeUpCompletionRequest }
     * 
     */
    public WakeUpCompletionRequest createWakeUpCompletionRequest() {
        return new WakeUpCompletionRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationAccountLineInfo }
     * 
     */
    public ArrayOfKioskReservationAccountLineInfo createArrayOfKioskReservationAccountLineInfo() {
        return new ArrayOfKioskReservationAccountLineInfo();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueResponseOfNomenclatureID }
     * 
     */
    public ArrayOfKeyValueResponseOfNomenclatureID createArrayOfKeyValueResponseOfNomenclatureID() {
        return new ArrayOfKeyValueResponseOfNomenclatureID();
    }

    /**
     * Create an instance of {@link ArrayOfMovementCompletionRequest }
     * 
     */
    public ArrayOfMovementCompletionRequest createArrayOfMovementCompletionRequest() {
        return new ArrayOfMovementCompletionRequest();
    }

    /**
     * Create an instance of {@link KeyValueResponseOfNomenclatureID }
     * 
     */
    public KeyValueResponseOfNomenclatureID createKeyValueResponseOfNomenclatureID() {
        return new KeyValueResponseOfNomenclatureID();
    }

    /**
     * Create an instance of {@link KioskReservationGuest }
     * 
     */
    public KioskReservationGuest createKioskReservationGuest() {
        return new KioskReservationGuest();
    }

    /**
     * Create an instance of {@link BasePhoneRequest }
     * 
     */
    public BasePhoneRequest createBasePhoneRequest() {
        return new BasePhoneRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationInvoiceTaxLine }
     * 
     */
    public ArrayOfKioskReservationInvoiceTaxLine createArrayOfKioskReservationInvoiceTaxLine() {
        return new ArrayOfKioskReservationInvoiceTaxLine();
    }

    /**
     * Create an instance of {@link KioskReservationAddress }
     * 
     */
    public KioskReservationAddress createKioskReservationAddress() {
        return new KioskReservationAddress();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationInvoice }
     * 
     */
    public ArrayOfKioskReservationInvoice createArrayOfKioskReservationInvoice() {
        return new ArrayOfKioskReservationInvoice();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationInfo }
     * 
     */
    public ArrayOfKioskReservationInfo createArrayOfKioskReservationInfo() {
        return new ArrayOfKioskReservationInfo();
    }

    /**
     * Create an instance of {@link KioskRoomTypeInfo }
     * 
     */
    public KioskRoomTypeInfo createKioskRoomTypeInfo() {
        return new KioskRoomTypeInfo();
    }

    /**
     * Create an instance of {@link MovementResponse }
     * 
     */
    public MovementResponse createMovementResponse() {
        return new MovementResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKioskReservationUpsellItem }
     * 
     */
    public ArrayOfKioskReservationUpsellItem createArrayOfKioskReservationUpsellItem() {
        return new ArrayOfKioskReservationUpsellItem();
    }

    /**
     * Create an instance of {@link ArrayOfNameValueResponse }
     * 
     */
    public ArrayOfNameValueResponse createArrayOfNameValueResponse() {
        return new ArrayOfNameValueResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPhoneDeviceCollection }
     * 
     */
    public ArrayOfPhoneDeviceCollection createArrayOfPhoneDeviceCollection() {
        return new ArrayOfPhoneDeviceCollection();
    }

    /**
     * Create an instance of {@link ArrayOfKioskRoomTypePriceInfo }
     * 
     */
    public ArrayOfKioskRoomTypePriceInfo createArrayOfKioskRoomTypePriceInfo() {
        return new ArrayOfKioskRoomTypePriceInfo();
    }

    /**
     * Create an instance of {@link ReplieDetailsRequest }
     * 
     */
    public ReplieDetailsRequest createReplieDetailsRequest() {
        return new ReplieDetailsRequest();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ArrayOfKioskImageResponse }
     * 
     */
    public ArrayOfKioskImageResponse createArrayOfKioskImageResponse() {
        return new ArrayOfKioskImageResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKioskRoomInfo }
     * 
     */
    public ArrayOfKioskRoomInfo createArrayOfKioskRoomInfo() {
        return new ArrayOfKioskRoomInfo();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfWakeUpResponse }
     * 
     */
    public ArrayOfWakeUpResponse createArrayOfWakeUpResponse() {
        return new ArrayOfWakeUpResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelResNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://NewHotel/Web/Services/", name = "OTA_HotelResNotifRS")
    public JAXBElement<OTAHotelResNotifRS> createOTAHotelResNotifRS(OTAHotelResNotifRS value) {
        return new JAXBElement<OTAHotelResNotifRS>(_OTAHotelResNotifRS_QNAME, OTAHotelResNotifRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelAvailGetRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://NewHotel/Web/Services/", name = "OTA_HotelAvailGetRS")
    public JAXBElement<OTAHotelAvailGetRS> createOTAHotelAvailGetRS(OTAHotelAvailGetRS value) {
        return new JAXBElement<OTAHotelAvailGetRS>(_OTAHotelAvailGetRS_QNAME, OTAHotelAvailGetRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://NewHotel/Web/Services/", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelRatePlanRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://NewHotel/Web/Services/", name = "OTA_HotelRatePlanRQ")
    public JAXBElement<OTAHotelRatePlanRS> createOTAHotelRatePlanRQ(OTAHotelRatePlanRS value) {
        return new JAXBElement<OTAHotelRatePlanRS>(_OTAHotelRatePlanRQ_QNAME, OTAHotelRatePlanRS.class, null, value);
    }

}
