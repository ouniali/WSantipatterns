
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Avia"/>
 *     &lt;enumeration value="Bus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransportKind")
@XmlEnum
public enum TransportKind {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Avia")
    AVIA("Avia"),
    @XmlEnumValue("Bus")
    BUS("Bus");
    private final String value;

    TransportKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportKind fromValue(String v) {
        for (TransportKind c: TransportKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
