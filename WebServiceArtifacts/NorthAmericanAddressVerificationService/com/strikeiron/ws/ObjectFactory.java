
package com.strikeiron.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.strikeiron.ws package. 
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

    private final static QName _SubscriptionInfo_QNAME = new QName("http://ws.strikeiron.com", "SubscriptionInfo");
    private final static QName _LicenseInfo_QNAME = new QName("http://ws.strikeiron.com", "LicenseInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.strikeiron.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LicenseInfo }
     * 
     */
    public LicenseInfo createLicenseInfo() {
        return new LicenseInfo();
    }

    /**
     * Create an instance of {@link GetRemainingHitsResponse }
     * 
     */
    public GetRemainingHitsResponse createGetRemainingHitsResponse() {
        return new GetRemainingHitsResponse();
    }

    /**
     * Create an instance of {@link SubscriptionInfo }
     * 
     */
    public SubscriptionInfo createSubscriptionInfo() {
        return new SubscriptionInfo();
    }

    /**
     * Create an instance of {@link GetRemainingHits }
     * 
     */
    public GetRemainingHits createGetRemainingHits() {
        return new GetRemainingHits();
    }

    /**
     * Create an instance of {@link RegisteredUser }
     * 
     */
    public RegisteredUser createRegisteredUser() {
        return new RegisteredUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.strikeiron.com", name = "SubscriptionInfo")
    public JAXBElement<SubscriptionInfo> createSubscriptionInfo(SubscriptionInfo value) {
        return new JAXBElement<SubscriptionInfo>(_SubscriptionInfo_QNAME, SubscriptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.strikeiron.com", name = "LicenseInfo")
    public JAXBElement<LicenseInfo> createLicenseInfo(LicenseInfo value) {
        return new JAXBElement<LicenseInfo>(_LicenseInfo_QNAME, LicenseInfo.class, null, value);
    }

}
