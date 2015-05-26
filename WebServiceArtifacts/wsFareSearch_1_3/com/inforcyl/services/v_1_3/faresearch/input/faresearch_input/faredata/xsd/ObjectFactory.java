
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.xsd package. 
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

    private final static QName _TravellerDataPromotionCode_QNAME = new QName("http://faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "promotionCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.xsd
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "promotionCode", scope = TravellerData.class)
    public JAXBElement<String> createTravellerDataPromotionCode(String value) {
        return new JAXBElement<String>(_TravellerDataPromotionCode_QNAME, String.class, TravellerData.class, value);
    }

}
