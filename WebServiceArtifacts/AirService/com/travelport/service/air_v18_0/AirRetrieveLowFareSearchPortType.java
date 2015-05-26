
package com.travelport.service.air_v18_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.travelport.schema.air_v18_0.RetrieveLowFareSearchReq;
import com.travelport.schema.air_v18_0.RetrieveLowFareSearchRsp;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AirRetrieveLowFareSearchPortType", targetNamespace = "http://www.travelport.com/service/air_v18_0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.travelport.schema.air_v18_0.ObjectFactory.class,
    com.travelport.schema.common_v15_0.ObjectFactory.class,
    com.travelport.schema.hotel_v17_0.ObjectFactory.class,
    com.travelport.schema.passive_v14_0.ObjectFactory.class,
    com.travelport.schema.universal_v16_0.ObjectFactory.class,
    com.travelport.schema.rail_v12_0.ObjectFactory.class,
    com.travelport.schema.vehicle_v17_0.ObjectFactory.class
})
public interface AirRetrieveLowFareSearchPortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.travelport.schema.air_v18_0.RetrieveLowFareSearchRsp
     * @throws AirFaultMessage
     */
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    @WebResult(name = "RetrieveLowFareSearchRsp", targetNamespace = "http://www.travelport.com/schema/air_v18_0", partName = "result")
    public RetrieveLowFareSearchRsp service(
        @WebParam(name = "RetrieveLowFareSearchReq", targetNamespace = "http://www.travelport.com/schema/air_v18_0", partName = "parameters")
        RetrieveLowFareSearchReq parameters)
        throws AirFaultMessage
    ;

}
