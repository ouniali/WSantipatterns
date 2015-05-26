
package gov.nsw.lands.address.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import gov.nsw.lands.address.data.AddressResult;
import gov.nsw.lands.address.data.LotAddressResult;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AddressSearch", targetNamespace = "http://ws.address.lands.nsw.gov")
@XmlSeeAlso({
    gov.nsw.lands.address.data.ObjectFactory.class,
    gov.nsw.lands.address.search.utl.ObjectFactory.class,
    gov.nsw.lands.address.ws.ObjectFactory.class
})
public interface AddressSearch {


    /**
     * 
     * @param planType
     * @param sectionNumber
     * @param lotNumber
     * @param projection
     * @param planNumber
     * @return
     *     returns gov.nsw.lands.address.data.LotAddressResult
     */
    @WebMethod(action = "findAddressByPlan")
    @WebResult(name = "findAddressByPlanReturn", targetNamespace = "")
    @RequestWrapper(localName = "findAddressByPlan", targetNamespace = "http://ws.address.lands.nsw.gov", className = "gov.nsw.lands.address.ws.FindAddressByPlan")
    @ResponseWrapper(localName = "findAddressByPlanResponse", targetNamespace = "http://ws.address.lands.nsw.gov", className = "gov.nsw.lands.address.ws.FindAddressByPlanResponse")
    public LotAddressResult findAddressByPlan(
        @WebParam(name = "planType", targetNamespace = "")
        String planType,
        @WebParam(name = "lotNumber", targetNamespace = "")
        String lotNumber,
        @WebParam(name = "sectionNumber", targetNamespace = "")
        String sectionNumber,
        @WebParam(name = "planNumber", targetNamespace = "")
        Integer planNumber,
        @WebParam(name = "projection", targetNamespace = "")
        String projection);

    /**
     * 
     * @param roadType
     * @param houseNumber
     * @param suburb
     * @param postCode
     * @param projection
     * @param roadName
     * @return
     *     returns gov.nsw.lands.address.data.AddressResult
     */
    @WebMethod(action = "findAddress")
    @WebResult(name = "findAddressReturn", targetNamespace = "")
    @RequestWrapper(localName = "findAddress", targetNamespace = "http://ws.address.lands.nsw.gov", className = "gov.nsw.lands.address.ws.FindAddress")
    @ResponseWrapper(localName = "findAddressResponse", targetNamespace = "http://ws.address.lands.nsw.gov", className = "gov.nsw.lands.address.ws.FindAddressResponse")
    public AddressResult findAddress(
        @WebParam(name = "houseNumber", targetNamespace = "")
        String houseNumber,
        @WebParam(name = "roadName", targetNamespace = "")
        String roadName,
        @WebParam(name = "roadType", targetNamespace = "")
        String roadType,
        @WebParam(name = "suburb", targetNamespace = "")
        String suburb,
        @WebParam(name = "postCode", targetNamespace = "")
        String postCode,
        @WebParam(name = "projection", targetNamespace = "")
        String projection);

    /**
     * 
     * @param cadid
     * @param projection
     * @return
     *     returns gov.nsw.lands.address.data.LotAddressResult
     */
    @WebMethod(action = "findAddressByPlanCadId")
    @WebResult(name = "findAddressByPlanCadIdReturn", targetNamespace = "")
    @RequestWrapper(localName = "findAddressByPlanCadId", targetNamespace = "http://ws.address.lands.nsw.gov", className = "gov.nsw.lands.address.ws.FindAddressByPlanCadId")
    @ResponseWrapper(localName = "findAddressByPlanCadIdResponse", targetNamespace = "http://ws.address.lands.nsw.gov", className = "gov.nsw.lands.address.ws.FindAddressByPlanCadIdResponse")
    public LotAddressResult findAddressByPlanCadId(
        @WebParam(name = "cadid", targetNamespace = "")
        Long cadid,
        @WebParam(name = "projection", targetNamespace = "")
        String projection);

}