
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

    private final static QName _ArrayOfModel_QNAME = new QName("http://www.diacomp.org/webservices/", "ArrayOfModel");
    private final static QName _Model_QNAME = new QName("http://www.diacomp.org/webservices/", "Model");
    private final static QName _ArrayOfInvestigator_QNAME = new QName("http://www.diacomp.org/webservices/", "ArrayOfInvestigator");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.diacomp.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetModelResponse }
     * 
     */
    public GetModelResponse createGetModelResponse() {
        return new GetModelResponse();
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link GetModelExperimentsResponse }
     * 
     */
    public GetModelExperimentsResponse createGetModelExperimentsResponse() {
        return new GetModelExperimentsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvestigator }
     * 
     */
    public ArrayOfInvestigator createArrayOfInvestigator() {
        return new ArrayOfInvestigator();
    }

    /**
     * Create an instance of {@link GetModels }
     * 
     */
    public GetModels createGetModels() {
        return new GetModels();
    }

    /**
     * Create an instance of {@link GetModelsResponse }
     * 
     */
    public GetModelsResponse createGetModelsResponse() {
        return new GetModelsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfModel }
     * 
     */
    public ArrayOfModel createArrayOfModel() {
        return new ArrayOfModel();
    }

    /**
     * Create an instance of {@link GetModelsBySearchResponse }
     * 
     */
    public GetModelsBySearchResponse createGetModelsBySearchResponse() {
        return new GetModelsBySearchResponse();
    }

    /**
     * Create an instance of {@link GetModelsBySearch }
     * 
     */
    public GetModelsBySearch createGetModelsBySearch() {
        return new GetModelsBySearch();
    }

    /**
     * Create an instance of {@link ModelSearch }
     * 
     */
    public ModelSearch createModelSearch() {
        return new ModelSearch();
    }

    /**
     * Create an instance of {@link GetModel }
     * 
     */
    public GetModel createGetModel() {
        return new GetModel();
    }

    /**
     * Create an instance of {@link GetModelExperiments }
     * 
     */
    public GetModelExperiments createGetModelExperiments() {
        return new GetModelExperiments();
    }

    /**
     * Create an instance of {@link ObjectHistory }
     * 
     */
    public ObjectHistory createObjectHistory() {
        return new ObjectHistory();
    }

    /**
     * Create an instance of {@link Laboratory }
     * 
     */
    public Laboratory createLaboratory() {
        return new Laboratory();
    }

    /**
     * Create an instance of {@link Institution }
     * 
     */
    public Institution createInstitution() {
        return new Institution();
    }

    /**
     * Create an instance of {@link Investigator }
     * 
     */
    public Investigator createInvestigator() {
        return new Investigator();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Strain }
     * 
     */
    public Strain createStrain() {
        return new Strain();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
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
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link Species }
     * 
     */
    public Species createSpecies() {
        return new Species();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "ArrayOfModel")
    public JAXBElement<ArrayOfModel> createArrayOfModel(ArrayOfModel value) {
        return new JAXBElement<ArrayOfModel>(_ArrayOfModel_QNAME, ArrayOfModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Model }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "Model")
    public JAXBElement<Model> createModel(Model value) {
        return new JAXBElement<Model>(_Model_QNAME, Model.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvestigator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.diacomp.org/webservices/", name = "ArrayOfInvestigator")
    public JAXBElement<ArrayOfInvestigator> createArrayOfInvestigator(ArrayOfInvestigator value) {
        return new JAXBElement<ArrayOfInvestigator>(_ArrayOfInvestigator_QNAME, ArrayOfInvestigator.class, null, value);
    }

}
