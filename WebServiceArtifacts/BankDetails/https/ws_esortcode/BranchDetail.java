
package https.ws_esortcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALSortingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALBIC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALBIC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALSubBranchSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALShortBranchTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALShortNameOwningBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALFullNameOwningBankLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALFullNameOwningBankLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALBankCodeOwningBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALNationalCentralBankCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALSupervisoryBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALDeletedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALDateofLastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENERALPrintIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSDateofLastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSDateClosedInBACSClearing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSRedirectionFromFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSRedirectToSortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSSettlementBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSSettlementSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSSettlementSubSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSHandlingBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSHandlingBankStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSAccountsNumberedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSDDIVoucherFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedBS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedAU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedSpare1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedSpare2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSTransactionsDisallowedSpare3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BACSSpare1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGReturnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGEffectiveDateOfLastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGDateClosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGSettlementMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGRoutingBICField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSSTERLINGRoutingBICField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEUROStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEUROEffectiveDateOfLastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEURODateClosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEURORoutingBICField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEURORoutingBICField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEUROSettlementMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEUROReturnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEUROSwiftData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAPSEUROSpare1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCeffectiveDateofLastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCDateClosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCSettlementBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCDebitAgencySortingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCReturnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCCGBNIIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTBranchTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTSortcodeOfMainBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTMajorLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTMinorLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTBranchNameOrPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTSecondEntryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTBranchNameForSecondEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTFullBranchTitlePart1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTFullBranchTitlePart2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTFullBranchTitlePart3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTPostcodeField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTPostcodeField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTTelephoneArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTTelephone2Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRINTTelephone2Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchDetail", propOrder = {
    "validationMessage",
    "isError",
    "errorMessage",
    "generalSortingCode",
    "generalbic1",
    "generalbic2",
    "generalSubBranchSuffix",
    "generalShortBranchTitle",
    "generalShortNameOwningBank",
    "generalFullNameOwningBankLine1",
    "generalFullNameOwningBankLine2",
    "generalBankCodeOwningBank",
    "generalNationalCentralBankCountryCode",
    "generalSupervisoryBody",
    "generalDeletedDate",
    "generalDateofLastChange",
    "generalPrintIndicator",
    "bacsStatus",
    "bacsDateofLastChange",
    "bacsDateClosedInBACSClearing",
    "bacsRedirectionFromFlag",
    "bacsRedirectToSortcode",
    "bacsSettlementBank",
    "bacsSettlementSection",
    "bacsSettlementSubSection",
    "bacsHandlingBank",
    "bacsHandlingBankStream",
    "bacsAccountsNumberedFlag",
    "bacsddiVoucherFlag",
    "bacsTransactionsDisallowedDR",
    "bacsTransactionsDisallowedCR",
    "bacsTransactionsDisallowedCU",
    "bacsTransactionsDisallowedPR",
    "bacsTransactionsDisallowedBS",
    "bacsTransactionsDisallowedDV",
    "bacsTransactionsDisallowedAU",
    "bacsTransactionsDisallowedSpare1",
    "bacsTransactionsDisallowedSpare2",
    "bacsTransactionsDisallowedSpare3",
    "bacsSpare1",
    "chapssterlingReturnIndicator",
    "chapssterlingStatus",
    "chapssterlingEffectiveDateOfLastChange",
    "chapssterlingDateClosed",
    "chapssterlingSettlementMember",
    "chapssterlingRoutingBICField1",
    "chapssterlingRoutingBICField2",
    "chapseuroStatus",
    "chapseuroEffectiveDateOfLastChange",
    "chapseuroDateClosed",
    "chapseuroRoutingBICField1",
    "chapseuroRoutingBICField2",
    "chapseuroSettlementMember",
    "chapseuroReturnIndicator",
    "chapseuroSwiftData",
    "chapseuroSpare1",
    "ccccStatus",
    "cccCeffectiveDateofLastChange",
    "ccccDateClosed",
    "ccccSettlementBank",
    "ccccDebitAgencySortingCode",
    "ccccReturnIndicator",
    "ccccgbniIndicator",
    "printBranchTypeIndicator",
    "printSortcodeOfMainBranch",
    "printMajorLocationName",
    "printMinorLocationName",
    "printBranchNameOrPlace",
    "printSecondEntryIndicator",
    "printBranchNameForSecondEntry",
    "printFullBranchTitlePart1",
    "printFullBranchTitlePart2",
    "printFullBranchTitlePart3",
    "printAddressLine1",
    "printAddressLine2",
    "printAddressLine3",
    "printAddressLine4",
    "printTown",
    "printCounty",
    "printPostcodeField1",
    "printPostcodeField2",
    "printTelephoneArea",
    "printTelephoneNumber",
    "printTelephone2Area",
    "printTelephone2Number"
})
public class BranchDetail {

