
package org.cuahsi.waterml._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.cuahsi.waterml._1 package. 
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

    private final static QName _VariablesResponse_QNAME = new QName("http://www.cuahsi.org/waterML/1.0/", "variablesResponse");
    private final static QName _SitesResponse_QNAME = new QName("http://www.cuahsi.org/waterML/1.0/", "sitesResponse");
    private final static QName _TimeSeriesResponse_QNAME = new QName("http://www.cuahsi.org/waterML/1.0/", "timeSeriesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.cuahsi.waterml._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataSetInfoType }
     * 
     */
    public DataSetInfoType createDataSetInfoType() {
        return new DataSetInfoType();
    }

    /**
     * Create an instance of {@link DataSetInfoType.TimeZoneInfo }
     * 
     */
    public DataSetInfoType.TimeZoneInfo createDataSetInfoTypeTimeZoneInfo() {
        return new DataSetInfoType.TimeZoneInfo();
    }

    /**
     * Create an instance of {@link VariableInfoType }
     * 
     */
    public VariableInfoType createVariableInfoType() {
        return new VariableInfoType();
    }

    /**
     * Create an instance of {@link VariableInfoType.Related }
     * 
     */
    public VariableInfoType.Related createVariableInfoTypeRelated() {
        return new VariableInfoType.Related();
    }

    /**
     * Create an instance of {@link TsValuesSingleVariableType }
     * 
     */
    public TsValuesSingleVariableType createTsValuesSingleVariableType() {
        return new TsValuesSingleVariableType();
    }

    /**
     * Create an instance of {@link QueryInfoType }
     * 
     */
    public QueryInfoType createQueryInfoType() {
        return new QueryInfoType();
    }

    /**
     * Create an instance of {@link QueryInfoType.Criteria }
     * 
     */
    public QueryInfoType.Criteria createQueryInfoTypeCriteria() {
        return new QueryInfoType.Criteria();
    }

    /**
     * Create an instance of {@link SiteInfoType }
     * 
     */
    public SiteInfoType createSiteInfoType() {
        return new SiteInfoType();
    }

    /**
     * Create an instance of {@link SiteInfoType.GeoLocation }
     * 
     */
    public SiteInfoType.GeoLocation createSiteInfoTypeGeoLocation() {
        return new SiteInfoType.GeoLocation();
    }

    /**
     * Create an instance of {@link SiteInfoType.GeoLocation.LocalSiteXY }
     * 
     */
    public SiteInfoType.GeoLocation.LocalSiteXY createSiteInfoTypeGeoLocationLocalSiteXY() {
        return new SiteInfoType.GeoLocation.LocalSiteXY();
    }

    /**
     * Create an instance of {@link SiteInfoType.TimeZoneInfo }
     * 
     */
    public SiteInfoType.TimeZoneInfo createSiteInfoTypeTimeZoneInfo() {
        return new SiteInfoType.TimeZoneInfo();
    }

    /**
     * Create an instance of {@link SeriesCatalogType }
     * 
     */
    public SeriesCatalogType createSeriesCatalogType() {
        return new SeriesCatalogType();
    }

    /**
     * Create an instance of {@link SeriesCatalogType.Series }
     * 
     */
    public SeriesCatalogType.Series createSeriesCatalogTypeSeries() {
        return new SeriesCatalogType.Series();
    }

    /**
     * Create an instance of {@link ArrayOfOption }
     * 
     */
    public ArrayOfOption createArrayOfOption() {
        return new ArrayOfOption();
    }

    /**
     * Create an instance of {@link SiteInfoResponseType }
     * 
     */
    public SiteInfoResponseType createSiteInfoResponseType() {
        return new SiteInfoResponseType();
    }

    /**
     * Create an instance of {@link VariablesResponseType }
     * 
     */
    public VariablesResponseType createVariablesResponseType() {
        return new VariablesResponseType();
    }

    /**
     * Create an instance of {@link TimeSeriesResponseType }
     * 
     */
    public TimeSeriesResponseType createTimeSeriesResponseType() {
        return new TimeSeriesResponseType();
    }

    /**
     * Create an instance of {@link TimeSingleType }
     * 
     */
    public TimeSingleType createTimeSingleType() {
        return new TimeSingleType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link QualityControlLevelType }
     * 
     */
    public QualityControlLevelType createQualityControlLevelType() {
        return new QualityControlLevelType();
    }

    /**
     * Create an instance of {@link LatLonPointType }
     * 
     */
    public LatLonPointType createLatLonPointType() {
        return new LatLonPointType();
    }

    /**
     * Create an instance of {@link TimePeriodRealTimeType }
     * 
     */
    public TimePeriodRealTimeType createTimePeriodRealTimeType() {
        return new TimePeriodRealTimeType();
    }

    /**
     * Create an instance of {@link MetaDataType }
     * 
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Create an instance of {@link ValueSingleVariable }
     * 
     */
    public ValueSingleVariable createValueSingleVariable() {
        return new ValueSingleVariable();
    }

    /**
     * Create an instance of {@link TimeIntervalType }
     * 
     */
    public TimeIntervalType createTimeIntervalType() {
        return new TimeIntervalType();
    }

    /**
     * Create an instance of {@link LatLonBoxType }
     * 
     */
    public LatLonBoxType createLatLonBoxType() {
        return new LatLonBoxType();
    }

    /**
     * Create an instance of {@link MethodType }
     * 
     */
    public MethodType createMethodType() {
        return new MethodType();
    }

    /**
     * Create an instance of {@link TimeSeriesType }
     * 
     */
    public TimeSeriesType createTimeSeriesType() {
        return new TimeSeriesType();
    }

    /**
     * Create an instance of {@link TimePeriodType }
     * 
     */
    public TimePeriodType createTimePeriodType() {
        return new TimePeriodType();
    }

    /**
     * Create an instance of {@link ArrayOfVariableInfoType }
     * 
     */
    public ArrayOfVariableInfoType createArrayOfVariableInfoType() {
        return new ArrayOfVariableInfoType();
    }

    /**
     * Create an instance of {@link GeogLocationType }
     * 
     */
    public GeogLocationType createGeogLocationType() {
        return new GeogLocationType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link UnitsType }
     * 
     */
    public UnitsType createUnitsType() {
        return new UnitsType();
    }

    /**
     * Create an instance of {@link SourceInfoType }
     * 
     */
    public SourceInfoType createSourceInfoType() {
        return new SourceInfoType();
    }

    /**
     * Create an instance of {@link DataSetInfoType.Note }
     * 
     */
    public DataSetInfoType.Note createDataSetInfoTypeNote() {
        return new DataSetInfoType.Note();
    }

    /**
     * Create an instance of {@link DataSetInfoType.TimeZoneInfo.DefaultTimeZone }
     * 
     */
    public DataSetInfoType.TimeZoneInfo.DefaultTimeZone createDataSetInfoTypeTimeZoneInfoDefaultTimeZone() {
        return new DataSetInfoType.TimeZoneInfo.DefaultTimeZone();
    }

    /**
     * Create an instance of {@link DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
     * 
     */
    public DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone createDataSetInfoTypeTimeZoneInfoDaylightSavingsTimeZone() {
        return new DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone();
    }

    /**
     * Create an instance of {@link VariableInfoType.VariableCode }
     * 
     */
    public VariableInfoType.VariableCode createVariableInfoTypeVariableCode() {
        return new VariableInfoType.VariableCode();
    }

    /**
     * Create an instance of {@link VariableInfoType.Units }
     * 
     */
    public VariableInfoType.Units createVariableInfoTypeUnits() {
        return new VariableInfoType.Units();
    }

    /**
     * Create an instance of {@link VariableInfoType.Note }
     * 
     */
    public VariableInfoType.Note createVariableInfoTypeNote() {
        return new VariableInfoType.Note();
    }

    /**
     * Create an instance of {@link VariableInfoType.TimeSupport }
     * 
     */
    public VariableInfoType.TimeSupport createVariableInfoTypeTimeSupport() {
        return new VariableInfoType.TimeSupport();
    }

    /**
     * Create an instance of {@link VariableInfoType.Related.ParentID }
     * 
     */
    public VariableInfoType.Related.ParentID createVariableInfoTypeRelatedParentID() {
        return new VariableInfoType.Related.ParentID();
    }

    /**
     * Create an instance of {@link VariableInfoType.Related.RelatedID }
     * 
     */
    public VariableInfoType.Related.RelatedID createVariableInfoTypeRelatedRelatedID() {
        return new VariableInfoType.Related.RelatedID();
    }

    /**
     * Create an instance of {@link TsValuesSingleVariableType.Qualifier }
     * 
     */
    public TsValuesSingleVariableType.Qualifier createTsValuesSingleVariableTypeQualifier() {
        return new TsValuesSingleVariableType.Qualifier();
    }

    /**
     * Create an instance of {@link TsValuesSingleVariableType.QualityControlLevel }
     * 
     */
    public TsValuesSingleVariableType.QualityControlLevel createTsValuesSingleVariableTypeQualityControlLevel() {
        return new TsValuesSingleVariableType.QualityControlLevel();
    }

    /**
     * Create an instance of {@link QueryInfoType.Note }
     * 
     */
    public QueryInfoType.Note createQueryInfoTypeNote() {
        return new QueryInfoType.Note();
    }

    /**
     * Create an instance of {@link QueryInfoType.Criteria.TimeParam }
     * 
     */
    public QueryInfoType.Criteria.TimeParam createQueryInfoTypeCriteriaTimeParam() {
        return new QueryInfoType.Criteria.TimeParam();
    }

    /**
     * Create an instance of {@link SiteInfoType.SiteCode }
     * 
     */
    public SiteInfoType.SiteCode createSiteInfoTypeSiteCode() {
        return new SiteInfoType.SiteCode();
    }

    /**
     * Create an instance of {@link SiteInfoType.Note }
     * 
     */
    public SiteInfoType.Note createSiteInfoTypeNote() {
        return new SiteInfoType.Note();
    }

    /**
     * Create an instance of {@link SiteInfoType.GeoLocation.LocalSiteXY.Note }
     * 
     */
    public SiteInfoType.GeoLocation.LocalSiteXY.Note createSiteInfoTypeGeoLocationLocalSiteXYNote() {
        return new SiteInfoType.GeoLocation.LocalSiteXY.Note();
    }

    /**
     * Create an instance of {@link SiteInfoType.TimeZoneInfo.DefaultTimeZone }
     * 
     */
    public SiteInfoType.TimeZoneInfo.DefaultTimeZone createSiteInfoTypeTimeZoneInfoDefaultTimeZone() {
        return new SiteInfoType.TimeZoneInfo.DefaultTimeZone();
    }

    /**
     * Create an instance of {@link SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
     * 
     */
    public SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone createSiteInfoTypeTimeZoneInfoDaylightSavingsTimeZone() {
        return new SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone();
    }

    /**
     * Create an instance of {@link SeriesCatalogType.Note }
     * 
     */
    public SeriesCatalogType.Note createSeriesCatalogTypeNote() {
        return new SeriesCatalogType.Note();
    }

    /**
     * Create an instance of {@link SeriesCatalogType.Series.ValueCount }
     * 
     */
    public SeriesCatalogType.Series.ValueCount createSeriesCatalogTypeSeriesValueCount() {
        return new SeriesCatalogType.Series.ValueCount();
    }

    /**
     * Create an instance of {@link ArrayOfOption.Option }
     * 
     */
    public ArrayOfOption.Option createArrayOfOptionOption() {
        return new ArrayOfOption.Option();
    }

    /**
     * Create an instance of {@link SiteInfoResponseType.Site }
     * 
     */
    public SiteInfoResponseType.Site createSiteInfoResponseTypeSite() {
        return new SiteInfoResponseType.Site();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariablesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.0/", name = "variablesResponse")
    public JAXBElement<VariablesResponseType> createVariablesResponse(VariablesResponseType value) {
        return new JAXBElement<VariablesResponseType>(_VariablesResponse_QNAME, VariablesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.0/", name = "sitesResponse")
    public JAXBElement<SiteInfoResponseType> createSitesResponse(SiteInfoResponseType value) {
        return new JAXBElement<SiteInfoResponseType>(_SitesResponse_QNAME, SiteInfoResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.0/", name = "timeSeriesResponse")
    public JAXBElement<TimeSeriesResponseType> createTimeSeriesResponse(TimeSeriesResponseType value) {
        return new JAXBElement<TimeSeriesResponseType>(_TimeSeriesResponse_QNAME, TimeSeriesResponseType.class, null, value);
    }

}
