
package fr.chronopost.soap.shipping.cxf;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShippingServiceWS", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShippingServiceWS {


    /**
     * 
     * @param shipperValue
     * @param closingDateTime
     * @param retrievalDateTime
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultFaisabiliteESD
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "faisabiliteESD", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.FaisabiliteESD")
    @ResponseWrapper(localName = "faisabiliteESDResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.FaisabiliteESDResponse")
    public ResultFaisabiliteESD faisabiliteESD(
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "retrievalDateTime", targetNamespace = "")
        XMLGregorianCalendar retrievalDateTime,
        @WebParam(name = "closingDateTime", targetNamespace = "")
        XMLGregorianCalendar closingDateTime);

    /**
     * 
     * @param reservationNumber
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultGetReservedSkybillWithTypeValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReservedSkybillWithType", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.GetReservedSkybillWithType")
    @ResponseWrapper(localName = "getReservedSkybillWithTypeResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.GetReservedSkybillWithTypeResponse")
    public ResultGetReservedSkybillWithTypeValue getReservedSkybillWithType(
        @WebParam(name = "reservationNumber", targetNamespace = "")
        String reservationNumber);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param recipientValue
     * @param password
     * @param skybillValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @param version
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingV2", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingV2")
    @ResponseWrapper(localName = "shippingV2Response", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingV2Response")
    public ResultExpeditionValue shippingV2(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        RecipientValue recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        RefValue refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        SkybillValue skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "version", targetNamespace = "")
        String version);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param recipientValue
     * @param password
     * @param skybillValue
     * @param scheduledValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @param version
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingV3", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingV3")
    @ResponseWrapper(localName = "shippingV3Response", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingV3Response")
    public ResultExpeditionValue shippingV3(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        RecipientValue recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        RefValue refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        SkybillValue skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "scheduledValue", targetNamespace = "")
        ScheduledValue scheduledValue);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param recipientValue
     * @param password
     * @param skybillValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shipping", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.Shipping")
    @ResponseWrapper(localName = "shippingResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingResponse")
    public ResultExpeditionValue shipping(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        RecipientValue recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        RefValue refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        SkybillValue skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param reservationNumber
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultGetReservedSkybillValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReservedSkybill", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.GetReservedSkybill")
    @ResponseWrapper(localName = "getReservedSkybillResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.GetReservedSkybillResponse")
    public ResultGetReservedSkybillValue getReservedSkybill(
        @WebParam(name = "reservationNumber", targetNamespace = "")
        String reservationNumber);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param modeRetour
     * @param scheduledValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @param version
     * @param recipientValue
     * @param numberOfParcel
     * @param password
     * @param multiParcel
     * @param skybillValue
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultReservationMultiParcelExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingMultiParcelWithReservation", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingMultiParcelWithReservation")
    @ResponseWrapper(localName = "shippingMultiParcelWithReservationResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingMultiParcelWithReservationResponse")
    public ResultReservationMultiParcelExpeditionValue shippingMultiParcelWithReservation(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdWithRefClientValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        List<RecipientValue> recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        List<RefValue> refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        List<SkybillWithDimensionsValue> skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "modeRetour", targetNamespace = "")
        String modeRetour,
        @WebParam(name = "numberOfParcel", targetNamespace = "")
        int numberOfParcel,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "multiParcel", targetNamespace = "")
        String multiParcel,
        @WebParam(name = "scheduledValue", targetNamespace = "")
        ScheduledValue scheduledValue);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param recipientValue
     * @param modeRetour
     * @param password
     * @param skybillValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultReservationExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingWithReservation", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithReservation")
    @ResponseWrapper(localName = "shippingWithReservationResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithReservationResponse")
    public ResultReservationExpeditionValue shippingWithReservation(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        RecipientValue recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        RefValue refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        SkybillValue skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "modeRetour", targetNamespace = "")
        String modeRetour);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param recipientValue
     * @param modeRetour
     * @param password
     * @param skybillValue
     * @param scheduledValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @param version
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultReservationExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingWithReservationAndESDWithRefClient", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithReservationAndESDWithRefClient")
    @ResponseWrapper(localName = "shippingWithReservationAndESDWithRefClientResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithReservationAndESDWithRefClientResponse")
    public ResultReservationExpeditionValue shippingWithReservationAndESDWithRefClient(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdWithRefClientValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        RecipientValue recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        RefValue refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        SkybillValue skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "modeRetour", targetNamespace = "")
        String modeRetour,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "scheduledValue", targetNamespace = "")
        ScheduledValue scheduledValue);

    /**
     * 
     * @param codCurrency
     * @param portValue
     * @param shipperName2
     * @param recipientCountryName
     * @param shipperServiceDirection
     * @param shipperCivility
     * @param recipientZipCode
     * @param shipperCountry
     * @param customerName2
     * @param portCurrency
     * @param objectType
     * @param mode
     * @param insuredCurrency
     * @param sellByDate
     * @param password
     * @param timeSlotStartDate
     * @param refEsdClient
     * @param customerEmail
     * @param recipientName
     * @param shipperBuildingFloor
     * @param shipperZipCode
     * @param timeSlotTariffLevel
     * @param shipperEmail
     * @param height
     * @param customerContactName
     * @param bulkNumber
     * @param recipientContactName
     * @param recipientPhone
     * @param shipperContactName
     * @param recipientAdress2
     * @param recipientCivility
     * @param recipientAdress1
     * @param specificInstructions
     * @param insuredValue
     * @param weight
     * @param shipperName
     * @param ltAImprimerParChronopost
     * @param shipDate
     * @param recipientMobilePhone
     * @param customerName
     * @param codValue
     * @param recipientPreAlert
     * @param shipperRef
     * @param shipperPhone
     * @param headerIdentWebPro
     * @param shipperCountryName
     * @param customerMobilePhone
     * @param customsCurrency
     * @param shipperCarriesCode
     * @param skybillRank
     * @param customerCountryName
     * @param recipientName2
     * @param shipperMobilePhone
     * @param weightUnit
     * @param timeSlotEndDate
     * @param evtCode
     * @param nombreDePassageMaximum
     * @param customerCity
     * @param shipperCity
     * @param subAccount
     * @param customerCountry
     * @param closingDateTime
     * @param customerPhone
     * @param recipientEmail
     * @param customerZipCode
     * @param expirationDate
     * @param modeRetour
     * @param shipperAdress1
     * @param customerCivility
     * @param shipperAdress2
     * @param customsValue
     * @param recipientRef
     * @param retrievalDateTime
     * @param length
     * @param customerAdress2
     * @param shipHour
     * @param customerSkybillNumber
     * @param customerAdress1
     * @param accountNumber
     * @param productCode
     * @param content5
     * @param content4
     * @param content3
     * @param service
     * @param content2
     * @param content1
     * @param width
     * @param customerPreAlert
     * @param recipientCountry
     * @param recipientCity
     * @param headerIdEmit
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultReservationExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingWithReservationAndESDWithRefClientPC", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithReservationAndESDWithRefClientPC")
    @ResponseWrapper(localName = "shippingWithReservationAndESDWithRefClientPCResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithReservationAndESDWithRefClientPCResponse")
    public ResultReservationExpeditionValue shippingWithReservationAndESDWithRefClientPC(
        @WebParam(name = "refEsdClient", targetNamespace = "")
        String refEsdClient,
        @WebParam(name = "retrievalDateTime", targetNamespace = "")
        String retrievalDateTime,
        @WebParam(name = "closingDateTime", targetNamespace = "")
        String closingDateTime,
        @WebParam(name = "specificInstructions", targetNamespace = "")
        String specificInstructions,
        @WebParam(name = "height", targetNamespace = "")
        String height,
        @WebParam(name = "width", targetNamespace = "")
        String width,
        @WebParam(name = "length", targetNamespace = "")
        String length,
        @WebParam(name = "shipperCarriesCode", targetNamespace = "")
        String shipperCarriesCode,
        @WebParam(name = "shipperBuildingFloor", targetNamespace = "")
        String shipperBuildingFloor,
        @WebParam(name = "shipperServiceDirection", targetNamespace = "")
        String shipperServiceDirection,
        @WebParam(name = "nombreDePassageMaximum", targetNamespace = "")
        String nombreDePassageMaximum,
        @WebParam(name = "ltAImprimerParChronopost", targetNamespace = "")
        String ltAImprimerParChronopost,
        @WebParam(name = "header_idEmit", targetNamespace = "")
        String headerIdEmit,
        @WebParam(name = "accountNumber", targetNamespace = "")
        String accountNumber,
        @WebParam(name = "subAccount", targetNamespace = "")
        String subAccount,
        @WebParam(name = "header_identWebPro", targetNamespace = "")
        String headerIdentWebPro,
        @WebParam(name = "shipperCivility", targetNamespace = "")
        String shipperCivility,
        @WebParam(name = "shipperName", targetNamespace = "")
        String shipperName,
        @WebParam(name = "shipperName2", targetNamespace = "")
        String shipperName2,
        @WebParam(name = "shipperAdress1", targetNamespace = "")
        String shipperAdress1,
        @WebParam(name = "shipperAdress2", targetNamespace = "")
        String shipperAdress2,
        @WebParam(name = "shipperZipCode", targetNamespace = "")
        String shipperZipCode,
        @WebParam(name = "shipperCity", targetNamespace = "")
        String shipperCity,
        @WebParam(name = "shipperCountry", targetNamespace = "")
        String shipperCountry,
        @WebParam(name = "shipperCountryName", targetNamespace = "")
        String shipperCountryName,
        @WebParam(name = "shipperContactName", targetNamespace = "")
        String shipperContactName,
        @WebParam(name = "shipperEmail", targetNamespace = "")
        String shipperEmail,
        @WebParam(name = "shipperPhone", targetNamespace = "")
        String shipperPhone,
        @WebParam(name = "shipperMobilePhone", targetNamespace = "")
        String shipperMobilePhone,
        @WebParam(name = "customerCivility", targetNamespace = "")
        String customerCivility,
        @WebParam(name = "customerName", targetNamespace = "")
        String customerName,
        @WebParam(name = "customerName2", targetNamespace = "")
        String customerName2,
        @WebParam(name = "customerAdress1", targetNamespace = "")
        String customerAdress1,
        @WebParam(name = "customerAdress2", targetNamespace = "")
        String customerAdress2,
        @WebParam(name = "customerZipCode", targetNamespace = "")
        String customerZipCode,
        @WebParam(name = "customerCity", targetNamespace = "")
        String customerCity,
        @WebParam(name = "customerCountry", targetNamespace = "")
        String customerCountry,
        @WebParam(name = "customerCountryName", targetNamespace = "")
        String customerCountryName,
        @WebParam(name = "customerContactName", targetNamespace = "")
        String customerContactName,
        @WebParam(name = "customerEmail", targetNamespace = "")
        String customerEmail,
        @WebParam(name = "customerPhone", targetNamespace = "")
        String customerPhone,
        @WebParam(name = "customerMobilePhone", targetNamespace = "")
        String customerMobilePhone,
        @WebParam(name = "customerPreAlert", targetNamespace = "")
        String customerPreAlert,
        @WebParam(name = "recipientCivility", targetNamespace = "")
        String recipientCivility,
        @WebParam(name = "recipientName", targetNamespace = "")
        String recipientName,
        @WebParam(name = "recipientName2", targetNamespace = "")
        String recipientName2,
        @WebParam(name = "recipientAdress1", targetNamespace = "")
        String recipientAdress1,
        @WebParam(name = "recipientAdress2", targetNamespace = "")
        String recipientAdress2,
        @WebParam(name = "recipientZipCode", targetNamespace = "")
        String recipientZipCode,
        @WebParam(name = "recipientCity", targetNamespace = "")
        String recipientCity,
        @WebParam(name = "recipientCountry", targetNamespace = "")
        String recipientCountry,
        @WebParam(name = "recipientCountryName", targetNamespace = "")
        String recipientCountryName,
        @WebParam(name = "recipientContactName", targetNamespace = "")
        String recipientContactName,
        @WebParam(name = "recipientEmail", targetNamespace = "")
        String recipientEmail,
        @WebParam(name = "recipientPhone", targetNamespace = "")
        String recipientPhone,
        @WebParam(name = "recipientMobilePhone", targetNamespace = "")
        String recipientMobilePhone,
        @WebParam(name = "recipientPreAlert", targetNamespace = "")
        String recipientPreAlert,
        @WebParam(name = "shipperRef", targetNamespace = "")
        String shipperRef,
        @WebParam(name = "recipientRef", targetNamespace = "")
        String recipientRef,
        @WebParam(name = "customerSkybillNumber", targetNamespace = "")
        String customerSkybillNumber,
        @WebParam(name = "evtCode", targetNamespace = "")
        String evtCode,
        @WebParam(name = "productCode", targetNamespace = "")
        String productCode,
        @WebParam(name = "shipDate", targetNamespace = "")
        String shipDate,
        @WebParam(name = "shipHour", targetNamespace = "")
        String shipHour,
        @WebParam(name = "weight", targetNamespace = "")
        String weight,
        @WebParam(name = "weightUnit", targetNamespace = "")
        String weightUnit,
        @WebParam(name = "insuredValue", targetNamespace = "")
        String insuredValue,
        @WebParam(name = "insuredCurrency", targetNamespace = "")
        String insuredCurrency,
        @WebParam(name = "codValue", targetNamespace = "")
        String codValue,
        @WebParam(name = "codCurrency", targetNamespace = "")
        String codCurrency,
        @WebParam(name = "customsValue", targetNamespace = "")
        String customsValue,
        @WebParam(name = "customsCurrency", targetNamespace = "")
        String customsCurrency,
        @WebParam(name = "service", targetNamespace = "")
        String service,
        @WebParam(name = "objectType", targetNamespace = "")
        String objectType,
        @WebParam(name = "content1", targetNamespace = "")
        String content1,
        @WebParam(name = "content2", targetNamespace = "")
        String content2,
        @WebParam(name = "content3", targetNamespace = "")
        String content3,
        @WebParam(name = "content4", targetNamespace = "")
        String content4,
        @WebParam(name = "content5", targetNamespace = "")
        String content5,
        @WebParam(name = "portValue", targetNamespace = "")
        String portValue,
        @WebParam(name = "portCurrency", targetNamespace = "")
        String portCurrency,
        @WebParam(name = "skybillRank", targetNamespace = "")
        String skybillRank,
        @WebParam(name = "bulkNumber", targetNamespace = "")
        String bulkNumber,
        @WebParam(name = "mode", targetNamespace = "")
        String mode,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "modeRetour", targetNamespace = "")
        String modeRetour,
        @WebParam(name = "timeSlotStartDate", targetNamespace = "")
        String timeSlotStartDate,
        @WebParam(name = "timeSlotEndDate", targetNamespace = "")
        String timeSlotEndDate,
        @WebParam(name = "timeSlotTariffLevel", targetNamespace = "")
        String timeSlotTariffLevel,
        @WebParam(name = "expirationDate", targetNamespace = "")
        String expirationDate,
        @WebParam(name = "sellByDate", targetNamespace = "")
        String sellByDate);

    /**
     * 
     * @param shipperValue
     * @param customerValue
     * @param recipientValue
     * @param modeRetour
     * @param password
     * @param skybillValue
     * @param headerValue
     * @param esdValue
     * @param refValue
     * @param skybillParamsValue
     * @param version
     * @return
     *     returns fr.chronopost.soap.shipping.cxf.ResultReservationExpeditionValue
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shippingWithESDOnly", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithESDOnly")
    @ResponseWrapper(localName = "shippingWithESDOnlyResponse", targetNamespace = "http://cxf.shipping.soap.chronopost.fr/", className = "fr.chronopost.soap.shipping.cxf.ShippingWithESDOnlyResponse")
    public ResultReservationExpeditionValue shippingWithESDOnly(
        @WebParam(name = "esdValue", targetNamespace = "")
        EsdWithRefClientValue esdValue,
        @WebParam(name = "headerValue", targetNamespace = "")
        HeaderValue headerValue,
        @WebParam(name = "shipperValue", targetNamespace = "")
        ShipperValue shipperValue,
        @WebParam(name = "customerValue", targetNamespace = "")
        CustomerValue customerValue,
        @WebParam(name = "recipientValue", targetNamespace = "")
        RecipientValue recipientValue,
        @WebParam(name = "refValue", targetNamespace = "")
        RefValue refValue,
        @WebParam(name = "skybillValue", targetNamespace = "")
        SkybillValue skybillValue,
        @WebParam(name = "skybillParamsValue", targetNamespace = "")
        SkybillParamsValue skybillParamsValue,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "modeRetour", targetNamespace = "")
        String modeRetour,
        @WebParam(name = "version", targetNamespace = "")
        String version);

}
