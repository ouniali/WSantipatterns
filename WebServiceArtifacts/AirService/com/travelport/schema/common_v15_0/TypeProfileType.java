
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AgencyGroup"/>
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="BranchGroup"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="TravelerGroup"/>
 *     &lt;enumeration value="Traveler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProfileType")
@XmlEnum
public enum TypeProfileType {

    @XmlEnumValue("AgencyGroup")
    AGENCY_GROUP("AgencyGroup"),
    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("TravelerGroup")
    TRAVELER_GROUP("TravelerGroup"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler");
    private final String value;

    TypeProfileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileType fromValue(String v) {
        for (TypeProfileType c: TypeProfileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
