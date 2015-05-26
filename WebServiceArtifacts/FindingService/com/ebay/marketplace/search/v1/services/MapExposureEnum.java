
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapExposureEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MapExposureEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PreCheckout"/>
 *     &lt;enumeration value="DuringCheckout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MapExposureEnum")
@XmlEnum
public enum MapExposureEnum {


    /**
     * 
     * 							PreCheckout specifies that the buyer must click a link (or a button)
     * 							to navigate to a separate page (or window) that displays the discount price.
     * 						
     * 
     */
    @XmlEnumValue("PreCheckout")
    PRE_CHECKOUT("PreCheckout"),

    /**
     * 
     * 							DuringCheckout specifies that the discounted price must be shown on
     * 							the eBay checkout flow page.
     * 						
     * 
     */
    @XmlEnumValue("DuringCheckout")
    DURING_CHECKOUT("DuringCheckout");
    private final String value;

    MapExposureEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapExposureEnum fromValue(String v) {
        for (MapExposureEnum c: MapExposureEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
