
package com.epnet.webservices.searchservice._2007._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epnet.webservices.searchservice._2007._07 package. 
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

    private final static QName _AuthorizationHeader_QNAME = new QName("http://epnet.com/webservices/SearchService/2007/07/", "AuthorizationHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epnet.webservices.searchservice._2007._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Browse }
     * 
     */
    public Browse createBrowse() {
        return new Browse();
    }

    /**
     * Create an instance of {@link BrowseRequest }
     * 
     */
    public BrowseRequest createBrowseRequest() {
        return new BrowseRequest();
    }

    /**
     * Create an instance of {@link BrowseResponse }
     * 
     */
    public BrowseResponse createBrowseResponse() {
        return new BrowseResponse();
    }

    /**
     * Create an instance of {@link InfoResponse }
     * 
     */
    public InfoResponse createInfoResponse() {
        return new InfoResponse();
    }

    /**
     * Create an instance of {@link GetClusters }
     * 
     */
    public GetClusters createGetClusters() {
        return new GetClusters();
    }

    /**
     * Create an instance of {@link ClusterSearchRequest }
     * 
     */
    public ClusterSearchRequest createClusterSearchRequest() {
        return new ClusterSearchRequest();
    }

    /**
     * Create an instance of {@link AuthorizationHeader }
     * 
     */
    public AuthorizationHeader createAuthorizationHeader() {
        return new AuthorizationHeader();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link AuthoritySearchResponse }
     * 
     */
    public AuthoritySearchResponse createAuthoritySearchResponse() {
        return new AuthoritySearchResponse();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link InfoRequest }
     * 
     */
    public InfoRequest createInfoRequest() {
        return new InfoRequest();
    }

    /**
     * Create an instance of {@link GetClustersResponse }
     * 
     */
    public GetClustersResponse createGetClustersResponse() {
        return new GetClustersResponse();
    }

    /**
     * Create an instance of {@link AuthoritySearch }
     * 
     */
    public AuthoritySearch createAuthoritySearch() {
        return new AuthoritySearch();
    }

    /**
     * Create an instance of {@link AuthoritySearchRequest }
     * 
     */
    public AuthoritySearchRequest createAuthoritySearchRequest() {
        return new AuthoritySearchRequest();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epnet.com/webservices/SearchService/2007/07/", name = "AuthorizationHeader")
    public JAXBElement<AuthorizationHeader> createAuthorizationHeader(AuthorizationHeader value) {
        return new JAXBElement<AuthorizationHeader>(_AuthorizationHeader_QNAME, AuthorizationHeader.class, null, value);
    }

}
