
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="constructed"/>
 *     &lt;enumeration value="published"/>
 *     &lt;enumeration value="created"/>
 *     &lt;enumeration value="fareByRule"/>
 *     &lt;enumeration value="fareByRulePrivate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareStatusType")
@XmlEnum
public enum FareStatusType {

    @XmlEnumValue("constructed")
    CONSTRUCTED("constructed"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("created")
    CREATED("created"),
    @XmlEnumValue("fareByRule")
    FARE_BY_RULE("fareByRule"),
    @XmlEnumValue("fareByRulePrivate")
    FARE_BY_RULE_PRIVATE("fareByRulePrivate");
    private final String value;

    FareStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareStatusType fromValue(String v) {
        for (FareStatusType c: FareStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
