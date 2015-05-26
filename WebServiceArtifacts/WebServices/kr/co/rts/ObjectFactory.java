
package kr.co.rts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kr.co.rts package. 
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

    private final static QName _BaseInfo_QNAME = new QName("http://www.rts.co.kr/", "BaseInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kr.co.rts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHotelInformationResponse }
     * 
     */
    public GetHotelInformationResponse createGetHotelInformationResponse() {
        return new GetHotelInformationResponse();
    }

    /**
     * Create an instance of {@link GetHotelPriceCheckResponse }
     * 
     */
    public GetHotelPriceCheckResponse createGetHotelPriceCheckResponse() {
        return new GetHotelPriceCheckResponse();
    }

    /**
     * Create an instance of {@link GetHotelPriceCheck }
     * 
     */
    public GetHotelPriceCheck createGetHotelPriceCheck() {
        return new GetHotelPriceCheck();
    }

    /**
     * Create an instance of {@link GetHotelInfoSummary }
     * 
     */
    public GetHotelInfoSummary createGetHotelInfoSummary() {
        return new GetHotelInfoSummary();
    }

    /**
     * Create an instance of {@link STGetHotelInfoSummaryNet }
     * 
     */
    public STGetHotelInfoSummaryNet createSTGetHotelInfoSummaryNet() {
        return new STGetHotelInfoSummaryNet();
    }

    /**
     * Create an instance of {@link BaseInfo }
     * 
     */
    public BaseInfo createBaseInfo() {
        return new BaseInfo();
    }

    /**
     * Create an instance of {@link GetHotelInfoSummaryResponse }
     * 
     */
    public GetHotelInfoSummaryResponse createGetHotelInfoSummaryResponse() {
        return new GetHotelInfoSummaryResponse();
    }

    /**
     * Create an instance of {@link GetHotelInformation }
     * 
     */
    public GetHotelInformation createGetHotelInformation() {
        return new GetHotelInformation();
    }

    /**
     * Create an instance of {@link ArrayOfSTGetHotelInformationRTSWS }
     * 
     */
    public ArrayOfSTGetHotelInformationRTSWS createArrayOfSTGetHotelInformationRTSWS() {
        return new ArrayOfSTGetHotelInformationRTSWS();
    }

    /**
     * Create an instance of {@link GetHotelSearchListResponse }
     * 
     */
    public GetHotelSearchListResponse createGetHotelSearchListResponse() {
        return new GetHotelSearchListResponse();
    }

    /**
     * Create an instance of {@link GetHotelSearchListForCustomerCountResponse }
     * 
     */
    public GetHotelSearchListForCustomerCountResponse createGetHotelSearchListForCustomerCountResponse() {
        return new GetHotelSearchListForCustomerCountResponse();
    }

    /**
     * Create an instance of {@link GetHotelSearchList }
     * 
     */
    public GetHotelSearchList createGetHotelSearchList() {
        return new GetHotelSearchList();
    }

    /**
     * Create an instance of {@link STGetHotelSearchListNet }
     * 
     */
    public STGetHotelSearchListNet createSTGetHotelSearchListNet() {
        return new STGetHotelSearchListNet();
    }

    /**
     * Create an instance of {@link GetHotelSearchListForCustomerCount }
     * 
     */
    public GetHotelSearchListForCustomerCount createGetHotelSearchListForCustomerCount() {
        return new GetHotelSearchListForCustomerCount();
    }

    /**
     * Create an instance of {@link STGetHotelSearchListNetForGuestCount }
     * 
     */
    public STGetHotelSearchListNetForGuestCount createSTGetHotelSearchListNetForGuestCount() {
        return new STGetHotelSearchListNetForGuestCount();
    }

    /**
     * Create an instance of {@link ItemCodeInfo }
     * 
     */
    public ItemCodeInfo createItemCodeInfo() {
        return new ItemCodeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfItemCodeInfo }
     * 
     */
    public ArrayOfItemCodeInfo createArrayOfItemCodeInfo() {
        return new ArrayOfItemCodeInfo();
    }

    /**
     * Create an instance of {@link STGetHotelInformationRTSWS }
     * 
     */
    public STGetHotelInformationRTSWS createSTGetHotelInformationRTSWS() {
        return new STGetHotelInformationRTSWS();
    }

    /**
     * Create an instance of {@link ArrayOfRoomsInfo }
     * 
     */
    public ArrayOfRoomsInfo createArrayOfRoomsInfo() {
        return new ArrayOfRoomsInfo();
    }

    /**
     * Create an instance of {@link GuestsInfo }
     * 
     */
    public GuestsInfo createGuestsInfo() {
        return new GuestsInfo();
    }

    /**
     * Create an instance of {@link RoomsInfo }
     * 
     */
    public RoomsInfo createRoomsInfo() {
        return new RoomsInfo();
    }

    /**
     * Create an instance of {@link ArrayOfGuestsInfo }
     * 
     */
    public ArrayOfGuestsInfo createArrayOfGuestsInfo() {
        return new ArrayOfGuestsInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rts.co.kr/", name = "BaseInfo")
    public JAXBElement<BaseInfo> createBaseInfo(BaseInfo value) {
        return new JAXBElement<BaseInfo>(_BaseInfo_QNAME, BaseInfo.class, null, value);
    }

}
