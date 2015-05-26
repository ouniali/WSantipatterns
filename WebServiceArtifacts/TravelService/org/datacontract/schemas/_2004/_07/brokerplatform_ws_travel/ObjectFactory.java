
package org.datacontract.schemas._2004._07.brokerplatform_ws_travel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.brokerplatform_ws_travel package. 
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

    private final static QName _PlanCalatorieCreditEurope_QNAME = new QName("http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto", "PlanCalatorieCreditEurope");
    private final static QName _PlanCalatorieAllianz_QNAME = new QName("http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto", "PlanCalatorieAllianz");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.brokerplatform_ws_travel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCalatorieCreditEurope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto", name = "PlanCalatorieCreditEurope")
    public JAXBElement<PlanCalatorieCreditEurope> createPlanCalatorieCreditEurope(PlanCalatorieCreditEurope value) {
        return new JAXBElement<PlanCalatorieCreditEurope>(_PlanCalatorieCreditEurope_QNAME, PlanCalatorieCreditEurope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCalatorieAllianz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto", name = "PlanCalatorieAllianz")
    public JAXBElement<PlanCalatorieAllianz> createPlanCalatorieAllianz(PlanCalatorieAllianz value) {
        return new JAXBElement<PlanCalatorieAllianz>(_PlanCalatorieAllianz_QNAME, PlanCalatorieAllianz.class, null, value);
    }

}
