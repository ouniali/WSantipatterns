
package com.nuwave_tech.soapam.services.bankdemo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankingServiceSoap", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankingServiceSoap {


    /**
     * his method returns the balance for the specified account
     * 
     * @param requestMsg
     * @return
     *     returns com.nuwave_tech.soapam.services.bankdemo.IpmGetBalanceReply
     */
    @WebMethod(action = "http://soapam.nuwave-tech.com/services/bankdemo/getAccountBalance")
    @WebResult(name = "replyMsg", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
    @RequestWrapper(localName = "getAccountBalance", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo", className = "com.nuwave_tech.soapam.services.bankdemo.GetAccountBalance")
    @ResponseWrapper(localName = "getAccountBalanceResponse", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo", className = "com.nuwave_tech.soapam.services.bankdemo.GetAccountBalanceResponse")
    public IpmGetBalanceReply getAccountBalance(
        @WebParam(name = "requestMsg", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
        IpmGetBalanceRequest requestMsg);

    /**
     * redit the specified account
     * 
     * @param requestMsg
     * @return
     *     returns com.nuwave_tech.soapam.services.bankdemo.IpmCreditAccountReply
     */
    @WebMethod(action = "http://soapam.nuwave-tech.com/services/bankdemo/creditAccount")
    @WebResult(name = "replyMsg", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
    @RequestWrapper(localName = "creditAccount", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo", className = "com.nuwave_tech.soapam.services.bankdemo.CreditAccount")
    @ResponseWrapper(localName = "creditAccountResponse", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo", className = "com.nuwave_tech.soapam.services.bankdemo.CreditAccountResponse")
    public IpmCreditAccountReply creditAccount(
        @WebParam(name = "requestMsg", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
        IpmCreditAccountRequest requestMsg);

    /**
     * ebit the specified account
     * 
     * @param requestMsg
     * @return
     *     returns com.nuwave_tech.soapam.services.bankdemo.IpmDebitAccountReply
     */
    @WebMethod(action = "http://soapam.nuwave-tech.com/services/bankdemo/debitAccount")
    @WebResult(name = "replyMsg", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
    @RequestWrapper(localName = "debitAccount", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo", className = "com.nuwave_tech.soapam.services.bankdemo.DebitAccount")
    @ResponseWrapper(localName = "debitAccountResponse", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo", className = "com.nuwave_tech.soapam.services.bankdemo.DebitAccountResponse")
    public IpmDebitAccountReply debitAccount(
        @WebParam(name = "requestMsg", targetNamespace = "http://soapam.nuwave-tech.com/services/bankdemo")
        IpmDebitAccountRequest requestMsg);

}
