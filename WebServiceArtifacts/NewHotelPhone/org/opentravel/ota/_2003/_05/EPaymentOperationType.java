
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPaymentOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPaymentOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Insert"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Cancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPaymentOperationType")
@XmlEnum
public enum EPaymentOperationType {

    @XmlEnumValue("Insert")
    INSERT("Insert"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    EPaymentOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaymentOperationType fromValue(String v) {
        for (EPaymentOperationType c: EPaymentOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
