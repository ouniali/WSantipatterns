
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.travellerdata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.travellerdata.xsd package. 
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

    private final static QName _DetailsDiscountPercentage_QNAME = new QName("http://travellerdata.faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "discountPercentage");
    private final static QName _DetailsDiscountAmount_QNAME = new QName("http://travellerdata.faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "discountAmount");
    private final static QName _DetailsDiscountType_QNAME = new QName("http://travellerdata.faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "discountType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.travellerdata.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountPercentage", scope = Details.class)
    public JAXBElement<Double> createDetailsDiscountPercentage(Double value) {
        return new JAXBElement<Double>(_DetailsDiscountPercentage_QNAME, Double.class, Details.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountAmount", scope = Details.class)
    public JAXBElement<Double> createDetailsDiscountAmount(Double value) {
        return new JAXBElement<Double>(_DetailsDiscountAmount_QNAME, Double.class, Details.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travellerdata.faredata.types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "discountType", scope = Details.class)
    public JAXBElement<String> createDetailsDiscountType(String value) {
        return new JAXBElement<String>(_DetailsDiscountType_QNAME, String.class, Details.class, value);
    }

}
