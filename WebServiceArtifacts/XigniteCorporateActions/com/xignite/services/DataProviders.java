
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataProviders.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataProviders">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XigniteComposite"/>
 *     &lt;enumeration value="Telekurs"/>
 *     &lt;enumeration value="LegacyXignite"/>
 *     &lt;enumeration value="ExchangeWebsite"/>
 *     &lt;enumeration value="ManualXignite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataProviders")
@XmlEnum
public enum DataProviders {

    @XmlEnumValue("XigniteComposite")
    XIGNITE_COMPOSITE("XigniteComposite"),
    @XmlEnumValue("Telekurs")
    TELEKURS("Telekurs"),
    @XmlEnumValue("LegacyXignite")
    LEGACY_XIGNITE("LegacyXignite"),
    @XmlEnumValue("ExchangeWebsite")
    EXCHANGE_WEBSITE("ExchangeWebsite"),
    @XmlEnumValue("ManualXignite")
    MANUAL_XIGNITE("ManualXignite");
    private final String value;

    DataProviders(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataProviders fromValue(String v) {
        for (DataProviders c: DataProviders.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
