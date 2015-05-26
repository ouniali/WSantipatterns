
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
    private final static QName _Logo_QNAME = new QName("http://www.xignite.com/services/", "Logo");
    private final static QName _LogoList_QNAME = new QName("http://www.xignite.com/services/", "LogoList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetLogoResponse }
     * 
     */
    public GetLogoResponse createGetLogoResponse() {
        return new GetLogoResponse();
    }

    /**
     * Create an instance of {@link Logo }
     * 
     */
    public Logo createLogo() {
        return new Logo();
    }

    /**
     * Create an instance of {@link LogoList }
     * 
     */
    public LogoList createLogoList() {
        return new LogoList();
    }

    /**
     * Create an instance of {@link GetLogo }
     * 
     */
    public GetLogo createGetLogo() {
        return new GetLogo();
    }

    /**
     * Create an instance of {@link GetLogosListResponse }
     * 
     */
    public GetLogosListResponse createGetLogosListResponse() {
        return new GetLogosListResponse();
    }

    /**
     * Create an instance of {@link GetLogosList }
     * 
     */
    public GetLogosList createGetLogosList() {
        return new GetLogosList();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Logo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Logo")
    public JAXBElement<Logo> createLogo(Logo value) {
        return new JAXBElement<Logo>(_Logo_QNAME, Logo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "LogoList")
    public JAXBElement<LogoList> createLogoList(LogoList value) {
        return new JAXBElement<LogoList>(_LogoList_QNAME, LogoList.class, null, value);
    }

}
