
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerRelatedTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssuerRelatedTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Instruments"/>
 *     &lt;enumeration value="InstrumentsAndSecurities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssuerRelatedTypes")
@XmlEnum
public enum IssuerRelatedTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Instruments")
    INSTRUMENTS("Instruments"),
    @XmlEnumValue("InstrumentsAndSecurities")
    INSTRUMENTS_AND_SECURITIES("InstrumentsAndSecurities");
    private final String value;

    IssuerRelatedTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssuerRelatedTypes fromValue(String v) {
        for (IssuerRelatedTypes c: IssuerRelatedTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
