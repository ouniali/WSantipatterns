
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.mouzenidis_services.ArrayOfStatItem;
import org.datacontract.schemas._2004._07.mouzenidis_services.FilterParametr;
import org.datacontract.schemas._2004._07.mouzenidis_services.FlightPackets;
import org.datacontract.schemas._2004._07.mouzenidis_services.SearchGroupHotelResult;
import org.datacontract.schemas._2004._07.mouzenidis_services.SearchResult;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.ArrayOfDictionaryEnum;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.ArrayOfRealCourse;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.ArrayOfReturnObject;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _GetMinPricesResponseGetMinPricesResult_QNAME = new QName("http://tempuri.org/", "GetMinPricesResult");
    private final static QName _GetDataByToursResponseGetDataByToursResult_QNAME = new QName("http://tempuri.org/", "GetDataByToursResult");
    private final static QName _GetFilter4PaxChild_QNAME = new QName("http://tempuri.org/", "paxChild");
    private final static QName _GetFilter4DepartureCityId_QNAME = new QName("http://tempuri.org/", "departureCityId");
    private final static QName _GetFilter4HotelGroups_QNAME = new QName("http://tempuri.org/", "hotelGroups");
    private final static QName _GetFilter4Hotels_QNAME = new QName("http://tempuri.org/", "hotels");
    private final static QName _GetFilter4Sender_QNAME = new QName("http://tempuri.org/", "sender");
    private final static QName _GetFilter4Categories_QNAME = new QName("http://tempuri.org/", "categories");
    private final static QName _GetFilter4PaxAdult_QNAME = new QName("http://tempuri.org/", "paxAdult");
    private final static QName _GetFilter4Durations_QNAME = new QName("http://tempuri.org/", "durations");
    private final static QName _GetFilter4HotelFacilities_QNAME = new QName("http://tempuri.org/", "hotelFacilities");
    private final static QName _GetFilter4DateTo_QNAME = new QName("http://tempuri.org/", "dateTo");
    private final static QName _GetFilter4TourTypes_QNAME = new QName("http://tempuri.org/", "tourTypes");
    private final static QName _GetFilter4Meals_QNAME = new QName("http://tempuri.org/", "meals");
    private final static QName _GetFilter4Cities_QNAME = new QName("http://tempuri.org/", "cities");
    private final static QName _GetFilter4Tours_QNAME = new QName("http://tempuri.org/", "tours");
    private final static QName _GetFilter4DateFrom_QNAME = new QName("http://tempuri.org/", "dateFrom");
    private final static QName _GetMinPricesFilter_QNAME = new QName("http://tempuri.org/", "filter");
    private final static QName _GetDictionaryCityDepartures_QNAME = new QName("http://tempuri.org/", "cityDepartures");
    private final static QName _GetDictionaryDictionaries_QNAME = new QName("http://tempuri.org/", "dictionaries");
    private final static QName _GetFlightPacketsResponseGetFlightPacketsResult_QNAME = new QName("http://tempuri.org/", "GetFlightPacketsResult");
    private final static QName _GetFilterResponseGetFilterResult_QNAME = new QName("http://tempuri.org/", "GetFilterResult");
    private final static QName _GetCountriesResponseGetCountriesResult_QNAME = new QName("http://tempuri.org/", "GetCountriesResult");
    private final static QName _QuotaHotelsStateResponseQuotaHotelsStateResult_QNAME = new QName("http://tempuri.org/", "QuotaHotelsStateResult");
    private final static QName _GetCityDepartureByTypeTourResponseGetCityDepartureByTypeTourResult_QNAME = new QName("http://tempuri.org/", "GetCityDepartureByTypeTourResult");
    private final static QName _QuotaFlightsStateResponseQuotaFlightsStateResult_QNAME = new QName("http://tempuri.org/", "QuotaFlightsStateResult");
    private final static QName _GetFilter3ResponseGetFilter3Result_QNAME = new QName("http://tempuri.org/", "GetFilter3Result");
    private final static QName _GetReservationStatePassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _GetReservationStateReservationCode_QNAME = new QName("http://tempuri.org/", "reservationCode");
    private final static QName _GetReservationStateLogin_QNAME = new QName("http://tempuri.org/", "login");
    private final static QName _GetFilter2ResponseGetFilter2Result_QNAME = new QName("http://tempuri.org/", "GetFilter2Result");
    private final static QName _GetFilter4ResponseGetFilter4Result_QNAME = new QName("http://tempuri.org/", "GetFilter4Result");
    private final static QName _GetCourseResponseGetCourseResult_QNAME = new QName("http://tempuri.org/", "GetCourseResult");
    private final static QName _SearchTourGroupByHotelResponseSearchTourGroupByHotelResult_QNAME = new QName("http://tempuri.org/", "SearchTourGroupByHotelResult");
    private final static QName _GetReservationStateResponseGetReservationStateResult_QNAME = new QName("http://tempuri.org/", "GetReservationStateResult");
    private final static QName _GetStatResponseGetStatResult_QNAME = new QName("http://tempuri.org/", "GetStatResult");
    private final static QName _GetDataDistinctHotelsResponseGetDataDistinctHotelsResult_QNAME = new QName("http://tempuri.org/", "GetDataDistinctHotelsResult");
    private final static QName _GetCityDepartureResponseGetCityDepartureResult_QNAME = new QName("http://tempuri.org/", "GetCityDepartureResult");
    private final static QName _GetDictionaryResponseGetDictionaryResult_QNAME = new QName("http://tempuri.org/", "GetDictionaryResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuotaFlightsStateResponse }
     * 
     */
    public QuotaFlightsStateResponse createQuotaFlightsStateResponse() {
        return new QuotaFlightsStateResponse();
    }

    /**
     * Create an instance of {@link GetMinPrices }
     * 
     */
    public GetMinPrices createGetMinPrices() {
        return new GetMinPrices();
    }

    /**
     * Create an instance of {@link GetCountries }
     * 
     */
    public GetCountries createGetCountries() {
        return new GetCountries();
    }

    /**
     * Create an instance of {@link GetPriceByKey }
     * 
     */
    public GetPriceByKey createGetPriceByKey() {
        return new GetPriceByKey();
    }

    /**
     * Create an instance of {@link GetFilter4 }
     * 
     */
    public GetFilter4 createGetFilter4() {
        return new GetFilter4();
    }

    /**
     * Create an instance of {@link GetFilter3 }
     * 
     */
    public GetFilter3 createGetFilter3() {
        return new GetFilter3();
    }

    /**
     * Create an instance of {@link GetFilter2 }
     * 
     */
    public GetFilter2 createGetFilter2() {
        return new GetFilter2();
    }

    /**
     * Create an instance of {@link GetDictionaryResponse }
     * 
     */
    public GetDictionaryResponse createGetDictionaryResponse() {
        return new GetDictionaryResponse();
    }

    /**
     * Create an instance of {@link GetStatResponse }
     * 
     */
    public GetStatResponse createGetStatResponse() {
        return new GetStatResponse();
    }

    /**
     * Create an instance of {@link GetFlightPackets }
     * 
     */
    public GetFlightPackets createGetFlightPackets() {
        return new GetFlightPackets();
    }

    /**
     * Create an instance of {@link GetCityDepartureResponse }
     * 
     */
    public GetCityDepartureResponse createGetCityDepartureResponse() {
        return new GetCityDepartureResponse();
    }

    /**
     * Create an instance of {@link GetStat }
     * 
     */
    public GetStat createGetStat() {
        return new GetStat();
    }

    /**
     * Create an instance of {@link GetReservationState }
     * 
     */
    public GetReservationState createGetReservationState() {
        return new GetReservationState();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link GetFilter }
     * 
     */
    public GetFilter createGetFilter() {
        return new GetFilter();
    }

    /**
     * Create an instance of {@link GetFlightPacketsResponse }
     * 
     */
    public GetFlightPacketsResponse createGetFlightPacketsResponse() {
        return new GetFlightPacketsResponse();
    }

    /**
     * Create an instance of {@link SearchTourGroupByHotelResponse }
     * 
     */
    public SearchTourGroupByHotelResponse createSearchTourGroupByHotelResponse() {
        return new SearchTourGroupByHotelResponse();
    }

    /**
     * Create an instance of {@link QuotaHotelsStateResponse }
     * 
     */
    public QuotaHotelsStateResponse createQuotaHotelsStateResponse() {
        return new QuotaHotelsStateResponse();
    }

    /**
     * Create an instance of {@link GetDataByTours }
     * 
     */
    public GetDataByTours createGetDataByTours() {
        return new GetDataByTours();
    }

    /**
     * Create an instance of {@link GetMinPricesResponse }
     * 
     */
    public GetMinPricesResponse createGetMinPricesResponse() {
        return new GetMinPricesResponse();
    }

    /**
     * Create an instance of {@link GetFilterResponse }
     * 
     */
    public GetFilterResponse createGetFilterResponse() {
        return new GetFilterResponse();
    }

    /**
     * Create an instance of {@link GetFilter2Response }
     * 
     */
    public GetFilter2Response createGetFilter2Response() {
        return new GetFilter2Response();
    }

    /**
     * Create an instance of {@link GetDictionary }
     * 
     */
    public GetDictionary createGetDictionary() {
        return new GetDictionary();
    }

    /**
     * Create an instance of {@link org.tempuri.QuotaHotelsState }
     * 
     */
    public org.tempuri.QuotaHotelsState createQuotaHotelsState() {
        return new org.tempuri.QuotaHotelsState();
    }

    /**
     * Create an instance of {@link GetCityDepartureByTypeTour }
     * 
     */
    public GetCityDepartureByTypeTour createGetCityDepartureByTypeTour() {
        return new GetCityDepartureByTypeTour();
    }

    /**
     * Create an instance of {@link GetReservationStateResponse }
     * 
     */
    public GetReservationStateResponse createGetReservationStateResponse() {
        return new GetReservationStateResponse();
    }

    /**
     * Create an instance of {@link GetPriceByKeyResponse }
     * 
     */
    public GetPriceByKeyResponse createGetPriceByKeyResponse() {
        return new GetPriceByKeyResponse();
    }

    /**
     * Create an instance of {@link GetFilter4Response }
     * 
     */
    public GetFilter4Response createGetFilter4Response() {
        return new GetFilter4Response();
    }

    /**
     * Create an instance of {@link GetCountriesResponse }
     * 
     */
    public GetCountriesResponse createGetCountriesResponse() {
        return new GetCountriesResponse();
    }

    /**
     * Create an instance of {@link GetCityDepartureByTypeTourResponse }
     * 
     */
    public GetCityDepartureByTypeTourResponse createGetCityDepartureByTypeTourResponse() {
        return new GetCityDepartureByTypeTourResponse();
    }

    /**
     * Create an instance of {@link GetDataDistinctHotelsResponse }
     * 
     */
    public GetDataDistinctHotelsResponse createGetDataDistinctHotelsResponse() {
        return new GetDataDistinctHotelsResponse();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link SearchTourGroupByHotel }
     * 
     */
    public SearchTourGroupByHotel createSearchTourGroupByHotel() {
        return new SearchTourGroupByHotel();
    }

    /**
     * Create an instance of {@link GetFilter3Response }
     * 
     */
    public GetFilter3Response createGetFilter3Response() {
        return new GetFilter3Response();
    }

    /**
     * Create an instance of {@link GetCityDeparture }
     * 
     */
    public GetCityDeparture createGetCityDeparture() {
        return new GetCityDeparture();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetDataByToursResponse }
     * 
     */
    public GetDataByToursResponse createGetDataByToursResponse() {
        return new GetDataByToursResponse();
    }

    /**
     * Create an instance of {@link org.tempuri.QuotaFlightsState }
     * 
     */
    public org.tempuri.QuotaFlightsState createQuotaFlightsState() {
        return new org.tempuri.QuotaFlightsState();
    }

    /**
     * Create an instance of {@link GetDataDistinctHotels }
     * 
     */
    public GetDataDistinctHotels createGetDataDistinctHotels() {
        return new GetDataDistinctHotels();
    }

    /**
     * Create an instance of {@link GetCourse }
     * 
     */
    public GetCourse createGetCourse() {
        return new GetCourse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<SearchResult> createGetDataResponseGetDataResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_GetDataResponseGetDataResult_QNAME, SearchResult.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMinPricesResult", scope = GetMinPricesResponse.class)
    public JAXBElement<SearchResult> createGetMinPricesResponseGetMinPricesResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_GetMinPricesResponseGetMinPricesResult_QNAME, SearchResult.class, GetMinPricesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataByToursResult", scope = GetDataByToursResponse.class)
    public JAXBElement<SearchResult> createGetDataByToursResponseGetDataByToursResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_GetDataByToursResponseGetDataByToursResult_QNAME, SearchResult.class, GetDataByToursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxChild", scope = GetFilter4 .class)
    public JAXBElement<Integer> createGetFilter4PaxChild(Integer value) {
        return new JAXBElement<Integer>(_GetFilter4PaxChild_QNAME, Integer.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departureCityId", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4DepartureCityId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4DepartureCityId_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelGroups", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4HotelGroups(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4HotelGroups_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotels", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4Hotels(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Hotels_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sender", scope = GetFilter4 .class)
    public JAXBElement<String> createGetFilter4Sender(String value) {
        return new JAXBElement<String>(_GetFilter4Sender_QNAME, String.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "categories", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4Categories(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Categories_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxAdult", scope = GetFilter4 .class)
    public JAXBElement<Integer> createGetFilter4PaxAdult(Integer value) {
        return new JAXBElement<Integer>(_GetFilter4PaxAdult_QNAME, Integer.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "durations", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4Durations(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Durations_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelFacilities", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4HotelFacilities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4HotelFacilities_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTo", scope = GetFilter4 .class)
    public JAXBElement<XMLGregorianCalendar> createGetFilter4DateTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilter4DateTo_QNAME, XMLGregorianCalendar.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tourTypes", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4TourTypes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4TourTypes_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "meals", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4Meals(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Meals_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cities", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4Cities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Cities_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tours", scope = GetFilter4 .class)
    public JAXBElement<ArrayOfint> createGetFilter4Tours(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Tours_QNAME, ArrayOfint.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateFrom", scope = GetFilter4 .class)
    public JAXBElement<XMLGregorianCalendar> createGetFilter4DateFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilter4DateFrom_QNAME, XMLGregorianCalendar.class, GetFilter4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetMinPrices.class)
    public JAXBElement<FilterParametr> createGetMinPricesFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, GetMinPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cityDepartures", scope = GetDictionary.class)
    public JAXBElement<ArrayOfint> createGetDictionaryCityDepartures(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetDictionaryCityDepartures_QNAME, ArrayOfint.class, GetDictionary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dictionaries", scope = GetDictionary.class)
    public JAXBElement<ArrayOfDictionaryEnum> createGetDictionaryDictionaries(ArrayOfDictionaryEnum value) {
        return new JAXBElement<ArrayOfDictionaryEnum>(_GetDictionaryDictionaries_QNAME, ArrayOfDictionaryEnum.class, GetDictionary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = org.tempuri.QuotaHotelsState.class)
    public JAXBElement<FilterParametr> createQuotaHotelsStateFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, org.tempuri.QuotaHotelsState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPackets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFlightPacketsResult", scope = GetFlightPacketsResponse.class)
    public JAXBElement<FlightPackets> createGetFlightPacketsResponseGetFlightPacketsResult(FlightPackets value) {
        return new JAXBElement<FlightPackets>(_GetFlightPacketsResponseGetFlightPacketsResult_QNAME, FlightPackets.class, GetFlightPacketsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFilterResult", scope = GetFilterResponse.class)
    public JAXBElement<ArrayOfReturnObject> createGetFilterResponseGetFilterResult(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetFilterResponseGetFilterResult_QNAME, ArrayOfReturnObject.class, GetFilterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxChild", scope = GetFilter2 .class)
    public JAXBElement<Integer> createGetFilter2PaxChild(Integer value) {
        return new JAXBElement<Integer>(_GetFilter4PaxChild_QNAME, Integer.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departureCityId", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2DepartureCityId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4DepartureCityId_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotels", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2Hotels(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Hotels_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sender", scope = GetFilter2 .class)
    public JAXBElement<String> createGetFilter2Sender(String value) {
        return new JAXBElement<String>(_GetFilter4Sender_QNAME, String.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "categories", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2Categories(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Categories_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxAdult", scope = GetFilter2 .class)
    public JAXBElement<Integer> createGetFilter2PaxAdult(Integer value) {
        return new JAXBElement<Integer>(_GetFilter4PaxAdult_QNAME, Integer.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "durations", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2Durations(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Durations_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTo", scope = GetFilter2 .class)
    public JAXBElement<XMLGregorianCalendar> createGetFilter2DateTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilter4DateTo_QNAME, XMLGregorianCalendar.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tourTypes", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2TourTypes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4TourTypes_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "meals", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2Meals(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Meals_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cities", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2Cities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Cities_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tours", scope = GetFilter2 .class)
    public JAXBElement<ArrayOfint> createGetFilter2Tours(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Tours_QNAME, ArrayOfint.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateFrom", scope = GetFilter2 .class)
    public JAXBElement<XMLGregorianCalendar> createGetFilter2DateFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilter4DateFrom_QNAME, XMLGregorianCalendar.class, GetFilter2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCountriesResult", scope = GetCountriesResponse.class)
    public JAXBElement<ArrayOfReturnObject> createGetCountriesResponseGetCountriesResult(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetCountriesResponseGetCountriesResult_QNAME, ArrayOfReturnObject.class, GetCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetDataDistinctHotels.class)
    public JAXBElement<FilterParametr> createGetDataDistinctHotelsFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, GetDataDistinctHotels.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxChild", scope = GetFilter3 .class)
    public JAXBElement<Integer> createGetFilter3PaxChild(Integer value) {
        return new JAXBElement<Integer>(_GetFilter4PaxChild_QNAME, Integer.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departureCityId", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3DepartureCityId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4DepartureCityId_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelGroups", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3HotelGroups(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4HotelGroups_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotels", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3Hotels(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Hotels_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sender", scope = GetFilter3 .class)
    public JAXBElement<String> createGetFilter3Sender(String value) {
        return new JAXBElement<String>(_GetFilter4Sender_QNAME, String.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "categories", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3Categories(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Categories_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxAdult", scope = GetFilter3 .class)
    public JAXBElement<Integer> createGetFilter3PaxAdult(Integer value) {
        return new JAXBElement<Integer>(_GetFilter4PaxAdult_QNAME, Integer.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "durations", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3Durations(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Durations_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelFacilities", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3HotelFacilities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4HotelFacilities_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTo", scope = GetFilter3 .class)
    public JAXBElement<XMLGregorianCalendar> createGetFilter3DateTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilter4DateTo_QNAME, XMLGregorianCalendar.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tourTypes", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3TourTypes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4TourTypes_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "meals", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3Meals(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Meals_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cities", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3Cities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Cities_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tours", scope = GetFilter3 .class)
    public JAXBElement<ArrayOfint> createGetFilter3Tours(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Tours_QNAME, ArrayOfint.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateFrom", scope = GetFilter3 .class)
    public JAXBElement<XMLGregorianCalendar> createGetFilter3DateFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilter4DateFrom_QNAME, XMLGregorianCalendar.class, GetFilter3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetData.class)
    public JAXBElement<FilterParametr> createGetDataFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, GetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.mouzenidis_services.QuotaHotelsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "QuotaHotelsStateResult", scope = QuotaHotelsStateResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.mouzenidis_services.QuotaHotelsState> createQuotaHotelsStateResponseQuotaHotelsStateResult(org.datacontract.schemas._2004._07.mouzenidis_services.QuotaHotelsState value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.mouzenidis_services.QuotaHotelsState>(_QuotaHotelsStateResponseQuotaHotelsStateResult_QNAME, org.datacontract.schemas._2004._07.mouzenidis_services.QuotaHotelsState.class, QuotaHotelsStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCityDepartureByTypeTourResult", scope = GetCityDepartureByTypeTourResponse.class)
    public JAXBElement<ArrayOfReturnObject> createGetCityDepartureByTypeTourResponseGetCityDepartureByTypeTourResult(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetCityDepartureByTypeTourResponseGetCityDepartureByTypeTourResult_QNAME, ArrayOfReturnObject.class, GetCityDepartureByTypeTourResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.mouzenidis_services.QuotaFlightsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "QuotaFlightsStateResult", scope = QuotaFlightsStateResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.mouzenidis_services.QuotaFlightsState> createQuotaFlightsStateResponseQuotaFlightsStateResult(org.datacontract.schemas._2004._07.mouzenidis_services.QuotaFlightsState value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.mouzenidis_services.QuotaFlightsState>(_QuotaFlightsStateResponseQuotaFlightsStateResult_QNAME, org.datacontract.schemas._2004._07.mouzenidis_services.QuotaFlightsState.class, QuotaFlightsStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFilter3Result", scope = GetFilter3Response.class)
    public JAXBElement<ArrayOfReturnObject> createGetFilter3ResponseGetFilter3Result(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetFilter3ResponseGetFilter3Result_QNAME, ArrayOfReturnObject.class, GetFilter3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = GetReservationState.class)
    public JAXBElement<String> createGetReservationStatePassword(String value) {
        return new JAXBElement<String>(_GetReservationStatePassword_QNAME, String.class, GetReservationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reservationCode", scope = GetReservationState.class)
    public JAXBElement<String> createGetReservationStateReservationCode(String value) {
        return new JAXBElement<String>(_GetReservationStateReservationCode_QNAME, String.class, GetReservationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetReservationState.class)
    public JAXBElement<String> createGetReservationStateLogin(String value) {
        return new JAXBElement<String>(_GetReservationStateLogin_QNAME, String.class, GetReservationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFilter2Result", scope = GetFilter2Response.class)
    public JAXBElement<ArrayOfReturnObject> createGetFilter2ResponseGetFilter2Result(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetFilter2ResponseGetFilter2Result_QNAME, ArrayOfReturnObject.class, GetFilter2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFilter4Result", scope = GetFilter4Response.class)
    public JAXBElement<ArrayOfReturnObject> createGetFilter4ResponseGetFilter4Result(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetFilter4ResponseGetFilter4Result_QNAME, ArrayOfReturnObject.class, GetFilter4Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRealCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCourseResult", scope = GetCourseResponse.class)
    public JAXBElement<ArrayOfRealCourse> createGetCourseResponseGetCourseResult(ArrayOfRealCourse value) {
        return new JAXBElement<ArrayOfRealCourse>(_GetCourseResponseGetCourseResult_QNAME, ArrayOfRealCourse.class, GetCourseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGroupHotelResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchTourGroupByHotelResult", scope = SearchTourGroupByHotelResponse.class)
    public JAXBElement<SearchGroupHotelResult> createSearchTourGroupByHotelResponseSearchTourGroupByHotelResult(SearchGroupHotelResult value) {
        return new JAXBElement<SearchGroupHotelResult>(_SearchTourGroupByHotelResponseSearchTourGroupByHotelResult_QNAME, SearchGroupHotelResult.class, SearchTourGroupByHotelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetReservationStateResult", scope = GetReservationStateResponse.class)
    public JAXBElement<String> createGetReservationStateResponseGetReservationStateResult(String value) {
        return new JAXBElement<String>(_GetReservationStateResponseGetReservationStateResult_QNAME, String.class, GetReservationStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetFlightPackets.class)
    public JAXBElement<FilterParametr> createGetFlightPacketsFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, GetFlightPackets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetDataByTours.class)
    public JAXBElement<FilterParametr> createGetDataByToursFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, GetDataByTours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatResult", scope = GetStatResponse.class)
    public JAXBElement<ArrayOfStatItem> createGetStatResponseGetStatResult(ArrayOfStatItem value) {
        return new JAXBElement<ArrayOfStatItem>(_GetStatResponseGetStatResult_QNAME, ArrayOfStatItem.class, GetStatResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataDistinctHotelsResult", scope = GetDataDistinctHotelsResponse.class)
    public JAXBElement<SearchResult> createGetDataDistinctHotelsResponseGetDataDistinctHotelsResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_GetDataDistinctHotelsResponseGetDataDistinctHotelsResult_QNAME, SearchResult.class, GetDataDistinctHotelsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = SearchTourGroupByHotel.class)
    public JAXBElement<FilterParametr> createSearchTourGroupByHotelFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, SearchTourGroupByHotel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departureCityId", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterDepartureCityId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4DepartureCityId_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotels", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterHotels(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Hotels_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cities", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterCities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Cities_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "categories", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterCategories(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Categories_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "durations", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterDurations(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Durations_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tourTypes", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterTourTypes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4TourTypes_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "meals", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterMeals(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Meals_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tours", scope = GetFilter.class)
    public JAXBElement<ArrayOfint> createGetFilterTours(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFilter4Tours_QNAME, ArrayOfint.class, GetFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = org.tempuri.QuotaFlightsState.class)
    public JAXBElement<FilterParametr> createQuotaFlightsStateFilter(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_GetMinPricesFilter_QNAME, FilterParametr.class, org.tempuri.QuotaFlightsState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCityDepartureResult", scope = GetCityDepartureResponse.class)
    public JAXBElement<ArrayOfReturnObject> createGetCityDepartureResponseGetCityDepartureResult(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetCityDepartureResponseGetCityDepartureResult_QNAME, ArrayOfReturnObject.class, GetCityDepartureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDictionaryResult", scope = GetDictionaryResponse.class)
    public JAXBElement<ArrayOfReturnObject> createGetDictionaryResponseGetDictionaryResult(ArrayOfReturnObject value) {
        return new JAXBElement<ArrayOfReturnObject>(_GetDictionaryResponseGetDictionaryResult_QNAME, ArrayOfReturnObject.class, GetDictionaryResponse.class, value);
    }

}
