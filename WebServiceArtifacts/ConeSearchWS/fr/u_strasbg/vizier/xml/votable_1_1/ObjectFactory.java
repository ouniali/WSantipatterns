
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.u_strasbg.vizier.xml.votable_1_1 package. 
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

    private final static QName _VOTABLE_QNAME = new QName("http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd", "VOTABLE");
    private final static QName _ConeSearchResult_QNAME = new QName("http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd", "ConeSearchResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.u_strasbg.vizier.xml.votable_1_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VOTABLE }
     * 
     */
    public VOTABLE createVOTABLE() {
        return new VOTABLE();
    }

    /**
     * Create an instance of {@link TABLEDATA }
     * 
     */
    public TABLEDATA createTABLEDATA() {
        return new TABLEDATA();
    }

    /**
     * Create an instance of {@link MAX }
     * 
     */
    public MAX createMAX() {
        return new MAX();
    }

    /**
     * Create an instance of {@link BINARY }
     * 
     */
    public BINARY createBINARY() {
        return new BINARY();
    }

    /**
     * Create an instance of {@link INFO }
     * 
     */
    public INFO createINFO() {
        return new INFO();
    }

    /**
     * Create an instance of {@link TABLE }
     * 
     */
    public TABLE createTABLE() {
        return new TABLE();
    }

    /**
     * Create an instance of {@link GROUP }
     * 
     */
    public GROUP createGROUP() {
        return new GROUP();
    }

    /**
     * Create an instance of {@link AnyTEXT }
     * 
     */
    public AnyTEXT createAnyTEXT() {
        return new AnyTEXT();
    }

    /**
     * Create an instance of {@link LINK }
     * 
     */
    public LINK createLINK() {
        return new LINK();
    }

    /**
     * Create an instance of {@link VALUES }
     * 
     */
    public VALUES createVALUES() {
        return new VALUES();
    }

    /**
     * Create an instance of {@link ArrayOfChoice1 }
     * 
     */
    public ArrayOfChoice1 createArrayOfChoice1() {
        return new ArrayOfChoice1();
    }

    /**
     * Create an instance of {@link RESOURCE }
     * 
     */
    public RESOURCE createRESOURCE() {
        return new RESOURCE();
    }

    /**
     * Create an instance of {@link FITS }
     * 
     */
    public FITS createFITS() {
        return new FITS();
    }

    /**
     * Create an instance of {@link FIELD }
     * 
     */
    public FIELD createFIELD() {
        return new FIELD();
    }

    /**
     * Create an instance of {@link OPTION }
     * 
     */
    public OPTION createOPTION() {
        return new OPTION();
    }

    /**
     * Create an instance of {@link STREAM }
     * 
     */
    public STREAM createSTREAM() {
        return new STREAM();
    }

    /**
     * Create an instance of {@link PARAM }
     * 
     */
    public PARAM createPARAM() {
        return new PARAM();
    }

    /**
     * Create an instance of {@link TD }
     * 
     */
    public TD createTD() {
        return new TD();
    }

    /**
     * Create an instance of {@link MIN }
     * 
     */
    public MIN createMIN() {
        return new MIN();
    }

    /**
     * Create an instance of {@link DATA }
     * 
     */
    public DATA createDATA() {
        return new DATA();
    }

    /**
     * Create an instance of {@link COOSYS }
     * 
     */
    public COOSYS createCOOSYS() {
        return new COOSYS();
    }

    /**
     * Create an instance of {@link FIELDref }
     * 
     */
    public FIELDref createFIELDref() {
        return new FIELDref();
    }

    /**
     * Create an instance of {@link TR }
     * 
     */
    public TR createTR() {
        return new TR();
    }

    /**
     * Create an instance of {@link PARAMref }
     * 
     */
    public PARAMref createPARAMref() {
        return new PARAMref();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOTABLE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd", name = "VOTABLE")
    public JAXBElement<VOTABLE> createVOTABLE(VOTABLE value) {
        return new JAXBElement<VOTABLE>(_VOTABLE_QNAME, VOTABLE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOTABLE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd", name = "ConeSearchResult")
    public JAXBElement<VOTABLE> createConeSearchResult(VOTABLE value) {
        return new JAXBElement<VOTABLE>(_ConeSearchResult_QNAME, VOTABLE.class, null, value);
    }

}
