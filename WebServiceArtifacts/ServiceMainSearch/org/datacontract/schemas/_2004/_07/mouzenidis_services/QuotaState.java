
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotaState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Little"/>
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="OkLittle"/>
 *     &lt;enumeration value="Wait"/>
 *     &lt;enumeration value="Stop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotaState")
@XmlEnum
public enum QuotaState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Little")
    LITTLE("Little"),
    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("OkLittle")
    OK_LITTLE("OkLittle"),
    @XmlEnumValue("Wait")
    WAIT("Wait"),
    @XmlEnumValue("Stop")
    STOP("Stop");
    private final String value;

    QuotaState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotaState fromValue(String v) {
        for (QuotaState c: QuotaState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
