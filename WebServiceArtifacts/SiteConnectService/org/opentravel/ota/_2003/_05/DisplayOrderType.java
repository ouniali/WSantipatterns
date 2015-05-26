
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ByDepartureTime"/>
 *     &lt;enumeration value="ByArrivalTime"/>
 *     &lt;enumeration value="ByJourneyTime"/>
 *     &lt;enumeration value="ByPriceHighToLow"/>
 *     &lt;enumeration value="ByPriceLowToHigh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayOrderType")
@XmlEnum
public enum DisplayOrderType {

    @XmlEnumValue("ByDepartureTime")
    BY_DEPARTURE_TIME("ByDepartureTime"),
    @XmlEnumValue("ByArrivalTime")
    BY_ARRIVAL_TIME("ByArrivalTime"),
    @XmlEnumValue("ByJourneyTime")
    BY_JOURNEY_TIME("ByJourneyTime"),
    @XmlEnumValue("ByPriceHighToLow")
    BY_PRICE_HIGH_TO_LOW("ByPriceHighToLow"),
    @XmlEnumValue("ByPriceLowToHigh")
    BY_PRICE_LOW_TO_HIGH("ByPriceLowToHigh");
    private final String value;

    DisplayOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayOrderType fromValue(String v) {
        for (DisplayOrderType c: DisplayOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
