
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_ProviderEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_ProviderEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FrontDesk_Provider"/>
 *     &lt;enumeration value="External_Product_Provider"/>
 *     &lt;enumeration value="Global_Content_Listing"/>
 *     &lt;enumeration value="Local_Content_Listing"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_ProviderEnumType")
@XmlEnum
public enum COProviderEnumType {

    @XmlEnumValue("FrontDesk_Provider")
    FRONT_DESK_PROVIDER("FrontDesk_Provider"),
    @XmlEnumValue("External_Product_Provider")
    EXTERNAL_PRODUCT_PROVIDER("External_Product_Provider"),
    @XmlEnumValue("Global_Content_Listing")
    GLOBAL_CONTENT_LISTING("Global_Content_Listing"),
    @XmlEnumValue("Local_Content_Listing")
    LOCAL_CONTENT_LISTING("Local_Content_Listing"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    COProviderEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COProviderEnumType fromValue(String v) {
        for (COProviderEnumType c: COProviderEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
