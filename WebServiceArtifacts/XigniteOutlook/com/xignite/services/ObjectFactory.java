
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
    private final static QName _TimeValue_QNAME = new QName("http://www.xignite.com/services/", "TimeValue");
    private final static QName _ArrayOfOutlook_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfOutlook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLatestUpdateTimeStamp }
     * 
     */
    public GetLatestUpdateTimeStamp createGetLatestUpdateTimeStamp() {
        return new GetLatestUpdateTimeStamp();
    }

    /**
     * Create an instance of {@link GetTomorrowsOutlook }
     * 
     */
    public GetTomorrowsOutlook createGetTomorrowsOutlook() {
        return new GetTomorrowsOutlook();
    }

    /**
     * Create an instance of {@link GetOutlookForRangeLengthForward }
     * 
     */
    public GetOutlookForRangeLengthForward createGetOutlookForRangeLengthForward() {
        return new GetOutlookForRangeLengthForward();
    }

    /**
     * Create an instance of {@link GetLatestUpdateTimeStampResponse }
     * 
     */
    public GetLatestUpdateTimeStampResponse createGetLatestUpdateTimeStampResponse() {
        return new GetLatestUpdateTimeStampResponse();
    }

    /**
     * Create an instance of {@link TimeValue }
     * 
     */
    public TimeValue createTimeValue() {
        return new TimeValue();
    }

    /**
     * Create an instance of {@link GetOutlookForWeekResponse }
     * 
     */
    public GetOutlookForWeekResponse createGetOutlookForWeekResponse() {
        return new GetOutlookForWeekResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOutlook }
     * 
     */
    public ArrayOfOutlook createArrayOfOutlook() {
        return new ArrayOfOutlook();
    }

    /**
     * Create an instance of {@link GetOutlookForDate }
     * 
     */
    public GetOutlookForDate createGetOutlookForDate() {
        return new GetOutlookForDate();
    }

    /**
     * Create an instance of {@link GetOutlookForRangeResponse }
     * 
     */
    public GetOutlookForRangeResponse createGetOutlookForRangeResponse() {
        return new GetOutlookForRangeResponse();
    }

    /**
     * Create an instance of {@link GetTodaysOutlookResponse }
     * 
     */
    public GetTodaysOutlookResponse createGetTodaysOutlookResponse() {
        return new GetTodaysOutlookResponse();
    }

    /**
     * Create an instance of {@link GetYesterdaysOutlookResponse }
     * 
     */
    public GetYesterdaysOutlookResponse createGetYesterdaysOutlookResponse() {
        return new GetYesterdaysOutlookResponse();
    }

    /**
     * Create an instance of {@link GetOutlookForDateResponse }
     * 
     */
    public GetOutlookForDateResponse createGetOutlookForDateResponse() {
        return new GetOutlookForDateResponse();
    }

    /**
     * Create an instance of {@link GetOutlookForRangeLengthBackwardResponse }
     * 
     */
    public GetOutlookForRangeLengthBackwardResponse createGetOutlookForRangeLengthBackwardResponse() {
        return new GetOutlookForRangeLengthBackwardResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetOutlookForWeek }
     * 
     */
    public GetOutlookForWeek createGetOutlookForWeek() {
        return new GetOutlookForWeek();
    }

    /**
     * Create an instance of {@link GetTomorrowsOutlookResponse }
     * 
     */
    public GetTomorrowsOutlookResponse createGetTomorrowsOutlookResponse() {
        return new GetTomorrowsOutlookResponse();
    }

    /**
     * Create an instance of {@link GetOutlookForRangeLengthBackward }
     * 
     */
    public GetOutlookForRangeLengthBackward createGetOutlookForRangeLengthBackward() {
        return new GetOutlookForRangeLengthBackward();
    }

    /**
     * Create an instance of {@link GetOutlookForRangeLengthForwardResponse }
     * 
     */
    public GetOutlookForRangeLengthForwardResponse createGetOutlookForRangeLengthForwardResponse() {
        return new GetOutlookForRangeLengthForwardResponse();
    }

    /**
     * Create an instance of {@link GetYesterdaysOutlook }
     * 
     */
    public GetYesterdaysOutlook createGetYesterdaysOutlook() {
        return new GetYesterdaysOutlook();
    }

    /**
     * Create an instance of {@link GetOutlookForRange }
     * 
     */
    public GetOutlookForRange createGetOutlookForRange() {
        return new GetOutlookForRange();
    }

    /**
     * Create an instance of {@link GetOutlookForMonth }
     * 
     */
    public GetOutlookForMonth createGetOutlookForMonth() {
        return new GetOutlookForMonth();
    }

    /**
     * Create an instance of {@link GetTodaysOutlook }
     * 
     */
    public GetTodaysOutlook createGetTodaysOutlook() {
        return new GetTodaysOutlook();
    }

    /**
     * Create an instance of {@link GetOutlookForMonthResponse }
     * 
     */
    public GetOutlookForMonthResponse createGetOutlookForMonthResponse() {
        return new GetOutlookForMonthResponse();
    }

    /**
     * Create an instance of {@link Outlook }
     * 
     */
    public Outlook createOutlook() {
        return new Outlook();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "TimeValue")
    public JAXBElement<TimeValue> createTimeValue(TimeValue value) {
        return new JAXBElement<TimeValue>(_TimeValue_QNAME, TimeValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOutlook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfOutlook")
    public JAXBElement<ArrayOfOutlook> createArrayOfOutlook(ArrayOfOutlook value) {
        return new JAXBElement<ArrayOfOutlook>(_ArrayOfOutlook_QNAME, ArrayOfOutlook.class, null, value);
    }

}
