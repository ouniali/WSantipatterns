
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.returnchangeoutboundticketsdata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.returnchangeoutboundticketsdata.xsd package. 
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

    private final static QName _ChangeOutboundTicketsDataTicket_QNAME = new QName("http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "ticket");
    private final static QName _ChangeOutboundTicketsDataProduct_QNAME = new QName("http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "product");
    private final static QName _ChangeOutboundTicketsDataSerieAdmon_QNAME = new QName("http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "serieAdmon");
    private final static QName _ChangeOutboundTicketsDataCompany_QNAME = new QName("http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", "company");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.returnchangeoutboundticketsdata.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeOutboundTicketsData }
     * 
     */
    public ChangeOutboundTicketsData createChangeOutboundTicketsData() {
        return new ChangeOutboundTicketsData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "ticket", scope = ChangeOutboundTicketsData.class)
    public JAXBElement<String> createChangeOutboundTicketsDataTicket(String value) {
        return new JAXBElement<String>(_ChangeOutboundTicketsDataTicket_QNAME, String.class, ChangeOutboundTicketsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "product", scope = ChangeOutboundTicketsData.class)
    public JAXBElement<String> createChangeOutboundTicketsDataProduct(String value) {
        return new JAXBElement<String>(_ChangeOutboundTicketsDataProduct_QNAME, String.class, ChangeOutboundTicketsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "serieAdmon", scope = ChangeOutboundTicketsData.class)
    public JAXBElement<String> createChangeOutboundTicketsDataSerieAdmon(String value) {
        return new JAXBElement<String>(_ChangeOutboundTicketsDataSerieAdmon_QNAME, String.class, ChangeOutboundTicketsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", name = "company", scope = ChangeOutboundTicketsData.class)
    public JAXBElement<String> createChangeOutboundTicketsDataCompany(String value) {
        return new JAXBElement<String>(_ChangeOutboundTicketsDataCompany_QNAME, String.class, ChangeOutboundTicketsData.class, value);
    }

}
