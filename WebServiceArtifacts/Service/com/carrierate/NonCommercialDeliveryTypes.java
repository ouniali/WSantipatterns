
package com.carrierate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonCommercialDeliveryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonCommercialDeliveryTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="ConstructionUtilitySite"/>
 *     &lt;enumeration value="CorrectionalFacility"/>
 *     &lt;enumeration value="MilitaryBase"/>
 *     &lt;enumeration value="PiersWharves"/>
 *     &lt;enumeration value="StorageFacility"/>
 *     &lt;enumeration value="Church"/>
 *     &lt;enumeration value="Farm"/>
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="Ranch"/>
 *     &lt;enumeration value="CountryClub"/>
 *     &lt;enumeration value="ShoppingMall"/>
 *     &lt;enumeration value="MinesQuarries"/>
 *     &lt;enumeration value="GolfCourse"/>
 *     &lt;enumeration value="NursingHomes"/>
 *     &lt;enumeration value="GovernmentSite"/>
 *     &lt;enumeration value="ContainerFreightStation"/>
 *     &lt;enumeration value="Hotel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonCommercialDeliveryTypes")
@XmlEnum
public enum NonCommercialDeliveryTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("ConstructionUtilitySite")
    CONSTRUCTION_UTILITY_SITE("ConstructionUtilitySite"),
    @XmlEnumValue("CorrectionalFacility")
    CORRECTIONAL_FACILITY("CorrectionalFacility"),
    @XmlEnumValue("MilitaryBase")
    MILITARY_BASE("MilitaryBase"),
    @XmlEnumValue("PiersWharves")
    PIERS_WHARVES("PiersWharves"),
    @XmlEnumValue("StorageFacility")
    STORAGE_FACILITY("StorageFacility"),
    @XmlEnumValue("Church")
    CHURCH("Church"),
    @XmlEnumValue("Farm")
    FARM("Farm"),
    @XmlEnumValue("School")
    SCHOOL("School"),
    @XmlEnumValue("Ranch")
    RANCH("Ranch"),
    @XmlEnumValue("CountryClub")
    COUNTRY_CLUB("CountryClub"),
    @XmlEnumValue("ShoppingMall")
    SHOPPING_MALL("ShoppingMall"),
    @XmlEnumValue("MinesQuarries")
    MINES_QUARRIES("MinesQuarries"),
    @XmlEnumValue("GolfCourse")
    GOLF_COURSE("GolfCourse"),
    @XmlEnumValue("NursingHomes")
    NURSING_HOMES("NursingHomes"),
    @XmlEnumValue("GovernmentSite")
    GOVERNMENT_SITE("GovernmentSite"),
    @XmlEnumValue("ContainerFreightStation")
    CONTAINER_FREIGHT_STATION("ContainerFreightStation"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel");
    private final String value;

    NonCommercialDeliveryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonCommercialDeliveryTypes fromValue(String v) {
        for (NonCommercialDeliveryTypes c: NonCommercialDeliveryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
