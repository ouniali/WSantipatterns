
package no.serverside.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.serverside.webservices package. 
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

    private final static QName _ArrayOfCurrencyItem_QNAME = new QName("http://webservices.serverside.no", "ArrayOfCurrencyItem");
    private final static QName _CurrencyItem_QNAME = new QName("http://webservices.serverside.no", "CurrencyItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.serverside.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfCurrencyItem }
     * 
     */
    public ArrayOfCurrencyItem createArrayOfCurrencyItem() {
        return new ArrayOfCurrencyItem();
    }

    /**
     * Create an instance of {@link CurrencyItem }
     * 
     */
    public CurrencyItem createCurrencyItem() {
        return new CurrencyItem();
    }

    /**
     * Create an instance of {@link GetCurrency }
     * 
     */
    public GetCurrency createGetCurrency() {
        return new GetCurrency();
    }

    /**
     * Create an instance of {@link GetCurrencyList }
     * 
     */
    public GetCurrencyList createGetCurrencyList() {
        return new GetCurrencyList();
    }

    /**
     * Create an instance of {@link GetCurrencyResponse }
     * 
     */
    public GetCurrencyResponse createGetCurrencyResponse() {
        return new GetCurrencyResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyListResponse }
     * 
     */
    public GetCurrencyListResponse createGetCurrencyListResponse() {
        return new GetCurrencyListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrencyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.serverside.no", name = "ArrayOfCurrencyItem")
    public JAXBElement<ArrayOfCurrencyItem> createArrayOfCurrencyItem(ArrayOfCurrencyItem value) {
        return new JAXBElement<ArrayOfCurrencyItem>(_ArrayOfCurrencyItem_QNAME, ArrayOfCurrencyItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.serverside.no", name = "CurrencyItem")
    public JAXBElement<CurrencyItem> createCurrencyItem(CurrencyItem value) {
        return new JAXBElement<CurrencyItem>(_CurrencyItem_QNAME, CurrencyItem.class, null, value);
    }

}
