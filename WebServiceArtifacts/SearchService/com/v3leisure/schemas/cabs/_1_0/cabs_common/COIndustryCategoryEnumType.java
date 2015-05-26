
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_IndustryCategoryEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_IndustryCategoryEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accommodation"/>
 *     &lt;enumeration value="Attraction"/>
 *     &lt;enumeration value="Events"/>
 *     &lt;enumeration value="Adventure"/>
 *     &lt;enumeration value="Charter Or Rental"/>
 *     &lt;enumeration value="Epicurean"/>
 *     &lt;enumeration value="Function Centre"/>
 *     &lt;enumeration value="Tours"/>
 *     &lt;enumeration value="Non-Serviced Accommodation"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_IndustryCategoryEnumType")
@XmlEnum
public enum COIndustryCategoryEnumType {

    @XmlEnumValue("Accommodation")
    ACCOMMODATION("Accommodation"),
    @XmlEnumValue("Attraction")
    ATTRACTION("Attraction"),
    @XmlEnumValue("Events")
    EVENTS("Events"),
    @XmlEnumValue("Adventure")
    ADVENTURE("Adventure"),
    @XmlEnumValue("Charter Or Rental")
    CHARTER_OR_RENTAL("Charter Or Rental"),
    @XmlEnumValue("Epicurean")
    EPICUREAN("Epicurean"),
    @XmlEnumValue("Function Centre")
    FUNCTION_CENTRE("Function Centre"),
    @XmlEnumValue("Tours")
    TOURS("Tours"),
    @XmlEnumValue("Non-Serviced Accommodation")
    NON_SERVICED_ACCOMMODATION("Non-Serviced Accommodation"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    COIndustryCategoryEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COIndustryCategoryEnumType fromValue(String v) {
        for (COIndustryCategoryEnumType c: COIndustryCategoryEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
