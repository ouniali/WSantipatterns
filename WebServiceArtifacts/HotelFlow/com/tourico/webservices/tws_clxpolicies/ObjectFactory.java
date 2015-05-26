
package com.tourico.webservices.tws_clxpolicies;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tourico.webservices.tws_clxpolicies package. 
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

    private final static QName _HotelPolicy_QNAME = new QName("http://tourico.com/webservices/TWS_ClxPolicies.xsd", "HotelPolicy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tourico.webservices.tws_clxpolicies
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HotelPolicyType }
     * 
     */
    public HotelPolicyType createHotelPolicyType() {
        return new HotelPolicyType();
    }

    /**
     * Create an instance of {@link RoomTypePolicyType }
     * 
     */
    public RoomTypePolicyType createRoomTypePolicyType() {
        return new RoomTypePolicyType();
    }

    /**
     * Create an instance of {@link ArrayOfCancelPenaltyType }
     * 
     */
    public ArrayOfCancelPenaltyType createArrayOfCancelPenaltyType() {
        return new ArrayOfCancelPenaltyType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link DeadlineType }
     * 
     */
    public DeadlineType createDeadlineType() {
        return new DeadlineType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd", name = "HotelPolicy")
    public JAXBElement<HotelPolicyType> createHotelPolicy(HotelPolicyType value) {
        return new JAXBElement<HotelPolicyType>(_HotelPolicy_QNAME, HotelPolicyType.class, null, value);
    }

}
