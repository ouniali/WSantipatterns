
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FlightAndHotel"/>
 *     &lt;enumeration value="HotelAndActivities"/>
 *     &lt;enumeration value="Activites"/>
 *     &lt;enumeration value="FlightOnly"/>
 *     &lt;enumeration value="HotelOnly"/>
 *     &lt;enumeration value="CarOnly"/>
 *     &lt;enumeration value="TourOnly"/>
 *     &lt;enumeration value="TransferOnly"/>
 *     &lt;enumeration value="Packages"/>
 *     &lt;enumeration value="FlightAndCar"/>
 *     &lt;enumeration value="FlightAndTransfer"/>
 *     &lt;enumeration value="FlightAndTours"/>
 *     &lt;enumeration value="MultiLeg"/>
 *     &lt;enumeration value="HotelPackage"/>
 *     &lt;enumeration value="MultilegPackage"/>
 *     &lt;enumeration value="AirlineFlight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL")
@XmlEnum
public enum SearchType {

    @XmlEnumValue("FlightAndHotel")
    FLIGHT_AND_HOTEL("FlightAndHotel"),
    @XmlEnumValue("HotelAndActivities")
    HOTEL_AND_ACTIVITIES("HotelAndActivities"),
    @XmlEnumValue("Activites")
    ACTIVITES("Activites"),
    @XmlEnumValue("FlightOnly")
    FLIGHT_ONLY("FlightOnly"),
    @XmlEnumValue("HotelOnly")
    HOTEL_ONLY("HotelOnly"),
    @XmlEnumValue("CarOnly")
    CAR_ONLY("CarOnly"),
    @XmlEnumValue("TourOnly")
    TOUR_ONLY("TourOnly"),
    @XmlEnumValue("TransferOnly")
    TRANSFER_ONLY("TransferOnly"),
    @XmlEnumValue("Packages")
    PACKAGES("Packages"),
    @XmlEnumValue("FlightAndCar")
    FLIGHT_AND_CAR("FlightAndCar"),
    @XmlEnumValue("FlightAndTransfer")
    FLIGHT_AND_TRANSFER("FlightAndTransfer"),
    @XmlEnumValue("FlightAndTours")
    FLIGHT_AND_TOURS("FlightAndTours"),
    @XmlEnumValue("MultiLeg")
    MULTI_LEG("MultiLeg"),
    @XmlEnumValue("HotelPackage")
    HOTEL_PACKAGE("HotelPackage"),
    @XmlEnumValue("MultilegPackage")
    MULTILEG_PACKAGE("MultilegPackage"),
    @XmlEnumValue("AirlineFlight")
    AIRLINE_FLIGHT("AirlineFlight");
    private final String value;

    SearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchType fromValue(String v) {
        for (SearchType c: SearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
