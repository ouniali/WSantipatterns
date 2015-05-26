
package com.v3leisure.cabs.v3leisure_cabs_services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rq.CABSProductAvailabilityRQ;
import com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rs.CABSProductAvailabilityRS;
import com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rq.CABSProviderAvailabilityRQ;
import com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rs.CABSProviderAvailabilityRS;
import com.v3leisure.schemas.cabs._1_0.cabs_providercalendar.CABSProviderCalendarRQ;
import com.v3leisure.schemas.cabs._1_0.cabs_providercalendar_rs.CABSProviderCalendarRS;
import com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rq.CABSProviderOptInRQ;
import com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rs.CABSProviderOptInRS;
import com.v3leisure.schemas.cabs._1_0.cabs_providersearch_rq.CABSProviderSearchRQ;
import com.v3leisure.schemas.cabs._1_0.cabs_providersearch_rs.CABSProviderSearchRS;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchServiceSoap", targetNamespace = "http://www.v3leisure.com/CABS/V3Leisure.CABS.Services.WebServices")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.v3leisure.schemas.cabs._1_0.cabs_common.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rq.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rs.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rq.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rs.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_providercalendar.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_providercalendar_rs.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rq.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rs.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_providersearch_rq.ObjectFactory.class,
    com.v3leisure.schemas.cabs._1_0.cabs_providersearch_rs.ObjectFactory.class
})
public interface SearchServiceSoap {


    /**
     * 
     * @param cabsProviderOptInRequest
     * @return
     *     returns com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rs.CABSProviderOptInRS
     */
    @WebMethod(operationName = "ProviderOptIn", action = "http://www.v3leisure.com/CABS/V3Leisure.CABS.Services.WebServices/ProviderOptIn")
    @WebResult(name = "CABS_ProviderOptIn_RS", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderOptIn_RS.xsd", partName = "ProviderOptInResult")
    public CABSProviderOptInRS providerOptIn(
        @WebParam(name = "CABS_ProviderOptIn_RQ", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderOptIn_RQ.xsd", partName = "CABS_ProviderOptInRequest")
        CABSProviderOptInRQ cabsProviderOptInRequest);

    /**
     * 
     * @param request
     * @return
     *     returns com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rs.CABSProviderAvailabilityRS
     */
    @WebMethod(operationName = "ProviderAvailability", action = "http://www.v3leisure.com/CABS/V3Leisure.CABS.Services.WebServices/ProviderAvailability")
    @WebResult(name = "ProviderAvailabilityResult", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderAvailability_RS.xsd", partName = "ProviderAvailabilityResult")
    public CABSProviderAvailabilityRS providerAvailability(
        @WebParam(name = "CABS_ProviderAvailability_RQ", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderAvailability_RQ.xsd", partName = "request")
        CABSProviderAvailabilityRQ request);

    /**
     * 
     * @param request
     * @return
     *     returns com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rs.CABSProductAvailabilityRS
     */
    @WebMethod(operationName = "ProductAvailability", action = "http://www.v3leisure.com/CABS/V3Leisure.CABS.Services.WebServices/ProductAvailability")
    @WebResult(name = "CABS_ProductAvailability_RS", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProductAvailability_RS.xsd", partName = "ProductAvailabilityResult")
    public CABSProductAvailabilityRS productAvailability(
        @WebParam(name = "CABS_ProductAvailability_RQ", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProductAvailability_RQ.xsd", partName = "request")
        CABSProductAvailabilityRQ request);

    /**
     * 
     * @param request
     * @return
     *     returns com.v3leisure.schemas.cabs._1_0.cabs_providersearch_rs.CABSProviderSearchRS
     */
    @WebMethod(operationName = "ProviderSearch", action = "http://www.v3leisure.com/CABS/V3Leisure.CABS.Services.WebServices/ProviderSearch")
    @WebResult(name = "CABS_ProviderSearch_RS", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderSearch_RS.xsd", partName = "ProviderSearchResult")
    public CABSProviderSearchRS providerSearch(
        @WebParam(name = "CABS_ProviderSearch_RQ", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderSearch_RQ.xsd", partName = "request")
        CABSProviderSearchRQ request);

    /**
     * 
     * @param request
     * @return
     *     returns com.v3leisure.schemas.cabs._1_0.cabs_providercalendar_rs.CABSProviderCalendarRS
     */
    @WebMethod(operationName = "CalendarSearch", action = "http://www.v3leisure.com/CABS/V3Leisure.CABS.Services.WebServices/CalendarSearch")
    @WebResult(name = "CABS_ProviderCalendar_RS", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderCalendar_RS.xsd", partName = "CalendarSearchResult")
    public CABSProviderCalendarRS calendarSearch(
        @WebParam(name = "CABS_ProviderCalendar_RQ", targetNamespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderCalendar.xsd", partName = "request")
        CABSProviderCalendarRQ request);

}
