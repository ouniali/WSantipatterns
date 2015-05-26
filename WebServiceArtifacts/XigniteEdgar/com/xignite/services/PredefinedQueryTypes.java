
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedQueryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredefinedQueryTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllFilings"/>
 *     &lt;enumeration value="AnnualReports"/>
 *     &lt;enumeration value="QuarterlyReports"/>
 *     &lt;enumeration value="RegistrationStatements"/>
 *     &lt;enumeration value="InsiderTransactions"/>
 *     &lt;enumeration value="CurrentReports"/>
 *     &lt;enumeration value="PressReleases"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredefinedQueryTypes")
@XmlEnum
public enum PredefinedQueryTypes {

    @XmlEnumValue("AllFilings")
    ALL_FILINGS("AllFilings"),
    @XmlEnumValue("AnnualReports")
    ANNUAL_REPORTS("AnnualReports"),
    @XmlEnumValue("QuarterlyReports")
    QUARTERLY_REPORTS("QuarterlyReports"),
    @XmlEnumValue("RegistrationStatements")
    REGISTRATION_STATEMENTS("RegistrationStatements"),
    @XmlEnumValue("InsiderTransactions")
    INSIDER_TRANSACTIONS("InsiderTransactions"),
    @XmlEnumValue("CurrentReports")
    CURRENT_REPORTS("CurrentReports"),
    @XmlEnumValue("PressReleases")
    PRESS_RELEASES("PressReleases");
    private final String value;

    PredefinedQueryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredefinedQueryTypes fromValue(String v) {
        for (PredefinedQueryTypes c: PredefinedQueryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
