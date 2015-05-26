
package nl.textkernel.home.search;

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
@WebService(name = "SearchService", targetNamespace = "http://home.textkernel.nl/search")
@XmlSeeAlso({
    nl.textkernel.home.search.ObjectFactory.class,
    net.java.dev.jaxb.array.ObjectFactory.class
})
public interface SearchService {


    /**
     * 
     * @param environment
     * @param password
     * @param accessRoles
     * @param language
     * @param userOptions
     * @param accessOptions
     * @return
     *     returns nl.textkernel.home.search.CompositeMetadata
     * @throws SearchBoxException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMetadata", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.GetMetadata")
    @ResponseWrapper(localName = "getMetadataResponse", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.GetMetadataResponse")
    public CompositeMetadata getMetadata(
        @WebParam(name = "environment", targetNamespace = "")
        String environment,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "accessOptions", targetNamespace = "")
        AccessOptions accessOptions,
        @WebParam(name = "language", targetNamespace = "")
        String language,
        @WebParam(name = "userOptions", targetNamespace = "")
        UserOptions userOptions,
        @WebParam(name = "accessRoles", targetNamespace = "")
        List<String> accessRoles)
        throws SearchBoxException
    ;

    /**
     * 
     * @param request
     * @param accessToken
     * @return
     *     returns nl.textkernel.home.search.SearchResult
     * @throws SearchBoxException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchWithToken", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.SearchWithToken")
    @ResponseWrapper(localName = "searchWithTokenResponse", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.SearchWithTokenResponse")
    public SearchResult searchWithToken(
        @WebParam(name = "accessToken", targetNamespace = "")
        String accessToken,
        @WebParam(name = "request", targetNamespace = "")
        SearchRequest request)
        throws SearchBoxException
    ;

    /**
     * 
     * @param language
     * @param accessToken
     * @return
     *     returns nl.textkernel.home.search.CompositeMetadata
     * @throws SearchBoxException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMetadataWithToken", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.GetMetadataWithToken")
    @ResponseWrapper(localName = "getMetadataWithTokenResponse", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.GetMetadataWithTokenResponse")
    public CompositeMetadata getMetadataWithToken(
        @WebParam(name = "accessToken", targetNamespace = "")
        String accessToken,
        @WebParam(name = "language", targetNamespace = "")
        String language)
        throws SearchBoxException
    ;

    /**
     * 
     * @param environment
     * @param password
     * @param accessRoles
     * @param searchEngine
     * @param language
     * @param state
     * @param accessOptions
     * @return
     *     returns nl.textkernel.home.search.SearchResult
     * @throws SearchBoxException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchWithState", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.SearchWithState")
    @ResponseWrapper(localName = "searchWithStateResponse", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.SearchWithStateResponse")
    public SearchResult searchWithState(
        @WebParam(name = "environment", targetNamespace = "")
        String environment,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "accessRoles", targetNamespace = "")
        List<String> accessRoles,
        @WebParam(name = "accessOptions", targetNamespace = "")
        AccessOptions accessOptions,
        @WebParam(name = "state", targetNamespace = "")
        String state,
        @WebParam(name = "searchEngine", targetNamespace = "")
        String searchEngine,
        @WebParam(name = "language", targetNamespace = "")
        String language)
        throws SearchBoxException
    ;

    /**
     * 
     * @param request
     * @param environment
     * @param password
     * @param accessRoles
     * @param accessOptions
     * @return
     *     returns nl.textkernel.home.search.SearchResult
     * @throws SearchBoxException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://home.textkernel.nl/search", className = "nl.textkernel.home.search.SearchResponse")
    public SearchResult search(
        @WebParam(name = "environment", targetNamespace = "")
        String environment,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "accessRoles", targetNamespace = "")
        List<String> accessRoles,
        @WebParam(name = "accessOptions", targetNamespace = "")
        AccessOptions accessOptions,
        @WebParam(name = "request", targetNamespace = "")
        SearchRequest request)
        throws SearchBoxException
    ;

}
