
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileLevelWithCredential.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileLevelWithCredential">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Agent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProfileLevelWithCredential")
@XmlEnum
public enum TypeProfileLevelWithCredential {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    TypeProfileLevelWithCredential(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileLevelWithCredential fromValue(String v) {
        for (TypeProfileLevelWithCredential c: TypeProfileLevelWithCredential.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
