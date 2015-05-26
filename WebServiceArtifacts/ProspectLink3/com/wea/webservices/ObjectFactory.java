
package com.wea.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wea.webservices package. 
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

    private final static QName _SearchSFS_QNAME = new QName("http://webservices.wea.com/", "searchSFS");
    private final static QName _SearchSNP_QNAME = new QName("http://webservices.wea.com/", "searchSNP");
    private final static QName _ProspectLinkException_QNAME = new QName("http://webservices.wea.com/", "ProspectLinkException");
    private final static QName _SearchSFSResponse_QNAME = new QName("http://webservices.wea.com/", "searchSFSResponse");
    private final static QName _SearchSNPResponse_QNAME = new QName("http://webservices.wea.com/", "searchSNPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wea.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchSNP }
     * 
     */
    public SearchSNP createSearchSNP() {
        return new SearchSNP();
    }

    /**
     * Create an instance of {@link ProspectLinkException }
     * 
     */
    public ProspectLinkException createProspectLinkException() {
        return new ProspectLinkException();
    }

    /**
     * Create an instance of {@link SearchSFS }
     * 
     */
    public SearchSFS createSearchSFS() {
        return new SearchSFS();
    }

    /**
     * Create an instance of {@link SearchSFSResponse }
     * 
     */
    public SearchSFSResponse createSearchSFSResponse() {
        return new SearchSFSResponse();
    }

    /**
     * Create an instance of {@link SearchSNPResponse }
     * 
     */
    public SearchSNPResponse createSearchSNPResponse() {
        return new SearchSNPResponse();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link NpSearchInput }
     * 
     */
    public NpSearchInput createNpSearchInput() {
        return new NpSearchInput();
    }

    /**
     * Create an instance of {@link SearchResultElementList }
     * 
     */
    public SearchResultElementList createSearchResultElementList() {
        return new SearchResultElementList();
    }

    /**
     * Create an instance of {@link SearchServiceException }
     * 
     */
    public SearchServiceException createSearchServiceException() {
        return new SearchServiceException();
    }

    /**
     * Create an instance of {@link FsSearchInput }
     * 
     */
    public FsSearchInput createFsSearchInput() {
        return new FsSearchInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSFS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wea.com/", name = "searchSFS")
    public JAXBElement<SearchSFS> createSearchSFS(SearchSFS value) {
        return new JAXBElement<SearchSFS>(_SearchSFS_QNAME, SearchSFS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSNP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wea.com/", name = "searchSNP")
    public JAXBElement<SearchSNP> createSearchSNP(SearchSNP value) {
        return new JAXBElement<SearchSNP>(_SearchSNP_QNAME, SearchSNP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProspectLinkException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wea.com/", name = "ProspectLinkException")
    public JAXBElement<ProspectLinkException> createProspectLinkException(ProspectLinkException value) {
        return new JAXBElement<ProspectLinkException>(_ProspectLinkException_QNAME, ProspectLinkException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSFSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wea.com/", name = "searchSFSResponse")
    public JAXBElement<SearchSFSResponse> createSearchSFSResponse(SearchSFSResponse value) {
        return new JAXBElement<SearchSFSResponse>(_SearchSFSResponse_QNAME, SearchSFSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSNPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.wea.com/", name = "searchSNPResponse")
    public JAXBElement<SearchSNPResponse> createSearchSNPResponse(SearchSNPResponse value) {
        return new JAXBElement<SearchSNPResponse>(_SearchSNPResponse_QNAME, SearchSNPResponse.class, null, value);
    }

}
