
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompartmentPositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompartmentPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CloseToRestaurantCar"/>
 *     &lt;enumeration value="CloseToExit"/>
 *     &lt;enumeration value="CloseToToilet"/>
 *     &lt;enumeration value="MiddleOfCar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompartmentPositionType")
@XmlEnum
public enum CompartmentPositionType {

    @XmlEnumValue("CloseToRestaurantCar")
    CLOSE_TO_RESTAURANT_CAR("CloseToRestaurantCar"),
    @XmlEnumValue("CloseToExit")
    CLOSE_TO_EXIT("CloseToExit"),
    @XmlEnumValue("CloseToToilet")
    CLOSE_TO_TOILET("CloseToToilet"),
    @XmlEnumValue("MiddleOfCar")
    MIDDLE_OF_CAR("MiddleOfCar");
    private final String value;

    CompartmentPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompartmentPositionType fromValue(String v) {
        for (CompartmentPositionType c: CompartmentPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
