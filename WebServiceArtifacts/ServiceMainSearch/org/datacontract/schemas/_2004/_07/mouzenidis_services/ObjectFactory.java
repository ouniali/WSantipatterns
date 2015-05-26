
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfshort;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.ArrayOfAccommodation;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.Hotel;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.TouristCountDetail;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.mouzenidis_services package. 
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

    private final static QName _TransportKind_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TransportKind");
    private final static QName _ArrayOfStatItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "ArrayOfStatItem");
    private final static QName _FilterParametrDiagnostic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "FilterParametr.Diagnostic");
    private final static QName _SearchGroupHotelResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "SearchGroupHotelResult");
    private final static QName _QuotaHotelItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaHotelItem");
    private final static QName _ArrayOfQuotaFlightTariffState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfQuotaFlightTariffState");
    private final static QName _QuotaState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaState");
    private final static QName _Tour_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Tour");
    private final static QName _StatValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "StatValue");
    private final static QName _TourPriceServiceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourPriceServiceInfo");
    private final static QName _ArrayOfQuotaHotelRoomVariant_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfQuotaHotelRoomVariant");
    private final static QName _QuotaFlightTariffState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaFlightTariffState");
    private final static QName _SearchResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "SearchResult");
    private final static QName _QuotaHotelsState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaHotelsState");
    private final static QName _ArrayOfQuotaFlightTariffs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfQuotaFlightTariffs");
    private final static QName _ArrayOfTourPriceServiceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfTourPriceServiceInfo");
    private final static QName _ArrayOfTourPriceEx_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfTourPriceEx");
    private final static QName _ArrayOfTourHotelVariant_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfTourHotelVariant");
    private final static QName _TourHotelGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourHotelGroup");
    private final static QName _ArrayOfStatValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "ArrayOfStatValue");
    private final static QName _QuotaFlightsState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaFlightsState");
    private final static QName _ArrayOfQuotaFlightItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfQuotaFlightItem");
    private final static QName _QuotaDateState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaDateState");
    private final static QName _StatItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "StatItem");
    private final static QName _FlightPackets_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "FlightPackets");
    private final static QName _ArrayOfQuotaHotelItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfQuotaHotelItem");
    private final static QName _TourPriceEx_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourPriceEx");
    private final static QName _TourHotelVariant_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourHotelVariant");
    private final static QName _QuotaFlightTariffs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaFlightTariffs");
    private final static QName _FilterParametr_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "FilterParametr");
    private final static QName _ArrayOfQuotaDateState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfQuotaDateState");
    private final static QName _ArrayOfTourHotelGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "ArrayOfTourHotelGroup");
    private final static QName _QuotaHotelRoomVariant_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaHotelRoomVariant");
    private final static QName _QuotaFlightItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaFlightItem");
    private final static QName _TourPriceExTourPriceServiceInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourPriceServiceInfos");
    private final static QName _TourPriceExTourTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourTypeName");
    private final static QName _TourPriceExTourName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourName");
    private final static QName _TourPriceExTourUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourUrl");
    private final static QName _TourPriceExCityToName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "CityToName");
    private final static QName _TourPriceExRate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Rate");
    private final static QName _StatValueValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "Value");
    private final static QName _StatValueKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "Key");
    private final static QName _TourHotelVariantRoomCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "RoomCategory");
    private final static QName _TourHotelVariantRoomType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "RoomType");
    private final static QName _TourHotelVariantTourPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourPrice");
    private final static QName _TourHotelVariantMeal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Meal");
    private final static QName _FlightPacketsPacketsBack_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "PacketsBack");
    private final static QName _FlightPacketsPacketsTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "PacketsTo");
    private final static QName _QuotaHotelRoomVariantQuotaDateStates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaDateStates");
    private final static QName _QuotaHotelRoomVariantTouristCountDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TouristCountDetail");
    private final static QName _QuotaHotelRoomVariantAccomodations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Accomodations");
    private final static QName _QuotaHotelRoomVariantRoomVariant_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "RoomVariant");
    private final static QName _SearchGroupHotelResultTourHotelGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourHotelGroups");
    private final static QName _TourTypeTours_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TypeTours");
    private final static QName _TourTourURL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourURL");
    private final static QName _TourRateIso_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "RateIso");
    private final static QName _TourHotelGroupTourHotelVariants_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourHotelVariants");
    private final static QName _TourHotelGroupHotel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Hotel");
    private final static QName _SearchResultPrices_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Prices");
    private final static QName _QuotaFlightTariffStateAirseason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Airseason");
    private final static QName _QuotaFlightTariffsQuotaFlightTariffStates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaFlightTariffStates");
    private final static QName _QuotaFlightTariffsTariffName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TariffName");
    private final static QName _QuotaFlightTariffsTariff_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Tariff");
    private final static QName _TourPriceServiceInfoAccmd_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Accmd");
    private final static QName _TourPriceServiceInfoDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Duration");
    private final static QName _TourPriceServiceInfoCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "City");
    private final static QName _TourPriceServiceInfoURL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "URL");
    private final static QName _TourPriceServiceInfoTown_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Town");
    private final static QName _QuotaFlightsStateQuotaBackFlightItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaBackFlightItems");
    private final static QName _QuotaFlightsStateQuotaFlightItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaFlightItems");
    private final static QName _FilterParametrDurations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Durations");
    private final static QName _FilterParametrTours_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Tours");
    private final static QName _FilterParametrPaxs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Paxs");
    private final static QName _FilterParametrHotelFacilities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "HotelFacilities");
    private final static QName _FilterParametrPaxChildAges_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Pax_ChildAges");
    private final static QName _FilterParametrCurrencyIsoCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "CurrencyIsoCode");
    private final static QName _FilterParametrCityKeyTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "CityKeyTo");
    private final static QName _FilterParametrRoomCategories_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "RoomCategories");
    private final static QName _FilterParametrHotelGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "HotelGroups");
    private final static QName _FilterParametrHotelCategories_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "HotelCategories");
    private final static QName _FilterParametrCities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Cities");
    private final static QName _FilterParametrAccommodationsCheck_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "AccommodationsCheck");
    private final static QName _FilterParametrLocalization_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Localization");
    private final static QName _FilterParametrMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Meals");
    private final static QName _FilterParametrCityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "CityKey");
    private final static QName _FilterParametrDebug_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Debug");
    private final static QName _FilterParametrHotelsToExclude_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "HotelsToExclude");
    private final static QName _FilterParametrHotels_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Hotels");
    private final static QName _FilterParametrSender_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Sender");
    private final static QName _FilterParametrTourTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "TourTypes");
    private final static QName _StatItemStats_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", "Stats");
    private final static QName _QuotaHotelsStateQuotaHotelItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaHotelItems");
    private final static QName _QuotaHotelItemQuotaHotelRoomVariants_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "QuotaHotelRoomVariants");
    private final static QName _QuotaFlightItemAirports_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "Airports");
    private final static QName _QuotaFlightItemAircraftName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "AircraftName");
    private final static QName _QuotaFlightItemCharterName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", "CharterName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.mouzenidis_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuotaFlightsState }
     * 
     */
    public QuotaFlightsState createQuotaFlightsState() {
        return new QuotaFlightsState();
    }

    /**
     * Create an instance of {@link FilterParametr }
     * 
     */
    public FilterParametr createFilterParametr() {
        return new FilterParametr();
    }

    /**
     * Create an instance of {@link ArrayOfStatItem }
     * 
     */
    public ArrayOfStatItem createArrayOfStatItem() {
        return new ArrayOfStatItem();
    }

    /**
     * Create an instance of {@link FlightPackets }
     * 
     */
    public FlightPackets createFlightPackets() {
        return new FlightPackets();
    }

    /**
     * Create an instance of {@link SearchGroupHotelResult }
     * 
     */
    public SearchGroupHotelResult createSearchGroupHotelResult() {
        return new SearchGroupHotelResult();
    }

    /**
     * Create an instance of {@link QuotaHotelsState }
     * 
     */
    public QuotaHotelsState createQuotaHotelsState() {
        return new QuotaHotelsState();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link FilterParametrDiagnostic }
     * 
     */
    public FilterParametrDiagnostic createFilterParametrDiagnostic() {
        return new FilterParametrDiagnostic();
    }

    /**
     * Create an instance of {@link QuotaHotelItem }
     * 
     */
    public QuotaHotelItem createQuotaHotelItem() {
        return new QuotaHotelItem();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaFlightTariffState }
     * 
     */
    public ArrayOfQuotaFlightTariffState createArrayOfQuotaFlightTariffState() {
        return new ArrayOfQuotaFlightTariffState();
    }

    /**
     * Create an instance of {@link TourPriceServiceInfo }
     * 
     */
    public TourPriceServiceInfo createTourPriceServiceInfo() {
        return new TourPriceServiceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaHotelRoomVariant }
     * 
     */
    public ArrayOfQuotaHotelRoomVariant createArrayOfQuotaHotelRoomVariant() {
        return new ArrayOfQuotaHotelRoomVariant();
    }

    /**
     * Create an instance of {@link QuotaFlightTariffState }
     * 
     */
    public QuotaFlightTariffState createQuotaFlightTariffState() {
        return new QuotaFlightTariffState();
    }

    /**
     * Create an instance of {@link Tour }
     * 
     */
    public Tour createTour() {
        return new Tour();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaFlightTariffs }
     * 
     */
    public ArrayOfQuotaFlightTariffs createArrayOfQuotaFlightTariffs() {
        return new ArrayOfQuotaFlightTariffs();
    }

    /**
     * Create an instance of {@link ArrayOfTourPriceServiceInfo }
     * 
     */
    public ArrayOfTourPriceServiceInfo createArrayOfTourPriceServiceInfo() {
        return new ArrayOfTourPriceServiceInfo();
    }

    /**
     * Create an instance of {@link TourPriceEx }
     * 
     */
    public TourPriceEx createTourPriceEx() {
        return new TourPriceEx();
    }

    /**
     * Create an instance of {@link ArrayOfTourPriceEx }
     * 
     */
    public ArrayOfTourPriceEx createArrayOfTourPriceEx() {
        return new ArrayOfTourPriceEx();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaHotelItem }
     * 
     */
    public ArrayOfQuotaHotelItem createArrayOfQuotaHotelItem() {
        return new ArrayOfQuotaHotelItem();
    }

    /**
     * Create an instance of {@link ArrayOfTourHotelGroup }
     * 
     */
    public ArrayOfTourHotelGroup createArrayOfTourHotelGroup() {
        return new ArrayOfTourHotelGroup();
    }

    /**
     * Create an instance of {@link QuotaHotelRoomVariant }
     * 
     */
    public QuotaHotelRoomVariant createQuotaHotelRoomVariant() {
        return new QuotaHotelRoomVariant();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaFlightItem }
     * 
     */
    public ArrayOfQuotaFlightItem createArrayOfQuotaFlightItem() {
        return new ArrayOfQuotaFlightItem();
    }

    /**
     * Create an instance of {@link QuotaFlightItem }
     * 
     */
    public QuotaFlightItem createQuotaFlightItem() {
        return new QuotaFlightItem();
    }

    /**
     * Create an instance of {@link QuotaDateState }
     * 
     */
    public QuotaDateState createQuotaDateState() {
        return new QuotaDateState();
    }

    /**
     * Create an instance of {@link ArrayOfTourHotelVariant }
     * 
     */
    public ArrayOfTourHotelVariant createArrayOfTourHotelVariant() {
        return new ArrayOfTourHotelVariant();
    }

    /**
     * Create an instance of {@link TourHotelVariant }
     * 
     */
    public TourHotelVariant createTourHotelVariant() {
        return new TourHotelVariant();
    }

    /**
     * Create an instance of {@link TourHotelGroup }
     * 
     */
    public TourHotelGroup createTourHotelGroup() {
        return new TourHotelGroup();
    }

    /**
     * Create an instance of {@link QuotaFlightTariffs }
     * 
     */
    public QuotaFlightTariffs createQuotaFlightTariffs() {
        return new QuotaFlightTariffs();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaDateState }
     * 
     */
    public ArrayOfQuotaDateState createArrayOfQuotaDateState() {
        return new ArrayOfQuotaDateState();
    }

    /**
     * Create an instance of {@link StatItem }
     * 
     */
    public StatItem createStatItem() {
        return new StatItem();
    }

    /**
     * Create an instance of {@link ArrayOfStatValue }
     * 
     */
    public ArrayOfStatValue createArrayOfStatValue() {
        return new ArrayOfStatValue();
    }

    /**
     * Create an instance of {@link StatValue }
     * 
     */
    public StatValue createStatValue() {
        return new StatValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportKind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TransportKind")
    public JAXBElement<TransportKind> createTransportKind(TransportKind value) {
        return new JAXBElement<TransportKind>(_TransportKind_QNAME, TransportKind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "ArrayOfStatItem")
    public JAXBElement<ArrayOfStatItem> createArrayOfStatItem(ArrayOfStatItem value) {
        return new JAXBElement<ArrayOfStatItem>(_ArrayOfStatItem_QNAME, ArrayOfStatItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametrDiagnostic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "FilterParametr.Diagnostic")
    public JAXBElement<FilterParametrDiagnostic> createFilterParametrDiagnostic(FilterParametrDiagnostic value) {
        return new JAXBElement<FilterParametrDiagnostic>(_FilterParametrDiagnostic_QNAME, FilterParametrDiagnostic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGroupHotelResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "SearchGroupHotelResult")
    public JAXBElement<SearchGroupHotelResult> createSearchGroupHotelResult(SearchGroupHotelResult value) {
        return new JAXBElement<SearchGroupHotelResult>(_SearchGroupHotelResult_QNAME, SearchGroupHotelResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaHotelItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaHotelItem")
    public JAXBElement<QuotaHotelItem> createQuotaHotelItem(QuotaHotelItem value) {
        return new JAXBElement<QuotaHotelItem>(_QuotaHotelItem_QNAME, QuotaHotelItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfQuotaFlightTariffState")
    public JAXBElement<ArrayOfQuotaFlightTariffState> createArrayOfQuotaFlightTariffState(ArrayOfQuotaFlightTariffState value) {
        return new JAXBElement<ArrayOfQuotaFlightTariffState>(_ArrayOfQuotaFlightTariffState_QNAME, ArrayOfQuotaFlightTariffState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaState")
    public JAXBElement<QuotaState> createQuotaState(QuotaState value) {
        return new JAXBElement<QuotaState>(_QuotaState_QNAME, QuotaState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Tour")
    public JAXBElement<Tour> createTour(Tour value) {
        return new JAXBElement<Tour>(_Tour_QNAME, Tour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "StatValue")
    public JAXBElement<StatValue> createStatValue(StatValue value) {
        return new JAXBElement<StatValue>(_StatValue_QNAME, StatValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourPriceServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourPriceServiceInfo")
    public JAXBElement<TourPriceServiceInfo> createTourPriceServiceInfo(TourPriceServiceInfo value) {
        return new JAXBElement<TourPriceServiceInfo>(_TourPriceServiceInfo_QNAME, TourPriceServiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelRoomVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfQuotaHotelRoomVariant")
    public JAXBElement<ArrayOfQuotaHotelRoomVariant> createArrayOfQuotaHotelRoomVariant(ArrayOfQuotaHotelRoomVariant value) {
        return new JAXBElement<ArrayOfQuotaHotelRoomVariant>(_ArrayOfQuotaHotelRoomVariant_QNAME, ArrayOfQuotaHotelRoomVariant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaFlightTariffState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightTariffState")
    public JAXBElement<QuotaFlightTariffState> createQuotaFlightTariffState(QuotaFlightTariffState value) {
        return new JAXBElement<QuotaFlightTariffState>(_QuotaFlightTariffState_QNAME, QuotaFlightTariffState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "SearchResult")
    public JAXBElement<SearchResult> createSearchResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_SearchResult_QNAME, SearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaHotelsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaHotelsState")
    public JAXBElement<QuotaHotelsState> createQuotaHotelsState(QuotaHotelsState value) {
        return new JAXBElement<QuotaHotelsState>(_QuotaHotelsState_QNAME, QuotaHotelsState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfQuotaFlightTariffs")
    public JAXBElement<ArrayOfQuotaFlightTariffs> createArrayOfQuotaFlightTariffs(ArrayOfQuotaFlightTariffs value) {
        return new JAXBElement<ArrayOfQuotaFlightTariffs>(_ArrayOfQuotaFlightTariffs_QNAME, ArrayOfQuotaFlightTariffs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourPriceServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfTourPriceServiceInfo")
    public JAXBElement<ArrayOfTourPriceServiceInfo> createArrayOfTourPriceServiceInfo(ArrayOfTourPriceServiceInfo value) {
        return new JAXBElement<ArrayOfTourPriceServiceInfo>(_ArrayOfTourPriceServiceInfo_QNAME, ArrayOfTourPriceServiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourPriceEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfTourPriceEx")
    public JAXBElement<ArrayOfTourPriceEx> createArrayOfTourPriceEx(ArrayOfTourPriceEx value) {
        return new JAXBElement<ArrayOfTourPriceEx>(_ArrayOfTourPriceEx_QNAME, ArrayOfTourPriceEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourHotelVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfTourHotelVariant")
    public JAXBElement<ArrayOfTourHotelVariant> createArrayOfTourHotelVariant(ArrayOfTourHotelVariant value) {
        return new JAXBElement<ArrayOfTourHotelVariant>(_ArrayOfTourHotelVariant_QNAME, ArrayOfTourHotelVariant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourHotelGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourHotelGroup")
    public JAXBElement<TourHotelGroup> createTourHotelGroup(TourHotelGroup value) {
        return new JAXBElement<TourHotelGroup>(_TourHotelGroup_QNAME, TourHotelGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "ArrayOfStatValue")
    public JAXBElement<ArrayOfStatValue> createArrayOfStatValue(ArrayOfStatValue value) {
        return new JAXBElement<ArrayOfStatValue>(_ArrayOfStatValue_QNAME, ArrayOfStatValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaFlightsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightsState")
    public JAXBElement<QuotaFlightsState> createQuotaFlightsState(QuotaFlightsState value) {
        return new JAXBElement<QuotaFlightsState>(_QuotaFlightsState_QNAME, QuotaFlightsState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfQuotaFlightItem")
    public JAXBElement<ArrayOfQuotaFlightItem> createArrayOfQuotaFlightItem(ArrayOfQuotaFlightItem value) {
        return new JAXBElement<ArrayOfQuotaFlightItem>(_ArrayOfQuotaFlightItem_QNAME, ArrayOfQuotaFlightItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaDateState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaDateState")
    public JAXBElement<QuotaDateState> createQuotaDateState(QuotaDateState value) {
        return new JAXBElement<QuotaDateState>(_QuotaDateState_QNAME, QuotaDateState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "StatItem")
    public JAXBElement<StatItem> createStatItem(StatItem value) {
        return new JAXBElement<StatItem>(_StatItem_QNAME, StatItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPackets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "FlightPackets")
    public JAXBElement<FlightPackets> createFlightPackets(FlightPackets value) {
        return new JAXBElement<FlightPackets>(_FlightPackets_QNAME, FlightPackets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfQuotaHotelItem")
    public JAXBElement<ArrayOfQuotaHotelItem> createArrayOfQuotaHotelItem(ArrayOfQuotaHotelItem value) {
        return new JAXBElement<ArrayOfQuotaHotelItem>(_ArrayOfQuotaHotelItem_QNAME, ArrayOfQuotaHotelItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourPriceEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourPriceEx")
    public JAXBElement<TourPriceEx> createTourPriceEx(TourPriceEx value) {
        return new JAXBElement<TourPriceEx>(_TourPriceEx_QNAME, TourPriceEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourHotelVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourHotelVariant")
    public JAXBElement<TourHotelVariant> createTourHotelVariant(TourHotelVariant value) {
        return new JAXBElement<TourHotelVariant>(_TourHotelVariant_QNAME, TourHotelVariant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaFlightTariffs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightTariffs")
    public JAXBElement<QuotaFlightTariffs> createQuotaFlightTariffs(QuotaFlightTariffs value) {
        return new JAXBElement<QuotaFlightTariffs>(_QuotaFlightTariffs_QNAME, QuotaFlightTariffs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "FilterParametr")
    public JAXBElement<FilterParametr> createFilterParametr(FilterParametr value) {
        return new JAXBElement<FilterParametr>(_FilterParametr_QNAME, FilterParametr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaDateState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfQuotaDateState")
    public JAXBElement<ArrayOfQuotaDateState> createArrayOfQuotaDateState(ArrayOfQuotaDateState value) {
        return new JAXBElement<ArrayOfQuotaDateState>(_ArrayOfQuotaDateState_QNAME, ArrayOfQuotaDateState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourHotelGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "ArrayOfTourHotelGroup")
    public JAXBElement<ArrayOfTourHotelGroup> createArrayOfTourHotelGroup(ArrayOfTourHotelGroup value) {
        return new JAXBElement<ArrayOfTourHotelGroup>(_ArrayOfTourHotelGroup_QNAME, ArrayOfTourHotelGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaHotelRoomVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaHotelRoomVariant")
    public JAXBElement<QuotaHotelRoomVariant> createQuotaHotelRoomVariant(QuotaHotelRoomVariant value) {
        return new JAXBElement<QuotaHotelRoomVariant>(_QuotaHotelRoomVariant_QNAME, QuotaHotelRoomVariant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaFlightItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightItem")
    public JAXBElement<QuotaFlightItem> createQuotaFlightItem(QuotaFlightItem value) {
        return new JAXBElement<QuotaFlightItem>(_QuotaFlightItem_QNAME, QuotaFlightItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourPriceServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourPriceServiceInfos", scope = TourPriceEx.class)
    public JAXBElement<ArrayOfTourPriceServiceInfo> createTourPriceExTourPriceServiceInfos(ArrayOfTourPriceServiceInfo value) {
        return new JAXBElement<ArrayOfTourPriceServiceInfo>(_TourPriceExTourPriceServiceInfos_QNAME, ArrayOfTourPriceServiceInfo.class, TourPriceEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourTypeName", scope = TourPriceEx.class)
    public JAXBElement<String> createTourPriceExTourTypeName(String value) {
        return new JAXBElement<String>(_TourPriceExTourTypeName_QNAME, String.class, TourPriceEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourName", scope = TourPriceEx.class)
    public JAXBElement<String> createTourPriceExTourName(String value) {
        return new JAXBElement<String>(_TourPriceExTourName_QNAME, String.class, TourPriceEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourUrl", scope = TourPriceEx.class)
    public JAXBElement<String> createTourPriceExTourUrl(String value) {
        return new JAXBElement<String>(_TourPriceExTourUrl_QNAME, String.class, TourPriceEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "CityToName", scope = TourPriceEx.class)
    public JAXBElement<String> createTourPriceExCityToName(String value) {
        return new JAXBElement<String>(_TourPriceExCityToName_QNAME, String.class, TourPriceEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Rate", scope = TourPriceEx.class)
    public JAXBElement<String> createTourPriceExRate(String value) {
        return new JAXBElement<String>(_TourPriceExRate_QNAME, String.class, TourPriceEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "Value", scope = StatValue.class)
    public JAXBElement<String> createStatValueValue(String value) {
        return new JAXBElement<String>(_StatValueValue_QNAME, String.class, StatValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "Key", scope = StatValue.class)
    public JAXBElement<String> createStatValueKey(String value) {
        return new JAXBElement<String>(_StatValueKey_QNAME, String.class, StatValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RoomCategory", scope = TourHotelVariant.class)
    public JAXBElement<String> createTourHotelVariantRoomCategory(String value) {
        return new JAXBElement<String>(_TourHotelVariantRoomCategory_QNAME, String.class, TourHotelVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RoomType", scope = TourHotelVariant.class)
    public JAXBElement<String> createTourHotelVariantRoomType(String value) {
        return new JAXBElement<String>(_TourHotelVariantRoomType_QNAME, String.class, TourHotelVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourPriceEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourPrice", scope = TourHotelVariant.class)
    public JAXBElement<TourPriceEx> createTourHotelVariantTourPrice(TourPriceEx value) {
        return new JAXBElement<TourPriceEx>(_TourHotelVariantTourPrice_QNAME, TourPriceEx.class, TourHotelVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Meal", scope = TourHotelVariant.class)
    public JAXBElement<String> createTourHotelVariantMeal(String value) {
        return new JAXBElement<String>(_TourHotelVariantMeal_QNAME, String.class, TourHotelVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "PacketsBack", scope = FlightPackets.class)
    public JAXBElement<ArrayOfint> createFlightPacketsPacketsBack(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FlightPacketsPacketsBack_QNAME, ArrayOfint.class, FlightPackets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "PacketsTo", scope = FlightPackets.class)
    public JAXBElement<ArrayOfint> createFlightPacketsPacketsTo(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FlightPacketsPacketsTo_QNAME, ArrayOfint.class, FlightPackets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaDateState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaDateStates", scope = QuotaHotelRoomVariant.class)
    public JAXBElement<ArrayOfQuotaDateState> createQuotaHotelRoomVariantQuotaDateStates(ArrayOfQuotaDateState value) {
        return new JAXBElement<ArrayOfQuotaDateState>(_QuotaHotelRoomVariantQuotaDateStates_QNAME, ArrayOfQuotaDateState.class, QuotaHotelRoomVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TouristCountDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TouristCountDetail", scope = QuotaHotelRoomVariant.class)
    public JAXBElement<TouristCountDetail> createQuotaHotelRoomVariantTouristCountDetail(TouristCountDetail value) {
        return new JAXBElement<TouristCountDetail>(_QuotaHotelRoomVariantTouristCountDetail_QNAME, TouristCountDetail.class, QuotaHotelRoomVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccommodation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Accomodations", scope = QuotaHotelRoomVariant.class)
    public JAXBElement<ArrayOfAccommodation> createQuotaHotelRoomVariantAccomodations(ArrayOfAccommodation value) {
        return new JAXBElement<ArrayOfAccommodation>(_QuotaHotelRoomVariantAccomodations_QNAME, ArrayOfAccommodation.class, QuotaHotelRoomVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RoomVariant", scope = QuotaHotelRoomVariant.class)
    public JAXBElement<String> createQuotaHotelRoomVariantRoomVariant(String value) {
        return new JAXBElement<String>(_QuotaHotelRoomVariantRoomVariant_QNAME, String.class, QuotaHotelRoomVariant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourHotelGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourHotelGroups", scope = SearchGroupHotelResult.class)
    public JAXBElement<ArrayOfTourHotelGroup> createSearchGroupHotelResultTourHotelGroups(ArrayOfTourHotelGroup value) {
        return new JAXBElement<ArrayOfTourHotelGroup>(_SearchGroupHotelResultTourHotelGroups_QNAME, ArrayOfTourHotelGroup.class, SearchGroupHotelResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TypeTours", scope = Tour.class)
    public JAXBElement<ArrayOfint> createTourTypeTours(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_TourTypeTours_QNAME, ArrayOfint.class, Tour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourURL", scope = Tour.class)
    public JAXBElement<String> createTourTourURL(String value) {
        return new JAXBElement<String>(_TourTourURL_QNAME, String.class, Tour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RateIso", scope = Tour.class)
    public JAXBElement<String> createTourRateIso(String value) {
        return new JAXBElement<String>(_TourRateIso_QNAME, String.class, Tour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourHotelVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourHotelVariants", scope = TourHotelGroup.class)
    public JAXBElement<ArrayOfTourHotelVariant> createTourHotelGroupTourHotelVariants(ArrayOfTourHotelVariant value) {
        return new JAXBElement<ArrayOfTourHotelVariant>(_TourHotelGroupTourHotelVariants_QNAME, ArrayOfTourHotelVariant.class, TourHotelGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Hotel", scope = TourHotelGroup.class)
    public JAXBElement<Hotel> createTourHotelGroupHotel(Hotel value) {
        return new JAXBElement<Hotel>(_TourHotelGroupHotel_QNAME, Hotel.class, TourHotelGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourPriceEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourPrice", scope = TourHotelGroup.class)
    public JAXBElement<TourPriceEx> createTourHotelGroupTourPrice(TourPriceEx value) {
        return new JAXBElement<TourPriceEx>(_TourHotelVariantTourPrice_QNAME, TourPriceEx.class, TourHotelGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTourPriceEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Prices", scope = SearchResult.class)
    public JAXBElement<ArrayOfTourPriceEx> createSearchResultPrices(ArrayOfTourPriceEx value) {
        return new JAXBElement<ArrayOfTourPriceEx>(_SearchResultPrices_QNAME, ArrayOfTourPriceEx.class, SearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Airseason", scope = QuotaFlightTariffState.class)
    public JAXBElement<String> createQuotaFlightTariffStateAirseason(String value) {
        return new JAXBElement<String>(_QuotaFlightTariffStateAirseason_QNAME, String.class, QuotaFlightTariffState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightTariffStates", scope = QuotaFlightTariffs.class)
    public JAXBElement<ArrayOfQuotaFlightTariffState> createQuotaFlightTariffsQuotaFlightTariffStates(ArrayOfQuotaFlightTariffState value) {
        return new JAXBElement<ArrayOfQuotaFlightTariffState>(_QuotaFlightTariffsQuotaFlightTariffStates_QNAME, ArrayOfQuotaFlightTariffState.class, QuotaFlightTariffs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TariffName", scope = QuotaFlightTariffs.class)
    public JAXBElement<String> createQuotaFlightTariffsTariffName(String value) {
        return new JAXBElement<String>(_QuotaFlightTariffsTariffName_QNAME, String.class, QuotaFlightTariffs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Tariff", scope = QuotaFlightTariffs.class)
    public JAXBElement<String> createQuotaFlightTariffsTariff(String value) {
        return new JAXBElement<String>(_QuotaFlightTariffsTariff_QNAME, String.class, QuotaFlightTariffs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Accmd", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoAccmd(String value) {
        return new JAXBElement<String>(_TourPriceServiceInfoAccmd_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Duration", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoDuration(String value) {
        return new JAXBElement<String>(_TourPriceServiceInfoDuration_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "City", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoCity(String value) {
        return new JAXBElement<String>(_TourPriceServiceInfoCity_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Hotel", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoHotel(String value) {
        return new JAXBElement<String>(_TourHotelGroupHotel_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "URL", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoURL(String value) {
        return new JAXBElement<String>(_TourPriceServiceInfoURL_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RoomCategory", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoRoomCategory(String value) {
        return new JAXBElement<String>(_TourHotelVariantRoomCategory_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RoomType", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoRoomType(String value) {
        return new JAXBElement<String>(_TourHotelVariantRoomType_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Town", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoTown(String value) {
        return new JAXBElement<String>(_TourPriceServiceInfoTown_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Meal", scope = TourPriceServiceInfo.class)
    public JAXBElement<String> createTourPriceServiceInfoMeal(String value) {
        return new JAXBElement<String>(_TourHotelVariantMeal_QNAME, String.class, TourPriceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaBackFlightItems", scope = QuotaFlightsState.class)
    public JAXBElement<ArrayOfQuotaFlightItem> createQuotaFlightsStateQuotaBackFlightItems(ArrayOfQuotaFlightItem value) {
        return new JAXBElement<ArrayOfQuotaFlightItem>(_QuotaFlightsStateQuotaBackFlightItems_QNAME, ArrayOfQuotaFlightItem.class, QuotaFlightsState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightItems", scope = QuotaFlightsState.class)
    public JAXBElement<ArrayOfQuotaFlightItem> createQuotaFlightsStateQuotaFlightItems(ArrayOfQuotaFlightItem value) {
        return new JAXBElement<ArrayOfQuotaFlightItem>(_QuotaFlightsStateQuotaFlightItems_QNAME, ArrayOfQuotaFlightItem.class, QuotaFlightsState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Durations", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrDurations(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrDurations_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Tours", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrTours(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrTours_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Paxs", scope = FilterParametr.class)
    public JAXBElement<String> createFilterParametrPaxs(String value) {
        return new JAXBElement<String>(_FilterParametrPaxs_QNAME, String.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "HotelFacilities", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrHotelFacilities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrHotelFacilities_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfshort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Pax_ChildAges", scope = FilterParametr.class)
    public JAXBElement<ArrayOfshort> createFilterParametrPaxChildAges(ArrayOfshort value) {
        return new JAXBElement<ArrayOfshort>(_FilterParametrPaxChildAges_QNAME, ArrayOfshort.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "CurrencyIsoCode", scope = FilterParametr.class)
    public JAXBElement<String> createFilterParametrCurrencyIsoCode(String value) {
        return new JAXBElement<String>(_FilterParametrCurrencyIsoCode_QNAME, String.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "CityKeyTo", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrCityKeyTo(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrCityKeyTo_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "RoomCategories", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrRoomCategories(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrRoomCategories_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "HotelGroups", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrHotelGroups(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrHotelGroups_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "HotelCategories", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrHotelCategories(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrHotelCategories_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Cities", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrCities(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrCities_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "AccommodationsCheck", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrAccommodationsCheck(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrAccommodationsCheck_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Localization", scope = FilterParametr.class)
    public JAXBElement<String> createFilterParametrLocalization(String value) {
        return new JAXBElement<String>(_FilterParametrLocalization_QNAME, String.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Meals", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrMeals(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrMeals_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "CityKey", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrCityKey(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrCityKey_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterParametrDiagnostic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Debug", scope = FilterParametr.class)
    public JAXBElement<FilterParametrDiagnostic> createFilterParametrDebug(FilterParametrDiagnostic value) {
        return new JAXBElement<FilterParametrDiagnostic>(_FilterParametrDebug_QNAME, FilterParametrDiagnostic.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "HotelsToExclude", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrHotelsToExclude(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrHotelsToExclude_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Hotels", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrHotels(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrHotels_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Sender", scope = FilterParametr.class)
    public JAXBElement<String> createFilterParametrSender(String value) {
        return new JAXBElement<String>(_FilterParametrSender_QNAME, String.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "TourTypes", scope = FilterParametr.class)
    public JAXBElement<ArrayOfint> createFilterParametrTourTypes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FilterParametrTourTypes_QNAME, ArrayOfint.class, FilterParametr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", name = "Stats", scope = StatItem.class)
    public JAXBElement<ArrayOfStatValue> createStatItemStats(ArrayOfStatValue value) {
        return new JAXBElement<ArrayOfStatValue>(_StatItemStats_QNAME, ArrayOfStatValue.class, StatItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaHotelItems", scope = QuotaHotelsState.class)
    public JAXBElement<ArrayOfQuotaHotelItem> createQuotaHotelsStateQuotaHotelItems(ArrayOfQuotaHotelItem value) {
        return new JAXBElement<ArrayOfQuotaHotelItem>(_QuotaHotelsStateQuotaHotelItems_QNAME, ArrayOfQuotaHotelItem.class, QuotaHotelsState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Hotel", scope = QuotaHotelItem.class)
    public JAXBElement<Hotel> createQuotaHotelItemHotel(Hotel value) {
        return new JAXBElement<Hotel>(_TourHotelGroupHotel_QNAME, Hotel.class, QuotaHotelItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelRoomVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaHotelRoomVariants", scope = QuotaHotelItem.class)
    public JAXBElement<ArrayOfQuotaHotelRoomVariant> createQuotaHotelItemQuotaHotelRoomVariants(ArrayOfQuotaHotelRoomVariant value) {
        return new JAXBElement<ArrayOfQuotaHotelRoomVariant>(_QuotaHotelItemQuotaHotelRoomVariants_QNAME, ArrayOfQuotaHotelRoomVariant.class, QuotaHotelItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "Airports", scope = QuotaFlightItem.class)
    public JAXBElement<String> createQuotaFlightItemAirports(String value) {
        return new JAXBElement<String>(_QuotaFlightItemAirports_QNAME, String.class, QuotaFlightItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "AircraftName", scope = QuotaFlightItem.class)
    public JAXBElement<String> createQuotaFlightItemAircraftName(String value) {
        return new JAXBElement<String>(_QuotaFlightItemAircraftName_QNAME, String.class, QuotaFlightItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "CharterName", scope = QuotaFlightItem.class)
    public JAXBElement<String> createQuotaFlightItemCharterName(String value) {
        return new JAXBElement<String>(_QuotaFlightItemCharterName_QNAME, String.class, QuotaFlightItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", name = "QuotaFlightTariffs", scope = QuotaFlightItem.class)
    public JAXBElement<ArrayOfQuotaFlightTariffs> createQuotaFlightItemQuotaFlightTariffs(ArrayOfQuotaFlightTariffs value) {
        return new JAXBElement<ArrayOfQuotaFlightTariffs>(_QuotaFlightTariffs_QNAME, ArrayOfQuotaFlightTariffs.class, QuotaFlightItem.class, value);
    }

}
