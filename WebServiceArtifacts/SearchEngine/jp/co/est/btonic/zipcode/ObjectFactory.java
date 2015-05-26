
package jp.co.est.btonic.zipcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.co.est.btonic.zipcode package. 
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

    private final static QName _FindList_QNAME = new QName("http://btonic.est.co.jp/zipcode/", "FindList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.co.est.btonic.zipcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FromZipCodeResponse }
     * 
     */
    public FromZipCodeResponse createFromZipCodeResponse() {
        return new FromZipCodeResponse();
    }

    /**
     * Create an instance of {@link FindList }
     * 
     */
    public FindList createFindList() {
        return new FindList();
    }

    /**
     * Create an instance of {@link FromAddress2Response }
     * 
     */
    public FromAddress2Response createFromAddress2Response() {
        return new FromAddress2Response();
    }

    /**
     * Create an instance of {@link FromAddressDecremental }
     * 
     */
    public FromAddressDecremental createFromAddressDecremental() {
        return new FromAddressDecremental();
    }

    /**
     * Create an instance of {@link FromAddressDecrementalResponse }
     * 
     */
    public FromAddressDecrementalResponse createFromAddressDecrementalResponse() {
        return new FromAddressDecrementalResponse();
    }

    /**
     * Create an instance of {@link FromZipCode2 }
     * 
     */
    public FromZipCode2 createFromZipCode2() {
        return new FromZipCode2();
    }

    /**
     * Create an instance of {@link FromAddressResponse }
     * 
     */
    public FromAddressResponse createFromAddressResponse() {
        return new FromAddressResponse();
    }

    /**
     * Create an instance of {@link FromOldZipCode2Response }
     * 
     */
    public FromOldZipCode2Response createFromOldZipCode2Response() {
        return new FromOldZipCode2Response();
    }

    /**
     * Create an instance of {@link FromAddress }
     * 
     */
    public FromAddress createFromAddress() {
        return new FromAddress();
    }

    /**
     * Create an instance of {@link FromAddress2 }
     * 
     */
    public FromAddress2 createFromAddress2() {
        return new FromAddress2();
    }

    /**
     * Create an instance of {@link FromOldZipCodeResponse }
     * 
     */
    public FromOldZipCodeResponse createFromOldZipCodeResponse() {
        return new FromOldZipCodeResponse();
    }

    /**
     * Create an instance of {@link FromZipCode }
     * 
     */
    public FromZipCode createFromZipCode() {
        return new FromZipCode();
    }

    /**
     * Create an instance of {@link FromOldZipCode }
     * 
     */
    public FromOldZipCode createFromOldZipCode() {
        return new FromOldZipCode();
    }

    /**
     * Create an instance of {@link FromOldZipCode2 }
     * 
     */
    public FromOldZipCode2 createFromOldZipCode2() {
        return new FromOldZipCode2();
    }

    /**
     * Create an instance of {@link FromZipCode2Response }
     * 
     */
    public FromZipCode2Response createFromZipCode2Response() {
        return new FromZipCode2Response();
    }

    /**
     * Create an instance of {@link FindItem }
     * 
     */
    public FindItem createFindItem() {
        return new FindItem();
    }

    /**
     * Create an instance of {@link ArrayOfFindItem }
     * 
     */
    public ArrayOfFindItem createArrayOfFindItem() {
        return new ArrayOfFindItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://btonic.est.co.jp/zipcode/", name = "FindList")
    public JAXBElement<FindList> createFindList(FindList value) {
        return new JAXBElement<FindList>(_FindList_QNAME, FindList.class, null, value);
    }

}
