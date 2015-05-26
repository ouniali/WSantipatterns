
package org.diacomp.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.diacomp.webservices package. 
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

    private final static QName _ArrayOfExperiment_QNAME = new QName("http://www.diacomp.org/webservices/", "ArrayOfExperiment");
    private final static QName _ArrayOfStrain_QNAME = new QName("http://www.diacomp.org/webservices/", "ArrayOfStrain");
    private final static QName _ArrayOfString_QNAME = new QName("http://www.diacomp.org/webservices/", "ArrayOfString");
    private final static QName _ArrayOfPublication_QNAME = new QName("http://www.diacomp.org/webservices/", "ArrayOfPublication");
    private final static QName _Publication_QNAME = new QName("http://www.diacomp.org/webservices/", "Publication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.diacomp.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPublications }
     * 
     */
    public GetPublications createGetPublications() {
        return new GetPublications();
    }

    /**
     * Create an instance of {@link ArrayOfExperiment }
     * 
     */
    public ArrayOfExperiment createArrayOfExperiment() {
        return new ArrayOfExperiment();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link GetPublicationsBySearchResponse }
     * 
     */
    public GetPublicationsBySearchResponse createGetPublicationsBySearchResponse() {
        return new GetPublicationsBySearchResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPublication }
     * 
     */
    public ArrayOfPublication createArrayOfPublication() {
        return new ArrayOfPublication();
    }

    /**
     * Create an instance of {@link GetPublicationModelTypesResponse }
     * 
     */
    public GetPublicationModelTypesResponse createGetPublicationModelTypesResponse() {
        return new GetPublicationModelTypesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetPublication }
     * 
     */
    public GetPublication createGetPublication() {
        return new GetPublication();
    }

    /**
     * Create an instance of {@link GetPublicationStrains }
     * 
     */
    public GetPublicationStrains createGetPublicationStrains() {
        return new GetPublicationStrains();
    }

    /**
     * Create an instance of {@link GetPublicationStrainsResponse }
     * 
     */
    public GetPublicationStrainsResponse createGetPublicationStrainsResponse() {
        return new GetPublicationStrainsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStrain }
     * 
     */
    public ArrayOfStrain createArrayOfStrain() {
        return new ArrayOfStrain();
    }

    /**
     * Create an instance of {@link GetPublicationResponse }
     * 
     */
    public GetPublicationResponse createGetPublicationResponse() {
        return new GetPublicationResponse();
    }

    /**
     * Create an instance of {@link GetPublicationsBySearch }
     * 
     */
    public GetPublicationsBySearch createGetPublicationsBySearch() {
        return new GetPublicationsBySearch();
    }

    /**
     * Create an instance of {@link PublicationSearch }
     * 
     */
    public PublicationSearch createPublicationSearch() {
        return new PublicationSearch();
    }

    /**
     * Create an instance of {@link GetPublicationExperiments }
     * 
     */
    public GetPublicationExperiments createGetPublicationExperiments() {
        return new GetPublicationExperiments();
    }

    /**
     * Create an instance of {@link GetPublicationModelTypes }
     * 
     */
    public GetPublicationModelTypes createGetPublicationModelTypes() {
        return new GetPublicationModelTypes();
    }

    /**
     * Create an instance of {@link GetPublicationExperimentsResponse }
     * 
     */
    public GetPublicationExperimentsResponse createGetPublicationExperimentsResponse() {
        return new GetPublicationExperimentsResponse();
    }

    /**
     * Create an instance of {@link GetPublicationsResponse }
     * 
     */
    public GetPublicationsResponse createGetPublicationsResponse() {
        return new GetPublicationsResponse();
    }

    /**
     * Create an instance of {@link Experiment }
     * 
     */
    public Experiment createExperiment() {
        return new Experiment();
    }

    /**
     * Create an instance of {@link Journal }
     * 
     */
    public Journal createJournal() {
        return new Journal();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Strain }
     * 
     */
    public Strain createStrain() {
        return new Strain();
    }

    /**
     * Create an instance of {@link DataUnit }
     * 
     */
    public DataUnit createDataUnit() {
        return new DataUnit();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link Protocol }
     * 
     */
    public Protocol createProtocol() {
        return new Protocol();
    }

    /**
     * Create an instance of {@link Species }
     * 
     */
    public Species createSpecies() {
        return new Species();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExperiment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "ArrayOfExperiment")
    public JAXBElement<ArrayOfExperiment> createArrayOfExperiment(ArrayOfExperiment value) {
        return new JAXBElement<ArrayOfExperiment>(_ArrayOfExperiment_QNAME, ArrayOfExperiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStrain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "ArrayOfStrain")
    public JAXBElement<ArrayOfStrain> createArrayOfStrain(ArrayOfStrain value) {
        return new JAXBElement<ArrayOfStrain>(_ArrayOfStrain_QNAME, ArrayOfStrain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPublication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "ArrayOfPublication")
    public JAXBElement<ArrayOfPublication> createArrayOfPublication(ArrayOfPublication value) {
        return new JAXBElement<ArrayOfPublication>(_ArrayOfPublication_QNAME, ArrayOfPublication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "Publication")
    public JAXBElement<Publication> createPublication(Publication value) {
        return new JAXBElement<Publication>(_Publication_QNAME, Publication.class, null, value);
    }

}
