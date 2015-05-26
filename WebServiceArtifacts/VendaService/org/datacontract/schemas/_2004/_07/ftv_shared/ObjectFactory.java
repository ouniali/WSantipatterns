
package org.datacontract.schemas._2004._07.ftv_shared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ftv_shared package. 
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

    private final static QName _BaseData_QNAME = new QName("http://schemas.datacontract.org/2004/07/FTV.Shared.Business", "BaseData");
    private final static QName _BaseDataMensagemErro_QNAME = new QName("http://schemas.datacontract.org/2004/07/FTV.Shared.Business", "MensagemErro");
    private final static QName _BaseDataCodigoErro_QNAME = new QName("http://schemas.datacontract.org/2004/07/FTV.Shared.Business", "CodigoErro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ftv_shared
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseData }
     * 
     */
    public BaseData createBaseData() {
        return new BaseData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FTV.Shared.Business", name = "BaseData")
    public JAXBElement<BaseData> createBaseData(BaseData value) {
        return new JAXBElement<BaseData>(_BaseData_QNAME, BaseData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FTV.Shared.Business", name = "MensagemErro", scope = BaseData.class)
    public JAXBElement<String> createBaseDataMensagemErro(String value) {
        return new JAXBElement<String>(_BaseDataMensagemErro_QNAME, String.class, BaseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FTV.Shared.Business", name = "CodigoErro", scope = BaseData.class)
    public JAXBElement<String> createBaseDataCodigoErro(String value) {
        return new JAXBElement<String>(_BaseDataCodigoErro_QNAME, String.class, BaseData.class, value);
    }

}
