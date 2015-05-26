
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DictionaryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DictionaryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="CityDeparture"/>
 *     &lt;enumeration value="TourType"/>
 *     &lt;enumeration value="Tour"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="TourDate"/>
 *     &lt;enumeration value="HotelCategory"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Meal"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="HotelRoom"/>
 *     &lt;enumeration value="RoomCategory"/>
 *     &lt;enumeration value="RoomType"/>
 *     &lt;enumeration value="Accommadation"/>
 *     &lt;enumeration value="HotelLink"/>
 *     &lt;enumeration value="TouristCountDetail"/>
 *     &lt;enumeration value="HotelCategoryUniq"/>
 *     &lt;enumeration value="MealUniq"/>
 *     &lt;enumeration value="Rate"/>
 *     &lt;enumeration value="AirLine"/>
 *     &lt;enumeration value="AirPort"/>
 *     &lt;enumeration value="AirCraft"/>
 *     &lt;enumeration value="AddDescript1"/>
 *     &lt;enumeration value="AddDescript2"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="Transport"/>
 *     &lt;enumeration value="Resort"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="FlightTariff"/>
 *     &lt;enumeration value="AirSeason"/>
 *     &lt;enumeration value="ServiceList"/>
 *     &lt;enumeration value="Pax"/>
 *     &lt;enumeration value="HotelGroup"/>
 *     &lt;enumeration value="HotelFacility"/>
 *     &lt;enumeration value="BaseRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DictionaryEnum")
@XmlEnum
public enum DictionaryEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("CityDeparture")
    CITY_DEPARTURE("CityDeparture"),
    @XmlEnumValue("TourType")
    TOUR_TYPE("TourType"),
    @XmlEnumValue("Tour")
    TOUR("Tour"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("TourDate")
    TOUR_DATE("TourDate"),
    @XmlEnumValue("HotelCategory")
    HOTEL_CATEGORY("HotelCategory"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Meal")
    MEAL("Meal"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("HotelRoom")
    HOTEL_ROOM("HotelRoom"),
    @XmlEnumValue("RoomCategory")
    ROOM_CATEGORY("RoomCategory"),
    @XmlEnumValue("RoomType")
    ROOM_TYPE("RoomType"),
    @XmlEnumValue("Accommadation")
    ACCOMMADATION("Accommadation"),
    @XmlEnumValue("HotelLink")
    HOTEL_LINK("HotelLink"),
    @XmlEnumValue("TouristCountDetail")
    TOURIST_COUNT_DETAIL("TouristCountDetail"),
    @XmlEnumValue("HotelCategoryUniq")
    HOTEL_CATEGORY_UNIQ("HotelCategoryUniq"),
    @XmlEnumValue("MealUniq")
    MEAL_UNIQ("MealUniq"),
    @XmlEnumValue("Rate")
    RATE("Rate"),
    @XmlEnumValue("AirLine")
    AIR_LINE("AirLine"),
    @XmlEnumValue("AirPort")
    AIR_PORT("AirPort"),
    @XmlEnumValue("AirCraft")
    AIR_CRAFT("AirCraft"),
    @XmlEnumValue("AddDescript1")
    ADD_DESCRIPT_1("AddDescript1"),
    @XmlEnumValue("AddDescript2")
    ADD_DESCRIPT_2("AddDescript2"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Transport")
    TRANSPORT("Transport"),
    @XmlEnumValue("Resort")
    RESORT("Resort"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("FlightTariff")
    FLIGHT_TARIFF("FlightTariff"),
    @XmlEnumValue("AirSeason")
    AIR_SEASON("AirSeason"),
    @XmlEnumValue("ServiceList")
    SERVICE_LIST("ServiceList"),
    @XmlEnumValue("Pax")
    PAX("Pax"),
    @XmlEnumValue("HotelGroup")
    HOTEL_GROUP("HotelGroup"),
    @XmlEnumValue("HotelFacility")
    HOTEL_FACILITY("HotelFacility"),
    @XmlEnumValue("BaseRate")
    BASE_RATE("BaseRate");
    private final String value;

    DictionaryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DictionaryEnum fromValue(String v) {
        for (DictionaryEnum c: DictionaryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
