
package com.v3leisure.schemas.cabs._1_0.cabs_providercalendar_rs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.v3leisure.schemas.cabs._1_0.cabs_providercalendar_rs package. 
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

    private final static QName _CABSProviderCalendarRS_QNAME = new QName("http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderCalendar_RS.xsd", "CABS_ProviderCalendar_RS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.v3leisure.schemas.cabs._1_0.cabs_providercalendar_rs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CABSProviderCalendarRS }
     * 
     */
    public CABSProviderCalendarRS createCABSProviderCalendarRS() {
        return new CABSProviderCalendarRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABSProviderCalendarRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderCalendar_RS.xsd", name = "CABS_ProviderCalendar_RS")
    public JAXBElement<CABSProviderCalendarRS> createCABSProviderCalendarRS(CABSProviderCalendarRS value) {
        return new JAXBElement<CABSProviderCalendarRS>(_CABSProviderCalendarRS_QNAME, CABSProviderCalendarRS.class, null, value);
    }

}
