
package com.xignite.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xignite.services package. 
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

    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _LastSaleQuote_QNAME = new QName("http://www.xignite.com/services/", "LastSaleQuote");
    private final static QName _SymbolList_QNAME = new QName("http://www.xignite.com/services/", "SymbolList");
    private final static QName _ArrayOfLastSaleQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfLastSaleQuote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListTradedSymbolsResponse }
     * 
     */
    public ListTradedSymbolsResponse createListTradedSymbolsResponse() {
        return new ListTradedSymbolsResponse();
    }

    /**
     * Create an instance of {@link SymbolList }
     * 
     */
    public SymbolList createSymbolList() {
        return new SymbolList();
    }

    /**
     * Create an instance of {@link GetLastSalesResponse }
     * 
     */
    public GetLastSalesResponse createGetLastSalesResponse() {
        return new GetLastSalesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLastSaleQuote }
     * 
     */
    public ArrayOfLastSaleQuote createArrayOfLastSaleQuote() {
        return new ArrayOfLastSaleQuote();
    }

    /**
     * Create an instance of {@link GetLastSales }
     * 
     */
    public GetLastSales createGetLastSales() {
        return new GetLastSales();
    }

    /**
     * Create an instance of {@link GetLastSaleByIdentifierResponse }
     * 
     */
    public GetLastSaleByIdentifierResponse createGetLastSaleByIdentifierResponse() {
        return new GetLastSaleByIdentifierResponse();
    }

    /**
     * Create an instance of {@link LastSaleQuote }
     * 
     */
    public LastSaleQuote createLastSaleQuote() {
        return new LastSaleQuote();
    }

    /**
     * Create an instance of {@link GetLastSaleByIdentifier }
     * 
     */
    public GetLastSaleByIdentifier createGetLastSaleByIdentifier() {
        return new GetLastSaleByIdentifier();
    }

    /**
     * Create an instance of {@link GetLastSaleResponse }
     * 
     */
    public GetLastSaleResponse createGetLastSaleResponse() {
        return new GetLastSaleResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetLastSale }
     * 
     */
    public GetLastSale createGetLastSale() {
        return new GetLastSale();
    }

    /**
     * Create an instance of {@link GetLastSaleByIdentifiers }
     * 
     */
    public GetLastSaleByIdentifiers createGetLastSaleByIdentifiers() {
        return new GetLastSaleByIdentifiers();
    }

    /**
     * Create an instance of {@link GetLastSaleByIdentifiersResponse }
     * 
     */
    public GetLastSaleByIdentifiersResponse createGetLastSaleByIdentifiersResponse() {
        return new GetLastSaleByIdentifiersResponse();
    }

    /**
     * Create an instance of {@link ListTradedSymbols }
     * 
     */
    public ListTradedSymbols createListTradedSymbols() {
        return new ListTradedSymbols();
    }

    /**
     * Create an instance of {@link ArrayOfSymbolInfo }
     * 
     */
    public ArrayOfSymbolInfo createArrayOfSymbolInfo() {
        return new ArrayOfSymbolInfo();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link SymbolInfo }
     * 
     */
    public SymbolInfo createSymbolInfo() {
        return new SymbolInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastSaleQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "LastSaleQuote")
    public JAXBElement<LastSaleQuote> createLastSaleQuote(LastSaleQuote value) {
        return new JAXBElement<LastSaleQuote>(_LastSaleQuote_QNAME, LastSaleQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SymbolList")
    public JAXBElement<SymbolList> createSymbolList(SymbolList value) {
        return new JAXBElement<SymbolList>(_SymbolList_QNAME, SymbolList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLastSaleQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfLastSaleQuote")
    public JAXBElement<ArrayOfLastSaleQuote> createArrayOfLastSaleQuote(ArrayOfLastSaleQuote value) {
        return new JAXBElement<ArrayOfLastSaleQuote>(_ArrayOfLastSaleQuote_QNAME, ArrayOfLastSaleQuote.class, null, value);
    }

}
