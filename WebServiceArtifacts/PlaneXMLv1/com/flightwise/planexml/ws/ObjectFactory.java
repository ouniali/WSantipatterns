
package com.flightwise.planexml.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flightwise.planexml.ws package. 
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

    private final static QName _Photos_QNAME = new QName("http://planexml.flightwise.com/ws", "Photos");
    private final static QName _PlanList_QNAME = new QName("http://planexml.flightwise.com/ws", "PlanList");
    private final static QName _FIDynamic_QNAME = new QName("http://planexml.flightwise.com/ws", "FIDynamic");
    private final static QName _Flights_QNAME = new QName("http://planexml.flightwise.com/ws", "Flights");
    private final static QName _Positions_QNAME = new QName("http://planexml.flightwise.com/ws", "positions");
    private final static QName _FIStatic_QNAME = new QName("http://planexml.flightwise.com/ws", "FIStatic");
    private final static QName _Airports_QNAME = new QName("http://planexml.flightwise.com/ws", "Airports");
    private final static QName _History_QNAME = new QName("http://planexml.flightwise.com/ws", "History");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flightwise.planexml.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightPathResponse }
     * 
     */
    public FlightPathResponse createFlightPathResponse() {
        return new FlightPathResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdsPosition }
     * 
     */
    public ArrayOfAdsPosition createArrayOfAdsPosition() {
        return new ArrayOfAdsPosition();
    }

    /**
     * Create an instance of {@link FlightsNear }
     * 
     */
    public FlightsNear createFlightsNear() {
        return new FlightsNear();
    }

    /**
     * Create an instance of {@link ArrayOfPastFlight }
     * 
     */
    public ArrayOfPastFlight createArrayOfPastFlight() {
        return new ArrayOfPastFlight();
    }

    /**
     * Create an instance of {@link RecentFlightsResponse }
     * 
     */
    public RecentFlightsResponse createRecentFlightsResponse() {
        return new RecentFlightsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPhoto }
     * 
     */
    public ArrayOfPhoto createArrayOfPhoto() {
        return new ArrayOfPhoto();
    }

    /**
     * Create an instance of {@link FlightPlansResponse }
     * 
     */
    public FlightPlansResponse createFlightPlansResponse() {
        return new FlightPlansResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFlightPlan }
     * 
     */
    public ArrayOfFlightPlan createArrayOfFlightPlan() {
        return new ArrayOfFlightPlan();
    }

    /**
     * Create an instance of {@link AirportsNear }
     * 
     */
    public AirportsNear createAirportsNear() {
        return new AirportsNear();
    }

    /**
     * Create an instance of {@link FlightStatus }
     * 
     */
    public FlightStatus createFlightStatus() {
        return new FlightStatus();
    }

    /**
     * Create an instance of {@link PhotoListResponse }
     * 
     */
    public PhotoListResponse createPhotoListResponse() {
        return new PhotoListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFIStatic }
     * 
     */
    public ArrayOfFIStatic createArrayOfFIStatic() {
        return new ArrayOfFIStatic();
    }

    /**
     * Create an instance of {@link FlightStatusResponse }
     * 
     */
    public FlightStatusResponse createFlightStatusResponse() {
        return new FlightStatusResponse();
    }

    /**
     * Create an instance of {@link FIDynamic }
     * 
     */
    public FIDynamic createFIDynamic() {
        return new FIDynamic();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link AirportsNearResponse }
     * 
     */
    public AirportsNearResponse createAirportsNearResponse() {
        return new AirportsNearResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAirport }
     * 
     */
    public ArrayOfAirport createArrayOfAirport() {
        return new ArrayOfAirport();
    }

    /**
     * Create an instance of {@link AirportInfoResponse }
     * 
     */
    public AirportInfoResponse createAirportInfoResponse() {
        return new AirportInfoResponse();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link FlightPath }
     * 
     */
    public FlightPath createFlightPath() {
        return new FlightPath();
    }

    /**
     * Create an instance of {@link RecentFlights }
     * 
     */
    public RecentFlights createRecentFlights() {
        return new RecentFlights();
    }

    /**
     * Create an instance of {@link AirportsNearConventionalResponse }
     * 
     */
    public AirportsNearConventionalResponse createAirportsNearConventionalResponse() {
        return new AirportsNearConventionalResponse();
    }

    /**
     * Create an instance of {@link AirportsNearConventional }
     * 
     */
    public AirportsNearConventional createAirportsNearConventional() {
        return new AirportsNearConventional();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link FlightInfo }
     * 
     */
    public FlightInfo createFlightInfo() {
        return new FlightInfo();
    }

    /**
     * Create an instance of {@link FlightInfoResponse }
     * 
     */
    public FlightInfoResponse createFlightInfoResponse() {
        return new FlightInfoResponse();
    }

    /**
     * Create an instance of {@link FIStatic }
     * 
     */
    public FIStatic createFIStatic() {
        return new FIStatic();
    }

    /**
     * Create an instance of {@link PhotoList }
     * 
     */
    public PhotoList createPhotoList() {
        return new PhotoList();
    }

    /**
     * Create an instance of {@link AirportInfo }
     * 
     */
    public AirportInfo createAirportInfo() {
        return new AirportInfo();
    }

    /**
     * Create an instance of {@link FlightPlans }
     * 
     */
    public FlightPlans createFlightPlans() {
        return new FlightPlans();
    }

    /**
     * Create an instance of {@link FlightsNearResponse }
     * 
     */
    public FlightsNearResponse createFlightsNearResponse() {
        return new FlightsNearResponse();
    }

    /**
     * Create an instance of {@link FlightPlan }
     * 
     */
    public FlightPlan createFlightPlan() {
        return new FlightPlan();
    }

    /**
     * Create an instance of {@link Photo }
     * 
     */
    public Photo createPhoto() {
        return new Photo();
    }

    /**
     * Create an instance of {@link PastFlight }
     * 
     */
    public PastFlight createPastFlight() {
        return new PastFlight();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link AdsPosition }
     * 
     */
    public AdsPosition createAdsPosition() {
        return new AdsPosition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhoto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "Photos")
    public JAXBElement<ArrayOfPhoto> createPhotos(ArrayOfPhoto value) {
        return new JAXBElement<ArrayOfPhoto>(_Photos_QNAME, ArrayOfPhoto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "PlanList")
    public JAXBElement<ArrayOfFlightPlan> createPlanList(ArrayOfFlightPlan value) {
        return new JAXBElement<ArrayOfFlightPlan>(_PlanList_QNAME, ArrayOfFlightPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FIDynamic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "FIDynamic")
    public JAXBElement<FIDynamic> createFIDynamic(FIDynamic value) {
        return new JAXBElement<FIDynamic>(_FIDynamic_QNAME, FIDynamic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFIStatic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "Flights")
    public JAXBElement<ArrayOfFIStatic> createFlights(ArrayOfFIStatic value) {
        return new JAXBElement<ArrayOfFIStatic>(_Flights_QNAME, ArrayOfFIStatic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdsPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "positions")
    public JAXBElement<ArrayOfAdsPosition> createPositions(ArrayOfAdsPosition value) {
        return new JAXBElement<ArrayOfAdsPosition>(_Positions_QNAME, ArrayOfAdsPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FIStatic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "FIStatic")
    public JAXBElement<FIStatic> createFIStatic(FIStatic value) {
        return new JAXBElement<FIStatic>(_FIStatic_QNAME, FIStatic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "Airports")
    public JAXBElement<ArrayOfAirport> createAirports(ArrayOfAirport value) {
        return new JAXBElement<ArrayOfAirport>(_Airports_QNAME, ArrayOfAirport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPastFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://planexml.flightwise.com/ws", name = "History")
    public JAXBElement<ArrayOfPastFlight> createHistory(ArrayOfPastFlight value) {
        return new JAXBElement<ArrayOfPastFlight>(_History_QNAME, ArrayOfPastFlight.class, null, value);
    }

}
