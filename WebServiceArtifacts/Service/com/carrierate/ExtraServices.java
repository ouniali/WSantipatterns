
package com.carrierate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtraServices.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtraServices">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="InsideDelivery"/>
 *     &lt;enumeration value="Notify"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtraServices")
@XmlEnum
public enum ExtraServices {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("InsideDelivery")
    INSIDE_DELIVERY("InsideDelivery"),
    @XmlEnumValue("Notify")
    NOTIFY("Notify"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ExtraServices(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtraServices fromValue(String v) {
        for (ExtraServices c: ExtraServices.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
