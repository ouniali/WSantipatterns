
package com.nuwave_tech.soapam.services.bankdemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="txOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abort"/>
 *     &lt;enumeration value="begin"/>
 *     &lt;enumeration value="commit"/>
 *     &lt;enumeration value="end"/>
 *     &lt;enumeration value="suspend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "txOperationType")
@XmlEnum
public enum TxOperationType {

    @XmlEnumValue("abort")
    ABORT("abort"),
    @XmlEnumValue("begin")
    BEGIN("begin"),
    @XmlEnumValue("commit")
    COMMIT("commit"),
    @XmlEnumValue("end")
    END("end"),
    @XmlEnumValue("suspend")
    SUSPEND("suspend");
    private final String value;

    TxOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TxOperationType fromValue(String v) {
        for (TxOperationType c: TxOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
