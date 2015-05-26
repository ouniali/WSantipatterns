
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.xsd package. 
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

    private final static QName _TravellerDataSurcharge_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "surcharge");
    private final static QName _TravellerDataSerialNumber_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "serialNumber");
    private final static QName _TravellerDataProducesComission_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "producesComission");
    private final static QName _TravellerDataDiscountAmount_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "discountAmount");
    private final static QName _TravellerDataNetPrice_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "netPrice");
    private final static QName _TravellerDataPromotionCode_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "promotionCode");
    private final static QName _TravellerDataGrossPrice_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "grossPrice");
    private final static QName _TravellerDataDiscountPercentage_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "discountPercentage");
    private final static QName _TravellerDataPassengerType_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "passengerType");
    private final static QName _TravellerDataTravellerDescription_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "travellerDescription");
    private final static QName _TravellerDataThirdPartyAmount_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "thirdPartyAmount");
    private final static QName _TravellerDataDiscountType_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "discountType");
    private final static QName _TravellerDataSurcharge1_QNAME = new QName("http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "surcharge1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TravellerData }
     * 
     */
    public TravellerData createTravellerData() {
        return new TravellerData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "surcharge", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataSurcharge(Double value) {
        return new JAXBElement<Double>(_TravellerDataSurcharge_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "serialNumber", scope = TravellerData.class)
    public JAXBElement<String> createTravellerDataSerialNumber(String value) {
        return new JAXBElement<String>(_TravellerDataSerialNumber_QNAME, String.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "producesComission", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataProducesComission(Double value) {
        return new JAXBElement<Double>(_TravellerDataProducesComission_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountAmount", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataDiscountAmount(Double value) {
        return new JAXBElement<Double>(_TravellerDataDiscountAmount_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "netPrice", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataNetPrice(Double value) {
        return new JAXBElement<Double>(_TravellerDataNetPrice_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "promotionCode", scope = TravellerData.class)
    public JAXBElement<String> createTravellerDataPromotionCode(String value) {
        return new JAXBElement<String>(_TravellerDataPromotionCode_QNAME, String.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "grossPrice", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataGrossPrice(Double value) {
        return new JAXBElement<Double>(_TravellerDataGrossPrice_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountPercentage", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataDiscountPercentage(Double value) {
        return new JAXBElement<Double>(_TravellerDataDiscountPercentage_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "passengerType", scope = TravellerData.class)
    public JAXBElement<String> createTravellerDataPassengerType(String value) {
        return new JAXBElement<String>(_TravellerDataPassengerType_QNAME, String.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "travellerDescription", scope = TravellerData.class)
    public JAXBElement<String> createTravellerDataTravellerDescription(String value) {
        return new JAXBElement<String>(_TravellerDataTravellerDescription_QNAME, String.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "thirdPartyAmount", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataThirdPartyAmount(Double value) {
        return new JAXBElement<Double>(_TravellerDataThirdPartyAmount_QNAME, Double.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountType", scope = TravellerData.class)
    public JAXBElement<String> createTravellerDataDiscountType(String value) {
        return new JAXBElement<String>(_TravellerDataDiscountType_QNAME, String.class, TravellerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "surcharge1", scope = TravellerData.class)
    public JAXBElement<Double> createTravellerDataSurcharge1(Double value) {
        return new JAXBElement<Double>(_TravellerDataSurcharge1_QNAME, Double.class, TravellerData.class, value);
    }

}
