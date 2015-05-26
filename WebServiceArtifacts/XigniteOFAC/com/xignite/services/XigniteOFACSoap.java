
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
@WebService(name = "XigniteOFACSoap", targetNamespace = "http://www.xignite.com/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface XigniteOFACSoap {


    /**
     * Returns a list of valid search criteria.
     * 
     * @param criteriaType
     * @return
     *     returns com.xignite.services.Criteria
     */
    @WebMethod(operationName = "GetCriteria", action = "http://www.xignite.com/services/GetCriteria")
    @WebResult(name = "GetCriteriaResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetCriteria", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetCriteria")
    @ResponseWrapper(localName = "GetCriteriaResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetCriteriaResponse")
    public Criteria getCriteria(
        @WebParam(name = "CriteriaType", targetNamespace = "http://www.xignite.com/services/")
        CriteriaTypes criteriaType);

    /**
     * Search the OFAC database by name.
     * 
     * @param searchType
     * @param name
     * @param type
     * @return
     *     returns com.xignite.services.SearchResults
     */
    @WebMethod(operationName = "SearchByName", action = "http://www.xignite.com/services/SearchByName")
    @WebResult(name = "SearchByNameResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "SearchByName", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchByName")
    @ResponseWrapper(localName = "SearchByNameResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchByNameResponse")
    public SearchResults searchByName(
        @WebParam(name = "Name", targetNamespace = "http://www.xignite.com/services/")
        String name,
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OFACTypes type,
        @WebParam(name = "SearchType", targetNamespace = "http://www.xignite.com/services/")
        SearchTypes searchType);

    /**
     * Search the OFAC database by name.
     * 
     * @param searchType
     * @param name
     * @return
     *     returns com.xignite.services.SearchResults
     */
    @WebMethod(operationName = "SearchOrganization", action = "http://www.xignite.com/services/SearchOrganization")
    @WebResult(name = "SearchOrganizationResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "SearchOrganization", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchOrganization")
    @ResponseWrapper(localName = "SearchOrganizationResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchOrganizationResponse")
    public SearchResults searchOrganization(
        @WebParam(name = "Name", targetNamespace = "http://www.xignite.com/services/")
        String name,
        @WebParam(name = "SearchType", targetNamespace = "http://www.xignite.com/services/")
        SearchTypes searchType);

    /**
     * Search the OFAC database by name.
     * 
     * @param searchType
     * @param name
     * @return
     *     returns com.xignite.services.SearchResults
     */
    @WebMethod(operationName = "SearchIndividual", action = "http://www.xignite.com/services/SearchIndividual")
    @WebResult(name = "SearchIndividualResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "SearchIndividual", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchIndividual")
    @ResponseWrapper(localName = "SearchIndividualResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchIndividualResponse")
    public SearchResults searchIndividual(
        @WebParam(name = "Name", targetNamespace = "http://www.xignite.com/services/")
        String name,
        @WebParam(name = "SearchType", targetNamespace = "http://www.xignite.com/services/")
        SearchTypes searchType);

    /**
     * Search the OFAC database for a vessel.
     * 
     * @param searchType
     * @param name
     * @return
     *     returns com.xignite.services.SearchResults
     */
    @WebMethod(operationName = "SearchVessel", action = "http://www.xignite.com/services/SearchVessel")
    @WebResult(name = "SearchVesselResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "SearchVessel", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchVessel")
    @ResponseWrapper(localName = "SearchVesselResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchVesselResponse")
    public SearchResults searchVessel(
        @WebParam(name = "Name", targetNamespace = "http://www.xignite.com/services/")
        String name,
        @WebParam(name = "SearchType", targetNamespace = "http://www.xignite.com/services/")
        SearchTypes searchType);

    /**
     * Search the OFAC database by address.
     * 
     * @param country
     * @param address
     * @param city
     * @param searchType
     * @param type
     * @return
     *     returns com.xignite.services.SearchResults
     */
    @WebMethod(operationName = "SearchByAddress", action = "http://www.xignite.com/services/SearchByAddress")
    @WebResult(name = "SearchByAddressResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "SearchByAddress", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchByAddress")
    @ResponseWrapper(localName = "SearchByAddressResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchByAddressResponse")
    public SearchResults searchByAddress(
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OFACTypes type,
        @WebParam(name = "Address", targetNamespace = "http://www.xignite.com/services/")
        String address,
        @WebParam(name = "City", targetNamespace = "http://www.xignite.com/services/")
        String city,
        @WebParam(name = "Country", targetNamespace = "http://www.xignite.com/services/")
        String country,
        @WebParam(name = "SearchType", targetNamespace = "http://www.xignite.com/services/")
        SearchTypes searchType);

    /**
     * Search the OFAC database.
     * 
     * @param country
     * @param address
     * @param city
     * @param searchType
     * @param name
     * @param title
     * @param type
     * @return
     *     returns com.xignite.services.SearchResults
     */
    @WebMethod(operationName = "Search", action = "http://www.xignite.com/services/Search")
    @WebResult(name = "SearchResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "Search", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.Search")
    @ResponseWrapper(localName = "SearchResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchResponse")
    public SearchResults search(
        @WebParam(name = "Name", targetNamespace = "http://www.xignite.com/services/")
        String name,
        @WebParam(name = "Title", targetNamespace = "http://www.xignite.com/services/")
        String title,
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OFACTypes type,
        @WebParam(name = "Address", targetNamespace = "http://www.xignite.com/services/")
        String address,
        @WebParam(name = "City", targetNamespace = "http://www.xignite.com/services/")
        String city,
        @WebParam(name = "Country", targetNamespace = "http://www.xignite.com/services/")
        String country,
        @WebParam(name = "SearchType", targetNamespace = "http://www.xignite.com/services/")
        SearchTypes searchType);

}
