
package com.inforcyl.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.xsd package. 
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

    private final static QName _HeaderMaintenanceMessage_QNAME = new QName("http://services.inforcyl.com/xsd", "maintenanceMessage");
    private final static QName _HeaderSystemDate_QNAME = new QName("http://services.inforcyl.com/xsd", "systemDate");
    private final static QName _HeaderAuthentification_QNAME = new QName("http://services.inforcyl.com/xsd", "authentification");
    private final static QName _AuthentificationClientIp_QNAME = new QName("http://services.inforcyl.com/xsd", "clientIp");
    private final static QName _AuthentificationUserLocaleCountry_QNAME = new QName("http://services.inforcyl.com/xsd", "userLocaleCountry");
    private final static QName _AuthentificationPassword_QNAME = new QName("http://services.inforcyl.com/xsd", "password");
    private final static QName _AuthentificationUserDataBase_QNAME = new QName("http://services.inforcyl.com/xsd", "userDataBase");
    private final static QName _AuthentificationAdmon_QNAME = new QName("http://services.inforcyl.com/xsd", "admon");
    private final static QName _AuthentificationUserTimeUsing_QNAME = new QName("http://services.inforcyl.com/xsd", "userTimeUsing");
    private final static QName _AuthentificationUser_QNAME = new QName("http://services.inforcyl.com/xsd", "user");
    private final static QName _AuthentificationUserLocaleLanguage_QNAME = new QName("http://services.inforcyl.com/xsd", "userLocaleLanguage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputMethods }
     * 
     */
    public InputMethods createInputMethods() {
        return new InputMethods();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Authentification }
     * 
     */
    public Authentification createAuthentification() {
        return new Authentification();
    }

    /**
     * Create an instance of {@link OutputMethods }
     * 
     */
    public OutputMethods createOutputMethods() {
        return new OutputMethods();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "maintenanceMessage", scope = Header.class)
    public JAXBElement<String> createHeaderMaintenanceMessage(String value) {
        return new JAXBElement<String>(_HeaderMaintenanceMessage_QNAME, String.class, Header.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "systemDate", scope = Header.class)
    public JAXBElement<String> createHeaderSystemDate(String value) {
        return new JAXBElement<String>(_HeaderSystemDate_QNAME, String.class, Header.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "authentification", scope = Header.class)
    public JAXBElement<Authentification> createHeaderAuthentification(Authentification value) {
        return new JAXBElement<Authentification>(_HeaderAuthentification_QNAME, Authentification.class, Header.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "clientIp", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationClientIp(String value) {
        return new JAXBElement<String>(_AuthentificationClientIp_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "userLocaleCountry", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationUserLocaleCountry(String value) {
        return new JAXBElement<String>(_AuthentificationUserLocaleCountry_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "password", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationPassword(String value) {
        return new JAXBElement<String>(_AuthentificationPassword_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "userDataBase", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationUserDataBase(String value) {
        return new JAXBElement<String>(_AuthentificationUserDataBase_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "admon", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationAdmon(String value) {
        return new JAXBElement<String>(_AuthentificationAdmon_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "userTimeUsing", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationUserTimeUsing(String value) {
        return new JAXBElement<String>(_AuthentificationUserTimeUsing_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "user", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationUser(String value) {
        return new JAXBElement<String>(_AuthentificationUser_QNAME, String.class, Authentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.inforcyl.com/xsd", name = "userLocaleLanguage", scope = Authentification.class)
    public JAXBElement<String> createAuthentificationUserLocaleLanguage(String value) {
        return new JAXBElement<String>(_AuthentificationUserLocaleLanguage_QNAME, String.class, Authentification.class, value);
    }

}
