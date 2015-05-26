
package uk.co.gmsl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.gmsl package. 
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

    private final static QName _String_QNAME = new QName("http://www.gmsl.co.uk/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.gmsl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEuroRelNotesNewResponse }
     * 
     */
    public GetEuroRelNotesNewResponse createGetEuroRelNotesNewResponse() {
        return new GetEuroRelNotesNewResponse();
    }

    /**
     * Create an instance of {@link GetEuroRelNotesCurrent }
     * 
     */
    public GetEuroRelNotesCurrent createGetEuroRelNotesCurrent() {
        return new GetEuroRelNotesCurrent();
    }

    /**
     * Create an instance of {@link CheckEuroLatestVersionResponse }
     * 
     */
    public CheckEuroLatestVersionResponse createCheckEuroLatestVersionResponse() {
        return new CheckEuroLatestVersionResponse();
    }

    /**
     * Create an instance of {@link CheckENOMLatestVersion }
     * 
     */
    public CheckENOMLatestVersion createCheckENOMLatestVersion() {
        return new CheckENOMLatestVersion();
    }

    /**
     * Create an instance of {@link GetEuroRelNotesNew }
     * 
     */
    public GetEuroRelNotesNew createGetEuroRelNotesNew() {
        return new GetEuroRelNotesNew();
    }

    /**
     * Create an instance of {@link GetENOMRelNotesWeb }
     * 
     */
    public GetENOMRelNotesWeb createGetENOMRelNotesWeb() {
        return new GetENOMRelNotesWeb();
    }

    /**
     * Create an instance of {@link GetEuroRelNotesWebResponse }
     * 
     */
    public GetEuroRelNotesWebResponse createGetEuroRelNotesWebResponse() {
        return new GetEuroRelNotesWebResponse();
    }

    /**
     * Create an instance of {@link GetENOMRelNotesWebResponse }
     * 
     */
    public GetENOMRelNotesWebResponse createGetENOMRelNotesWebResponse() {
        return new GetENOMRelNotesWebResponse();
    }

    /**
     * Create an instance of {@link CheckEuroLatestVersion }
     * 
     */
    public CheckEuroLatestVersion createCheckEuroLatestVersion() {
        return new CheckEuroLatestVersion();
    }

    /**
     * Create an instance of {@link GetENOMRelNotesCurrent }
     * 
     */
    public GetENOMRelNotesCurrent createGetENOMRelNotesCurrent() {
        return new GetENOMRelNotesCurrent();
    }

    /**
     * Create an instance of {@link CheckENOMLatestVersionResponse }
     * 
     */
    public CheckENOMLatestVersionResponse createCheckENOMLatestVersionResponse() {
        return new CheckENOMLatestVersionResponse();
    }

    /**
     * Create an instance of {@link GetENOMRelNotesNewResponse }
     * 
     */
    public GetENOMRelNotesNewResponse createGetENOMRelNotesNewResponse() {
        return new GetENOMRelNotesNewResponse();
    }

    /**
     * Create an instance of {@link GetEuroRelNotesCurrentResponse }
     * 
     */
    public GetEuroRelNotesCurrentResponse createGetEuroRelNotesCurrentResponse() {
        return new GetEuroRelNotesCurrentResponse();
    }

    /**
     * Create an instance of {@link GetEuroRelNotesWeb }
     * 
     */
    public GetEuroRelNotesWeb createGetEuroRelNotesWeb() {
        return new GetEuroRelNotesWeb();
    }

    /**
     * Create an instance of {@link GetENOMRelNotesCurrentResponse }
     * 
     */
    public GetENOMRelNotesCurrentResponse createGetENOMRelNotesCurrentResponse() {
        return new GetENOMRelNotesCurrentResponse();
    }

    /**
     * Create an instance of {@link GetENOMRelNotesNew }
     * 
     */
    public GetENOMRelNotesNew createGetENOMRelNotesNew() {
        return new GetENOMRelNotesNew();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gmsl.co.uk/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
