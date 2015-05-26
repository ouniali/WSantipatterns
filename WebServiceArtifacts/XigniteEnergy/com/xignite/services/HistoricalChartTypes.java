
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalChartTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistoricalChartTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleContract"/>
 *     &lt;enumeration value="Commodity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HistoricalChartTypes")
@XmlEnum
public enum HistoricalChartTypes {

    @XmlEnumValue("SingleContract")
    SINGLE_CONTRACT("SingleContract"),
    @XmlEnumValue("Commodity")
    COMMODITY("Commodity");
    private final String value;

    HistoricalChartTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoricalChartTypes fromValue(String v) {
        for (HistoricalChartTypes c: HistoricalChartTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
