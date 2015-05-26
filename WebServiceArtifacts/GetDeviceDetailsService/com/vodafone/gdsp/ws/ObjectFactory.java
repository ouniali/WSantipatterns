
package com.vodafone.gdsp.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vodafone.gdsp.ws package. 
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

    private final static QName _GetDeviceRegistrationDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceRegistrationDetailsResponse");
    private final static QName _GetSmsCommunicationOverviewv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getSmsCommunicationOverviewv2Response");
    private final static QName _GetUserList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getUserList");
    private final static QName _GetSmsCommunicationOverview_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getSmsCommunicationOverview");
    private final static QName _SubmitTransactionalSMSResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitTransactionalSMSResponse");
    private final static QName _GetDeviceLocationDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceLocationDetails");
    private final static QName _SetCustomerServiceProfileDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsResponse");
    private final static QName _GetCustomerDetailsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerDetailsv2");
    private final static QName _GetVpnGroupListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getVpnGroupListResponse");
    private final static QName _GetCustomerSimOrderListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerSimOrderListResponse");
    private final static QName _GetReportDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getReportDetailsResponse");
    private final static QName _GetDeviceRegistrationDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceRegistrationDetails");
    private final static QName _SetCustomerServiceProfileDetailsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv2Response");
    private final static QName _SetDeviceDetailsv4Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsv4Response");
    private final static QName _SetDeviceDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetails");
    private final static QName _GetCustomerServiceProfileDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsResponse");
    private final static QName _SetDeviceDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsResponse");
    private final static QName _GetDeviceLocationHistoryDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceLocationHistoryDetailsResponse");
    private final static QName _SetDeviceCredentials_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceCredentials");
    private final static QName _GetCustomerServiceProfileDetailsv3Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsv3Response");
    private final static QName _GetReportList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getReportList");
    private final static QName _CloneCustomerServiceProfilev4Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev4Response");
    private final static QName _GetCustomerServiceProfileListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileListResponse");
    private final static QName _GetDeviceStateList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceStateList");
    private final static QName _GetReportResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getReportResponse");
    private final static QName _GetFilteredDeviceListv4Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListv4Response");
    private final static QName _GetDeviceHistoryResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceHistoryResponse");
    private final static QName _GetDeviceDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceDetailsResponse");
    private final static QName _GetSmsCommunicationOverviewResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getSmsCommunicationOverviewResponse");
    private final static QName _GetReportListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getReportListResponse");
    private final static QName _UpdateDeviceCredentialsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "updateDeviceCredentialsv2Response");
    private final static QName _GetTransactionList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getTransactionList");
    private final static QName _GetSmsCommunicationOverviewv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getSmsCommunicationOverviewv2");
    private final static QName _UpdateDeviceCredentialsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "updateDeviceCredentialsResponse");
    private final static QName _SetCustomerDetailsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerDetailsv2");
    private final static QName _UpdateDeviceCredentials_QNAME = new QName("http://ws.gdsp.vodafone.com/", "updateDeviceCredentials");
    private final static QName _GetDeviceDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceDetails");
    private final static QName _SetDeviceDetailsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsv2Response");
    private final static QName _SubmitSMS_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitSMS");
    private final static QName _GdspHeader_QNAME = new QName("http://ws.gdsp.vodafone.com/", "gdspHeader");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "createUserResponse");
    private final static QName _GetVpnGroupList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getVpnGroupList");
    private final static QName _GetUserListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getUserListResponse");
    private final static QName _GetCustomerDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerDetails");
    private final static QName _CloneCustomerServiceProfilev2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev2");
    private final static QName _GetDeviceLocationHistoryDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceLocationHistoryDetails");
    private final static QName _SetUserDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setUserDetailsResponse");
    private final static QName _CloneCustomerServiceProfilev5_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev5");
    private final static QName _GetProvisioningProfileListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getProvisioningProfileListResponse");
    private final static QName _CloneCustomerServiceProfilev4_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev4");
    private final static QName _GetCustomerServiceProfileDetailsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsv2Response");
    private final static QName _CloneCustomerServiceProfilev3_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev3");
    private final static QName _GetReportDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getReportDetails");
    private final static QName _SetCustomerServiceProfileDetailsv5Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv5Response");
    private final static QName _SetDeviceCredentialsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceCredentialsResponse");
    private final static QName _CloneCustomerServiceProfileResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfileResponse");
    private final static QName _GetUserDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getUserDetailsResponse");
    private final static QName _GetProvisioningProfileList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getProvisioningProfileList");
    private final static QName _CloneCustomerServiceProfilev5Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev5Response");
    private final static QName _GetCustomerServiceProfileDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetails");
    private final static QName _SetDeviceCredentialsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceCredentialsv2Response");
    private final static QName _GetFilteredDeviceListv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListv2Response");
    private final static QName _GetCustomerServiceProfileList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileList");
    private final static QName _SubmitSMSv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitSMSv2Response");
    private final static QName _SetContactDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setContactDetailsResponse");
    private final static QName _SetDeviceCredentialsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceCredentialsv2");
    private final static QName _SubmitWUTriggerv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitWUTriggerv2Response");
    private final static QName _GetCustomerServiceProfileDetailsv3_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsv3");
    private final static QName _SubmitSMSResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitSMSResponse");
    private final static QName _SetUserDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setUserDetails");
    private final static QName _GetCustomerServiceProfileDetailsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsv2");
    private final static QName _SetCustomerServiceProfileDetailsv4Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv4Response");
    private final static QName _GetTariffList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getTariffList");
    private final static QName _GetCustomerDetailsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerDetailsv2Response");
    private final static QName _SetCustomerDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerDetailsResponse");
    private final static QName _GetCustomerServiceProfileDetailsv4_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsv4");
    private final static QName _SubmitSMSv3_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitSMSv3");
    private final static QName _SubmitSMSv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitSMSv2");
    private final static QName _SetDeviceDetailsv3_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsv3");
    private final static QName _SetDeviceDetailsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsv2");
    private final static QName _SubmitTransactionalSMS_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitTransactionalSMS");
    private final static QName _GetFilteredDeviceListv4_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListv4");
    private final static QName _GetFilteredDeviceListv3_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListv3");
    private final static QName _GetBaseCountryList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getBaseCountryList");
    private final static QName _GetFilteredDeviceListv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListv2");
    private final static QName _CloneCustomerServiceProfilev2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev2Response");
    private final static QName _SetCustomerServiceProfileDetailsv4_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv4");
    private final static QName _SubmitWUTrigger_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitWUTrigger");
    private final static QName _SetCustomerServiceProfileDetailsv5_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv5");
    private final static QName _SetCustomerServiceProfileDetailsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv2");
    private final static QName _SetCustomerServiceProfileDetailsv3_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv3");
    private final static QName _SetDeviceDetailsv4_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsv4");
    private final static QName _SubmitWUTriggerResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitWUTriggerResponse");
    private final static QName _GetFilteredDeviceList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceList");
    private final static QName _GetTariffListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getTariffListResponse");
    private final static QName _GetDeviceDetailsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceDetailsv2");
    private final static QName _SubmitSMSv3Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitSMSv3Response");
    private final static QName _SetCustomerDetailsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerDetailsv2Response");
    private final static QName _GetFilteredDeviceListv3Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListv3Response");
    private final static QName _GetReport_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getReport");
    private final static QName _SetCustomerServiceProfileDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetails");
    private final static QName _GetDeviceStateListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceStateListResponse");
    private final static QName _SetCustomerDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerDetails");
    private final static QName _CloneCustomerServiceProfile_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfile");
    private final static QName _GetDeviceHistory_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceHistory");
    private final static QName _SubmitWUTriggerv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "submitWUTriggerv2");
    private final static QName _GetDeviceLocationDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceLocationDetailsResponse");
    private final static QName _SetCustomerServiceProfileDetailsv3Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setCustomerServiceProfileDetailsv3Response");
    private final static QName _UpdateDeviceCredentialsv2_QNAME = new QName("http://ws.gdsp.vodafone.com/", "updateDeviceCredentialsv2");
    private final static QName _GetCustomerSimOrderList_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerSimOrderList");
    private final static QName _GetContactDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getContactDetailsResponse");
    private final static QName _GetCustomerServiceProfileDetailsv4Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerServiceProfileDetailsv4Response");
    private final static QName _SetDeviceDetailsv3Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setDeviceDetailsv3Response");
    private final static QName _GetTransactionListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getTransactionListResponse");
    private final static QName _GetBaseCountryListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getBaseCountryListResponse");
    private final static QName _GetFilteredDeviceListResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getFilteredDeviceListResponse");
    private final static QName _GetCustomerDetailsResponse_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getCustomerDetailsResponse");
    private final static QName _GetUserDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getUserDetails");
    private final static QName _GetContactDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getContactDetails");
    private final static QName _GetDeviceDetailsv2Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "getDeviceDetailsv2Response");
    private final static QName _CloneCustomerServiceProfilev3Response_QNAME = new QName("http://ws.gdsp.vodafone.com/", "cloneCustomerServiceProfilev3Response");
    private final static QName _CreateUser_QNAME = new QName("http://ws.gdsp.vodafone.com/", "createUser");
    private final static QName _SetContactDetails_QNAME = new QName("http://ws.gdsp.vodafone.com/", "setContactDetails");
    private final static QName _SetDeviceDetailsv3_TypeApnList_QNAME = new QName("", "apnList");
    private final static QName _CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME = new QName("", "linkedProfile");
    private final static QName _CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME = new QName("", "provisioningProfile");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomAttribute5_QNAME = new QName("", "matchCustomAttribute5");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomAttribute4_QNAME = new QName("", "matchCustomAttribute4");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomAttribute3_QNAME = new QName("", "matchCustomAttribute3");
    private final static QName _GetFilteredDeviceListv2_TypeMatchEarliestFirstUsedDate_QNAME = new QName("", "matchEarliestFirstUsedDate");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomAttribute2_QNAME = new QName("", "matchCustomAttribute2");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomAttribute1_QNAME = new QName("", "matchCustomAttribute1");
    private final static QName _GetFilteredDeviceListv2_TypeMatchDeviceState_QNAME = new QName("", "matchDeviceState");
    private final static QName _GetFilteredDeviceListv2_TypeMatchRagStatus_QNAME = new QName("", "matchRagStatus");
    private final static QName _GetFilteredDeviceListv2_TypeMatchImsi_QNAME = new QName("", "matchImsi");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomerOrderNumber_QNAME = new QName("", "matchCustomerOrderNumber");
    private final static QName _GetFilteredDeviceListv2_TypeMatchIccid_QNAME = new QName("", "matchIccid");
    private final static QName _GetFilteredDeviceListv2_TypeMatchCustomerServiceProfiles_QNAME = new QName("", "matchCustomerServiceProfiles");
    private final static QName _GetFilteredDeviceListv2_TypeMatchAlert_QNAME = new QName("", "matchAlert");
    private final static QName _GetFilteredDeviceListv3_TypeMatchMsisdn_QNAME = new QName("", "matchMsisdn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vodafone.gdsp.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProvisioningProfileList_Type }
     * 
     */
    public GetProvisioningProfileList_Type createGetProvisioningProfileList_Type() {
        return new GetProvisioningProfileList_Type();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfileResponse }
     * 
     */
    public CloneCustomerServiceProfileResponse createCloneCustomerServiceProfileResponse() {
        return new CloneCustomerServiceProfileResponse();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileList_Type }
     * 
     */
    public GetCustomerServiceProfileList_Type createGetCustomerServiceProfileList_Type() {
        return new GetCustomerServiceProfileList_Type();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetails_Type }
     * 
     */
    public GetCustomerServiceProfileDetails_Type createGetCustomerServiceProfileDetails_Type() {
        return new GetCustomerServiceProfileDetails_Type();
    }

    /**
     * Create an instance of {@link SetDeviceCredentialsv2Response }
     * 
     */
    public SetDeviceCredentialsv2Response createSetDeviceCredentialsv2Response() {
        return new SetDeviceCredentialsv2Response();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceListResponse }
     * 
     */
    public GetFilteredDeviceListResponse createGetFilteredDeviceListResponse() {
        return new GetFilteredDeviceListResponse();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev5Response }
     * 
     */
    public CloneCustomerServiceProfilev5Response createCloneCustomerServiceProfilev5Response() {
        return new CloneCustomerServiceProfilev5Response();
    }

    /**
     * Create an instance of {@link SubmitSMSv2Response }
     * 
     */
    public SubmitSMSv2Response createSubmitSMSv2Response() {
        return new SubmitSMSv2Response();
    }

    /**
     * Create an instance of {@link SetContactDetailsResponse }
     * 
     */
    public SetContactDetailsResponse createSetContactDetailsResponse() {
        return new SetContactDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsv2Response }
     * 
     */
    public GetCustomerDetailsv2Response createGetCustomerDetailsv2Response() {
        return new GetCustomerDetailsv2Response();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsv2_Type }
     * 
     */
    public GetCustomerServiceProfileDetailsv2_Type createGetCustomerServiceProfileDetailsv2_Type() {
        return new GetCustomerServiceProfileDetailsv2_Type();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv4Response }
     * 
     */
    public SetCustomerServiceProfileDetailsv4Response createSetCustomerServiceProfileDetailsv4Response() {
        return new SetCustomerServiceProfileDetailsv4Response();
    }

    /**
     * Create an instance of {@link GetTariffList_Type }
     * 
     */
    public GetTariffList_Type createGetTariffList_Type() {
        return new GetTariffList_Type();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsv3_Type }
     * 
     */
    public GetCustomerServiceProfileDetailsv3_Type createGetCustomerServiceProfileDetailsv3_Type() {
        return new GetCustomerServiceProfileDetailsv3_Type();
    }

    /**
     * Create an instance of {@link SubmitSMSResponse }
     * 
     */
    public SubmitSMSResponse createSubmitSMSResponse() {
        return new SubmitSMSResponse();
    }

    /**
     * Create an instance of {@link SetUserDetails_Type }
     * 
     */
    public SetUserDetails_Type createSetUserDetails_Type() {
        return new SetUserDetails_Type();
    }

    /**
     * Create an instance of {@link SubmitWUTriggerv2Response }
     * 
     */
    public SubmitWUTriggerv2Response createSubmitWUTriggerv2Response() {
        return new SubmitWUTriggerv2Response();
    }

    /**
     * Create an instance of {@link SetDeviceCredentialsv2 }
     * 
     */
    public SetDeviceCredentialsv2 createSetDeviceCredentialsv2() {
        return new SetDeviceCredentialsv2();
    }

    /**
     * Create an instance of {@link SubmitSMSv2 }
     * 
     */
    public SubmitSMSv2 createSubmitSMSv2() {
        return new SubmitSMSv2();
    }

    /**
     * Create an instance of {@link SubmitSMSv3 }
     * 
     */
    public SubmitSMSv3 createSubmitSMSv3() {
        return new SubmitSMSv3();
    }

    /**
     * Create an instance of {@link SetCustomerDetailsResponse }
     * 
     */
    public SetCustomerDetailsResponse createSetCustomerDetailsResponse() {
        return new SetCustomerDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsv4_Type }
     * 
     */
    public GetCustomerServiceProfileDetailsv4_Type createGetCustomerServiceProfileDetailsv4_Type() {
        return new GetCustomerServiceProfileDetailsv4_Type();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceListv2_Type }
     * 
     */
    public GetFilteredDeviceListv2_Type createGetFilteredDeviceListv2_Type() {
        return new GetFilteredDeviceListv2_Type();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceListv3_Type }
     * 
     */
    public GetFilteredDeviceListv3_Type createGetFilteredDeviceListv3_Type() {
        return new GetFilteredDeviceListv3_Type();
    }

    /**
     * Create an instance of {@link GetBaseCountryList_Type }
     * 
     */
    public GetBaseCountryList_Type createGetBaseCountryList_Type() {
        return new GetBaseCountryList_Type();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceListv4_Type }
     * 
     */
    public GetFilteredDeviceListv4_Type createGetFilteredDeviceListv4_Type() {
        return new GetFilteredDeviceListv4_Type();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv2_Type }
     * 
     */
    public SetDeviceDetailsv2_Type createSetDeviceDetailsv2_Type() {
        return new SetDeviceDetailsv2_Type();
    }

    /**
     * Create an instance of {@link SubmitTransactionalSMS }
     * 
     */
    public SubmitTransactionalSMS createSubmitTransactionalSMS() {
        return new SubmitTransactionalSMS();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv3_Type }
     * 
     */
    public SetDeviceDetailsv3_Type createSetDeviceDetailsv3_Type() {
        return new SetDeviceDetailsv3_Type();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv3_Type }
     * 
     */
    public SetCustomerServiceProfileDetailsv3_Type createSetCustomerServiceProfileDetailsv3_Type() {
        return new SetCustomerServiceProfileDetailsv3_Type();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv4_Type }
     * 
     */
    public SetDeviceDetailsv4_Type createSetDeviceDetailsv4_Type() {
        return new SetDeviceDetailsv4_Type();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv2_Type }
     * 
     */
    public SetCustomerServiceProfileDetailsv2_Type createSetCustomerServiceProfileDetailsv2_Type() {
        return new SetCustomerServiceProfileDetailsv2_Type();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv5_Type }
     * 
     */
    public SetCustomerServiceProfileDetailsv5_Type createSetCustomerServiceProfileDetailsv5_Type() {
        return new SetCustomerServiceProfileDetailsv5_Type();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv4_Type }
     * 
     */
    public SetCustomerServiceProfileDetailsv4_Type createSetCustomerServiceProfileDetailsv4_Type() {
        return new SetCustomerServiceProfileDetailsv4_Type();
    }

    /**
     * Create an instance of {@link SubmitWUTrigger_Type }
     * 
     */
    public SubmitWUTrigger_Type createSubmitWUTrigger_Type() {
        return new SubmitWUTrigger_Type();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev2Response }
     * 
     */
    public CloneCustomerServiceProfilev2Response createCloneCustomerServiceProfilev2Response() {
        return new CloneCustomerServiceProfilev2Response();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceList_Type }
     * 
     */
    public GetFilteredDeviceList_Type createGetFilteredDeviceList_Type() {
        return new GetFilteredDeviceList_Type();
    }

    /**
     * Create an instance of {@link SubmitWUTriggerResponse }
     * 
     */
    public SubmitWUTriggerResponse createSubmitWUTriggerResponse() {
        return new SubmitWUTriggerResponse();
    }

    /**
     * Create an instance of {@link SetCustomerDetailsv2Response }
     * 
     */
    public SetCustomerDetailsv2Response createSetCustomerDetailsv2Response() {
        return new SetCustomerDetailsv2Response();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceListv3Response }
     * 
     */
    public GetFilteredDeviceListv3Response createGetFilteredDeviceListv3Response() {
        return new GetFilteredDeviceListv3Response();
    }

    /**
     * Create an instance of {@link GetReport_Type }
     * 
     */
    public GetReport_Type createGetReport_Type() {
        return new GetReport_Type();
    }

    /**
     * Create an instance of {@link SubmitSMSv3Response }
     * 
     */
    public SubmitSMSv3Response createSubmitSMSv3Response() {
        return new SubmitSMSv3Response();
    }

    /**
     * Create an instance of {@link GetDeviceDetailsv2_Type }
     * 
     */
    public GetDeviceDetailsv2_Type createGetDeviceDetailsv2_Type() {
        return new GetDeviceDetailsv2_Type();
    }

    /**
     * Create an instance of {@link GetTariffListResponse }
     * 
     */
    public GetTariffListResponse createGetTariffListResponse() {
        return new GetTariffListResponse();
    }

    /**
     * Create an instance of {@link SetCustomerDetails_Type }
     * 
     */
    public SetCustomerDetails_Type createSetCustomerDetails_Type() {
        return new SetCustomerDetails_Type();
    }

    /**
     * Create an instance of {@link GetDeviceStateListResponse }
     * 
     */
    public GetDeviceStateListResponse createGetDeviceStateListResponse() {
        return new GetDeviceStateListResponse();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetails_Type }
     * 
     */
    public SetCustomerServiceProfileDetails_Type createSetCustomerServiceProfileDetails_Type() {
        return new SetCustomerServiceProfileDetails_Type();
    }

    /**
     * Create an instance of {@link GetDeviceLocationDetailsResponse }
     * 
     */
    public GetDeviceLocationDetailsResponse createGetDeviceLocationDetailsResponse() {
        return new GetDeviceLocationDetailsResponse();
    }

    /**
     * Create an instance of {@link SubmitWUTriggerv2_Type }
     * 
     */
    public SubmitWUTriggerv2_Type createSubmitWUTriggerv2_Type() {
        return new SubmitWUTriggerv2_Type();
    }

    /**
     * Create an instance of {@link GetDeviceHistory_Type }
     * 
     */
    public GetDeviceHistory_Type createGetDeviceHistory_Type() {
        return new GetDeviceHistory_Type();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfile_Type }
     * 
     */
    public CloneCustomerServiceProfile_Type createCloneCustomerServiceProfile_Type() {
        return new CloneCustomerServiceProfile_Type();
    }

    /**
     * Create an instance of {@link GetCustomerSimOrderList_Type }
     * 
     */
    public GetCustomerSimOrderList_Type createGetCustomerSimOrderList_Type() {
        return new GetCustomerSimOrderList_Type();
    }

    /**
     * Create an instance of {@link UpdateDeviceCredentialsv2 }
     * 
     */
    public UpdateDeviceCredentialsv2 createUpdateDeviceCredentialsv2() {
        return new UpdateDeviceCredentialsv2();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv3Response }
     * 
     */
    public SetCustomerServiceProfileDetailsv3Response createSetCustomerServiceProfileDetailsv3Response() {
        return new SetCustomerServiceProfileDetailsv3Response();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsv4Response }
     * 
     */
    public GetCustomerServiceProfileDetailsv4Response createGetCustomerServiceProfileDetailsv4Response() {
        return new GetCustomerServiceProfileDetailsv4Response();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv3Response }
     * 
     */
    public SetDeviceDetailsv3Response createSetDeviceDetailsv3Response() {
        return new SetDeviceDetailsv3Response();
    }

    /**
     * Create an instance of {@link GetContactDetailsResponse }
     * 
     */
    public GetContactDetailsResponse createGetContactDetailsResponse() {
        return new GetContactDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsResponse }
     * 
     */
    public GetCustomerDetailsResponse createGetCustomerDetailsResponse() {
        return new GetCustomerDetailsResponse();
    }

    /**
     * Create an instance of {@link GetUserDetails_Type }
     * 
     */
    public GetUserDetails_Type createGetUserDetails_Type() {
        return new GetUserDetails_Type();
    }

    /**
     * Create an instance of {@link GetBaseCountryListResponse }
     * 
     */
    public GetBaseCountryListResponse createGetBaseCountryListResponse() {
        return new GetBaseCountryListResponse();
    }

    /**
     * Create an instance of {@link GetTransactionListResponse }
     * 
     */
    public GetTransactionListResponse createGetTransactionListResponse() {
        return new GetTransactionListResponse();
    }

    /**
     * Create an instance of {@link SetContactDetails_Type }
     * 
     */
    public SetContactDetails_Type createSetContactDetails_Type() {
        return new SetContactDetails_Type();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev3Response }
     * 
     */
    public CloneCustomerServiceProfilev3Response createCloneCustomerServiceProfilev3Response() {
        return new CloneCustomerServiceProfilev3Response();
    }

    /**
     * Create an instance of {@link CreateUser_Type }
     * 
     */
    public CreateUser_Type createCreateUser_Type() {
        return new CreateUser_Type();
    }

    /**
     * Create an instance of {@link GetDeviceDetailsv2Response }
     * 
     */
    public GetDeviceDetailsv2Response createGetDeviceDetailsv2Response() {
        return new GetDeviceDetailsv2Response();
    }

    /**
     * Create an instance of {@link GetContactDetails_Type }
     * 
     */
    public GetContactDetails_Type createGetContactDetails_Type() {
        return new GetContactDetails_Type();
    }

    /**
     * Create an instance of {@link GetDeviceLocationDetails_Type }
     * 
     */
    public GetDeviceLocationDetails_Type createGetDeviceLocationDetails_Type() {
        return new GetDeviceLocationDetails_Type();
    }

    /**
     * Create an instance of {@link SubmitTransactionalSMSResponse }
     * 
     */
    public SubmitTransactionalSMSResponse createSubmitTransactionalSMSResponse() {
        return new SubmitTransactionalSMSResponse();
    }

    /**
     * Create an instance of {@link GetSmsCommunicationOverview }
     * 
     */
    public GetSmsCommunicationOverview createGetSmsCommunicationOverview() {
        return new GetSmsCommunicationOverview();
    }

    /**
     * Create an instance of {@link GetUserList_Type }
     * 
     */
    public GetUserList_Type createGetUserList_Type() {
        return new GetUserList_Type();
    }

    /**
     * Create an instance of {@link GetDeviceRegistrationDetailsResponse }
     * 
     */
    public GetDeviceRegistrationDetailsResponse createGetDeviceRegistrationDetailsResponse() {
        return new GetDeviceRegistrationDetailsResponse();
    }

    /**
     * Create an instance of {@link GetSmsCommunicationOverviewv2Response }
     * 
     */
    public GetSmsCommunicationOverviewv2Response createGetSmsCommunicationOverviewv2Response() {
        return new GetSmsCommunicationOverviewv2Response();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsv2_Type }
     * 
     */
    public GetCustomerDetailsv2_Type createGetCustomerDetailsv2_Type() {
        return new GetCustomerDetailsv2_Type();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsResponse }
     * 
     */
    public SetCustomerServiceProfileDetailsResponse createSetCustomerServiceProfileDetailsResponse() {
        return new SetCustomerServiceProfileDetailsResponse();
    }

    /**
     * Create an instance of {@link GetVpnGroupListResponse }
     * 
     */
    public GetVpnGroupListResponse createGetVpnGroupListResponse() {
        return new GetVpnGroupListResponse();
    }

    /**
     * Create an instance of {@link GetDeviceRegistrationDetails_Type }
     * 
     */
    public GetDeviceRegistrationDetails_Type createGetDeviceRegistrationDetails_Type() {
        return new GetDeviceRegistrationDetails_Type();
    }

    /**
     * Create an instance of {@link GetReportDetailsResponse }
     * 
     */
    public GetReportDetailsResponse createGetReportDetailsResponse() {
        return new GetReportDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerSimOrderListResponse }
     * 
     */
    public GetCustomerSimOrderListResponse createGetCustomerSimOrderListResponse() {
        return new GetCustomerSimOrderListResponse();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsResponse }
     * 
     */
    public GetCustomerServiceProfileDetailsResponse createGetCustomerServiceProfileDetailsResponse() {
        return new GetCustomerServiceProfileDetailsResponse();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsResponse }
     * 
     */
    public SetDeviceDetailsResponse createSetDeviceDetailsResponse() {
        return new SetDeviceDetailsResponse();
    }

    /**
     * Create an instance of {@link GetDeviceLocationHistoryDetailsResponse }
     * 
     */
    public GetDeviceLocationHistoryDetailsResponse createGetDeviceLocationHistoryDetailsResponse() {
        return new GetDeviceLocationHistoryDetailsResponse();
    }

    /**
     * Create an instance of {@link SetDeviceDetails_Type }
     * 
     */
    public SetDeviceDetails_Type createSetDeviceDetails_Type() {
        return new SetDeviceDetails_Type();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv4Response }
     * 
     */
    public SetDeviceDetailsv4Response createSetDeviceDetailsv4Response() {
        return new SetDeviceDetailsv4Response();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv2Response }
     * 
     */
    public SetCustomerServiceProfileDetailsv2Response createSetCustomerServiceProfileDetailsv2Response() {
        return new SetCustomerServiceProfileDetailsv2Response();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileListResponse }
     * 
     */
    public GetCustomerServiceProfileListResponse createGetCustomerServiceProfileListResponse() {
        return new GetCustomerServiceProfileListResponse();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev4Response }
     * 
     */
    public CloneCustomerServiceProfilev4Response createCloneCustomerServiceProfilev4Response() {
        return new CloneCustomerServiceProfilev4Response();
    }

    /**
     * Create an instance of {@link GetReportList_Type }
     * 
     */
    public GetReportList_Type createGetReportList_Type() {
        return new GetReportList_Type();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsv3Response }
     * 
     */
    public GetCustomerServiceProfileDetailsv3Response createGetCustomerServiceProfileDetailsv3Response() {
        return new GetCustomerServiceProfileDetailsv3Response();
    }

    /**
     * Create an instance of {@link SetDeviceCredentials }
     * 
     */
    public SetDeviceCredentials createSetDeviceCredentials() {
        return new SetDeviceCredentials();
    }

    /**
     * Create an instance of {@link GetDeviceHistoryResponse }
     * 
     */
    public GetDeviceHistoryResponse createGetDeviceHistoryResponse() {
        return new GetDeviceHistoryResponse();
    }

    /**
     * Create an instance of {@link GetFilteredDeviceListv4Response }
     * 
     */
    public GetFilteredDeviceListv4Response createGetFilteredDeviceListv4Response() {
        return new GetFilteredDeviceListv4Response();
    }

    /**
     * Create an instance of {@link GetReportResponse }
     * 
     */
    public GetReportResponse createGetReportResponse() {
        return new GetReportResponse();
    }

    /**
     * Create an instance of {@link GetDeviceStateList_Type }
     * 
     */
    public GetDeviceStateList_Type createGetDeviceStateList_Type() {
        return new GetDeviceStateList_Type();
    }

    /**
     * Create an instance of {@link UpdateDeviceCredentialsv2Response }
     * 
     */
    public UpdateDeviceCredentialsv2Response createUpdateDeviceCredentialsv2Response() {
        return new UpdateDeviceCredentialsv2Response();
    }

    /**
     * Create an instance of {@link GetTransactionList_Type }
     * 
     */
    public GetTransactionList_Type createGetTransactionList_Type() {
        return new GetTransactionList_Type();
    }

    /**
     * Create an instance of {@link GetReportListResponse }
     * 
     */
    public GetReportListResponse createGetReportListResponse() {
        return new GetReportListResponse();
    }

    /**
     * Create an instance of {@link GetDeviceDetailsResponse }
     * 
     */
    public GetDeviceDetailsResponse createGetDeviceDetailsResponse() {
        return new GetDeviceDetailsResponse();
    }

    /**
     * Create an instance of {@link GetSmsCommunicationOverviewResponse }
     * 
     */
    public GetSmsCommunicationOverviewResponse createGetSmsCommunicationOverviewResponse() {
        return new GetSmsCommunicationOverviewResponse();
    }

    /**
     * Create an instance of {@link UpdateDeviceCredentialsResponse }
     * 
     */
    public UpdateDeviceCredentialsResponse createUpdateDeviceCredentialsResponse() {
        return new UpdateDeviceCredentialsResponse();
    }

    /**
     * Create an instance of {@link GetSmsCommunicationOverviewv2 }
     * 
     */
    public GetSmsCommunicationOverviewv2 createGetSmsCommunicationOverviewv2() {
        return new GetSmsCommunicationOverviewv2();
    }

    /**
     * Create an instance of {@link SetCustomerDetailsv2_Type }
     * 
     */
    public SetCustomerDetailsv2_Type createSetCustomerDetailsv2_Type() {
        return new SetCustomerDetailsv2_Type();
    }

    /**
     * Create an instance of {@link UpdateDeviceCredentials }
     * 
     */
    public UpdateDeviceCredentials createUpdateDeviceCredentials() {
        return new UpdateDeviceCredentials();
    }

    /**
     * Create an instance of {@link GetDeviceDetails_Type }
     * 
     */
    public GetDeviceDetails_Type createGetDeviceDetails_Type() {
        return new GetDeviceDetails_Type();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv2Response }
     * 
     */
    public SetDeviceDetailsv2Response createSetDeviceDetailsv2Response() {
        return new SetDeviceDetailsv2Response();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetVpnGroupList_Type }
     * 
     */
    public GetVpnGroupList_Type createGetVpnGroupList_Type() {
        return new GetVpnGroupList_Type();
    }

    /**
     * Create an instance of {@link GdspHeader }
     * 
     */
    public GdspHeader createGdspHeader() {
        return new GdspHeader();
    }

    /**
     * Create an instance of {@link SubmitSMS }
     * 
     */
    public SubmitSMS createSubmitSMS() {
        return new SubmitSMS();
    }

    /**
     * Create an instance of {@link GetUserListResponse }
     * 
     */
    public GetUserListResponse createGetUserListResponse() {
        return new GetUserListResponse();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileDetailsv2Response }
     * 
     */
    public GetCustomerServiceProfileDetailsv2Response createGetCustomerServiceProfileDetailsv2Response() {
        return new GetCustomerServiceProfileDetailsv2Response();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev3_Type }
     * 
     */
    public CloneCustomerServiceProfilev3_Type createCloneCustomerServiceProfilev3_Type() {
        return new CloneCustomerServiceProfilev3_Type();
    }

    /**
     * Create an instance of {@link GetReportDetails_Type }
     * 
     */
    public GetReportDetails_Type createGetReportDetails_Type() {
        return new GetReportDetails_Type();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev4_Type }
     * 
     */
    public CloneCustomerServiceProfilev4_Type createCloneCustomerServiceProfilev4_Type() {
        return new CloneCustomerServiceProfilev4_Type();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev5_Type }
     * 
     */
    public CloneCustomerServiceProfilev5_Type createCloneCustomerServiceProfilev5_Type() {
        return new CloneCustomerServiceProfilev5_Type();
    }

    /**
     * Create an instance of {@link GetProvisioningProfileListResponse }
     * 
     */
    public GetProvisioningProfileListResponse createGetProvisioningProfileListResponse() {
        return new GetProvisioningProfileListResponse();
    }

    /**
     * Create an instance of {@link SetUserDetailsResponse }
     * 
     */
    public SetUserDetailsResponse createSetUserDetailsResponse() {
        return new SetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link GetDeviceLocationHistoryDetails_Type }
     * 
     */
    public GetDeviceLocationHistoryDetails_Type createGetDeviceLocationHistoryDetails_Type() {
        return new GetDeviceLocationHistoryDetails_Type();
    }

    /**
     * Create an instance of {@link GetCustomerDetails_Type }
     * 
     */
    public GetCustomerDetails_Type createGetCustomerDetails_Type() {
        return new GetCustomerDetails_Type();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev2_Type }
     * 
     */
    public CloneCustomerServiceProfilev2_Type createCloneCustomerServiceProfilev2_Type() {
        return new CloneCustomerServiceProfilev2_Type();
    }

    /**
     * Create an instance of {@link SetDeviceCredentialsResponse }
     * 
     */
    public SetDeviceCredentialsResponse createSetDeviceCredentialsResponse() {
        return new SetDeviceCredentialsResponse();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv5Response }
     * 
     */
    public SetCustomerServiceProfileDetailsv5Response createSetCustomerServiceProfileDetailsv5Response() {
        return new SetCustomerServiceProfileDetailsv5Response();
    }

    /**
     * Create an instance of {@link GetReportDetailsResponseItem }
     * 
     */
    public GetReportDetailsResponseItem createGetReportDetailsResponseItem() {
        return new GetReportDetailsResponseItem();
    }

    /**
     * Create an instance of {@link TParameterGroup }
     * 
     */
    public TParameterGroup createTParameterGroup() {
        return new TParameterGroup();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link TReportList }
     * 
     */
    public TReportList createTReportList() {
        return new TReportList();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev3ResponseDetails }
     * 
     */
    public CloneCustomerServiceProfilev3ResponseDetails createCloneCustomerServiceProfilev3ResponseDetails() {
        return new CloneCustomerServiceProfilev3ResponseDetails();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsResponseBody }
     * 
     */
    public SetCustomerServiceProfileDetailsResponseBody createSetCustomerServiceProfileDetailsResponseBody() {
        return new SetCustomerServiceProfileDetailsResponseBody();
    }

    /**
     * Create an instance of {@link TTransactionItem }
     * 
     */
    public TTransactionItem createTTransactionItem() {
        return new TTransactionItem();
    }

    /**
     * Create an instance of {@link CustomerInfov2 }
     * 
     */
    public CustomerInfov2 createCustomerInfov2() {
        return new CustomerInfov2();
    }

    /**
     * Create an instance of {@link GetVpnGroupListResponseItem }
     * 
     */
    public GetVpnGroupListResponseItem createGetVpnGroupListResponseItem() {
        return new GetVpnGroupListResponseItem();
    }

    /**
     * Create an instance of {@link TProvisioningProfileItem }
     * 
     */
    public TProvisioningProfileItem createTProvisioningProfileItem() {
        return new TProvisioningProfileItem();
    }

    /**
     * Create an instance of {@link TBaseCountryItem }
     * 
     */
    public TBaseCountryItem createTBaseCountryItem() {
        return new TBaseCountryItem();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfileResponseDetails }
     * 
     */
    public CloneCustomerServiceProfileResponseDetails createCloneCustomerServiceProfileResponseDetails() {
        return new CloneCustomerServiceProfileResponseDetails();
    }

    /**
     * Create an instance of {@link SetContactDetailsResponseItem }
     * 
     */
    public SetContactDetailsResponseItem createSetContactDetailsResponseItem() {
        return new SetContactDetailsResponseItem();
    }

    /**
     * Create an instance of {@link DeviceStateResponse }
     * 
     */
    public DeviceStateResponse createDeviceStateResponse() {
        return new DeviceStateResponse();
    }

    /**
     * Create an instance of {@link TCredentialItem }
     * 
     */
    public TCredentialItem createTCredentialItem() {
        return new TCredentialItem();
    }

    /**
     * Create an instance of {@link TCustomerServiceProfile }
     * 
     */
    public TCustomerServiceProfile createTCustomerServiceProfile() {
        return new TCustomerServiceProfile();
    }

    /**
     * Create an instance of {@link GetDeviceLocationHistoryDetailsResponseItem }
     * 
     */
    public GetDeviceLocationHistoryDetailsResponseItem createGetDeviceLocationHistoryDetailsResponseItem() {
        return new GetDeviceLocationHistoryDetailsResponseItem();
    }

    /**
     * Create an instance of {@link SetCustomerDetailsv2ResponseItem }
     * 
     */
    public SetCustomerDetailsv2ResponseItem createSetCustomerDetailsv2ResponseItem() {
        return new SetCustomerDetailsv2ResponseItem();
    }

    /**
     * Create an instance of {@link TTransaction }
     * 
     */
    public TTransaction createTTransaction() {
        return new TTransaction();
    }

    /**
     * Create an instance of {@link TDeviceInformationList }
     * 
     */
    public TDeviceInformationList createTDeviceInformationList() {
        return new TDeviceInformationList();
    }

    /**
     * Create an instance of {@link GetUserListResponseItem }
     * 
     */
    public GetUserListResponseItem createGetUserListResponseItem() {
        return new GetUserListResponseItem();
    }

    /**
     * Create an instance of {@link TAlertTypeList }
     * 
     */
    public TAlertTypeList createTAlertTypeList() {
        return new TAlertTypeList();
    }

    /**
     * Create an instance of {@link RegistrationStatusInformation }
     * 
     */
    public RegistrationStatusInformation createRegistrationStatusInformation() {
        return new RegistrationStatusInformation();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsResponseItem }
     * 
     */
    public SetDeviceDetailsResponseItem createSetDeviceDetailsResponseItem() {
        return new SetDeviceDetailsResponseItem();
    }

    /**
     * Create an instance of {@link TGetReportParameterList }
     * 
     */
    public TGetReportParameterList createTGetReportParameterList() {
        return new TGetReportParameterList();
    }

    /**
     * Create an instance of {@link TBaseCountry }
     * 
     */
    public TBaseCountry createTBaseCountry() {
        return new TBaseCountry();
    }

    /**
     * Create an instance of {@link TReportDetails }
     * 
     */
    public TReportDetails createTReportDetails() {
        return new TReportDetails();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev4ResponseDetails }
     * 
     */
    public CloneCustomerServiceProfilev4ResponseDetails createCloneCustomerServiceProfilev4ResponseDetails() {
        return new CloneCustomerServiceProfilev4ResponseDetails();
    }

    /**
     * Create an instance of {@link SmsCommunication }
     * 
     */
    public SmsCommunication createSmsCommunication() {
        return new SmsCommunication();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponseItem }
     * 
     */
    public GetUserDetailsResponseItem createGetUserDetailsResponseItem() {
        return new GetUserDetailsResponseItem();
    }

    /**
     * Create an instance of {@link ProvisioningProfileResponse }
     * 
     */
    public ProvisioningProfileResponse createProvisioningProfileResponse() {
        return new ProvisioningProfileResponse();
    }

    /**
     * Create an instance of {@link FilteredDeviceListv4Response }
     * 
     */
    public FilteredDeviceListv4Response createFilteredDeviceListv4Response() {
        return new FilteredDeviceListv4Response();
    }

    /**
     * Create an instance of {@link WuTriggerv2Response }
     * 
     */
    public WuTriggerv2Response createWuTriggerv2Response() {
        return new WuTriggerv2Response();
    }

    /**
     * Create an instance of {@link SetCustomerDetailsResponseItem }
     * 
     */
    public SetCustomerDetailsResponseItem createSetCustomerDetailsResponseItem() {
        return new SetCustomerDetailsResponseItem();
    }

    /**
     * Create an instance of {@link GetContactDetailsResponseItem }
     * 
     */
    public GetContactDetailsResponseItem createGetContactDetailsResponseItem() {
        return new GetContactDetailsResponseItem();
    }

    /**
     * Create an instance of {@link TCustomerOrderNumberList }
     * 
     */
    public TCustomerOrderNumberList createTCustomerOrderNumberList() {
        return new TCustomerOrderNumberList();
    }

    /**
     * Create an instance of {@link TReportItem }
     * 
     */
    public TReportItem createTReportItem() {
        return new TReportItem();
    }

    /**
     * Create an instance of {@link TParameterDetails }
     * 
     */
    public TParameterDetails createTParameterDetails() {
        return new TParameterDetails();
    }

    /**
     * Create an instance of {@link ReportListResponse }
     * 
     */
    public ReportListResponse createReportListResponse() {
        return new ReportListResponse();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev2ResponseDetails }
     * 
     */
    public CloneCustomerServiceProfilev2ResponseDetails createCloneCustomerServiceProfilev2ResponseDetails() {
        return new CloneCustomerServiceProfilev2ResponseDetails();
    }

    /**
     * Create an instance of {@link TDeviceHistoryItem }
     * 
     */
    public TDeviceHistoryItem createTDeviceHistoryItem() {
        return new TDeviceHistoryItem();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link TCustomerOrder }
     * 
     */
    public TCustomerOrder createTCustomerOrder() {
        return new TCustomerOrder();
    }

    /**
     * Create an instance of {@link FilteredDeviceListResponse }
     * 
     */
    public FilteredDeviceListResponse createFilteredDeviceListResponse() {
        return new FilteredDeviceListResponse();
    }

    /**
     * Create an instance of {@link ReturnCode }
     * 
     */
    public ReturnCode createReturnCode() {
        return new ReturnCode();
    }

    /**
     * Create an instance of {@link TCredentialList }
     * 
     */
    public TCredentialList createTCredentialList() {
        return new TCredentialList();
    }

    /**
     * Create an instance of {@link TCustomAttributeList }
     * 
     */
    public TCustomAttributeList createTCustomAttributeList() {
        return new TCustomAttributeList();
    }

    /**
     * Create an instance of {@link TariffResponse }
     * 
     */
    public TariffResponse createTariffResponse() {
        return new TariffResponse();
    }

    /**
     * Create an instance of {@link TImsiList }
     * 
     */
    public TImsiList createTImsiList() {
        return new TImsiList();
    }

    /**
     * Create an instance of {@link TransactionResponse }
     * 
     */
    public TransactionResponse createTransactionResponse() {
        return new TransactionResponse();
    }

    /**
     * Create an instance of {@link GetDeviceDetailsResponseItem }
     * 
     */
    public GetDeviceDetailsResponseItem createGetDeviceDetailsResponseItem() {
        return new GetDeviceDetailsResponseItem();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfilev2ResponseDetails }
     * 
     */
    public GetCustomerServiceProfilev2ResponseDetails createGetCustomerServiceProfilev2ResponseDetails() {
        return new GetCustomerServiceProfilev2ResponseDetails();
    }

    /**
     * Create an instance of {@link CloneCustomerServiceProfilev5ResponseDetails }
     * 
     */
    public CloneCustomerServiceProfilev5ResponseDetails createCloneCustomerServiceProfilev5ResponseDetails() {
        return new CloneCustomerServiceProfilev5ResponseDetails();
    }

    /**
     * Create an instance of {@link RegistrationStatusInformationSection }
     * 
     */
    public RegistrationStatusInformationSection createRegistrationStatusInformationSection() {
        return new RegistrationStatusInformationSection();
    }

    /**
     * Create an instance of {@link TIccidList }
     * 
     */
    public TIccidList createTIccidList() {
        return new TIccidList();
    }

    /**
     * Create an instance of {@link Smsv3Response }
     * 
     */
    public Smsv3Response createSmsv3Response() {
        return new Smsv3Response();
    }

    /**
     * Create an instance of {@link DeviceLocation }
     * 
     */
    public DeviceLocation createDeviceLocation() {
        return new DeviceLocation();
    }

    /**
     * Create an instance of {@link CustomerSimOrderListResponse }
     * 
     */
    public CustomerSimOrderListResponse createCustomerSimOrderListResponse() {
        return new CustomerSimOrderListResponse();
    }

    /**
     * Create an instance of {@link GetReportResponseItem }
     * 
     */
    public GetReportResponseItem createGetReportResponseItem() {
        return new GetReportResponseItem();
    }

    /**
     * Create an instance of {@link TState }
     * 
     */
    public TState createTState() {
        return new TState();
    }

    /**
     * Create an instance of {@link TGetReportParameterItem }
     * 
     */
    public TGetReportParameterItem createTGetReportParameterItem() {
        return new TGetReportParameterItem();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv5ResponseBody }
     * 
     */
    public SetCustomerServiceProfileDetailsv5ResponseBody createSetCustomerServiceProfileDetailsv5ResponseBody() {
        return new SetCustomerServiceProfileDetailsv5ResponseBody();
    }

    /**
     * Create an instance of {@link DeviceLocationHistory }
     * 
     */
    public DeviceLocationHistory createDeviceLocationHistory() {
        return new DeviceLocationHistory();
    }

    /**
     * Create an instance of {@link CApnProfileItem }
     * 
     */
    public CApnProfileItem createCApnProfileItem() {
        return new CApnProfileItem();
    }

    /**
     * Create an instance of {@link TUser }
     * 
     */
    public TUser createTUser() {
        return new TUser();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv3ResponseItem }
     * 
     */
    public SetDeviceDetailsv3ResponseItem createSetDeviceDetailsv3ResponseItem() {
        return new SetDeviceDetailsv3ResponseItem();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv3ResponseBody }
     * 
     */
    public SetCustomerServiceProfileDetailsv3ResponseBody createSetCustomerServiceProfileDetailsv3ResponseBody() {
        return new SetCustomerServiceProfileDetailsv3ResponseBody();
    }

    /**
     * Create an instance of {@link UCredentialList }
     * 
     */
    public UCredentialList createUCredentialList() {
        return new UCredentialList();
    }

    /**
     * Create an instance of {@link SmsResponse }
     * 
     */
    public SmsResponse createSmsResponse() {
        return new SmsResponse();
    }

    /**
     * Create an instance of {@link DeviceCredentialsResponse }
     * 
     */
    public DeviceCredentialsResponse createDeviceCredentialsResponse() {
        return new DeviceCredentialsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsv2ResponseItem }
     * 
     */
    public GetCustomerDetailsv2ResponseItem createGetCustomerDetailsv2ResponseItem() {
        return new GetCustomerDetailsv2ResponseItem();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link CustomerSimOrderListItem }
     * 
     */
    public CustomerSimOrderListItem createCustomerSimOrderListItem() {
        return new CustomerSimOrderListItem();
    }

    /**
     * Create an instance of {@link TProvisioningProfile }
     * 
     */
    public TProvisioningProfile createTProvisioningProfile() {
        return new TProvisioningProfile();
    }

    /**
     * Create an instance of {@link VpnGroupItem }
     * 
     */
    public VpnGroupItem createVpnGroupItem() {
        return new VpnGroupItem();
    }

    /**
     * Create an instance of {@link TDevicev3 }
     * 
     */
    public TDevicev3 createTDevicev3() {
        return new TDevicev3();
    }

    /**
     * Create an instance of {@link TDevicev2 }
     * 
     */
    public TDevicev2 createTDevicev2() {
        return new TDevicev2();
    }

    /**
     * Create an instance of {@link GetSmsCommunicationOverviewv2ResponseItem }
     * 
     */
    public GetSmsCommunicationOverviewv2ResponseItem createGetSmsCommunicationOverviewv2ResponseItem() {
        return new GetSmsCommunicationOverviewv2ResponseItem();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfilev3ResponseDetails }
     * 
     */
    public GetCustomerServiceProfilev3ResponseDetails createGetCustomerServiceProfilev3ResponseDetails() {
        return new GetCustomerServiceProfilev3ResponseDetails();
    }

    /**
     * Create an instance of {@link TMsisdnList }
     * 
     */
    public TMsisdnList createTMsisdnList() {
        return new TMsisdnList();
    }

    /**
     * Create an instance of {@link TFormatDetails }
     * 
     */
    public TFormatDetails createTFormatDetails() {
        return new TFormatDetails();
    }

    /**
     * Create an instance of {@link TVpnGroup }
     * 
     */
    public TVpnGroup createTVpnGroup() {
        return new TVpnGroup();
    }

    /**
     * Create an instance of {@link TStateItem }
     * 
     */
    public TStateItem createTStateItem() {
        return new TStateItem();
    }

    /**
     * Create an instance of {@link UCredentialListItem }
     * 
     */
    public UCredentialListItem createUCredentialListItem() {
        return new UCredentialListItem();
    }

    /**
     * Create an instance of {@link TDeviceList }
     * 
     */
    public TDeviceList createTDeviceList() {
        return new TDeviceList();
    }

    /**
     * Create an instance of {@link ApnCredentialResponse }
     * 
     */
    public ApnCredentialResponse createApnCredentialResponse() {
        return new ApnCredentialResponse();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileResponseDetails }
     * 
     */
    public GetCustomerServiceProfileResponseDetails createGetCustomerServiceProfileResponseDetails() {
        return new GetCustomerServiceProfileResponseDetails();
    }

    /**
     * Create an instance of {@link TDeviceListv2 }
     * 
     */
    public TDeviceListv2 createTDeviceListv2() {
        return new TDeviceListv2();
    }

    /**
     * Create an instance of {@link TDeviceListv3 }
     * 
     */
    public TDeviceListv3 createTDeviceListv3() {
        return new TDeviceListv3();
    }

    /**
     * Create an instance of {@link TUserList }
     * 
     */
    public TUserList createTUserList() {
        return new TUserList();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfileListResponseBody }
     * 
     */
    public GetCustomerServiceProfileListResponseBody createGetCustomerServiceProfileListResponseBody() {
        return new GetCustomerServiceProfileListResponseBody();
    }

    /**
     * Create an instance of {@link GetDeviceRegistrationDetailsResponseItem }
     * 
     */
    public GetDeviceRegistrationDetailsResponseItem createGetDeviceRegistrationDetailsResponseItem() {
        return new GetDeviceRegistrationDetailsResponseItem();
    }

    /**
     * Create an instance of {@link GetDeviceLocationDetailsResponseItem }
     * 
     */
    public GetDeviceLocationDetailsResponseItem createGetDeviceLocationDetailsResponseItem() {
        return new GetDeviceLocationDetailsResponseItem();
    }

    /**
     * Create an instance of {@link GdspCredentials }
     * 
     */
    public GdspCredentials createGdspCredentials() {
        return new GdspCredentials();
    }

    /**
     * Create an instance of {@link GetSmsCommunicationOverviewResponseItem }
     * 
     */
    public GetSmsCommunicationOverviewResponseItem createGetSmsCommunicationOverviewResponseItem() {
        return new GetSmsCommunicationOverviewResponseItem();
    }

    /**
     * Create an instance of {@link TTariff }
     * 
     */
    public TTariff createTTariff() {
        return new TTariff();
    }

    /**
     * Create an instance of {@link BaseCountryResponse }
     * 
     */
    public BaseCountryResponse createBaseCountryResponse() {
        return new BaseCountryResponse();
    }

    /**
     * Create an instance of {@link GetDeviceDetailsv2ResponseItem }
     * 
     */
    public GetDeviceDetailsv2ResponseItem createGetDeviceDetailsv2ResponseItem() {
        return new GetDeviceDetailsv2ResponseItem();
    }

    /**
     * Create an instance of {@link UserDetailsResponse }
     * 
     */
    public UserDetailsResponse createUserDetailsResponse() {
        return new UserDetailsResponse();
    }

    /**
     * Create an instance of {@link TDeviceStateList }
     * 
     */
    public TDeviceStateList createTDeviceStateList() {
        return new TDeviceStateList();
    }

    /**
     * Create an instance of {@link TCustomerServiceProfileItem }
     * 
     */
    public TCustomerServiceProfileItem createTCustomerServiceProfileItem() {
        return new TCustomerServiceProfileItem();
    }

    /**
     * Create an instance of {@link DeviceHistoryResponse }
     * 
     */
    public DeviceHistoryResponse createDeviceHistoryResponse() {
        return new DeviceHistoryResponse();
    }

    /**
     * Create an instance of {@link TRagStateList }
     * 
     */
    public TRagStateList createTRagStateList() {
        return new TRagStateList();
    }

    /**
     * Create an instance of {@link CreateUserResponseItem }
     * 
     */
    public CreateUserResponseItem createCreateUserResponseItem() {
        return new CreateUserResponseItem();
    }

    /**
     * Create an instance of {@link TTariffItem }
     * 
     */
    public TTariffItem createTTariffItem() {
        return new TTariffItem();
    }

    /**
     * Create an instance of {@link GetCustomerServiceProfilev4ResponseDetails }
     * 
     */
    public GetCustomerServiceProfilev4ResponseDetails createGetCustomerServiceProfilev4ResponseDetails() {
        return new GetCustomerServiceProfilev4ResponseDetails();
    }

    /**
     * Create an instance of {@link CApnProfile }
     * 
     */
    public CApnProfile createCApnProfile() {
        return new CApnProfile();
    }

    /**
     * Create an instance of {@link TDevice }
     * 
     */
    public TDevice createTDevice() {
        return new TDevice();
    }

    /**
     * Create an instance of {@link FilteredDeviceListv3Response }
     * 
     */
    public FilteredDeviceListv3Response createFilteredDeviceListv3Response() {
        return new FilteredDeviceListv3Response();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv2ResponseItem }
     * 
     */
    public SetDeviceDetailsv2ResponseItem createSetDeviceDetailsv2ResponseItem() {
        return new SetDeviceDetailsv2ResponseItem();
    }

    /**
     * Create an instance of {@link SetDeviceDetailsv4ResponseItem }
     * 
     */
    public SetDeviceDetailsv4ResponseItem createSetDeviceDetailsv4ResponseItem() {
        return new SetDeviceDetailsv4ResponseItem();
    }

    /**
     * Create an instance of {@link TCustomerServiceProfileList }
     * 
     */
    public TCustomerServiceProfileList createTCustomerServiceProfileList() {
        return new TCustomerServiceProfileList();
    }

    /**
     * Create an instance of {@link SmsCommunicationv2 }
     * 
     */
    public SmsCommunicationv2 createSmsCommunicationv2() {
        return new SmsCommunicationv2();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv4ResponseBody }
     * 
     */
    public SetCustomerServiceProfileDetailsv4ResponseBody createSetCustomerServiceProfileDetailsv4ResponseBody() {
        return new SetCustomerServiceProfileDetailsv4ResponseBody();
    }

    /**
     * Create an instance of {@link SubmitTransactionalSMSResponseItem }
     * 
     */
    public SubmitTransactionalSMSResponseItem createSubmitTransactionalSMSResponseItem() {
        return new SubmitTransactionalSMSResponseItem();
    }

    /**
     * Create an instance of {@link SetCustomerServiceProfileDetailsv2ResponseBody }
     * 
     */
    public SetCustomerServiceProfileDetailsv2ResponseBody createSetCustomerServiceProfileDetailsv2ResponseBody() {
        return new SetCustomerServiceProfileDetailsv2ResponseBody();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsResponseItem }
     * 
     */
    public GetCustomerDetailsResponseItem createGetCustomerDetailsResponseItem() {
        return new GetCustomerDetailsResponseItem();
    }

    /**
     * Create an instance of {@link DeviceCredentialsResponsev2 }
     * 
     */
    public DeviceCredentialsResponsev2 createDeviceCredentialsResponsev2() {
        return new DeviceCredentialsResponsev2();
    }

    /**
     * Create an instance of {@link TDeviceInformationItem }
     * 
     */
    public TDeviceInformationItem createTDeviceInformationItem() {
        return new TDeviceInformationItem();
    }

    /**
     * Create an instance of {@link RegistrationStatusInformationSectionParam }
     * 
     */
    public RegistrationStatusInformationSectionParam createRegistrationStatusInformationSectionParam() {
        return new RegistrationStatusInformationSectionParam();
    }

    /**
     * Create an instance of {@link Smsv2Response }
     * 
     */
    public Smsv2Response createSmsv2Response() {
        return new Smsv2Response();
    }

    /**
     * Create an instance of {@link TDeviceHistory }
     * 
     */
    public TDeviceHistory createTDeviceHistory() {
        return new TDeviceHistory();
    }

    /**
     * Create an instance of {@link WuTriggerResponse }
     * 
     */
    public WuTriggerResponse createWuTriggerResponse() {
        return new WuTriggerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceRegistrationDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceRegistrationDetailsResponse")
    public JAXBElement<GetDeviceRegistrationDetailsResponse> createGetDeviceRegistrationDetailsResponse(GetDeviceRegistrationDetailsResponse value) {
        return new JAXBElement<GetDeviceRegistrationDetailsResponse>(_GetDeviceRegistrationDetailsResponse_QNAME, GetDeviceRegistrationDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsCommunicationOverviewv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getSmsCommunicationOverviewv2Response")
    public JAXBElement<GetSmsCommunicationOverviewv2Response> createGetSmsCommunicationOverviewv2Response(GetSmsCommunicationOverviewv2Response value) {
        return new JAXBElement<GetSmsCommunicationOverviewv2Response>(_GetSmsCommunicationOverviewv2Response_QNAME, GetSmsCommunicationOverviewv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getUserList")
    public JAXBElement<GetUserList_Type> createGetUserList(GetUserList_Type value) {
        return new JAXBElement<GetUserList_Type>(_GetUserList_QNAME, GetUserList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsCommunicationOverview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getSmsCommunicationOverview")
    public JAXBElement<GetSmsCommunicationOverview> createGetSmsCommunicationOverview(GetSmsCommunicationOverview value) {
        return new JAXBElement<GetSmsCommunicationOverview>(_GetSmsCommunicationOverview_QNAME, GetSmsCommunicationOverview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitTransactionalSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitTransactionalSMSResponse")
    public JAXBElement<SubmitTransactionalSMSResponse> createSubmitTransactionalSMSResponse(SubmitTransactionalSMSResponse value) {
        return new JAXBElement<SubmitTransactionalSMSResponse>(_SubmitTransactionalSMSResponse_QNAME, SubmitTransactionalSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceLocationDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceLocationDetails")
    public JAXBElement<GetDeviceLocationDetails_Type> createGetDeviceLocationDetails(GetDeviceLocationDetails_Type value) {
        return new JAXBElement<GetDeviceLocationDetails_Type>(_GetDeviceLocationDetails_QNAME, GetDeviceLocationDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsResponse")
    public JAXBElement<SetCustomerServiceProfileDetailsResponse> createSetCustomerServiceProfileDetailsResponse(SetCustomerServiceProfileDetailsResponse value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsResponse>(_SetCustomerServiceProfileDetailsResponse_QNAME, SetCustomerServiceProfileDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerDetailsv2")
    public JAXBElement<GetCustomerDetailsv2_Type> createGetCustomerDetailsv2(GetCustomerDetailsv2_Type value) {
        return new JAXBElement<GetCustomerDetailsv2_Type>(_GetCustomerDetailsv2_QNAME, GetCustomerDetailsv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVpnGroupListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getVpnGroupListResponse")
    public JAXBElement<GetVpnGroupListResponse> createGetVpnGroupListResponse(GetVpnGroupListResponse value) {
        return new JAXBElement<GetVpnGroupListResponse>(_GetVpnGroupListResponse_QNAME, GetVpnGroupListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerSimOrderListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerSimOrderListResponse")
    public JAXBElement<GetCustomerSimOrderListResponse> createGetCustomerSimOrderListResponse(GetCustomerSimOrderListResponse value) {
        return new JAXBElement<GetCustomerSimOrderListResponse>(_GetCustomerSimOrderListResponse_QNAME, GetCustomerSimOrderListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getReportDetailsResponse")
    public JAXBElement<GetReportDetailsResponse> createGetReportDetailsResponse(GetReportDetailsResponse value) {
        return new JAXBElement<GetReportDetailsResponse>(_GetReportDetailsResponse_QNAME, GetReportDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceRegistrationDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceRegistrationDetails")
    public JAXBElement<GetDeviceRegistrationDetails_Type> createGetDeviceRegistrationDetails(GetDeviceRegistrationDetails_Type value) {
        return new JAXBElement<GetDeviceRegistrationDetails_Type>(_GetDeviceRegistrationDetails_QNAME, GetDeviceRegistrationDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv2Response")
    public JAXBElement<SetCustomerServiceProfileDetailsv2Response> createSetCustomerServiceProfileDetailsv2Response(SetCustomerServiceProfileDetailsv2Response value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv2Response>(_SetCustomerServiceProfileDetailsv2Response_QNAME, SetCustomerServiceProfileDetailsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsv4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsv4Response")
    public JAXBElement<SetDeviceDetailsv4Response> createSetDeviceDetailsv4Response(SetDeviceDetailsv4Response value) {
        return new JAXBElement<SetDeviceDetailsv4Response>(_SetDeviceDetailsv4Response_QNAME, SetDeviceDetailsv4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetails")
    public JAXBElement<SetDeviceDetails_Type> createSetDeviceDetails(SetDeviceDetails_Type value) {
        return new JAXBElement<SetDeviceDetails_Type>(_SetDeviceDetails_QNAME, SetDeviceDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsResponse")
    public JAXBElement<GetCustomerServiceProfileDetailsResponse> createGetCustomerServiceProfileDetailsResponse(GetCustomerServiceProfileDetailsResponse value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsResponse>(_GetCustomerServiceProfileDetailsResponse_QNAME, GetCustomerServiceProfileDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsResponse")
    public JAXBElement<SetDeviceDetailsResponse> createSetDeviceDetailsResponse(SetDeviceDetailsResponse value) {
        return new JAXBElement<SetDeviceDetailsResponse>(_SetDeviceDetailsResponse_QNAME, SetDeviceDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceLocationHistoryDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceLocationHistoryDetailsResponse")
    public JAXBElement<GetDeviceLocationHistoryDetailsResponse> createGetDeviceLocationHistoryDetailsResponse(GetDeviceLocationHistoryDetailsResponse value) {
        return new JAXBElement<GetDeviceLocationHistoryDetailsResponse>(_GetDeviceLocationHistoryDetailsResponse_QNAME, GetDeviceLocationHistoryDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceCredentials")
    public JAXBElement<SetDeviceCredentials> createSetDeviceCredentials(SetDeviceCredentials value) {
        return new JAXBElement<SetDeviceCredentials>(_SetDeviceCredentials_QNAME, SetDeviceCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsv3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsv3Response")
    public JAXBElement<GetCustomerServiceProfileDetailsv3Response> createGetCustomerServiceProfileDetailsv3Response(GetCustomerServiceProfileDetailsv3Response value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsv3Response>(_GetCustomerServiceProfileDetailsv3Response_QNAME, GetCustomerServiceProfileDetailsv3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getReportList")
    public JAXBElement<GetReportList_Type> createGetReportList(GetReportList_Type value) {
        return new JAXBElement<GetReportList_Type>(_GetReportList_QNAME, GetReportList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev4Response")
    public JAXBElement<CloneCustomerServiceProfilev4Response> createCloneCustomerServiceProfilev4Response(CloneCustomerServiceProfilev4Response value) {
        return new JAXBElement<CloneCustomerServiceProfilev4Response>(_CloneCustomerServiceProfilev4Response_QNAME, CloneCustomerServiceProfilev4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileListResponse")
    public JAXBElement<GetCustomerServiceProfileListResponse> createGetCustomerServiceProfileListResponse(GetCustomerServiceProfileListResponse value) {
        return new JAXBElement<GetCustomerServiceProfileListResponse>(_GetCustomerServiceProfileListResponse_QNAME, GetCustomerServiceProfileListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceStateList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceStateList")
    public JAXBElement<GetDeviceStateList_Type> createGetDeviceStateList(GetDeviceStateList_Type value) {
        return new JAXBElement<GetDeviceStateList_Type>(_GetDeviceStateList_QNAME, GetDeviceStateList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getReportResponse")
    public JAXBElement<GetReportResponse> createGetReportResponse(GetReportResponse value) {
        return new JAXBElement<GetReportResponse>(_GetReportResponse_QNAME, GetReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListv4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListv4Response")
    public JAXBElement<GetFilteredDeviceListv4Response> createGetFilteredDeviceListv4Response(GetFilteredDeviceListv4Response value) {
        return new JAXBElement<GetFilteredDeviceListv4Response>(_GetFilteredDeviceListv4Response_QNAME, GetFilteredDeviceListv4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceHistoryResponse")
    public JAXBElement<GetDeviceHistoryResponse> createGetDeviceHistoryResponse(GetDeviceHistoryResponse value) {
        return new JAXBElement<GetDeviceHistoryResponse>(_GetDeviceHistoryResponse_QNAME, GetDeviceHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceDetailsResponse")
    public JAXBElement<GetDeviceDetailsResponse> createGetDeviceDetailsResponse(GetDeviceDetailsResponse value) {
        return new JAXBElement<GetDeviceDetailsResponse>(_GetDeviceDetailsResponse_QNAME, GetDeviceDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsCommunicationOverviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getSmsCommunicationOverviewResponse")
    public JAXBElement<GetSmsCommunicationOverviewResponse> createGetSmsCommunicationOverviewResponse(GetSmsCommunicationOverviewResponse value) {
        return new JAXBElement<GetSmsCommunicationOverviewResponse>(_GetSmsCommunicationOverviewResponse_QNAME, GetSmsCommunicationOverviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getReportListResponse")
    public JAXBElement<GetReportListResponse> createGetReportListResponse(GetReportListResponse value) {
        return new JAXBElement<GetReportListResponse>(_GetReportListResponse_QNAME, GetReportListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceCredentialsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "updateDeviceCredentialsv2Response")
    public JAXBElement<UpdateDeviceCredentialsv2Response> createUpdateDeviceCredentialsv2Response(UpdateDeviceCredentialsv2Response value) {
        return new JAXBElement<UpdateDeviceCredentialsv2Response>(_UpdateDeviceCredentialsv2Response_QNAME, UpdateDeviceCredentialsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getTransactionList")
    public JAXBElement<GetTransactionList_Type> createGetTransactionList(GetTransactionList_Type value) {
        return new JAXBElement<GetTransactionList_Type>(_GetTransactionList_QNAME, GetTransactionList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsCommunicationOverviewv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getSmsCommunicationOverviewv2")
    public JAXBElement<GetSmsCommunicationOverviewv2> createGetSmsCommunicationOverviewv2(GetSmsCommunicationOverviewv2 value) {
        return new JAXBElement<GetSmsCommunicationOverviewv2>(_GetSmsCommunicationOverviewv2_QNAME, GetSmsCommunicationOverviewv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "updateDeviceCredentialsResponse")
    public JAXBElement<UpdateDeviceCredentialsResponse> createUpdateDeviceCredentialsResponse(UpdateDeviceCredentialsResponse value) {
        return new JAXBElement<UpdateDeviceCredentialsResponse>(_UpdateDeviceCredentialsResponse_QNAME, UpdateDeviceCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerDetailsv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerDetailsv2")
    public JAXBElement<SetCustomerDetailsv2_Type> createSetCustomerDetailsv2(SetCustomerDetailsv2_Type value) {
        return new JAXBElement<SetCustomerDetailsv2_Type>(_SetCustomerDetailsv2_QNAME, SetCustomerDetailsv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "updateDeviceCredentials")
    public JAXBElement<UpdateDeviceCredentials> createUpdateDeviceCredentials(UpdateDeviceCredentials value) {
        return new JAXBElement<UpdateDeviceCredentials>(_UpdateDeviceCredentials_QNAME, UpdateDeviceCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceDetails")
    public JAXBElement<GetDeviceDetails_Type> createGetDeviceDetails(GetDeviceDetails_Type value) {
        return new JAXBElement<GetDeviceDetails_Type>(_GetDeviceDetails_QNAME, GetDeviceDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsv2Response")
    public JAXBElement<SetDeviceDetailsv2Response> createSetDeviceDetailsv2Response(SetDeviceDetailsv2Response value) {
        return new JAXBElement<SetDeviceDetailsv2Response>(_SetDeviceDetailsv2Response_QNAME, SetDeviceDetailsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitSMS")
    public JAXBElement<SubmitSMS> createSubmitSMS(SubmitSMS value) {
        return new JAXBElement<SubmitSMS>(_SubmitSMS_QNAME, SubmitSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GdspHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "gdspHeader")
    public JAXBElement<GdspHeader> createGdspHeader(GdspHeader value) {
        return new JAXBElement<GdspHeader>(_GdspHeader_QNAME, GdspHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVpnGroupList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getVpnGroupList")
    public JAXBElement<GetVpnGroupList_Type> createGetVpnGroupList(GetVpnGroupList_Type value) {
        return new JAXBElement<GetVpnGroupList_Type>(_GetVpnGroupList_QNAME, GetVpnGroupList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getUserListResponse")
    public JAXBElement<GetUserListResponse> createGetUserListResponse(GetUserListResponse value) {
        return new JAXBElement<GetUserListResponse>(_GetUserListResponse_QNAME, GetUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerDetails")
    public JAXBElement<GetCustomerDetails_Type> createGetCustomerDetails(GetCustomerDetails_Type value) {
        return new JAXBElement<GetCustomerDetails_Type>(_GetCustomerDetails_QNAME, GetCustomerDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev2")
    public JAXBElement<CloneCustomerServiceProfilev2_Type> createCloneCustomerServiceProfilev2(CloneCustomerServiceProfilev2_Type value) {
        return new JAXBElement<CloneCustomerServiceProfilev2_Type>(_CloneCustomerServiceProfilev2_QNAME, CloneCustomerServiceProfilev2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceLocationHistoryDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceLocationHistoryDetails")
    public JAXBElement<GetDeviceLocationHistoryDetails_Type> createGetDeviceLocationHistoryDetails(GetDeviceLocationHistoryDetails_Type value) {
        return new JAXBElement<GetDeviceLocationHistoryDetails_Type>(_GetDeviceLocationHistoryDetails_QNAME, GetDeviceLocationHistoryDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setUserDetailsResponse")
    public JAXBElement<SetUserDetailsResponse> createSetUserDetailsResponse(SetUserDetailsResponse value) {
        return new JAXBElement<SetUserDetailsResponse>(_SetUserDetailsResponse_QNAME, SetUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev5_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev5")
    public JAXBElement<CloneCustomerServiceProfilev5_Type> createCloneCustomerServiceProfilev5(CloneCustomerServiceProfilev5_Type value) {
        return new JAXBElement<CloneCustomerServiceProfilev5_Type>(_CloneCustomerServiceProfilev5_QNAME, CloneCustomerServiceProfilev5_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvisioningProfileListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getProvisioningProfileListResponse")
    public JAXBElement<GetProvisioningProfileListResponse> createGetProvisioningProfileListResponse(GetProvisioningProfileListResponse value) {
        return new JAXBElement<GetProvisioningProfileListResponse>(_GetProvisioningProfileListResponse_QNAME, GetProvisioningProfileListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev4_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev4")
    public JAXBElement<CloneCustomerServiceProfilev4_Type> createCloneCustomerServiceProfilev4(CloneCustomerServiceProfilev4_Type value) {
        return new JAXBElement<CloneCustomerServiceProfilev4_Type>(_CloneCustomerServiceProfilev4_QNAME, CloneCustomerServiceProfilev4_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsv2Response")
    public JAXBElement<GetCustomerServiceProfileDetailsv2Response> createGetCustomerServiceProfileDetailsv2Response(GetCustomerServiceProfileDetailsv2Response value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsv2Response>(_GetCustomerServiceProfileDetailsv2Response_QNAME, GetCustomerServiceProfileDetailsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev3_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev3")
    public JAXBElement<CloneCustomerServiceProfilev3_Type> createCloneCustomerServiceProfilev3(CloneCustomerServiceProfilev3_Type value) {
        return new JAXBElement<CloneCustomerServiceProfilev3_Type>(_CloneCustomerServiceProfilev3_QNAME, CloneCustomerServiceProfilev3_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getReportDetails")
    public JAXBElement<GetReportDetails_Type> createGetReportDetails(GetReportDetails_Type value) {
        return new JAXBElement<GetReportDetails_Type>(_GetReportDetails_QNAME, GetReportDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv5Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv5Response")
    public JAXBElement<SetCustomerServiceProfileDetailsv5Response> createSetCustomerServiceProfileDetailsv5Response(SetCustomerServiceProfileDetailsv5Response value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv5Response>(_SetCustomerServiceProfileDetailsv5Response_QNAME, SetCustomerServiceProfileDetailsv5Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceCredentialsResponse")
    public JAXBElement<SetDeviceCredentialsResponse> createSetDeviceCredentialsResponse(SetDeviceCredentialsResponse value) {
        return new JAXBElement<SetDeviceCredentialsResponse>(_SetDeviceCredentialsResponse_QNAME, SetDeviceCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfileResponse")
    public JAXBElement<CloneCustomerServiceProfileResponse> createCloneCustomerServiceProfileResponse(CloneCustomerServiceProfileResponse value) {
        return new JAXBElement<CloneCustomerServiceProfileResponse>(_CloneCustomerServiceProfileResponse_QNAME, CloneCustomerServiceProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getUserDetailsResponse")
    public JAXBElement<GetUserDetailsResponse> createGetUserDetailsResponse(GetUserDetailsResponse value) {
        return new JAXBElement<GetUserDetailsResponse>(_GetUserDetailsResponse_QNAME, GetUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvisioningProfileList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getProvisioningProfileList")
    public JAXBElement<GetProvisioningProfileList_Type> createGetProvisioningProfileList(GetProvisioningProfileList_Type value) {
        return new JAXBElement<GetProvisioningProfileList_Type>(_GetProvisioningProfileList_QNAME, GetProvisioningProfileList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev5Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev5Response")
    public JAXBElement<CloneCustomerServiceProfilev5Response> createCloneCustomerServiceProfilev5Response(CloneCustomerServiceProfilev5Response value) {
        return new JAXBElement<CloneCustomerServiceProfilev5Response>(_CloneCustomerServiceProfilev5Response_QNAME, CloneCustomerServiceProfilev5Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetails")
    public JAXBElement<GetCustomerServiceProfileDetails_Type> createGetCustomerServiceProfileDetails(GetCustomerServiceProfileDetails_Type value) {
        return new JAXBElement<GetCustomerServiceProfileDetails_Type>(_GetCustomerServiceProfileDetails_QNAME, GetCustomerServiceProfileDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceCredentialsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceCredentialsv2Response")
    public JAXBElement<SetDeviceCredentialsv2Response> createSetDeviceCredentialsv2Response(SetDeviceCredentialsv2Response value) {
        return new JAXBElement<SetDeviceCredentialsv2Response>(_SetDeviceCredentialsv2Response_QNAME, SetDeviceCredentialsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListv2Response")
    public JAXBElement<GetFilteredDeviceListResponse> createGetFilteredDeviceListv2Response(GetFilteredDeviceListResponse value) {
        return new JAXBElement<GetFilteredDeviceListResponse>(_GetFilteredDeviceListv2Response_QNAME, GetFilteredDeviceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileList")
    public JAXBElement<GetCustomerServiceProfileList_Type> createGetCustomerServiceProfileList(GetCustomerServiceProfileList_Type value) {
        return new JAXBElement<GetCustomerServiceProfileList_Type>(_GetCustomerServiceProfileList_QNAME, GetCustomerServiceProfileList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSMSv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitSMSv2Response")
    public JAXBElement<SubmitSMSv2Response> createSubmitSMSv2Response(SubmitSMSv2Response value) {
        return new JAXBElement<SubmitSMSv2Response>(_SubmitSMSv2Response_QNAME, SubmitSMSv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetContactDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setContactDetailsResponse")
    public JAXBElement<SetContactDetailsResponse> createSetContactDetailsResponse(SetContactDetailsResponse value) {
        return new JAXBElement<SetContactDetailsResponse>(_SetContactDetailsResponse_QNAME, SetContactDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceCredentialsv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceCredentialsv2")
    public JAXBElement<SetDeviceCredentialsv2> createSetDeviceCredentialsv2(SetDeviceCredentialsv2 value) {
        return new JAXBElement<SetDeviceCredentialsv2>(_SetDeviceCredentialsv2_QNAME, SetDeviceCredentialsv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitWUTriggerv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitWUTriggerv2Response")
    public JAXBElement<SubmitWUTriggerv2Response> createSubmitWUTriggerv2Response(SubmitWUTriggerv2Response value) {
        return new JAXBElement<SubmitWUTriggerv2Response>(_SubmitWUTriggerv2Response_QNAME, SubmitWUTriggerv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsv3_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsv3")
    public JAXBElement<GetCustomerServiceProfileDetailsv3_Type> createGetCustomerServiceProfileDetailsv3(GetCustomerServiceProfileDetailsv3_Type value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsv3_Type>(_GetCustomerServiceProfileDetailsv3_QNAME, GetCustomerServiceProfileDetailsv3_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitSMSResponse")
    public JAXBElement<SubmitSMSResponse> createSubmitSMSResponse(SubmitSMSResponse value) {
        return new JAXBElement<SubmitSMSResponse>(_SubmitSMSResponse_QNAME, SubmitSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setUserDetails")
    public JAXBElement<SetUserDetails_Type> createSetUserDetails(SetUserDetails_Type value) {
        return new JAXBElement<SetUserDetails_Type>(_SetUserDetails_QNAME, SetUserDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsv2")
    public JAXBElement<GetCustomerServiceProfileDetailsv2_Type> createGetCustomerServiceProfileDetailsv2(GetCustomerServiceProfileDetailsv2_Type value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsv2_Type>(_GetCustomerServiceProfileDetailsv2_QNAME, GetCustomerServiceProfileDetailsv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv4Response")
    public JAXBElement<SetCustomerServiceProfileDetailsv4Response> createSetCustomerServiceProfileDetailsv4Response(SetCustomerServiceProfileDetailsv4Response value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv4Response>(_SetCustomerServiceProfileDetailsv4Response_QNAME, SetCustomerServiceProfileDetailsv4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTariffList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getTariffList")
    public JAXBElement<GetTariffList_Type> createGetTariffList(GetTariffList_Type value) {
        return new JAXBElement<GetTariffList_Type>(_GetTariffList_QNAME, GetTariffList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerDetailsv2Response")
    public JAXBElement<GetCustomerDetailsv2Response> createGetCustomerDetailsv2Response(GetCustomerDetailsv2Response value) {
        return new JAXBElement<GetCustomerDetailsv2Response>(_GetCustomerDetailsv2Response_QNAME, GetCustomerDetailsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerDetailsResponse")
    public JAXBElement<SetCustomerDetailsResponse> createSetCustomerDetailsResponse(SetCustomerDetailsResponse value) {
        return new JAXBElement<SetCustomerDetailsResponse>(_SetCustomerDetailsResponse_QNAME, SetCustomerDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsv4_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsv4")
    public JAXBElement<GetCustomerServiceProfileDetailsv4_Type> createGetCustomerServiceProfileDetailsv4(GetCustomerServiceProfileDetailsv4_Type value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsv4_Type>(_GetCustomerServiceProfileDetailsv4_QNAME, GetCustomerServiceProfileDetailsv4_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSMSv3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitSMSv3")
    public JAXBElement<SubmitSMSv3> createSubmitSMSv3(SubmitSMSv3 value) {
        return new JAXBElement<SubmitSMSv3>(_SubmitSMSv3_QNAME, SubmitSMSv3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSMSv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitSMSv2")
    public JAXBElement<SubmitSMSv2> createSubmitSMSv2(SubmitSMSv2 value) {
        return new JAXBElement<SubmitSMSv2>(_SubmitSMSv2_QNAME, SubmitSMSv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsv3_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsv3")
    public JAXBElement<SetDeviceDetailsv3_Type> createSetDeviceDetailsv3(SetDeviceDetailsv3_Type value) {
        return new JAXBElement<SetDeviceDetailsv3_Type>(_SetDeviceDetailsv3_QNAME, SetDeviceDetailsv3_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsv2")
    public JAXBElement<SetDeviceDetailsv2_Type> createSetDeviceDetailsv2(SetDeviceDetailsv2_Type value) {
        return new JAXBElement<SetDeviceDetailsv2_Type>(_SetDeviceDetailsv2_QNAME, SetDeviceDetailsv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitTransactionalSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitTransactionalSMS")
    public JAXBElement<SubmitTransactionalSMS> createSubmitTransactionalSMS(SubmitTransactionalSMS value) {
        return new JAXBElement<SubmitTransactionalSMS>(_SubmitTransactionalSMS_QNAME, SubmitTransactionalSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListv4_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListv4")
    public JAXBElement<GetFilteredDeviceListv4_Type> createGetFilteredDeviceListv4(GetFilteredDeviceListv4_Type value) {
        return new JAXBElement<GetFilteredDeviceListv4_Type>(_GetFilteredDeviceListv4_QNAME, GetFilteredDeviceListv4_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListv3_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListv3")
    public JAXBElement<GetFilteredDeviceListv3_Type> createGetFilteredDeviceListv3(GetFilteredDeviceListv3_Type value) {
        return new JAXBElement<GetFilteredDeviceListv3_Type>(_GetFilteredDeviceListv3_QNAME, GetFilteredDeviceListv3_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBaseCountryList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getBaseCountryList")
    public JAXBElement<GetBaseCountryList_Type> createGetBaseCountryList(GetBaseCountryList_Type value) {
        return new JAXBElement<GetBaseCountryList_Type>(_GetBaseCountryList_QNAME, GetBaseCountryList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListv2")
    public JAXBElement<GetFilteredDeviceListv2_Type> createGetFilteredDeviceListv2(GetFilteredDeviceListv2_Type value) {
        return new JAXBElement<GetFilteredDeviceListv2_Type>(_GetFilteredDeviceListv2_QNAME, GetFilteredDeviceListv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev2Response")
    public JAXBElement<CloneCustomerServiceProfilev2Response> createCloneCustomerServiceProfilev2Response(CloneCustomerServiceProfilev2Response value) {
        return new JAXBElement<CloneCustomerServiceProfilev2Response>(_CloneCustomerServiceProfilev2Response_QNAME, CloneCustomerServiceProfilev2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv4_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv4")
    public JAXBElement<SetCustomerServiceProfileDetailsv4_Type> createSetCustomerServiceProfileDetailsv4(SetCustomerServiceProfileDetailsv4_Type value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv4_Type>(_SetCustomerServiceProfileDetailsv4_QNAME, SetCustomerServiceProfileDetailsv4_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitWUTrigger_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitWUTrigger")
    public JAXBElement<SubmitWUTrigger_Type> createSubmitWUTrigger(SubmitWUTrigger_Type value) {
        return new JAXBElement<SubmitWUTrigger_Type>(_SubmitWUTrigger_QNAME, SubmitWUTrigger_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv5_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv5")
    public JAXBElement<SetCustomerServiceProfileDetailsv5_Type> createSetCustomerServiceProfileDetailsv5(SetCustomerServiceProfileDetailsv5_Type value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv5_Type>(_SetCustomerServiceProfileDetailsv5_QNAME, SetCustomerServiceProfileDetailsv5_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv2")
    public JAXBElement<SetCustomerServiceProfileDetailsv2_Type> createSetCustomerServiceProfileDetailsv2(SetCustomerServiceProfileDetailsv2_Type value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv2_Type>(_SetCustomerServiceProfileDetailsv2_QNAME, SetCustomerServiceProfileDetailsv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv3_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv3")
    public JAXBElement<SetCustomerServiceProfileDetailsv3_Type> createSetCustomerServiceProfileDetailsv3(SetCustomerServiceProfileDetailsv3_Type value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv3_Type>(_SetCustomerServiceProfileDetailsv3_QNAME, SetCustomerServiceProfileDetailsv3_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsv4_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsv4")
    public JAXBElement<SetDeviceDetailsv4_Type> createSetDeviceDetailsv4(SetDeviceDetailsv4_Type value) {
        return new JAXBElement<SetDeviceDetailsv4_Type>(_SetDeviceDetailsv4_QNAME, SetDeviceDetailsv4_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitWUTriggerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitWUTriggerResponse")
    public JAXBElement<SubmitWUTriggerResponse> createSubmitWUTriggerResponse(SubmitWUTriggerResponse value) {
        return new JAXBElement<SubmitWUTriggerResponse>(_SubmitWUTriggerResponse_QNAME, SubmitWUTriggerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceList")
    public JAXBElement<GetFilteredDeviceList_Type> createGetFilteredDeviceList(GetFilteredDeviceList_Type value) {
        return new JAXBElement<GetFilteredDeviceList_Type>(_GetFilteredDeviceList_QNAME, GetFilteredDeviceList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTariffListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getTariffListResponse")
    public JAXBElement<GetTariffListResponse> createGetTariffListResponse(GetTariffListResponse value) {
        return new JAXBElement<GetTariffListResponse>(_GetTariffListResponse_QNAME, GetTariffListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceDetailsv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceDetailsv2")
    public JAXBElement<GetDeviceDetailsv2_Type> createGetDeviceDetailsv2(GetDeviceDetailsv2_Type value) {
        return new JAXBElement<GetDeviceDetailsv2_Type>(_GetDeviceDetailsv2_QNAME, GetDeviceDetailsv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSMSv3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitSMSv3Response")
    public JAXBElement<SubmitSMSv3Response> createSubmitSMSv3Response(SubmitSMSv3Response value) {
        return new JAXBElement<SubmitSMSv3Response>(_SubmitSMSv3Response_QNAME, SubmitSMSv3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerDetailsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerDetailsv2Response")
    public JAXBElement<SetCustomerDetailsv2Response> createSetCustomerDetailsv2Response(SetCustomerDetailsv2Response value) {
        return new JAXBElement<SetCustomerDetailsv2Response>(_SetCustomerDetailsv2Response_QNAME, SetCustomerDetailsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListv3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListv3Response")
    public JAXBElement<GetFilteredDeviceListv3Response> createGetFilteredDeviceListv3Response(GetFilteredDeviceListv3Response value) {
        return new JAXBElement<GetFilteredDeviceListv3Response>(_GetFilteredDeviceListv3Response_QNAME, GetFilteredDeviceListv3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReport_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getReport")
    public JAXBElement<GetReport_Type> createGetReport(GetReport_Type value) {
        return new JAXBElement<GetReport_Type>(_GetReport_QNAME, GetReport_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetails")
    public JAXBElement<SetCustomerServiceProfileDetails_Type> createSetCustomerServiceProfileDetails(SetCustomerServiceProfileDetails_Type value) {
        return new JAXBElement<SetCustomerServiceProfileDetails_Type>(_SetCustomerServiceProfileDetails_QNAME, SetCustomerServiceProfileDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceStateListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceStateListResponse")
    public JAXBElement<GetDeviceStateListResponse> createGetDeviceStateListResponse(GetDeviceStateListResponse value) {
        return new JAXBElement<GetDeviceStateListResponse>(_GetDeviceStateListResponse_QNAME, GetDeviceStateListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerDetails")
    public JAXBElement<SetCustomerDetails_Type> createSetCustomerDetails(SetCustomerDetails_Type value) {
        return new JAXBElement<SetCustomerDetails_Type>(_SetCustomerDetails_QNAME, SetCustomerDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfile_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfile")
    public JAXBElement<CloneCustomerServiceProfile_Type> createCloneCustomerServiceProfile(CloneCustomerServiceProfile_Type value) {
        return new JAXBElement<CloneCustomerServiceProfile_Type>(_CloneCustomerServiceProfile_QNAME, CloneCustomerServiceProfile_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceHistory_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceHistory")
    public JAXBElement<GetDeviceHistory_Type> createGetDeviceHistory(GetDeviceHistory_Type value) {
        return new JAXBElement<GetDeviceHistory_Type>(_GetDeviceHistory_QNAME, GetDeviceHistory_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitWUTriggerv2_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "submitWUTriggerv2")
    public JAXBElement<SubmitWUTriggerv2_Type> createSubmitWUTriggerv2(SubmitWUTriggerv2_Type value) {
        return new JAXBElement<SubmitWUTriggerv2_Type>(_SubmitWUTriggerv2_QNAME, SubmitWUTriggerv2_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceLocationDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceLocationDetailsResponse")
    public JAXBElement<GetDeviceLocationDetailsResponse> createGetDeviceLocationDetailsResponse(GetDeviceLocationDetailsResponse value) {
        return new JAXBElement<GetDeviceLocationDetailsResponse>(_GetDeviceLocationDetailsResponse_QNAME, GetDeviceLocationDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerServiceProfileDetailsv3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setCustomerServiceProfileDetailsv3Response")
    public JAXBElement<SetCustomerServiceProfileDetailsv3Response> createSetCustomerServiceProfileDetailsv3Response(SetCustomerServiceProfileDetailsv3Response value) {
        return new JAXBElement<SetCustomerServiceProfileDetailsv3Response>(_SetCustomerServiceProfileDetailsv3Response_QNAME, SetCustomerServiceProfileDetailsv3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceCredentialsv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "updateDeviceCredentialsv2")
    public JAXBElement<UpdateDeviceCredentialsv2> createUpdateDeviceCredentialsv2(UpdateDeviceCredentialsv2 value) {
        return new JAXBElement<UpdateDeviceCredentialsv2>(_UpdateDeviceCredentialsv2_QNAME, UpdateDeviceCredentialsv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerSimOrderList_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerSimOrderList")
    public JAXBElement<GetCustomerSimOrderList_Type> createGetCustomerSimOrderList(GetCustomerSimOrderList_Type value) {
        return new JAXBElement<GetCustomerSimOrderList_Type>(_GetCustomerSimOrderList_QNAME, GetCustomerSimOrderList_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getContactDetailsResponse")
    public JAXBElement<GetContactDetailsResponse> createGetContactDetailsResponse(GetContactDetailsResponse value) {
        return new JAXBElement<GetContactDetailsResponse>(_GetContactDetailsResponse_QNAME, GetContactDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceProfileDetailsv4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerServiceProfileDetailsv4Response")
    public JAXBElement<GetCustomerServiceProfileDetailsv4Response> createGetCustomerServiceProfileDetailsv4Response(GetCustomerServiceProfileDetailsv4Response value) {
        return new JAXBElement<GetCustomerServiceProfileDetailsv4Response>(_GetCustomerServiceProfileDetailsv4Response_QNAME, GetCustomerServiceProfileDetailsv4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeviceDetailsv3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setDeviceDetailsv3Response")
    public JAXBElement<SetDeviceDetailsv3Response> createSetDeviceDetailsv3Response(SetDeviceDetailsv3Response value) {
        return new JAXBElement<SetDeviceDetailsv3Response>(_SetDeviceDetailsv3Response_QNAME, SetDeviceDetailsv3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getTransactionListResponse")
    public JAXBElement<GetTransactionListResponse> createGetTransactionListResponse(GetTransactionListResponse value) {
        return new JAXBElement<GetTransactionListResponse>(_GetTransactionListResponse_QNAME, GetTransactionListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBaseCountryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getBaseCountryListResponse")
    public JAXBElement<GetBaseCountryListResponse> createGetBaseCountryListResponse(GetBaseCountryListResponse value) {
        return new JAXBElement<GetBaseCountryListResponse>(_GetBaseCountryListResponse_QNAME, GetBaseCountryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredDeviceListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getFilteredDeviceListResponse")
    public JAXBElement<GetFilteredDeviceListResponse> createGetFilteredDeviceListResponse(GetFilteredDeviceListResponse value) {
        return new JAXBElement<GetFilteredDeviceListResponse>(_GetFilteredDeviceListResponse_QNAME, GetFilteredDeviceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getCustomerDetailsResponse")
    public JAXBElement<GetCustomerDetailsResponse> createGetCustomerDetailsResponse(GetCustomerDetailsResponse value) {
        return new JAXBElement<GetCustomerDetailsResponse>(_GetCustomerDetailsResponse_QNAME, GetCustomerDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getUserDetails")
    public JAXBElement<GetUserDetails_Type> createGetUserDetails(GetUserDetails_Type value) {
        return new JAXBElement<GetUserDetails_Type>(_GetUserDetails_QNAME, GetUserDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getContactDetails")
    public JAXBElement<GetContactDetails_Type> createGetContactDetails(GetContactDetails_Type value) {
        return new JAXBElement<GetContactDetails_Type>(_GetContactDetails_QNAME, GetContactDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceDetailsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "getDeviceDetailsv2Response")
    public JAXBElement<GetDeviceDetailsv2Response> createGetDeviceDetailsv2Response(GetDeviceDetailsv2Response value) {
        return new JAXBElement<GetDeviceDetailsv2Response>(_GetDeviceDetailsv2Response_QNAME, GetDeviceDetailsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneCustomerServiceProfilev3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "cloneCustomerServiceProfilev3Response")
    public JAXBElement<CloneCustomerServiceProfilev3Response> createCloneCustomerServiceProfilev3Response(CloneCustomerServiceProfilev3Response value) {
        return new JAXBElement<CloneCustomerServiceProfilev3Response>(_CloneCustomerServiceProfilev3Response_QNAME, CloneCustomerServiceProfilev3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "createUser")
    public JAXBElement<CreateUser_Type> createCreateUser(CreateUser_Type value) {
        return new JAXBElement<CreateUser_Type>(_CreateUser_QNAME, CreateUser_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetContactDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gdsp.vodafone.com/", name = "setContactDetails")
    public JAXBElement<SetContactDetails_Type> createSetContactDetails(SetContactDetails_Type value) {
        return new JAXBElement<SetContactDetails_Type>(_SetContactDetails_QNAME, SetContactDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CApnProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apnList", scope = SetDeviceDetailsv3_Type.class)
    public JAXBElement<CApnProfile> createSetDeviceDetailsv3_TypeApnList(CApnProfile value) {
        return new JAXBElement<CApnProfile>(_SetDeviceDetailsv3_TypeApnList_QNAME, CApnProfile.class, SetDeviceDetailsv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = CloneCustomerServiceProfilev4_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev4_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, CloneCustomerServiceProfilev4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = CloneCustomerServiceProfilev4_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev4_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, CloneCustomerServiceProfilev4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = SetCustomerServiceProfileDetailsv5_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv5_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv5_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = SetCustomerServiceProfileDetailsv5_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv5_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv5_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = SetCustomerServiceProfileDetailsv3_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv3_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = SetCustomerServiceProfileDetailsv3_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv3_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = CloneCustomerServiceProfilev3_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev3_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, CloneCustomerServiceProfilev3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = CloneCustomerServiceProfilev3_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev3_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, CloneCustomerServiceProfilev3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = CloneCustomerServiceProfile_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfile_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, CloneCustomerServiceProfile_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = CloneCustomerServiceProfile_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfile_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, CloneCustomerServiceProfile_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = SetCustomerServiceProfileDetailsv4_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv4_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = SetCustomerServiceProfileDetailsv4_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv4_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute5", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv2_TypeMatchCustomAttribute5(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute5_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute4", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv2_TypeMatchCustomAttribute4(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute4_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute3", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv2_TypeMatchCustomAttribute3(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute3_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchEarliestFirstUsedDate", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<XMLGregorianCalendar> createGetFilteredDeviceListv2_TypeMatchEarliestFirstUsedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilteredDeviceListv2_TypeMatchEarliestFirstUsedDate_QNAME, XMLGregorianCalendar.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute2", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv2_TypeMatchCustomAttribute2(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute2_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute1", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv2_TypeMatchCustomAttribute1(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute1_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDeviceStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchDeviceState", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TDeviceStateList> createGetFilteredDeviceListv2_TypeMatchDeviceState(TDeviceStateList value) {
        return new JAXBElement<TDeviceStateList>(_GetFilteredDeviceListv2_TypeMatchDeviceState_QNAME, TDeviceStateList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRagStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchRagStatus", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TRagStateList> createGetFilteredDeviceListv2_TypeMatchRagStatus(TRagStateList value) {
        return new JAXBElement<TRagStateList>(_GetFilteredDeviceListv2_TypeMatchRagStatus_QNAME, TRagStateList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TImsiList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchImsi", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TImsiList> createGetFilteredDeviceListv2_TypeMatchImsi(TImsiList value) {
        return new JAXBElement<TImsiList>(_GetFilteredDeviceListv2_TypeMatchImsi_QNAME, TImsiList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerOrderNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerOrderNumber", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomerOrderNumberList> createGetFilteredDeviceListv2_TypeMatchCustomerOrderNumber(TCustomerOrderNumberList value) {
        return new JAXBElement<TCustomerOrderNumberList>(_GetFilteredDeviceListv2_TypeMatchCustomerOrderNumber_QNAME, TCustomerOrderNumberList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIccidList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchIccid", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TIccidList> createGetFilteredDeviceListv2_TypeMatchIccid(TIccidList value) {
        return new JAXBElement<TIccidList>(_GetFilteredDeviceListv2_TypeMatchIccid_QNAME, TIccidList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerServiceProfileList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerServiceProfiles", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TCustomerServiceProfileList> createGetFilteredDeviceListv2_TypeMatchCustomerServiceProfiles(TCustomerServiceProfileList value) {
        return new JAXBElement<TCustomerServiceProfileList>(_GetFilteredDeviceListv2_TypeMatchCustomerServiceProfiles_QNAME, TCustomerServiceProfileList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAlertTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchAlert", scope = GetFilteredDeviceListv2_Type.class)
    public JAXBElement<TAlertTypeList> createGetFilteredDeviceListv2_TypeMatchAlert(TAlertTypeList value) {
        return new JAXBElement<TAlertTypeList>(_GetFilteredDeviceListv2_TypeMatchAlert_QNAME, TAlertTypeList.class, GetFilteredDeviceListv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = SetCustomerServiceProfileDetailsv2_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv2_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = SetCustomerServiceProfileDetailsv2_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetailsv2_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, SetCustomerServiceProfileDetailsv2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute5", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv3_TypeMatchCustomAttribute5(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute5_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute4", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv3_TypeMatchCustomAttribute4(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute4_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMsisdnList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchMsisdn", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TMsisdnList> createGetFilteredDeviceListv3_TypeMatchMsisdn(TMsisdnList value) {
        return new JAXBElement<TMsisdnList>(_GetFilteredDeviceListv3_TypeMatchMsisdn_QNAME, TMsisdnList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute3", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv3_TypeMatchCustomAttribute3(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute3_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchEarliestFirstUsedDate", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<XMLGregorianCalendar> createGetFilteredDeviceListv3_TypeMatchEarliestFirstUsedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilteredDeviceListv2_TypeMatchEarliestFirstUsedDate_QNAME, XMLGregorianCalendar.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute2", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv3_TypeMatchCustomAttribute2(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute2_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute1", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv3_TypeMatchCustomAttribute1(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute1_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDeviceStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchDeviceState", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TDeviceStateList> createGetFilteredDeviceListv3_TypeMatchDeviceState(TDeviceStateList value) {
        return new JAXBElement<TDeviceStateList>(_GetFilteredDeviceListv2_TypeMatchDeviceState_QNAME, TDeviceStateList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRagStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchRagStatus", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TRagStateList> createGetFilteredDeviceListv3_TypeMatchRagStatus(TRagStateList value) {
        return new JAXBElement<TRagStateList>(_GetFilteredDeviceListv2_TypeMatchRagStatus_QNAME, TRagStateList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TImsiList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchImsi", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TImsiList> createGetFilteredDeviceListv3_TypeMatchImsi(TImsiList value) {
        return new JAXBElement<TImsiList>(_GetFilteredDeviceListv2_TypeMatchImsi_QNAME, TImsiList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerOrderNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerOrderNumber", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomerOrderNumberList> createGetFilteredDeviceListv3_TypeMatchCustomerOrderNumber(TCustomerOrderNumberList value) {
        return new JAXBElement<TCustomerOrderNumberList>(_GetFilteredDeviceListv2_TypeMatchCustomerOrderNumber_QNAME, TCustomerOrderNumberList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIccidList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchIccid", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TIccidList> createGetFilteredDeviceListv3_TypeMatchIccid(TIccidList value) {
        return new JAXBElement<TIccidList>(_GetFilteredDeviceListv2_TypeMatchIccid_QNAME, TIccidList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerServiceProfileList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerServiceProfiles", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TCustomerServiceProfileList> createGetFilteredDeviceListv3_TypeMatchCustomerServiceProfiles(TCustomerServiceProfileList value) {
        return new JAXBElement<TCustomerServiceProfileList>(_GetFilteredDeviceListv2_TypeMatchCustomerServiceProfiles_QNAME, TCustomerServiceProfileList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAlertTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchAlert", scope = GetFilteredDeviceListv3_Type.class)
    public JAXBElement<TAlertTypeList> createGetFilteredDeviceListv3_TypeMatchAlert(TAlertTypeList value) {
        return new JAXBElement<TAlertTypeList>(_GetFilteredDeviceListv2_TypeMatchAlert_QNAME, TAlertTypeList.class, GetFilteredDeviceListv3_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIccidList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchIccid", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TIccidList> createGetFilteredDeviceList_TypeMatchIccid(TIccidList value) {
        return new JAXBElement<TIccidList>(_GetFilteredDeviceListv2_TypeMatchIccid_QNAME, TIccidList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerServiceProfileList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerServiceProfiles", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomerServiceProfileList> createGetFilteredDeviceList_TypeMatchCustomerServiceProfiles(TCustomerServiceProfileList value) {
        return new JAXBElement<TCustomerServiceProfileList>(_GetFilteredDeviceListv2_TypeMatchCustomerServiceProfiles_QNAME, TCustomerServiceProfileList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute5", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceList_TypeMatchCustomAttribute5(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute5_QNAME, TCustomAttributeList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute4", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceList_TypeMatchCustomAttribute4(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute4_QNAME, TCustomAttributeList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute3", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceList_TypeMatchCustomAttribute3(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute3_QNAME, TCustomAttributeList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute2", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceList_TypeMatchCustomAttribute2(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute2_QNAME, TCustomAttributeList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAlertTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchAlert", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TAlertTypeList> createGetFilteredDeviceList_TypeMatchAlert(TAlertTypeList value) {
        return new JAXBElement<TAlertTypeList>(_GetFilteredDeviceListv2_TypeMatchAlert_QNAME, TAlertTypeList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute1", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceList_TypeMatchCustomAttribute1(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute1_QNAME, TCustomAttributeList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDeviceStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchDeviceState", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TDeviceStateList> createGetFilteredDeviceList_TypeMatchDeviceState(TDeviceStateList value) {
        return new JAXBElement<TDeviceStateList>(_GetFilteredDeviceListv2_TypeMatchDeviceState_QNAME, TDeviceStateList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRagStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchRagStatus", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TRagStateList> createGetFilteredDeviceList_TypeMatchRagStatus(TRagStateList value) {
        return new JAXBElement<TRagStateList>(_GetFilteredDeviceListv2_TypeMatchRagStatus_QNAME, TRagStateList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TImsiList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchImsi", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TImsiList> createGetFilteredDeviceList_TypeMatchImsi(TImsiList value) {
        return new JAXBElement<TImsiList>(_GetFilteredDeviceListv2_TypeMatchImsi_QNAME, TImsiList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerOrderNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerOrderNumber", scope = GetFilteredDeviceList_Type.class)
    public JAXBElement<TCustomerOrderNumberList> createGetFilteredDeviceList_TypeMatchCustomerOrderNumber(TCustomerOrderNumberList value) {
        return new JAXBElement<TCustomerOrderNumberList>(_GetFilteredDeviceListv2_TypeMatchCustomerOrderNumber_QNAME, TCustomerOrderNumberList.class, GetFilteredDeviceList_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = CloneCustomerServiceProfilev2_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev2_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, CloneCustomerServiceProfilev2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = CloneCustomerServiceProfilev2_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev2_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, CloneCustomerServiceProfilev2_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = CloneCustomerServiceProfilev5_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev5_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, CloneCustomerServiceProfilev5_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = CloneCustomerServiceProfilev5_Type.class)
    public JAXBElement<String> createCloneCustomerServiceProfilev5_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, CloneCustomerServiceProfilev5_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CApnProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apnList", scope = SetDeviceDetailsv4_Type.class)
    public JAXBElement<CApnProfile> createSetDeviceDetailsv4_TypeApnList(CApnProfile value) {
        return new JAXBElement<CApnProfile>(_SetDeviceDetailsv3_TypeApnList_QNAME, CApnProfile.class, SetDeviceDetailsv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute5", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv4_TypeMatchCustomAttribute5(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute5_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute4", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv4_TypeMatchCustomAttribute4(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute4_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMsisdnList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchMsisdn", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TMsisdnList> createGetFilteredDeviceListv4_TypeMatchMsisdn(TMsisdnList value) {
        return new JAXBElement<TMsisdnList>(_GetFilteredDeviceListv3_TypeMatchMsisdn_QNAME, TMsisdnList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute3", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv4_TypeMatchCustomAttribute3(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute3_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchEarliestFirstUsedDate", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<XMLGregorianCalendar> createGetFilteredDeviceListv4_TypeMatchEarliestFirstUsedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFilteredDeviceListv2_TypeMatchEarliestFirstUsedDate_QNAME, XMLGregorianCalendar.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute2", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv4_TypeMatchCustomAttribute2(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute2_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomAttribute1", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomAttributeList> createGetFilteredDeviceListv4_TypeMatchCustomAttribute1(TCustomAttributeList value) {
        return new JAXBElement<TCustomAttributeList>(_GetFilteredDeviceListv2_TypeMatchCustomAttribute1_QNAME, TCustomAttributeList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDeviceStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchDeviceState", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TDeviceStateList> createGetFilteredDeviceListv4_TypeMatchDeviceState(TDeviceStateList value) {
        return new JAXBElement<TDeviceStateList>(_GetFilteredDeviceListv2_TypeMatchDeviceState_QNAME, TDeviceStateList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRagStateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchRagStatus", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TRagStateList> createGetFilteredDeviceListv4_TypeMatchRagStatus(TRagStateList value) {
        return new JAXBElement<TRagStateList>(_GetFilteredDeviceListv2_TypeMatchRagStatus_QNAME, TRagStateList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TImsiList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchImsi", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TImsiList> createGetFilteredDeviceListv4_TypeMatchImsi(TImsiList value) {
        return new JAXBElement<TImsiList>(_GetFilteredDeviceListv2_TypeMatchImsi_QNAME, TImsiList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerOrderNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerOrderNumber", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomerOrderNumberList> createGetFilteredDeviceListv4_TypeMatchCustomerOrderNumber(TCustomerOrderNumberList value) {
        return new JAXBElement<TCustomerOrderNumberList>(_GetFilteredDeviceListv2_TypeMatchCustomerOrderNumber_QNAME, TCustomerOrderNumberList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIccidList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchIccid", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TIccidList> createGetFilteredDeviceListv4_TypeMatchIccid(TIccidList value) {
        return new JAXBElement<TIccidList>(_GetFilteredDeviceListv2_TypeMatchIccid_QNAME, TIccidList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCustomerServiceProfileList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchCustomerServiceProfiles", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TCustomerServiceProfileList> createGetFilteredDeviceListv4_TypeMatchCustomerServiceProfiles(TCustomerServiceProfileList value) {
        return new JAXBElement<TCustomerServiceProfileList>(_GetFilteredDeviceListv2_TypeMatchCustomerServiceProfiles_QNAME, TCustomerServiceProfileList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAlertTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matchAlert", scope = GetFilteredDeviceListv4_Type.class)
    public JAXBElement<TAlertTypeList> createGetFilteredDeviceListv4_TypeMatchAlert(TAlertTypeList value) {
        return new JAXBElement<TAlertTypeList>(_GetFilteredDeviceListv2_TypeMatchAlert_QNAME, TAlertTypeList.class, GetFilteredDeviceListv4_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkedProfile", scope = SetCustomerServiceProfileDetails_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetails_TypeLinkedProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeLinkedProfile_QNAME, String.class, SetCustomerServiceProfileDetails_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisioningProfile", scope = SetCustomerServiceProfileDetails_Type.class)
    public JAXBElement<String> createSetCustomerServiceProfileDetails_TypeProvisioningProfile(String value) {
        return new JAXBElement<String>(_CloneCustomerServiceProfilev4_TypeProvisioningProfile_QNAME, String.class, SetCustomerServiceProfileDetails_Type.class, value);
    }

}
