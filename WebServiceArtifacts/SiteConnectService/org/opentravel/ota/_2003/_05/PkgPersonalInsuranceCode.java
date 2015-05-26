
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PkgPersonalInsuranceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PkgPersonalInsuranceCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ski"/>
 *     &lt;enumeration value="Worldwide"/>
 *     &lt;enumeration value="Europe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PkgPersonalInsuranceCode")
@XmlEnum
public enum PkgPersonalInsuranceCode {

    @XmlEnumValue("Ski")
    SKI("Ski"),
    @XmlEnumValue("Worldwide")
    WORLDWIDE("Worldwide"),
    @XmlEnumValue("Europe")
    EUROPE("Europe");
    private final String value;

    PkgPersonalInsuranceCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PkgPersonalInsuranceCode fromValue(String v) {
        for (PkgPersonalInsuranceCode c: PkgPersonalInsuranceCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
