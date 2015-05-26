
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDisplayDetailName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDisplayDetailName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OwningAgencyPCC"/>
 *     &lt;enumeration value="CreatingAgentSignOn"/>
 *     &lt;enumeration value="CreatingAgentDuty"/>
 *     &lt;enumeration value="CreatingAgencyIATA"/>
 *     &lt;enumeration value="PrepaidTicketAdviceIndicator"/>
 *     &lt;enumeration value="BFBorrowed"/>
 *     &lt;enumeration value="GlobalPNR"/>
 *     &lt;enumeration value="ReadOnlyPNR"/>
 *     &lt;enumeration value="PastDateQuickRetrievedPNR"/>
 *     &lt;enumeration value="SuperPNR"/>
 *     &lt;enumeration value="PNRPurgeDate"/>
 *     &lt;enumeration value="OriginalReceivedFieldValue"/>
 *     &lt;enumeration value="DivPsgrName"/>
 *     &lt;enumeration value="TruncInd"/>
 *     &lt;enumeration value="DivTypeInd"/>
 *     &lt;enumeration value="RLoc"/>
 *     &lt;enumeration value="DivDt"/>
 *     &lt;enumeration value="DivTm"/>
 *     &lt;enumeration value="TravelOrder"/>
 *     &lt;enumeration value="SegmentStatus"/>
 *     &lt;enumeration value="StartDate"/>
 *     &lt;enumeration value="DayChange"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="StartTime"/>
 *     &lt;enumeration value="EndTime"/>
 *     &lt;enumeration value="BookingCode"/>
 *     &lt;enumeration value="TrainNumber"/>
 *     &lt;enumeration value="NumberOfSeats"/>
 *     &lt;enumeration value="SellType"/>
 *     &lt;enumeration value="TariffType"/>
 *     &lt;enumeration value="ConfirmationNumber"/>
 *     &lt;enumeration value="BoardingInformation"/>
 *     &lt;enumeration value="ArrivalInformation"/>
 *     &lt;enumeration value="Text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDisplayDetailName")
@XmlEnum
public enum TypeDisplayDetailName {


    /**
     * 
     *                  The pseudo city code of the agency owning the PNR 
     *              
     * 
     */
    @XmlEnumValue("OwningAgencyPCC")
    OWNING_AGENCY_PCC("OwningAgencyPCC"),

    /**
     * 
     *                     Sign on code of the agent created the PNR
     *                 
     * 
     */
    @XmlEnumValue("CreatingAgentSignOn")
    CREATING_AGENT_SIGN_ON("CreatingAgentSignOn"),

    /**
     * 
     *                     Duty code of the agent created the PNR
     *                 
     * 
     */
    @XmlEnumValue("CreatingAgentDuty")
    CREATING_AGENT_DUTY("CreatingAgentDuty"),

    /**
     * 
     *                     IATA number of the agency  created the PNR
     *                 
     * 
     */
    @XmlEnumValue("CreatingAgencyIATA")
    CREATING_AGENCY_IATA("CreatingAgencyIATA"),

    /**
     * 
     *                     Indicates whether Prepaid Ticket Advice is attached to PNR
     *                 
     * 
     */
    @XmlEnumValue("PrepaidTicketAdviceIndicator")
    PREPAID_TICKET_ADVICE_INDICATOR("PrepaidTicketAdviceIndicator"),

    /**
     * 
     *                     Indicates the current PNR as borrowed
     *                 
     * 
     */
    @XmlEnumValue("BFBorrowed")
    BF_BORROWED("BFBorrowed"),

    /**
     * 
     *                      Indicates whether current PNR is Global PNR
     *                 
     * 
     */
    @XmlEnumValue("GlobalPNR")
    GLOBAL_PNR("GlobalPNR"),

    /**
     * 
     *                     Indicates PNR as read only
     *                 
     * 
     */
    @XmlEnumValue("ReadOnlyPNR")
    READ_ONLY_PNR("ReadOnlyPNR"),

    /**
     * 
     *                      Indicates PNR retrieved from offline archival process                 
     *                 
     * 
     */
    @XmlEnumValue("PastDateQuickRetrievedPNR")
    PAST_DATE_QUICK_RETRIEVED_PNR("PastDateQuickRetrievedPNR"),

    /**
     * 
     *                     Indicates whether current PNR is Super PNR
     *                 
     * 
     */
    @XmlEnumValue("SuperPNR")
    SUPER_PNR("SuperPNR"),

