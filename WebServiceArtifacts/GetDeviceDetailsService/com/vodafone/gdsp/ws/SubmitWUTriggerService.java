
package com.vodafone.gdsp.ws;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SubmitWUTriggerService", targetNamespace = "http://ws.gdsp.vodafone.com/", wsdlLocation = "META-INF/wsdl/extWebServices.wsdl")
public class SubmitWUTriggerService
    extends Service
{

    private final static URL SUBMITWUTRIGGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUBMITWUTRIGGERSERVICE_EXCEPTION;
    private final static QName SUBMITWUTRIGGERSERVICE_QNAME = new QName("http://ws.gdsp.vodafone.com/", "SubmitWUTriggerService");

    static {
        SUBMITWUTRIGGERSERVICE_WSDL_LOCATION = com.vodafone.gdsp.ws.SubmitWUTriggerService.class.getClassLoader().getResource("META-INF/wsdl/extWebServices.wsdl");
        WebServiceException e = null;
        if (SUBMITWUTRIGGERSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/extWebServices.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SUBMITWUTRIGGERSERVICE_EXCEPTION = e;
    }

    public SubmitWUTriggerService() {
        super(__getWsdlLocation(), SUBMITWUTRIGGERSERVICE_QNAME);
    }

    public SubmitWUTriggerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUBMITWUTRIGGERSERVICE_QNAME, features);
    }

    public SubmitWUTriggerService(URL wsdlLocation) {
        super(wsdlLocation, SUBMITWUTRIGGERSERVICE_QNAME);
    }

    public SubmitWUTriggerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUBMITWUTRIGGERSERVICE_QNAME, features);
    }

    public SubmitWUTriggerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SubmitWUTriggerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SubmitWUTrigger
     */
    @WebEndpoint(name = "SubmitWUTriggerPort")
    public SubmitWUTrigger getSubmitWUTriggerPort() {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "SubmitWUTriggerPort"), SubmitWUTrigger.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SubmitWUTrigger
     */
    @WebEndpoint(name = "SubmitWUTriggerPort")
    public SubmitWUTrigger getSubmitWUTriggerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gdsp.vodafone.com/", "SubmitWUTriggerPort"), SubmitWUTrigger.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUBMITWUTRIGGERSERVICE_EXCEPTION!= null) {
            throw SUBMITWUTRIGGERSERVICE_EXCEPTION;
        }
        return SUBMITWUTRIGGERSERVICE_WSDL_LOCATION;
    }

}