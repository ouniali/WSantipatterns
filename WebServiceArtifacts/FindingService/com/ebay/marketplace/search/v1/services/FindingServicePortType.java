
package com.ebay.marketplace.search.v1.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FindingServicePortType", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FindingServicePortType {


    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.GetSearchKeywordsRecommendationResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/getSearchKeywordsRecommendation")
    @WebResult(name = "getSearchKeywordsRecommendationResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public GetSearchKeywordsRecommendationResponse getSearchKeywordsRecommendation(
        @WebParam(name = "getSearchKeywordsRecommendationRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        GetSearchKeywordsRecommendationRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsByKeywords")
    @WebResult(name = "findItemsByKeywordsResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsByKeywordsResponse findItemsByKeywords(
        @WebParam(name = "findItemsByKeywordsRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsByKeywordsRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsByCategoryResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsByCategory")
    @WebResult(name = "findItemsByCategoryResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsByCategoryResponse findItemsByCategory(
        @WebParam(name = "findItemsByCategoryRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsByCategoryRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsAdvancedResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsAdvanced")
    @WebResult(name = "findItemsAdvancedResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsAdvancedResponse findItemsAdvanced(
        @WebParam(name = "findItemsAdvancedRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsAdvancedRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsByProductResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsByProduct")
    @WebResult(name = "findItemsByProductResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsByProductResponse findItemsByProduct(
        @WebParam(name = "findItemsByProductRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsByProductRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsIneBayStoresResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsIneBayStores")
    @WebResult(name = "findItemsIneBayStoresResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsIneBayStoresResponse findItemsIneBayStores(
        @WebParam(name = "findItemsIneBayStoresRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsIneBayStoresRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsByImageResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsByImage")
    @WebResult(name = "findItemsByImageResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsByImageResponse findItemsByImage(
        @WebParam(name = "findItemsByImageRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsByImageRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.GetHistogramsResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/getHistograms")
    @WebResult(name = "getHistogramsResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public GetHistogramsResponse getHistograms(
        @WebParam(name = "getHistogramsRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        GetHistogramsRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindCompletedItemsResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsAdvanced")
    @WebResult(name = "findCompletedItemsResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindCompletedItemsResponse findCompletedItems(
        @WebParam(name = "findCompletedItemsRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindCompletedItemsRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.GetVersionResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/getVersion")
    @WebResult(name = "getVersionResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public GetVersionResponse getVersion(
        @WebParam(name = "getVersionRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        GetVersionRequest messageParameters);

    /**
     * 
     * @param messageParameters
     * @return
     *     returns com.ebay.marketplace.search.v1.services.FindItemsForFavoriteSearchResponse
     */
    @WebMethod(action = "http://www.ebay.com/marketplace/search/v1/services/findItemsForFavoriteSearch")
    @WebResult(name = "findItemsForFavoriteSearchResponse", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
    public FindItemsForFavoriteSearchResponse findItemsForFavoriteSearch(
        @WebParam(name = "findItemsForFavoriteSearchRequest", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", partName = "messageParameters")
        FindItemsForFavoriteSearchRequest messageParameters);

}
