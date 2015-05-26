
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareAccessPrefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareAccessPrefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="PointToPoint"/>
 *     &lt;enumeration value="Through"/>
 *     &lt;enumeration value="Joint"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="SecurateAir"/>
 *     &lt;enumeration value="Moneysaver"/>
 *     &lt;enumeration value="MoneysaverRoundtrip"/>
 *     &lt;enumeration value="MoneysaverNoOneWay"/>
 *     &lt;enumeration value="MoneysaverOneWayOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareAccessPrefType")
@XmlEnum
public enum FareAccessPrefType {

    @XmlEnumValue("PointToPoint")
    POINT_TO_POINT("PointToPoint"),
    @XmlEnumValue("Through")
    THROUGH("Through"),
    @XmlEnumValue("Joint")
    JOINT("Joint"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),
    @XmlEnumValue("SecurateAir")
    SECURATE_AIR("SecurateAir"),
    @XmlEnumValue("Moneysaver")
    MONEYSAVER("Moneysaver"),
    @XmlEnumValue("MoneysaverRoundtrip")
    MONEYSAVER_ROUNDTRIP("MoneysaverRoundtrip"),
    @XmlEnumValue("MoneysaverNoOneWay")
    MONEYSAVER_NO_ONE_WAY("MoneysaverNoOneWay"),
    @XmlEnumValue("MoneysaverOneWayOnly")
    MONEYSAVER_ONE_WAY_ONLY("MoneysaverOneWayOnly");
    private final String value;

    FareAccessPrefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAccessPrefType fromValue(String v) {
        for (FareAccessPrefType c: FareAccessPrefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