    @XmlElement(name = "ValidationMessage")
    protected String validationMessage;
    @XmlElement(name = "IsError")
    protected boolean isError;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "GENERALSortingCode")
    protected String generalSortingCode;
    @XmlElement(name = "GENERALBIC1")
    protected String generalbic1;
    @XmlElement(name = "GENERALBIC2")
    protected String generalbic2;
    @XmlElement(name = "GENERALSubBranchSuffix")
    protected String generalSubBranchSuffix;
    @XmlElement(name = "GENERALShortBranchTitle")
    protected String generalShortBranchTitle;
    @XmlElement(name = "GENERALShortNameOwningBank")
    protected String generalShortNameOwningBank;
    @XmlElement(name = "GENERALFullNameOwningBankLine1")
    protected String generalFullNameOwningBankLine1;
    @XmlElement(name = "GENERALFullNameOwningBankLine2")
    protected String generalFullNameOwningBankLine2;
    @XmlElement(name = "GENERALBankCodeOwningBank")
    protected String generalBankCodeOwningBank;
    @XmlElement(name = "GENERALNationalCentralBankCountryCode")
    protected String generalNationalCentralBankCountryCode;
    @XmlElement(name = "GENERALSupervisoryBody")
    protected String generalSupervisoryBody;
    @XmlElement(name = "GENERALDeletedDate")
    protected String generalDeletedDate;
    @XmlElement(name = "GENERALDateofLastChange")
    protected String generalDateofLastChange;
    @XmlElement(name = "GENERALPrintIndicator")
    protected String generalPrintIndicator;
    @XmlElement(name = "BACSStatus")
    protected String bacsStatus;
    @XmlElement(name = "BACSDateofLastChange")
    protected String bacsDateofLastChange;
    @XmlElement(name = "BACSDateClosedInBACSClearing")
    protected String bacsDateClosedInBACSClearing;
    @XmlElement(name = "BACSRedirectionFromFlag")
    protected String bacsRedirectionFromFlag;
    @XmlElement(name = "BACSRedirectToSortcode")
    protected String bacsRedirectToSortcode;
    @XmlElement(name = "BACSSettlementBank")
    protected String bacsSettlementBank;
    @XmlElement(name = "BACSSettlementSection")
    protected String bacsSettlementSection;
    @XmlElement(name = "BACSSettlementSubSection")
    protected String bacsSettlementSubSection;
    @XmlElement(name = "BACSHandlingBank")
    protected String bacsHandlingBank;
    @XmlElement(name = "BACSHandlingBankStream")
    protected String bacsHandlingBankStream;
    @XmlElement(name = "BACSAccountsNumberedFlag")
    protected String bacsAccountsNumberedFlag;
    @XmlElement(name = "BACSDDIVoucherFlag")
    protected String bacsddiVoucherFlag;
    @XmlElement(name = "BACSTransactionsDisallowedDR")
    protected String bacsTransactionsDisallowedDR;
    @XmlElement(name = "BACSTransactionsDisallowedCR")
    protected String bacsTransactionsDisallowedCR;
    @XmlElement(name = "BACSTransactionsDisallowedCU")
    protected String bacsTransactionsDisallowedCU;
    @XmlElement(name = "BACSTransactionsDisallowedPR")
    protected String bacsTransactionsDisallowedPR;
    @XmlElement(name = "BACSTransactionsDisallowedBS")
    protected String bacsTransactionsDisallowedBS;
    @XmlElement(name = "BACSTransactionsDisallowedDV")
    protected String bacsTransactionsDisallowedDV;
    @XmlElement(name = "BACSTransactionsDisallowedAU")
    protected String bacsTransactionsDisallowedAU;
    @XmlElement(name = "BACSTransactionsDisallowedSpare1")
    protected String bacsTransactionsDisallowedSpare1;
    @XmlElement(name = "BACSTransactionsDisallowedSpare2")
    protected String bacsTransactionsDisallowedSpare2;
    @XmlElement(name = "BACSTransactionsDisallowedSpare3")
    protected String bacsTransactionsDisallowedSpare3;
    @XmlElement(name = "BACSSpare1")
    protected String bacsSpare1;
    @XmlElement(name = "CHAPSSTERLINGReturnIndicator")
    protected String chapssterlingReturnIndicator;
    @XmlElement(name = "CHAPSSTERLINGStatus")
    protected String chapssterlingStatus;
    @XmlElement(name = "CHAPSSTERLINGEffectiveDateOfLastChange")
    protected String chapssterlingEffectiveDateOfLastChange;
    @XmlElement(name = "CHAPSSTERLINGDateClosed")
    protected String chapssterlingDateClosed;
    @XmlElement(name = "CHAPSSTERLINGSettlementMember")
    protected String chapssterlingSettlementMember;
    @XmlElement(name = "CHAPSSTERLINGRoutingBICField1")
    protected String chapssterlingRoutingBICField1;
    @XmlElement(name = "CHAPSSTERLINGRoutingBICField2")
    protected String chapssterlingRoutingBICField2;
    @XmlElement(name = "CHAPSEUROStatus")
    protected String chapseuroStatus;
    @XmlElement(name = "CHAPSEUROEffectiveDateOfLastChange")
    protected String chapseuroEffectiveDateOfLastChange;
    @XmlElement(name = "CHAPSEURODateClosed")
    protected String chapseuroDateClosed;
    @XmlElement(name = "CHAPSEURORoutingBICField1")
    protected String chapseuroRoutingBICField1;
    @XmlElement(name = "CHAPSEURORoutingBICField2")
    protected String chapseuroRoutingBICField2;
    @XmlElement(name = "CHAPSEUROSettlementMember")
    protected String chapseuroSettlementMember;
    @XmlElement(name = "CHAPSEUROReturnIndicator")
    protected String chapseuroReturnIndicator;
    @XmlElement(name = "CHAPSEUROSwiftData")
    protected String chapseuroSwiftData;
    @XmlElement(name = "CHAPSEUROSpare1")
    protected String chapseuroSpare1;
    @XmlElement(name = "CCCCStatus")
    protected String ccccStatus;
    @XmlElement(name = "CCCCeffectiveDateofLastChange")
    protected String cccCeffectiveDateofLastChange;
    @XmlElement(name = "CCCCDateClosed")
    protected String ccccDateClosed;
    @XmlElement(name = "CCCCSettlementBank")
    protected String ccccSettlementBank;
    @XmlElement(name = "CCCCDebitAgencySortingCode")
    protected String ccccDebitAgencySortingCode;
    @XmlElement(name = "CCCCReturnIndicator")
    protected String ccccReturnIndicator;
    @XmlElement(name = "CCCCGBNIIndicator")
    protected String ccccgbniIndicator;
    @XmlElement(name = "PRINTBranchTypeIndicator")
    protected String printBranchTypeIndicator;
    @XmlElement(name = "PRINTSortcodeOfMainBranch")
    protected String printSortcodeOfMainBranch;
    @XmlElement(name = "PRINTMajorLocationName")
    protected String printMajorLocationName;
    @XmlElement(name = "PRINTMinorLocationName")
    protected String printMinorLocationName;
    @XmlElement(name = "PRINTBranchNameOrPlace")
    protected String printBranchNameOrPlace;
    @XmlElement(name = "PRINTSecondEntryIndicator")
    protected String printSecondEntryIndicator;
    @XmlElement(name = "PRINTBranchNameForSecondEntry")
    protected String printBranchNameForSecondEntry;
    @XmlElement(name = "PRINTFullBranchTitlePart1")
    protected String printFullBranchTitlePart1;
    @XmlElement(name = "PRINTFullBranchTitlePart2")
    protected String printFullBranchTitlePart2;
    @XmlElement(name = "PRINTFullBranchTitlePart3")
    protected String printFullBranchTitlePart3;
    @XmlElement(name = "PRINTAddressLine1")
    protected String printAddressLine1;
    @XmlElement(name = "PRINTAddressLine2")
    protected String printAddressLine2;
    @XmlElement(name = "PRINTAddressLine3")
    protected String printAddressLine3;
    @XmlElement(name = "PRINTAddressLine4")
    protected String printAddressLine4;
    @XmlElement(name = "PRINTTown")
    protected String printTown;
    @XmlElement(name = "PRINTCounty")
    protected String printCounty;
    @XmlElement(name = "PRINTPostcodeField1")
    protected String printPostcodeField1;
    @XmlElement(name = "PRINTPostcodeField2")
    protected String printPostcodeField2;
    @XmlElement(name = "PRINTTelephoneArea")
    protected String printTelephoneArea;
    @XmlElement(name = "PRINTTelephoneNumber")
    protected String printTelephoneNumber;
    @XmlElement(name = "PRINTTelephone2Area")
    protected String printTelephone2Area;
    @XmlElement(name = "PRINTTelephone2Number")
    protected String printTelephone2Number;

    /**
     * Gets the value of the validationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationMessage() {
        return validationMessage;
    }

    /**
     * Sets the value of the validationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationMessage(String value) {
        this.validationMessage = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     */
    public boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the generalSortingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALSortingCode() {
        return generalSortingCode;
    }

    /**
     * Sets the value of the generalSortingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALSortingCode(String value) {
        this.generalSortingCode = value;
    }

    /**
     * Gets the value of the generalbic1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALBIC1() {
        return generalbic1;
    }

    /**
     * Sets the value of the generalbic1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALBIC1(String value) {
        this.generalbic1 = value;
    }

    /**
     * Gets the value of the generalbic2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALBIC2() {
        return generalbic2;
    }

    /**
     * Sets the value of the generalbic2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALBIC2(String value) {
        this.generalbic2 = value;
    }

    /**
     * Gets the value of the generalSubBranchSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALSubBranchSuffix() {
        return generalSubBranchSuffix;
    }

    /**
     * Sets the value of the generalSubBranchSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALSubBranchSuffix(String value) {
        this.generalSubBranchSuffix = value;
    }

    /**
     * Gets the value of the generalShortBranchTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALShortBranchTitle() {
        return generalShortBranchTitle;
    }

    /**
     * Sets the value of the generalShortBranchTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALShortBranchTitle(String value) {
        this.generalShortBranchTitle = value;
    }

    /**
     * Gets the value of the generalShortNameOwningBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALShortNameOwningBank() {
        return generalShortNameOwningBank;
    }

    /**
     * Sets the value of the generalShortNameOwningBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALShortNameOwningBank(String value) {
        this.generalShortNameOwningBank = value;
    }

    /**
     * Gets the value of the generalFullNameOwningBankLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALFullNameOwningBankLine1() {
        return generalFullNameOwningBankLine1;
    }

    /**
     * Sets the value of the generalFullNameOwningBankLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALFullNameOwningBankLine1(String value) {
        this.generalFullNameOwningBankLine1 = value;
    }

    /**
     * Gets the value of the generalFullNameOwningBankLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALFullNameOwningBankLine2() {
        return generalFullNameOwningBankLine2;
    }

    /**
     * Sets the value of the generalFullNameOwningBankLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALFullNameOwningBankLine2(String value) {
        this.generalFullNameOwningBankLine2 = value;
    }

    /**
     * Gets the value of the generalBankCodeOwningBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALBankCodeOwningBank() {
        return generalBankCodeOwningBank;
    }

    /**
     * Sets the value of the generalBankCodeOwningBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALBankCodeOwningBank(String value) {
        this.generalBankCodeOwningBank = value;
    }

    /**
     * Gets the value of the generalNationalCentralBankCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALNationalCentralBankCountryCode() {
        return generalNationalCentralBankCountryCode;
    }

    /**
     * Sets the value of the generalNationalCentralBankCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALNationalCentralBankCountryCode(String value) {
        this.generalNationalCentralBankCountryCode = value;
    }

    /**
     * Gets the value of the generalSupervisoryBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALSupervisoryBody() {
        return generalSupervisoryBody;
    }

    /**
     * Sets the value of the generalSupervisoryBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALSupervisoryBody(String value) {
        this.generalSupervisoryBody = value;
    }

    /**
     * Gets the value of the generalDeletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALDeletedDate() {
        return generalDeletedDate;
    }

    /**
     * Sets the value of the generalDeletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALDeletedDate(String value) {
        this.generalDeletedDate = value;
    }

    /**
     * Gets the value of the generalDateofLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALDateofLastChange() {
        return generalDateofLastChange;
    }

    /**
     * Sets the value of the generalDateofLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALDateofLastChange(String value) {
        this.generalDateofLastChange = value;
    }

    /**
     * Gets the value of the generalPrintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERALPrintIndicator() {
        return generalPrintIndicator;
    }

    /**
     * Sets the value of the generalPrintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERALPrintIndicator(String value) {
        this.generalPrintIndicator = value;
    }

    /**
     * Gets the value of the bacsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSStatus() {
        return bacsStatus;
    }

    /**
     * Sets the value of the bacsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSStatus(String value) {
        this.bacsStatus = value;
    }

    /**
     * Gets the value of the bacsDateofLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSDateofLastChange() {
        return bacsDateofLastChange;
    }

    /**
     * Sets the value of the bacsDateofLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSDateofLastChange(String value) {
        this.bacsDateofLastChange = value;
    }

    /**
     * Gets the value of the bacsDateClosedInBACSClearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSDateClosedInBACSClearing() {
        return bacsDateClosedInBACSClearing;
    }

    /**
     * Sets the value of the bacsDateClosedInBACSClearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSDateClosedInBACSClearing(String value) {
        this.bacsDateClosedInBACSClearing = value;
    }

    /**
     * Gets the value of the bacsRedirectionFromFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSRedirectionFromFlag() {
        return bacsRedirectionFromFlag;
    }

    /**
     * Sets the value of the bacsRedirectionFromFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSRedirectionFromFlag(String value) {
        this.bacsRedirectionFromFlag = value;
    }

    /**
     * Gets the value of the bacsRedirectToSortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSRedirectToSortcode() {
        return bacsRedirectToSortcode;
    }

    /**
     * Sets the value of the bacsRedirectToSortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSRedirectToSortcode(String value) {
        this.bacsRedirectToSortcode = value;
    }

    /**
     * Gets the value of the bacsSettlementBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSSettlementBank() {
        return bacsSettlementBank;
    }

    /**
     * Sets the value of the bacsSettlementBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSSettlementBank(String value) {
        this.bacsSettlementBank = value;
    }

    /**
     * Gets the value of the bacsSettlementSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSSettlementSection() {
        return bacsSettlementSection;
    }

    /**
     * Sets the value of the bacsSettlementSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSSettlementSection(String value) {
        this.bacsSettlementSection = value;
    }

    /**
     * Gets the value of the bacsSettlementSubSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSSettlementSubSection() {
        return bacsSettlementSubSection;
    }

    /**
     * Sets the value of the bacsSettlementSubSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSSettlementSubSection(String value) {
        this.bacsSettlementSubSection = value;
    }

    /**
     * Gets the value of the bacsHandlingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSHandlingBank() {
        return bacsHandlingBank;
    }

    /**
     * Sets the value of the bacsHandlingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSHandlingBank(String value) {
        this.bacsHandlingBank = value;
    }

    /**
     * Gets the value of the bacsHandlingBankStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSHandlingBankStream() {
        return bacsHandlingBankStream;
    }

    /**
     * Sets the value of the bacsHandlingBankStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSHandlingBankStream(String value) {
        this.bacsHandlingBankStream = value;
    }

    /**
     * Gets the value of the bacsAccountsNumberedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSAccountsNumberedFlag() {
        return bacsAccountsNumberedFlag;
    }

    /**
     * Sets the value of the bacsAccountsNumberedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSAccountsNumberedFlag(String value) {
        this.bacsAccountsNumberedFlag = value;
    }

    /**
     * Gets the value of the bacsddiVoucherFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSDDIVoucherFlag() {
        return bacsddiVoucherFlag;
    }

    /**
     * Sets the value of the bacsddiVoucherFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSDDIVoucherFlag(String value) {
        this.bacsddiVoucherFlag = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedDR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedDR() {
        return bacsTransactionsDisallowedDR;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedDR(String value) {
        this.bacsTransactionsDisallowedDR = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedCR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedCR() {
        return bacsTransactionsDisallowedCR;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedCR(String value) {
        this.bacsTransactionsDisallowedCR = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedCU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedCU() {
        return bacsTransactionsDisallowedCU;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedCU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedCU(String value) {
        this.bacsTransactionsDisallowedCU = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedPR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedPR() {
        return bacsTransactionsDisallowedPR;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedPR(String value) {
        this.bacsTransactionsDisallowedPR = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedBS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedBS() {
        return bacsTransactionsDisallowedBS;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedBS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedBS(String value) {
        this.bacsTransactionsDisallowedBS = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedDV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedDV() {
        return bacsTransactionsDisallowedDV;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedDV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedDV(String value) {
        this.bacsTransactionsDisallowedDV = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedAU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedAU() {
        return bacsTransactionsDisallowedAU;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedAU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedAU(String value) {
        this.bacsTransactionsDisallowedAU = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedSpare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedSpare1() {
        return bacsTransactionsDisallowedSpare1;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedSpare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedSpare1(String value) {
        this.bacsTransactionsDisallowedSpare1 = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedSpare2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedSpare2() {
        return bacsTransactionsDisallowedSpare2;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedSpare2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedSpare2(String value) {
        this.bacsTransactionsDisallowedSpare2 = value;
    }

    /**
     * Gets the value of the bacsTransactionsDisallowedSpare3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSTransactionsDisallowedSpare3() {
        return bacsTransactionsDisallowedSpare3;
    }

    /**
     * Sets the value of the bacsTransactionsDisallowedSpare3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSTransactionsDisallowedSpare3(String value) {
        this.bacsTransactionsDisallowedSpare3 = value;
    }

    /**
     * Gets the value of the bacsSpare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACSSpare1() {
        return bacsSpare1;
    }

    /**
     * Sets the value of the bacsSpare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACSSpare1(String value) {
        this.bacsSpare1 = value;
    }

    /**
     * Gets the value of the chapssterlingReturnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGReturnIndicator() {
        return chapssterlingReturnIndicator;
    }

    /**
     * Sets the value of the chapssterlingReturnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGReturnIndicator(String value) {
        this.chapssterlingReturnIndicator = value;
    }

    /**
     * Gets the value of the chapssterlingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGStatus() {
        return chapssterlingStatus;
    }

    /**
     * Sets the value of the chapssterlingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGStatus(String value) {
        this.chapssterlingStatus = value;
    }

    /**
     * Gets the value of the chapssterlingEffectiveDateOfLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGEffectiveDateOfLastChange() {
        return chapssterlingEffectiveDateOfLastChange;
    }

    /**
     * Sets the value of the chapssterlingEffectiveDateOfLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGEffectiveDateOfLastChange(String value) {
        this.chapssterlingEffectiveDateOfLastChange = value;
    }

    /**
     * Gets the value of the chapssterlingDateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGDateClosed() {
        return chapssterlingDateClosed;
    }

    /**
     * Sets the value of the chapssterlingDateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGDateClosed(String value) {
        this.chapssterlingDateClosed = value;
    }

    /**
     * Gets the value of the chapssterlingSettlementMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGSettlementMember() {
        return chapssterlingSettlementMember;
    }

    /**
     * Sets the value of the chapssterlingSettlementMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGSettlementMember(String value) {
        this.chapssterlingSettlementMember = value;
    }

    /**
     * Gets the value of the chapssterlingRoutingBICField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGRoutingBICField1() {
        return chapssterlingRoutingBICField1;
    }

    /**
     * Sets the value of the chapssterlingRoutingBICField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGRoutingBICField1(String value) {
        this.chapssterlingRoutingBICField1 = value;
    }

    /**
     * Gets the value of the chapssterlingRoutingBICField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSSTERLINGRoutingBICField2() {
        return chapssterlingRoutingBICField2;
    }

    /**
     * Sets the value of the chapssterlingRoutingBICField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSSTERLINGRoutingBICField2(String value) {
        this.chapssterlingRoutingBICField2 = value;
    }

    /**
     * Gets the value of the chapseuroStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEUROStatus() {
        return chapseuroStatus;
    }

    /**
     * Sets the value of the chapseuroStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEUROStatus(String value) {
        this.chapseuroStatus = value;
    }

    /**
     * Gets the value of the chapseuroEffectiveDateOfLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEUROEffectiveDateOfLastChange() {
        return chapseuroEffectiveDateOfLastChange;
    }

    /**
     * Sets the value of the chapseuroEffectiveDateOfLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEUROEffectiveDateOfLastChange(String value) {
        this.chapseuroEffectiveDateOfLastChange = value;
    }

    /**
     * Gets the value of the chapseuroDateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEURODateClosed() {
        return chapseuroDateClosed;
    }

    /**
     * Sets the value of the chapseuroDateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEURODateClosed(String value) {
        this.chapseuroDateClosed = value;
    }

    /**
     * Gets the value of the chapseuroRoutingBICField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEURORoutingBICField1() {
        return chapseuroRoutingBICField1;
    }

    /**
     * Sets the value of the chapseuroRoutingBICField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEURORoutingBICField1(String value) {
        this.chapseuroRoutingBICField1 = value;
    }

    /**
     * Gets the value of the chapseuroRoutingBICField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEURORoutingBICField2() {
        return chapseuroRoutingBICField2;
    }

    /**
     * Sets the value of the chapseuroRoutingBICField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEURORoutingBICField2(String value) {
        this.chapseuroRoutingBICField2 = value;
    }

    /**
     * Gets the value of the chapseuroSettlementMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEUROSettlementMember() {
        return chapseuroSettlementMember;
    }

    /**
     * Sets the value of the chapseuroSettlementMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEUROSettlementMember(String value) {
        this.chapseuroSettlementMember = value;
    }

    /**
     * Gets the value of the chapseuroReturnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEUROReturnIndicator() {
        return chapseuroReturnIndicator;
    }

    /**
     * Sets the value of the chapseuroReturnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEUROReturnIndicator(String value) {
        this.chapseuroReturnIndicator = value;
    }

    /**
     * Gets the value of the chapseuroSwiftData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEUROSwiftData() {
        return chapseuroSwiftData;
    }

    /**
     * Sets the value of the chapseuroSwiftData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEUROSwiftData(String value) {
        this.chapseuroSwiftData = value;
    }

    /**
     * Gets the value of the chapseuroSpare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAPSEUROSpare1() {
        return chapseuroSpare1;
    }

    /**
     * Sets the value of the chapseuroSpare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAPSEUROSpare1(String value) {
        this.chapseuroSpare1 = value;
    }

    /**
     * Gets the value of the ccccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCStatus() {
        return ccccStatus;
    }

    /**
     * Sets the value of the ccccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCStatus(String value) {
        this.ccccStatus = value;
    }

    /**
     * Gets the value of the cccCeffectiveDateofLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCeffectiveDateofLastChange() {
        return cccCeffectiveDateofLastChange;
    }

    /**
     * Sets the value of the cccCeffectiveDateofLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCeffectiveDateofLastChange(String value) {
        this.cccCeffectiveDateofLastChange = value;
    }

    /**
     * Gets the value of the ccccDateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCDateClosed() {
        return ccccDateClosed;
    }

    /**
     * Sets the value of the ccccDateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCDateClosed(String value) {
        this.ccccDateClosed = value;
    }

    /**
     * Gets the value of the ccccSettlementBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCSettlementBank() {
        return ccccSettlementBank;
    }

    /**
     * Sets the value of the ccccSettlementBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCSettlementBank(String value) {
        this.ccccSettlementBank = value;
    }

    /**
     * Gets the value of the ccccDebitAgencySortingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCDebitAgencySortingCode() {
        return ccccDebitAgencySortingCode;
    }

    /**
     * Sets the value of the ccccDebitAgencySortingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCDebitAgencySortingCode(String value) {
        this.ccccDebitAgencySortingCode = value;
    }

    /**
     * Gets the value of the ccccReturnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCReturnIndicator() {
        return ccccReturnIndicator;
    }

    /**
     * Sets the value of the ccccReturnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCReturnIndicator(String value) {
        this.ccccReturnIndicator = value;
    }

    /**
     * Gets the value of the ccccgbniIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCCGBNIIndicator() {
        return ccccgbniIndicator;
    }

    /**
     * Sets the value of the ccccgbniIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCCGBNIIndicator(String value) {
        this.ccccgbniIndicator = value;
    }

    /**
     * Gets the value of the printBranchTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTBranchTypeIndicator() {
        return printBranchTypeIndicator;
    }

    /**
     * Sets the value of the printBranchTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTBranchTypeIndicator(String value) {
        this.printBranchTypeIndicator = value;
    }

    /**
     * Gets the value of the printSortcodeOfMainBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTSortcodeOfMainBranch() {
        return printSortcodeOfMainBranch;
    }

    /**
     * Sets the value of the printSortcodeOfMainBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTSortcodeOfMainBranch(String value) {
        this.printSortcodeOfMainBranch = value;
    }

    /**
     * Gets the value of the printMajorLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTMajorLocationName() {
        return printMajorLocationName;
    }

    /**
     * Sets the value of the printMajorLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTMajorLocationName(String value) {
        this.printMajorLocationName = value;
    }

    /**
     * Gets the value of the printMinorLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTMinorLocationName() {
        return printMinorLocationName;
    }

    /**
     * Sets the value of the printMinorLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTMinorLocationName(String value) {
        this.printMinorLocationName = value;
    }

    /**
     * Gets the value of the printBranchNameOrPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTBranchNameOrPlace() {
        return printBranchNameOrPlace;
    }

    /**
     * Sets the value of the printBranchNameOrPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTBranchNameOrPlace(String value) {
        this.printBranchNameOrPlace = value;
    }

    /**
     * Gets the value of the printSecondEntryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTSecondEntryIndicator() {
        return printSecondEntryIndicator;
    }

    /**
     * Sets the value of the printSecondEntryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTSecondEntryIndicator(String value) {
        this.printSecondEntryIndicator = value;
    }

    /**
     * Gets the value of the printBranchNameForSecondEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTBranchNameForSecondEntry() {
        return printBranchNameForSecondEntry;
    }

    /**
     * Sets the value of the printBranchNameForSecondEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTBranchNameForSecondEntry(String value) {
        this.printBranchNameForSecondEntry = value;
    }

    /**
     * Gets the value of the printFullBranchTitlePart1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTFullBranchTitlePart1() {
        return printFullBranchTitlePart1;
    }

    /**
     * Sets the value of the printFullBranchTitlePart1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTFullBranchTitlePart1(String value) {
        this.printFullBranchTitlePart1 = value;
    }

    /**
     * Gets the value of the printFullBranchTitlePart2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTFullBranchTitlePart2() {
        return printFullBranchTitlePart2;
    }

    /**
     * Sets the value of the printFullBranchTitlePart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTFullBranchTitlePart2(String value) {
        this.printFullBranchTitlePart2 = value;
    }

    /**
     * Gets the value of the printFullBranchTitlePart3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTFullBranchTitlePart3() {
        return printFullBranchTitlePart3;
    }

    /**
     * Sets the value of the printFullBranchTitlePart3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTFullBranchTitlePart3(String value) {
        this.printFullBranchTitlePart3 = value;
    }

    /**
     * Gets the value of the printAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTAddressLine1() {
        return printAddressLine1;
    }

    /**
     * Sets the value of the printAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTAddressLine1(String value) {
        this.printAddressLine1 = value;
    }

    /**
     * Gets the value of the printAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTAddressLine2() {
        return printAddressLine2;
    }

    /**
     * Sets the value of the printAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTAddressLine2(String value) {
        this.printAddressLine2 = value;
    }

    /**
     * Gets the value of the printAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTAddressLine3() {
        return printAddressLine3;
    }

    /**
     * Sets the value of the printAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTAddressLine3(String value) {
        this.printAddressLine3 = value;
    }

    /**
     * Gets the value of the printAddressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTAddressLine4() {
        return printAddressLine4;
    }

    /**
     * Sets the value of the printAddressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTAddressLine4(String value) {
        this.printAddressLine4 = value;
    }

    /**
     * Gets the value of the printTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTTown() {
        return printTown;
    }

    /**
     * Sets the value of the printTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTTown(String value) {
        this.printTown = value;
    }

    /**
     * Gets the value of the printCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTCounty() {
        return printCounty;
    }

    /**
     * Sets the value of the printCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTCounty(String value) {
        this.printCounty = value;
    }

    /**
     * Gets the value of the printPostcodeField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTPostcodeField1() {
        return printPostcodeField1;
    }

    /**
     * Sets the value of the printPostcodeField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTPostcodeField1(String value) {
        this.printPostcodeField1 = value;
    }

    /**
     * Gets the value of the printPostcodeField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTPostcodeField2() {
        return printPostcodeField2;
    }

    /**
     * Sets the value of the printPostcodeField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTPostcodeField2(String value) {
        this.printPostcodeField2 = value;
    }

    /**
     * Gets the value of the printTelephoneArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTTelephoneArea() {
        return printTelephoneArea;
    }

    /**
     * Sets the value of the printTelephoneArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTTelephoneArea(String value) {
        this.printTelephoneArea = value;
    }

    /**
     * Gets the value of the printTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTTelephoneNumber() {
        return printTelephoneNumber;
    }

    /**
     * Sets the value of the printTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTTelephoneNumber(String value) {
        this.printTelephoneNumber = value;
    }

    /**
     * Gets the value of the printTelephone2Area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTTelephone2Area() {
        return printTelephone2Area;
    }

    /**
     * Sets the value of the printTelephone2Area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTTelephone2Area(String value) {
        this.printTelephone2Area = value;
    }

    /**
     * Gets the value of the printTelephone2Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTTelephone2Number() {
        return printTelephone2Number;
    }

    /**
     * Sets the value of the printTelephone2Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTTelephone2Number(String value) {
        this.printTelephone2Number = value;
    }

}
