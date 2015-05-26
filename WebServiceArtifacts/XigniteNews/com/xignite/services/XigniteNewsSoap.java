
package com.xignite.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "XigniteNewsSoap", targetNamespace = "http://www.xignite.com/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface XigniteNewsSoap {


    /**
     * Get headlines with the given date range for a list of US Domestic equities.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @param date
     * @param startTime
     * @param endTime
     * @return
     *     returns com.xignite.services.ArrayOfStockNews
     */
    @WebMethod(operationName = "GetStockHeadlinesRange", action = "http://www.xignite.com/services/GetStockHeadlinesRange")
    @WebResult(name = "GetStockHeadlinesRangeResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetStockHeadlinesRange", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetStockHeadlinesRange")
    @ResponseWrapper(localName = "GetStockHeadlinesRangeResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetStockHeadlinesRangeResponse")
    public ArrayOfStockNews getStockHeadlinesRange(
        @WebParam(name = "Date", targetNamespace = "http://www.xignite.com/services/")
        String date,
        @WebParam(name = "StartTime", targetNamespace = "http://www.xignite.com/services/")
        String startTime,
        @WebParam(name = "EndTime", targetNamespace = "http://www.xignite.com/services/")
        String endTime);

    /**
     * Get market briefings from Briefing.Com.
     * 
     * @return
     *     returns com.xignite.services.ArrayOfBriefing
     */
    @WebMethod(operationName = "GetBriefings", action = "http://www.xignite.com/services/GetBriefings")
    @WebResult(name = "GetBriefingsResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetBriefings", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetBriefings")
    @ResponseWrapper(localName = "GetBriefingsResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetBriefingsResponse")
    public ArrayOfBriefing getBriefings();

    /**
     * Get last market briefing from Briefing.Com.
     * 
     * @return
     *     returns com.xignite.services.Briefing
     */
    @WebMethod(operationName = "GetLastBriefing", action = "http://www.xignite.com/services/GetLastBriefing")
    @WebResult(name = "GetLastBriefingResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetLastBriefing", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetLastBriefing")
    @ResponseWrapper(localName = "GetLastBriefingResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetLastBriefingResponse")
    public Briefing getLastBriefing();

    /**
     * <br>Get most recent market news headlines.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @return
     *     returns com.xignite.services.ArrayOfMarketNews
     */
    @WebMethod(operationName = "GetMarketNewsHeadlines", action = "http://www.xignite.com/services/GetMarketNewsHeadlines")
    @WebResult(name = "GetMarketNewsHeadlinesResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetMarketNewsHeadlines", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetMarketNewsHeadlines")
    @ResponseWrapper(localName = "GetMarketNewsHeadlinesResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetMarketNewsHeadlinesResponse")
    public ArrayOfMarketNews getMarketNewsHeadlines();

    /**
     * <br>Get most recent market news headlines from Reuters and other sources.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @return
     *     returns com.xignite.services.ArrayOfMarketNews
     */
    @WebMethod(operationName = "GetReutersMarketNewsHeadlines", action = "http://www.xignite.com/services/GetReutersMarketNewsHeadlines")
    @WebResult(name = "GetReutersMarketNewsHeadlinesResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetReutersMarketNewsHeadlines", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetReutersMarketNewsHeadlines")
    @ResponseWrapper(localName = "GetReutersMarketNewsHeadlinesResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetReutersMarketNewsHeadlinesResponse")
    public ArrayOfMarketNews getReutersMarketNewsHeadlines();

    /**
     * <br>Get the content of a market news item based on the reference provided in GetMarketNewsHeadlines.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @param reference
     * @return
     *     returns com.xignite.services.MarketNewsItem
     */
    @WebMethod(operationName = "GetMarketNewsDetails", action = "http://www.xignite.com/services/GetMarketNewsDetails")
    @WebResult(name = "GetMarketNewsDetailsResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetMarketNewsDetails", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetMarketNewsDetails")
    @ResponseWrapper(localName = "GetMarketNewsDetailsResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetMarketNewsDetailsResponse")
    public MarketNewsItem getMarketNewsDetails(
        @WebParam(name = "Reference", targetNamespace = "http://www.xignite.com/services/")
        String reference);

    /**
     * <br>Get the content of a market news item from Reuters and other sources based on the reference provided in GetReutersMarketNewsHeadlines.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @param reference
     * @return
     *     returns com.xignite.services.MarketNewsItem
     */
    @WebMethod(operationName = "GetReutersMarketNewsDetails", action = "http://www.xignite.com/services/GetReutersMarketNewsDetails")
    @WebResult(name = "GetReutersMarketNewsDetailsResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetReutersMarketNewsDetails", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetReutersMarketNewsDetails")
    @ResponseWrapper(localName = "GetReutersMarketNewsDetailsResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetReutersMarketNewsDetailsResponse")
    public MarketNewsItem getReutersMarketNewsDetails(
        @WebParam(name = "Reference", targetNamespace = "http://www.xignite.com/services/")
        String reference);

    /**
     * Get headlines for a list of US Domestic equities.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @param headlineCount
     * @param symbols
     * @return
     *     returns com.xignite.services.ArrayOfStockNews
     */
    @WebMethod(operationName = "GetStockHeadlines", action = "http://www.xignite.com/services/GetStockHeadlines")
    @WebResult(name = "GetStockHeadlinesResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetStockHeadlines", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetStockHeadlines")
    @ResponseWrapper(localName = "GetStockHeadlinesResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetStockHeadlinesResponse")
    public ArrayOfStockNews getStockHeadlines(
        @WebParam(name = "Symbols", targetNamespace = "http://www.xignite.com/services/")
        String symbols,
        @WebParam(name = "HeadlineCount", targetNamespace = "http://www.xignite.com/services/")
        int headlineCount);

    /**
     * Get earning announcement summary for the previous and next few days.&#183; Source: <b>Yahoo! Finance</b>. Also subject to their Terms of Use.<br>
     * 
     * @param announcementDate
     * @return
     *     returns com.xignite.services.ArrayOfEarningAnnouncement
     */
    @WebMethod(operationName = "GetEarningAnnouncements", action = "http://www.xignite.com/services/GetEarningAnnouncements")
    @WebResult(name = "GetEarningAnnouncementsResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEarningAnnouncements", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEarningAnnouncements")
    @ResponseWrapper(localName = "GetEarningAnnouncementsResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEarningAnnouncementsResponse")
    public ArrayOfEarningAnnouncement getEarningAnnouncements(
        @WebParam(name = "AnnouncementDate", targetNamespace = "http://www.xignite.com/services/")
        String announcementDate);

}
