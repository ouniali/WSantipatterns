
package linjegodswebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the linjegodswebservices package. 
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

    private final static QName _TrackAndTracePODsResultat_QNAME = new QName("LinjegodsWebServices", "TrackAndTracePODsResultat");
    private final static QName _TrackAndTraceResultat_QNAME = new QName("LinjegodsWebServices", "TrackAndTraceResultat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: linjegodswebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackAndTracePODsResponse }
     * 
     */
    public TrackAndTracePODsResponse createTrackAndTracePODsResponse() {
        return new TrackAndTracePODsResponse();
    }

    /**
     * Create an instance of {@link TrackAndTracePODsResultat }
     * 
     */
    public TrackAndTracePODsResultat createTrackAndTracePODsResultat() {
        return new TrackAndTracePODsResultat();
    }

    /**
     * Create an instance of {@link TrackAndTraceResponse }
     * 
     */
    public TrackAndTraceResponse createTrackAndTraceResponse() {
        return new TrackAndTraceResponse();
    }

    /**
     * Create an instance of {@link TrackAndTraceResultat }
     * 
     */
    public TrackAndTraceResultat createTrackAndTraceResultat() {
        return new TrackAndTraceResultat();
    }

    /**
     * Create an instance of {@link PriceAndTimeTableResponse }
     * 
     */
    public PriceAndTimeTableResponse createPriceAndTimeTableResponse() {
        return new PriceAndTimeTableResponse();
    }

    /**
     * Create an instance of {@link PriceAndTimeTableResult }
     * 
     */
    public PriceAndTimeTableResult createPriceAndTimeTableResult() {
        return new PriceAndTimeTableResult();
    }

    /**
     * Create an instance of {@link TrackAndTracePODs }
     * 
     */
    public TrackAndTracePODs createTrackAndTracePODs() {
        return new TrackAndTracePODs();
    }

    /**
     * Create an instance of {@link PriceAndTimeTable }
     * 
     */
    public PriceAndTimeTable createPriceAndTimeTable() {
        return new PriceAndTimeTable();
    }

    /**
     * Create an instance of {@link FreightPriceArguments }
     * 
     */
    public FreightPriceArguments createFreightPriceArguments() {
        return new FreightPriceArguments();
    }

    /**
     * Create an instance of {@link TrackAndTrace }
     * 
     */
    public TrackAndTrace createTrackAndTrace() {
        return new TrackAndTrace();
    }

    /**
     * Create an instance of {@link POD }
     * 
     */
    public POD createPOD() {
        return new POD();
    }

    /**
     * Create an instance of {@link Shipment }
     * 
     */
    public Shipment createShipment() {
        return new Shipment();
    }

    /**
     * Create an instance of {@link ArrayOfPOD }
     * 
     */
    public ArrayOfPOD createArrayOfPOD() {
        return new ArrayOfPOD();
    }

    /**
     * Create an instance of {@link ScheduledDeliveryTimeResultat }
     * 
     */
    public ScheduledDeliveryTimeResultat createScheduledDeliveryTimeResultat() {
        return new ScheduledDeliveryTimeResultat();
    }

    /**
     * Create an instance of {@link FreightPriceResultat }
     * 
     */
    public FreightPriceResultat createFreightPriceResultat() {
        return new FreightPriceResultat();
    }

    /**
     * Create an instance of {@link ArrayOfShipment }
     * 
     */
    public ArrayOfShipment createArrayOfShipment() {
        return new ArrayOfShipment();
    }

    /**
     * Create an instance of {@link ArrayOfColliObservation }
     * 
     */
    public ArrayOfColliObservation createArrayOfColliObservation() {
        return new ArrayOfColliObservation();
    }

    /**
     * Create an instance of {@link ColliObservation }
     * 
     */
    public ColliObservation createColliObservation() {
        return new ColliObservation();
    }

    /**
     * Create an instance of {@link Documents }
     * 
     */
    public Documents createDocuments() {
        return new Documents();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAndTracePODsResultat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "LinjegodsWebServices", name = "TrackAndTracePODsResultat")
    public JAXBElement<TrackAndTracePODsResultat> createTrackAndTracePODsResultat(TrackAndTracePODsResultat value) {
        return new JAXBElement<TrackAndTracePODsResultat>(_TrackAndTracePODsResultat_QNAME, TrackAndTracePODsResultat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAndTraceResultat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "LinjegodsWebServices", name = "TrackAndTraceResultat")
    public JAXBElement<TrackAndTraceResultat> createTrackAndTraceResultat(TrackAndTraceResultat value) {
        return new JAXBElement<TrackAndTraceResultat>(_TrackAndTraceResultat_QNAME, TrackAndTraceResultat.class, null, value);
    }

}