    /**
     * 
     *                     Purge date of the PNR
     *                 
     * 
     */
    @XmlEnumValue("PNRPurgeDate")
    PNR_PURGE_DATE("PNRPurgeDate"),

    /**
     * 
     *                     The original data in the received field
     *                 
     * 
     */
    @XmlEnumValue("OriginalReceivedFieldValue")
    ORIGINAL_RECEIVED_FIELD_VALUE("OriginalReceivedFieldValue"),

    /**
     * 
     *                     Passenger Name in a divided PNR
     *                 
     * 
     */
    @XmlEnumValue("DivPsgrName")
    DIV_PSGR_NAME("DivPsgrName"),

    /**
     * 
     *                     Indicator for Truncated names
     *                 
     * 
     */
    @XmlEnumValue("TruncInd")
    TRUNC_IND("TruncInd"),

    /**
     * 
     *                     Divide Type Indicator if it pertains to child or parent booking
     *                 
     * 
     */
    @XmlEnumValue("DivTypeInd")
    DIV_TYPE_IND("DivTypeInd"),

    /**
     * 
     *                     Record Locator of parent or child booking
     *                 
     * 
     */
    @XmlEnumValue("RLoc")
    R_LOC("RLoc"),

    /**
     * 
     *                     Date of divide action
     *                 
     * 
     */
    @XmlEnumValue("DivDt")
    DIV_DT("DivDt"),

    /**
     * 
     *                     Time of day of divide action
     *                 
     * 
     */
    @XmlEnumValue("DivTm")
    DIV_TM("DivTm"),

    /**
     * 
     *                     Travel order of the segment
     *                 
     * 
     */
    @XmlEnumValue("TravelOrder")
    TRAVEL_ORDER("TravelOrder"),

    /**
     * 
     *                     Status of associated segment
     *                 
     * 
     */
    @XmlEnumValue("SegmentStatus")
    SEGMENT_STATUS("SegmentStatus"),

    /**
     * 
     *                      Date of departure of the rail segment
     *                 
     * 
     */
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),

    /**
     * 
     *                     Indicates arrival date as number of days before or after departure date
     *                 
     * 
     */
    @XmlEnumValue("DayChange")
    DAY_CHANGE("DayChange"),

    /**
     * 
     *                         Vendor code of the segment
     *                 
     * 
     */
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),

    /**
     * 
     *                     Start Time of the segment
     *                 
     * 
     */
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),

    /**
     * 
     *                         End Time of the segment
     *                 
     * 
     */
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),

    /**
     * 
     *                    The booking code of the rail segment seating area
     *                 
     * 
     */
    @XmlEnumValue("BookingCode")
    BOOKING_CODE("BookingCode"),

    /**
     * 
     *                     Denotes Train number
     *                 
     * 
     */
    @XmlEnumValue("TrainNumber")
    TRAIN_NUMBER("TrainNumber"),

    /**
     * 
     *                     Number of seats sold for the trip
     *                 
     * 
     */
    @XmlEnumValue("NumberOfSeats")
    NUMBER_OF_SEATS("NumberOfSeats"),

    /**
     * 
     *                    The mode of selling the segment
     *                 
     * 
     */
    @XmlEnumValue("SellType")
    SELL_TYPE("SellType"),

    /**
     * 
     *                      Type of Tariff for the segment
     *                 
     * 
     */
    @XmlEnumValue("TariffType")
    TARIFF_TYPE("TariffType"),

    /**
     * 
     *                      The confirmation number of the segment
     *                 
     * 
     */
    @XmlEnumValue("ConfirmationNumber")
    CONFIRMATION_NUMBER("ConfirmationNumber"),

    /**
     * 
     *                      Information related to boarding point of the segment
     *                 
     * 
     */
    @XmlEnumValue("BoardingInformation")
    BOARDING_INFORMATION("BoardingInformation"),

    /**
     * 
     *                    Information related to arrival point of the segment
     *                 
     * 
     */
    @XmlEnumValue("ArrivalInformation")
    ARRIVAL_INFORMATION("ArrivalInformation"),

    /**
     * 
     *                     Additional   information
     *                 
     * 
     */
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    TypeDisplayDetailName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDisplayDetailName fromValue(String v) {
        for (TypeDisplayDetailName c: TypeDisplayDetailName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
