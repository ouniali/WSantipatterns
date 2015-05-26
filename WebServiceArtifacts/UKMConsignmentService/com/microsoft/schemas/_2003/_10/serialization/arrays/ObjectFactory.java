
package com.microsoft.schemas._2003._10.serialization.arrays;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas._2003._10.serialization.arrays package. 
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

    private final static QName _ArrayOfbase64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfbase64Binary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas._2003._10.serialization.arrays
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfbase64Binary }
     * 
     */
    public ArrayOfbase64Binary createArrayOfbase64Binary() {
        return new ArrayOfbase64Binary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfbase64Binary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfbase64Binary")
    public JAXBElement<ArrayOfbase64Binary> createArrayOfbase64Binary(ArrayOfbase64Binary value) {
        return new JAXBElement<ArrayOfbase64Binary>(_ArrayOfbase64Binary_QNAME, ArrayOfbase64Binary.class, null, value);
    }

}
