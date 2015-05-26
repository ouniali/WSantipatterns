
package com.nuwave_tech.soapam.services.bankdemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nuwave_tech.soapam.services.bankdemo package. 
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

    private final static QName _TxControl_QNAME = new QName("http://soapam.nuwave-tech.com/services/bankdemo", "txControl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nuwave_tech.soapam.services.bankdemo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DebitAccount }
     * 
     */
    public DebitAccount createDebitAccount() {
        return new DebitAccount();
    }

    /**
     * Create an instance of {@link IpmDebitAccountRequest }
     * 
     */
    public IpmDebitAccountRequest createIpmDebitAccountRequest() {
        return new IpmDebitAccountRequest();
    }

    /**
     * Create an instance of {@link GetAccountBalance }
     * 
     */
    public GetAccountBalance createGetAccountBalance() {
        return new GetAccountBalance();
    }

    /**
     * Create an instance of {@link IpmGetBalanceRequest }
     * 
     */
    public IpmGetBalanceRequest createIpmGetBalanceRequest() {
        return new IpmGetBalanceRequest();
    }

    /**
     * Create an instance of {@link CreditAccount }
     * 
     */
    public CreditAccount createCreditAccount() {
        return new CreditAccount();
    }

    /**
     * Create an instance of {@link IpmCreditAccountRequest }
     * 
     */
    public IpmCreditAccountRequest createIpmCreditAccountRequest() {
        return new IpmCreditAccountRequest();
    }

    /**
     * Create an instance of {@link DebitAccountResponse }
     * 
     */
    public DebitAccountResponse createDebitAccountResponse() {
        return new DebitAccountResponse();
    }

    /**
     * Create an instance of {@link IpmDebitAccountReply }
     * 
     */
    public IpmDebitAccountReply createIpmDebitAccountReply() {
        return new IpmDebitAccountReply();
    }

    /**
     * Create an instance of {@link CreditAccountResponse }
     * 
     */
    public CreditAccountResponse createCreditAccountResponse() {
        return new CreditAccountResponse();
    }

    /**
     * Create an instance of {@link IpmCreditAccountReply }
     * 
     */
    public IpmCreditAccountReply createIpmCreditAccountReply() {
        return new IpmCreditAccountReply();
    }

    /**
     * Create an instance of {@link GetAccountBalanceResponse }
     * 
     */
    public GetAccountBalanceResponse createGetAccountBalanceResponse() {
        return new GetAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link IpmGetBalanceReply }
     * 
     */
    public IpmGetBalanceReply createIpmGetBalanceReply() {
        return new IpmGetBalanceReply();
    }

    /**
     * Create an instance of {@link TxControl }
     * 
     */
    public TxControl createTxControl() {
        return new TxControl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TxControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapam.nuwave-tech.com/services/bankdemo", name = "txControl")
    public JAXBElement<TxControl> createTxControl(TxControl value) {
        return new JAXBElement<TxControl>(_TxControl_QNAME, TxControl.class, null, value);
    }

}
