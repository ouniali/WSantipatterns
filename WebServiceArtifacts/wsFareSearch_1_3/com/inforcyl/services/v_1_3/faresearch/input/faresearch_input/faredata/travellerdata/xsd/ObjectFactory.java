
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.travellerdata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.travellerdata.xsd package. 
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

    private final static QName _DiscountsDiscountType_QNAME = new QName("http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "discountType");
    private final static QName _DiscountsFromOrToBorder_QNAME = new QName("http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "fromOrToBorder");
    private final static QName _DiscountsLeg_QNAME = new QName("http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "leg");
    private final static QName _DiscountsBorder_QNAME = new QName("http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "border");
    private final static QName _DiscountsDiscountPercentage_QNAME = new QName("http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "discountPercentage");
    private final static QName _DiscountsAcumulativeWithOtherOffers_QNAME = new QName("http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "acumulativeWithOtherOffers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.travellerdata.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Discounts }
     * 
     */
    public Discounts createDiscounts() {
        return new Discounts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountType", scope = Discounts.class)
    public JAXBElement<String> createDiscountsDiscountType(String value) {
        return new JAXBElement<String>(_DiscountsDiscountType_QNAME, String.class, Discounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "fromOrToBorder", scope = Discounts.class)
    public JAXBElement<String> createDiscountsFromOrToBorder(String value) {
        return new JAXBElement<String>(_DiscountsFromOrToBorder_QNAME, String.class, Discounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "leg", scope = Discounts.class)
    public JAXBElement<String> createDiscountsLeg(String value) {
        return new JAXBElement<String>(_DiscountsLeg_QNAME, String.class, Discounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "border", scope = Discounts.class)
    public JAXBElement<String> createDiscountsBorder(String value) {
        return new JAXBElement<String>(_DiscountsBorder_QNAME, String.class, Discounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountPercentage", scope = Discounts.class)
    public JAXBElement<Double> createDiscountsDiscountPercentage(Double value) {
        return new JAXBElement<Double>(_DiscountsDiscountPercentage_QNAME, Double.class, Discounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "acumulativeWithOtherOffers", scope = Discounts.class)
    public JAXBElement<String> createDiscountsAcumulativeWithOtherOffers(String value) {
        return new JAXBElement<String>(_DiscountsAcumulativeWithOtherOffers_QNAME, String.class, Discounts.class, value);
    }

}
