
package com.bvdep.vlbapi;

import java.util.List;
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
@WebService(name = "VlbNewOnlineApiSoap", targetNamespace = "http://vlbapi.bvdep.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VlbNewOnlineApiSoap {


    /**
     * 
     * @param password
     * @param login
     * @return
     *     returns com.bvdep.vlbapi.LoginInfo
     */
    @WebMethod(operationName = "LogIn", action = "http://vlbapi.bvdep.com/LogIn")
    @WebResult(name = "LogInResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "LogIn", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.LogIn")
    @ResponseWrapper(localName = "LogInResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.LogInResponse")
    public LoginInfo logIn(
        @WebParam(name = "Login", targetNamespace = "http://vlbapi.bvdep.com/")
        String login,
        @WebParam(name = "Password", targetNamespace = "http://vlbapi.bvdep.com/")
        String password);

    /**
     * 
     * @param loginInfo
     * @return
     *     returns com.bvdep.vlbapi.LoginInfo
     */
    @WebMethod(operationName = "LogOut", action = "http://vlbapi.bvdep.com/LogOut")
    @WebResult(name = "LogOutResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "LogOut", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.LogOut")
    @ResponseWrapper(localName = "LogOutResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.LogOutResponse")
    public LoginInfo logOut(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo);

    /**
     * 
     * @param loginInfo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Version", action = "http://vlbapi.bvdep.com/Version")
    @WebResult(name = "VersionResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "Version", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.Version")
    @ResponseWrapper(localName = "VersionResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.VersionResponse")
    public String version(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo);

    /**
     * 
     * @param dtFrom
     * @param dtTo
     * @param loginInfo
     * @param query
     * @param mediaType
     * @param dataBaseMask
     * @return
     *     returns com.bvdep.vlbapi.SearchInfo
     */
    @WebMethod(operationName = "QuickSearchFilter", action = "http://vlbapi.bvdep.com/QuickSearchFilter")
    @WebResult(name = "QuickSearchFilterResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "QuickSearchFilter", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.QuickSearchFilter")
    @ResponseWrapper(localName = "QuickSearchFilterResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.QuickSearchFilterResponse")
    public SearchInfo quickSearchFilter(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Query", targetNamespace = "http://vlbapi.bvdep.com/")
        String query,
        @WebParam(name = "DataBaseMask", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> dataBaseMask,
        @WebParam(name = "DtFrom", targetNamespace = "http://vlbapi.bvdep.com/")
        String dtFrom,
        @WebParam(name = "DtTo", targetNamespace = "http://vlbapi.bvdep.com/")
        String dtTo,
        @WebParam(name = "MediaType", targetNamespace = "http://vlbapi.bvdep.com/")
        String mediaType);

    /**
     * 
     * @param dtFrom
     * @param eProductType
     * @param dtTo
     * @param loginInfo
     * @param query
     * @param mediaType
     * @param dataBaseMask
     * @return
     *     returns com.bvdep.vlbapi.SearchInfo
     */
    @WebMethod(operationName = "QuickSearchFilter2", action = "http://vlbapi.bvdep.com/QuickSearchFilter2")
    @WebResult(name = "QuickSearchFilter2Result", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "QuickSearchFilter2", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.QuickSearchFilter2")
    @ResponseWrapper(localName = "QuickSearchFilter2Response", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.QuickSearchFilter2Response")
    public SearchInfo quickSearchFilter2(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Query", targetNamespace = "http://vlbapi.bvdep.com/")
        String query,
        @WebParam(name = "DataBaseMask", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> dataBaseMask,
        @WebParam(name = "DtFrom", targetNamespace = "http://vlbapi.bvdep.com/")
        String dtFrom,
        @WebParam(name = "DtTo", targetNamespace = "http://vlbapi.bvdep.com/")
        String dtTo,
        @WebParam(name = "MediaType", targetNamespace = "http://vlbapi.bvdep.com/")
        String mediaType,
        @WebParam(name = "eProductType", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> eProductType);

    /**
     * 
     * @param loginInfo
     * @param query
     * @param dataBaseMask
     * @return
     *     returns com.bvdep.vlbapi.SearchInfo
     */
    @WebMethod(operationName = "QuickSearch", action = "http://vlbapi.bvdep.com/QuickSearch")
    @WebResult(name = "QuickSearchResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "QuickSearch", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.QuickSearch")
    @ResponseWrapper(localName = "QuickSearchResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.QuickSearchResponse")
    public SearchInfo quickSearch(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Query", targetNamespace = "http://vlbapi.bvdep.com/")
        String query,
        @WebParam(name = "DataBaseMask", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> dataBaseMask);

    /**
     * 
     * @param loginInfo
     * @param query
     * @param dataBaseMask
     * @return
     *     returns com.bvdep.vlbapi.SearchInfo
     */
    @WebMethod(operationName = "BooleanSearch", action = "http://vlbapi.bvdep.com/BooleanSearch")
    @WebResult(name = "BooleanSearchResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "BooleanSearch", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.BooleanSearch")
    @ResponseWrapper(localName = "BooleanSearchResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.BooleanSearchResponse")
    public SearchInfo booleanSearch(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Query", targetNamespace = "http://vlbapi.bvdep.com/")
        String query,
        @WebParam(name = "DataBaseMask", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> dataBaseMask);

    /**
     * 
     * @param hierarchyId
     * @param loginInfo
     * @return
     *     returns com.bvdep.vlbapi.SearchInfo
     */
    @WebMethod(operationName = "GetHierarchy", action = "http://vlbapi.bvdep.com/GetHierarchy")
    @WebResult(name = "GetHierarchyResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetHierarchy", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetHierarchy")
    @ResponseWrapper(localName = "GetHierarchyResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetHierarchyResponse")
    public SearchInfo getHierarchy(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "HierarchyId", targetNamespace = "http://vlbapi.bvdep.com/")
        String hierarchyId);

    /**
     * 
     * @param loginInfo
     * @param serieId
     * @return
     *     returns com.bvdep.vlbapi.SearchInfo
     */
    @WebMethod(operationName = "GetSeries", action = "http://vlbapi.bvdep.com/GetSeries")
    @WebResult(name = "GetSeriesResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetSeries", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetSeries")
    @ResponseWrapper(localName = "GetSeriesResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetSeriesResponse")
    public SearchInfo getSeries(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "SerieId", targetNamespace = "http://vlbapi.bvdep.com/")
        String serieId);

    /**
     * 
     * @param selectedDatabase
     * @param dtFrom
     * @param startIndex
     * @param oLoginInfo
     * @param eProductType
     * @param dtTo
     * @param oSortInfo
     * @param databaseMask
     * @param length
     * @param strQuery
     * @param mediaType
     * @param oLayout
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SearchAndGetResult", action = "http://vlbapi.bvdep.com/SearchAndGetResult")
    @WebResult(name = "SearchAndGetResultResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "SearchAndGetResult", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.SearchAndGetResult")
    @ResponseWrapper(localName = "SearchAndGetResultResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.SearchAndGetResultResponse")
    public String searchAndGetResult(
        @WebParam(name = "oLoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo oLoginInfo,
        @WebParam(name = "strQuery", targetNamespace = "http://vlbapi.bvdep.com/")
        String strQuery,
        @WebParam(name = "DatabaseMask", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> databaseMask,
        @WebParam(name = "SelectedDatabase", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> selectedDatabase,
        @WebParam(name = "DtFrom", targetNamespace = "http://vlbapi.bvdep.com/")
        String dtFrom,
        @WebParam(name = "DtTo", targetNamespace = "http://vlbapi.bvdep.com/")
        String dtTo,
        @WebParam(name = "MediaType", targetNamespace = "http://vlbapi.bvdep.com/")
        String mediaType,
        @WebParam(name = "StartIndex", targetNamespace = "http://vlbapi.bvdep.com/")
        int startIndex,
        @WebParam(name = "Length", targetNamespace = "http://vlbapi.bvdep.com/")
        int length,
        @WebParam(name = "oLayout", targetNamespace = "http://vlbapi.bvdep.com/")
        Layout oLayout,
        @WebParam(name = "oSortInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        SortInfo oSortInfo,
        @WebParam(name = "eProductType", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> eProductType);

    /**
     * 
     * @param selectedDatabase
     * @param layout
     * @param startIndex
     * @param searchId
     * @param oSortInfo
     * @param loginInfo
     * @param length
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetResultList", action = "http://vlbapi.bvdep.com/GetResultList")
    @WebResult(name = "GetResultListResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetResultList", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetResultList")
    @ResponseWrapper(localName = "GetResultListResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetResultListResponse")
    public String getResultList(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "SearchId", targetNamespace = "http://vlbapi.bvdep.com/")
        int searchId,
        @WebParam(name = "SelectedDatabase", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> selectedDatabase,
        @WebParam(name = "Layout", targetNamespace = "http://vlbapi.bvdep.com/")
        Layout layout,
        @WebParam(name = "StartIndex", targetNamespace = "http://vlbapi.bvdep.com/")
        int startIndex,
        @WebParam(name = "Length", targetNamespace = "http://vlbapi.bvdep.com/")
        int length,
        @WebParam(name = "oSortInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        SortInfo oSortInfo);

    /**
     * 
     * @param selectedDatabase
     * @param layout
     * @param searchId
     * @param loginInfo
     * @param index
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetResultDetail", action = "http://vlbapi.bvdep.com/GetResultDetail")
    @WebResult(name = "GetResultDetailResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetResultDetail", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetResultDetail")
    @ResponseWrapper(localName = "GetResultDetailResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetResultDetailResponse")
    public String getResultDetail(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "SearchId", targetNamespace = "http://vlbapi.bvdep.com/")
        int searchId,
        @WebParam(name = "SelectedDatabase", targetNamespace = "http://vlbapi.bvdep.com/")
        List<String> selectedDatabase,
        @WebParam(name = "Layout", targetNamespace = "http://vlbapi.bvdep.com/")
        Layout layout,
        @WebParam(name = "Index", targetNamespace = "http://vlbapi.bvdep.com/")
        int index);

    /**
     * 
     * @param layout
     * @param identifier
     * @param loginInfo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDataRecord", action = "http://vlbapi.bvdep.com/GetDataRecord")
    @WebResult(name = "GetDataRecordResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetDataRecord", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetDataRecord")
    @ResponseWrapper(localName = "GetDataRecordResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetDataRecordResponse")
    public String getDataRecord(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Layout", targetNamespace = "http://vlbapi.bvdep.com/")
        Layout layout,
        @WebParam(name = "Identifier", targetNamespace = "http://vlbapi.bvdep.com/")
        String identifier);

    /**
     * 
     * @param loginInfo
     * @param query
     * @param searchArea
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetIndex", action = "http://vlbapi.bvdep.com/GetIndex")
    @WebResult(name = "GetIndexResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetIndex", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetIndex")
    @ResponseWrapper(localName = "GetIndexResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetIndexResponse")
    public String getIndex(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "SearchArea", targetNamespace = "http://vlbapi.bvdep.com/")
        SearchArea searchArea,
        @WebParam(name = "Query", targetNamespace = "http://vlbapi.bvdep.com/")
        String query);

    /**
     * 
     * @param identifier
     * @param size
     * @param loginInfo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCoverUrl", action = "http://vlbapi.bvdep.com/GetCoverUrl")
    @WebResult(name = "GetCoverUrlResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetCoverUrl", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetCoverUrl")
    @ResponseWrapper(localName = "GetCoverUrlResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetCoverUrlResponse")
    public String getCoverUrl(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Identifier", targetNamespace = "http://vlbapi.bvdep.com/")
        String identifier,
        @WebParam(name = "Size", targetNamespace = "http://vlbapi.bvdep.com/")
        CoverSize size);

    /**
     * 
     * @param loginInfo
     * @param kennnummer
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPublisherData", action = "http://vlbapi.bvdep.com/GetPublisherData")
    @WebResult(name = "GetPublisherDataResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetPublisherData", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetPublisherData")
    @ResponseWrapper(localName = "GetPublisherDataResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetPublisherDataResponse")
    public String getPublisherData(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Kennnummer", targetNamespace = "http://vlbapi.bvdep.com/")
        String kennnummer);

    /**
     * 
     * @param identifier
     * @param publisherId
     * @param loginInfo
     * @return
     *     returns com.bvdep.vlbapi.ArrayOfMmoInfo
     */
    @WebMethod(operationName = "GetMMoUrls", action = "http://vlbapi.bvdep.com/GetMMoUrls")
    @WebResult(name = "GetMMoUrlsResult", targetNamespace = "http://vlbapi.bvdep.com/")
    @RequestWrapper(localName = "GetMMoUrls", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetMMoUrls")
    @ResponseWrapper(localName = "GetMMoUrlsResponse", targetNamespace = "http://vlbapi.bvdep.com/", className = "com.bvdep.vlbapi.GetMMoUrlsResponse")
    public ArrayOfMmoInfo getMMoUrls(
        @WebParam(name = "LoginInfo", targetNamespace = "http://vlbapi.bvdep.com/")
        LoginInfo loginInfo,
        @WebParam(name = "Identifier", targetNamespace = "http://vlbapi.bvdep.com/")
        String identifier,
        @WebParam(name = "PublisherId", targetNamespace = "http://vlbapi.bvdep.com/")
        String publisherId);

}
