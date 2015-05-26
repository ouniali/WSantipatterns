
package org.opentravel.ota._2003._05;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OTA_HotelAvailSoap", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OTAHotelAvailSoap {


    /**
     * Performs an availability search for a specific zone or accommodation.
     * 
     * @param otaHotelAvailRQ
     * @return
     *     returns org.opentravel.ota._2003._05.OTAHotelAvailServiceResponse.OTAHotelAvailRS
     */
    @WebMethod(operationName = "OTA_HotelAvailService", action = "http://www.opentravel.org/OTA/2003/05/OTA_HotelAvailService")
    @WebResult(name = "OTA_HotelAvailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    @RequestWrapper(localName = "OTA_HotelAvailService", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "org.opentravel.ota._2003._05.OTAHotelAvailService")
    @ResponseWrapper(localName = "OTA_HotelAvailServiceResponse", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "org.opentravel.ota._2003._05.OTAHotelAvailServiceResponse")
    public org.opentravel.ota._2003._05.OTAHotelAvailServiceResponse.OTAHotelAvailRS otaHotelAvailService(
        @WebParam(name = "OTA_HotelAvailRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
        org.opentravel.ota._2003._05.OTAHotelAvailService.OTAHotelAvailRQ otaHotelAvailRQ);

}
