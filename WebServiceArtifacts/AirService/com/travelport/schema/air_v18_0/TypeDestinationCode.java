
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDestinationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDestinationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MexicoCostRicaCentralAmerica"/>
 *     &lt;enumeration value="Caribbean"/>
 *     &lt;enumeration value="SouthAmerica"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="Africa"/>
 *     &lt;enumeration value="MiddleEastWesternAsia"/>
 *     &lt;enumeration value="Asia"/>
 *     &lt;enumeration value="AustraliaNewZealandPacificIslands"/>
 *     &lt;enumeration value="CanadaGreenland"/>
 *     &lt;enumeration value="USA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDestinationCode")
@XmlEnum
public enum TypeDestinationCode {


    /**
     * Mexico/Central America/Canal
     * 						Zone/Costa Rica
     * 
     */
    @XmlEnumValue("MexicoCostRicaCentralAmerica")
    MEXICO_COST_RICA_CENTRAL_AMERICA("MexicoCostRicaCentralAmerica"),

    /**
     * Island and Countries of The Caribbean
     * 
     */
    @XmlEnumValue("Caribbean")
    CARIBBEAN("Caribbean"),

    /**
     * South America
     * 
     */
    @XmlEnumValue("SouthAmerica")
    SOUTH_AMERICA("SouthAmerica"),

    /**
     * Europe
     * 
     */
    @XmlEnumValue("Europe")
    EUROPE("Europe"),

    /**
     * Africa
     * 
     */
    @XmlEnumValue("Africa")
    AFRICA("Africa"),

    /**
     * Middle East/Western Asia
     * 
     */
    @XmlEnumValue("MiddleEastWesternAsia")
    MIDDLE_EAST_WESTERN_ASIA("MiddleEastWesternAsia"),

    /**
     * Asia
     * 
     */
    @XmlEnumValue("Asia")
    ASIA("Asia"),

    /**
     * Australia/New Zealand/Pacific Islands
     * 
     */
    @XmlEnumValue("AustraliaNewZealandPacificIslands")
    AUSTRALIA_NEW_ZEALAND_PACIFIC_ISLANDS("AustraliaNewZealandPacificIslands"),

    /**
     * Canada and Greenland
     * 
     */
    @XmlEnumValue("CanadaGreenland")
    CANADA_GREENLAND("CanadaGreenland"),

    /**
     * United States of America
     * 
     */
    USA("USA");
    private final String value;

    TypeDestinationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDestinationCode fromValue(String v) {
        for (TypeDestinationCode c: TypeDestinationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
