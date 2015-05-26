
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ukmail.services.contracts.datacontracts.AddDomesticConsignmentDeferredWebRequest;
import com.ukmail.services.contracts.datacontracts.AddDomesticConsignmentWebRequest;
import com.ukmail.services.contracts.datacontracts.AddInternationalConsignmentWebRequest;
import com.ukmail.services.contracts.datacontracts.AddPacketConsignmentWebRequest;
import com.ukmail.services.contracts.datacontracts.AddReturnWebRequest;
import com.ukmail.services.contracts.datacontracts.AddSendToThirdPartyWebRequest;
import com.ukmail.services.contracts.datacontracts.CancelConsignmentWebRequest;
import com.ukmail.services.contracts.datacontracts.CancelReturnWebRequest;
import com.ukmail.services.contracts.datacontracts.UKMAddDomesticConsignmentWebResponse;
import com.ukmail.services.contracts.datacontracts.UKMAddInternationalConsignmentWebResponse;
import com.ukmail.services.contracts.datacontracts.UKMAddPacketConsignmentWebResponse;
import com.ukmail.services.contracts.datacontracts.UKMAddReturnToSenderWebResponse;
import com.ukmail.services.contracts.datacontracts.UKMAddSendToThirdPartyWebResponse;
import com.ukmail.services.contracts.datacontracts.UKMCancelConsignmentWebResponse;
import com.ukmail.services.contracts.datacontracts.UKMCancelReturnWebResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ukmail.services.contracts.servicecontracts package. 
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

    private final static QName _AddReturnToSenderResponseAddReturnToSenderResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "AddReturnToSenderResult");
    private final static QName _AddSendToThirdPartyRequest_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "request");
    private final static QName _AddDomesticConsignmentDeferredResponseAddDomesticConsignmentDeferredResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "AddDomesticConsignmentDeferredResult");
    private final static QName _CancelReturnResponseCancelReturnResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "CancelReturnResult");
    private final static QName _AddSendToThirdPartyResponseAddSendToThirdPartyResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "AddSendToThirdPartyResult");
    private final static QName _AddPacketConsignmentResponseAddPacketConsignmentResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "AddPacketConsignmentResult");
    private final static QName _AddDomesticConsignmentResponseAddDomesticConsignmentResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "AddDomesticConsignmentResult");
    private final static QName _CancelConsignmentResponseCancelConsignmentResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "CancelConsignmentResult");
    private final static QName _AddInternationalConsignmentResponseAddInternationalConsignmentResult_QNAME = new QName("http://www.UKMail.com/Services/Contracts/ServiceContracts", "AddInternationalConsignmentResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ukmail.services.contracts.servicecontracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelConsignmentResponse }
     * 
     */
    public CancelConsignmentResponse createCancelConsignmentResponse() {
        return new CancelConsignmentResponse();
    }

    /**
     * Create an instance of {@link AddDomesticConsignmentResponse }
     * 
     */
    public AddDomesticConsignmentResponse createAddDomesticConsignmentResponse() {
        return new AddDomesticConsignmentResponse();
    }

    /**
     * Create an instance of {@link AddPacketConsignmentResponse }
     * 
     */
    public AddPacketConsignmentResponse createAddPacketConsignmentResponse() {
        return new AddPacketConsignmentResponse();
    }

    /**
     * Create an instance of {@link AddSendToThirdParty }
     * 
     */
    public AddSendToThirdParty createAddSendToThirdParty() {
        return new AddSendToThirdParty();
    }

    /**
     * Create an instance of {@link AddReturnToSender }
     * 
     */
    public AddReturnToSender createAddReturnToSender() {
        return new AddReturnToSender();
    }

    /**
     * Create an instance of {@link AddInternationalConsignment }
     * 
     */
    public AddInternationalConsignment createAddInternationalConsignment() {
        return new AddInternationalConsignment();
    }

    /**
     * Create an instance of {@link AddInternationalConsignmentResponse }
     * 
     */
    public AddInternationalConsignmentResponse createAddInternationalConsignmentResponse() {
        return new AddInternationalConsignmentResponse();
    }

    /**
     * Create an instance of {@link AddDomesticConsignmentDeferredResponse }
     * 
     */
    public AddDomesticConsignmentDeferredResponse createAddDomesticConsignmentDeferredResponse() {
        return new AddDomesticConsignmentDeferredResponse();
    }

    /**
     * Create an instance of {@link AddSendToThirdPartyResponse }
     * 
     */
    public AddSendToThirdPartyResponse createAddSendToThirdPartyResponse() {
        return new AddSendToThirdPartyResponse();
    }

    /**
     * Create an instance of {@link AddDomesticConsignment }
     * 
     */
    public AddDomesticConsignment createAddDomesticConsignment() {
        return new AddDomesticConsignment();
    }

    /**
     * Create an instance of {@link AddPacketConsignment }
     * 
     */
    public AddPacketConsignment createAddPacketConsignment() {
        return new AddPacketConsignment();
    }

    /**
     * Create an instance of {@link AddReturnToSenderResponse }
     * 
     */
    public AddReturnToSenderResponse createAddReturnToSenderResponse() {
        return new AddReturnToSenderResponse();
    }

    /**
     * Create an instance of {@link CancelReturn }
     * 
     */
    public CancelReturn createCancelReturn() {
        return new CancelReturn();
    }

    /**
     * Create an instance of {@link CancelConsignment }
     * 
     */
    public CancelConsignment createCancelConsignment() {
        return new CancelConsignment();
    }

    /**
     * Create an instance of {@link CancelReturnResponse }
     * 
     */
    public CancelReturnResponse createCancelReturnResponse() {
        return new CancelReturnResponse();
    }

    /**
     * Create an instance of {@link AddDomesticConsignmentDeferred }
     * 
     */
    public AddDomesticConsignmentDeferred createAddDomesticConsignmentDeferred() {
        return new AddDomesticConsignmentDeferred();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMAddReturnToSenderWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "AddReturnToSenderResult", scope = AddReturnToSenderResponse.class)
    public JAXBElement<UKMAddReturnToSenderWebResponse> createAddReturnToSenderResponseAddReturnToSenderResult(UKMAddReturnToSenderWebResponse value) {
        return new JAXBElement<UKMAddReturnToSenderWebResponse>(_AddReturnToSenderResponseAddReturnToSenderResult_QNAME, UKMAddReturnToSenderWebResponse.class, AddReturnToSenderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSendToThirdPartyWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = AddSendToThirdParty.class)
    public JAXBElement<AddSendToThirdPartyWebRequest> createAddSendToThirdPartyRequest(AddSendToThirdPartyWebRequest value) {
        return new JAXBElement<AddSendToThirdPartyWebRequest>(_AddSendToThirdPartyRequest_QNAME, AddSendToThirdPartyWebRequest.class, AddSendToThirdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMAddDomesticConsignmentWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "AddDomesticConsignmentDeferredResult", scope = AddDomesticConsignmentDeferredResponse.class)
    public JAXBElement<UKMAddDomesticConsignmentWebResponse> createAddDomesticConsignmentDeferredResponseAddDomesticConsignmentDeferredResult(UKMAddDomesticConsignmentWebResponse value) {
        return new JAXBElement<UKMAddDomesticConsignmentWebResponse>(_AddDomesticConsignmentDeferredResponseAddDomesticConsignmentDeferredResult_QNAME, UKMAddDomesticConsignmentWebResponse.class, AddDomesticConsignmentDeferredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMCancelReturnWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "CancelReturnResult", scope = CancelReturnResponse.class)
    public JAXBElement<UKMCancelReturnWebResponse> createCancelReturnResponseCancelReturnResult(UKMCancelReturnWebResponse value) {
        return new JAXBElement<UKMCancelReturnWebResponse>(_CancelReturnResponseCancelReturnResult_QNAME, UKMCancelReturnWebResponse.class, CancelReturnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPacketConsignmentWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = AddPacketConsignment.class)
    public JAXBElement<AddPacketConsignmentWebRequest> createAddPacketConsignmentRequest(AddPacketConsignmentWebRequest value) {
        return new JAXBElement<AddPacketConsignmentWebRequest>(_AddSendToThirdPartyRequest_QNAME, AddPacketConsignmentWebRequest.class, AddPacketConsignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMAddSendToThirdPartyWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "AddSendToThirdPartyResult", scope = AddSendToThirdPartyResponse.class)
    public JAXBElement<UKMAddSendToThirdPartyWebResponse> createAddSendToThirdPartyResponseAddSendToThirdPartyResult(UKMAddSendToThirdPartyWebResponse value) {
        return new JAXBElement<UKMAddSendToThirdPartyWebResponse>(_AddSendToThirdPartyResponseAddSendToThirdPartyResult_QNAME, UKMAddSendToThirdPartyWebResponse.class, AddSendToThirdPartyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDomesticConsignmentDeferredWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = AddDomesticConsignmentDeferred.class)
    public JAXBElement<AddDomesticConsignmentDeferredWebRequest> createAddDomesticConsignmentDeferredRequest(AddDomesticConsignmentDeferredWebRequest value) {
        return new JAXBElement<AddDomesticConsignmentDeferredWebRequest>(_AddSendToThirdPartyRequest_QNAME, AddDomesticConsignmentDeferredWebRequest.class, AddDomesticConsignmentDeferred.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = CancelReturn.class)
    public JAXBElement<CancelReturnWebRequest> createCancelReturnRequest(CancelReturnWebRequest value) {
        return new JAXBElement<CancelReturnWebRequest>(_AddSendToThirdPartyRequest_QNAME, CancelReturnWebRequest.class, CancelReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMAddPacketConsignmentWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "AddPacketConsignmentResult", scope = AddPacketConsignmentResponse.class)
    public JAXBElement<UKMAddPacketConsignmentWebResponse> createAddPacketConsignmentResponseAddPacketConsignmentResult(UKMAddPacketConsignmentWebResponse value) {
        return new JAXBElement<UKMAddPacketConsignmentWebResponse>(_AddPacketConsignmentResponseAddPacketConsignmentResult_QNAME, UKMAddPacketConsignmentWebResponse.class, AddPacketConsignmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMAddDomesticConsignmentWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "AddDomesticConsignmentResult", scope = AddDomesticConsignmentResponse.class)
    public JAXBElement<UKMAddDomesticConsignmentWebResponse> createAddDomesticConsignmentResponseAddDomesticConsignmentResult(UKMAddDomesticConsignmentWebResponse value) {
        return new JAXBElement<UKMAddDomesticConsignmentWebResponse>(_AddDomesticConsignmentResponseAddDomesticConsignmentResult_QNAME, UKMAddDomesticConsignmentWebResponse.class, AddDomesticConsignmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMCancelConsignmentWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "CancelConsignmentResult", scope = CancelConsignmentResponse.class)
    public JAXBElement<UKMCancelConsignmentWebResponse> createCancelConsignmentResponseCancelConsignmentResult(UKMCancelConsignmentWebResponse value) {
        return new JAXBElement<UKMCancelConsignmentWebResponse>(_CancelConsignmentResponseCancelConsignmentResult_QNAME, UKMCancelConsignmentWebResponse.class, CancelConsignmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDomesticConsignmentWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = AddDomesticConsignment.class)
    public JAXBElement<AddDomesticConsignmentWebRequest> createAddDomesticConsignmentRequest(AddDomesticConsignmentWebRequest value) {
        return new JAXBElement<AddDomesticConsignmentWebRequest>(_AddSendToThirdPartyRequest_QNAME, AddDomesticConsignmentWebRequest.class, AddDomesticConsignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddInternationalConsignmentWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = AddInternationalConsignment.class)
    public JAXBElement<AddInternationalConsignmentWebRequest> createAddInternationalConsignmentRequest(AddInternationalConsignmentWebRequest value) {
        return new JAXBElement<AddInternationalConsignmentWebRequest>(_AddSendToThirdPartyRequest_QNAME, AddInternationalConsignmentWebRequest.class, AddInternationalConsignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UKMAddInternationalConsignmentWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "AddInternationalConsignmentResult", scope = AddInternationalConsignmentResponse.class)
    public JAXBElement<UKMAddInternationalConsignmentWebResponse> createAddInternationalConsignmentResponseAddInternationalConsignmentResult(UKMAddInternationalConsignmentWebResponse value) {
        return new JAXBElement<UKMAddInternationalConsignmentWebResponse>(_AddInternationalConsignmentResponseAddInternationalConsignmentResult_QNAME, UKMAddInternationalConsignmentWebResponse.class, AddInternationalConsignmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelConsignmentWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = CancelConsignment.class)
    public JAXBElement<CancelConsignmentWebRequest> createCancelConsignmentRequest(CancelConsignmentWebRequest value) {
        return new JAXBElement<CancelConsignmentWebRequest>(_AddSendToThirdPartyRequest_QNAME, CancelConsignmentWebRequest.class, CancelConsignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReturnWebRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", name = "request", scope = AddReturnToSender.class)
    public JAXBElement<AddReturnWebRequest> createAddReturnToSenderRequest(AddReturnWebRequest value) {
        return new JAXBElement<AddReturnWebRequest>(_AddSendToThirdPartyRequest_QNAME, AddReturnWebRequest.class, AddReturnToSender.class, value);
    }

}
