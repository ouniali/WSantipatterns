
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots package. 
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

    private final static QName _Fault_QNAME = new QName("http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link Tstatus }
     * 
     */
    public Tstatus createTstatus() {
        return new Tstatus();
    }

    /**
     * Create an instance of {@link WaitForResponse }
     * 
     */
    public WaitForResponse createWaitForResponse() {
        return new WaitForResponse();
    }

    /**
     * Create an instance of {@link RunAndWaitForResponse }
     * 
     */
    public RunAndWaitForResponse createRunAndWaitForResponse() {
        return new RunAndWaitForResponse();
    }

    /**
     * Create an instance of {@link TdotmatcherResult }
     * 
     */
    public TdotmatcherResult createTdotmatcherResult() {
        return new TdotmatcherResult();
    }

    /**
     * Create an instance of {@link CreateAndRun }
     * 
     */
    public CreateAndRun createCreateAndRun() {
        return new CreateAndRun();
    }

    /**
     * Create an instance of {@link Tdotmatcher }
     * 
     */
    public Tdotmatcher createTdotmatcher() {
        return new Tdotmatcher();
    }

    /**
     * Create an instance of {@link CreateAndRunResponse }
     * 
     */
    public CreateAndRunResponse createCreateAndRunResponse() {
        return new CreateAndRunResponse();
    }

    /**
     * Create an instance of {@link GetResultsResponse }
     * 
     */
    public GetResultsResponse createGetResultsResponse() {
        return new GetResultsResponse();
    }

    /**
     * Create an instance of {@link GetResults }
     * 
     */
    public GetResults createGetResults() {
        return new GetResults();
    }

    /**
     * Create an instance of {@link TSoaplabException }
     * 
     */
    public TSoaplabException createTSoaplabException() {
        return new TSoaplabException();
    }

    /**
     * Create an instance of {@link RunAndWaitFor }
     * 
     */
    public RunAndWaitFor createRunAndWaitFor() {
        return new RunAndWaitFor();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link WaitFor }
     * 
     */
    public WaitFor createWaitFor() {
        return new WaitFor();
    }

    /**
     * Create an instance of {@link TdotmatcherAsequence }
     * 
     */
    public TdotmatcherAsequence createTdotmatcherAsequence() {
        return new TdotmatcherAsequence();
    }

    /**
     * Create an instance of {@link TdotmatcherResultGraphicsContainer }
     * 
     */
    public TdotmatcherResultGraphicsContainer createTdotmatcherResultGraphicsContainer() {
        return new TdotmatcherResultGraphicsContainer();
    }

    /**
     * Create an instance of {@link TdotmatcherMatrixfile }
     * 
     */
    public TdotmatcherMatrixfile createTdotmatcherMatrixfile() {
        return new TdotmatcherMatrixfile();
    }

    /**
     * Create an instance of {@link TdotmatcherBsequence }
     * 
     */
    public TdotmatcherBsequence createTdotmatcherBsequence() {
        return new TdotmatcherBsequence();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSoaplabException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher", name = "fault")
    public JAXBElement<TSoaplabException> createFault(TSoaplabException value) {
        return new JAXBElement<TSoaplabException>(_Fault_QNAME, TSoaplabException.class, null, value);
    }

}
