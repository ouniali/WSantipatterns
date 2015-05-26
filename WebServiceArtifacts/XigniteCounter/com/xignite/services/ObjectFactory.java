
package com.xignite.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xignite.services package. 
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

    private final static QName _ArrayOfLogEntry_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfLogEntry");
    private final static QName _AuditEntry_QNAME = new QName("http://www.xignite.com/services/", "AuditEntry");
    private final static QName _ArrayOfAuditEntry_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfAuditEntry");
    private final static QName _LogEntry_QNAME = new QName("http://www.xignite.com/services/", "LogEntry");
    private final static QName _DoubleResult_QNAME = new QName("http://www.xignite.com/services/", "DoubleResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAudit }
     * 
     */
    public GetAudit createGetAudit() {
        return new GetAudit();
    }

    /**
     * Create an instance of {@link DeleteAuditResponse }
     * 
     */
    public DeleteAuditResponse createDeleteAuditResponse() {
        return new DeleteAuditResponse();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link GetLog }
     * 
     */
    public GetLog createGetLog() {
        return new GetLog();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link AuditEntry }
     * 
     */
    public AuditEntry createAuditEntry() {
        return new AuditEntry();
    }

    /**
     * Create an instance of {@link GetLogResponse }
     * 
     */
    public GetLogResponse createGetLogResponse() {
        return new GetLogResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLogEntry }
     * 
     */
    public ArrayOfLogEntry createArrayOfLogEntry() {
        return new ArrayOfLogEntry();
    }

    /**
     * Create an instance of {@link GetStatusesResponse }
     * 
     */
    public GetStatusesResponse createGetStatusesResponse() {
        return new GetStatusesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAuditEntry }
     * 
     */
    public ArrayOfAuditEntry createArrayOfAuditEntry() {
        return new ArrayOfAuditEntry();
    }

    /**
     * Create an instance of {@link LogResponse }
     * 
     */
    public LogResponse createLogResponse() {
        return new LogResponse();
    }

    /**
     * Create an instance of {@link LogEntry }
     * 
     */
    public LogEntry createLogEntry() {
        return new LogEntry();
    }

    /**
     * Create an instance of {@link SetStatusResponse }
     * 
     */
    public SetStatusResponse createSetStatusResponse() {
        return new SetStatusResponse();
    }

    /**
     * Create an instance of {@link SetStatus }
     * 
     */
    public SetStatus createSetStatus() {
        return new SetStatus();
    }

    /**
     * Create an instance of {@link SetStatusWithMachineNameResponse }
     * 
     */
    public SetStatusWithMachineNameResponse createSetStatusWithMachineNameResponse() {
        return new SetStatusWithMachineNameResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link AuditResponse }
     * 
     */
    public AuditResponse createAuditResponse() {
        return new AuditResponse();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link GetAuditResponse }
     * 
     */
    public GetAuditResponse createGetAuditResponse() {
        return new GetAuditResponse();
    }

    /**
     * Create an instance of {@link GetStatusWithMachineNameResponse }
     * 
     */
    public GetStatusWithMachineNameResponse createGetStatusWithMachineNameResponse() {
        return new GetStatusWithMachineNameResponse();
    }

    /**
     * Create an instance of {@link GetStatuses }
     * 
     */
    public GetStatuses createGetStatuses() {
        return new GetStatuses();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link GetStatusesWithPatternResponse }
     * 
     */
    public GetStatusesWithPatternResponse createGetStatusesWithPatternResponse() {
        return new GetStatusesWithPatternResponse();
    }

    /**
     * Create an instance of {@link GetStatusesWithPattern }
     * 
     */
    public GetStatusesWithPattern createGetStatusesWithPattern() {
        return new GetStatusesWithPattern();
    }

    /**
     * Create an instance of {@link DeleteAudit }
     * 
     */
    public DeleteAudit createDeleteAudit() {
        return new DeleteAudit();
    }

    /**
     * Create an instance of {@link GetStatusWithMachineName }
     * 
     */
    public GetStatusWithMachineName createGetStatusWithMachineName() {
        return new GetStatusWithMachineName();
    }

    /**
     * Create an instance of {@link SetStatusWithMachineName }
     * 
     */
    public SetStatusWithMachineName createSetStatusWithMachineName() {
        return new SetStatusWithMachineName();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfLogEntry")
    public JAXBElement<ArrayOfLogEntry> createArrayOfLogEntry(ArrayOfLogEntry value) {
        return new JAXBElement<ArrayOfLogEntry>(_ArrayOfLogEntry_QNAME, ArrayOfLogEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "AuditEntry")
    public JAXBElement<AuditEntry> createAuditEntry(AuditEntry value) {
        return new JAXBElement<AuditEntry>(_AuditEntry_QNAME, AuditEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfAuditEntry")
    public JAXBElement<ArrayOfAuditEntry> createArrayOfAuditEntry(ArrayOfAuditEntry value) {
        return new JAXBElement<ArrayOfAuditEntry>(_ArrayOfAuditEntry_QNAME, ArrayOfAuditEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "LogEntry")
    public JAXBElement<LogEntry> createLogEntry(LogEntry value) {
        return new JAXBElement<LogEntry>(_LogEntry_QNAME, LogEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "DoubleResult")
    public JAXBElement<DoubleResult> createDoubleResult(DoubleResult value) {
        return new JAXBElement<DoubleResult>(_DoubleResult_QNAME, DoubleResult.class, null, value);
    }

}
