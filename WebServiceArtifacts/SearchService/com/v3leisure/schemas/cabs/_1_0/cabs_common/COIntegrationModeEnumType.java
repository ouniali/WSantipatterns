
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_IntegrationModeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_IntegrationModeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OBX_MyWebsite"/>
 *     &lt;enumeration value="CABS_Discovery"/>
 *     &lt;enumeration value="CABS_DiscoveryRedirect"/>
 *     &lt;enumeration value="ESP_Redirect"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_IntegrationModeEnumType")
@XmlEnum
public enum COIntegrationModeEnumType {

    @XmlEnumValue("OBX_MyWebsite")
    OBX_MY_WEBSITE("OBX_MyWebsite"),
    @XmlEnumValue("CABS_Discovery")
    CABS_DISCOVERY("CABS_Discovery"),
    @XmlEnumValue("CABS_DiscoveryRedirect")
    CABS_DISCOVERY_REDIRECT("CABS_DiscoveryRedirect"),
    @XmlEnumValue("ESP_Redirect")
    ESP_REDIRECT("ESP_Redirect"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    COIntegrationModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COIntegrationModeEnumType fromValue(String v) {
        for (COIntegrationModeEnumType c: COIntegrationModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
