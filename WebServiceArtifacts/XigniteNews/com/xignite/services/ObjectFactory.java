
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

    private final static QName _ArrayOfMarketNews_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfMarketNews");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _ArrayOfStockNews_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfStockNews");
    private final static QName _MarketNewsItem_QNAME = new QName("http://www.xignite.com/services/", "MarketNewsItem");
    private final static QName _ArrayOfBriefing_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfBriefing");
    private final static QName _ArrayOfEarningAnnouncement_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfEarningAnnouncement");
    private final static QName _Briefing_QNAME = new QName("http://www.xignite.com/services/", "Briefing");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfStockNews }
     * 
     */
    public ArrayOfStockNews createArrayOfStockNews() {
        return new ArrayOfStockNews();
    }

    /**
     * Create an instance of {@link MarketNewsItem }
     * 
     */
    public MarketNewsItem createMarketNewsItem() {
        return new MarketNewsItem();
    }

    /**
     * Create an instance of {@link Briefing }
     * 
     */
    public Briefing createBriefing() {
        return new Briefing();
    }

    /**
     * Create an instance of {@link ArrayOfBriefing }
     * 
     */
    public ArrayOfBriefing createArrayOfBriefing() {
        return new ArrayOfBriefing();
    }

    /**
     * Create an instance of {@link GetStockHeadlinesRange }
     * 
     */
    public GetStockHeadlinesRange createGetStockHeadlinesRange() {
        return new GetStockHeadlinesRange();
    }

    /**
     * Create an instance of {@link GetMarketNewsHeadlinesResponse }
     * 
     */
    public GetMarketNewsHeadlinesResponse createGetMarketNewsHeadlinesResponse() {
        return new GetMarketNewsHeadlinesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMarketNews }
     * 
     */
    public ArrayOfMarketNews createArrayOfMarketNews() {
        return new ArrayOfMarketNews();
    }

    /**
     * Create an instance of {@link GetReutersMarketNewsHeadlinesResponse }
     * 
     */
    public GetReutersMarketNewsHeadlinesResponse createGetReutersMarketNewsHeadlinesResponse() {
        return new GetReutersMarketNewsHeadlinesResponse();
    }

    /**
     * Create an instance of {@link GetReutersMarketNewsDetailsResponse }
     * 
     */
    public GetReutersMarketNewsDetailsResponse createGetReutersMarketNewsDetailsResponse() {
        return new GetReutersMarketNewsDetailsResponse();
    }

    /**
     * Create an instance of {@link GetStockHeadlinesResponse }
     * 
     */
    public GetStockHeadlinesResponse createGetStockHeadlinesResponse() {
        return new GetStockHeadlinesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEarningAnnouncement }
     * 
     */
    public ArrayOfEarningAnnouncement createArrayOfEarningAnnouncement() {
        return new ArrayOfEarningAnnouncement();
    }

    /**
     * Create an instance of {@link GetStockHeadlinesRangeResponse }
     * 
     */
    public GetStockHeadlinesRangeResponse createGetStockHeadlinesRangeResponse() {
        return new GetStockHeadlinesRangeResponse();
    }

    /**
     * Create an instance of {@link GetStockHeadlines }
     * 
     */
    public GetStockHeadlines createGetStockHeadlines() {
        return new GetStockHeadlines();
    }

    /**
     * Create an instance of {@link GetEarningAnnouncementsResponse }
     * 
     */
    public GetEarningAnnouncementsResponse createGetEarningAnnouncementsResponse() {
        return new GetEarningAnnouncementsResponse();
    }

    /**
     * Create an instance of {@link GetMarketNewsDetailsResponse }
     * 
     */
    public GetMarketNewsDetailsResponse createGetMarketNewsDetailsResponse() {
        return new GetMarketNewsDetailsResponse();
    }

    /**
     * Create an instance of {@link GetEarningAnnouncements }
     * 
     */
    public GetEarningAnnouncements createGetEarningAnnouncements() {
        return new GetEarningAnnouncements();
    }

    /**
     * Create an instance of {@link GetMarketNewsDetails }
     * 
     */
    public GetMarketNewsDetails createGetMarketNewsDetails() {
        return new GetMarketNewsDetails();
    }

    /**
     * Create an instance of {@link GetLastBriefing }
     * 
     */
    public GetLastBriefing createGetLastBriefing() {
        return new GetLastBriefing();
    }

    /**
     * Create an instance of {@link GetBriefingsResponse }
     * 
     */
    public GetBriefingsResponse createGetBriefingsResponse() {
        return new GetBriefingsResponse();
    }

    /**
     * Create an instance of {@link GetBriefings }
     * 
     */
    public GetBriefings createGetBriefings() {
        return new GetBriefings();
    }

    /**
     * Create an instance of {@link GetLastBriefingResponse }
     * 
     */
    public GetLastBriefingResponse createGetLastBriefingResponse() {
        return new GetLastBriefingResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetReutersMarketNewsHeadlines }
     * 
     */
    public GetReutersMarketNewsHeadlines createGetReutersMarketNewsHeadlines() {
        return new GetReutersMarketNewsHeadlines();
    }

    /**
     * Create an instance of {@link GetReutersMarketNewsDetails }
     * 
     */
    public GetReutersMarketNewsDetails createGetReutersMarketNewsDetails() {
        return new GetReutersMarketNewsDetails();
    }

    /**
     * Create an instance of {@link GetMarketNewsHeadlines }
     * 
     */
    public GetMarketNewsHeadlines createGetMarketNewsHeadlines() {
        return new GetMarketNewsHeadlines();
    }

    /**
     * Create an instance of {@link MarketNews }
     * 
     */
    public MarketNews createMarketNews() {
        return new MarketNews();
    }

    /**
     * Create an instance of {@link EarningAnnouncement }
     * 
     */
    public EarningAnnouncement createEarningAnnouncement() {
        return new EarningAnnouncement();
    }

    /**
     * Create an instance of {@link StockNews }
     * 
     */
    public StockNews createStockNews() {
        return new StockNews();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarketNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfMarketNews")
    public JAXBElement<ArrayOfMarketNews> createArrayOfMarketNews(ArrayOfMarketNews value) {
        return new JAXBElement<ArrayOfMarketNews>(_ArrayOfMarketNews_QNAME, ArrayOfMarketNews.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfStockNews")
    public JAXBElement<ArrayOfStockNews> createArrayOfStockNews(ArrayOfStockNews value) {
        return new JAXBElement<ArrayOfStockNews>(_ArrayOfStockNews_QNAME, ArrayOfStockNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketNewsItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MarketNewsItem")
    public JAXBElement<MarketNewsItem> createMarketNewsItem(MarketNewsItem value) {
        return new JAXBElement<MarketNewsItem>(_MarketNewsItem_QNAME, MarketNewsItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBriefing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfBriefing")
    public JAXBElement<ArrayOfBriefing> createArrayOfBriefing(ArrayOfBriefing value) {
        return new JAXBElement<ArrayOfBriefing>(_ArrayOfBriefing_QNAME, ArrayOfBriefing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarningAnnouncement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfEarningAnnouncement")
    public JAXBElement<ArrayOfEarningAnnouncement> createArrayOfEarningAnnouncement(ArrayOfEarningAnnouncement value) {
        return new JAXBElement<ArrayOfEarningAnnouncement>(_ArrayOfEarningAnnouncement_QNAME, ArrayOfEarningAnnouncement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Briefing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Briefing")
    public JAXBElement<Briefing> createBriefing(Briefing value) {
        return new JAXBElement<Briefing>(_Briefing_QNAME, Briefing.class, null, value);
    }

}
