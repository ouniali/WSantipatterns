
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryByTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryByTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExDate"/>
 *     &lt;enumeration value="RecordDate"/>
 *     &lt;enumeration value="PaymentDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryByTypes")
@XmlEnum
public enum QueryByTypes {

    @XmlEnumValue("ExDate")
    EX_DATE("ExDate"),
    @XmlEnumValue("RecordDate")
    RECORD_DATE("RecordDate"),
    @XmlEnumValue("PaymentDate")
    PAYMENT_DATE("PaymentDate");
    private final String value;

    QueryByTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryByTypes fromValue(String v) {
        for (QueryByTypes c: QueryByTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
